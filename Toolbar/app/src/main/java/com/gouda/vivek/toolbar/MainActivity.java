package com.gouda.vivek.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        //to add back button in toolbar

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == R.id.item1){

            Toast.makeText(getApplicationContext(), "item 1 is selected", Toast.LENGTH_SHORT).show();

        }else if (itemId == R.id.item2){

            Toast.makeText(getApplicationContext(), "item 2 is selected", Toast.LENGTH_SHORT).show();

        }else if(itemId == R.id.item3){

            Toast.makeText(getApplicationContext(), "item 3 is selected", Toast.LENGTH_SHORT).show();

        }else if (itemId == R.id.search_id){

            Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();

        }else if (itemId == R.id.cart_id){

            Toast.makeText(getApplicationContext(), "Cart", Toast.LENGTH_SHORT).show();

        }else if (itemId == android.R.id.home){

            finish();

        }

        return super.onOptionsItemSelected(item);
    }
}
