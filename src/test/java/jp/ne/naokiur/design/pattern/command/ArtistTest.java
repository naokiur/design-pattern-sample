package jp.ne.naokiur.design.pattern.command;

import org.junit.Test;

public class ArtistTest {

    @Test
    public void test() {
        Artist artist = new Artist();
        Canvas canvas = new Canvas();

        artist.write(new Writing(6, "red", 6), canvas);
        artist.write(new Writing(2, "blue", 1), canvas);
        artist.write(new Drawing(9, "yellow", "Circle"), canvas);
        System.out.println("current : " + canvas.getField());

        artist.undoCanvas();
        System.out.println("undo : " + canvas.getField());

        artist.undoCanvas();
        System.out.println("undo : " + canvas.getField());

        artist.write(new Drawing(9, "yellow", "Circle"), canvas);
        System.out.println("undo : " + canvas.getField());

        artist.redoCanvas();
        System.out.println("redo : " + canvas.getField());

        artist.redoCanvas();
        System.out.println("redo : " + canvas.getField());
    }
}
