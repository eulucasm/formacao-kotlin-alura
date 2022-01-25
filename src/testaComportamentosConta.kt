fun testaComportamentosConta() {
    println("Bem vindo ao ByteBank")

    val contaLucas = ContaCorrente("Lucas", 1000)
    contaLucas.deposita(200.0)


    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.deposita(300.0)


    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    contaLucas.deposita(50.0)
    println("Depositando na conta do Lucas")
    println(contaLucas.saldo)
    println()

    println("Sacando na conta do Lucas")
    contaLucas.saca(100.0)
    println(contaLucas.saldo)

    contaFran.deposita(30.0)
    println("Depositando na conta da Fran")
    println(contaFran.saldo)
    println()

    println("Transferencia da conta da fran para alex")

    if (contaFran.tranfere(30.0, contaLucas)) {
        println("Transferencia sucedida")
    } else {
        println("falha na transferencia")
    }
    println(contaLucas.saldo)
    println(contaFran.saldo)
}
