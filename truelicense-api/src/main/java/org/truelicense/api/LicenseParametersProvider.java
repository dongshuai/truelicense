/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package org.truelicense.api;

/**
 * Provides license parameters.
 *
 * @author Christian Schlichtherle
 */
public interface LicenseParametersProvider {

    /** Returns the license parameters. */
    LicenseParameters parameters();
}