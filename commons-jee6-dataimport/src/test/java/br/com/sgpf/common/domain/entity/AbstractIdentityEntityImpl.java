package br.com.sgpf.common.domain.entity;

import java.util.Date;

import br.com.sgpf.common.domain.entity.AbstractIdentityEntity;

public class AbstractIdentityEntityImpl extends AbstractIdentityEntity {
	private static final long serialVersionUID = 1L;
	
	public AbstractIdentityEntityImpl() {
		super();
	}
	
	public AbstractIdentityEntityImpl(Long id, Date creationDate, Date updateDate, Long versao) {
		this();
		setId(id);
		setCreationDate(creationDate);
		setUpdateDate(updateDate);
		setVersion(versao);
	}

	@Override
	public boolean canEqual(Object obj) {
		return obj instanceof AbstractIdentityEntityImpl;
	}
}