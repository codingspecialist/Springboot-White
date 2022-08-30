package site.metacoding.white;

import org.junit.jupiter.api.Test;

import site.metacoding.white.domain.Third;

public class ParseTest {

	@Test
	public void parse_test() {
		String data = "title=spring&content=enjoyspring&id=1";
		
		String[] p1 = data.split("&");
		System.out.println(p1.length);
		
		System.out.println(p1[0]);
		System.out.println(p1[1]);
		System.out.println(p1[2]);
		
		Integer id =  Integer.parseInt(p1[2].split("=")[1]);
		String title = p1[0].split("=")[1];
		String content = p1[1].split("=")[1];
				
		Third third = new Third();
		third.setTitle(title);
		third.setContent(content);
		
		System.out.println(third.getTitle());
		System.out.println(third.getContent());
	}
}
