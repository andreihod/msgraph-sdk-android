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
 * The class for the Base User With Reference Request.
 */
public class BaseUserWithReferenceRequest extends BaseRequest implements IBaseUserWithReferenceRequest {

    /**
     * The request for the User
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseUserWithReferenceRequest(String requestUrl, IBaseClient client, List<Option> options) {
        super(requestUrl, client, options, User.class);
    }

    public void post(final User newUser, final IJsonBackedObject payload, final ICallback<User> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public User post(final User newUser, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newUser;
        }
        return null;
    }

    public void get(final ICallback<User> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public User get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

}
