//classe adicional, para incorporar a própria cotação interna.
package com.example.consumingrest.demo.com.example.consumingrest.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	private Long id;
	private String quote;	
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Value() {
		super();
	}

	@Override
	  public String toString() {
	    return "Value{" +
	        "id=" + id +
	        ", quote='" + quote + '\'' +
	        '}';
	  }
}
