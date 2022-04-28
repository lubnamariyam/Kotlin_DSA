fun main(){
    for (r in 1..5){
        for (c in 1..5){
            if (r>=2 && c>=2 && r<=4 && c<=4){
                print("  ")// 2 space
            }else{
                print(" *")
            }
        }
        println()
    }
}