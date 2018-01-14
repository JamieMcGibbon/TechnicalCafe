<?php

//Declare and fill an indexed array with values
$names = array("John", "Susan", "Mike", "David");

//Sort the array using the sort() function
sort($names);

//Use the rsort() function to reverse-sort an indexed array
//Use the shuffle() function to shuffle the values of an array

//Print the values of the sorted array
for($i = 0; $i <= sizeof($names)-1; $i++){

  echo $names[$i];
  echo "<br />";

}

//Declare and fill an associative array with key-value pairs
$ages = array("John" => 21, "Susan" => 33, "Mike" => 42, "David" => 24);

//Sort the array using the following functions:
//ksort() = key (ascending)
//krsort() = key (descending)
//asort() = value (ascending)
//arsort() = value (descending)

//Use a foreach loop to print the values of the sorted arrays
foreach($ages as $name => $age){

  echo $name. " - ".$age;
  echo "<br />";

}





?>
