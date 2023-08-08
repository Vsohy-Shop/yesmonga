package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40849w;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.C40965b;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
public final class C40573j2 implements C31035e {

    /* renamed from: a */
    public final C40564i f103459a;

    /* renamed from: b */
    public final int f103460b;

    /* renamed from: c */
    public final C40525c f103461c;

    /* renamed from: d */
    public final long f103462d;

    /* renamed from: e */
    public final long f103463e;

    @C40974d0
    public C40573j2(C40564i iVar, int i, C40525c cVar, long j, long j2, @C0363p0 String str, @C0363p0 String str2) {
        this.f103459a = iVar;
        this.f103460b = i;
        this.f103461c = cVar;
        this.f103462d = j;
        this.f103463e = j2;
    }

    @C0363p0
    /* renamed from: a */
    public static C40573j2 m165191a(C40564i iVar, int i, C40525c cVar) {
        boolean z;
        long j;
        long j2;
        if (!iVar.mo133951g()) {
            return null;
        }
        RootTelemetryConfiguration a = C40849w.m166213b().mo134510a();
        if (a == null) {
            z = true;
        } else if (!a.mo134288W()) {
            return null;
        } else {
            z = a.mo134289X();
            C40637v1 x = iVar.mo133959x(cVar);
            if (x != null) {
                if (!(x.mo134072s() instanceof C40747e)) {
                    return null;
                }
                C40747e eVar = (C40747e) x.mo134072s();
                if (eVar.mo134344S() && !eVar.mo134357e()) {
                    ConnectionTelemetryConfiguration b = m165192b(x, eVar, i);
                    if (b == null) {
                        return null;
                    }
                    x.mo134046D();
                    z = b.mo134276e0();
                }
            }
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new C40573j2(iVar, i, cVar, j, j2, (String) null, (String) null);
    }

    @C0363p0
    /* renamed from: b */
    public static ConnectionTelemetryConfiguration m165192b(C40637v1 v1Var, C40747e eVar, int i) {
        int[] Q;
        int[] W;
        ConnectionTelemetryConfiguration Q2 = eVar.mo134342Q();
        if (Q2 == null || !Q2.mo134275X() || ((Q = Q2.mo134273Q()) != null ? !C40965b.m166577c(Q, i) : !((W = Q2.mo134274W()) == null || !C40965b.m166577c(W, i))) || v1Var.mo134070p() >= Q2.mo134272M()) {
            return null;
        }
        return Q2;
    }

    @C0348i1
    public final void onComplete(@C0359n0 C31047k kVar) {
        C40637v1 x;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f103459a.mo133951g()) {
            RootTelemetryConfiguration a = C40849w.m166213b().mo134510a();
            if ((a == null || a.mo134288W()) && (x = this.f103459a.mo133959x(this.f103461c)) != null && (x.mo134072s() instanceof C40747e)) {
                C40747e eVar = (C40747e) x.mo134072s();
                boolean z2 = true;
                int i7 = 0;
                if (this.f103462d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int H = eVar.mo134336H();
                if (a != null) {
                    boolean X = z & a.mo134289X();
                    int M = a.mo134286M();
                    int Q = a.mo134287Q();
                    i3 = a.getVersion();
                    if (eVar.mo134344S() && !eVar.mo134357e()) {
                        ConnectionTelemetryConfiguration b = m165192b(x, eVar, this.f103460b);
                        if (b != null) {
                            if (!b.mo134276e0() || this.f103462d <= 0) {
                                z2 = false;
                            }
                            Q = b.mo134272M();
                            X = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = M;
                    i = Q;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C40564i iVar = this.f103459a;
                if (kVar.mo87738v()) {
                    i4 = 0;
                } else {
                    if (kVar.mo87736t()) {
                        i7 = 100;
                    } else {
                        Exception q = kVar.mo87733q();
                        if (q instanceof ApiException) {
                            Status a2 = ((ApiException) q).mo133627a();
                            int W = a2.mo133648W();
                            ConnectionResult M2 = a2.mo133646M();
                            if (M2 == null) {
                                i6 = -1;
                            } else {
                                i6 = M2.mo133591M();
                            }
                            i4 = i6;
                            i7 = W;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j3 = this.f103462d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f103463e);
                    j2 = j3;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                iVar.mo133945L(new MethodInvocation(this.f103460b, i7, i4, j2, j, (String) null, (String) null, H, i5), i3, (long) i2, i);
            }
        }
    }
}
