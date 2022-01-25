class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente para Saque")
        }
    }

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }
}

fun main() {
    println("Bem vindo ao ByteBank")

    val contaLucas = Conta()
    contaLucas.titular = "Lucas"
    contaLucas.deposita(200.0)
    contaLucas.numero = 1000

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.deposita(300.0)
    contaFran.numero = 1001

    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.getSaldo())
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())
    println()

    contaLucas.deposita(50.0)
    println("Depositando na conta do Lucas")
    println(contaLucas.getSaldo())
    println()

    println("Sacando na conta do Lucas")
    contaLucas.saca(100.0)
    println(contaLucas.getSaldo())

    contaFran.deposita(30.0)
    println("Depositando na conta da Fran")
    println(contaFran.getSaldo())
    println()

    println("Transferencia da conta da fran para alex")

    if (contaFran.tranfere(30.0, contaLucas)) {
        println("Transferencia sucedida")
    } else {
        println("falha na transferencia")
    }
    println(contaLucas.getSaldo())
    println(contaFran.getSaldo())
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = 10
    numeroY++

    println("NumeroX $numeroX")
    println("NumeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
}

/*
    for (i in 1..5) {

        println("Bem vindo ao BB")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()


    }
    //faz a o count do maior pro menor
    for (i in 5 downTo 1) {

        println("Bem vindo ao BB")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()


    }

    //pula de 2 em 2
    for (i in 5 downTo 1 step 2) {

        //para a execução quando chegar no numero 4
        if(i == 4){
            break
        }
        //pula o 4 e continua a execução
        if(i == 4) {
            continue
        }
        println("Bem vindo ao BB")
        val titular: String = "Lucas $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()


    }
    */

fun testaCondicoes(saldo: Double) {


    if (saldo > 0.0) {
        println("Conta é positiva. Saldo é $saldo")
    } else if (saldo == 0.0) {
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