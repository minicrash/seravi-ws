package com.seraviws.service;

import java.util.List;

public interface ServiceBase<E> {

	public List<E> findAll() throws Exception;
}
