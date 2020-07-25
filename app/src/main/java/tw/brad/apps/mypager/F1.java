package tw.brad.apps.mypager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F1 extends Fragment {
    private View mainView;
    private Button btn;
    private TextView mesg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);
            btn = mainView.findViewById(R.id.f1_btn);
            mesg = mainView.findViewById(R.id.f1_mesg);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    createLotto();
                }
            });
        }
        return mainView;
    }

    private void createLotto(){
        int rand = (int)(Math.random()*38+1);
        mesg.setText(rand + "");
    }


}