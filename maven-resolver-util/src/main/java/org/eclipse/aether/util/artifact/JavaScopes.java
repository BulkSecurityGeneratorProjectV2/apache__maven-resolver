/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.eclipse.aether.util.artifact;

/**
 * The dependency scopes used for Java dependencies.
 *
 * @see org.eclipse.aether.graph.Dependency#getScope()
 *
 * @deprecated Definition and semantics of the scopes should be defined by consumer project. Resolver out-of-the-box
 * supported scopes are defined in {@link Scopes} class. Resolver is oblivious about any other scopes and their
 * semantics.
 */
@Deprecated
public final class JavaScopes {

    public static final String COMPILE = "compile";

    public static final String PROVIDED = "provided";

    public static final String SYSTEM = Scopes.SYSTEM;

    public static final String RUNTIME = "runtime";

    public static final String TEST = "test";

    private JavaScopes() {
        // hide constructor
    }
}
