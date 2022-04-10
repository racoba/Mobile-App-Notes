package br.com.senaicimatec.sqllite02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText idade;
    private AlunoDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editTextNome);
        email = findViewById(R.id.editTextEmail);
        idade = findViewById(R.id.editTextIdade);
        dao = new AlunoDAO(this);
    }

    public void Salvar(View view){
        //criar objeto aluno
        Aluno aluno = new Aluno();
        aluno.setNome(nome.getText().toString());
        aluno.setEmail(email.getText().toString());
        aluno.setIdade(idade.getText().toString());

        long id = dao.Inserir(aluno);
        Toast.makeText(this, "Aluno inserido com sucesso, com o id: " +id, Toast.LENGTH_SHORT).show();

    }
}