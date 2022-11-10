package ud.course.application1.data

import android.content.Context
import ud.course.application1.R
import ud.course.application1.model.Passenger

class DataSource(val context:Context) {
    fun getFullName():Array<String>{
        return context.resources.getStringArray(R.array.fullName_array)
    }
    fun getFromCity():Array<String>{
        return context.resources.getStringArray(R.array.fromCity_array)
    }
    fun getToCity():Array<String>{
        return context.resources.getStringArray(R.array.toCity_array)
    }
    fun getDepDate():Array<String>{
        return context.resources.getStringArray(R.array.depDate_array)
    }
    fun getDepTime():Array<String>{
        return context.resources.getStringArray(R.array.depTime_array)
    }
    fun getPassengers():List<Passenger>{
        val fullNameList = getFullName()
        val fromCityList = getFromCity()
        val toCityList = getToCity()
        val depDateList = getDepDate()
        val depTimeList = getDepTime()
        var passengers = mutableListOf<Passenger>()

        for(i in 0..9){
            val passenger = Passenger(fullNameList[i],fromCityList[i],toCityList[i],depDateList[i],depTimeList[i])
            passengers.add(passenger)
        }
        return passengers
    }

}