package ch.feuermurmel.geometry;

public interface Vector3D extends Vector<Vector3D> {
	double getX();

	double getY();

	double getZ();

	double dotProduct(Vector3D vec);

	Vector3D crossProduct(Vector3D vec);
}
