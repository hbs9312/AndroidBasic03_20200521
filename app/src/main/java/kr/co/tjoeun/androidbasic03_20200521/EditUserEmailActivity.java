package kr.co.tjoeun.androidbasic03_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityEditUserEmailBinding;

public class EditUserEmailActivity extends BaseActivity{

    ActivityEditUserEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_user_email);
        setEvents();
        setValues();

    }

    @Override
    public void setEvents() {
        binding.editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String newEmail = binding.userEmail.getText().toString();

                Intent myIntent = new Intent();
                myIntent.putExtra("email", newEmail);

                setResult(RESULT_OK, myIntent);

                finish();

            }
        });
    }

    @Override
    public void setValues() {

    }
}
