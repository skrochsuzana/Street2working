package com.example.rafaelmatucheski.street2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaCriarCadastro(View v)
    {
        Intent tela = new Intent(this, Criar_Cadastro.class );
        startActivity(tela);
    }

}
