package com.example.rafaelmatucheski.street2;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import org.w3c.dom.Text;

/**
 * Created by Rafael Matucheski on 08/04/2017.
 */

public class Criar_Cadastro extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criar_cadastro);
    }

    //Direciona para a tela "Login"
    public void telaLogin(View v)
    {
        Intent tela = new Intent(this, MainActivity.class );
        startActivity(tela);
    }

    //Direciona para a página "Onibus Disponivel"
    public void telaonibusDisponivel(View v)
    {
        Intent tela = new Intent(this, Onibus_Disponivel.class );
        startActivity(tela);
    }
}
