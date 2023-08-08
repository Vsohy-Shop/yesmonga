package androidx.compose.animation;

import androidx.compose.animation.core.C1965f0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.u */
public final class C2045u implements C1965f0 {

    /* renamed from: b */
    public static final int f5695b = 0;
    @C12579k

    /* renamed from: a */
    public final C2034k f5696a;

    public C2045u(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f5696a = new C2034k(C2046v.m8764a(), dVar);
    }

    /* renamed from: a */
    public float mo6838a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo6839b(long j, float f, float f2) {
        return this.f5696a.mo7045d(f2).mo7058j(j / 1000000);
    }

    /* renamed from: c */
    public long mo6840c(float f, float f2) {
        return this.f5696a.mo7044c(f2) * 1000000;
    }

    /* renamed from: d */
    public float mo6841d(float f, float f2) {
        return f + mo7085f(f2);
    }

    /* renamed from: e */
    public float mo6842e(long j, float f, float f2) {
        return f + this.f5696a.mo7045d(f2).mo7057i(j / 1000000);
    }

    /* renamed from: f */
    public final float mo7085f(float f) {
        return this.f5696a.mo7043b(f) * Math.signum(f);
    }
}
