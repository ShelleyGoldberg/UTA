## Do you already have java installed?
to see if you have Java installed open a shell

Windows: search for cmd.exe and open

Mac: search for terminal and open

Then type    `java -version`
If you get something like `java version "1.8.0_XX"`, then you’re good to go!
Otherwise, continue on!

## Download & Install
http://www.oracle.com/technetwork/java/javase/downloads/index.html

Select Java Platform (JDK) 8u60 [Big box top left]

Accept the License Agreement and select appropriate download 

Follow the download/ Installation steps

*Pay attention to where java is saved on Windows (for me it’s `C:\Program Files\Java`)*

###Mac Users:
You should be done after installation! Try closing your terminal, opening a new one and typing   
`java -version` again to verify.

###Windows Users:
Setting your path variable: 

Go to where java is saved and then into the jdk folder, then the bin folder

something like: `C:\Program Files\Java\jdk1.8.0_20\bin` (LOCATION)

Copy the path from the top of the windows explorer 

In the windows explorer window right click “Computer” or "This PC" 

select “Properties”

In the new window select “Advanced System Settings” (on the left side)

In the popup select “Environment Variables”

Under System Variables select the variable `Path` or `PATH` and then click "Edit" (at the bottom of the window)

The whole text will be highlighted- hit the right arrow key to deselect the text and go to the end of the text
ADD TO THE END `;LOCATION`, where `LOCATION` is the file path you copied to the clipboard

****If your computer is like mine, the PATH environment variable will be under User variables, that should be fine too. 

##Check Configuration
open a new command window and type `java -version`, if you still get an error try restarting your computer
