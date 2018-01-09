File: README.txt
Author: Brandon Edwards
Project: CS 110 Final Project
Date: 28 Nov 2017
Honor Code: I pledge that this submission is solely my work, and that I have neither given to nor received help from anyone other than the instructor or TAs.
======================================================================

Explanation: Its a random Number game that asks the user for a number and generates its own number. If the numbers match it awards the user a point up to a max

Description: My program is a simple random number game. When booted up for the first time it asks the user for their name, which is then written to a file. The next line printed asks the user to choose a number between 1 and 10. At which point the program generates its own random number and compares it to the users number. If the numbers match up then the program outputs a congratulation and awards the user a point; however if the numbers do not match a condolence message is printed and no points are awarded to the player. The program then asks the player to guess another number. This process continues in a loop until the players score reaches 5 at which point the program congratulates the player again, thanks them for playing and terminates.If at any point the player wishes to stop playing they may enter “q” at the continue question and the program will thank them for playing and terminate.

Operating Instructions: The program will ask for your name which should be a string, hard to mess this up. then the program will ask if you want to play a game at which point you’ll press return. At this point you should pick a number between 1 and 10 and press return the program will tell you the number it came up with and award point if necessary hit return and repeat these steps until you score 5 points

Configuration Options: if you type auto in the continue screen it will set your score to 5 and then just guess any number and you’ll win

Known Bugs: obviously if you enter anything but an integer in the guess a number stage it will crash the program

Contact Information: brandon.edwards@cwu.edu

======================================================================

PseudoCode: Import scanner and IO classes, setup class and main method, throw IOException, declare variables: ints for input and score, double for random number final int for max score, scanner, file for name file, and string for player name. Ask for name, store name in file with print writer, greet player, print score, ask for number 1-10, use math.random to generate a number, times number by 10, add 1, compare number to user input: if they match print “good job”, score++. If they don’t match print “too bad”. Loop ask for number and score until score gets to the max score, print “thanks for playing” close writer and terminate.

