fun main(){

    var objclass = child()
    objclass.mymethod()
    objclass.mymethod2()

}


 open class parent{
    val name: String =""
     init{
         println("Parent constructor are called")
     }
    fun mymethod(){
        println("I am a parent class")
    }
}

class child :parent(){
    var name2 : String = ""
    init{
        println("Child constructor are called")
    }
    fun mymethod2(){
        println("I am the Derived Class ")
    }
}
