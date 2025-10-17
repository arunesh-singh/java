/*
Create a class Rectangle with two constructors: one that accepts both width and height, and another that only accepts width and sets a default height. Use the this() constructor chaining to avoid redundancy.
*/

class Rectangle{
  int width;
  int height = 5;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(int width) {
    this.width = width;
  }
}