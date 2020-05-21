package kr.co.tjoeun.androidbasic03_20200521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {

    }
}
