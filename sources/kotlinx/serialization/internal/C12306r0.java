package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.r0 */
public final class C12306r0 extends C12271f1<long[]> {
    @C12579k

    /* renamed from: a */
    public long[] f30111a;

    /* renamed from: b */
    public int f30112b;

    public C12306r0(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "bufferWithData");
        this.f30111a = jArr;
        this.f30112b = jArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        long[] jArr = this.f30111a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, C11479u.m44447u(i, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30111a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30112b;
    }

    /* renamed from: e */
    public final void mo25141e(long j) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        long[] jArr = this.f30111a;
        int d = mo25045d();
        this.f30112b = d + 1;
        jArr[d] = j;
    }

    @C12579k
    /* renamed from: f */
    public long[] mo25043a() {
        long[] copyOf = Arrays.copyOf(this.f30111a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
