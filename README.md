# IntroToJava
Lesson 1 Practice Hands-On

Directions
Now that you have learned about data types and if-else statements, it's time to put that knowledge to work. In this Hands-On exercise, you will create a project which will solidify how these pieces operate when used together. Below is a Practice Hands-On for you to practice your new skills. This Hands-On will not be graded, but we encourage you to complete it. The best way to become a great programmer is to practice!

Setup
Open Eclipse and create a new Java Project named L01PracticeHandsOn.

In the Package Explorer, right-click src and create a new Class with the following information:

Package: "com.your-name.handson1" (or default)

Name: "HandsOn"

Ensure the main method stub is checked.

For this Hands-On, you will be working within the HandsOn.java file in the main method. Good luck!

Requirements
Two boolean variables (provided): There should be two boolean variables defined in the program as mentioned in the description: isSunny and atBeach.
If-Else Block: An if-else block should be used to control the flow of code.
Print correct text: The correct text should be printed in accordance with the boolean variables as mentioned in the description.
Step 1
Leverage what you have learned about data types and control flow to create a program which will inform the user to wear sunglasses if it's sunny outside. The boilerplate (starter) code is as follows:

boolean isSunny = true;

// if it's sunny
    // print "Wear sunglasses!"

// else
    // print "Don't wear sunglasses."
Here is a table that illustrates what should be printed relative to the boolean values:

Table Output:

isSunny	print
true	Wear sunglasses!
false	Don't wear sunglasses.

Create an if-else code block that will print "Wear sunglasses!" if the value isSunny is true. If the value of isSunny is false, print "Don't wear sunglasses."

Step 2
If-else code blocks can be placed inside of one another. If it's sunny, the code should already be printing "Wear sunglasses!". The task is to add an additional if-else block inside of the code that will additionally print "Wear sunblock!" if the variable atBeach is true. If not at the beach, print "Don't need sunblock." Ensure that there are two different print statements, one for wearing sunglasses and the other for wearing sunblock. Below is a table illustrating the different combinations of boolean values along with the values they should be printing. Additionally, there is a starter code solution that you should complete.

isSunny	atBeach	print
true	true	Wear sunglasses! & Wear sunblock!
true	false	Wear sunglasses! & Don't need sunblock.
false	N/A	Don't wear sunglasses.

boolean isSunny = true;
boolean atBeach = true;

// if it's sunny
    // print "Wear sunglasses!"
    // if at the beach
        // print "Wear sunblock!"

    // else
        // print "Don't need sunblock."

// else
    // print "Don't wear sunglasses."
Step 3
If it's not sunny, the code should already be printing "Don't need to wear sunglasses.". The task is to add an additional if-else block to the code that will print "Come back tomorrow." if the variable isSunny is false and atBeach is true. If not at the beach, print "Don't go to the beach." Ensure that there are two different print statements, one for sunglasses and the other for avoiding the beach. Below is a table of what is supposed to print relative to the variables and a pseudocode solution that you should complete.

Expected Output Table:

isSunny	atBeach	print
true	true	Wear sunglasses! & Wear sunblock!
true	false	Wear sunglasses! & Don't need sunblock.
false	true	Don't wear sunglasses. & Come back tomorrow.
false	false	Don't wear sunglasses. & Don't go to beach.

boolean isSunny = true;
boolean atBeach = true;

// if it's sunny
    // print "Wear sunglasses!"
    // if at the beach
        // print "Wear sunblock!"

    // else
        // print "Don't need sunblock."

// else
    // print "Don't wear sunglasses."
    // if at the beach
        // print "Come back tomorrow."
    // else
        // print "Don't go to the beach."
Submit Your Project
By default, Eclipse stores projects in a particular location. To locate your project directory, from within Eclipse, right-click on the project in the Package Explorer and select one of the following menu options:

Show In -> System Explorer

- OR -

Properties -> Resource

Look for the resources Location. There should be a button next to it to "Show in System Explorer".
