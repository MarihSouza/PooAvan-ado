fun main() {
    /*
   Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos
   mais duas opções de construtores conforme sua percepção,
   com os atributos: nome (String), endereço (String), telefone (String),
   listaDeCompras (mutableListOf<Strings>()).
   A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
   Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
   Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
*/

  println("Digite seu nome :")
    var nome = readLine()!!

    println("Digite seu endereço :")
    var endereco = readLine()!!

    println("Digite seu telefone :")
    var telefone = readLine()!!


try {
    var usuario = Cliente (nome, endereco, telefone)
}catch (e: Exception){

  println(e.message)
}
while (true){

  println("Opções")

  println(" 1- Adicione algo a listinha")
  println(" 2- Retire algo da listinha")
  println(" 3- Quais os itens da listinha")
  println("Digite quarquer coisa para sair")

  var opc = 0

while (true){

  print("O que deseja?")

  try {
    opc= readLine()!!.toInt()
    break

  }catch (e : Exception){
println("Error!digita denovo mané")

  }

}
when(opc){

  1-> {
    println("diga o item a adicionar")
    var item = readLine()!!
    Cliente.cliente.addCompra(item)
  }

  2 -> {
    println("quer remover o que?")
    var item = readLine()!!
    Cliente.removeCompra(item)

  }

  3 -> Cliente.listarCompras()

  else -> break
}

}

}


}
