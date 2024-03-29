package june.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import june.spring.sungjuk.SungJuk;
import june.spring.sungjuk.SungJukDAO;
import june.spring.sungjuk.SungJukService;

@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {
	
	
	
	@Autowired
	private SungJukDAO sdao;


	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("혜교",99,96,76);
		System.out.println("성적 생성됨!");
		
		sdao.insertSungJuk(sj);
	}

}
