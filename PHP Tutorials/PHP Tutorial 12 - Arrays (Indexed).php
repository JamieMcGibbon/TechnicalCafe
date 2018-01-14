<?php

//indexed arrays
//don't have to declare a size when initializing an array, like with other languages (ex. Java)
$names = array("John", "Sharon", "Linda", "Mike", "Bruce");

//can also use "short syntax" to define array
//$names = ["John", "Sharon", "Linda", "Mike", "Bruce"];

//access invididual elements via index (starting at 0)
echo $names[0];
echo $names[1];
echo $names[2];
echo $names[3];
echo $names[4];

//can also use a loop to access the elements of the array
for($i = 0; $i <= 4; $i++){
    echo $names[$i];
}

?>
