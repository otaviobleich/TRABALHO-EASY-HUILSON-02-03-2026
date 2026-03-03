//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   print("Digite a operação")
   val entrada = readLine()!!

 if(entrada.contains("+")){
  val partes = entrada.split("+")
  println(partes[0].toDouble() + partes[1].toDouble())
 }
 else if (entrada.contains("-")){
  val partes = entrada.split("-")
  println(partes[0].toDouble() - partes[1].toDouble())
 }
 else if (entrada.contains("*")){
  val partes = entrada.split("*")
  println(partes[0].toDouble() - partes[1].toDouble())
 }
 else if (entrada.contains("/")){
  val partes = entrada.split("/")
  println(partes[0].toDouble() - partes[1].toDouble())
 }


}