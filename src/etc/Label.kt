package etc

// Label 은 유지보수에 나쁨.. ㅎㅎ
fun main() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 2) {
                break@loop
            }

            println("${i} ${j}")
        }
    }

}
