<?php

/* Constants are variables that cannot be changed
 * Constants are visible throughout the whole script/PHP file
 * Constants have the same naming conventions as variables
 * By default, constant names are CASE SENSITIVE, but this can be changed
 *
 * Function: define("name", "contents", case-insensitive);
 *
 */

//Define a constant, called "MESSAGE" (set it to be CASE SENSITIVE)
define("MESSAGE", "Hello, world!", false);

//Print the contents of the MESSAGE constant to the screen
echo MESSAGE;

//Try to re-define the constant
define("MESSAGE", "test", false);

//Add a space
echo "<br />";

//Trying to print the re-defined constant (doesn't work)
echo MESSAGE;

//Try changing the constant by assigning it a value of type String (can't do this)
//MESSAGE = "Can this be re-defined?";

//Try printing results of newly "re-defined" constant (won't work)
//echo MESSAGE;


?>
