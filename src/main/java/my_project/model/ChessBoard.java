package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.Config;

import java.awt.*;

public class ChessBoard extends GraphicalObject {
    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0));

        for (int i = 0; i*50 < Config.WINDOW_HEIGHT; i++) {
            for (int j = 0; j*50 < Config.WINDOW_WIDTH; j++) {
                drawTool.drawFilledRectangle((i+(j%2))*50, (j+(i%2))*50, 50, 50);
            }
        }
    }
}
