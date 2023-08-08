package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.C1472k1;
import androidx.camera.core.impl.utils.ExifData;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: androidx.camera.core.h2 */
public abstract class C1412h2 implements C1741z1 {
    /* renamed from: d */
    public static C1741z1 m5903d(@C0359n0 C1472k1 k1Var, long j, int i) {
        return new C1404g(k1Var, j, i);
    }

    /* renamed from: a */
    public void mo5112a(@C0359n0 ExifData.C1509b bVar) {
        bVar.mo5351n(mo5102c());
    }

    @C0359n0
    /* renamed from: b */
    public abstract C1472k1 mo5101b();

    /* renamed from: c */
    public abstract int mo5102c();

    public abstract long getTimestamp();
}
