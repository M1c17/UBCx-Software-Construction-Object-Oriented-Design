package test;

import model.Auctioneer;
import model.Bidder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuctioneerTest {

  private static double DELTA = 0.01;

  private Auctioneer auctioneer;
  private Bidder b1, b2, b3;

  @Before
  public void setUp() {
    auctioneer = new Auctioneer("Mica");
    b1 = new Bidder("Owen", 90, auctioneer);
    b2 = new Bidder("Lucas", 78, auctioneer);
    b3 = new Bidder("Aiden", 67, auctioneer);
  }

  @Test
  public void testGetter() {
    assertEquals("Mica", auctioneer.getName());
    assertEquals(0.0, auctioneer.getCurrentBid(), DELTA);
  }

  @Test
  public void testgetCurrentBid() {
    checkCurrentBid(0);
    auctioneer.acceptBid(0);
    checkCurrentBid(0);
    auctioneer.acceptBid(200);
    checkCurrentBid(200);
    auctioneer.acceptBid(300);
    checkCurrentBid(300);
  }

  @Test
  public void testNotifyObservers() {
    auctioneer.addObserver(b1);
    auctioneer.addObserver(b2);
    auctioneer.acceptBid(100);
    checkCurrentBid(100, b1);
    checkCurrentBid(100, b2);
    checkCurrentBid(100, b3);
  }

  private void checkCurrentBid(double bid){
    assertEquals(auctioneer.getCurrentBid(), bid, DELTA);
  }

  private void checkCurrentBid(double bid, Bidder b){
    assertEquals(b.getCurrentBid(), bid, DELTA);
  }

}
