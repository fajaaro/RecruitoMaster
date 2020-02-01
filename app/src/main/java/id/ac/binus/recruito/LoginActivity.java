package id.ac.binus.recruito;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button SignInButton;
    EditText Email, Password;

    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.edit_text_email);
        Password = findViewById(R.id.edit_text_password);
        SignInButton = findViewById(R.id.button_sign_in);

        final String[] inputEmail = new String[1];
        final String[] inputPassword = new String[1];

        SignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                inputEmail[0] = Email.getText().toString();
                inputPassword[0] = Password.getText().toString();

                Log.d(TAG, "onClick: email = " + inputEmail[0]);
                Log.d(TAG, "onClick: password = " + inputPassword[0]);
            }
        });

    }
}