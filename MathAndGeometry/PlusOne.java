package MathAndGeometry;
public class PlusOne{
public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0){
            int[] newArr = new int[digits.length + 1];
            newArr[0] = carry;
            System.arraycopy(digits, 0, newArr, 1, digits.length) ;
            return newArr;
        }
        return digits;
    }
}