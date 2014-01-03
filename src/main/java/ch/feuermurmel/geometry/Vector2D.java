package ch.feuermurmel.geometry;

public interface Vector2D {
	double getX();

	double getY();

	double getLength();

	double getAngle();

	Vector2D times(double factor);

	Vector2D rotated(double angle);

	Vector2D plus(Vector2D vec);

	Vector2D minus(Vector2D vec);

	double dotProduct(Vector2D vec);
}
