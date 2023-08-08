package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.o */
public final class C11356o extends C11340k0<byte[]> {
    @C12579k

    /* renamed from: d */
    public final byte[] f28475d;

    public C11356o(int i) {
        super(i);
        this.f28475d = new byte[i];
    }

    /* renamed from: h */
    public final void mo22818h(byte b) {
        byte[] bArr = this.f28475d;
        int b2 = mo22791b();
        mo22792e(b2 + 1);
        bArr[b2] = b;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final byte[] mo22820j() {
        return (byte[]) mo22794g(this.f28475d, new byte[mo22793f()]);
    }
}
