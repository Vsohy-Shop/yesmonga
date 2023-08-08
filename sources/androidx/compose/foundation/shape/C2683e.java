package androidx.compose.foundation.shape;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.foundation.shape.e */
public abstract class C2683e implements C15218g4 {

    /* renamed from: e */
    public static final int f7044e = 0;
    @C12579k

    /* renamed from: a */
    public final C2684f f7045a;
    @C12579k

    /* renamed from: b */
    public final C2684f f7046b;
    @C12579k

    /* renamed from: c */
    public final C2684f f7047c;
    @C12579k

    /* renamed from: d */
    public final C2684f f7048d;

    public C2683e(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4) {
        Intrinsics.checkNotNullParameter(fVar, "topStart");
        Intrinsics.checkNotNullParameter(fVar2, "topEnd");
        Intrinsics.checkNotNullParameter(fVar3, "bottomEnd");
        Intrinsics.checkNotNullParameter(fVar4, "bottomStart");
        this.f7045a = fVar;
        this.f7046b = fVar2;
        this.f7047c = fVar3;
        this.f7048d = fVar4;
    }

    /* renamed from: d */
    public static /* synthetic */ C2683e m12106d(C2683e eVar, C2684f fVar, C2684f fVar2, C2684f fVar3, C2684f fVar4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = eVar.f7045a;
            }
            if ((i & 2) != 0) {
                fVar2 = eVar.f7046b;
            }
            if ((i & 4) != 0) {
                fVar3 = eVar.f7047c;
            }
            if ((i & 8) != 0) {
                fVar4 = eVar.f7048d;
            }
            return eVar.mo9157c(fVar, fVar2, fVar3, fVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @C12579k
    /* renamed from: a */
    public final C15174d3 mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        float a = this.f7045a.mo9173a(j, dVar);
        float a2 = this.f7046b.mo9173a(j, dVar);
        float a3 = this.f7047c.mo9173a(j, dVar);
        float a4 = this.f7048d.mo9173a(j, dVar);
        float q = C15104m.m65020q(j);
        float f = a + a4;
        if (f > q) {
            float f2 = q / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a2 + a3;
        if (f4 > q) {
            float f5 = q / f4;
            a2 *= f5;
            a3 *= f5;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || f3 < 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return mo9158e(j, a, a2, a3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    @C12579k
    /* renamed from: b */
    public final C2683e mo9168b(@C12579k C2684f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "all");
        return mo9157c(fVar, fVar, fVar, fVar);
    }

    @C12579k
    /* renamed from: c */
    public abstract C2683e mo9157c(@C12579k C2684f fVar, @C12579k C2684f fVar2, @C12579k C2684f fVar3, @C12579k C2684f fVar4);

    @C12579k
    /* renamed from: e */
    public abstract C15174d3 mo9158e(long j, float f, float f2, float f3, float f4, @C12579k LayoutDirection layoutDirection);

    @C12579k
    /* renamed from: f */
    public final C2684f mo9169f() {
        return this.f7047c;
    }

    @C12579k
    /* renamed from: g */
    public final C2684f mo9170g() {
        return this.f7048d;
    }

    @C12579k
    /* renamed from: h */
    public final C2684f mo9171h() {
        return this.f7046b;
    }

    @C12579k
    /* renamed from: i */
    public final C2684f mo9172i() {
        return this.f7045a;
    }
}
