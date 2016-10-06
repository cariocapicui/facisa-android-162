package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meus_dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        Button btDadosEdit = (Button) findViewById(R.id.btDados);
        Button btSenhaEdit = (Button) findViewById(R.id.btSenha);

        btDadosEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(meus_dados.this, DadosEditActivity.class);
                startActivity(it);
            }
        });

        btSenhaEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(meus_dados.this, SenhaEditActivity.class);
                startActivity(it);
            }
        });

    }

}
