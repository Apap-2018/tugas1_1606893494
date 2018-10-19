package com.apap.tugas1.service;

import java.util.List;
import java.util.Optional;

import com.apap.tugas1.model.ProvinsiModel;

/**
 * ProvinsiService
 * @author Stanley Sebastian
 */

public interface ProvinsiService {
	void addProvinsi(ProvinsiModel provinsi);
	
	Optional<ProvinsiModel> getProvinsiById(Long id);

	List<ProvinsiModel> getAllProvinsi();

	ProvinsiModel getProvinsiByName(String nama);
}
