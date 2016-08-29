// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.options.*;

import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Object Check Member Groups Collection Request Builder.
 */
public class BaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryObjectCheckMemberGroupsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final List<String> groupIds) {
        super(requestUrl, client, options);
        mBodyParams.put("groupIds", groupIds);
      }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest(final List<Option> options) {
        DirectoryObjectCheckMemberGroupsCollectionRequest request = new DirectoryObjectCheckMemberGroupsCollectionRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("groupIds")) {
            request.mBody.groupIds = getParameter("groupIds");
        }
  
        return request;
    }
}