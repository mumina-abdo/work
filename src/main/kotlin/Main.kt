fun main(){
    word("AkiraChix")
    println(sentence("Halima",33))
    var fullName= "Hawo Abdo"
    println(fullName)
    var age = 20
    println(age)
    var weight= 65.3
    println(weight)
    var phoneNumber= "0753442356"
    println(phoneNumber)
    var iskenya= "True"
    println(iskenya)
    var result = weather(35.3)



}
fun word(name: String){
    println(name[0]+""+name[2]+""+name[3])
}

fun sentence(a:String, b: Int):String{
    var structure="Hi my name is $a and i am $b years old"
    return structure
}

fun weather(town: Double){
    var result = "The temperature is $town degree celcius"
    println(result)
}


