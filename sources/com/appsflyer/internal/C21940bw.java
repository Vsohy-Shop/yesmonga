package com.appsflyer.internal;

import android.support.annotation.Nullable;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* renamed from: com.appsflyer.internal.bw */
public final class C21940bw {
    static final Charset AFInAppEventType = Charset.forName("UTF-8");
    final C21930bo AFInAppEventParameterName;
    C21896ap AFKeystoreWrapper = AFInAppEventParameterName();
    long valueOf;
    long values;

    public C21940bw(C21930bo boVar) {
        this.AFInAppEventParameterName = boVar;
        this.valueOf = boVar.AFKeystoreWrapper("af_rc_timestamp");
        this.values = boVar.AFKeystoreWrapper("af_rc_max_age");
    }

    @Nullable
    private C21896ap AFInAppEventParameterName() {
        String valueOf2 = this.AFInAppEventParameterName.valueOf("af_remote_config", (String) null);
        if (valueOf2 == null) {
            AFLogger.values("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new C21896ap(new String(Base64.decode(valueOf2, 2), AFInAppEventType));
        } catch (Exception e) {
            AFLogger.valueOf("CFG: Error reading malformed configuration from cache, requires fetching from remote again", (Throwable) e);
            return null;
        }
    }
}
