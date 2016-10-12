package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeusDadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        Button btnDadosEdit = (Button) findViewById(R.id.btnDados);
        Button btnSenhaEdit = (Button) findViewById(R.id.btnSenha);

        btnDadosEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MeusDadosActivity.this, EditarDadosPessoaisActivity.class);
                startActivity(it);
            }
        });

        btnSenhaEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MeusDadosActivity.this, EditarSenhaActivity.class);
                startActivity(it);
            }
        });
    }
}
