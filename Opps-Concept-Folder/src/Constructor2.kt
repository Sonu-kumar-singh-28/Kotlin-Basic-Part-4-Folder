import java.sql.Types

fun main(){
    var person1 = car4(name = "Gvagon", "Disel", kmph = 156)

}


class car4(var name: String, var types: String, var kmph: Int){
    init {
        println("${name} are Created")
    }

    fun maxspeed(){
        println("Speed is High")
    }
    fun charges(){
        println("Charges is High")
    }

    init {
        println("Another Constructor are created ")
    }
}