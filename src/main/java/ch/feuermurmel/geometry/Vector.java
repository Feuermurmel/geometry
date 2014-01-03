package ch.feuermurmel.geometry;

public interface Vector<V> {
	double getLength();

	V times(double factor);

	V plus(V vec);

	V minus(V vec);

	V normalized();
}
