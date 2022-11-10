package ud.course.application1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import ud.course.application1.adapter.itemAdapter
import ud.course.application1.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passengers = DataSource(this).getPassengers()
        val recyclerv:RecyclerView = findViewById(R.id.rview)
        recyclerv.adapter = itemAdapter(passengers)
        recyclerv.setHasFixedSize(true)
    }
}