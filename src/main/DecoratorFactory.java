package main;

import main.decorators.Decorator;
import main.decorators.DecoratorGraphics2D;
import main.decorators.shapes.*;
import svg.element.shape.*;
import svg.element.shape.Polygon;
import svg.element.shape.Shape;
import svg.element.shape.path.Path;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DecoratorFactory {
    private List<Decorator> prototypes;
    private Graphics2D g2dImage;
    public DecoratorFactory(Graphics2D g2d){
//        prototypes= new ArrayList<Decorator>();
//        prototypes.add(new DecoratorGraphics2DCircle(new Circle(), g2d));
//        prototypes.add(new DecoratorGraphics2DEllipse(new Ellipse(), g2d));
//        prototypes.add(new DecoratorGraphics2DLine(new Line(), g2d));
//        prototypes.add(new DecoratorGraphics2DPath(new Path(), g2d));
//        prototypes.add(new DecoratorGraphics2DPolygon(new Polygon(), g2d));
//        prototypes.add(new DecoratorGraphics2DPolyline(new Polyline(),g2d));
//        prototypes.add(new DecoratorGraphics2DRect(new Rect(),g2d));
//
            g2dImage=g2d;
    }

    public Decorator makeDecorator(Shape element){
//        for(Decorator decorator: prototypes){
//            if(shape.label().equals(decorator.label())){
//                return decorator.makeNewInstance();
//            }
        Decorator decorator=null;
        Shape shape = null;
        switch (element.label()) {
            case "circle":
                shape = (Circle) element;
                decorator = new
                        DecoratorGraphics2DCircle((Circle) shape,g2dImage );
                break;
            case "ellipse":
                shape = (Ellipse) element;
                decorator = new
                        DecoratorGraphics2DEllipse((Ellipse) shape, g2dImage);
                break;

            case "polyline":
                shape = (Polyline) element;
                decorator = new
                        DecoratorGraphics2DPolyline((Polyline) shape, g2dImage);
                break;

            case "polygon":
                shape = (Polygon) element;
                decorator = new
                        DecoratorGraphics2DPolygon((Polygon) shape, g2dImage);
                break;
            case "rect":
                shape = (Rect) element;
                decorator = new
                        DecoratorGraphics2DRect((Rect) shape, g2dImage);
                break;
            case "path":
                    shape = (Path)element;
                decorator = new
                        DecoratorGraphics2DPath((Path)shape, g2dImage);

        }
        return decorator;
    }
}
