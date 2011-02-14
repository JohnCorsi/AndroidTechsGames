package br.techs.pieces;

import br.techs.math.Vector2D;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Wall extends BlockableEntity {
	private Paint wallPaint;
	private Vector2D normal;

	public Wall(Rect bounds, Vector2D normal) {
		super(bounds);
		wallPaint = new Paint();
		wallPaint.setColor(Color.GRAY);
		
		this.normal = normal;
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.save();
		canvas.drawRect(getBounds(), wallPaint);
		canvas.restore();
	}

	@Override
	public void processAI() {
		// Do nothing, walls don't think
	}
	
	public Vector2D getNormal(){
		return normal;
	}

}
