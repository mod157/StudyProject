package Coffee;

public class Menu {
	private MenuItem menunames[];
	public Menu(MenuItem menunames_[])
	{
		menunames = menunames_;
	}
	public MenuItem choose(String menuname){
		for(int i=0;i<menunames.length;i++){
			if(this.menunames[i].equals(menuname))
			{
				return menunames[i];
			}
		}
		return null;
	}
}
