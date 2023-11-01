package br.com.etecia.wishlist;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private APIClient apiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ItemAdapter adapter; // Substitua ItemAdapter pela classe apropriada
        List<ClipData.Item> items1 = null;
        adapter = new ItemAdapter(null, items1);
        recyclerView.setAdapter(adapter);

        apiClient = new APIClient(); // Substitua APIClient pela classe apropriada

        // Adiciona um evento de clique ao botão "Adicionar item"
        Button btnAdd = findViewById(R.id.btn_add);
        if (btnAdd != null) {
            btnAdd.setOnClickListener(v -> openAddItemScreen());
        }

        // Adiciona um evento de clique ao botão "Listar itens"
        Button btnList = findViewById(R.id.btn_list);
        if (btnList != null) {
            btnList.setOnClickListener(v -> retrieveItemsFromAPI());
        }

        // Adiciona um evento de clique ao botão "Sair"
        Button btnExit = findViewById(R.id.btn_exit);
        if (btnExit != null) {
            btnExit.setOnClickListener(v -> exitApp());
        }
    }

    private void openAddItemScreen() {
        Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
        startActivity(intent);
    }

    private void retrieveItemsFromAPI() {
        apiClient.getItems(new APICallback() {

        });
    }

    private void exitApp() {
        finish();
    }

}

