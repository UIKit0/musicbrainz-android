package org.musicbrainz.android.api.data;

/**
 * Record label stub for search results.
 */
public class LabelSearchStub {
	
	private String mbid;
	private String name;
	private String country;
	
	public String getMbid() {
		return mbid;
	}
	
	public void setMbid(String mbid) {
		this.mbid = mbid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

}
