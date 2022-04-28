fun main(){
    for (r in 5 downTo 1){
        for (s in 4 downTo r){
            print(" ")
        }
        for (c in 1..r){
            print(" *")
        }
        println()
    }
    for (i in 1..5){
        for (sp in 4 downTo i){
            print(" ")
        }
        for (j in 1..i){
            print(" *")
        }
        println()
    }
}