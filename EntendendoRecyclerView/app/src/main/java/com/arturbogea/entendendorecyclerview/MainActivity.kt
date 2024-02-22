package com.arturbogea.entendendorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Para criar um RecyclerView, precisamos de 3 coisas
* Adapter
* ViewHolder
* LayoutManager
*/


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}