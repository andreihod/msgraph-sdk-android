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
 * The class for the Base Conversation Thread Reply Request Builder.
 */
public class BaseConversationThreadReplyRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this ConversationThreadReply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseConversationThreadReplyRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final Post post) {
        super(requestUrl, client, options);
        mBodyParams.put("post", post);
      }

    /**
     * Creates the IConversationThreadReplyRequest
     *
     * @return The IConversationThreadReplyRequest instance
     */
    public IConversationThreadReplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IConversationThreadReplyRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IConversationThreadReplyRequest instance
     */
    public IConversationThreadReplyRequest buildRequest(final List<Option> options) {
        ConversationThreadReplyRequest request = new ConversationThreadReplyRequest(
            getRequestUrl(), 
            getClient(), 
            options
        );

        if (hasParameter("post")) {
            request.mBody.post = getParameter("post");
        }
  
      return request;
    }
}
