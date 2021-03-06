package com.wedsitefim.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wedsitefim.model.FimModel;

public class FimMapper implements Rowmapper<FimModel>{

	@Override
	public FimModel mapRow(ResultSet resultSet) {
		try {
			FimModel fims = new FimModel();
			fims.setId(resultSet.getLong("id"));
			fims.setTenFim(resultSet.getString("tenFim"));
			fims.setFileFim(resultSet.getString("fileFim"));
			fims.setFileTrailer(resultSet.getString("fileTrailer"));
			fims.setPoster(resultSet.getString("poster"));
			fims.setTheloaiId(resultSet.getLong("theloaiId"));
			fims.setDanhmucId(resultSet.getLong("danhmucId"));
			fims.setDienvien(resultSet.getString("dienvien"));
			fims.setFimday(resultSet.getString("fimday"));
			fims.setSotap(resultSet.getLong("sotap"));
			fims.setQuocgia(resultSet.getString("quocgia"));
			fims.setNoidung(resultSet.getString("noidung"));
			return fims;
		} catch (SQLException e) {
			return null;
		}
	}

}
