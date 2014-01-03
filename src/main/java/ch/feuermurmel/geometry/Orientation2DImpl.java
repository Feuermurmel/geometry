package ch.feuermurmel.geometry;

final class Orientation2DImpl implements Orientation2D {
	private final double x;
	private final double y;
	private final double angle;

	Orientation2DImpl(double x, double y, double angle) {
		this.x = x;
		this.y = y;
		this.angle = angle;
	}

	@Override
	public Vector2D getPosition() {
		return Geometries.vector(x, y);
	}

	@Override
	public Orientation2D moved(Vector2DImpl offset) {
		return Geometries.orientation(getPosition().plus(offset), angle);
	}

	@Override
	public String toString() {
		return String.format("Orientation2d(x = %s, y = %s, angle = %s)", x, y, angle);
	}

	@Override
	public Orientation2D rotated(double angle) {
		return Geometries.orientation(x, y, this.angle + angle);
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public double getAngle() {
		return angle;
	}
}
