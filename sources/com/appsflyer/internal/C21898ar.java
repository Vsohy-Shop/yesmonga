package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.appsflyer.internal.ar */
public final class C21898ar {
    @NonNull
    public C21960cn AFInAppEventParameterName;
    private boolean AFInAppEventType;

    public C21898ar() {
    }

    @Nullable
    public static Uri values(Activity activity) {
        return activity.getReferrer();
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    public C21898ar(boolean z, C21960cn cnVar) {
        this.AFInAppEventType = z;
        this.AFInAppEventParameterName = cnVar;
    }
}
