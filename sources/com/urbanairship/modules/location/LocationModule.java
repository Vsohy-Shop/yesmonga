package com.urbanairship.modules.location;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.modules.Module;
import java.util.Collections;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LocationModule extends Module {

    /* renamed from: c */
    public final AirshipLocationClient f25737c;

    public LocationModule(@C0359n0 C36040b bVar, @C0359n0 AirshipLocationClient airshipLocationClient) {
        super(Collections.singleton(bVar));
        this.f25737c = airshipLocationClient;
    }

    @C0359n0
    public AirshipLocationClient getLocationClient() {
        return this.f25737c;
    }
}
