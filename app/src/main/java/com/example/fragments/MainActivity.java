package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    * GERENCIADORES DE FRAGMENTS
    * SÃO NECESSARIOS PARA CHAMAR UMA NOVA FRAGMENT
    * FUNCIONA COMO UM CICLO DO BD, TEM QUE DAR BEGGIN E AO FIM COMMITAR
    * CASO NÃO FIZER ISSO A FRAGMENT NÃO IRÁ FUNCIONAR E IRÁ CRASHAR O APP
    * */
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    /*
    * AQUI PEGO MINHA FRAGMENT (ACTIVITY)
    * */
    FirstFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INSTANCIO MINHA FRAGMENT E ATRIBUO VALOR
        firstFragment = new FirstFragment();
        // PASSAR INFO PARA UMA FRAGMENT
        // firstFragment.setArguments();

        //PEGO O SUPORT FRAGMENT MANAGER, JÁ É AUTOMATICO O MÉTODO
        fragmentManager = getSupportFragmentManager();
        //INICIO A TRANSAÇÃO DA FRAGMENT ATRAVÉS DO METODO BEGINTRANSACTION
        fragmentTransaction = fragmentManager.beginTransaction();
        //ADICIONO A TRANSACTION O ELEMENTO E A ACTIVITY DA FRAGMENT
        //O PRIMEIRO PARAMETRO É O CONTAINER QUE UTILIZAREI NO MAIN XML (OU ONDE QUERO CHAMAR MINHA FRAGMENT)
        //O SEGUNDO PARAMETRO É O ACTIVITY DA FRAGMENT
        //E DEPOIS COMMITO
        fragmentTransaction.add(R.id.first_fragment_container, firstFragment)
                           .commit();
    }
}
