# ScalaClassMCIT
Basic codes for scala

1) Task 1
Scala OOP
Objective
Learn inheritance in Scala
Problem statement


Follow the instructions of Circle and Cylinder to code two new Shapes namely Square and SquareCuboid.
What to deliver
1. Complete the code practiced in the class to add Square and SquareCuboid.
2. Add a companion object of Shape that has one method:
def create(name: String, x: Double, y: Double): Shape = ???
This method, takes as input a name and two numbers. Based on the name, it decides to
instantiate an object of your choice and the values are used to pass to the constructor. The
name could be one of the following:
a. circle
b. cylinder
c. square
d. sequrecuboid
To test your implementation,
Shape.create(“circle”, 1.0, 0.0) returns an object of Circle with radius of 1.0
Shape.create(“squarecuboid”, 1.0, 2.0) returns an object of SquareCuboid with base
length of 1.0 and height of 2.0
Extra
Add a new method to Cylinder and SqureCuboid as
def volume(): Double = ???
that calculates the volume.

