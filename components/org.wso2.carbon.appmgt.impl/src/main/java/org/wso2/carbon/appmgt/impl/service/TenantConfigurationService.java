/*
 *
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   you may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.wso2.carbon.appmgt.impl.service;

import org.wso2.carbon.appmgt.impl.config.TenantConfiguration;

/**
 * Service contract of a tenant specific configuration service.
 */
public interface TenantConfigurationService {

    /**
     * Adds the given tenant configuration to the tenant configurations list.
     * @param tenantConfiguration
     */
    void addTenantConfiguration(TenantConfiguration tenantConfiguration);

    /**
     * Returns the property for the given property name and the current tenant.
     *
     * @param key
     * @return
     */
    Object getProperty(String key);

    /**
     * Returns the property for the given property name and the tenant ID.
     *
     * @param key
     * @param tenantID
     * @return
     */
    Object getProperty(String key, int tenantID);

    /**
     * Returns the property as a string, for the given property name and the current tenant.
     *
     * @param key
     * @return
     */
    String getPropertyAsString(String key);

    /**
     * Returns the property as a string, for the given property name and the tenant ID.
     *
     * @param key
     * @param tenantID
     * @return
     */
    String getPropertyAsString(String key, int tenantID);

}