package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.m */
public final class C11343m extends C11340k0<boolean[]> {
    @C12579k

    /* renamed from: d */
    public final boolean[] f28468d;

    public C11343m(int i) {
        super(i);
        this.f28468d = new boolean[i];
    }

    /* renamed from: h */
    public final void mo22795h(boolean z) {
        boolean[] zArr = this.f28468d;
        int b = mo22791b();
        mo22792e(b + 1);
        zArr[b] = z;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final boolean[] mo22797j() {
        return (boolean[]) mo22794g(this.f28468d, new boolean[mo22793f()]);
    }
}
