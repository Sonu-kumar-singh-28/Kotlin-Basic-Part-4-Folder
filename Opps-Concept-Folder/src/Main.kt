fun main(){
    var obj = calculator();
    println(obj.add(2,3))
    println(obj.mult(2,6))
}

class calculator{
    fun add(a: Int, b: Int): Int{
        return a+b;
    }

    fun mult(a: Int, b: Int): Int{
        return a*b;
    }
}