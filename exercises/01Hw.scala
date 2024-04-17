/**
Homework 01
============
*/

object Hw01 {

/**
Consider the following language of propositional logic formulae:
*/
enum Exp:
  case True()  // constant true
  case False() // constant false
  case And(lhs: Exp, rhs: Exp)
  case Or(lhs: Exp, rhs: Exp)
  case Not(e: Exp)
import Exp._

/**
Tasks:
       1) Implement the missing parts of the interpreter for these formulae
          (the eval function).
          Test the correctness by evaluating the example proposition given
          below and add at least two more examples and test against these.

       2) Add implication as a new kind of expression "Impl" and extend
          the interpreter accordingly. Add at least two examples for testing.
*/

def eval(e: Exp) : Boolean = e match {
  case True()    => sys.error("not yet implemented")
  case False()   => sys.error("not yet implemented")
  case And(l, r) => sys.error("not yet implemented")
  case Or(l, r)  => sys.error("not yet implemented")
  case Not(e)    => sys.error("not yet implemented")
}

val exampleProposition = And(Not(True()), False()) // should evaluate to false

}
