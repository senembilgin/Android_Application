package ud.course.application1.model

data class Passenger (
    var fullName:String,
    var fromCity:String,
    var toCity:String,
    var depDate:String,
    var depTime:String
):java.io.Serializable{}