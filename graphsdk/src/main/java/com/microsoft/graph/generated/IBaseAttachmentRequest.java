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
 * The interface for the Base Attachment Request.
 */
public interface IBaseAttachmentRequest extends IHttpRequest {

    /**
     * Gets the Attachment from the service
     * @param callback The callback to be called after success or failure.
     */
    void getAttachment(final ICallback<Attachment> callback);

    /**
     * Gets the Attachment from the service
     * @return The Attachment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Attachment getAttachment() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Attachment with a source
     * @param sourceAttachment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Attachment sourceAttachment, final ICallback<Attachment> callback);

    /**
     * Patches this Attachment with a source
     * @param sourceAttachment The source object with updates
     * @return The updated Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Attachment patch(final Attachment sourceAttachment) throws ClientException;

    /**
     * Posts a Attachment with a new object
     * @param newAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Attachment newAttachment, final ICallback<Attachment> callback);

    /**
     * Posts a Attachment with a new object
     * @param newAttachment The new object to create
     * @return The created Attachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Attachment post(final Attachment newAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseAttachmentRequest expand(final String value);

}
