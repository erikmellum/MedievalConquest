To use the java files you must first download the JDK. When you download the jdk you need to create "launch.bat" in a text editor and put the following into the file (replace file path with your appropriate path for your appropriate jdk version)
Launch.bat
/************************************************************
set path="C:\Program Files (x86)\Java\jdk1.7.0_25\bin";%path%

cmd
************************************************************/

After you save launch.bat into the folder of the project you want to run double click it and type javac Driver.java to compile the project. After the project compiles type java Driver to actually run the project. That's all, you're done!