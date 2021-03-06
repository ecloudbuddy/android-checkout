/*
 * Copyright 2014 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.checkout;

/**
 * An exception that is passed in {@link RequestListener#onError(int, Exception)} if any error
 * occur. A response error code can be obtained through {@link #getResponse()} method.
 */
public final class BillingException extends Exception {

    private final int mResponse;

    BillingException(int response) {
        mResponse = response;
    }

    /**
     * @return error code for which this exception was created
     * @see ResponseCodes
     */
    public int getResponse() {
        return mResponse;
    }
}
