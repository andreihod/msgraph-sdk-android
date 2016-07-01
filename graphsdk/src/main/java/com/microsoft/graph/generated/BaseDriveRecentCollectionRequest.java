// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base Drive Recent Collection Request.
 */
public class BaseDriveRecentCollectionRequest extends BaseCollectionRequest<BaseDriveRecentCollectionResponse, IDriveRecentCollectionPage> implements IBaseDriveRecentCollectionRequest {


    /**
     * The request for this DriveRecent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveRecentCollectionRequest(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseDriveRecentCollectionResponse.class, IDriveRecentCollectionPage.class);
    }


    public void get(final ICallback<IDriveRecentCollectionPage> callback) {
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

    public IDriveRecentCollectionPage get() throws ClientException {
        final BaseDriveRecentCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IDriveRecentCollectionPage buildFromResponse(final BaseDriveRecentCollectionResponse response) {
        final IDriveRecentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveRecentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IDriveRecentCollectionPage page = new DriveRecentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveRecentCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IDriveRecentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveRecentCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IDriveRecentCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveRecentCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IDriveRecentCollectionRequest)this;
    }

}
