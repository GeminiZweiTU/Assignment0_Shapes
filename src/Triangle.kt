import kotlin.math.sqrt

class Triangle(name: String) : Shape(name) {
    private var a: Double = 0.0
    private var b: Double = 0.0
    private var c: Double = 0.0

    fun setDimensions(a: Double, b: Double, c: Double) {
        require(a > 0 && b > 0 && c > 0) { "Side lengths must be positive." }
        require(a + b > c && a + c > b && b + c > a) { "Invalid triangle side lengths." }
        this.a = a
        this.b = b
        this.c = c
    }

    override fun printDimensions() {
        println("Dimensions -> sides: a=$a, b=$b, c=$c")
    }

    override fun getArea(): Double {
        val s = (a + b + c) / 2.0
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}
