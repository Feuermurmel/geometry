package ch.feuermurmel.geometry;

public class Geometries {
	private Geometries() {
	}

	public static final Vector2D zero2D = vector(0, 0);
	public static final Vector3D zero3D = vector(0, 0, 0);

	public static Orientation2D orientation(double x, double y, double angle) {
		return new Orientation2DImpl(x, y, angle);
	}

	public static Orientation2D orientation(Vector2D position, double angle) {
		return orientation(position.getX(), position.getY(), angle);
	}

	public static Orientation2D orientationAtOrigin(double angle) {
		return orientation(zero2D, angle);
	}

	public static Vector2D vector(double x, double y) {
		return new Vector2DImpl(x, y);
	}

	public static Vector3D vector(double x, double y, double z) {
		return new Vector3DImpl(x, y, z);
	}

	public static Vector2D vectorFromAngle(double angle) {
		return vector(Math.cos(angle), Math.sin(angle));
	}

	public static Vector2D vectorFromAngle(double angle, double length) {
		return vector(Math.cos(angle) * length, Math.sin(angle) * length);
	}
}
