fun readDouble(prompt: String): Double {
    while (true) {
        print(prompt)
        val v = readLine()?.trim()
        val num = v?.toDoubleOrNull()
        if (num != null) return num
        println("  Please enter a valid number.")
    }
}

fun main() {
    //instance of each class, stored as Shape
    val square: Shape = Square("Square")
    val circle: Shape = Circle("Circle")
    val triangle: Shape = Triangle("Triangle")
    val eqTri: Shape = EquilateralTriangle("EquilateralTriangle")


    println("== Enter dimensions ==")

    if (square is Square) {
        val l = readDouble("Square length: ")
        val h = readDouble("Square height: ")
        square.setDimensions(l, h)
    }

    if (circle is Circle) {
        val r = readDouble("Circle radius: ")
        circle.setDimensions(r)
    }

    if (triangle is Triangle) {
        val a = readDouble("Triangle side a: ")
        val b = readDouble("Triangle side b: ")
        val c = readDouble("Triangle side c: ")
        triangle.setDimensions(a, b, c)
    }

    if (eqTri is EquilateralTriangle) {
        val s = readDouble("Equilateral triangle side: ")
        eqTri.setDimensions(s)
    }

    println("\n== Results ==")
    val shapes = listOf(square, circle, triangle, eqTri)
    for (s in shapes) {
        println("Shape: ${s.name}")
        s.printDimensions()
        println("Area: ${s.getArea()}")
        println("-".repeat(30))
    }

    println("Done.")
}
