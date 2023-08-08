package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0005a;
import android.support.customtabs.C0009b;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: androidx.browser.customtabs.f */
public abstract class C0917f extends Service {

    /* renamed from: E0 */
    public static final int f2906E0 = 2;

    /* renamed from: F0 */
    public static final int f2907F0 = 1;

    /* renamed from: X */
    public static final int f2908X = -2;

    /* renamed from: Y */
    public static final int f2909Y = -3;

    /* renamed from: Z */
    public static final int f2910Z = 1;

    /* renamed from: c */
    public static final String f2911c = "android.support.customtabs.action.CustomTabsService";

    /* renamed from: d */
    public static final String f2912d = "androidx.browser.customtabs.category.NavBarColorCustomization";

    /* renamed from: e */
    public static final String f2913e = "androidx.browser.customtabs.category.ColorSchemeCustomization";

    /* renamed from: f */
    public static final String f2914f = "androidx.browser.trusted.category.TrustedWebActivities";

    /* renamed from: g */
    public static final String f2915g = "androidx.browser.trusted.category.WebShareTargetV2";

    /* renamed from: v */
    public static final String f2916v = "androidx.browser.trusted.category.ImmersiveMode";

    /* renamed from: w */
    public static final String f2917w = "android.support.customtabs.otherurls.URL";

    /* renamed from: x */
    public static final String f2918x = "androidx.browser.customtabs.SUCCESS";

    /* renamed from: y */
    public static final int f2919y = 0;

    /* renamed from: z */
    public static final int f2920z = -1;

    /* renamed from: a */
    public final C1886l<IBinder, IBinder.DeathRecipient> f2921a = new C1886l<>();

    /* renamed from: b */
    public C0009b.C0011b f2922b = new C0918a();

    /* renamed from: androidx.browser.customtabs.f$a */
    public class C0918a extends C0009b.C0011b {
        public C0918a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: F8 */
        public /* synthetic */ void m4141F8(C0927i iVar) {
            C0917f.this.mo3944a(iVar);
        }

        /* renamed from: B7 */
        public boolean mo14B7(@C0359n0 C0005a aVar) {
            return mo3956G8(aVar, (PendingIntent) null);
        }

        @C0363p0
        /* renamed from: E8 */
        public final PendingIntent mo3955E8(@C0363p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(C0912d.f2871e);
            bundle.remove(C0912d.f2871e);
            return pendingIntent;
        }

        /* renamed from: G8 */
        public final boolean mo3956G8(@C0359n0 C0005a aVar, @C0363p0 PendingIntent pendingIntent) {
            C0927i iVar = new C0927i(aVar, pendingIntent);
            try {
                C0916e eVar = new C0916e(this, iVar);
                synchronized (C0917f.this.f2921a) {
                    aVar.asBinder().linkToDeath(eVar, 0);
                    C0917f.this.f2921a.put(aVar.asBinder(), eVar);
                }
                return C0917f.this.mo3947d(iVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: L1 */
        public boolean mo15L1(@C0359n0 C0005a aVar, @C0359n0 Uri uri, int i, @C0363p0 Bundle bundle) {
            return C0917f.this.mo3949f(new C0927i(aVar, mo3955E8(bundle)), uri, i, bundle);
        }

        /* renamed from: L6 */
        public boolean mo16L6(long j) {
            return C0917f.this.mo3953j(j);
        }

        /* renamed from: T7 */
        public boolean mo17T7(@C0359n0 C0005a aVar, @C0359n0 Uri uri) {
            return C0917f.this.mo3950g(new C0927i(aVar, (PendingIntent) null), uri);
        }

        /* renamed from: W3 */
        public boolean mo18W3(@C0359n0 C0005a aVar, @C0363p0 Bundle bundle) {
            return C0917f.this.mo3951h(new C0927i(aVar, mo3955E8(bundle)), bundle);
        }

        /* renamed from: k2 */
        public Bundle mo19k2(@C0359n0 String str, @C0363p0 Bundle bundle) {
            return C0917f.this.mo3945b(str, bundle);
        }

        /* renamed from: q1 */
        public boolean mo20q1(@C0359n0 C0005a aVar, int i, @C0359n0 Uri uri, @C0363p0 Bundle bundle) {
            return C0917f.this.mo3952i(new C0927i(aVar, mo3955E8(bundle)), i, uri, bundle);
        }

        /* renamed from: q5 */
        public boolean mo21q5(@C0363p0 C0005a aVar, @C0363p0 Uri uri, @C0363p0 Bundle bundle, @C0363p0 List<Bundle> list) {
            return C0917f.this.mo3946c(new C0927i(aVar, mo3955E8(bundle)), uri, bundle, list);
        }

        /* renamed from: r7 */
        public int mo22r7(@C0359n0 C0005a aVar, @C0359n0 String str, @C0363p0 Bundle bundle) {
            return C0917f.this.mo3948e(new C0927i(aVar, mo3955E8(bundle)), str, bundle);
        }

        /* renamed from: v3 */
        public boolean mo23v3(@C0359n0 C0005a aVar, @C0359n0 Uri uri, @C0359n0 Bundle bundle) {
            return C0917f.this.mo3950g(new C0927i(aVar, mo3955E8(bundle)), uri);
        }

        /* renamed from: z3 */
        public boolean mo24z3(@C0359n0 C0005a aVar, @C0363p0 Bundle bundle) {
            return mo3956G8(aVar, mo3955E8(bundle));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.customtabs.f$b */
    public @interface C0919b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.customtabs.f$c */
    public @interface C0920c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.customtabs.f$d */
    public @interface C0921d {
    }

    /* renamed from: a */
    public boolean mo3944a(@C0359n0 C0927i iVar) {
        try {
            synchronized (this.f2921a) {
                IBinder c = iVar.mo3976c();
                if (c == null) {
                    return false;
                }
                c.unlinkToDeath(this.f2921a.get(c), 0);
                this.f2921a.remove(c);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @C0363p0
    /* renamed from: b */
    public abstract Bundle mo3945b(@C0359n0 String str, @C0363p0 Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo3946c(@C0359n0 C0927i iVar, @C0363p0 Uri uri, @C0363p0 Bundle bundle, @C0363p0 List<Bundle> list);

    /* renamed from: d */
    public abstract boolean mo3947d(@C0359n0 C0927i iVar);

    /* renamed from: e */
    public abstract int mo3948e(@C0359n0 C0927i iVar, @C0359n0 String str, @C0363p0 Bundle bundle);

    /* renamed from: f */
    public abstract boolean mo3949f(@C0359n0 C0927i iVar, @C0359n0 Uri uri, int i, @C0363p0 Bundle bundle);

    /* renamed from: g */
    public abstract boolean mo3950g(@C0359n0 C0927i iVar, @C0359n0 Uri uri);

    /* renamed from: h */
    public abstract boolean mo3951h(@C0359n0 C0927i iVar, @C0363p0 Bundle bundle);

    /* renamed from: i */
    public abstract boolean mo3952i(@C0359n0 C0927i iVar, int i, @C0359n0 Uri uri, @C0363p0 Bundle bundle);

    /* renamed from: j */
    public abstract boolean mo3953j(long j);

    @C0359n0
    public IBinder onBind(@C0363p0 Intent intent) {
        return this.f2922b;
    }
}
