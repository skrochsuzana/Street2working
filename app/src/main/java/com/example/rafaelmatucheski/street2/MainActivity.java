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

    //Direciona para a tela "Criar Cadastro"
    public void telacriarCadastro(View v)
    {
        Intent tela = new Intent(this, Criar_Cadastro.class );
        startActivity(tela);
    }

    //Direciona para a página "Onibus Disponivel"
    public void telaonibusDisponivel(View v)
    {
        Intent tela = new Intent(this, Onibus_Disponivel.class );
        startActivity(tela);
    }

}
