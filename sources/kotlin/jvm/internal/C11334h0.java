package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.h0 */
public final class C11334h0 extends C11340k0<long[]> {
    @C12579k

    /* renamed from: d */
    public final long[] f28454d;

    public C11334h0(int i) {
        super(i);
        this.f28454d = new long[i];
    }

    /* renamed from: h */
    public final void mo22780h(long j) {
        long[] jArr = this.f28454d;
        int b = mo22791b();
        mo22792e(b + 1);
        jArr[b] = j;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final long[] mo22782j() {
        return (long[]) mo22794g(this.f28454d, new long[mo22793f()]);
    }
}
