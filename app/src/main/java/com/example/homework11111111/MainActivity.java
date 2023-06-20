package com.example.homework11111111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class MainActivity extends AppCompatActivity {
        private EditText et_email;
        private EditText et_theme;
        private EditText et_text;
        private Button send;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            et_email=findViewById(R.id.email);
            et_theme=findViewById(R.id.theme);
            et_text=findViewById(R.id.text);
            send=findViewById(R.id.btn_send);

            send.setOnClickListener(view -> {
                String email;
                String theme;
                String text;
                email= et_email.getText().toString();
                theme=et_theme.getText().toString();
                text=et_text.getText().toString();
                Setsend(email,theme,text);

            });

        }
        public void Setsend(String email,String theme,String text){
            Intent intent =new Intent(Intent.ACTION_SEND);

            intent.putExtra(Intent.EXTRA_EMAIL,email);
            intent.putExtra(Intent.EXTRA_SUBJECT,theme);
            intent.putExtra(Intent.EXTRA_TEXT,text);
            intent.setType( "message/rfc822");
            startActivity(Intent.createChooser(intent,"Send"));
        }
    }
}