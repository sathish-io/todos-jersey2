/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.samples.application;


import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.stormpath.samples.todos.controller.TodoController;
import com.stormpath.samples.todos.jersey.DefaultExceptionMapper;
import com.stormpath.samples.todos.jersey.ObjectMapperProvider;

/**
 * {@link javax.ws.rs.core.Application} descendant.
 *
 * Used to set resource and providers classes.
 *
 * @author Sathishkumar Kandasamy
 */
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        super(
                TodoController.class,
                // register Jackson ObjectMapper resolver
                ObjectMapperProvider.class,
                DefaultExceptionMapper.class,
                JacksonFeature.class
        );
    }
}