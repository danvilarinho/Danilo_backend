package com.example.danilo.danilo_pfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.danilo.danilo_pfc.adapter.ImageAdapter;
import com.example.danilo.danilo_pfc.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Danilo on 03/01/2017.
 */


public class IconesActivity extends Activity {

    ImageButton imageButtonBack;
    ImageButton imageButtonNext;


    GridView gridview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icones);

        final String opt = getIntent().getStringExtra("opt");

        Toast.makeText(getApplicationContext(), opt, Toast.LENGTH_SHORT).show();

        imageButtonBack = (ImageButton)findViewById(R.id.btn_back);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            finish();

            }
        });


        gridview = (GridView) findViewById(R.id.gridview);


        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intent = null;

                switch (opt) {

                    case "LETRAS":
                        intent = new Intent(getApplicationContext(),LetrasActivity.class);
                        break;

                    case "SILABAS":
                        intent = new Intent(getApplicationContext(),SilabasActivity.class);
                        break;

                    case "SENTENCAS":
                        intent = new Intent(getApplicationContext(),SentencasActivity.class);
                        break;

                }


                intent.putExtra("id", position + 1);

                startActivity(intent);


                Toast.makeText(getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });


    }


}

