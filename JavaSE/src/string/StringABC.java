package string;


/**
   *  �˶��뽫��ĸ˳�򷴹����ȵ���ĸһ����˫��ĸһ��
 */
public class StringABC {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean  flag = true;
		// �ַ����������
		String str = "dfjjvgjstknjidhiohhisgveiffajkcvduchrkgywidbdixbdicgdhsydieoegexbbdifwidifgwpfnfhcyisvsfsyfodlpfdhgeifmevdufkeedwpjwicudfskfiehfjgeifbekfpdjgdufkevfifovdiepghekpfhwlgibeifidbegdibfveugielwhfhfohwhdocjvshdiwi";
		
		// ����һ���յ�StringBuilder
		StringBuilder builder = new StringBuilder();// ׷���ַ���

		builder.append(str);
		// �Ӻ���ǰ����ո�
		int i=builder.length()-1;
		builder.insert(i, ' ');
		while(i>3){
			i = i-2;
			builder.insert(i, ' ');
			i=i-1;
			builder.insert(i, ' ');
		}
		
			/*for (int i=builder.length()-1;i>0;i--) {
				// ָ��λ�ò��붺��
				builder.insert(i, ',');
				if(flag==true){
					builder.insert(i, ',');
				}
				System.out.println(builder.length());
			}*/
		// ��StringBuilder����ת��ΪString�������
		builder.reverse();
		System.out.println(builder.toString());
	}
}
