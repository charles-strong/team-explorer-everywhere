// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.build;

public interface IBuildServiceHostQueryResult {
    public IBuildServiceHost[] getServiceHosts();

    public IFailure[] getFailures();
}
