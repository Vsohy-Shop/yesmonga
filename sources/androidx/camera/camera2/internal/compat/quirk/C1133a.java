package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.impl.C1447e1;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.a */
public class C1133a implements C1447e1 {
    @C0363p0

    /* renamed from: a */
    public final Range<Integer> f3353a;

    public C1133a(@C0359n0 C1073h hVar) {
        this.f3353a = mo4431d((Range[]) hVar.mo4323a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: c */
    public static boolean m4826c(@C0359n0 C1073h hVar) {
        Integer num = (Integer) hVar.mo4323a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: a */
    public final Range<Integer> mo4429a(@C0359n0 Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    @C0363p0
    /* renamed from: b */
    public Range<Integer> mo4430b() {
        return this.f3353a;
    }

    @C0363p0
    /* renamed from: d */
    public final Range<Integer> mo4431d(@C0363p0 Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range<Integer> a : rangeArr) {
                Range<Integer> a2 = mo4429a(a);
                if (a2.getUpper().intValue() == 30 && (range == null || a2.getLower().intValue() < range.getLower().intValue())) {
                    range = a2;
                }
            }
        }
        return range;
    }
}
