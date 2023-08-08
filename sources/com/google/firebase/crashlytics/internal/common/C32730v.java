package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.installations.C33088k;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.crashlytics.internal.common.v */
public class C32730v implements C32731w {

    /* renamed from: g */
    public static final String f79461g = "0.0";

    /* renamed from: h */
    public static final String f79462h = "crashlytics.advertising.id";

    /* renamed from: i */
    public static final String f79463i = "crashlytics.installation.id";

    /* renamed from: j */
    public static final String f79464j = "firebase.installation.id";

    /* renamed from: k */
    public static final String f79465k = "crashlytics.installation.id";

    /* renamed from: l */
    public static final Pattern f79466l = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: m */
    public static final String f79467m = "SYN_";

    /* renamed from: n */
    public static final String f79468n = Pattern.quote("/");

    /* renamed from: a */
    public final C32732x f79469a;

    /* renamed from: b */
    public final Context f79470b;

    /* renamed from: c */
    public final String f79471c;

    /* renamed from: d */
    public final C33088k f79472d;

    /* renamed from: e */
    public final C32724s f79473e;

    /* renamed from: f */
    public String f79474f;

    public C32730v(Context context, String str, C33088k kVar, C32724s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f79470b = context;
            this.f79471c = str;
            this.f79472d = kVar;
            this.f79473e = sVar;
            this.f79469a = new C32732x();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: c */
    public static String m132203c() {
        return f79467m + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m132204e(String str) {
        if (str == null) {
            return null;
        }
        return f79466l.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m132205k(String str) {
        if (str == null || !str.startsWith(f79467m)) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: a */
    public synchronized String mo95029a() {
        String str = this.f79474f;
        if (str != null) {
            return str;
        }
        C32741f.m132248f().mo95060k("Determining Crashlytics installation ID...");
        SharedPreferences t = CommonUtils.m131938t(this.f79470b);
        String string = t.getString(f79464j, (String) null);
        C32741f f = C32741f.m132248f();
        f.mo95060k("Cached Firebase Installation ID: " + string);
        if (this.f79473e.mo95022d()) {
            String d = mo95031d();
            C32741f f2 = C32741f.m132248f();
            f2.mo95060k("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = m132203c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f79474f = mo95037l(t);
            } else {
                this.f79474f = mo95030b(d, t);
            }
        } else if (m132205k(string)) {
            this.f79474f = mo95037l(t);
        } else {
            this.f79474f = mo95030b(m132203c(), t);
        }
        if (this.f79474f == null) {
            C32741f.m132248f().mo95062m("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f79474f = mo95030b(m132203c(), t);
        }
        C32741f f3 = C32741f.m132248f();
        f3.mo95060k("Crashlytics installation ID: " + this.f79474f);
        return this.f79474f;
    }

    @C0359n0
    /* renamed from: b */
    public final synchronized String mo95030b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m132204e(UUID.randomUUID().toString());
        C32741f f = C32741f.m132248f();
        f.mo95060k("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString(f79464j, str).apply();
        return e;
    }

    @C0363p0
    /* renamed from: d */
    public final String mo95031d() {
        try {
            return (String) C32720q0.m132170d(this.f79472d.getId());
        } catch (Exception e) {
            C32741f.m132248f().mo95063n("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo95032f() {
        return this.f79471c;
    }

    /* renamed from: g */
    public String mo95033g() {
        return this.f79469a.mo95039a(this.f79470b);
    }

    /* renamed from: h */
    public String mo95034h() {
        return String.format(Locale.US, "%s/%s", new Object[]{mo95038m(Build.MANUFACTURER), mo95038m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo95035i() {
        return mo95038m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo95036j() {
        return mo95038m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String mo95037l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    public final String mo95038m(String str) {
        return str.replaceAll(f79468n, "");
    }
}
