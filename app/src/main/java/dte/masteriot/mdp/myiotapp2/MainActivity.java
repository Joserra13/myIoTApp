package dte.masteriot.mdp.myiotapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout item1;
    LinearLayout item2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item1 = findViewById(R.id.Alarm);
        item2 = findViewById(R.id.nDetections);

        ViewGroup.LayoutParams item1Params = item1.getLayoutParams();
        ViewGroup.LayoutParams item2Params = item2.getLayoutParams();

        item2Params.height = item1Params.height;

        item2.setLayoutParams(item2Params);
    }
}