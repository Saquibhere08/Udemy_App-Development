package com.example.kotlinbasics
fun main(){
    print("Enter your age as a whole number: ")
    val age =readln().toInt()

    //if(age >=18){
    if(age in 18..40){
        println("You can enter the club")
    }//else if(age>=40){
        //println("You cannot go into the club, please go home")
    //}
    else{
        print("Age not verified. Please contact support.")
    }


}