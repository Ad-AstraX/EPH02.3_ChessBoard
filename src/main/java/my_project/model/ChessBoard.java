package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class ChessBoard extends GraphicalObject {
    public ChessBoard() {
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0));
        for (int i = 0; i < 10; i++) {
            drawTool.drawFilledRectangle(i*100, 0, 50, 50);
        }
    }
}
