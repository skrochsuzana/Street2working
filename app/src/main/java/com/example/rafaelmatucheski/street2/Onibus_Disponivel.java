package com.example.rafaelmatucheski.street2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Rafael Matucheski on 09/04/2017.
 */

public class Onibus_Disponivel extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onibus_disponiveis);
    }

    //Direciona para a tela "Login"
    public void telacriarCadastro(View v)
    {
        Intent tela = new Intent(this, MainActivity.class );
        startActivity(tela);
    }

}
