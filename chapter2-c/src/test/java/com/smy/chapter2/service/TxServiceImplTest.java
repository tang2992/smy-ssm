package com.smy.chapter2.service;

import com.smy.chapter2.model.Article;
import com.smy.chapter2.model.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;
import java.util.UUID;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TxServiceImplTest {
    @Autowired
    private TxService txService;

    @Test
    public void insert() {
        MUser mUser = new MUser();
        mUser.setId(UUID.randomUUID().toString());
        mUser.setName("测试");
        Article article = new Article();
//        article.setId(11);
        article.setAuthorId(1);
        article.setTitle("测试");
        txService.insert(mUser, article);
    }

    @Test
    public void insert2() {
        MUser mUser = new MUser();
        mUser.setId(UUID.randomUUID().toString());
        mUser.setName("测试");
        Article article = new Article();
        article.setAuthorId(1);
        article.setTitle("测试");
        txService.insertTx(mUser, article);
    }
}
