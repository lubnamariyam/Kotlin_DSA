import java.util.*

fun main(args: Array<String>) {

    var n: Int

    var sc = Scanner(System.`in`)

    print("Enter a number:")
    n = sc.nextInt()

    for (i in 2..n) {
        var p = 1
        var k = 2
        while (k < i) {
            if (i % k == 0) {
                p = 0
                break
            }
            k++
        }
        if (p == 1) {
            println("Number is prime:$i")
        }
    }
}