package pobj.tme6;

public class Substitution {
	
<<<<<<< HEAD
	public static class SubTurtle extends SaveTurtle {
		
		private ICommand subst;
		
		public SubTurtle(ICommand subst) {
			super();
			this.subst = subst;
		}
		
		public void move(int length) {
			this.getCommand().addCommand(subst);
		}
		
	}
	
	public static ICommand substitute(ICommand org, ICommand subst) {
		SubTurtle st = new SubTurtle(subst);
		org.execute(st);
		return st.getCommand();
=======
	public static ICommand substitute(ICommand org, ICommand subst) {
		
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
	}

}
