<?php

//PHP Functions Tutorial


//simple function that writes text to the screen
function welcomeMsg(){

    echo "Welcome to a PHP tutorial on functions!";

}

//Function that writes "Hello, [name]!" to the screen
function sayHello($name){

    echo "Hello, ".$name."!";

}

//Function that takes a number as input and squares it
function squareNum($input){

    return $input*$input;

}

//Function with two parameters
function addNums($num1, $num2){

    return $num1 + $num2;

}


?>
