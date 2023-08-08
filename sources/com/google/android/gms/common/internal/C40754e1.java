package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.C0339g;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.e1 */
public abstract class C40754e1 extends C40804q1 {

    /* renamed from: d */
    public final int f103842d;
    @C0363p0

    /* renamed from: e */
    public final Bundle f103843e;

    /* renamed from: f */
    public final /* synthetic */ C40747e f103844f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C0339g
    public C40754e1(C40747e eVar, @C0363p0 int i, Bundle bundle) {
        super(eVar, Boolean.TRUE);
        this.f103844f = eVar;
        this.f103842d = i;
        this.f103843e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo134376a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f103842d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo134379g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.e r3 = r2.f103844f
            r3.mo134367q0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo134378f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.e r3 = r2.f103844f
            r3.mo134367q0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f103843e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f103842d
            r3.<init>(r0, r1)
            r2.mo134378f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40754e1.mo134376a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo134377b() {
    }

    /* renamed from: f */
    public abstract void mo134378f(ConnectionResult connectionResult);

    /* renamed from: g */
    public abstract boolean mo134379g();
}
