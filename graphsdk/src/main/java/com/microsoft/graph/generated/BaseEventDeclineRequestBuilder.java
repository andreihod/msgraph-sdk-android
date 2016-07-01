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
 * The class for the Base Event Decline Request Builder.
 */
public class BaseEventDeclineRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this EventDecline
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventDeclineRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, options);
        mBodyParams.put("comment", comment);
          mBodyParams.put("sendResponse", sendResponse);
      }

    /**
     * Creates the IEventDeclineRequest
     *
     * @return The IEventDeclineRequest instance
     */
    public IEventDeclineRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventDeclineRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IEventDeclineRequest instance
     */
    public IEventDeclineRequest buildRequest(final List<Option> options) {
        EventDeclineRequest request = new EventDeclineRequest(
            getRequestUrl(), 
            getClient(), 
            options
        );

        if (hasParameter("comment")) {
            request.mBody.comment = getParameter("comment");
        }
          if (hasParameter("sendResponse")) {
            request.mBody.sendResponse = getParameter("sendResponse");
        }
  
      return request;
    }
}
