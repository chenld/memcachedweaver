/*
 * Copyright 2011 Kazuhiro Sera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package memcachedweaver.client.impl;

import memcachedweaver.client.MemcachedClient;

public abstract class ClientImplBase implements ClientImpl {

	protected String namespace = MemcachedClient.DEFAULT_NAMESPACE;

	protected String getKey(String key) {
		return (this.namespace + "::" + key).replaceAll("\\s", "_");
	}

	@Override
	public String getNamespace() {
		return namespace;
	}

	@Override
	public void setNamespace(String namespace) {
		if (namespace == null) {
			this.namespace = "default";
		} else {
			this.namespace = namespace;
		}
	}

}
