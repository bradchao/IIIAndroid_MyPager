package tw.brad.apps.mypager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private F1 f1;
    private F2 f2;
    private F3 f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        f1 = new F1(); f2 = new F2(); f3 = new F3();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void gotoF1(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }
    public void gotoF2(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }
    public void gotoF3(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }
}