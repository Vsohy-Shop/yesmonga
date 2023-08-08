package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.x */
public final class C22015x {
    private Bundle AFKeystoreWrapper;
    public final Context valueOf;

    /* renamed from: com.appsflyer.internal.x$d */
    public interface C22017d {
        void AFInAppEventType(String str, Exception exc);

        void valueOf(@NonNull String str, @NonNull String str2);
    }

    public C22015x() {
    }

    @Nullable
    public final String valueOf(String str) {
        Object obj;
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = this.valueOf.getPackageManager().getApplicationInfo(this.valueOf.getPackageName(), 128).metaData;
            }
            Bundle bundle = this.AFKeystoreWrapper;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
            return null;
        }
    }

    public C22015x(Context context) {
        this.AFKeystoreWrapper = null;
        this.valueOf = context.getApplicationContext();
    }
}
