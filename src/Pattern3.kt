fun main(args:Array<String>){
    for (r in 1..5){
        for (c in 1..r){
            print(" *")
        }
        println()
    }
    for (r in 5 downTo 1){
        for (c in 1..r){
            print(" *")
        }
        println()
    }
}