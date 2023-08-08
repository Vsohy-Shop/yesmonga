package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.t8 */
public final class C41591t8 implements ServiceConnection {

    /* renamed from: c */
    public final Context f105007c;

    /* renamed from: d */
    public final C40954b f105008d;

    /* renamed from: e */
    public volatile boolean f105009e = false;

    /* renamed from: f */
    public volatile boolean f105010f = false;

    /* renamed from: g */
    public C41445n6 f105011g;

    @C40974d0
    public C41591t8(Context context, C40954b bVar) {
        this.f105007c = context;
        this.f105008d = bVar;
    }

    @C0348i1
    /* renamed from: f */
    public static final void m168409f(@C0363p0 C41373k6 k6Var, String str) {
        try {
            k6Var.mo135488E7(false, str);
        } catch (RemoteException e) {
            C41493p6.m168150b("Error - local callback should not throw RemoteException", e);
        }
    }

    @C0348i1
    /* renamed from: a */
    public final void mo135853a() {
        if (mo135856d()) {
            try {
                this.f105011g.mo135614f();
            } catch (RemoteException e) {
                C41493p6.m168154f("Error calling service to dispatch pending events", e);
            }
        }
    }

    @C0348i1
    /* renamed from: b */
    public final void mo135854b(String str, Bundle bundle, String str2, long j, boolean z) {
        if (mo135856d()) {
            try {
                this.f105011g.mo135612Q2(str, bundle, str2, j, z);
            } catch (RemoteException e) {
                C41493p6.m168154f("Error calling service to emit event", e);
            }
        }
    }

    @C0348i1
    /* renamed from: c */
    public final void mo135855c(String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 C41373k6 k6Var) {
        if (mo135856d()) {
            try {
                this.f105011g.mo135613X5(str, str2, (String) null, k6Var);
            } catch (RemoteException e) {
                C41493p6.m168154f("Error calling service to load container", e);
                m168409f(k6Var, str);
            }
        } else {
            m168409f(k6Var, str);
        }
    }

    @C0348i1
    /* renamed from: d */
    public final boolean mo135856d() {
        if (this.f105009e) {
            return true;
        }
        synchronized (this) {
            if (this.f105009e) {
                return true;
            }
            if (!this.f105010f) {
                Intent intent = new Intent("ignored");
                intent.setAction((String) null);
                intent.setClassName(this.f105007c.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                if (!this.f105008d.mo134751a(this.f105007c, intent, this, 1)) {
                    return false;
                }
                this.f105010f = true;
            }
            while (this.f105010f) {
                try {
                    wait();
                    this.f105010f = false;
                } catch (InterruptedException e) {
                    C41493p6.m168154f("Error connecting to TagManagerService", e);
                    this.f105010f = false;
                }
            }
            boolean z = this.f105009e;
            return z;
        }
    }

    @C0348i1
    /* renamed from: e */
    public final boolean mo135857e() {
        if (!mo135856d()) {
            return false;
        }
        try {
            this.f105011g.mo135615k();
            return true;
        } catch (RemoteException e) {
            C41493p6.m168154f("Error in resetting service", e);
            return false;
        }
    }

    @C0353k0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C41445n6 n6Var;
        synchronized (this) {
            if (iBinder == null) {
                n6Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                if (queryLocalInterface instanceof C41445n6) {
                    n6Var = (C41445n6) queryLocalInterface;
                } else {
                    n6Var = new C41397l6(iBinder);
                }
            }
            this.f105011g = n6Var;
            this.f105009e = true;
            this.f105010f = false;
            notifyAll();
        }
    }

    @C0353k0
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f105011g = null;
            this.f105009e = false;
            this.f105010f = false;
        }
    }
}
