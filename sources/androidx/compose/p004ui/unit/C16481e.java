package androidx.compose.p004ui.unit;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.unit.e */
public final class C16481e implements C16479d {

    /* renamed from: a */
    public final float f40869a;

    /* renamed from: b */
    public final float f40870b;

    public C16481e(float f, float f2) {
        this.f40869a = f;
        this.f40870b = f2;
    }

    /* renamed from: h */
    public static /* synthetic */ C16481e m74428h(C16481e eVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = eVar.getDensity();
        }
        if ((i & 2) != 0) {
            f2 = eVar.mo7419R4();
        }
        return eVar.mo47816f(f, f2);
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f40870b;
    }

    /* renamed from: c */
    public final float mo47813c() {
        return getDensity();
    }

    /* renamed from: d */
    public final float mo47814d() {
        return mo7419R4();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16481e)) {
            return false;
        }
        C16481e eVar = (C16481e) obj;
        return Float.compare(getDensity(), eVar.getDensity()) == 0 && Float.compare(mo7419R4(), eVar.mo7419R4()) == 0;
    }

    @C12579k
    /* renamed from: f */
    public final C16481e mo47816f(float f, float f2) {
        return new C16481e(f, f2);
    }

    public float getDensity() {
        return this.f40869a;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(mo7419R4());
    }

    @C12579k
    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + mo7419R4() + ')';
    }
}
