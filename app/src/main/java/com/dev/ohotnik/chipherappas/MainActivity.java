package com.dev.ohotnik.chipherappas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonEncrypt = findViewById(R.id.buttonEncrypt);
        buttonEncrypt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                onEncrypt();
            }
        });

        final Button buttonDecrypt = findViewById(R.id.buttonDecrypt);
        buttonDecrypt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                onDecrypt();
            }
        });
    }

    private void onDecrypt() {
        final EditText encryptedText = findViewById(R.id.encryptedText);

        String text = encryptedText.getText().toString();

        Cipher cipher = new Cipher();
        String decrypted = cipher.Decrypt(text);

        final EditText textField = findViewById(R.id.decryptedText);

        textField.setText(decrypted);
    }

    public void onEncrypt() {
        final EditText textField = findViewById(R.id.normalText);

        String text = textField.getText().toString();

        Cipher cipher = new Cipher();
        String encrypted = cipher.Encrypt(text);

        final EditText encryptedText = findViewById(R.id.encryptedText);
        encryptedText.setText(encrypted);
    }
}