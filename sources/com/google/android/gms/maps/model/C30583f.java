package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.maps.C41822e0;

/* renamed from: com.google.android.gms.maps.model.f */
public final class C30583f {

    /* renamed from: a */
    public final C41822e0 f73130a;

    public C30583f(C41822e0 e0Var) {
        this.f73130a = (C41822e0) C40843u.m166202l(e0Var);
    }

    /* renamed from: a */
    public void mo86545a() {
        try {
            this.f73130a.mo136391h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo86546b() {
        try {
            return this.f73130a.mo136390f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public String mo86547c() {
        try {
            return this.f73130a.mo136392o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C30583f)) {
            return false;
        }
        try {
            return this.f73130a.mo136388Z6(((C30583f) obj).f73130a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73130a.mo136389e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
