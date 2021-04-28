package com.green.jdevd010.CoffeeMintClient.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import TaiKhoanRepository.java.Model.TaiKhoan;

public interface TaiKhoanRepository extends CrudRepository<TaiKhoan, String>{
	@Query("SELECT u FROM TaiKhoan WHERE u.username = :username")
	public TaiKhoan getTaiKhoanUserName(@Param("username") String username);
}
