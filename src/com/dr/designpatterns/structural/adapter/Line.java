package com.dr.designpatterns.structural.adapter;

public class Line {

	public Point start, end;

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Line line = (Line) o;

		if (!start.equals(line.start))
			return false;
		return end.equals(line.end);
	}

	@Override
	public int hashCode() {
		int result = start.hashCode();
		result = 31 * result + end.hashCode();
		return result;
	}

}
