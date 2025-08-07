import java.lang.reflect.Type

fun main(){
    var person1 = AutoMobile(name = "Car", tyres = 4, maxseat = 5, hashAirbags = true)

}


class  AutoMobile(var name: String, val tyres: Int, var maxseat: Int, hashAirbags: Boolean){
    init {
        println("$name is Created")
    }
    fun drivecar(){
        println("Heavy Driver")
    }

    init {
        println("Second Initial Blocked")
    }

    fun putcar(){
        println("Put the calr on the garriage")
    }
}