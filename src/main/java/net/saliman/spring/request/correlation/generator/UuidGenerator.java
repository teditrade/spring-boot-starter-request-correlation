/*
 * Copyright (c) 2017 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.saliman.spring.request.correlation.generator;

import net.saliman.spring.request.correlation.api.CorrelationIdGenerator;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Uses {@link UUID#randomUUID()} for generating new requests ids.
 *
 * @author Jakub Narloch
 */
public class UuidGenerator implements CorrelationIdGenerator {

    /**
     * Generates new request id as random UUID.
     *
     * @return random uuid
     */
    @Override
    public String generateSessionId(HttpServletRequest request) {

        return request.getSession().getId();
    }

    /**
     * Generates new request id as random UUID.
     *
     * @return random uuid
     */
    @Override
    public String generateRequestId(HttpServletRequest request) {

        return UUID.randomUUID().toString();
    }
}
