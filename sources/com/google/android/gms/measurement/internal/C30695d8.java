package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41977h1;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
public final class C30695d8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73332a;

    /* renamed from: b */
    public final /* synthetic */ String f73333b;

    /* renamed from: c */
    public final /* synthetic */ zzq f73334c;

    /* renamed from: d */
    public final /* synthetic */ boolean f73335d;

    /* renamed from: e */
    public final /* synthetic */ C41977h1 f73336e;

    /* renamed from: f */
    public final /* synthetic */ C30696d9 f73337f;

    public C30695d8(C30696d9 d9Var, String str, String str2, zzq zzq, boolean z, C41977h1 h1Var) {
        this.f73337f = d9Var;
        this.f73332a = str;
        this.f73333b = str2;
        this.f73334c = zzq;
        this.f73335d = z;
        this.f73336e = h1Var;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C30696d9 d9Var = this.f73337f;
            C30779k3 H = d9Var.f73339d;
            if (H == null) {
                d9Var.f74136a.mo86903d().mo87489r().mo87465c("Failed to get user properties; not connected to service", this.f73332a, this.f73333b);
                this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle2);
                return;
            }
            C40843u.m166202l(this.f73334c);
            List<zzli> S3 = H.mo87156S3(this.f73332a, this.f73333b, this.f73335d, this.f73334c);
            bundle = new Bundle();
            if (S3 != null) {
                for (zzli zzli : S3) {
                    String str = zzli.f74171e;
                    if (str != null) {
                        bundle.putString(zzli.f74168b, str);
                    } else {
                        Long l = zzli.f74170d;
                        if (l != null) {
                            bundle.putLong(zzli.f74168b, l.longValue());
                        } else {
                            Double d = zzli.f74173g;
                            if (d != null) {
                                bundle.putDouble(zzli.f74168b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f73337f.mo87023E();
                this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f73337f.f74136a.mo86903d().mo87489r().mo87465c("Failed to get user properties; remote exception", this.f73332a, e);
                    this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f73337f.f74136a.mo86903d().mo87489r().mo87465c("Failed to get user properties; remote exception", this.f73332a, e);
            this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f73337f.f74136a.mo87110N().mo87507G(this.f73336e, bundle2);
            throw th;
        }
    }
}
