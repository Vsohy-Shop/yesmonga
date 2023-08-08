package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import android.support.customtabs.C0009b;
import android.widget.RemoteViews;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.C0927i;
import java.util.List;

/* renamed from: androidx.browser.customtabs.h */
public final class C0924h {

    /* renamed from: f */
    public static final String f2926f = "CustomTabsSession";

    /* renamed from: a */
    public final Object f2927a = new Object();

    /* renamed from: b */
    public final C0009b f2928b;

    /* renamed from: c */
    public final C0005a f2929c;

    /* renamed from: d */
    public final ComponentName f2930d;
    @C0363p0

    /* renamed from: e */
    public final PendingIntent f2931e;

    /* renamed from: androidx.browser.customtabs.h$a */
    public static class C0925a extends C0009b.C0011b {
        /* renamed from: B7 */
        public boolean mo14B7(C0005a aVar) throws RemoteException {
            return false;
        }

        /* renamed from: L1 */
        public boolean mo15L1(C0005a aVar, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: L6 */
        public boolean mo16L6(long j) throws RemoteException {
            return false;
        }

        /* renamed from: T7 */
        public boolean mo17T7(C0005a aVar, Uri uri) throws RemoteException {
            return false;
        }

        /* renamed from: W3 */
        public boolean mo18W3(C0005a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: k2 */
        public Bundle mo19k2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        /* renamed from: q1 */
        public boolean mo20q1(C0005a aVar, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: q5 */
        public boolean mo21q5(C0005a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        /* renamed from: r7 */
        public int mo22r7(C0005a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        /* renamed from: v3 */
        public boolean mo23v3(C0005a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        /* renamed from: z3 */
        public boolean mo24z3(C0005a aVar, Bundle bundle) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.browser.customtabs.h$b */
    public static class C0926b {
        @C0363p0

        /* renamed from: a */
        public final C0903b f2932a;
        @C0363p0

        /* renamed from: b */
        public final PendingIntent f2933b;

        public C0926b(@C0363p0 C0903b bVar, @C0363p0 PendingIntent pendingIntent) {
            this.f2932a = bVar;
            this.f2933b = pendingIntent;
        }

        @C0363p0
        /* renamed from: a */
        public C0903b mo3973a() {
            return this.f2932a;
        }

        @C0363p0
        /* renamed from: b */
        public PendingIntent mo3974b() {
            return this.f2933b;
        }
    }

    public C0924h(C0009b bVar, C0005a aVar, ComponentName componentName, @C0363p0 PendingIntent pendingIntent) {
        this.f2928b = bVar;
        this.f2929c = aVar;
        this.f2930d = componentName;
        this.f2931e = pendingIntent;
    }

    @C0344h1
    @C0359n0
    /* renamed from: c */
    public static C0924h m4159c(@C0359n0 ComponentName componentName) {
        return new C0924h(new C0925a(), new C0927i.C0929b(), componentName, (PendingIntent) null);
    }

    /* renamed from: a */
    public final void mo3960a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2931e;
        if (pendingIntent != null) {
            bundle.putParcelable(C0912d.f2871e, pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle mo3961b(@C0363p0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        mo3960a(bundle2);
        return bundle2;
    }

    /* renamed from: d */
    public IBinder mo3962d() {
        return this.f2929c.asBinder();
    }

    /* renamed from: e */
    public ComponentName mo3963e() {
        return this.f2930d;
    }

    @C0363p0
    /* renamed from: f */
    public PendingIntent mo3964f() {
        return this.f2931e;
    }

    /* renamed from: g */
    public boolean mo3965g(@C0363p0 Uri uri, @C0363p0 Bundle bundle, @C0363p0 List<Bundle> list) {
        try {
            return this.f2928b.mo21q5(this.f2929c, uri, mo3961b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public int mo3966h(@C0359n0 String str, @C0363p0 Bundle bundle) {
        int r7;
        Bundle b = mo3961b(bundle);
        synchronized (this.f2927a) {
            try {
                r7 = this.f2928b.mo22r7(this.f2929c, str, b);
            } catch (RemoteException unused) {
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r7;
    }

    /* renamed from: i */
    public boolean mo3967i(@C0359n0 Uri uri, int i, @C0363p0 Bundle bundle) {
        try {
            return this.f2928b.mo15L1(this.f2929c, uri, i, mo3961b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public boolean mo3968j(@C0359n0 Uri uri) {
        try {
            if (this.f2931e != null) {
                return this.f2928b.mo23v3(this.f2929c, uri, mo3961b((Bundle) null));
            }
            return this.f2928b.mo17T7(this.f2929c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo3969k(@C0359n0 Bitmap bitmap, @C0359n0 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0912d.f2886t, bitmap);
        bundle.putString(C0912d.f2887u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C0912d.f2883q, bundle);
        mo3960a(bundle);
        try {
            return this.f2928b.mo18W3(this.f2929c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public boolean mo3970l(@C0363p0 RemoteViews remoteViews, @C0363p0 int[] iArr, @C0363p0 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0912d.f2858G, remoteViews);
        bundle.putIntArray(C0912d.f2859H, iArr);
        bundle.putParcelable(C0912d.f2860I, pendingIntent);
        mo3960a(bundle);
        try {
            return this.f2928b.mo18W3(this.f2929c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo3971m(int i, @C0359n0 Bitmap bitmap, @C0359n0 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0912d.f2866O, i);
        bundle.putParcelable(C0912d.f2886t, bitmap);
        bundle.putString(C0912d.f2887u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C0912d.f2883q, bundle);
        mo3960a(bundle2);
        try {
            return this.f2928b.mo18W3(this.f2929c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public boolean mo3972n(int i, @C0359n0 Uri uri, @C0363p0 Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f2928b.mo20q1(this.f2929c, i, uri, mo3961b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
