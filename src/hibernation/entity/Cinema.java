package hibernation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cinema")
public class Cinema {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String releaseDate;
	private String star;

	public Cinema(String title, String releaseDate, String star) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.star = star;
	}

}
