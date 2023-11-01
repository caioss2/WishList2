package br.com.etecia.wishlist;

import android.content.ClipData;

import java.util.List;

public class APICallback {
    public void onSuccess(List<ClipData.Item> items) {
        // Atualize o RecyclerView com os itens recebidos
    }

    public void onError(String message) {
        showErrorMessage(message);
    }

    private void showErrorMessage(String message) {
    }
}
