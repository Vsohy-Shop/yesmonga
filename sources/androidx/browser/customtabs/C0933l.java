package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import android.support.customtabs.C0013c;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.browser.customtabs.l */
public abstract class C0933l implements C0930j, ServiceConnection {

    /* renamed from: h */
    public static final String f2941h = "PostMessageServConn";

    /* renamed from: c */
    public final Object f2942c = new Object();

    /* renamed from: d */
    public final C0005a f2943d;
    @C0363p0

    /* renamed from: e */
    public C0013c f2944e;
    @C0363p0

    /* renamed from: f */
    public String f2945f;

    /* renamed from: g */
    public boolean f2946g;

    public C0933l(@C0359n0 C0927i iVar) {
        IBinder c = iVar.mo3976c();
        if (c != null) {
            this.f2943d = C0005a.C0007b.m19m0(c);
            return;
        }
        throw new IllegalArgumentException("Provided session must have binder.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: S0 */
    public final boolean mo3984S0(@C0359n0 String str, @C0363p0 Bundle bundle) {
        return mo3996k(str, bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public void mo3985a(@C0359n0 Context context) {
        mo3998m(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public final boolean mo3986b(@C0363p0 Bundle bundle) {
        return mo3992g(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public boolean mo3988c(@C0359n0 Context context) {
        String str = this.f2945f;
        if (str != null) {
            return mo3989d(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    /* renamed from: d */
    public boolean mo3989d(@C0359n0 Context context, @C0359n0 String str) {
        Intent intent = new Intent();
        intent.setClassName(str, C0931k.class.getName());
        return context.bindService(intent, this, 1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public void mo3990e(@C0359n0 Context context) {
        if (mo3991f()) {
            mo3998m(context);
        }
    }

    /* renamed from: f */
    public final boolean mo3991f() {
        return this.f2944e != null;
    }

    /* renamed from: g */
    public final boolean mo3992g(@C0363p0 Bundle bundle) {
        this.f2946g = true;
        return mo3993h(bundle);
    }

    /* renamed from: h */
    public final boolean mo3993h(@C0363p0 Bundle bundle) {
        if (this.f2944e == null) {
            return false;
        }
        synchronized (this.f2942c) {
            try {
                this.f2944e.mo31y2(this.f2943d, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* renamed from: i */
    public void mo3994i() {
        if (this.f2946g) {
            mo3993h((Bundle) null);
        }
    }

    /* renamed from: j */
    public void mo3995j() {
    }

    /* renamed from: k */
    public final boolean mo3996k(@C0359n0 String str, @C0363p0 Bundle bundle) {
        if (this.f2944e == null) {
            return false;
        }
        synchronized (this.f2942c) {
            try {
                this.f2944e.mo30b7(this.f2943d, str, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: l */
    public void mo3997l(@C0359n0 String str) {
        this.f2945f = str;
    }

    /* renamed from: m */
    public void mo3998m(@C0359n0 Context context) {
        if (mo3991f()) {
            context.unbindService(this);
            this.f2944e = null;
        }
    }

    public final void onServiceConnected(@C0359n0 ComponentName componentName, @C0359n0 IBinder iBinder) {
        this.f2944e = C0013c.C0015b.m70m0(iBinder);
        mo3994i();
    }

    public final void onServiceDisconnected(@C0359n0 ComponentName componentName) {
        this.f2944e = null;
        mo3995j();
    }
}
