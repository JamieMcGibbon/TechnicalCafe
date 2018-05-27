// Start the progress bar with a width of 0%
        let fill = 0;

        // Create a function that will cause the bar to load at a speed of 50 ms
        function load_bar(){

           // Call the "load()" function every 50 ms
           window.setInterval(function(){
            // Add 10% for each iteration of the function (should be 10 iterations in total)
            fill += 10;

            // If the percentage of the progress bar that is loaded === 100, stop the iteration
            if(fill === 100){
                clearInterval();
            }
            // Continue the iteration as long as the value of fill < 100
            else{
                document.getElementById("progress_one").style.width = fill + "%";
            }

           }, 50);
        }
