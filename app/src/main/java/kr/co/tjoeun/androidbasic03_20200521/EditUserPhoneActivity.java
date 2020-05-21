package kr.co.tjoeun.androidbasic03_20200521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityEditUserPhoneBinding;

public class EditUserPhoneActivity extends BaseActivity {

    ActivityEditUserPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_phone);
        setEvents();
        setValues();
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {

    }
}
