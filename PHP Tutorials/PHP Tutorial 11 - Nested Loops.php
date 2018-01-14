<?php

//Nested loops in PHP (for loops)
//Making a pyramid using asterisk characters

//Outer loop (used for counting the number of lines and adding in the line breaks)
for($i = 0; $i <= 9; $i++){

    //Inner loop (used for writing the asterisk characters to the screen)
    //Start at 0 and add 1 for each iteration, stopping when $j <= $i (the number of lines)
    for($j = 0; $j <= $i; $j++){

        echo "*";

    }
        //Add in a line break after the inner loop completes its iterations
        echo "<br />";

}

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

  //Making a descending pyramid using nested loops
  for($i = 9; $i >= 0; $i--){

    //Start writing the astericks using the value of $i to keep track of how many are printed
    for($j = $i; $j >= 0; $j--){

      echo "*";

    }

    //Write a line break to the screen after each line
    echo "<br />";

  }


?>
