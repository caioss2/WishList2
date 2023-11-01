package br.com.etecia.wishlist;

import android.content.ClipData;

import java.util.ArrayList;
import java.util.List;

public class APIClient {
    public void getItems(APICallback apiCallback) {
        // Simulando uma busca de itens em uma lista vazia, substitua isso pela lógica real de busca de itens
        List<ClipData.Item> itemList = new ArrayList<>();

        if (itemList.isEmpty()) {
            apiCallback.onError("Nenhum item encontrado."); // Chama o método onError se a lista estiver vazia
        } else {
            apiCallback.onSuccess(itemList); // Chama o método onSuccess com a lista de itens
        }
    }
}
