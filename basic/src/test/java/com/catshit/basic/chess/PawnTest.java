package com.catshit.basic.chess;

import junit.framework.TestCase;

/**
 * @author liuqiangqiang
 */
public class PawnTest extends TestCase {

    public void testCreate() {
        final String white = "white";
        final String black = "black";

        Pawn whitePawn = new Pawn(white);

        assertEquals(white, whitePawn.getColor());

        Pawn blackPawn = new Pawn(black);

        assertEquals(black, blackPawn.getColor());

    }

    public void testCreateWhitePawn() {
        Pawn whitePawn = new Pawn();

        assertEquals("white", whitePawn.getColor());

    }


}