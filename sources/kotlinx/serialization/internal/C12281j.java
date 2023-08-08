package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.j */
public final class C12281j extends C12271f1<byte[]> {
    @C12579k

    /* renamed from: a */
    public byte[] f30075a;

    /* renamed from: b */
    public int f30076b;

    public C12281j(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "bufferWithData");
        this.f30075a = bArr;
        this.f30076b = bArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        byte[] bArr = this.f30075a;
        if (bArr.length < i) {
            byte[] copyOf = Arrays.copyOf(bArr, C11479u.m44447u(i, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30075a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30076b;
    }

    /* renamed from: e */
    public final void mo25076e(byte b) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        byte[] bArr = this.f30075a;
        int d = mo25045d();
        this.f30076b = d + 1;
        bArr[d] = b;
    }

    @C12579k
    /* renamed from: f */
    public byte[] mo25043a() {
        byte[] copyOf = Arrays.copyOf(this.f30075a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
