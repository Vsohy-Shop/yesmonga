package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17195p;

/* renamed from: androidx.browser.customtabs.i */
public class C0927i {

    /* renamed from: d */
    public static final String f2934d = "CustomTabsSessionToken";
    @C0363p0

    /* renamed from: a */
    public final C0005a f2935a;
    @C0363p0

    /* renamed from: b */
    public final PendingIntent f2936b;
    @C0363p0

    /* renamed from: c */
    public final C0903b f2937c;

    /* renamed from: androidx.browser.customtabs.i$a */
    public class C0928a extends C0903b {
        public C0928a() {
        }

        /* renamed from: a */
        public void mo3896a(@C0359n0 String str, @C0363p0 Bundle bundle) {
            try {
                C0927i.this.f2935a.mo3E3(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @C0359n0
        /* renamed from: b */
        public Bundle mo3897b(@C0359n0 String str, @C0363p0 Bundle bundle) {
            try {
                return C0927i.this.f2935a.mo6h2(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public void mo3898c(@C0363p0 Bundle bundle) {
            try {
                C0927i.this.f2935a.mo7o8(bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo3899d(int i, @C0363p0 Bundle bundle) {
            try {
                C0927i.this.f2935a.mo4Q7(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public void mo3900e(@C0359n0 String str, @C0363p0 Bundle bundle) {
            try {
                C0927i.this.f2935a.mo5S0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: f */
        public void mo3901f(int i, @C0359n0 Uri uri, boolean z, @C0363p0 Bundle bundle) {
            try {
                C0927i.this.f2935a.mo8s8(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.browser.customtabs.i$b */
    public static class C0929b extends C0005a.C0007b {
        /* renamed from: E3 */
        public void mo3E3(String str, Bundle bundle) {
        }

        /* renamed from: Q7 */
        public void mo4Q7(int i, Bundle bundle) {
        }

        /* renamed from: S0 */
        public void mo5S0(String str, Bundle bundle) {
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: h2 */
        public Bundle mo6h2(String str, Bundle bundle) {
            return null;
        }

        /* renamed from: o8 */
        public void mo7o8(Bundle bundle) {
        }

        /* renamed from: s8 */
        public void mo8s8(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }

    public C0927i(@C0363p0 C0005a aVar, @C0363p0 PendingIntent pendingIntent) {
        C0928a aVar2;
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f2935a = aVar;
        this.f2936b = pendingIntent;
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new C0928a();
        }
        this.f2937c = aVar2;
    }

    @C0359n0
    /* renamed from: a */
    public static C0927i m4186a() {
        return new C0927i(new C0929b(), (PendingIntent) null);
    }

    @C0363p0
    /* renamed from: f */
    public static C0927i m4187f(@C0359n0 Intent intent) {
        Bundle extras = intent.getExtras();
        C0005a aVar = null;
        if (extras == null) {
            return null;
        }
        IBinder a = C17195p.m79486a(extras, C0912d.f2870d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(C0912d.f2871e);
        if (a == null && pendingIntent == null) {
            return null;
        }
        if (a != null) {
            aVar = C0005a.C0007b.m19m0(a);
        }
        return new C0927i(aVar, pendingIntent);
    }

    @C0363p0
    /* renamed from: b */
    public C0903b mo3975b() {
        return this.f2937c;
    }

    @C0363p0
    /* renamed from: c */
    public IBinder mo3976c() {
        C0005a aVar = this.f2935a;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    /* renamed from: d */
    public final IBinder mo3977d() {
        C0005a aVar = this.f2935a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @C0363p0
    /* renamed from: e */
    public PendingIntent mo3978e() {
        return this.f2936b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C0927i)) {
            return false;
        }
        C0927i iVar = (C0927i) obj;
        PendingIntent e = iVar.mo3978e();
        PendingIntent pendingIntent = this.f2936b;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (e != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(e);
        }
        return mo3977d().equals(iVar.mo3977d());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public boolean mo3980g() {
        return this.f2935a != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public boolean mo3981h() {
        return this.f2936b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f2936b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return mo3977d().hashCode();
    }

    /* renamed from: i */
    public boolean mo3983i(@C0359n0 C0924h hVar) {
        return hVar.mo3962d().equals(this.f2935a);
    }
}
