class AppUser(

        //Class constructor
        //class can contain properties
        val name: String,
        val joinDate: String,
        val proVersion: Boolean
) {
    //class body
    fun getFirstInitial(): Char {
        return name[0]
    }
}


data class User(
        val uid:String,
        val name :String,
        val profilePicUrl: String ="satellite_beam"
){
    //////////////////////
}

fun main(args :Array<String>){
    val aUser = AppUser(
            "Ryan",
            "Now",
            false
    )

    val user = User(
            "123",
            "Jermy"
    )

    val otherUser = User(
            "5555",
            "Bob",
            "selfie.jpg"
    )
}

//Cohesion
//Cohesive class
class DogOne(
        val age: Int,
        val weight : Double,
        val height :Double,
        val name :String,
        val owner :User
){

    fun makeNoise(){
        println("BARK!")
    }
}


//Not Cohesive
class DogTow(
        val bankAccountNumber :Int,
        val letterGrade :String,
        val fluentInDutch :Boolean
){
    fun measureGravity(){
        println("BARK!")
    }
}