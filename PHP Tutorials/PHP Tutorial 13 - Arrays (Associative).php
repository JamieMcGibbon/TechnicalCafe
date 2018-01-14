<?php

//associative arrays use keys to reference values assigned to them

$ages = array("John" => 21, "Sharon" => 33, "Mike" => 42, "Linda" => 19, "Bruce" => 45);

//can also assign values like this:
$ages["John"] = 21;
$ages["Sharon"] = 33;
$ages["Mike"] = 42;

//can loop through an associative array using a "for each" loop
foreach($ages as $name => $age){
    echo $name." is ".$age;
    echo "<br />";
}



?>
