package com.apap.tugas1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tugas1.model.ProvinsiModel;

/**
 * ProvinsiDb
 * @author Stanley Sebastian
 */

@Repository
public interface ProvinsiDb extends JpaRepository<ProvinsiModel, Long>{
	List<ProvinsiModel> findByNama(String nama);
}
