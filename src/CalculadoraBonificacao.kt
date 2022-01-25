class CalculadoraBonificacao {

    var total: Double = 0.0
        private set
    //polimorfismo = reutilização de comportamentos referente a classe mae
    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }

}