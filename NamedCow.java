class NamedCow extends Cow
{
	private String cowName;
	private String mySound;
	private String myType;
	public NamedCow(String type,String name,String sound )
	{
		cowName = name;
		mySound = sound;
		myType = type;

	}
	public String getName()
	{
		return cowName;
	}
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}