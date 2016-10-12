package com.equipealpha.univagas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class EscolherContaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_conta);

        ImageButton btnLocal = (ImageButton) findViewById(R.id.btnContaLocal);
        ImageButton bntLinked = (ImageButton) findViewById(R.id.btnContaLinkedin);

        btnLocal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EscolherContaActivity.this, CriarContaActivity.class);
                startActivity(it);
            }
        });

        bntLinked.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplication(),
                        "Recurso ainda não habilitado. Em breve.",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
