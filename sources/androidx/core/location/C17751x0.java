package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17985h0;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.core.location.x0 */
public final class C17751x0 {

    /* renamed from: h */
    public static final long f46139h = Long.MAX_VALUE;

    /* renamed from: i */
    public static final int f46140i = 100;

    /* renamed from: j */
    public static final int f46141j = 102;

    /* renamed from: k */
    public static final int f46142k = 104;

    /* renamed from: l */
    public static final long f46143l = -1;

    /* renamed from: a */
    public final int f46144a;

    /* renamed from: b */
    public final long f46145b;

    /* renamed from: c */
    public final long f46146c;

    /* renamed from: d */
    public final long f46147d;

    /* renamed from: e */
    public final int f46148e;

    /* renamed from: f */
    public final float f46149f;

    /* renamed from: g */
    public final long f46150g;

    @C0376v0(19)
    /* renamed from: androidx.core.location.x0$a */
    public static class C17752a {

        /* renamed from: a */
        public static Class<?> f46151a;

        /* renamed from: b */
        public static Method f46152b;

        /* renamed from: c */
        public static Method f46153c;

        /* renamed from: d */
        public static Method f46154d;

        /* renamed from: e */
        public static Method f46155e;

        /* renamed from: f */
        public static Method f46156f;

        /* renamed from: a */
        public static Object m81083a(C17751x0 x0Var, String str) {
            try {
                if (f46151a == null) {
                    f46151a = Class.forName("android.location.LocationRequest");
                }
                if (f46152b == null) {
                    Method declaredMethod = f46151a.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});
                    f46152b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f46152b.invoke((Object) null, new Object[]{str, Long.valueOf(x0Var.mo52175b()), Float.valueOf(x0Var.mo52178e()), Boolean.FALSE});
                if (invoke == null) {
                    return null;
                }
                if (f46153c == null) {
                    Method declaredMethod2 = f46151a.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});
                    f46153c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f46153c.invoke(invoke, new Object[]{Integer.valueOf(x0Var.mo52181g())});
                if (f46154d == null) {
                    Method declaredMethod3 = f46151a.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});
                    f46154d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f46154d.invoke(invoke, new Object[]{Long.valueOf(x0Var.mo52180f())});
                if (x0Var.mo52177d() < Integer.MAX_VALUE) {
                    if (f46155e == null) {
                        Method declaredMethod4 = f46151a.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});
                        f46155e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f46155e.invoke(invoke, new Object[]{Integer.valueOf(x0Var.mo52177d())});
                }
                if (x0Var.mo52174a() < Long.MAX_VALUE) {
                    if (f46156f == null) {
                        Method declaredMethod5 = f46151a.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});
                        f46156f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f46156f.invoke(invoke, new Object[]{Long.valueOf(x0Var.mo52174a())});
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.core.location.x0$b */
    public static class C17753b {
        @C0373u
        /* renamed from: a */
        public static LocationRequest m81084a(C17751x0 x0Var) {
            C17701g1.m80947a();
            return C17698f1.m80930a(x0Var.mo52175b()).setQuality(x0Var.mo52181g()).setMinUpdateIntervalMillis(x0Var.mo52180f()).setDurationMillis(x0Var.mo52174a()).setMaxUpdates(x0Var.mo52177d()).setMinUpdateDistanceMeters(x0Var.mo52178e()).setMaxUpdateDelayMillis(x0Var.mo52176c()).build();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.location.x0$d */
    public @interface C17755d {
    }

    public C17751x0(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f46145b = j;
        this.f46144a = i;
        this.f46146c = j3;
        this.f46147d = j2;
        this.f46148e = i2;
        this.f46149f = f;
        this.f46150g = j4;
    }

    @C0337f0(from = 1)
    /* renamed from: a */
    public long mo52174a() {
        return this.f46147d;
    }

    @C0337f0(from = 0)
    /* renamed from: b */
    public long mo52175b() {
        return this.f46145b;
    }

    @C0337f0(from = 0)
    /* renamed from: c */
    public long mo52176c() {
        return this.f46150g;
    }

    @C0337f0(from = 1, mo995to = 2147483647L)
    /* renamed from: d */
    public int mo52177d() {
        return this.f46148e;
    }

    @C0379x(from = 0.0d, mo1016to = 3.4028234663852886E38d)
    /* renamed from: e */
    public float mo52178e() {
        return this.f46149f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17751x0)) {
            return false;
        }
        C17751x0 x0Var = (C17751x0) obj;
        if (this.f46144a == x0Var.f46144a && this.f46145b == x0Var.f46145b && this.f46146c == x0Var.f46146c && this.f46147d == x0Var.f46147d && this.f46148e == x0Var.f46148e && Float.compare(x0Var.f46149f, this.f46149f) == 0 && this.f46150g == x0Var.f46150g) {
            return true;
        }
        return false;
    }

    @C0337f0(from = 0)
    /* renamed from: f */
    public long mo52180f() {
        long j = this.f46146c;
        if (j == -1) {
            return this.f46145b;
        }
        return j;
    }

    /* renamed from: g */
    public int mo52181g() {
        return this.f46144a;
    }

    @C0359n0
    @C0376v0(31)
    /* renamed from: h */
    public LocationRequest mo52182h() {
        return C17753b.m81084a(this);
    }

    public int hashCode() {
        long j = this.f46145b;
        long j2 = this.f46146c;
        return (((this.f46144a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @C0363p0
    @SuppressLint({"NewApi"})
    @C0376v0(19)
    /* renamed from: i */
    public LocationRequest mo52184i(@C0359n0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return mo52182h();
        }
        return C17749w0.m81072a(C17752a.m81083a(this, str));
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f46145b != Long.MAX_VALUE) {
            sb.append("@");
            C17985h0.m81711e(this.f46145b, sb);
            int i = this.f46144a;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f46147d != Long.MAX_VALUE) {
            sb.append(", duration=");
            C17985h0.m81711e(this.f46147d, sb);
        }
        if (this.f46148e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f46148e);
        }
        long j = this.f46146c;
        if (j != -1 && j < this.f46145b) {
            sb.append(", minUpdateInterval=");
            C17985h0.m81711e(this.f46146c, sb);
        }
        if (((double) this.f46149f) > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f46149f);
        }
        if (this.f46150g / 2 > this.f46145b) {
            sb.append(", maxUpdateDelay=");
            C17985h0.m81711e(this.f46150g, sb);
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    /* renamed from: androidx.core.location.x0$c */
    public static final class C17754c {

        /* renamed from: a */
        public long f46157a;

        /* renamed from: b */
        public int f46158b;

        /* renamed from: c */
        public long f46159c;

        /* renamed from: d */
        public int f46160d;

        /* renamed from: e */
        public long f46161e;

        /* renamed from: f */
        public float f46162f;

        /* renamed from: g */
        public long f46163g;

        public C17754c(long j) {
            mo52189d(j);
            this.f46158b = 102;
            this.f46159c = Long.MAX_VALUE;
            this.f46160d = Integer.MAX_VALUE;
            this.f46161e = -1;
            this.f46162f = 0.0f;
            this.f46163g = 0;
        }

        @C0359n0
        /* renamed from: a */
        public C17751x0 mo52186a() {
            boolean z;
            if (this.f46157a == Long.MAX_VALUE && this.f46161e == -1) {
                z = false;
            } else {
                z = true;
            }
            C18001r.m81778o(z, "passive location requests must have an explicit minimum update interval");
            long j = this.f46157a;
            return new C17751x0(j, this.f46158b, this.f46159c, this.f46160d, Math.min(this.f46161e, j), this.f46162f, this.f46163g);
        }

        @C0359n0
        /* renamed from: b */
        public C17754c mo52187b() {
            this.f46161e = -1;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17754c mo52188c(@C0337f0(from = 1) long j) {
            this.f46159c = C18001r.m81771h(j, 1, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C17754c mo52189d(@C0337f0(from = 0) long j) {
            this.f46157a = C18001r.m81771h(j, 0, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17754c mo52190e(@C0337f0(from = 0) long j) {
            this.f46163g = j;
            this.f46163g = C18001r.m81771h(j, 0, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17754c mo52191f(@C0337f0(from = 1, mo995to = 2147483647L) int i) {
            this.f46160d = C18001r.m81770g(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17754c mo52192g(@C0379x(from = 0.0d, mo1016to = 3.4028234663852886E38d) float f) {
            this.f46162f = f;
            this.f46162f = C18001r.m81769f(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17754c mo52193h(@C0337f0(from = 0) long j) {
            this.f46161e = C18001r.m81771h(j, 0, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C17754c mo52194i(int i) {
            boolean z;
            if (i == 104 || i == 102 || i == 100) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81766c(z, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f46158b = i;
            return this;
        }

        public C17754c(@C0359n0 C17751x0 x0Var) {
            this.f46157a = x0Var.f46145b;
            this.f46158b = x0Var.f46144a;
            this.f46159c = x0Var.f46147d;
            this.f46160d = x0Var.f46148e;
            this.f46161e = x0Var.f46146c;
            this.f46162f = x0Var.f46149f;
            this.f46163g = x0Var.f46150g;
        }
    }
}
