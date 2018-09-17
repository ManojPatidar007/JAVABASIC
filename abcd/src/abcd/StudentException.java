package abcd;

enum StudentException{
	STUSENT_NOT_FOUND,
	PASS,
	FAIL,
	STUDENT_OUT_OF_ORDER;
	
	public static boolean isPassed(StudentException ex){
		if(ex==PASS)
			return true;
		else
		return false;
		
	}
	
	public static StudentException setPassed(StudentDao dao){
		if(dao.marks>33){
			return StudentException.PASS;
		}
		else {
			return StudentException.FAIL;
		}
		
	}

}
