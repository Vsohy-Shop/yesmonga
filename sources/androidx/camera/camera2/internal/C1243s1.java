package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.C1410h0;
import androidx.camera.core.C1636l0;

@C1410h0
/* renamed from: androidx.camera.camera2.internal.s1 */
public class C1243s1 implements C1636l0 {

    /* renamed from: a */
    public final Object f3560a = new Object();

    /* renamed from: b */
    public final C1073h f3561b;
    @C0323b0("mLock")

    /* renamed from: c */
    public int f3562c;

    public C1243s1(C1073h hVar, int i) {
        this.f3561b = hVar;
        this.f3562c = i;
    }

    /* renamed from: a */
    public int mo4645a() {
        int i;
        synchronized (this.f3560a) {
            i = this.f3562c;
        }
        return i;
    }

    @C0359n0
    /* renamed from: b */
    public Rational mo4646b() {
        if (!mo4647c()) {
            return Rational.ZERO;
        }
        return (Rational) this.f3561b.mo4323a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    /* renamed from: c */
    public boolean mo4647c() {
        Range range = (Range) this.f3561b.mo4323a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: d */
    public Range<Integer> mo4648d() {
        return (Range) this.f3561b.mo4323a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    /* renamed from: e */
    public void mo4649e(int i) {
        synchronized (this.f3560a) {
            this.f3562c = i;
        }
    }
}
