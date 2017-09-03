package com.example.danilo.danilo_pfc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.danilo.danilo_pfc.R;
import com.example.danilo.danilo_pfc.model.Letra;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class MainActivity extends Activity {



    private ImageButton imageButtonNext;
    private ImageButton imageButtonFala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonFala = (ImageButton) findViewById(R.id.btn_fala);
        imageButtonNext = (ImageButton) findViewById(R.id.btn_next);


        imageButtonNext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }


        });

        imageButtonFala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        saveLetras();

    }

    public byte[] getByteArrayFromBitmap(int id){

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Bitmap input = BitmapFactory.decodeResource(getResources(), id);
        input.compress(Bitmap.CompressFormat.PNG, 0 /* Ignored for PNGs */, stream);
        return stream.toByteArray();

    }

    public void saveLetras(){

        /*
        Letra a = Letra.findById(Letra.class, 1);
        a.setTelaLetra(getByteArrayFromBitmap(R.drawable.telaletra_a));
        a.save();*/

        Letra letra = Letra.findById(Letra.class, 1);

        Toast.makeText(getApplicationContext(), String.valueOf(Letra.count(Letra.class)) + ", nome: " + letra.getNome(), Toast.LENGTH_SHORT).show();

    }


}
