package arraysprograms;

public class SecondRepeated {

	public static void main(String[] args) {
        int array[] = {25, 27, 25, 27, 26, 27};
        int maxc = 1, smaxc = 1, element1 = array[0], element2 = array[0];

        for (int i = 0; i < array.length; i++) {
           int count = 1; 

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (maxc < count ) {
                smaxc = maxc;
                maxc = count;
                element2 = element1;
                element1 = array[i];
            } 
        }
        System.out.println("second most repeated element.."+element2+"repeated time"+smaxc);
	}

}
