fun main() {
    val oneplus = OnePlus("Android")
    oneplus.display()

    val mobile = Mobile("Basic")
    mobile.display()

    oneplus.powerOff()
    println(oneplus.name)
    println(oneplus.size)


   println(oneplus.toString())
}

open class Mobile(val type: String) {
    open var name: String = "Simple Mobile"
    open var size: Int = 5

    fun makeCall() {
        println("Calling From Mobile")
    }

    open fun powerOff() {
        println("Function calling For Power Off")
    }

    open fun display() {
        println("Simple Mobile Display")
    }
}

class OnePlus(typeparam: String) : Mobile(typeparam) {
    override var name: String = "One Plus"
    override var size: Int = 7

    override fun display() {
        println("One Plus Display")
    }

    override fun powerOff() {
        super.display()
        println("One Plus Display")
    }

    override fun toString(): String{
        return "Name-$name -  size - $size"
    }

}
