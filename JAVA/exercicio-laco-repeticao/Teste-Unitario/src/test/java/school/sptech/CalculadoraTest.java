package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test //anotações
    @DisplayName("Somar quando acionado com valores 2 e 2 deve retornar 4")
    void somarQuandoAcionadoComValor2e2DeveRetornar4(){

        // 3 A's

        //Arrange
        Calculadora calculadora = new Calculadora();

        Integer valor1 = 2;
        Integer valor2 = 2;

        Integer valorEsperado = 4;

        //Act
        Integer resultado = Calculadora.somar(valor1, valor2);

        //Assert
        assertEquals(valorEsperado, resultado);
    }

    @Test
    @DisplayName("somar quando acionado com valores numeros deve lançar IllegalArgumentException")
    void somarQuandoComValoresNulosDeveLancarIllegalArgumentException(){
        Calculadora calculadora = new Calculadora();
        String mensagemEsperada = "Os valores não podem ser nulos";

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.somar(null, null)
        );

        String mensagem = exception.getMessage();
        assertEquals(mensagemEsperada, mensagem);

    }
    @Test

}