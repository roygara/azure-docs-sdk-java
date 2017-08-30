/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.microsoft.azure.keyvault.SecretIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The secret item containing secret metadata.
 */
public class SecretItem {
    /**
     * Secret identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The secret management attributes.
     */
    @JsonProperty(value = "attributes")
    private SecretAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Type of the secret value such as a password.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * True if the secret's lifetime is managed by key vault. If this is a key
     * backing a certificate, then managed will be true.
     */
    @JsonProperty(value = "managed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean managed;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the SecretItem object itself.
     */
    public SecretItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public SecretAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the SecretItem object itself.
     */
    public SecretItem withAttributes(SecretAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the SecretItem object itself.
     */
    public SecretItem withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the SecretItem object itself.
     */
    public SecretItem withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the managed value.
     *
     * @return the managed value
     */
    public Boolean managed() {
        return this.managed;
    }

    /**
     * the secret identifier.
     * @return The Identifier value
     */
    public SecretIdentifier identifier() {
        SecretIdentifier identifier = null;

        if (id() != null && !id().isEmpty()) {
            identifier = new SecretIdentifier(id());
        }

        return identifier;
    }
}
