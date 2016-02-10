package com.example.thrallon.eosstest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Activity_Mproionta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proionta2);
        ListView listView2 = (ListView) findViewById(R.id.listView1);

        Product[] items = {
                new Product(1, "Golden Samena"),
                new Product(2, "Ψηλές Κορφές"),
                new Product(3, "Samena"),
                new Product(4, "Αγέρι του Αιγαίου"),
                new Product(5, "Δρυούσα"),

        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
                android.R.layout.simple_list_item_1, items);

        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                switch ((int) id) {
                    case 0:Intent intent0 = new Intent(getApplicationContext(), Proion8.class);
                        startActivity(intent0);
                        break;
                    case 1:Intent intent1 = new Intent(getApplicationContext(), Proion9.class);
                        startActivity(intent1);
                        break;
                    case 2:Intent intent2 = new Intent(getApplicationContext(), Proion10.class);
                        startActivity(intent2);
                        break;
                    case 3:Intent intent3 = new Intent(getApplicationContext(), Proion11.class);
                        startActivity(intent3);
                        break;
                    case 4:Intent intent4 = new Intent(getApplicationContext(), Proion12.class);
                        startActivity(intent4);
                        break;





                    // Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

                }
            }
        });

    }

    }

