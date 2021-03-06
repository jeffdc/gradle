/*
 * Copyright 2012 the original author or authors.
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

package org.gradle.api.artifacts.result;

import org.gradle.api.Incubating;

/**
 * Answers the question why given module version was selected during the dependency resolution
 */
@Incubating
public interface ModuleVersionSelectionReason {

    /**
     * Informs whether the module was forced.
     * Users can force modules via {@link org.gradle.api.artifacts.ResolutionStrategy}
     * or when declaring dependencies (see {@link org.gradle.api.artifacts.dsl.DependencyHandler}).
     */
    boolean isForced();

    /**
     * Informs whether the module was selected by conflict resolution.
     * For more information about Gradle's conflict resolution please refer to the user
     * guide. {@link org.gradle.api.artifacts.ResolutionStrategy} contains information
     * about conflict resolution and includes means to configure it.
     */
    boolean isConflictResolution();

    /**
     * Describes this selection reason.
     */
    String getDescription();

    //TODO At some point we want to provide information if version was requested in the graph.
    //Perhaps a method like isRequested(). Not requested means that some particular version was forced but no dependency have requested this version.
}
