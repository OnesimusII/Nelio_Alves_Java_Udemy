package secao18_interfaces.problemaComInterface.entities;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarRental
{
	private LocalDateTime start;
	private LocalDateTime finish;
	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle)
	{
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
}
