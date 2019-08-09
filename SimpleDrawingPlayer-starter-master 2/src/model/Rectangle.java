package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {
  private static Color PLAYING_COLOR;

  public Rectangle(Point topLeft, MidiSynth midiSynth) {
    super(topLeft, midiSynth, new Color(68, 209, 230));
    instrument = 56;
  }

  @Override
  public void drawGraphics(Graphics g) {
    g.drawRect(x, y, width, height);
  }

  @Override
  public void fillGraphics(Graphics g) {
    g.fillRect(x, y, width, height);
  }

  @Override
  public boolean contains(Point point) {
    int point_x = point.x;
    int point_y = point.y;

    return containsX(point_x) && containsY(point_y);
  }

}
