

//This is the kind of function that is called when you open your program initially


//mimic an interaction between different components of program
fun requestData(){
    val result = InputOutputDevice.getData()
    when (result){
        is Result.Loading -> UserInterface.showLoadingScreen()
        is Result.Success -> UserInterface.showData(result.value)
        is Result.Error -> UserInterface.showErrorMessage()
    }
}
//Result wrapper
sealed class Result{
    object Loading:Result()
    object Error:Result()
    data class Success(val  value: String): Result()
}

//This represents some generic IO device, which you would request data from
object InputOutputDevice {
    fun getData(): Result {
        return Result.Success("Oh yeah")
    }
}
//interface
object UserInterface {
    fun showLoadingScreen() {

    }

    fun showData(data: String) {

    }

    fun showErrorMessage() {

    }
}

//enum class takes a lot of memory

enum class MathematicalOperator(val  op: Char){
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
}

//Functions type syntax
fun checkOperator(op: MathematicalOperator) :(Double, Double) -> Double{
    return when (op){
        //lambda expression
        MathematicalOperator.PLUS -> {x, y -> x + y}
        MathematicalOperator.MINUS -> {x, y -> x - y}
        MathematicalOperator.MULTIPLY -> {x, y -> x * y}
        MathematicalOperator.DIVIDE -> {x, y -> x / y}
    }
}
fun main(args:Array<String>){
    val mathFunction = checkOperator(MathematicalOperator.DIVIDE)
    println(mathFunction.invoke(4.0, 4.0))
}