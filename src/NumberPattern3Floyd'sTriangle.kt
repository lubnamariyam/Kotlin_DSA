fun main(){
    var count = 0
    for (r in 1..5){
        for (c in 1..r){
            print("$c ")
        }
        println()
        ++count
    }
}