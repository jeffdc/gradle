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

package org.gradle.api.internal.artifacts.resolutioncache;

import java.io.File;
import java.util.Date;

public interface CachedArtifactResolution {

    /**
     * A “missing” resolution is a record of the fact that
     *
     * @return whether this is a “missing” resolution or not.
     */
    boolean isMissing();

    /**
     * The file in the persistent file store.
     *
     * Will be null if this is a “missing” resolution. Will never be null
     * if this is not a “missing” resolution.
     *
     * @return The file in the persistent file store.
     */
    File getArtifactFile();

    /**
     * How long ago this resolution was cached
     *
     * @return How long ago this resolution was cached
     */
    long getAgeMillis();

    /**
     * The last modified date that the artifact advertised when we cached it.
     *
     * Will be null if this is a “missing” resolution.
     *
     * @return The last modified date, or null if it was unknown.
     */
    Date getArtifactLastModified();

    /**
     * The URL that the artifact advertised when we cached it.
     *
     * Will be null if this is a “missing” resolution.
     *
     * @return The URL, or null if it was unknown.
     */
    String getArtifactUrl();

}