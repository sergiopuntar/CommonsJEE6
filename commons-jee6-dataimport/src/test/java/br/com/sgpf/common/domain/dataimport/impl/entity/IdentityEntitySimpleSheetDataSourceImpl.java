/*
 * Copyright (c) 2017 Sergio Gonçalves Puntar Filho
 * 
 * This program is made available under the terms of the MIT License.
 * See the LICENSE file for details.
 */
package br.com.sgpf.common.domain.dataimport.impl.entity;

import java.io.File;
import java.io.InputStream;

import br.com.sgpf.common.domain.dataimport.exception.DataSourceDocumentException;
import br.com.sgpf.common.domain.dataimport.impl.entity.IdentityEntitySimpleSheetDataSource;
import br.com.sgpf.common.domain.entity.AbstractIdentityEntityImpl;

public class IdentityEntitySimpleSheetDataSourceImpl extends IdentityEntitySimpleSheetDataSource<AbstractIdentityEntityImpl> {
	private static final long serialVersionUID = 1L;

	public IdentityEntitySimpleSheetDataSourceImpl(File file, int sheetId) throws DataSourceDocumentException {
		super(file, sheetId);
	}

	public IdentityEntitySimpleSheetDataSourceImpl(InputStream is, int sheetId) {
		super(is, sheetId);
	}

	@Override
	protected AbstractIdentityEntityImpl createEntityInstance() {
		return new AbstractIdentityEntityImpl();
	}

	@Override
	protected boolean writeItemData(Integer rowIndex, AbstractIdentityEntityImpl data) {
		return false;
	}
}