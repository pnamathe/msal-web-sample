// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.msalwebsample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("b2c")
class BasicConfiguration {
    String clientId;
    String secret;
    String redirectUri;

    String api;
    String apiScope;

    String signUpSignInAuthority;
    String editProfileAuthority;
    String resetPasswordAuthority;
    
    public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getApiScope() {
		return apiScope;
	}

	public void setApiScope(String apiScope) {
		this.apiScope = apiScope;
	}

	public String getEditProfileAuthority() {
		return editProfileAuthority;
	}

	public void setEditProfileAuthority(String editProfileAuthority) {
		this.editProfileAuthority = editProfileAuthority;
	}

	public String getResetPasswordAuthority() {
		return resetPasswordAuthority;
	}

	public void setResetPasswordAuthority(String resetPasswordAuthority) {
		this.resetPasswordAuthority = resetPasswordAuthority;
	}

	public String getSignUpSignInAuthority() {
		return signUpSignInAuthority;
	}

	public void setSignUpSignInAuthority(String signUpSignInAuthority) {
    	this.signUpSignInAuthority = signUpSignInAuthority;
    }
}