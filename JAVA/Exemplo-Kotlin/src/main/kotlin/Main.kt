import school.sptech.Pessoa

fun main(args: Array<String>) {


    println(soma(5,9))

    var pessoa = Pessoa("Cirilo", 19, true, 1.75)

    println("nome: ${pessoa}")

}
    fun soma(a: Int, b: Int): Int{
      return a + b
    }
