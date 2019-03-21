/**
 * The adding of teacher feature which only maximum is 10 teachers
 */
public class AddTeacher{
	int a = 0, column = 3;
	/**
	 * The array dimension of the teacher's list which only 10 teachers can only be accompanied
	 */
	String [][] list = new String [10][3];
	/**
	 * 3 represents the teachers variables which are name, password, and the subject the teacher is teaching
	 * @param name   the string which adds the name in the array list
	 * @param pass	 the string which adds the password in the array lsit
	 * @param subj 	 the string which adds the subject in the array list
	 */
	public String [][] addTeacher(String name, String pass, String subj){
		list[a][0] = name;
		list[a][1] = pass;
		list[a][2] = subj;
		a++;
		return list;
	}
}
		
		
		
		