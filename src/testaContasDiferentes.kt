fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        "Alex",
        1000
    )
    val contaPoupanca = ContaPoupanca(
        "Fran",
        1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta corrente : ${contaCorrente.saldo}")
    println("Saldo conta poupanca : ${contaPoupanca.saldo}")


    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após o saque: ${contaCorrente.saldo}")
    println("Saldo conta poupanca apos o saque: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(100.0, contaPoupanca)
    println("Saldo conta corrente apos transferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupanca apos transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.tranfere(100.0, contaCorrente)
    println("Saldo conta corrente apos transferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupanca apos transferencia: ${contaPoupanca.saldo}")
}
