fun main() {

    println("Iniciando")
    val meuArray= arrayOf(3,3,4,5,5,6)
    var novoArray = ArrayList<Int>()
    novoArray.add(meuArray[0])

    for (i in 1.. (meuArray.size - 1)) {

        if(meuArray[i] != meuArray[i - 1]) {
            novoArray.add(meuArray[i])
        }
    }


    println(novoArray)


}
