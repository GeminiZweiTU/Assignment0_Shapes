import kotlin.math.PI

class Circle(name: String) : Shape(name) {
    private var radius: Double = 0.0

    fun setDimensions(radius: Double) {
        require(radius > 0) { "Radius must be positive." }
        this.radius = radius
    }

    override fun printDimensions() {
        println("Dimensions -> radius: $radius")
    }

    override fun getArea(): Double = PI * radius * radius
}
