package lambdakt

import java.io.BufferedReader
import java.io.FileReader

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )


    // 람다 만드는 방법 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    /**
     * const isApple = (fruit: Fruit): Boolean => {
     *      return fruit.name == "사과"
     * }
     */

    // 람다 만드는 방법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }


    // 함수가 지정된 변수의 타입은..? 1
    // (Fruit) -> Boolean
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    // 함수가 지정된 변수의 타입은..? 2
    // (Fruit) -> Boolean
    val isApple4: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    // 람다 호출 1
    isApple(fruits[0])
    // 람다 호출 2
    isApple.invoke(fruits[0])


    // 아래는 전부 같음
    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }
    // 마지막 줄이 return 이 된다.
    filterFruits(fruits) {
        println("사과만 받는다..!")
        it.name == "사과"
    }


}


// try with resourses (use) 를 위한 class
class FilePrinter {
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
