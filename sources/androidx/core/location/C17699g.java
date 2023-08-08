package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.C0323b0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.location.g */
public class C17699g extends C17677a {

    /* renamed from: n */
    public static final int f46044n = 0;

    /* renamed from: o */
    public static final int f46045o = 32;

    /* renamed from: p */
    public static final int f46046p = 33;

    /* renamed from: q */
    public static final int f46047q = 64;

    /* renamed from: r */
    public static final int f46048r = -87;

    /* renamed from: s */
    public static final int f46049s = 64;

    /* renamed from: t */
    public static final int f46050t = 24;

    /* renamed from: u */
    public static final int f46051u = 193;

    /* renamed from: v */
    public static final int f46052v = 200;

    /* renamed from: w */
    public static final int f46053w = 200;

    /* renamed from: x */
    public static final int f46054x = 35;

    /* renamed from: i */
    public final GpsStatus f46055i;
    @C0323b0("mWrapped")

    /* renamed from: j */
    public int f46056j = -1;
    @C0323b0("mWrapped")

    /* renamed from: k */
    public Iterator<GpsSatellite> f46057k;
    @C0323b0("mWrapped")

    /* renamed from: l */
    public int f46058l;
    @C0323b0("mWrapped")

    /* renamed from: m */
    public GpsSatellite f46059m;

    public C17699g(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) C18001r.m81775l(gpsStatus);
        this.f46055i = gpsStatus2;
        this.f46057k = gpsStatus2.getSatellites().iterator();
        this.f46058l = -1;
        this.f46059m = null;
    }

    /* renamed from: p */
    public static int m80931p(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i <= 200 || i > 235) {
            return (i < 193 || i > 200) ? 0 : 4;
        }
        return 5;
    }

    /* renamed from: r */
    public static int m80932r(int i) {
        int p = m80931p(i);
        return p != 2 ? p != 3 ? p != 5 ? i : i - 200 : i - 64 : i + 87;
    }

    /* renamed from: a */
    public float mo52096a(int i) {
        return mo52118q(i).getAzimuth();
    }

    /* renamed from: b */
    public float mo52097b(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public float mo52098c(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public float mo52099d(int i) {
        return mo52118q(i).getSnr();
    }

    /* renamed from: e */
    public int mo52100e(int i) {
        return m80931p(mo52118q(i).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17699g)) {
            return false;
        }
        return this.f46055i.equals(((C17699g) obj).f46055i);
    }

    /* renamed from: f */
    public float mo52101f(int i) {
        return mo52118q(i).getElevation();
    }

    /* renamed from: g */
    public int mo52102g() {
        int i;
        synchronized (this.f46055i) {
            if (this.f46056j == -1) {
                for (GpsSatellite next : this.f46055i.getSatellites()) {
                    this.f46056j++;
                }
                this.f46056j++;
            }
            i = this.f46056j;
        }
        return i;
    }

    /* renamed from: h */
    public int mo52103h(int i) {
        return m80932r(mo52118q(i).getPrn());
    }

    public int hashCode() {
        return this.f46055i.hashCode();
    }

    /* renamed from: i */
    public boolean mo52104i(int i) {
        return mo52118q(i).hasAlmanac();
    }

    /* renamed from: j */
    public boolean mo52105j(int i) {
        return false;
    }

    /* renamed from: k */
    public boolean mo52106k(int i) {
        return false;
    }

    /* renamed from: l */
    public boolean mo52107l(int i) {
        return mo52118q(i).hasEphemeris();
    }

    /* renamed from: m */
    public boolean mo52108m(int i) {
        return mo52118q(i).usedInFix();
    }

    /* renamed from: q */
    public final GpsSatellite mo52118q(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f46055i) {
            if (i < this.f46058l) {
                this.f46057k = this.f46055i.getSatellites().iterator();
                this.f46058l = -1;
            }
            while (true) {
                int i2 = this.f46058l;
                if (i2 >= i) {
                    break;
                }
                this.f46058l = i2 + 1;
                if (!this.f46057k.hasNext()) {
                    this.f46059m = null;
                    break;
                }
                this.f46059m = this.f46057k.next();
            }
            gpsSatellite = this.f46059m;
        }
        return (GpsSatellite) C18001r.m81775l(gpsSatellite);
    }
}
