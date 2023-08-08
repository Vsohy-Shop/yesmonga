package androidx.compose.p004ui.input.pointer.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.util.c */
public final class C15503c {

    /* renamed from: a */
    public final int f38558a;
    @C12579k

    /* renamed from: b */
    public final Float[] f38559b;

    public C15503c(int i) {
        this.f38558a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f38559b = fArr;
    }

    /* renamed from: a */
    public final float mo44151a(int i) {
        return this.f38559b[i].floatValue();
    }

    @C12579k
    /* renamed from: b */
    public final Float[] mo44152b() {
        return this.f38559b;
    }

    /* renamed from: c */
    public final int mo44153c() {
        return this.f38558a;
    }

    /* renamed from: d */
    public final float mo44154d() {
        return (float) Math.sqrt((double) mo44156f(this));
    }

    /* renamed from: e */
    public final void mo44155e(int i, float f) {
        this.f38559b[i] = Float.valueOf(f);
    }

    /* renamed from: f */
    public final float mo44156f(@C12579k C15503c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "a");
        int i = this.f38558a;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += mo44151a(i2) * cVar.mo44151a(i2);
        }
        return f;
    }
}
