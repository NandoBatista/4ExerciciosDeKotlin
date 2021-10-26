fun main(args: Array<String>) {

    /*1 - Crie um programa onde o usuário digite as notas referente a 4 bimestres e calcule a média. No final, verifique a situação do aluno com base nesses dados:

    - Reprovado se a média for 4 ou menos
    - Regular se a média for maior que 4 e menor ou igual a 5
    - Boa se a média for maior do que 5 e menor ou igual a 8
    - Excelente se a média for maior do que 8 e menor ou igual a 10
    - Se a média der um número negativo ou     uma nota fora da escala de 0 a 10, deverá ser printado média inválida

    print("Digite a sua primeira nota: ")
    var nota1 = readLine()!!.toDouble()
    print("Digite a sua segunda nota: ")
    var nota2 = readLine()!!.toDouble()
    print("Digite a sua terceira nota: ")
    var nota3 = readLine()!!.toDouble()
    print("Digite a sua quarta nota: ")
    var nota4 = readLine()!!.toDouble()
    
    var nota = nota1 + nota2 + nota3 + nota4
    var media = nota/4
    
    if(media <= 4.0) {
        println("Você foi Reprovado!")
    }
    else if(media > 4.0 && media <= 5) {
        println("Sua média é Regular")
    }
    else if(media > 5.0 && media <= 8.0) {
        println("Sua média é Boa")
    }
    else if(media > 8.0 && media <= 10.0){
        println("Sua média é excelente")
    }else{
        (media > 10)
        println("Média inválida")
    }
}


    Exercício 2

    1 - Crie um projeto chamado Calculadora de Comissão
    2 - O App deve calcular a comissão dos representantes de vendas com base neste gráfico usado pela loja de varejo:

    Faixa de Vendas        Comissão
            acima de R$10000    30%
    R$5001 - R$9999        20%
    R$1001 - R$4999        10%
    abaixo de R$1000     N / D

    println("Digite o valor das vendas: ")
    var vendas = readLine()!!.toDouble()

    if(vendas < 1000.00) {
        println("Você não recebeu comissão")
    }
    else if(vendas >= 1000.00 && vendas <= 4999.00) {
        println("Você recebeu 10% de comissão")
    }
    else if(vendas >= 5000.00 && vendas <= 9999.00) {
        println("Você recebeu 20% de comissão")
    }else{
        (vendas > 10000)
        println("Você recebeu 30% de comissão")
    }

    Exercicio 3: Um cinema aplica descontos dependendo da idade do cliente.

    1 - Crie um projeto chamado DescontosCinema
    2 - O App pede para um usuário digitar a sua idade e checa se ele está apto para o deconto do ingresso. A tabela de descontos é a seguinte

       Idade                            Preço do Ingresso
        Ingresso inteiro                 18 Reais
            Abaixo de 5 anos         60% de Desconto
            Acima de 60 anos         55% Discount

    3 - Codifique o app para calcular o preço correto do ingresso com base na idade e mostre esse retorno para o usuário.
    4 - Caso o usuário não tenha desconto, crie um sistema para a quantidade de ingressos que ele quer e, se ele comprar dois ingressos ou mais, terá um desconto de 30% em cada um.

    var desconto = 0.0
    println("Digite a sua idade: ")
    var idade = readLine()!!.toInt()


     if(idade < 5){
         desconto = (18*60/100).toDouble()
         println(" Você recebeu R$$desconto de desconto")
     }else if(idade > 60){
         desconto = (18*55/100).toDouble()
         println("Você recebeu R$$desconto de desconto")
     }else {
         println("Quantos ingressos você desejaria comprar?")
         var ingresso = readLine()!!.toDouble()
         desconto = (ingresso*30/100)
         println("Você recebeu R$$desconto de desconto")
     }
}

Exercício 4

Criarem uma estrutura de when em que consigamos passar um número inteiro entre 1 e 12. O programa precisará, então, retornar o mês referente ao número digitado

    println("Digite um número referente a um mês do ano: ")
    var mes = readLine()!!.toInt()

    when (mes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Valor inválido")

    }
}
 */












