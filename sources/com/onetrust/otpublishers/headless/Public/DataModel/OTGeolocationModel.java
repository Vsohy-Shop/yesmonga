package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class OTGeolocationModel {
    public String country;
    public String state;

    @C0359n0
    public boolean compareLocation(@C0363p0 String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(this.country) || str.equalsIgnoreCase(this.state);
    }
}
