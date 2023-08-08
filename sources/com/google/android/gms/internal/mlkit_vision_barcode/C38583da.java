package com.google.android.gms.internal.mlkit_vision_barcode;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.da */
public final class C38583da {

    /* renamed from: a */
    public final C40734b0 f97794a;

    /* renamed from: b */
    public final AtomicLong f97795b = new AtomicLong(-1);

    @C0344h1
    public C38583da(Context context, String str) {
        this.f97794a = C40730a0.m165755b(context, C40738c0.m165763a().mo134314b("mlkit:vision").mo134313a());
    }

    /* renamed from: a */
    public static C38583da m159906a(Context context) {
        return new C38583da(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo122286b(long j, Exception exc) {
        this.f97795b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo122287c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f97795b.get() != -1) {
                if (elapsedRealtime - this.f97795b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f97794a.mo134307a(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(i, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo87724h(new C38570ca(this, elapsedRealtime));
        }
    }
}
