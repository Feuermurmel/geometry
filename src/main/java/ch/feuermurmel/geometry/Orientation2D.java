package ch.feuermurmel.geometry;

public interface Orientation2D {
	double getX();

	double getY();

	double getAngle();

	Vector2D getPosition();

	Orientation2D moved(Vector2DImpl offset);

	Orientation2D rotated(double angle);
}
