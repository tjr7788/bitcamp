package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BookDao;
import java100.app.domain.Book;
import java100.app.service.BookService;


@Service
public class BookServiceImpl implements BookService {
	
	@Autowired BookDao bookDao;
	
	@Override
	public List<Book> list(int pageNo, int pageSize, Map<String, Object> options) {
		HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
		return bookDao.findAll(params);
	}

	@Override
	public Book get(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCount() {
		return bookDao.countAll();
	}
	
}
