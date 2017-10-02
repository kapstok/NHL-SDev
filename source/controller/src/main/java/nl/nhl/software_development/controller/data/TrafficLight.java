package nl.nhl.software_development.controller.data;

public class TrafficLight
{
	enum LightStatus
	{
		RED, ORANGE, GREEN
	}

	public int id;
	public LightStatus lightStatus;
}
