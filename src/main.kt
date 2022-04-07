fun main(){
numEven()
    println(name(arrayOf("Nancy","Happy","Misky","Bhakita","Nadine","Immaculate","liz","Tanya")))
    fruits(20)
    fruits(48)
    fruits(70)

}
fun numEven() {
    for (number in 1..100) {
        if (number % 7 !== 0) {
            println(number)
        }
    }
}
fun name(z:Array<String>):Int{
    var letters=0
        z.forEach { x->
            if (x.length<8){
                letters++
            }
        }
    return letters
    }
fun fruits(juice:Int){
    if (juice<30){
        println("mango")
    }
    else if (juice<50 && juice>30){
        println("pineapple")
    }
    else{
            println("melon")
}
}

