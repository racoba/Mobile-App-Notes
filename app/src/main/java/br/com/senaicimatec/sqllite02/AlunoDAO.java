package br.com.senaicimatec.sqllite02;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AlunoDAO {
    private Conexao conexao;
    private SQLiteDatabase db;

    public AlunoDAO(Context context){
        conexao =new Conexao(context);
        db= conexao.getWritableDatabase();
    }

    public long Inserir (Aluno aluno){
        ContentValues values = new ContentValues();
        values.put("nome", aluno.getNome());
        values.put("email", aluno.getEmail());
        values.put("idade", aluno.getIdade());
        values.put("cadastro", aluno.getCadastro().toString());
        return db.insert("aluno", null, values);
    }
}
