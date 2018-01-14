<?php

//demonstrate the various functions that are available for use with Strings in PHP

$myString = "This is a string!";

//String length
echo strlen($myString);

//Word count
echo str_word_count($myString);

//Reverse a string
echo strrev($myString);

//Return a substring
echo substr($myString, 0, 4)

//Search for the position of a substring
echo strpos($myString, "is");

//There are other functions available for use with Strings.
//See: http://php.net/manual/en/ref.strings.php
//Reference: https://www.w3schools.com/php/php_string.asp



?>
