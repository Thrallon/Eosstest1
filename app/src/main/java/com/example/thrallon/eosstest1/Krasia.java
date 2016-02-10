package com.example.thrallon.eosstest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Krasia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krasia);
        ListView listView3 = (ListView) findViewById(R.id.listView1);

        Product[] items = {
                new Product(1, "Γλυκά Κρασία"),
                new Product(2, "Ξηρά Κρασία"),

        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
                android.R.layout.simple_list_item_1, items);

        listView3.setAdapter(adapter);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                switch ((int) id) {
                    case 0:Intent intent0 = new Intent(getApplicationContext(), Activity_Mproionta.class);
                        startActivity(intent0);
                        break;
                    case 1:Intent intent1 = new Intent(getApplicationContext(), Activity_Mproionta2.class);
                        startActivity(intent1);
                        break;





                }
            }
        });

    }

}
