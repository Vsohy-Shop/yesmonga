package com.urbanairship.analytics;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9642c0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.urbanairship.analytics.i */
public abstract class C35554i {

    /* renamed from: E0 */
    public static final String f87757E0 = "lib_version";

    /* renamed from: F0 */
    public static final String f87758F0 = "package_version";

    /* renamed from: G0 */
    public static final String f87759G0 = "last_metadata";

    /* renamed from: H0 */
    public static final int f87760H0 = 0;

    /* renamed from: I0 */
    public static final int f87761I0 = 1;

    /* renamed from: J0 */
    public static final int f87762J0 = 2;

    /* renamed from: X */
    public static final String f87763X = "time_zone";

    /* renamed from: Y */
    public static final String f87764Y = "daylight_savings";

    /* renamed from: Z */
    public static final String f87765Z = "os_version";

    /* renamed from: c */
    public static final String f87766c = "type";

    /* renamed from: d */
    public static final String f87767d = "time";

    /* renamed from: e */
    public static final String f87768e = "data";

    /* renamed from: f */
    public static final String f87769f = "event_id";

    /* renamed from: g */
    public static final String f87770g = "session_id";

    /* renamed from: v */
    public static final String f87771v = "connection_type";

    /* renamed from: w */
    public static final String f87772w = "connection_subtype";

    /* renamed from: x */
    public static final String f87773x = "carrier";

    /* renamed from: y */
    public static final String f87774y = "push_id";

    /* renamed from: z */
    public static final String f87775z = "metadata";

    /* renamed from: a */
    public final String f87776a;

    /* renamed from: b */
    public final String f87777b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.analytics.i$a */
    public @interface C35555a {
    }

    public C35554i(long j) {
        this.f87776a = UUID.randomUUID().toString();
        this.f87777b = m146722m(j);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public static String m146722m(long j) {
        return String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(((double) j) / 1000.0d)});
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public String mo106515a(@C0359n0 String str) {
        C9323b.C9325b y = C9323b.m35017y();
        y.mo18823g("type", mo18412j()).mo18823g("event_id", this.f87776a).mo18823g("time", this.f87777b).mo18822f("data", C9323b.m35017y().mo18825i(mo18411e()).mo18823g("session_id", str).mo18817a());
        return y.mo18817a().toString();
    }

    @C0363p0
    /* renamed from: b */
    public String mo106516b() {
        return C9642c0.m36129a();
    }

    @C0359n0
    /* renamed from: c */
    public String mo106517c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) UAirship.m146200l().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "";
            }
            return activeNetworkInfo.getSubtypeName();
        } catch (ClassCastException e) {
            C36059m.m148409e("Connection subtype lookup failed", e);
            return "";
        }
    }

    @C0359n0
    /* renamed from: d */
    public String mo106518d() {
        int i;
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) UAirship.m146200l().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            i = -1;
        } else {
            i = activeNetworkInfo.getType();
        }
        if (i == 0) {
            return "cell";
        }
        if (i == 1) {
            return "wifi";
        }
        if (i != 6) {
            return "none";
        }
        return "wimax";
    }

    @C0344h1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public abstract C9323b mo18411e();

    @C0359n0
    /* renamed from: f */
    public String mo106519f() {
        return this.f87776a;
    }

    /* renamed from: g */
    public int mo106520g() {
        return 1;
    }

    @C0359n0
    /* renamed from: h */
    public String mo106521h() {
        return this.f87777b;
    }

    /* renamed from: i */
    public long mo106522i() {
        return (long) (Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
    }

    @C0359n0
    /* renamed from: j */
    public abstract String mo18412j();

    /* renamed from: k */
    public boolean mo106523k() {
        return Calendar.getInstance().getTimeZone().inDaylightTime(new Date());
    }

    /* renamed from: l */
    public boolean mo106481l() {
        return true;
    }

    public C35554i() {
        this(System.currentTimeMillis());
    }
}
