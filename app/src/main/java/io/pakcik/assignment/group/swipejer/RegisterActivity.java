package io.pakcik.assignment.group.swipejer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {


    FirebaseAuth fAuth;
    TextView email, pass;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        FirebaseApp.initializeApp(this);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.TB);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowTitleEnabled(false);

        email = findViewById(R.id.TV_Email);
        pass = findViewById(R.id.TV_Password);
        signUp = findViewById(R.id.btn_SignUp);
        fAuth = FirebaseAuth.getInstance();

//        signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fAuth.createUserWithEmailAndPassword("9199999989@pintech.com", "corrfecthorsebatterystaple")
//                        .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
//
//
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                System.out.println("Task condition: " + task.isComplete());
//                                if(task.isSuccessful()){
//                                    Toast.makeText(RegisterActivity.this, "Succesfully Register", Toast.LENGTH_SHORT).show();
//                                }else{
//                                    Toast.makeText(RegisterActivity.this, "Register Failed", Toast.LENGTH_SHORT).show();
//                                }
//
//                            };
//                        });
//
//            }
//        });
    }
}
