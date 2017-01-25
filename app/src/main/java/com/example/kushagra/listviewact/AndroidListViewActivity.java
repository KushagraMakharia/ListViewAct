package com.example.kushagra.listviewact;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class AndroidListViewActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // storing string resources into Array
        String[] adobe_products = getResources().getStringArray(R.array.adobe_products);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter <String>(this, R.layout.list_item, R.id.label, adobe_products));

    }
}
