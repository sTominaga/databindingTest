package com.example.ptn0411.kotlindatabindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ptn0411.kotlindatabindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final StringModel stringModel = new StringModel("ここに入力");
        binding.setStringModel(stringModel);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", StringModel.class.getSimpleName()+":" + stringModel.getEditTextString());
                Log.d("MainActivity", binding.editText.getText().toString());
            }
        });
    }
}
