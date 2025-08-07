fun main(){
    var result=addsum(num1 = 10, num2 = 15);
    println(result)

    val  result2 = subs(num1 = 10, num2 = 12)
    println(result2)


    for(i in 1.until(6)){
        if(i==5) {
            println("Hello Kotlin $i")
        }
    }

    var name = "Welcome Sonu Kumar Singh"

    for(i in 1..5){
        if(true) {
            println("Hardly $i"+name)
        }
    }

    printmesge(count = 2)
}




fun addsum(num1: Int, num2: Int): Int{
    return num1+num2;
}


fun subs(num1: Int, num2: Int): Int{
    return num1-num2;
}


fun printmesge(count:Int){
    for (i in 1..count)
    {
        println("Welcome Boii $i")
    }
}