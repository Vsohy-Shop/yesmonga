package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.C0017a;
import android.support.customtabs.trusted.C0021b;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.browser.trusted.c0 */
public final class C0942c0 {

    /* renamed from: c */
    public static final String f2983c = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* renamed from: d */
    public static final String f2984d = "android.support.customtabs.trusted.PLATFORM_ID";

    /* renamed from: e */
    public static final String f2985e = "android.support.customtabs.trusted.NOTIFICATION";

    /* renamed from: f */
    public static final String f2986f = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* renamed from: g */
    public static final String f2987g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* renamed from: h */
    public static final String f2988h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* renamed from: a */
    public final C0021b f2989a;

    /* renamed from: b */
    public final ComponentName f2990b;

    /* renamed from: androidx.browser.trusted.c0$a */
    public class C0943a extends C0017a.C0019b {

        /* renamed from: p */
        public final /* synthetic */ C0983w f2991p;

        public C0943a(C0983w wVar) {
            this.f2991p = wVar;
        }

        /* renamed from: l8 */
        public void mo37l8(String str, Bundle bundle) throws RemoteException {
            this.f2991p.mo4075a(str, bundle);
        }
    }

    /* renamed from: androidx.browser.trusted.c0$b */
    public static class C0944b {

        /* renamed from: a */
        public final Parcelable[] f2992a;

        public C0944b(Parcelable[] parcelableArr) {
            this.f2992a = parcelableArr;
        }

        /* renamed from: a */
        public static C0944b m4281a(Bundle bundle) {
            C0942c0.m4270c(bundle, C0942c0.f2987g);
            return new C0944b(bundle.getParcelableArray(C0942c0.f2987g));
        }

        /* renamed from: b */
        public Bundle mo4043b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(C0942c0.f2987g, this.f2992a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.c0$c */
    public static class C0945c {

        /* renamed from: a */
        public final String f2993a;

        /* renamed from: b */
        public final int f2994b;

        public C0945c(String str, int i) {
            this.f2993a = str;
            this.f2994b = i;
        }

        /* renamed from: a */
        public static C0945c m4283a(Bundle bundle) {
            C0942c0.m4270c(bundle, C0942c0.f2983c);
            C0942c0.m4270c(bundle, C0942c0.f2984d);
            return new C0945c(bundle.getString(C0942c0.f2983c), bundle.getInt(C0942c0.f2984d));
        }

        /* renamed from: b */
        public Bundle mo4044b() {
            Bundle bundle = new Bundle();
            bundle.putString(C0942c0.f2983c, this.f2993a);
            bundle.putInt(C0942c0.f2984d, this.f2994b);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.c0$d */
    public static class C0946d {

        /* renamed from: a */
        public final String f2995a;

        public C0946d(String str) {
            this.f2995a = str;
        }

        /* renamed from: a */
        public static C0946d m4285a(Bundle bundle) {
            C0942c0.m4270c(bundle, C0942c0.f2986f);
            return new C0946d(bundle.getString(C0942c0.f2986f));
        }

        /* renamed from: b */
        public Bundle mo4045b() {
            Bundle bundle = new Bundle();
            bundle.putString(C0942c0.f2986f, this.f2995a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.c0$e */
    public static class C0947e {

        /* renamed from: a */
        public final String f2996a;

        /* renamed from: b */
        public final int f2997b;

        /* renamed from: c */
        public final Notification f2998c;

        /* renamed from: d */
        public final String f2999d;

        public C0947e(String str, int i, Notification notification, String str2) {
            this.f2996a = str;
            this.f2997b = i;
            this.f2998c = notification;
            this.f2999d = str2;
        }

        /* renamed from: a */
        public static C0947e m4287a(Bundle bundle) {
            C0942c0.m4270c(bundle, C0942c0.f2983c);
            C0942c0.m4270c(bundle, C0942c0.f2984d);
            C0942c0.m4270c(bundle, C0942c0.f2985e);
            C0942c0.m4270c(bundle, C0942c0.f2986f);
            return new C0947e(bundle.getString(C0942c0.f2983c), bundle.getInt(C0942c0.f2984d), (Notification) bundle.getParcelable(C0942c0.f2985e), bundle.getString(C0942c0.f2986f));
        }

        /* renamed from: b */
        public Bundle mo4046b() {
            Bundle bundle = new Bundle();
            bundle.putString(C0942c0.f2983c, this.f2996a);
            bundle.putInt(C0942c0.f2984d, this.f2997b);
            bundle.putParcelable(C0942c0.f2985e, this.f2998c);
            bundle.putString(C0942c0.f2986f, this.f2999d);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.c0$f */
    public static class C0948f {

        /* renamed from: a */
        public final boolean f3000a;

        public C0948f(boolean z) {
            this.f3000a = z;
        }

        /* renamed from: a */
        public static C0948f m4289a(Bundle bundle) {
            C0942c0.m4270c(bundle, C0942c0.f2988h);
            return new C0948f(bundle.getBoolean(C0942c0.f2988h));
        }

        /* renamed from: b */
        public Bundle mo4047b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C0942c0.f2988h, this.f3000a);
            return bundle;
        }
    }

    public C0942c0(@C0359n0 C0021b bVar, @C0359n0 ComponentName componentName) {
        this.f2989a = bVar;
        this.f2990b = componentName;
    }

    /* renamed from: c */
    public static void m4270c(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain " + str);
        }
    }

    @C0363p0
    /* renamed from: j */
    public static C0017a m4271j(@C0363p0 C0983w wVar) {
        if (wVar == null) {
            return null;
        }
        return new C0943a(wVar);
    }

    /* renamed from: a */
    public boolean mo4035a(@C0359n0 String str) throws RemoteException {
        return C0948f.m4289a(this.f2989a.mo48p7(new C0946d(str).mo4045b())).f3000a;
    }

    /* renamed from: b */
    public void mo4036b(@C0359n0 String str, int i) throws RemoteException {
        this.f2989a.mo44I7(new C0945c(str, i).mo4044b());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0359n0
    @C0376v0(23)
    /* renamed from: d */
    public Parcelable[] mo4037d() throws RemoteException {
        return C0944b.m4281a(this.f2989a.mo43G5()).f2992a;
    }

    @C0359n0
    /* renamed from: e */
    public ComponentName mo4038e() {
        return this.f2990b;
    }

    @C0363p0
    /* renamed from: f */
    public Bitmap mo4039f() throws RemoteException {
        return (Bitmap) this.f2989a.mo46j3().getParcelable(C0939b0.f2976f);
    }

    /* renamed from: g */
    public int mo4040g() throws RemoteException {
        return this.f2989a.mo47l7();
    }

    /* renamed from: h */
    public boolean mo4041h(@C0359n0 String str, int i, @C0359n0 Notification notification, @C0359n0 String str2) throws RemoteException {
        return C0948f.m4289a(this.f2989a.mo45Q3(new C0947e(str, i, notification, str2).mo4046b())).f3000a;
    }

    @C0363p0
    /* renamed from: i */
    public Bundle mo4042i(@C0359n0 String str, @C0359n0 Bundle bundle, @C0363p0 C0983w wVar) throws RemoteException {
        IBinder iBinder;
        C0017a j = m4271j(wVar);
        if (j == null) {
            iBinder = null;
        } else {
            iBinder = j.asBinder();
        }
        return this.f2989a.mo49s2(str, bundle, iBinder);
    }
}
