package com.example.patricia.matrix.DialogsVideo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;


import android.util.Log;

import com.example.patricia.matrix.Activities.VideoActivity;
import com.example.patricia.matrix.Camera.Camera;
import com.example.patricia.matrix.Hero4Black.Hero4BlackCommands;
import com.example.patricia.matrix.NetworkVolley.NetworkVolley;
import com.example.patricia.matrix.Tasks.UpdateSettingsCamera;

public class NTSC_FPS_Resolution4KSuperView extends DialogFragment {

    private String TAG;
    private String[] videoFPS;

    public NTSC_FPS_Resolution4KSuperView() {
        videoFPS = new String[]{"24"};
        TAG = NTSC_FPS_Resolution4KSuperView.class.getSimpleName();
    }

    public static NTSC_FPS_Resolution4KSuperView newInstance() {
        return new NTSC_FPS_Resolution4KSuperView();
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Quadros por Segundo")
                .setSingleChoiceItems(videoFPS, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        switch (position) {
                            case 0:
                                Log.d(TAG, "VIDEO FPS 24");
                                NetworkVolley.sendCommandWithMessage(Hero4BlackCommands.videoFPS_24, "FPS 24");
                                VideoActivity.addFragment(Hero4BlackCommands.status);
                                new UpdateSettingsCamera(getContext()).execute(Hero4BlackCommands.status);
                                break;
                        }
                    }
                }).setNegativeButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int position) {
                dialog.dismiss();
            }
        });
        return builder.create();
    }
}
