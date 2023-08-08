package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0380x0;
import androidx.core.content.C17490t0;
import com.urbanairship.AirshipConfigOptions;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.c0 */
public class C0465c0 {

    /* renamed from: d */
    public static final String f1160d = "TwilightManager";

    /* renamed from: e */
    public static final int f1161e = 6;

    /* renamed from: f */
    public static final int f1162f = 22;

    /* renamed from: g */
    public static C0465c0 f1163g;

    /* renamed from: a */
    public final Context f1164a;

    /* renamed from: b */
    public final LocationManager f1165b;

    /* renamed from: c */
    public final C0466a f1166c = new C0466a();

    /* renamed from: androidx.appcompat.app.c0$a */
    public static class C0466a {

        /* renamed from: a */
        public boolean f1167a;

        /* renamed from: b */
        public long f1168b;
    }

    @C0344h1
    public C0465c0(@C0359n0 Context context, @C0359n0 LocationManager locationManager) {
        this.f1164a = context;
        this.f1165b = locationManager;
    }

    /* renamed from: a */
    public static C0465c0 m1993a(@C0359n0 Context context) {
        if (f1163g == null) {
            Context applicationContext = context.getApplicationContext();
            f1163g = new C0465c0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1163g;
    }

    @C0344h1
    /* renamed from: f */
    public static void m1994f(C0465c0 c0Var) {
        f1163g = c0Var;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location mo1367b() {
        Location location;
        Location location2 = null;
        if (C17490t0.m80263d(this.f1164a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = mo1368c("network");
        } else {
            location = null;
        }
        if (C17490t0.m80263d(this.f1164a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = mo1368c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: c */
    public final Location mo1368c(String str) {
        try {
            if (this.f1165b.isProviderEnabled(str)) {
                return this.f1165b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo1369d() {
        C0466a aVar = this.f1166c;
        if (mo1370e()) {
            return aVar.f1167a;
        }
        Location b = mo1367b();
        if (b != null) {
            mo1371g(b);
            return aVar.f1167a;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo1370e() {
        return this.f1166c.f1168b > System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo1371g(@C0359n0 Location location) {
        long j;
        long j2;
        C0466a aVar = this.f1166c;
        long currentTimeMillis = System.currentTimeMillis();
        C0462b0 b = C0462b0.m1988b();
        C0462b0 b0Var = b;
        b0Var.mo1366a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b0Var.mo1366a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f1154c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j3 = b.f1153b;
        long j4 = b.f1152a;
        long j5 = j4;
        double latitude = location.getLatitude();
        long j6 = j3;
        b.mo1366a(currentTimeMillis + 86400000, latitude, location.getLongitude());
        long j7 = b.f1153b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j5) {
                j2 = j7 + 0;
            } else if (currentTimeMillis > j6) {
                j2 = j5 + 0;
            } else {
                j2 = j6 + 0;
            }
            j = j2 + AirshipConfigOptions.f87111Y;
        }
        aVar.f1167a = z2;
        aVar.f1168b = j;
    }
}
