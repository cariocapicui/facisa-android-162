package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CriarContaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

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
                Intent it = new Intent(CriarContaActivity.this, EscolherContaActivity.class);
                startActivity(it);
            }
        });

    }
}
