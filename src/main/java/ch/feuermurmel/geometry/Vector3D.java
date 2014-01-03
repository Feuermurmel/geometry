package ch.feuermurmel.geometry;

public interface Vector3D {
	double getX();

	double getY();

	double getZ();

	double getLength();

	Vector3D times(double factor);

	Vector3D plus(Vector3D vec);

	Vector3D minus(Vector3D vec);

	double dotProduct(Vector3D vec);

	Vector3D crossProduct(Vector3D vec);
}
