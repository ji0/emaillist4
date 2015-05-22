package com.sds.icto.emaillist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.sds.icto.emaillist.exception.UserDeleteException;
import com.sds.icto.emaillist.exception.UserInsertException;
import com.sds.icto.emaillist.vo.EmailListVo;


@Repository
public class EmailListDao {
	
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;
	
	public void insert(EmailListVo vo) {
	
		sqlMapClientTemplate.insert("emaillist.insert", vo);
		
	}

	public void delete(Long id) {
	}

	public void delete() {
		
	}

	public List<EmailListVo> fetchList() {
		@SuppressWarnings("unchecked")
		List<EmailListVo> list = sqlMapClientTemplate.queryForList("emaillist.list");
	
		return list;
	}

}
