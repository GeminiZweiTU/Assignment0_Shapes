abstract class Shape(_name: String): Dimensionable {
    var name: String = _name
        protected set

    abstract override fun printDimensions()
    abstract fun getArea(): Double
}