package xebia.ismail.krebojantan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import xebia.ismail.krebojantan.MainActivity;
import xebia.ismail.krebojantan.R;

/**
 * Created by Admin on 7/3/2017.
 */

public class LoginActivity extends AppCompatActivity {
    private TextView btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnlogin = (TextView)findViewById(R.id.login_btn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
