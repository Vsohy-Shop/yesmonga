package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.net.a */
public final class C17761a {

    /* renamed from: a */
    public static final int f46164a = 1;

    /* renamed from: b */
    public static final int f46165b = 2;

    /* renamed from: c */
    public static final int f46166c = 3;

    @C0376v0(16)
    /* renamed from: androidx.core.net.a$a */
    public static class C17762a {
        @C0380x0("android.permission.ACCESS_NETWORK_STATE")
        @C0373u
        /* renamed from: a */
        public static boolean m81118a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.net.a$b */
    public static class C17763b {
        @C0373u
        /* renamed from: a */
        public static int m81119a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.net.a$c */
    public @interface C17764c {
    }

    @C0363p0
    @C0380x0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    /* renamed from: a */
    public static NetworkInfo m81115a(@C0359n0 ConnectivityManager connectivityManager, @C0359n0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    /* renamed from: b */
    public static int m81116b(@C0359n0 ConnectivityManager connectivityManager) {
        return C17763b.m81119a(connectivityManager);
    }

    @C0380x0("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: c */
    public static boolean m81117c(@C0359n0 ConnectivityManager connectivityManager) {
        return C17762a.m81118a(connectivityManager);
    }
}
