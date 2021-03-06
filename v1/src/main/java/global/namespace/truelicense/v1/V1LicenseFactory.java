/*
 * Copyright (C) 2005 - 2019 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.v1;

import de.schlichtherle.license.LicenseContent;
import global.namespace.truelicense.api.License;
import global.namespace.truelicense.api.LicenseFactory;

/**
 * A license factory for use with V1 format license keys.
 */
final class V1LicenseFactory implements LicenseFactory {

    @Override
    public License license() {
        return new LicenseContent();
    }

    @Override
    public Class<? extends License> licenseClass() {
        return LicenseContent.class;
    }
}
