// 7. OTPGenerator: Generate a six-digit OTP 10 times and ensure all OTPs are unique.
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    // Generate a 6-digit OTP.
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    
    public static void main(String[] args) {
        int count = 10;
        int[] otps = new int[count];
        Set<Integer> otpSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
            otpSet.add(otps[i]);
        }
        System.out.print("Generated OTPs: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();
        System.out.println("Are all OTPs unique? " + (otpSet.size() == count));
    }
}
