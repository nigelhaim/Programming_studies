package Drafts;



import java.util.Scanner;


/**
 * Operand nodes form the leaves of expression trees. They store doubles.
 * 
 * @author Nathan Sprague
 * @version 10/2016
 *
 */
public class OperandNode extends ExpressionNode {

    private double number;
  
    public OperandNode(double number) {
      super();
      this.number = number;
    }
  
    @Override
    public double evaluate() {
      return number;
    }
  
    @Override
    public String toString() {
      return "" + number;
    }
  
    @Override
    public String postfixString() {
      return toString();
    }
  
    @Override
    public String prefixString() {
      return toString();
    }
  
    @Override
    public String infixString() {
      return toString();
    }
  
  }

  
/**
 * Operator nodes are the internal nodes of a binary expression tree.
 * 
 * @author ???
 * @version ???
 */
public class OperatorNode extends ExpressionNode {

    private Operator op;
  
    public OperatorNode(Operator op) {
      super();
      this.op = op;
    }
  
    public OperatorNode(Operator op, ExpressionNode left, ExpressionNode right) {
      super(left, right);
      this.op = op;
    }
  
    /**
     * Evaluate the expression rooted at this node and return the result.
     */
    @Override
    public double evaluate() {
  
      // UNFINISHED.
      return 0;
  
    }
  
    @Override
    public String postfixString() {
      // UNFINISHED (See superclass javadocs for requirements.)
      return "";
    }
  
    @Override
    public String prefixString() {
      // UNFINISHED
      return "";
    }
  
    @Override
    public String infixString() {
      // UNFINISHED
      return "";
    }
  
  
  }
  
/**
 * Abstract base class for nodes in a binary tree representing an arithmetic
 * expression.
 * 
 * @author Nathan Sprague
 * @version 10/2016
 */
public abstract class ExpressionNode {

    private ExpressionNode left;
    private ExpressionNode right;
  
    public ExpressionNode(ExpressionNode left, ExpressionNode right) {
      this.left = left;
      this.right = right;
    }
  
    public ExpressionNode() {
      this.left = null;
      this.right = null;
    }
  
    public void setLeft(ExpressionNode left) {
      this.left = left;
    }
  
    public void setRight(ExpressionNode right) {
      this.right = right;
    }
  
    public ExpressionNode left() {
      return left;
    }
  
    public ExpressionNode right() {
      return right;
    }
  
    // Abstract methods below.
  
    /**
     * Return the value of the expression tree rooted at this node.
     */
    abstract public double evaluate();
  
    /**
     * Return a string containing the postfix representation of the expression
     * tree rooted at this node.
     * 
     * For example, the following tree:
     * 
     * <pre>
     *            *
     *           / \
     *          +  2.0
     *         / \
     *       4.0  1.0
     * </pre>
     * 
     * would evaluate to "4.0 1.0 + 2.0 *"
     */
    public abstract String postfixString();
  
    /**
     * Return a string containing the postfix representation of the expression
     * tree rooted at this node.
     * 
     * For example, the following tree:
     * 
     * <pre>
     *            *
     *           / \
     *          +  2.0
     *         / \
     *       4.0  1.0
     * </pre>
     * 
     * 
     * would evaluate to "* + 4.0 1.0 2.0"
     */
    public abstract String prefixString();
  
    /**
     * Return a string containing the postfix representation of the expression
     * tree rooted at this node.
     * 
     * For example, the following tree:
     * 
     * <pre>
     *            *
     *           / \
     *          +  2.0
     *         / \
     *       4.0  1.0
     * </pre>
     * 
     * would evaluate to ((4.0 + 1.0) * 2.0)"
     */
    public abstract String infixString();
  
  
  }
  
/**
 * Enumerated type representing possible binary operators.
 * 
 * @author Nathan Sprague
 * @version 10/2016
 *
 */
public enum Operator {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");
  
    private String opString;
  
    Operator(String operator) {
      this.opString = operator;
    }
  
    /**
     * Return the Operator enum that corresponds to the string representation of
     * the operator.
     * 
     * @param operator Should be one of "+", "-", "*", "/"
     * @return The corresponding Operator Enum
     * @throws IllegalArgumentException if the string does not represent a valid
     *         operator
     */
    public static Operator parseOperator(String operator) {
      for (Operator op : Operator.values()) {
        if (op.opString.equals(operator)) {
          return op;
        }
      }
      throw new IllegalArgumentException("Unrecognized operator");
    }
  
    /**
     * Return the string representation of this operator.
     */
    public String opString() {
      return opString;
    }
  
  }
/**
 * Class for parsing strings that encode mathematical expressions in prefix
 * format.
 * 
 * @author ??
 * @version ??
 *
 */
public class PrefixParser {

  /**
   * This method takes a string encoding a prefix expression and returns the
   * corresponding expression tree.
   * 
   * For example, the string "* + 4.0 1.0 2.0", will result in the tree:
   * 
   * <pre>
   *            *
   *           / \
   *          +  2.0
   *         / \
   *       4.0  1.0
   * </pre>
   */
  public static ExpressionNode parseExpression(String expression) {

    // THE CODE BELOW JUST ILLUSTRATES HOW YOU CAN CHECK THE TOKEN TYPES. YOUR
    // IMPLEMENATION SHOULD BE RECURSIVE.

    Scanner tokens = new Scanner(expression);

    while (tokens.hasNext()) {
      if (tokens.hasNextDouble()) {
        double operand = tokens.nextDouble();
        System.out.println("The token " + operand + " is an operand!");
      } else {
        Operator op = Operator.parseOperator(tokens.next());
        System.out.println("The token " + op.opString() + " is an operator!");
      }
    }
    tokens.close();
    return null;
  }


}
/**
 * Simple tests for expression trees.
 * 
 * @author Nathan Sprague
 * @version 10/2016
 */
public class ExpressionDriver {

    /**
     * Execute the test methods.
     */
    public static void main(String[] args) {
      testExpressionTree();
      testPrefixParser();
    }
  
    /**
     * Build a simple expression tree and test its operations.
     */
    public static void testExpressionTree() {
      // Build the expression ((7.0 * 2.0) - (8.0 / 2.0))
      ExpressionNode tree = new OperatorNode(Operator.SUBTRACT);
  
      tree.setLeft(new OperatorNode(Operator.MULTIPLY));
      tree.left().setLeft(new OperandNode(7.0));
      tree.left().setRight(new OperandNode(2.0));
  
      tree.setRight(new OperatorNode(Operator.DIVIDE));
      tree.right().setLeft(new OperandNode(8.0));
      tree.right().setRight(new OperandNode(2.0));
  
      System.out.println("Expression Evaluates To: " + tree.evaluate());
      System.out.println("Infix Representation:    " + tree.infixString());
      System.out.println("Prefix Representation:   " + tree.prefixString());
      System.out.println("Postfix Representation:  " + tree.postfixString());
    }
  
    /**
     * Test the prefix parser on a sample input.
     */
    public static void testPrefixParser() {
      PrefixParser eval = new PrefixParser();
      ExpressionNode tree = eval.parseExpression("- * 7.0 2.0 / 8.0 2.0");
  
      System.out.println("Expression Evaluates To: " + tree.evaluate());
      System.out.println("Infix Representation:    " + tree.infixString());
      System.out.println("Prefix Representation:   " + tree.prefixString());
      System.out.println("Postfix Representation:  " + tree.postfixString());
    }
  
  }
