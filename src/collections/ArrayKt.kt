package collections


fun main() {
    val arr = arrayOf(100, 200)

    for (i in arr.indices) {
        println(i)
    }

    for ((idx, value) in arr.withIndex()) {
        println("$idx: $value")
    }

    arr.plus(300)

    
}
