package ch.feuermurmel.geometry;

abstract class AbstractVector<V> implements Vector<V> {
	@Override
	public final V normalized() {
		return times(1 / getLength());
	}
}
