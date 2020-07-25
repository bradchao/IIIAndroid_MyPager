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
            View f0 = flipper.getChildAt(0);
            View f1 = flipper.getChildAt(1);
            View f2 = flipper.getChildAt(2);
            View f3 = flipper.getChildAt(3);
            FlipperListener listener = new FlipperListener();
            f0.setOnClickListener(listener);
            f1.setOnClickListener(listener);
            f2.setOnClickListener(listener);
            f3.setOnClickListener(listener);

        }
        return mainView;
    }

    private class FlipperListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            flipper.showNext();
        }
    }

}