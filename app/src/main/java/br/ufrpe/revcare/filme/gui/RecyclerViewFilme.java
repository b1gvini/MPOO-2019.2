package br.ufrpe.revcare.filme.gui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.revcare.R;
import br.ufrpe.revcare.filme.dominio.Filme;
import br.ufrpe.revcare.filme.persistencia.FilmeDAO;
import br.ufrpe.revcare.usuario.gui.HomeUsuario;
import br.ufrpe.revcare.usuario.gui.RecyclerViewUsuario;

public class RecyclerViewFilme extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private ArrayList<String> mTitulo = new ArrayList<>();
    private ArrayList<String> mDescricao = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_filmes);
        getSupportActionBar().hide();
        initFilmes();
        FilmeDAO dao = new FilmeDAO(getApplicationContext());
        zerarArrays();
        filmes = dao.getAllFilmes();
        adicionaNoArray(dao, filmes);
        Button btnAdicionar = findViewById(R.id.btnadicionar);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecyclerViewFilme.this, CadastroFilme.class));
            }
        });
        initRecyclerView();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();


    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private void initFilmes() {
      FilmeDAO dao = new FilmeDAO(getApplicationContext());
      filmes = dao.getAllFilmes();
      adicionaNoArray(dao, filmes);
      initRecyclerView();

    }

    private void adicionaNoArray(FilmeDAO dao, List<Filme> filmes) {
        for (int i = 0; i < filmes.size(); i++) {
            mTitulo.add(filmes.get(i).getTitulo());
            mDescricao.add(this.filmes.get(i).getDescricao());


        }
    }
    private void zerarArrays(){
        mTitulo = new ArrayList<>();
        mDescricao = new ArrayList<>();


    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.filmesRecycler);
        RecyclerViewAdapterFilme adapter = new RecyclerViewAdapterFilme(this, mTitulo, mDescricao);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
