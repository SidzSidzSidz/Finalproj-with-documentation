/**
 * the overall checking algo for all the accounts 
 */
public class Check{
	int b;
	/**
	 * checks the name,password, and subject inputs if it is part of the teachers accounts
	 * @return		return to the login part for the teacher
	 */
	public boolean checkteacherName(String [][] list, String name){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkteacherPass(String[][]list, String pass){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 1;
			String ctr = list[a][b];
			if(ctr.equals(pass)){
				return true;
			}
		}
		return false;
	}
			
	
	public boolean checkteacherSubj(String[][]list, String subj){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 2;
			String ctr = list[a][b];
			if(ctr.equals(subj)){
				return true;
			}
		}
		return false;
	}
	/**
	 * checks the name, password inputs if it is part of the students accounts
	 * @return		return to the login part for the student
	 */
	public boolean checkstudentName(String [][] list, String name){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkstudentPass(String[][]list, String pass){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 1;
			String ctr = list[a][b];
			if(ctr.equals(pass)){
				return true;
			}
		}
		return false;
	}
	/**
	 * checks the number of student accounts which limited to 50 student accounts
	 * @return		return to the lists of students accounts
	 */
	public int studentNumber(String [][] list, String name){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return a;
			}
		}
		return 0;
	}
	/**
	 * checks the number of teacher accounts which is limited to only 10
	 * @return		return to the lists of students
	 */
	public int teacherNumber(String [][] list, String name){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return a;
			}
		}
		return 0;
	}
	
}