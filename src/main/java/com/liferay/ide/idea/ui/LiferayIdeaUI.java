/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ide.idea.ui;

import java.io.File;

/**
 * @author Gregory Amerson
 */
public class LiferayIdeaUI {

	public static final File USER_BUNDLES_DIR = new File(
		new File(System.getProperty("user.home"), ".liferay-ide"), "bundles");

	public static final File USER_TEMP_DIR = new File(System.getProperty("user.home"), ".liferay-ide");

	static {
		USER_TEMP_DIR.mkdirs();
		USER_BUNDLES_DIR.mkdirs();
	}

}