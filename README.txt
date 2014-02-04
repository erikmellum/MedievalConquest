To use the java files you must first download the JDK. When you download the jdk you need to create "launch.bat" in a text editor and put the following into the file (replace file path with your appropriate path for your appropriate jdk version)
Launch.bat
/************************************************************
set path="C:\Program Files (x86)\Java\jdk1.7.0_25\bin";%path%

cmd
************************************************************/

After you save launch.bat into the folder of the project you want to run double click it and type javac Driver.java to compile the project. After the project compiles type java Driver to actually run the project. That's all, you're done!

Original has the working original version of the game (with two variants) that showcase a "working" text adventure. It's a lot more hacky since it wasn't planned to become a large project. 

Current has the most up to date files directly inside of it. It is a very organized project comparitively.