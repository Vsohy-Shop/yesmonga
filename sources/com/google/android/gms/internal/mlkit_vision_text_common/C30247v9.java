package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.C0344h1;
import com.google.android.gms.common.internal.C40730a0;
import com.google.android.gms.common.internal.C40734b0;
import com.google.android.gms.common.internal.C40738c0;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.v9 */
public final class C30247v9 {

    /* renamed from: a */
    public final C40734b0 f72291a;

    /* renamed from: b */
    public final AtomicLong f72292b = new AtomicLong(-1);

    @C0344h1
    public C30247v9(Context context, String str) {
        this.f72291a = C40730a0.m165755b(context, C40738c0.m165763a().mo134314b("mlkit:vision").mo134313a());
    }

    /* renamed from: a */
    public static C30247v9 m121897a(Context context) {
        return new C30247v9(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo85365b(long j, Exception exc) {
        this.f72292b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo85366c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f72292b.get() != -1) {
                if (elapsedRealtime - this.f72292b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f72291a.mo134307a(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(i, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo87724h(new C30235u9(this, elapsedRealtime));
        }
    }
}
