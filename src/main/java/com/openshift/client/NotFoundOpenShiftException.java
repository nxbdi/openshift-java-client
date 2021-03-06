/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.client;

import com.openshift.internal.client.httpclient.HttpClientException;

/**
 * @author André Dietisheim
 */
public class NotFoundOpenShiftException extends OpenShiftEndpointException {

	private static final long serialVersionUID = 1L;

	public  NotFoundOpenShiftException(String url, HttpClientException e) throws OpenShiftException {
		super(url, e, e.getMessage(), "Could not find any OpenShift resource at \"{0}\"", url);
	}
}
