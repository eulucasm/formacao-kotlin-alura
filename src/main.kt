fun main () {
    println("Bem vindo ao BB")
    val titular = "Lucas"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo = 0.0
    saldo -= 1000

    println("Titular: $titular")
    println("Numero da conta $numeroConta")
    println("saldo da conta $saldo")

    if (saldo > 0.0){
        println("Conta é positiva. Saldo é $saldo")
    } else if (saldo == 0.0){
        println("Saldo é neutro")
    } else {
        println("Conta negativa. Saldo: $saldo")
    }

    //Mesma situação utilizando when

    //mesma coisa do switch case
    when {
        saldo > 0.0 -> {
            println("Conta é positiva. Saldo é $saldo")
        }
        saldo == 0.0 -> {
            println("Saldo é neutro")
        }
        else -> {
            println("Conta negativa. Saldo: $saldo")
        }
    }

}