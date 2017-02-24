package com.example.ptn0411.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ptn0411.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final TestStringData testStringData = new TestStringData("ここに入力してください");
        binding.setTestStringData(testStringData);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "button clicked");
                Log.d("MainActivity", testStringData.getInputString());
                Log.d("MainActivity", binding.editText.getText().toString());
            }
        });
    }
}
