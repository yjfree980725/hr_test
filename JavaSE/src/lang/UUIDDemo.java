package lang;

import java.util.UUID;

/**
 * ²úÉúËæ»ú×Ö·û´®
 */

public class UUIDDemo {

	public static void main(String[] args) {
		String str = UUID.randomUUID().toString();
		String str1 = UUID.randomUUID().toString().replace("-", "");
		System.out.println(str);
		System.out.println(str1);
	}

}
