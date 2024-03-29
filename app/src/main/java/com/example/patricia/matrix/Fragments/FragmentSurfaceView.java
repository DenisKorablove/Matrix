package com.example.patricia.matrix.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.patricia.matrix.R;

@SuppressWarnings("deprecation")
public class FragmentSurfaceView extends Fragment {

    private final String TAG = FragmentSurfaceView.class.getSimpleName();

   /*
   Componentes Gráficos
    */
    private TextView textViewSurfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "MÉTODO ON CREATE.");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "MÉTODO ON START.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MÉTODO ON DESTROY.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "MÉTODO ON CREATE VIEW.");
        View view = inflater.inflate(R.layout.fragment_surface_view, container, false);
        textViewSurfaceView = (TextView) view.findViewById(R.id.textview_fragment_surface_view);
        textViewSurfaceView.setText("Pré-Visualização Indisponível. Serviço em execução.");
        return(view);
    }
}