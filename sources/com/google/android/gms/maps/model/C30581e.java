package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.maps.C41816b0;
import com.google.android.gms.internal.maps.C41820d0;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.model.e */
public final class C30581e {

    /* renamed from: a */
    public final C41816b0 f73128a;

    /* renamed from: b */
    public final C30600r f73129b;

    public C30581e(C41816b0 b0Var) {
        C30600r rVar = C30600r.f73144a;
        this.f73128a = (C41816b0) C40843u.m166203m(b0Var, "delegate");
        this.f73129b = (C30600r) C40843u.m166203m(rVar, "shim");
    }

    /* renamed from: a */
    public int mo86537a() {
        try {
            return this.f73128a.mo136354e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public int mo86538b() {
        try {
            return this.f73128a.mo136355f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public List<C30583f> mo86539c() {
        try {
            List<IBinder> h = this.f73128a.mo136356h();
            ArrayList arrayList = new ArrayList(h.size());
            for (IBinder H0 : h) {
                arrayList.add(new C30583f(C41820d0.m169295H0(H0)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public boolean mo86540d() {
        try {
            return this.f73128a.mo136357k();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C30581e)) {
            return false;
        }
        try {
            return this.f73128a.mo136358m5(((C30581e) obj).f73128a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f73128a.mo136359o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
