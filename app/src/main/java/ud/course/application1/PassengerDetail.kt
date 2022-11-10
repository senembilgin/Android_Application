package ud.course.application1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ud.course.application1.databinding.ActivityPassengerDetailBinding
import ud.course.application1.model.Passenger

class PassengerDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPassengerDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_passenger_detail)
        var specificPass = intent.getSerializableExtra("PASS") as Passenger
        binding.passenger = specificPass
    }
}