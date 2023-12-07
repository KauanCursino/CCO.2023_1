package school.sptech

open class Pessoa(
    var nome:String,
    var idade:Int,
    var casado:Boolean,
    var altura: Double
) {
    /*var nome:String = nome
        get() = field
        set(value){
            nome = value
        }
    var idade:Int = idade
        get() = field
        set(value){
            idade = value
        }
    var casado:Boolean = casado
        get() = field
        set(value){
            casado = value
        }
    var altura:Double = altura
        get() = field
        set(value){
            altura = value
        }*/





    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade, casado=$casado, altura=$altura)"
    }
}