package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.bu */
public final class C21937bu {
    private static final long AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24);
    private final C21940bw valueOf;
    private final C22015x values;

    public C21937bu(C22015x xVar, C21940bw bwVar) {
        this.values = xVar;
        this.valueOf = bwVar;
    }

    public final boolean AFInAppEventParameterName() {
        if (this.valueOf.AFKeystoreWrapper == null) {
            AFLogger.AFKeystoreWrapper("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C21940bw bwVar = this.valueOf;
        if (currentTimeMillis - bwVar.valueOf > TimeUnit.SECONDS.toMillis(bwVar.values)) {
            return true;
        }
        return false;
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.values.valueOf("com.appsflyer.rc.sandbox"));
    }

    public final long AFKeystoreWrapper() {
        String valueOf2 = this.values.valueOf("com.appsflyer.rc.cache.max-age-fallback");
        if (valueOf2 == null) {
            return AFKeystoreWrapper;
        }
        try {
            return Long.parseLong(valueOf2);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(e.getMessage());
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return AFKeystoreWrapper;
        }
    }
}
