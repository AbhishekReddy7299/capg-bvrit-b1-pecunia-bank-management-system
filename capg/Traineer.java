package com.capg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("trainer")
public class Traineer {
	 	  @Value("${trainer.name}")
		private String Tname;
	 	 @Value("${trainer.expertise}")
		private String expertise;
		 
		public String getTname() {
			return Tname;
		}
		public void setTname(String tname) {
			Tname = tname;
		}
		public String getExpertise() {
			return expertise;
		}
		public void setExpertise(String expertise) {
			this.expertise = expertise;
		}
		 

}
