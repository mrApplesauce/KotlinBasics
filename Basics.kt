/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
*/

val sample1: Byte = 0x3A;
var sample2: Byte = 58;
var heartRate: Int = 85;
var deposits = 135002796.toDouble();
val acceleration = 9.800.toFloat();
var mass= 14.6.toFloat();
var distance = 129.763001.toDouble();
var lost: Boolean = true;
var expensive: Boolean = true;
var choice: Int = 2;
val integral: Char = '∫';
val greeting: String = "Hello";
var name: String = "Karen";

fun main(args: Array<String>) {
    
    //check if samples are equal
    if (sample1 == sample2)
    	println("The samples are equal")
    else
    	println("The samples are not equal");
    
    //check if heart rate is normal
    if (heartRate in 40..80)
    	println("Heart rate is normal.")
    else
    	println("Heart rate is not normal.")
    
    //assess wealth
    if (deposits >= 100000000)
    	println("You are exceedingly wealthy.")
    else
    	println("Sorry you are so poor.")
    
    //calculate and display force
    var force = mass * acceleration;
    	println("force = " + force)
    
    //display the distance
    println(distance.toString() + " is the distance.");
    
    //assess lost and expensive states
    if(lost && expensive)
    	println("I am really sorry! I will get the manager.")
    else if (lost && !expensive)
    	println("Here is a coupon for 10% off.")
    
    //when statement using choice variable
    when(choice) {
        in 1..3 -> println("You chose " + choice + ".")
        else -> println("You made an unknown choice.");
    }
    
    //display the integral character
    println(integral + " is an integral.")
    
    //print values of a for loop
    for(i in 5..10)
    	println("i=" + i)
    
    //increment age variable using a while loop
    var age = 0;
    while (age < 6) {
        println("age=" + age)
        age++
    }
    
    //display greeting and name
    println(greeting + " " + name);
    
}