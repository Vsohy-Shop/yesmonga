package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.q */
public final class C11360q extends C11340k0<char[]> {
    @C12579k

    /* renamed from: d */
    public final char[] f28492d;

    public C11360q(int i) {
        super(i);
        this.f28492d = new char[i];
    }

    /* renamed from: h */
    public final void mo22822h(char c) {
        char[] cArr = this.f28492d;
        int b = mo22791b();
        mo22792e(b + 1);
        cArr[b] = c;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final char[] mo22824j() {
        return (char[]) mo22794g(this.f28492d, new char[mo22793f()]);
    }
}
