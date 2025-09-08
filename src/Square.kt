class Square(name: String) : Shape(name) {
    private var length: Double = 0.0
    private var height: Double = 0.0

    fun setDimensions(length: Double, height: Double){
        require(length > 0 && height > 0) {"Length and/or height must be positive."}

        this.length = length
        this.height = height
    }

    override fun printDimensions(){
        println("Dimensions -> length: $length, height: $height")
    }

    override fun getArea(): Double = length * height
}