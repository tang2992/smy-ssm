package com.smy.chapter2.service;

import com.smy.chapter2.dao.MUserMapper;
import com.smy.chapter2.model.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("muserService")
public class MUserServiceImpl implements MUserServiceI{

	private MUserMapper muserMapper;
		
	public MUserMapper getMuserMapper() {
		return muserMapper;
	}

	@Autowired
	public void setMuserMapper(MUserMapper muserMapper) {
		this.muserMapper = muserMapper;
	}
	
	@Override
	public List<MUser> getAll() {
		
		return muserMapper.selectList(null);
	}

	@Override
	public int insert(MUser muser) {
		
		return muserMapper.insertSelective(muser);
	}

	@Override
	public int update(MUser muser) {
		
		return muserMapper.updateById(muser);
	}

	@Override
	public int delete(String id) {
	
		return muserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public MUser selectByPrimaryKey(String id) {
		
		return muserMapper.selectByPrimaryKey(id);
	}

}
