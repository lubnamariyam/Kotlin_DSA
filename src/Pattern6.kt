fun main(){
    for (r in 1..10){
        for (s in 9 downTo r){
            print(" ")
        }
        for (c in 1..r){
            print("*")
        }
        println()
    }
}