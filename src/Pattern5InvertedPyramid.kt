fun main(args:Array<String>){
    for (r in 5 downTo 1){
        for (s in 4 downTo  r){
            print(" ")
        }
        for (c in 1..r){
            print(" *")
        }
        println()
    }
}