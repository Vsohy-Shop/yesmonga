package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.location.a */
public abstract class C17677a {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a */
    public static final int f46034a = 0;
    @SuppressLint({"InlinedApi"})

    /* renamed from: b */
    public static final int f46035b = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: c */
    public static final int f46036c = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: d */
    public static final int f46037d = 3;
    @SuppressLint({"InlinedApi"})

    /* renamed from: e */
    public static final int f46038e = 4;
    @SuppressLint({"InlinedApi"})

    /* renamed from: f */
    public static final int f46039f = 5;
    @SuppressLint({"InlinedApi"})

    /* renamed from: g */
    public static final int f46040g = 6;
    @SuppressLint({"InlinedApi"})

    /* renamed from: h */
    public static final int f46041h = 7;

    /* renamed from: androidx.core.location.a$a */
    public static abstract class C17678a {
        /* renamed from: a */
        public void mo52109a(@C0337f0(from = 0) int i) {
        }

        /* renamed from: b */
        public void mo52110b(@C0359n0 C17677a aVar) {
        }

        /* renamed from: c */
        public void mo52111c() {
        }

        /* renamed from: d */
        public void mo52112d() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.location.a$b */
    public @interface C17679b {
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: n */
    public static C17677a m80880n(@C0359n0 GnssStatus gnssStatus) {
        return new C17688d(gnssStatus);
    }

    @SuppressLint({"ReferencesDeprecated"})
    @C0359n0
    /* renamed from: o */
    public static C17677a m80881o(@C0359n0 GpsStatus gpsStatus) {
        return new C17699g(gpsStatus);
    }

    @C0379x(from = 0.0d, mo1016to = 360.0d)
    /* renamed from: a */
    public abstract float mo52096a(@C0337f0(from = 0) int i);

    @C0379x(from = 0.0d, mo1016to = 63.0d)
    /* renamed from: b */
    public abstract float mo52097b(@C0337f0(from = 0) int i);

    @C0379x(from = 0.0d)
    /* renamed from: c */
    public abstract float mo52098c(@C0337f0(from = 0) int i);

    @C0379x(from = 0.0d, mo1016to = 63.0d)
    /* renamed from: d */
    public abstract float mo52099d(@C0337f0(from = 0) int i);

    /* renamed from: e */
    public abstract int mo52100e(@C0337f0(from = 0) int i);

    @C0379x(from = -90.0d, mo1016to = 90.0d)
    /* renamed from: f */
    public abstract float mo52101f(@C0337f0(from = 0) int i);

    @C0337f0(from = 0)
    /* renamed from: g */
    public abstract int mo52102g();

    @C0337f0(from = 1, mo995to = 200)
    /* renamed from: h */
    public abstract int mo52103h(@C0337f0(from = 0) int i);

    /* renamed from: i */
    public abstract boolean mo52104i(@C0337f0(from = 0) int i);

    /* renamed from: j */
    public abstract boolean mo52105j(@C0337f0(from = 0) int i);

    /* renamed from: k */
    public abstract boolean mo52106k(@C0337f0(from = 0) int i);

    /* renamed from: l */
    public abstract boolean mo52107l(@C0337f0(from = 0) int i);

    /* renamed from: m */
    public abstract boolean mo52108m(@C0337f0(from = 0) int i);
}
