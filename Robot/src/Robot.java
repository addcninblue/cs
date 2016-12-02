public class Robot
{
  private int[] hall;
  private int pos;             // current position(tile number) of Robot
  private boolean facingRight; // true means this Robot is facing right

  /**
   * Constructor for robot
   * (Postcondition: makes robot)
   * @param hall the array of items
   * @param pos starting position
   * @param facingRight whether or not it is initially facing right
   * (Precondition: none)
   */
  public Robot(int[] hall, int pos, boolean facingRight){
      this.hall = hall;
      this.pos = pos;
      this.facingRight = facingRight;
  }

  /**
   * Checks if wall in front
   * (Postcondition: returns boolean if wall in front)
   * @return canMove whether or not the robot can move forward
   * (Precondition: none)
   */
  // postcondition: returns true if this Robot has a wall immediately in
  //                front of it, so that it cannot move forward;
  //                otherwise, returns false
  private boolean forwardMoveBlocked(){
      return((facingRight && hall.length - 1 == pos) || (!facingRight && pos == 0));
  }


  /**
   * Moves the robot
   * (Postcondition: Moves the robot)
   * (Precondition: none)
   */
  // postcondition: one move has been made according to the
  //                specifications above and the state of this
  //                Robot has been updated
  private void move(){
      if(hall[pos] != 0){
          hall[pos]--;
      }
      if(hall[pos] == 0){
          if(forwardMoveBlocked()){
              facingRight = !facingRight;
          } else if(facingRight){
              pos++;
          } else {
              pos--;
          }
      }
  }


  /**
   * Clears the hall and counts how many steps needed
   * (Postcondition: int >= 0)
   * @return steps the number of steps needed
   * (Precondition: none)
   */
  // postcondition: no more items remain in the hallway;
  //                returns the number of moves made
  public int clearHall(){
      int numberOfMoves = 0;
      while(!hallIsClear()){
          move();
          numberOfMoves++;
      }
      return numberOfMoves;
  }


  /**
   * Returns true if hall is clear
   * (Postcondition: boolean)
   * @return hallIsClear whether or not hall is clear
   * (Precondition: none)
   */
  // postcondition: returns true if the hallway contains no items;
  //                otherwise, returns false
  private boolean hallIsClear(){
      for(int block: hall){
          if(block != 0){
              return false;
          }
      }
      return true;
  }
}

