/*
 * Copyright 2020-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.novatec.micronaut.camunda.bpm.feature.test

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.camunda.bpm.engine.ProcessEngine
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

@MicronautTest
class ProcessEngineFactoryTest {

    @Inject
    lateinit var processEngine: ProcessEngine

    @Test
    fun `processEngine available in ApplicationContext`() {
        assertNotNull(processEngine)
    }

    @Test
    fun `configuration customizer`() {
        assertEquals(MicronautProcessEngineConfigurationCustomizer.PROCESS_ENGINE_NAME, processEngine.name)
    }
}