package org.store.domain;

public class Store {

	private String name;
	private double lat;
	private double lng;
	
	public Store(String name, double lat, double lng) {
		super();
		this.name = name;
		this.lat = lat;
		this.lng = lng;
	}
	public String getName() {
		return name;
	}
	public double getLat() {
		return lat;
	}
	public double getLng() {
		return lng;
	}
	@Override
	public String toString() {
		return "Store [name=" + name + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
}
