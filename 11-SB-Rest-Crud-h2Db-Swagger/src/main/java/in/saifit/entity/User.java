package in.saifit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_TBL")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "USER_ID")
	 private Integer uId;
	 
	 @Column(name = "USER_NAME")
	 private String uName;
	 
	 @Column(name = "USER_GENDER")
	 private String uGender;
	 
	 @Column(name = "USER_AGE")
	 private Integer uAge;
	 
	 @Column(name = "USER_LOCATION")
	 private String uLocation;

}
