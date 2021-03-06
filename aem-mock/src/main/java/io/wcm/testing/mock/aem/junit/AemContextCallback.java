/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2014 wcm.io
 * %%
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
 * #L%
 */
package io.wcm.testing.mock.aem.junit;

import java.io.IOException;

import org.apache.sling.api.resource.PersistenceException;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * Callback-interface for application-specific setup and teardown operations to customize the {@link AemContext} JUnit
 * rule.
 */
@ConsumerType
public interface AemContextCallback {

  /**
   * Execute callback action
   * @param context AEM context
   * @throws IOException I/O exception
   * @throws PersistenceException Persistence exception
   */
  void execute(AemContext context) throws IOException, PersistenceException;

}
