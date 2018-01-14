<?php

//Switch statements are similar to conditional (if/else if/else) statements, but often
//involve many possible conditions and associated actions

$language = "PHP";

switch($language){
    case "PHP":
        echo "PHP is a server-side scripting language that's useful for web development!";
        break;
    case "JavaScript":
        echo "JavaScript is a client-side scripting language that's useful for web developmetne!";
        break;
    case "HTML":
        echo "HTML is used for displaying and laying out content in a web browser!";
        break;
    case "CSS":
        echo "CSS is used for styling HTML elements within a webpage!";
        break;
    default:
        echo "Programming is cool!";
}

?>
