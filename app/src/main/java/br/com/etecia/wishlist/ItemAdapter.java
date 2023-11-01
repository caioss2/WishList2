package br.com.etecia.wishlist;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private final List<ClipData.Item> items;

    public ItemAdapter(List<ClipData.Item> items) {
        this.items = items;
    }

    public ItemAdapter(List<Item> items, List<ClipData.Item> items1) {

        this.items = items1;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ClipData.Item item = items.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemNameTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById(R.id.item_name);
        }

        public void bind(Item item) {
            itemNameTextView.setText(item.getName());
        }

        public void bind(ClipData.Item item) {
        }
    }
}
