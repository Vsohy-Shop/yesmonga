package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.C0021b;
import androidx.annotation.C0339g;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.browser.trusted.C0942c0;
import androidx.core.app.C17180n4;
import com.google.firebase.messaging.C33202j0;
import java.util.Locale;

/* renamed from: androidx.browser.trusted.b0 */
public abstract class C0939b0 extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})

    /* renamed from: d */
    public static final String f2974d = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";

    /* renamed from: e */
    public static final String f2975e = "android.support.customtabs.trusted.SMALL_ICON";

    /* renamed from: f */
    public static final String f2976f = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";

    /* renamed from: g */
    public static final String f2977g = "androidx.browser.trusted.SUCCESS";

    /* renamed from: v */
    public static final int f2978v = -1;

    /* renamed from: a */
    public NotificationManager f2979a;

    /* renamed from: b */
    public int f2980b = -1;

    /* renamed from: c */
    public final C0021b.C0023b f2981c = new C0940a();

    /* renamed from: androidx.browser.trusted.b0$a */
    public class C0940a extends C0021b.C0023b {
        public C0940a() {
        }

        /* renamed from: G5 */
        public Bundle mo43G5() {
            mo4034T6();
            return new C0942c0.C0944b(C0939b0.this.mo4027g()).mo4043b();
        }

        /* renamed from: I7 */
        public void mo44I7(Bundle bundle) {
            mo4034T6();
            C0942c0.C0945c a = C0942c0.C0945c.m4283a(bundle);
            C0939b0.this.mo4025e(a.f2993a, a.f2994b);
        }

        /* renamed from: Q3 */
        public Bundle mo45Q3(Bundle bundle) {
            mo4034T6();
            C0942c0.C0947e a = C0942c0.C0947e.m4287a(bundle);
            return new C0942c0.C0948f(C0939b0.this.mo4030j(a.f2996a, a.f2997b, a.f2998c, a.f2999d)).mo4047b();
        }

        /* renamed from: T6 */
        public final void mo4034T6() {
            C0939b0 b0Var = C0939b0.this;
            if (b0Var.f2980b == -1) {
                String[] packagesForUid = b0Var.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                C0971s a = C0939b0.this.mo4023c().mo4073a();
                PackageManager packageManager = C0939b0.this.getPackageManager();
                if (a != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (a.mo4059c(packagesForUid[i], packageManager)) {
                            C0939b0.this.f2980b = Binder.getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (C0939b0.this.f2980b != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        /* renamed from: j3 */
        public Bundle mo46j3() {
            mo4034T6();
            return C0939b0.this.mo4028h();
        }

        /* renamed from: l7 */
        public int mo47l7() {
            mo4034T6();
            return C0939b0.this.mo4029i();
        }

        /* renamed from: p7 */
        public Bundle mo48p7(Bundle bundle) {
            mo4034T6();
            return new C0942c0.C0948f(C0939b0.this.mo4024d(C0942c0.C0946d.m4285a(bundle).f2995a)).mo4047b();
        }

        /* renamed from: s2 */
        public Bundle mo49s2(String str, Bundle bundle, IBinder iBinder) {
            mo4034T6();
            return C0939b0.this.mo4026f(str, bundle, C0984x.m4349a(iBinder));
        }
    }

    /* renamed from: a */
    public static String m4251a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void mo4022b() {
        if (this.f2979a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @C0339g
    @C0359n0
    /* renamed from: c */
    public abstract C0982v mo4023c();

    @C0339g
    /* renamed from: d */
    public boolean mo4024d(@C0359n0 String str) {
        mo4022b();
        if (!C17180n4.m79433p(this).mo51601a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return C0959k.m4308b(this.f2979a, m4251a(str));
    }

    @C0339g
    /* renamed from: e */
    public void mo4025e(@C0359n0 String str, int i) {
        mo4022b();
        this.f2979a.cancel(str, i);
    }

    @C0363p0
    @C0339g
    /* renamed from: f */
    public Bundle mo4026f(@C0359n0 String str, @C0359n0 Bundle bundle, @C0363p0 C0984x xVar) {
        return null;
    }

    @C0339g
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public Parcelable[] mo4027g() {
        mo4022b();
        return C0949d.m4291a(this.f2979a);
    }

    @C0339g
    @C0359n0
    /* renamed from: h */
    public Bundle mo4028h() {
        int i = mo4029i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable(f2976f, BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    @C0339g
    /* renamed from: i */
    public int mo4029i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(f2975e, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @C0339g
    /* renamed from: j */
    public boolean mo4030j(@C0359n0 String str, int i, @C0359n0 Notification notification, @C0359n0 String str2) {
        mo4022b();
        if (!C17180n4.m79433p(this).mo51601a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String a = m4251a(str2);
            notification = C0959k.m4307a(this, this.f2979a, notification, a, str2);
            if (!C0959k.m4308b(this.f2979a, a)) {
                return false;
            }
        }
        this.f2979a.notify(str, i, notification);
        return true;
    }

    @C0363p0
    @C0353k0
    public final IBinder onBind(@C0363p0 Intent intent) {
        return this.f2981c;
    }

    @C0353k0
    @C0346i
    public void onCreate() {
        super.onCreate();
        this.f2979a = (NotificationManager) getSystemService(C33202j0.f80718b);
    }

    @C0353k0
    public final boolean onUnbind(@C0363p0 Intent intent) {
        this.f2980b = -1;
        return super.onUnbind(intent);
    }
}
