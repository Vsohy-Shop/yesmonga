package androidx.compose.foundation.layout;

import androidx.compose.animation.core.C1965f0;
import androidx.compose.foundation.layout.C2351e;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.layout.z0 */
public final class C2430z0 implements C1965f0 {

    /* renamed from: a */
    public final float f6376a;

    public C2430z0(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f6376a = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public float mo6838a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo6839b(long j, float f, float f2) {
        float f3;
        long c = mo6840c(0.0f, f2);
        if (c > 0) {
            f3 = ((float) j) / ((float) c);
        } else {
            f3 = 1.0f;
        }
        return ((C2351e.C2352a.m10366f(C2351e.f6256a.mo8045b(f3)) * mo8239f(f2)) / ((float) c)) * 1.0E9f;
    }

    /* renamed from: c */
    public long mo6840c(float f, float f2) {
        return (long) (Math.exp(mo8240g(f2) / WindowInsetsConnection_androidKt.f6174f) * 1.0E9d);
    }

    /* renamed from: d */
    public float mo6841d(float f, float f2) {
        return f + mo8239f(f2);
    }

    /* renamed from: e */
    public float mo6842e(long j, float f, float f2) {
        float f3;
        long c = mo6840c(0.0f, f2);
        if (c > 0) {
            f3 = ((float) j) / ((float) c);
        } else {
            f3 = 1.0f;
        }
        return f + (mo8239f(f2) * C2351e.C2352a.m10365e(C2351e.f6256a.mo8045b(f3)));
    }

    /* renamed from: f */
    public final float mo8239f(float f) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.f6170b * this.f6376a)) * Math.exp((WindowInsetsConnection_androidKt.f6173e / WindowInsetsConnection_androidKt.f6174f) * mo8240g(f)))) * Math.signum(f);
    }

    /* renamed from: g */
    public final double mo8240g(float f) {
        return C2351e.f6256a.mo8044a(f, WindowInsetsConnection_androidKt.f6170b * this.f6376a);
    }
}
