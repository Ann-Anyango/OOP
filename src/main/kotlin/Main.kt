fun main() {
    val toyo = Car("Toyota","Jeep","KDD 456G",0)
    var audi =Car("Audi","A4","KCD 1244L",0)
    audi.start()
    println(audi.speed)
    audi.accelerate(60)
    println(audi.speed)
    audi.accelerate(35)
    println(audi.speed)
    audi.deccelerate(40)
    println(audi.speed)
    audi.deccelerate(15)
    println(audi.speed)
    audi.hoot()
    audi.stop()
    println(audi.speed)
    val myBook=Book("Born a crime","Trevor Noah",288,2002)






}
class Car (var make:String, var model:String, var regestration:String, var speed:Int) {
    fun start() {
        println("vooommmm vooommmm")
    }

    fun accelerate(acceleration: Int): Int {
        speed += acceleration
        return speed
    }
    fun deccelerate(decceleration:Int):Int{
        speed-=decceleration
        return speed
    }
    fun hoot(){
        println("piiip piiip")
    }
    fun stop(){
        speed=0
        println("sh sh")

    }
}
data class Book( var title:String,var author:String,var pages:Int, var tear:Int)