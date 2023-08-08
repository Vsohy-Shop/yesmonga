package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.f0 */
public final class C12270f0 extends C12271f1<int[]> {
    @C12579k

    /* renamed from: a */
    public int[] f30060a;

    /* renamed from: b */
    public int f30061b;

    public C12270f0(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "bufferWithData");
        this.f30060a = iArr;
        this.f30061b = iArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        int[] iArr = this.f30060a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, C11479u.m44447u(i, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30060a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30061b;
    }

    /* renamed from: e */
    public final void mo25046e(int i) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        int[] iArr = this.f30060a;
        int d = mo25045d();
        this.f30061b = d + 1;
        iArr[d] = i;
    }

    @C12579k
    /* renamed from: f */
    public int[] mo25043a() {
        int[] copyOf = Arrays.copyOf(this.f30060a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
