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
 * The class for the Base Mail Folder Request Builder.
 */
public class BaseMailFolderRequestBuilder extends BaseRequestBuilder implements IBaseMailFolderRequestBuilder {

    /**
     * The request builder for the MailFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseMailFolderRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IMailFolderRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IMailFolderRequest buildRequest(final List<Option> options) {
        return new MailFolderRequest(getRequestUrl(), getClient(), options);
    }

    public IMessageCollectionRequestBuilder getMessages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    public IMessageRequestBuilder getMessages(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    public IMailFolderCollectionRequestBuilder getChildFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders"), getClient(), null);
    }

    public IMailFolderRequestBuilder getChildFolders(final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders") + "/" + id, getClient(), null);
    }

    public IMailFolderCopyRequestBuilder getCopy(final String destinationId) {
        return new MailFolderCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, destinationId);
    }

    public IMailFolderMoveRequestBuilder getMove(final String destinationId) {
        return new MailFolderMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, destinationId);
    }
}
