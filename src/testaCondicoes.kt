fun testaCondicoes(saldo: Double) {


    if (saldo > 0.0) {
        println("Conta é positiva. Saldo é $saldo")
    } else if (saldo == 0.0) {
        println("Saldo é neutro")
    } else {
        println("Conta negativa. Saldo: $saldo")
    }

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
/* condições de exemplo
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