package com.example.zhibekromanbekova_hw6_2m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ArrayList<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        loadData();
        BookAdapter adapter = new BookAdapter(bookList);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
        bookList.add(new Book("", "J.R.R.Tolkien", "The lord of the Rings"));
    }
}