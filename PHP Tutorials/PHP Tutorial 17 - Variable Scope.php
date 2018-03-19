<?php

$name = "David";

function printName(){

  $name = "Jamie";

  echo $GLOBALS['name'];

}

printName();

?>
