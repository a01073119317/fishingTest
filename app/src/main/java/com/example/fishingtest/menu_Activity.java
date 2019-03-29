package com.example.fishingtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class menu_Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Button menu = (Button) findViewById(R.id.menu);


        ListView menu_list = (ListView) findViewById(R.id.menu_list);
        MenuAdapter adapter = new MenuAdapter();
        adapter.addItem(new MenuItem("빅뱅", "010-2000-2000"));
        adapter.addItem(new MenuItem("승리", "010-3000-3000"));
        adapter.addItem(new MenuItem("준영", "010-4000-4000"));

        menu_list.setAdapter(adapter);


        menu = (Button) findViewById(R.id.menu);

    }
    class MenuAdapter extends BaseAdapter {

        ArrayList<MenuItem> items = new ArrayList<MenuItem>();

        public void addItem(MenuItem item) {
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            MenuItemView view = new MenuItemView(getApplicationContext());
            MenuItem item = items.get(position);
            view.setName(item.getName());
            view.setMobile(item.getMoblie());

            return view;
        }
    }

}
