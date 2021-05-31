package june.spring.annotation;

import org.springframework.stereotype.Repository;

import june.spring.sungjuk.SungJuk;
import june.spring.sungjuk.SungJukDAO;


@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");
	}

	}


