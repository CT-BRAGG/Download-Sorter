# DOWNLOAD SORTER

version: v1    
Requiremens:      
- java: 21 or later      
- environment: ubuntu 24.10        
- gnu bash: 5.2.32
- 

## Description
This program sorts the contents of the download folder of a linux system. This is really just a rough draft of a file sorting program, but it works. Currently there is a bit more work to get it working than its worth; I would wait a few versions to install it.

    
## Requirements
This program requires java 21 or later to run. The only import is the Scanner package and the code doesn't get too wild, so some earlier versions might work. There are no guarentees and I am not going to test it. It utilizes version 5.2.32 of GNU Bash for scripting. The operating system this program was tested on was Ubuntu 24.10. This program will definitely not work on any vanilla Windows OS without heavy modifcations.


## Installation
There is a decent amount of steps in the installation so I am going to summarize quite a bit. Once you have the repo downloaded. Go into the src/ folder and change the paths to match your system. They are not properly labeled and hard to find unless you read through all the source code to get an idea of whats going on. I would honestly just give all the files to an AI. Once the all the directory paths are correct, recompile the source code. At this point, the program is ready to run. It can be executed manually with the ./sort_download.sh file in a terminal, or by adding the command, 'nohup "path to sh file" > /dev/nul &', to the '.profile' file in the home directory of the current user; if there is no '.profile' file, find something that runs everytime your computer turns on and just append it to the end.    


## Potential Features
There are a few things that will change for the better in future versions. One of the versions will hopefully be platform independent and run on both windows and linux as a single jar file. MacOS will purposefully be excluded. It, hopefully, would have a gui created using the AWT library which should help with portability. The program will also be written entirely in java. The process for configuring the file paths and grammar in the readme file needs a little work. 
