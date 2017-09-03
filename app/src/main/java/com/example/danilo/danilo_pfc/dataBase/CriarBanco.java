package com.example.danilo.danilo_pfc.dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Danilo on 02/09/17.
 */

public class CriarBanco extends SQLiteOpenHelper
{
    private static final String NOME_BANCO = "banco276.db";
    private static final String TABELA_DADOS = "dados";
    private static final String ID = "_id";
    private static final int VERSAO = 1;

    public CriarBanco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA_DADOS+"("
                + ID + "integer primary key autoincrement,"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA_DADOS);
        onCreate(db);
    }
}
