/*
 * Copyright 2018 Murat Artim (muratartim@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.afm_wiki.data;

import java.io.Serializable;

/**
 * Interface for download info.
 *
 * @author Murat Artim
 * @date Feb 12, 2016
 * @time 4:14:09 PM
 */
public interface DownloadInfo extends Serializable {

	/**
	 * Returns the ID of item.
	 *
	 * @return The ID of item.
	 */
	int getID();
}
