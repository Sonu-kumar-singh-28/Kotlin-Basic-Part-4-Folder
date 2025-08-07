fun main(){
    var p1 = person(nameperam = "Hello", 23)
    println(p1.age)
    p1.age =-12;
}

class person(nameperam: String, ageParam: Int) {
    var name: String = nameperam
    var age: Int = ageParam

        get() {
            return field
        }
        set(value) {
            if (value > 0) {
                field = value;
            } else {
                println("age cannot be negative")
            }
        }
}