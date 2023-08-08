package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.f4 */
public final class C40551f4 implements C40543e2 {

    /* renamed from: a */
    public final /* synthetic */ C40541e0 f103366a;

    public /* synthetic */ C40551f4(C40541e0 e0Var, C40545e4 e4Var) {
        this.f103366a = e0Var;
    }

    /* renamed from: a */
    public final void mo133867a(@C0363p0 Bundle bundle) {
        this.f103366a.f103358z.lock();
        try {
            this.f103366a.f103356x = ConnectionResult.f103129S0;
            C40541e0.m164987C(this.f103366a);
        } finally {
            this.f103366a.f103358z.unlock();
        }
    }

    /* renamed from: b */
    public final void mo133868b(int i, boolean z) {
        Lock j;
        this.f103366a.f103358z.lock();
        try {
            C40541e0 e0Var = this.f103366a;
            if (e0Var.f103357y) {
                e0Var.f103357y = false;
                C40541e0.m164985A(this.f103366a, i, z);
                j = this.f103366a.f103358z;
            } else {
                e0Var.f103357y = true;
                this.f103366a.f103349q.mo133865H0(i);
                j = this.f103366a.f103358z;
            }
            j.unlock();
        } catch (Throwable th) {
            this.f103366a.f103358z.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo133869c(@C0359n0 ConnectionResult connectionResult) {
        this.f103366a.f103358z.lock();
        try {
            this.f103366a.f103356x = connectionResult;
            C40541e0.m164987C(this.f103366a);
        } finally {
            this.f103366a.f103358z.unlock();
        }
    }
}
