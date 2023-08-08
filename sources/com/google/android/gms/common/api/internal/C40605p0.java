package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40843u;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
public final class C40605p0 implements C40747e.C40750c {

    /* renamed from: a */
    public final WeakReference f103534a;

    /* renamed from: b */
    public final C40477a f103535b;

    /* renamed from: c */
    public final boolean f103536c;

    public C40605p0(C40515a1 a1Var, C40477a aVar, boolean z) {
        this.f103534a = new WeakReference(a1Var);
        this.f103535b = aVar;
        this.f103536c = z;
    }

    /* renamed from: a */
    public final void mo134010a(@C0359n0 ConnectionResult connectionResult) {
        boolean z;
        Lock z2;
        C40515a1 a1Var = (C40515a1) this.f103534a.get();
        if (a1Var != null) {
            if (Looper.myLooper() == a1Var.f103299a.f103496A.mo133757r()) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            a1Var.f103300b.lock();
            try {
                if (!a1Var.mo133835o(0)) {
                    z2 = a1Var.f103300b;
                } else {
                    if (!connectionResult.mo133595e0()) {
                        a1Var.mo133833m(connectionResult, this.f103535b, this.f103536c);
                    }
                    if (a1Var.mo133836p()) {
                        a1Var.mo133834n();
                    }
                    z2 = a1Var.f103300b;
                }
                z2.unlock();
            } catch (Throwable th) {
                a1Var.f103300b.unlock();
                throw th;
            }
        }
    }
}
