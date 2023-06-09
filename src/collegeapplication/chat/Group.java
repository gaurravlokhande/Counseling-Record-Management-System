package collegeapplication.chat;

import java.awt.Image;

/* Made by : Gaurav Lokhande
 * Mail : gaurravlokhande@gmail.com
 * linkedin : https://www.linkedin.com/in/gauravlokhande
 * github : https://github.com/gaurravlokhande
 * Title : Group.java
 * Purpose : To binding all the data related to group
 */
class Group
{
	private Image groupimage;
	private String groupname;
	private int members;
	private String courcecode;
	private int semoryear;
	public void setImage(Image image)
	{
		this.groupimage=image;
	}
	public void setGroupName(String groupname)
	{
		this.groupname=groupname;
	}
	public void setCourceCode(String courcecode)
	{
		this.courcecode=courcecode;
	}
	public void setSem(int semoryear)
	{
		this.semoryear=semoryear;
	}
	public void setMembers(int members)
	{
		this.members=members;
	}
	public Image getImage()
	{
		return groupimage;
	}
	public String getGroupName()
	{
		return groupname;
	}
	public String getCourceCode()
	{
		return courcecode;
	}
	public int getSemorYear()
	{
		return semoryear;
	}
	public int getMembers()
	{
		return members; 
	}
			
}