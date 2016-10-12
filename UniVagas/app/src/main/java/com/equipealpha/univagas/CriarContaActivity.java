package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CriarContaActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtUsuario;
    EditText txtEmail;
    EditText txtSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        txtNome = (EditText) findViewById(R.id.txtNome);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtSocial = (EditText) findViewById(R.id.txtSocial);

        Button btnVoltar = (Button) findViewById(R.id.btnVoltar);
        Button btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CriarContaActivity.this, EscolherContaActivity.class);
                startActivity(it);
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(txtNome.getText().length()==0 || txtUsuario.getText().length()==0 || txtEmail.getText().length()==0
                        || txtSocial.getText().length()==0){
                    Toast.makeText(getApplication(),
                            "Todos os campos são obrigatórios",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplication(),
                            "Conta criada com sucesso " + txtUsuario.getText().toString(),
                            Toast.LENGTH_LONG).show();

                    Intent it = new Intent(CriarContaActivity.this, LoginActivity.class);
                    startActivity(it);
                }
            }
        });

    }
}
