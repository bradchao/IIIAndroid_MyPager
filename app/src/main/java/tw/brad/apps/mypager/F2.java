package tw.brad.apps.mypager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

public class F2 extends Fragment {
    private View mainView;
    private ViewFlipper flipper;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null){
            mainView = inflater.inflate(R.layout.fragment_f2, container, false);
            flipper = mainView.findViewById(R.id.flipper);
        }
        return mainView;
    }
}