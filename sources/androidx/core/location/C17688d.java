package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;

@C0376v0(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.location.d */
public class C17688d extends C17677a {

    /* renamed from: i */
    public final GnssStatus f46043i;

    @C0376v0(26)
    /* renamed from: androidx.core.location.d$a */
    public static class C17689a {
        @C0373u
        /* renamed from: a */
        public static float m80919a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m80920b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.location.d$b */
    public static class C17690b {
        @C0373u
        /* renamed from: a */
        public static float m80921a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m80922b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public C17688d(Object obj) {
        this.f46043i = (GnssStatus) C18001r.m81775l((GnssStatus) obj);
    }

    /* renamed from: a */
    public float mo52096a(int i) {
        return this.f46043i.getAzimuthDegrees(i);
    }

    /* renamed from: b */
    public float mo52097b(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17690b.m80921a(this.f46043i, i);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public float mo52098c(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17689a.m80919a(this.f46043i, i);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public float mo52099d(int i) {
        return this.f46043i.getCn0DbHz(i);
    }

    /* renamed from: e */
    public int mo52100e(int i) {
        return this.f46043i.getConstellationType(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17688d)) {
            return false;
        }
        return this.f46043i.equals(((C17688d) obj).f46043i);
    }

    /* renamed from: f */
    public float mo52101f(int i) {
        return this.f46043i.getElevationDegrees(i);
    }

    /* renamed from: g */
    public int mo52102g() {
        return this.f46043i.getSatelliteCount();
    }

    /* renamed from: h */
    public int mo52103h(int i) {
        return this.f46043i.getSvid(i);
    }

    public int hashCode() {
        return this.f46043i.hashCode();
    }

    /* renamed from: i */
    public boolean mo52104i(int i) {
        return this.f46043i.hasAlmanacData(i);
    }

    /* renamed from: j */
    public boolean mo52105j(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17690b.m80922b(this.f46043i, i);
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo52106k(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17689a.m80920b(this.f46043i, i);
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo52107l(int i) {
        return this.f46043i.hasEphemerisData(i);
    }

    /* renamed from: m */
    public boolean mo52108m(int i) {
        return this.f46043i.usedInFix(i);
    }
}
