package main.decorators;

import java.awt.Graphics2D;

import svg.element.BaseElement;
import svg.element.Element;
import svg.element.style.Style;

public class DecoratorGraphics2D extends Decorator
{
	final protected Graphics2D graphics2D;
	private Decorator wrapee;
	public DecoratorGraphics2D(final BaseElement base, final Style style, final Graphics2D g2d, Decorator decorator)
	{
		super(base, style);
		this.graphics2D = g2d;
		this.wrapee=decorator;
	}

	@Override
	public Element newInstance()
	{
		return component.newInstance();
	}

	@Override
	public boolean load(String expr)
	{
		return component.load(expr);
	}

	@Override
	public void render()  //Graphics2D g2d)
	{
		component.render();  //g2d);
		if(wrapee!=null) {
			wrapee.render();
		}
	}

	@Override
	public void setBounds()
	{
		component.setBounds();
		
	}

}
