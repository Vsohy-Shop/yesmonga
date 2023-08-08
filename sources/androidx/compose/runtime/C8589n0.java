package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.n0 */
public final class C8589n0 {
    @C12579k

    /* renamed from: a */
    public int[] f23020a = new int[10];

    /* renamed from: b */
    public int f23021b;

    /* renamed from: a */
    public final void mo16266a() {
        this.f23021b = 0;
    }

    /* renamed from: b */
    public final int mo16267b() {
        return this.f23021b;
    }

    /* renamed from: c */
    public final int mo16268c(int i) {
        int i2 = this.f23021b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f23020a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo16269d() {
        return this.f23021b == 0;
    }

    /* renamed from: e */
    public final boolean mo16270e() {
        return this.f23021b != 0;
    }

    /* renamed from: f */
    public final int mo16271f() {
        return this.f23020a[this.f23021b - 1];
    }

    /* renamed from: g */
    public final int mo16272g(int i) {
        return this.f23020a[i];
    }

    /* renamed from: h */
    public final int mo16273h(int i) {
        return this.f23021b > 0 ? mo16271f() : i;
    }

    /* renamed from: i */
    public final int mo16274i() {
        int[] iArr = this.f23020a;
        int i = this.f23021b - 1;
        this.f23021b = i;
        return iArr[i];
    }

    /* renamed from: j */
    public final void mo16275j(int i) {
        int i2 = this.f23021b;
        int[] iArr = this.f23020a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f23020a = copyOf;
        }
        int[] iArr2 = this.f23020a;
        int i3 = this.f23021b;
        this.f23021b = i3 + 1;
        iArr2[i3] = i;
    }
}
