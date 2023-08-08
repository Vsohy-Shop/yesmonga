package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gtm.l8 */
public final class C41399l8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f104777a;

    /* renamed from: b */
    public final /* synthetic */ String f104778b;

    /* renamed from: c */
    public final /* synthetic */ String f104779c;

    /* renamed from: d */
    public final /* synthetic */ C41373k6 f104780d;

    /* renamed from: e */
    public final /* synthetic */ C41471o8 f104781e;

    public C41399l8(C41471o8 o8Var, String str, String str2, String str3, C41373k6 k6Var) {
        this.f104781e = o8Var;
        this.f104777a = str;
        this.f104778b = str2;
        this.f104779c = str3;
        this.f104780d = k6Var;
    }

    public final void run() {
        boolean z;
        try {
            z = true;
            if (!this.f104781e.f104833n.containsKey(this.f104777a)) {
                this.f104781e.f104833n.put(this.f104777a, this.f104781e.f104835p.mo135910a(this.f104777a, this.f104778b, this.f104779c));
            }
        } catch (Exception e) {
            C41660w5.m168644b("Fail to load container: ", e, this.f104781e.f104837r);
            z = false;
        }
        try {
            C41373k6 k6Var = this.f104780d;
            if (k6Var != null) {
                k6Var.mo135488E7(z, this.f104777a);
            }
        } catch (RemoteException e2) {
            C41660w5.m168644b("Error relaying callback: ", e2, this.f104781e.f104837r);
        }
    }
}
