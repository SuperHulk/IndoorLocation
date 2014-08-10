package test;

import java.io.IOException;
import java.math.BigDecimal;

import module.TStore;
import module.TStoreIbeacons;

import org.apache.ibatis.session.SqlSession;

import dao.TStoreIbeaconsMapper;
import dao.TStoreMapper;
import db.ibatis.MySqlSessionFactory;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession sqlSession = MySqlSessionFactory.getSqlSession();
		//addstore( sqlSession);
		addstoreibeacons(sqlSession);
	}

	private static void addstore(SqlSession sqlSession) {
		TStoreMapper tsmapper = sqlSession.getMapper(TStoreMapper.class);
		TStore ts = new TStore();
		ts.setAddress("xxxx号店");
		ts.setDescription("一个测试的店铺");
		ts.setFloor("003");
		ts.setLocation("30,40");
		ts.setLogo("\\xxxxxxx.jpg");
		ts.setStorename("宋哥的店");
		ts.setStoreno("000000000000001");
		tsmapper.insert(ts);
		sqlSession.commit();
	}

	private static void addstoreibeacons(SqlSession sqlSession) {
		TStoreIbeaconsMapper tsimapper = sqlSession
				.getMapper(TStoreIbeaconsMapper.class);
		TStoreIbeacons tsi = new TStoreIbeacons();

		tsi.setStoreno("000000000000001");
		tsi.setIbeaconid("abcde");
		tsimapper.insert(tsi);
		sqlSession.commit();
	}
}
