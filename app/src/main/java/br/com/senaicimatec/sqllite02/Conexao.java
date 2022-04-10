package br.com.senaicimatec.sqllite02;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao  extends SQLiteOpenHelper {

    private static final String name= "banco.db";
    private static final int version = 1;

    public Conexao(Context context) {
        super(context, name, null , version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE IF NOT EXISTS aluno (id INTEGER primary key autoincrement, nome VARCHAR(50), email VARCHAR(30), idade VARCHAR(3) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
