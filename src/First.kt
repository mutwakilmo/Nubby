val ADD: String = "+"
val SUBTRACT = "-"
val MULTIPLAY = "*"
val DIVIDE = "/"

val ERROR_MESSAGE ="An error ahas occurred"

//test
val testOperandOne:Double = 5.0
val testOperandTow = 5.0

fun main(args: Array<String>){
      val operatorSymbols = args[0]

    start(operatorSymbols)
}

fun start(operatorSymbols : String){
    if (checkArguments(operatorSymbols)){
      displayResult(
              evaluateBinomial(testOperandOne, testOperandTow, operatorSymbols)
      )
    } else{
        displayResult(ERROR_MESSAGE)
    }
}

//single expression syntax
fun displayResult(result :String) = System.out.println(result)

 fun evaluateBinomial(opOne:Double, opTwo:Double, sym: String) :String{
     return  when (sym){
         //equals
         ADD ->  (opOne + opTwo).toString()
         SUBTRACT ->  (opOne - opTwo).toString()
         MULTIPLAY ->  (opOne * opTwo).toString()
         DIVIDE ->  (opOne / opTwo).toString()
         //otherwise
         else -> return ERROR_MESSAGE
     }
 }
//return Boolean
fun checkArguments(operatorSymbols: String) :Boolean{
    return  when (operatorSymbols){
        //equals
        ADD ->  true
        SUBTRACT ->  true
        MULTIPLAY ->  true
        DIVIDE ->  true
        //otherwise
        else -> return false
    }
}