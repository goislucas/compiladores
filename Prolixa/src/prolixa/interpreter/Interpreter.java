package prolixa.interpreter;
 
import java.lang.System;

import prolixa.analysis.*;
import prolixa.node.*;
 
public class Interpreter extends DepthFirstAdapter {
 
   public void caseAProgram(AProgram node) {
      String lhs = node.getLeft().getText().trim();
      String rhs = node.getRight().getText().trim();
      int result = (new Integer(lhs)).intValue() + (new Integer(rhs)).intValue();
      System.out.println(lhs + "+" + rhs + "=" + result);
   }
}