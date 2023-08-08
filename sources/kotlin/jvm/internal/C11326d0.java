package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.d0 */
public final class C11326d0 extends C11340k0<int[]> {
    @C12579k

    /* renamed from: d */
    public final int[] f28442d;

    public C11326d0(int i) {
        super(i);
        this.f28442d = new int[i];
    }

    /* renamed from: h */
    public final void mo22770h(int i) {
        int[] iArr = this.f28442d;
        int b = mo22791b();
        mo22792e(b + 1);
        iArr[b] = i;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final int[] mo22772j() {
        return (int[]) mo22794g(this.f28442d, new int[mo22793f()]);
    }
}
