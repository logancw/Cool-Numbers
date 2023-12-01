class CoolNumbersCheck{


  // The boolean checks if what the number the user entered is divisble with the remainder of 1 by 3,4,5,6;

  // If the number has remainder of 1 return true and talks with the loop.
  // If not return false and end the loop countCoolNumbers.

  boolean CoolNumber = true;
  public boolean CoolNumber(int num){
    if(num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1){
      return true;
    }else{
      return false;
    }
  }



  public int countCoolNumbers(int stop){
    int count = 0;
    for(int i = 6; i < stop; i++){ // Thank you for the help

      //FOR FUTURE ME: To explain this loop piece for piece.

      // int i = 6; we define the new int and we assign it 6, this is because the count starts at 6 as said in the instructions. 
      // we then check in the loop everytime a new number is given if it is lower then int stop which is the int the user gives in the main class.
      // i++ keeps the loop going 
      if(this.CoolNumber(i) == true){
         count++;
      }

      // Within the loop we run each number the loop goes through in the method above to see if the modulus of 3,4,5,6 all have remainder of 1.
      // If so it will continue to count up a new int (count) until the said number given by the user is met. 
    }
    return count;
  }
}