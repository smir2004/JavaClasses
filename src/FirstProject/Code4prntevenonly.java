package FirstProject;

public class Code4prntevenonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1,2,4,6,9,11,13,21,55,66 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
        }
	}

}
