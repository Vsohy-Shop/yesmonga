package com.google.android.gms.common.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;

@C40473a
/* renamed from: com.google.android.gms.common.internal.w */
public final class C40849w {
    @C0363p0

    /* renamed from: b */
    public static C40849w f103951b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f103952c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @C0363p0

    /* renamed from: a */
    public RootTelemetryConfiguration f103953a;

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static synchronized C40849w m166213b() {
        C40849w wVar;
        synchronized (C40849w.class) {
            if (f103951b == null) {
                f103951b = new C40849w();
            }
            wVar = f103951b;
        }
        return wVar;
    }

    @C0363p0
    @C40473a
    /* renamed from: a */
    public RootTelemetryConfiguration mo134510a() {
        return this.f103953a;
    }

    @C40974d0
    /* renamed from: c */
    public final synchronized void mo134511c(@C0363p0 RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f103953a = f103952c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f103953a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
            this.f103953a = rootTelemetryConfiguration;
        }
    }
}
