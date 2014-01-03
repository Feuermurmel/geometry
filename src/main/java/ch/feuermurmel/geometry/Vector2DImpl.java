package ch.feuermurmel.geometry;

final class Vector2DImpl implements Vector2D {
	private final double x;
	private final double y;

	Vector2DImpl(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getLength() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	public double getAngle() {
		return Math.atan2(y, x);
	}

	@Override
	public Vector2D times(double factor) {
		return Geometries.vector(x * factor, y * factor);
	}

	@Override
	public Vector2D rotated(double angle) {
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);

		return Geometries.vector(x * cos - y * sin, y * cos + x * sin);
	}

	@Override
	public double dotProduct(Vector2D vec) {
		return x * vec.getX() + y * vec.getY();
	}

	@Override
	public Vector2D plus(Vector2D vec) {
		return Geometries.vector(x + vec.getX(), y + vec.getY());
	}

	@Override
	public Vector2D minus(Vector2D vec) {
		return Geometries.vector(x - vec.getX(), y - vec.getY());
	}

	@Override
	public String toString() {
		return String.format("Vector2d(x = %s, y = %s)", x, y);
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}
}
