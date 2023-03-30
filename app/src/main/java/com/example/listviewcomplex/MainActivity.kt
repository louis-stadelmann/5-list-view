package com.example.listviewcomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor", "Ross Taylor",
            "Ross Taylor", "Ross Taylor", "Ross Taylor",
            "Ross Taylor", "Ross Taylor", "Ross Taylor",
            "Ross Taylor", "Ross Taylor", "Ross Taylor",
            "Ross Taylor", "Ross Taylor", "Ross Taylor",
        )

        val mListView = findViewById<ListView>(R.id.lvMain)

        val arrayAdapter = ArrayAdapter(
            this,
            R.layout.list_item,
            R.id.tvListItem,
            users
        )

        mListView.adapter = arrayAdapter
        mListView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = mListView.getItemAtPosition(position)
            Toast.makeText(this, "Clicked item : $selectedItem"
                , Toast.LENGTH_SHORT).show()
        }
    }
}