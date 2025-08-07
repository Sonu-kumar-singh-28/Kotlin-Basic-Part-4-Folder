fun main(){
    var i: Int = 10;
    println(i.plus(100));
    println(i.toFloat())

    var ans = person("hello",14);
    println(ans.canVote());

    var ans2 = person(name = "Sllla", age = 155)

    println(ans.canVote());
}


class person(var name: String,var age: Int){
    fun canVote(): Boolean{
        return age>=18;
    }


}