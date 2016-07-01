// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Subscribed Sku Collection Request Builder.
 */
public class SubscribedSkuCollectionRequestBuilder extends BaseSubscribedSkuCollectionRequestBuilder implements ISubscribedSkuCollectionRequestBuilder {

    /**
     * The request builder for this collection of SubscribedSku
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public SubscribedSkuCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }
}
