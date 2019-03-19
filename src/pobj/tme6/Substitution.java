package pobj.tme6;

public class Substitution {
	
	public static ICommand substitute(ICommand org, ICommand subst) {
		SubstTurtle st = new SubstTurtle(subst);
		org.execute(st);
		return st.getCommand();
	}
	
	public static class SubstTurtle extends SaveTurtle {
		
		private ICommand subst;
		
		public SubstTurtle(ICommand subst) {
			super();
			this.subst = subst;
		}
		
		public void move(int length) {
			this.getCommand().addCommand(subst);
		}
		
	}

}
