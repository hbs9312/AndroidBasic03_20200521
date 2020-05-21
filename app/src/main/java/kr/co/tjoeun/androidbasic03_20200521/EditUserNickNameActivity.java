package kr.co.tjoeun.androidbasic03_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.tjoeun.androidbasic03_20200521.databinding.ActivityEditUserNickNameBinding;

public class EditUserNickNameActivity extends BaseActivity {

    ActivityEditUserNickNameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_user_nick_name);
        setEvents();
        setValues();
    }

    @Override
    public void setEvents() {
        binding.editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String newNickName = binding.nickEdt.getText().toString();

                Intent myIntent = new Intent();
                myIntent.putExtra("editedNickName", newNickName);

                setResult(RESULT_OK, myIntent);

                finish();


            }
        });
    }

    @Override
    public void setValues() {

    }
}
