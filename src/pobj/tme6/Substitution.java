package pobj.tme6;

public class Substitution {
	
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
	}

}
