package ud.course.application1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ud.course.application1.PassengerDetail
import ud.course.application1.R
import ud.course.application1.model.Passenger

class itemAdapter(private val dataset:List<Passenger>):RecyclerView.Adapter<itemAdapter.ItemViewHolder>(){
    class ItemViewHolder(val view:View):RecyclerView.ViewHolder(view) {
        val fullnameView = view.findViewById<TextView>(R.id.fullNameView)
        val fromCityView = view.findViewById<TextView>(R.id.fromCityView)
        val toCityView = view.findViewById<TextView>(R.id.toCityView)
        val depDateView = view.findViewById<TextView>(R.id.depDateView)
        val depTimeView = view.findViewById<TextView>(R.id.depTimeView)
        lateinit var passenger : Passenger

        init{
            view.setOnClickListener{
                val previewDetail = Intent(itemView.context, PassengerDetail::class.java)
                previewDetail.putExtra(PASS_KEY,passenger)
                itemView.context.startActivity(previewDetail)
            }
        }
        companion object{
            private val PASS_KEY = "PASS"
        }
        fun bind(passenger:Passenger){
            this.passenger = passenger
            fullnameView.text = passenger.fullName
            fromCityView.text = passenger.fromCity
            toCityView.text = passenger.toCity
            depDateView.text = passenger.depDate
            depTimeView.text = passenger.depTime
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_layout,parent, false)
        return ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val passenger = dataset[position]
        holder.bind(passenger)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}