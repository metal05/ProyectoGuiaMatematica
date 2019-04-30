package com.example.dell_pc.proyectoguiamatematica;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario;
    private SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = (EditText) findViewById(R.id.TXTusuario);

        Button iniciar = findViewById(R.id.Iniciar);


    }

    final Intent intent = new Intent(this, Menu.class);
    void testPreferencias() {
        SharedPreferences sp = getSharedPreferences("usuario",
                Context.MODE_PRIVATE);
        sp.edit().putString(String.valueOf(etUsuario),"univalle").apply();

        String usuario= sp.getString("usuario","--");
    }
    //iniciar.

}
