package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.collection.C1886l;
import androidx.core.location.C17677a;
import androidx.core.p027os.C17781e;
import androidx.core.p027os.C17792h;
import androidx.core.util.C17970d;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.location.w */
public final class C17735w {

    /* renamed from: a */
    public static final long f46109a = 30000;

    /* renamed from: b */
    public static final long f46110b = 10000;

    /* renamed from: c */
    public static final long f46111c = 5;

    /* renamed from: d */
    public static Field f46112d;

    /* renamed from: e */
    public static Class<?> f46113e;

    /* renamed from: f */
    public static Method f46114f;

    /* renamed from: g */
    public static Method f46115g;
    @C0323b0("sLocationListeners")

    /* renamed from: h */
    public static final WeakHashMap<C17746k, WeakReference<C17747l>> f46116h = new WeakHashMap<>();

    @C0376v0(19)
    /* renamed from: androidx.core.location.w$a */
    public static class C17736a {

        /* renamed from: a */
        public static Class<?> f46117a;

        /* renamed from: b */
        public static Method f46118b;

        @C0373u
        /* renamed from: a */
        public static boolean m81016a(LocationManager locationManager, String str, C17751x0 x0Var, C17727s sVar, Looper looper) {
            try {
                if (f46117a == null) {
                    f46117a = Class.forName("android.location.LocationRequest");
                }
                if (f46118b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f46117a, LocationListener.class, Looper.class});
                    f46118b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = x0Var.mo52184i(str);
                if (i != null) {
                    f46118b.invoke(locationManager, new Object[]{i, sVar, looper});
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @C0373u
        /* renamed from: b */
        public static boolean m81017b(LocationManager locationManager, String str, C17751x0 x0Var, C17747l lVar) {
            try {
                if (f46117a == null) {
                    f46117a = Class.forName("android.location.LocationRequest");
                }
                if (f46118b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f46117a, LocationListener.class, Looper.class});
                    f46118b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = x0Var.mo52184i(str);
                if (i != null) {
                    synchronized (C17735w.f46116h) {
                        f46118b.invoke(locationManager, new Object[]{i, lVar, Looper.getMainLooper()});
                        C17735w.m81010p(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.location.w$b */
    public static class C17737b {
        @C0380x0("android.permission.ACCESS_FINE_LOCATION")
        @C0373u
        /* renamed from: a */
        public static boolean m81018a(@C0359n0 LocationManager locationManager, @C0359n0 GnssMeasurementsEvent.Callback callback, @C0359n0 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @C0373u
        /* renamed from: b */
        public static boolean m81019b(LocationManager locationManager, Handler handler, Executor executor, C17677a.C17678a aVar) {
            boolean z;
            if (handler != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81764a(z);
            C1886l<Object, Object> lVar = C17742g.f46127a;
            synchronized (lVar) {
                C17748m mVar = (C17748m) lVar.get(aVar);
                if (mVar == null) {
                    mVar = new C17748m(aVar);
                } else {
                    mVar.mo52169j();
                }
                mVar.mo52168i(executor);
                if (!locationManager.registerGnssStatusCallback(mVar, handler)) {
                    return false;
                }
                lVar.put(aVar, mVar);
                return true;
            }
        }

        @C0373u
        /* renamed from: c */
        public static void m81020c(@C0359n0 LocationManager locationManager, @C0359n0 GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @C0373u
        /* renamed from: d */
        public static void m81021d(LocationManager locationManager, Object obj) {
            if (obj instanceof C17748m) {
                ((C17748m) obj).mo52169j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.location.w$c */
    public static class C17738c {
        @C0373u
        /* renamed from: a */
        public static String m81022a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @C0373u
        /* renamed from: b */
        public static int m81023b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @C0373u
        /* renamed from: c */
        public static boolean m81024c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.location.w$d */
    public static class C17739d {

        /* renamed from: a */
        public static Class<?> f46119a;

        /* renamed from: b */
        public static Method f46120b;

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @C0373u
        /* renamed from: a */
        public static void m81025a(LocationManager locationManager, @C0359n0 String str, @C0363p0 C17781e eVar, @C0359n0 Executor executor, @C0359n0 C17970d<Location> dVar) {
            CancellationSignal cancellationSignal;
            if (eVar != null) {
                cancellationSignal = (CancellationSignal) eVar.mo52220b();
            } else {
                cancellationSignal = null;
            }
            Objects.requireNonNull(dVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new C17686c0(dVar));
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @C0373u
        /* renamed from: b */
        public static boolean m81026b(LocationManager locationManager, Handler handler, Executor executor, C17677a.C17678a aVar) {
            C1886l<Object, Object> lVar = C17742g.f46127a;
            synchronized (lVar) {
                C17743h hVar = (C17743h) lVar.get(aVar);
                if (hVar == null) {
                    hVar = new C17743h(aVar);
                }
                if (!locationManager.registerGnssStatusCallback(executor, hVar)) {
                    return false;
                }
                lVar.put(aVar, hVar);
                return true;
            }
        }

        @C0373u
        /* renamed from: c */
        public static boolean m81027c(LocationManager locationManager, String str, C17751x0 x0Var, Executor executor, C17727s sVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f46119a == null) {
                        f46119a = Class.forName("android.location.LocationRequest");
                    }
                    if (f46120b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{f46119a, Executor.class, LocationListener.class});
                        f46120b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i = x0Var.mo52184i(str);
                    if (i != null) {
                        f46120b.invoke(locationManager, new Object[]{i, executor, sVar});
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.core.location.w$e */
    public static class C17740e {
        @C0373u
        /* renamed from: a */
        public static boolean m81028a(LocationManager locationManager, @C0359n0 String str) {
            return locationManager.hasProvider(str);
        }

        @C0380x0("android.permission.ACCESS_FINE_LOCATION")
        @C0373u
        /* renamed from: b */
        public static boolean m81029b(@C0359n0 LocationManager locationManager, @C0359n0 Executor executor, @C0359n0 GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @C0373u
        /* renamed from: c */
        public static void m81030c(LocationManager locationManager, @C0359n0 String str, @C0359n0 LocationRequest locationRequest, @C0359n0 Executor executor, @C0359n0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: androidx.core.location.w$f */
    public static final class C17741f implements LocationListener {

        /* renamed from: a */
        public final LocationManager f46121a;

        /* renamed from: b */
        public final Executor f46122b;

        /* renamed from: c */
        public final Handler f46123c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public C17970d<Location> f46124d;
        @C0323b0("this")

        /* renamed from: e */
        public boolean f46125e;
        @C0363p0

        /* renamed from: f */
        public Runnable f46126f;

        public C17741f(LocationManager locationManager, Executor executor, C17970d<Location> dVar) {
            this.f46121a = locationManager;
            this.f46122b = executor;
            this.f46124d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m81034f() {
            this.f46126f = null;
            onLocationChanged((Location) null);
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* renamed from: c */
        public void mo52143c() {
            synchronized (this) {
                if (!this.f46125e) {
                    this.f46125e = true;
                    mo52144d();
                }
            }
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* renamed from: d */
        public final void mo52144d() {
            this.f46124d = null;
            this.f46121a.removeUpdates(this);
            Runnable runnable = this.f46126f;
            if (runnable != null) {
                this.f46123c.removeCallbacks(runnable);
                this.f46126f = null;
            }
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: g */
        public void mo52145g(long j) {
            synchronized (this) {
                if (!this.f46125e) {
                    C17700g0 g0Var = new C17700g0(this);
                    this.f46126f = g0Var;
                    this.f46123c.postDelayed(g0Var, j);
                }
            }
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@C0363p0 Location location) {
            synchronized (this) {
                if (!this.f46125e) {
                    this.f46125e = true;
                    this.f46122b.execute(new C17706h0(this.f46124d, location));
                    mo52144d();
                }
            }
        }

        @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@C0359n0 String str) {
            onLocationChanged((Location) null);
        }

        public void onProviderEnabled(@C0359n0 String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: androidx.core.location.w$g */
    public static class C17742g {
        @C0323b0("sGnssStatusListeners")

        /* renamed from: a */
        public static final C1886l<Object, Object> f46127a = new C1886l<>();
    }

    @C0376v0(30)
    /* renamed from: androidx.core.location.w$h */
    public static class C17743h extends GnssStatus.Callback {

        /* renamed from: a */
        public final C17677a.C17678a f46128a;

        public C17743h(C17677a.C17678a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "invalid null callback");
            this.f46128a = aVar;
        }

        public void onFirstFix(int i) {
            this.f46128a.mo52109a(i);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f46128a.mo52110b(C17677a.m80880n(gnssStatus));
        }

        public void onStarted() {
            this.f46128a.mo52111c();
        }

        public void onStopped() {
            this.f46128a.mo52112d();
        }
    }

    /* renamed from: androidx.core.location.w$i */
    public static class C17744i implements GpsStatus.Listener {

        /* renamed from: a */
        public final LocationManager f46129a;

        /* renamed from: b */
        public final C17677a.C17678a f46130b;
        @C0363p0

        /* renamed from: c */
        public volatile Executor f46131c;

        public C17744i(LocationManager locationManager, C17677a.C17678a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "invalid null callback");
            this.f46129a = locationManager;
            this.f46130b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m81042e(Executor executor) {
            if (this.f46131c == executor) {
                this.f46130b.mo52111c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m81043f(Executor executor) {
            if (this.f46131c == executor) {
                this.f46130b.mo52112d();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m81044g(Executor executor, int i) {
            if (this.f46131c == executor) {
                this.f46130b.mo52109a(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m81045h(Executor executor, C17677a aVar) {
            if (this.f46131c == executor) {
                this.f46130b.mo52110b(aVar);
            }
        }

        /* renamed from: i */
        public void mo52154i(Executor executor) {
            boolean z;
            if (this.f46131c == null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81777n(z);
            this.f46131c = executor;
        }

        /* renamed from: j */
        public void mo52155j() {
            this.f46131c = null;
        }

        @C0380x0("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            Executor executor = this.f46131c;
            if (executor != null) {
                if (i == 1) {
                    executor.execute(new C17708i0(this, executor));
                } else if (i == 2) {
                    executor.execute(new C17710j0(this, executor));
                } else if (i == 3) {
                    GpsStatus gpsStatus2 = this.f46129a.getGpsStatus((GpsStatus) null);
                    if (gpsStatus2 != null) {
                        executor.execute(new C17712k0(this, executor, gpsStatus2.getTimeToFirstFix()));
                    }
                } else if (i == 4 && (gpsStatus = this.f46129a.getGpsStatus((GpsStatus) null)) != null) {
                    executor.execute(new C17714l0(this, executor, C17677a.m80881o(gpsStatus)));
                }
            }
        }
    }

    /* renamed from: androidx.core.location.w$j */
    public static final class C17745j implements Executor {

        /* renamed from: a */
        public final Handler f46132a;

        public C17745j(@C0359n0 Handler handler) {
            this.f46132a = (Handler) C18001r.m81775l(handler);
        }

        public void execute(@C0359n0 Runnable runnable) {
            if (Looper.myLooper() == this.f46132a.getLooper()) {
                runnable.run();
            } else if (!this.f46132a.post((Runnable) C18001r.m81775l(runnable))) {
                throw new RejectedExecutionException(this.f46132a + " is shutting down");
            }
        }
    }

    /* renamed from: androidx.core.location.w$k */
    public static class C17746k {

        /* renamed from: a */
        public final String f46133a;

        /* renamed from: b */
        public final C17727s f46134b;

        public C17746k(String str, C17727s sVar) {
            this.f46133a = (String) C17992m.m81744e(str, "invalid null provider");
            this.f46134b = (C17727s) C17992m.m81744e(sVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C17746k)) {
                return false;
            }
            C17746k kVar = (C17746k) obj;
            if (!this.f46133a.equals(kVar.f46133a) || !this.f46134b.equals(kVar.f46134b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C17992m.m81741b(this.f46133a, this.f46134b);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.location.w$m */
    public static class C17748m extends GnssStatus.Callback {

        /* renamed from: a */
        public final C17677a.C17678a f46137a;
        @C0363p0

        /* renamed from: b */
        public volatile Executor f46138b;

        public C17748m(C17677a.C17678a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "invalid null callback");
            this.f46137a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m81066e(Executor executor, int i) {
            if (this.f46138b == executor) {
                this.f46137a.mo52109a(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m81067f(Executor executor, GnssStatus gnssStatus) {
            if (this.f46138b == executor) {
                this.f46137a.mo52110b(C17677a.m80880n(gnssStatus));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m81068g(Executor executor) {
            if (this.f46138b == executor) {
                this.f46137a.mo52111c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m81069h(Executor executor) {
            if (this.f46138b == executor) {
                this.f46137a.mo52112d();
            }
        }

        /* renamed from: i */
        public void mo52168i(Executor executor) {
            boolean z;
            boolean z2 = true;
            if (executor != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "invalid null executor");
            if (this.f46138b != null) {
                z2 = false;
            }
            C18001r.m81777n(z2);
            this.f46138b = executor;
        }

        /* renamed from: j */
        public void mo52169j() {
            this.f46138b = null;
        }

        public void onFirstFix(int i) {
            Executor executor = this.f46138b;
            if (executor != null) {
                executor.execute(new C17732u0(this, executor, i));
            }
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f46138b;
            if (executor != null) {
                executor.execute(new C17730t0(this, executor, gnssStatus));
            }
        }

        public void onStarted() {
            Executor executor = this.f46138b;
            if (executor != null) {
                executor.execute(new C17728s0(this, executor));
            }
        }

        public void onStopped() {
            Executor executor = this.f46138b;
            if (executor != null) {
                executor.execute(new C17734v0(this, executor));
            }
        }
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: c */
    public static void m80997c(@C0359n0 LocationManager locationManager, @C0359n0 String str, @C0363p0 C17781e eVar, @C0359n0 Executor executor, @C0359n0 C17970d<Location> dVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C17739d.m81025a(locationManager, str, eVar, executor, dVar);
            return;
        }
        if (eVar != null) {
            eVar.mo52223e();
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null || SystemClock.elapsedRealtime() - C17702h.m80950c(lastKnownLocation) >= 10000) {
            C17741f fVar = new C17741f(locationManager, executor, dVar);
            locationManager.requestLocationUpdates(str, 0, 0.0f, fVar, Looper.getMainLooper());
            if (eVar != null) {
                eVar.mo52222d(new C17733v(fVar));
            }
            fVar.mo52145g(30000);
            return;
        }
        executor.execute(new C17731u(dVar, lastKnownLocation));
    }

    @C0363p0
    /* renamed from: d */
    public static String m80998d(@C0359n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17738c.m81022a(locationManager);
        }
        return null;
    }

    /* renamed from: e */
    public static int m80999e(@C0359n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17738c.m81023b(locationManager);
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m81000f(@C0359n0 LocationManager locationManager, @C0359n0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C17740e.m81028a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            if (locationManager.getProvider(str) != null) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m81001g(@C0359n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17738c.m81024c(locationManager);
        }
        if (locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps")) {
            return true;
        }
        return false;
    }

    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    @C0376v0(24)
    /* renamed from: j */
    public static boolean m81004j(@C0359n0 LocationManager locationManager, @C0359n0 GnssMeasurementsEvent.Callback callback, @C0359n0 Handler handler) {
        if (Build.VERSION.SDK_INT != 30) {
            return C17737b.m81018a(locationManager, callback, handler);
        }
        return m81006l(locationManager, C17792h.m81182a(handler), callback);
    }

    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    @C0376v0(30)
    /* renamed from: k */
    public static boolean m81005k(@C0359n0 LocationManager locationManager, @C0359n0 Executor executor, @C0359n0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT > 30) {
            return C17740e.m81029b(locationManager, executor, callback);
        }
        return m81006l(locationManager, executor, callback);
    }

    @C0376v0(30)
    /* renamed from: l */
    public static boolean m81006l(@C0359n0 LocationManager locationManager, @C0359n0 Executor executor, @C0359n0 GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f46113e == null) {
                    f46113e = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f46114f == null) {
                    Method declaredMethod = f46113e.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
                    f46114f = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f46115g == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", new Class[]{Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class});
                    f46115g = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f46115g.invoke(locationManager, new Object[]{f46114f.invoke(f46113e.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback});
                if (invoke == null || !((Boolean) invoke).booleanValue()) {
                    return false;
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: m */
    public static boolean m81007m(LocationManager locationManager, Handler handler, Executor executor, C17677a.C17678a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17739d.m81026b(locationManager, handler, executor, aVar);
        }
        return C17737b.m81019b(locationManager, handler, executor, aVar);
    }

    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: n */
    public static boolean m81008n(@C0359n0 LocationManager locationManager, @C0359n0 C17677a.C17678a aVar, @C0359n0 Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m81009o(locationManager, C17792h.m81182a(handler), aVar);
        }
        return m81009o(locationManager, new C17745j(handler), aVar);
    }

    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: o */
    public static boolean m81009o(@C0359n0 LocationManager locationManager, @C0359n0 Executor executor, @C0359n0 C17677a.C17678a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m81007m(locationManager, (Handler) null, executor, aVar);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m81007m(locationManager, new Handler(myLooper), executor, aVar);
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @C0323b0("sLocationListeners")
    /* renamed from: p */
    public static void m81010p(LocationManager locationManager, C17747l lVar) {
        C17747l lVar2;
        WeakReference put = f46116h.put(lVar.mo52160g(), new WeakReference(lVar));
        if (put != null) {
            lVar2 = (C17747l) put.get();
        } else {
            lVar2 = null;
        }
        if (lVar2 != null) {
            lVar2.mo52161n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: q */
    public static void m81011q(@C0359n0 LocationManager locationManager, @C0359n0 C17727s sVar) {
        WeakHashMap<C17746k, WeakReference<C17747l>> weakHashMap = f46116h;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            for (WeakReference<C17747l> weakReference : weakHashMap.values()) {
                C17747l lVar = (C17747l) weakReference.get();
                if (lVar != null) {
                    C17746k g = lVar.mo52160g();
                    if (g.f46134b == sVar) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(g);
                        lVar.mo52161n();
                        locationManager.removeUpdates(lVar);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f46116h.remove((C17746k) it.next());
                }
            }
        }
        locationManager.removeUpdates(sVar);
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: r */
    public static void m81012r(@C0359n0 LocationManager locationManager, @C0359n0 String str, @C0359n0 C17751x0 x0Var, @C0359n0 C17727s sVar, @C0359n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C17740e.m81030c(locationManager, str, x0Var.mo52182h(), C17792h.m81182a(new Handler(looper)), sVar);
        } else if (!C17736a.m81016a(locationManager, str, x0Var, sVar, looper)) {
            locationManager.requestLocationUpdates(str, x0Var.mo52175b(), x0Var.mo52178e(), sVar, looper);
        }
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: s */
    public static void m81013s(@C0359n0 LocationManager locationManager, @C0359n0 String str, @C0359n0 C17751x0 x0Var, @C0359n0 Executor executor, @C0359n0 C17727s sVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C17740e.m81030c(locationManager, str, x0Var.mo52182h(), executor, sVar);
        } else if (i < 30 || !C17739d.m81027c(locationManager, str, x0Var, executor, sVar)) {
            C17747l lVar = new C17747l(new C17746k(str, sVar), executor);
            if (!C17736a.m81017b(locationManager, str, x0Var, lVar)) {
                synchronized (f46116h) {
                    locationManager.requestLocationUpdates(str, x0Var.mo52175b(), x0Var.mo52178e(), lVar, Looper.getMainLooper());
                    m81010p(locationManager, lVar);
                }
            }
        }
    }

    @C0376v0(24)
    /* renamed from: t */
    public static void m81014t(@C0359n0 LocationManager locationManager, @C0359n0 GnssMeasurementsEvent.Callback callback) {
        C17737b.m81020c(locationManager, callback);
    }

    /* renamed from: u */
    public static void m81015u(@C0359n0 LocationManager locationManager, @C0359n0 C17677a.C17678a aVar) {
        C1886l<Object, Object> lVar = C17742g.f46127a;
        synchronized (lVar) {
            Object remove = lVar.remove(aVar);
            if (remove != null) {
                C17737b.m81021d(locationManager, remove);
            }
        }
    }

    /* renamed from: androidx.core.location.w$l */
    public static class C17747l implements LocationListener {
        @C0363p0

        /* renamed from: a */
        public volatile C17746k f46135a;

        /* renamed from: b */
        public final Executor f46136b;

        public C17747l(@C0363p0 C17746k kVar, Executor executor) {
            this.f46135a = kVar;
            this.f46136b = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m81054h(int i) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onFlushComplete(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m81055i(Location location) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onLocationChanged(location);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m81056j(List list) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onLocationChanged(list);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m81057k(String str) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onProviderDisabled(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m81058l(String str) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onProviderEnabled(str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m81059m(String str, int i, Bundle bundle) {
            C17746k kVar = this.f46135a;
            if (kVar != null) {
                kVar.f46134b.onStatusChanged(str, i, bundle);
            }
        }

        /* renamed from: g */
        public C17746k mo52160g() {
            return (C17746k) C17992m.m81743d(this.f46135a);
        }

        /* renamed from: n */
        public void mo52161n() {
            this.f46135a = null;
        }

        public void onFlushComplete(int i) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17718n0(this, i));
            }
        }

        public void onLocationChanged(@C0359n0 Location location) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17724q0(this, location));
            }
        }

        public void onProviderDisabled(@C0359n0 String str) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17722p0(this, str));
            }
        }

        public void onProviderEnabled(@C0359n0 String str) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17716m0(this, str));
            }
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17726r0(this, str, i, bundle));
            }
        }

        public void onLocationChanged(@C0359n0 List<Location> list) {
            if (this.f46135a != null) {
                this.f46136b.execute(new C17720o0(this, list));
            }
        }
    }
}
