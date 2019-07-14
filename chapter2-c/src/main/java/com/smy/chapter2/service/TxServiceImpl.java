package com.smy.chapter2.service;

import com.smy.chapter2.dao.ArticleMapper;
import com.smy.chapter2.dao.MUserMapper;
import com.smy.chapter2.model.Article;
import com.smy.chapter2.model.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TxServiceImpl implements TxService{
	@Autowired
	private MUserMapper muserMapper;
	@Autowired
	private ArticleMapper articleMapper;



	@Override
	public int insert(MUser muser, Article article) {

		muserMapper.insert(muser);
		articleMapper.insert(article);

		return 1;
	}
	@Override
    @Transactional()
	public int insertTx(MUser muser, Article article) {

		muserMapper.insert(muser);
		articleMapper.insert(article);

		return 1;
	}

	@Override
	public int update(MUser muser) {
		
		return muserMapper.updateById(muser);
	}

	@Override
	public int delete(String id) {
	
		return muserMapper.deleteByPrimaryKey(id);
	}


}
