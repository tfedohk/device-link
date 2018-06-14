/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @microservice:  device-sdk-tools
 * @author: Tyler Cox, Dell
 * @version: 1.0.0
 *******************************************************************************/
package org.edgexfoundry.device.virtual.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScanList {
	private List<Map<String,String>> scan = new ArrayList<>();

	public List<Map<String,String>> getScan() {
		return scan;
	}

	public void setScan(List<Map<String,String>> scan) {
		this.scan = scan;
	}
	
	public void add(Map<String,String> device) {
		scan.add(device);
	}

}
