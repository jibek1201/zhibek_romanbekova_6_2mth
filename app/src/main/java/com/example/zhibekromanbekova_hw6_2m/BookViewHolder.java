package com.example.zhibekromanbekova_hw6_2m;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView author, name;
    private ImageView image;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        author = itemView.findViewById(R.id.tv_author);
        name = itemView.findViewById(R.id.tv_name);
        image = itemView.findViewById(R.id.img_book);
    }

    public void bind(Book book) {
        author.setText(book.getAuthor());
        name.setText(book.getName());

    }
}
