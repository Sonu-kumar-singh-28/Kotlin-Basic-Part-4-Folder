fun main(){

   var ans1= addsum(num2 = 10, num1 = 13)
    var ans2 = addsum(num1 = 10, num2 = 2, num3 = 12)
    println("add is "+ans1)
    println("add is "+ans2)


    var ans5 =addsm(num1 = 1.87, num2 = 36.2)
    println("Ans of the Double is :"+ans5)
    var ans3 =addsubs(num2 = 10, num1 = 13)
    var ans4 =addsubs(num1 = 10, num2 = 2, num3 = 12)

    println("subs is "+ans3)
    println("suns is "+ans4)



}
fun addsm(num1: Int, num2: Int): Int{
    return num1+num2;
}

fun addsm(num1: Double, num2: Double): Double{
    return num1+num2;
}


fun addsum(num1: Int, num2: Int, num3: Int): Int{
    return num1+num2+num3;
}


fun addsubs(num1: Int, num2: Int): Int{
    return num1-num2;
}


fun addsubs(num1: Int, num2: Int, num3: Int): Int{
    return num1-num2-num3;
}