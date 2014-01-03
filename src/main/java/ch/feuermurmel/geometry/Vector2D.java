package ch.feuermurmel.geometry;

public interface Vector2D extends Vector<Vector2D> {
	double getX();

	double getY();

	double getAngle();

	Vector2D rotated(double angle);

	double dotProduct(Vector2D vec);
}
