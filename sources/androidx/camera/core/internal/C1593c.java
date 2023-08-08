package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1403f4;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: androidx.camera.core.internal.c */
public abstract class C1593c implements C1403f4 {
    @C0359n0
    /* renamed from: e */
    public static C1403f4 m6613e(float f, float f2, float f3, float f4) {
        return new C1591a(f, f2, f3, f4);
    }

    @C0359n0
    /* renamed from: f */
    public static C1403f4 m6614f(@C0359n0 C1403f4 f4Var) {
        return new C1591a(f4Var.mo4268d(), f4Var.mo4265a(), f4Var.mo4267c(), f4Var.mo4266b());
    }

    /* renamed from: a */
    public abstract float mo4265a();

    /* renamed from: b */
    public abstract float mo4266b();

    /* renamed from: c */
    public abstract float mo4267c();

    /* renamed from: d */
    public abstract float mo4268d();
}
