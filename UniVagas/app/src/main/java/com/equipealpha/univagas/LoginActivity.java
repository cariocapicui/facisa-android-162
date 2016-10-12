package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    //Criação dos Objetos
    EditText editLogin;
    EditText editSenha;
    Button btnLogar;
    TextView labelRegistrar;

    public void startMainActivity(View view) {

        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }

    public void startCriarContaActivity(View view) {

        Intent criarContaActivity = new Intent(this, EscolherContaActivity.class);
        startActivity(criarContaActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Vinculando os objetos aos seus IDs
        editLogin = (EditText) findViewById(R.id.editLogin);
        editSenha = (EditText) findViewById(R.id.editSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);
        labelRegistrar = (TextView) findViewById(R.id.labelRegistrar);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(editLogin.getText().length()==0 || editSenha.getText().length()==0){
                    Toast.makeText(getApplication(),
                            "Todos os campos são obrigatórios",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplication(),
                            "Seja bem vindo "+editLogin.getText().toString(),
                            Toast.LENGTH_LONG).show();
                    editLogin.setText("");
                    editSenha.setText("");

                    Intent it = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(it);
                }
            }
        });

        labelRegistrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent r = new Intent(LoginActivity.this, EscolherContaActivity.class);
                startActivity(r);
            }
        });
    }


}
