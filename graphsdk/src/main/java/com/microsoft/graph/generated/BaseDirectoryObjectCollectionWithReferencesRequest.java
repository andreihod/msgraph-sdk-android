// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Object Collection With References Request.
 */
public class BaseDirectoryObjectCollectionWithReferencesRequest extends BaseCollectionRequest<BaseDirectoryObjectCollectionResponse, IDirectoryObjectCollectionPage> implements IBaseDirectoryObjectCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryObjectCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseDirectoryObjectCollectionResponse.class, IDirectoryObjectCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryObjectCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDirectoryObjectCollectionWithReferencesPage get() throws ClientException {
        final BaseDirectoryObjectCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IDirectoryObjectCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DirectoryObjectCollectionWithReferencesRequest)this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DirectoryObjectCollectionWithReferencesRequest)this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DirectoryObjectCollectionWithReferencesRequest)this;
    }

    public IDirectoryObjectCollectionWithReferencesPage buildFromResponse(final BaseDirectoryObjectCollectionResponse response) {
        final IDirectoryObjectCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryObjectCollectionWithReferencesPage page = new DirectoryObjectCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}