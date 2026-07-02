package aulas.conceitosIniciais

// Comentários de uma linha.

/*  Comentários de uma multiplas linhas.
 *  Comentários de uma multiplas linhas.
 */

/**
 * Documentação.
 **/

// Ponto de entrada que executa o código.
fun main() {

    // variáveis:
    // var -> Variável mutável, muda.
    // val -> Imutável, não muda.

    // Tipos:
    var a: String = "Olá Mundo!" // Texto.
    var b: Boolean = true // Lógico - verdadeiro ou falso.
    var c: Char = 'a' // Caractere - Com uma aspa.
    var d: Float = 10.5F // Float.
    var f: Double = 10.59847123 // Double.
    var g: Int = 150 // Inteiro.
    // Byte, Short, Interger, Long.


    // Imprimir no console.
    print(a)
    println(b) // Imprimir com quebra de linha.

    // Concatenar - Só com Strings.
    println(a + " Opa")
    println(a + " " + "Show")

    // Imterpolar uma String:
    println("$a é show") // Nesse caso para coisas simples só para mostrar a variável.
    println("${a} é show") // Para uso mais complexo com variáveis.

    // Operadores Aritméticos:
    val soma = 2 + 2
    val subtracao = 2 - 2
    val multiplicacao = 2 * 2
    val divisao = 2 / 2
    val resto = 2 % 2

    println(soma)
    println(subtracao)
    println(multiplicacao)
    println(divisao)
    println(resto)

    var valor = 0
    valor += 15 // É o mesmo de valor = valor + 15

    // Operadores Incrimento e Decremento:
}