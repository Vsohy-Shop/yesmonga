package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.q0 */
public final class C11361q0 extends C11340k0<short[]> {
    @C12579k

    /* renamed from: d */
    public final short[] f28493d;

    public C11361q0(int i) {
        super(i);
        this.f28493d = new short[i];
    }

    /* renamed from: h */
    public final void mo22825h(short s) {
        short[] sArr = this.f28493d;
        int b = mo22791b();
        mo22792e(b + 1);
        sArr[b] = s;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final short[] mo22827j() {
        return (short[]) mo22794g(this.f28493d, new short[mo22793f()]);
    }
}
