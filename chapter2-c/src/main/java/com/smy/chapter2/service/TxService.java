package com.smy.chapter2.service;



import com.smy.chapter2.model.Article;
import com.smy.chapter2.model.MUser;

import java.util.List;

public interface TxService {
	
    int insert(MUser muser, Article article);

    int insertTx(MUser muser, Article article);

    int update(MUser muser);
    
    int delete(String id);
}
