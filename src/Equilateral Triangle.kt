import kotlin.math.sqrt

class EquilateralTriangle(name: String) : Shape(name) {
    private var side: Double = 0.0

    fun setDimensions(side: Double) {
        require(side > 0) { "Side length must be positive." }
        this.side = side
    }

    override fun printDimensions() {
        println("Dimensions -> side: $side")
    }

    override fun getArea(): Double = (sqrt(3.0) / 4.0) * side * side
}
