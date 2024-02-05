import com.sun.org.apache.xpath.internal.operations.Bool
import school.sptech.Pessoa

class Funcionario(
    nome:String,
    idade:Int,
    casado:Boolean,
    altura:Double,
    var salario:Double
):Pessoa(nome,idade, casado, altura) {



}