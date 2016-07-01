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
 * The interface for the Base Group Request.
 */
public interface IBaseGroupRequest extends IHttpRequest {

    /**
     * Gets the Group from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Group> callback);

    /**
     * Gets the Group from the service
     * @return The Group from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Group get() throws ClientException;

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
     * Patches this Group with a source
     * @param sourceGroup The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Group sourceGroup, final ICallback<Group> callback);

    /**
     * Patches this Group with a source
     * @param sourceGroup The source object with updates
     * @return The updated Group
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Group patch(final Group sourceGroup) throws ClientException;

    /**
     * Posts a Group with a new object
     * @param newGroup The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Group newGroup, final ICallback<Group> callback);

    /**
     * Posts a Group with a new object
     * @param newGroup The new object to create
     * @return The created Group
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Group post(final Group newGroup) throws ClientException;

}
