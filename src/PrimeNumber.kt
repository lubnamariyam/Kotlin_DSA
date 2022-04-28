fun main(){
    val num = 7
    var check = false
    for (i in 2 until num) { // 2,3,4,5,6,7,8,9,10,11
        if (num % i == 0) {// 11 % 3 == 1
            check = true
            break
        }
    }
    if (check){
        println("$num not a prime number")
    }else{
        println("$num is a prime number")
    }
}