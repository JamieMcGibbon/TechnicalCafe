// Start the progress bar with a width of 0%
        let num = 0;

        // Create a function that will cause the bar to load at a speed of 50 ms
        function load_bar(){
           // Call the "load()" function ever 50 ms
           window.setInterval(load, 50);
        }

        // Function that actually loads the blue striped progress bar
        function load(){
            // Add 10% for each iteration of the function (should be 10 iterations in total)
            num += 10;
            // Create a variable that will be used to define the width of the progress bar as a percentage
            let percent_loaded = num + "%";

            // If the percentage of the progress bar that is loaded === 100, stop the iteration
            if(num === 100){
                clearInterval();
            }
            // Continue the iteration as long as the value of num < 100
            else{
                document.getElementById("progress_one").style.width = percent_loaded;
            }
        }
