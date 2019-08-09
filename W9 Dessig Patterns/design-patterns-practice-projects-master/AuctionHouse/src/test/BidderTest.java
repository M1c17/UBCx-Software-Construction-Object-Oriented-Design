package test;

import model.Auctioneer;
import model.Bidder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BidderTest {

  private static double DELTA = 0.01;

  private Auctioneer auctioneer;
  private Bidder bidder;

  @Before
  public void setUp(){
    auctioneer = new Auctioneer("Mica");
    bidder = new Bidder("jc", 500, auctioneer );
  }

  @Test
  public void testGetter(){
    assertEquals("jc", bidder.getName());
    assertEquals(500, bidder.getMaxBid(), DELTA);
    assertEquals(0, bidder.getCurrentBid(), DELTA);
    assertEquals(0.00, bidder.getPersonalBid(), DELTA);
  }


}
