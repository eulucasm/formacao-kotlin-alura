open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    //o open deixa a função aberta possibilitando a sobrescrita do metodo.
    open fun bonificacao(): Double = salario * 0.1

    //open val bonificacao: Double
    //  get() {
    //      return salario * 0.1
    //}

    //open fun bonificacao(): Double {
    //  return salario * 0.1
    //}
}