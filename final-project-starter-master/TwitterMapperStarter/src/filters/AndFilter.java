package filters;

import twitter4j.Status;

import java.util.List;

public class AndFilter implements Filter{
  private final Filter child;
  private final Filter child1;

  public AndFilter(Filter child, Filter child1) {
    this.child = child;
    this.child1 = child1;
  }

  /**
   * A not filter matches when its child doesn't, and vice versa
   * @param s     the tweet to check
   * @return      whether or not it matches
   */
  @Override
  public boolean matches(Status s) {
    return child.matches(s) && child1.matches(s);
  }

//  @Override
//  public List<String> terms() {
//    List<String> res = child.terms();
//    res.addAll(child1.terms());
//    return res;
//  }

  @Override
  public List<String> terms() {
    return child.terms();
  }

  public String toString() {
    return "(" + child.toString() + " and " + child1.toString() + ")";
  }
}
