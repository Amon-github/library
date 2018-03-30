package com.amon.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.amon.model.BookType;
import com.amon.util.StringUtil;

/**
* @author Amon E-mail:248779716@qq.com
* @version ����ʱ�䣺2018��3��29�� ����7:32:30
* ͼ�����DAO
*/
public class BookTypeDao {
	
	/**
	 * ����ͼ������
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	public int add(Connection con,BookType bookType) throws Exception{
		String sql="insert into t_booktype values (?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sql);
		pstm.setInt(1, bookType.getId());
		pstm.setString(2, bookType.getTypeName());
		pstm.setString(3, bookType.getTypeDesc());
		int result=pstm.executeUpdate();

		return result;
	}
	
	/**
	 * ��ѯͼ����𼯺�
	 * @param con
	 * @param bookType
	 * @return	���ز�ѯ�������ݼ���
	 * @throws Exception
	 */
	public ResultSet list(Connection con,BookType bookType) throws Exception{
		StringBuffer sBuffer=new StringBuffer("select * from t_booktype");
		if (StringUtil.isNotEmpty(bookType.getTypeName())) {
			sBuffer.append("and bookTypeName like '%"+bookType.getTypeName()+"'%");
		}
		String sql=sBuffer.toString().replaceFirst("and", "where");	//����һ����and���滻Ϊ��where��
		PreparedStatement pstm=con.prepareStatement(sql);
		ResultSet resultSet=pstm.executeQuery();	//��ò�ѯ���Ľ����
		return resultSet;
	}
	
	/**
	 * �h��ͼ�����
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	public int delete(Connection con,BookType bookType) throws Exception{
		String sql="delete * from t_booktype where bookTypeName like '%"+bookType.getTypeName()+"'%";
		PreparedStatement pstm=con.prepareStatement(sql);
		int result=pstm.executeUpdate();
	
		return result;
	}
	
	
	
	
	

}