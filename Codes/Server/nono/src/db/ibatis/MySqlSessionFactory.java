package db.ibatis;

import java.io.IOException;
import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {

	public static final String DB_RESOURCE = "MapperConfig.xml";

	private static SqlSession sqlSession;

	public static SqlSession getSqlSession() throws IOException {
		if (sqlSession == null) {
			initDB();
		}
		return sqlSession;
	}

	public static void initDB() throws IOException {
		Reader reader = Resources.getResourceAsReader(DB_RESOURCE);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		sqlSession = sqlMapper.openSession();
	}


}
