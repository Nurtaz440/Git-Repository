package mening.dasturim.salomduniyo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    String name="bjdsj";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, name);
        Log.e(TAG,"Inside OnCreate Method");



    }
}