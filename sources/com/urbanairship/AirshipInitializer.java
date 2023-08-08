package com.urbanairship;

import android.app.Application;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.startup.C20496b;
import androidx.work.WorkManagerInitializer;
import java.util.Collections;
import java.util.List;

public class AirshipInitializer implements C20496b<Boolean> {
    @C0359n0
    /* renamed from: b */
    public Boolean mo55933a(@C0359n0 Context context) {
        boolean z = true;
        Autopilot.m146141d((Application) context.getApplicationContext(), true);
        if (!UAirship.m146184O() && !UAirship.m146182M()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @C0359n0
    public List<Class<? extends C20496b<?>>> dependencies() {
        return Collections.singletonList(WorkManagerInitializer.class);
    }
}
