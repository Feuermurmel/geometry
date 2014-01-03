package ch.feuermurmel.geometry;

final class Vector3DImpl implements Vector3D {
	private final double x;
	private final double y;
	private final double z;

	Vector3DImpl(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
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
	public double getZ() {
		return z;
	}

	@Override
	public double getLength() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	@Override
	public Vector3D times(double factor) {
		return new Vector3DImpl(x * factor, y * factor, z * factor);
	}

	@Override
	public Vector3D plus(Vector3D vec) {
		return new Vector3DImpl(x + vec.getX(), y + vec.getY(), z + vec.getZ());
	}

	@Override
	public Vector3D minus(Vector3D vec) {
		return new Vector3DImpl(x - vec.getX(), y - vec.getY(), z - vec.getZ());
	}

	@Override
	public double dotProduct(Vector3D vec) {
		return x * vec.getX() + y * vec.getY() + z * vec.getZ();
	}

	@Override
	public Vector3D crossProduct(Vector3D vec) {
		return new Vector3DImpl(y * vec.getZ() - z * vec.getY(), z * vec.getX() - x * vec.getZ(), x * vec.getY() - y * vec.getX());
	}
}
