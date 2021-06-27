package com.gmail.notebook2.ui;

import androidx.annotation.NonNull;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;


import com.gmail.notebook2.R;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appnar_menu,menu);

//        MenuItem actionSearch = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) actionSearch.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                Toast.makeText(MainActivity.this, "query", Toast.LENGTH_LONG).show();
//
//                return true;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
//      Тут какая то проблема, видимо что то с библиотекой, если включить приложение падает (или нет?).

                return true;
            }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.option_own){
            Toast.makeText(this, "Option one selected", Toast.LENGTH_LONG).show();
            return true;
        }
        if (itemId == R.id.option_two) {
            Toast.makeText(this, "Option two selected", Toast.LENGTH_LONG).show();
            return true;
        }
        if (itemId == R.id.option_three) {
            Toast.makeText(this, "Option tree selected", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}