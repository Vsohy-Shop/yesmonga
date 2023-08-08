package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.p1 */
public final class C12301p1 extends C12271f1<short[]> {
    @C12579k

    /* renamed from: a */
    public short[] f30099a;

    /* renamed from: b */
    public int f30100b;

    public C12301p1(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "bufferWithData");
        this.f30099a = sArr;
        this.f30100b = sArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        short[] sArr = this.f30099a;
        if (sArr.length < i) {
            short[] copyOf = Arrays.copyOf(sArr, C11479u.m44447u(i, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30099a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30100b;
    }

    /* renamed from: e */
    public final void mo25132e(short s) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        short[] sArr = this.f30099a;
        int d = mo25045d();
        this.f30100b = d + 1;
        sArr[d] = s;
    }

    @C12579k
    /* renamed from: f */
    public short[] mo25043a() {
        short[] copyOf = Arrays.copyOf(this.f30099a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
