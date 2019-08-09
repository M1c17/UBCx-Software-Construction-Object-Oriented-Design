package ui;

import javax.swing.*;

public class QueryPanel extends JPanel {
  // The number of Tweets corresponding to this query
  private int nTweets = 0;
  // The total number of tweets
  private static int totalNTweets = 0;

  public JLabel label;

  public QueryPanel() {
    super();
  }

  public void incrementTweets() {
    nTweets++;
    totalNTweets++;
  }

  public void setLabel(JLabel label){
    this.label = label;
  }

  public JLabel getLabel(){
    return label;
  }

  public int getNTweets() { return nTweets; }

  public int getTotalNTweets() { return  totalNTweets; }

}
