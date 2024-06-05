package secao19_generics_set_map.exercicioResolvido.entities;

import java.time.Instant;
import java.util.Objects;

public class Access
{
	private String user;
	private Instant date;

	public Access(String user, Instant date)
	{
		this.user = user;
		this.date = date;
	}

	public String getUser()
	{
		return user;
	}

	public Instant getDate()
	{
		return date;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		Access access = (Access) o;
		return Objects.equals(user, access.user);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(user);
	}
}
