package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.r */
public final class C12305r extends C12271f1<double[]> {
    @C12579k

    /* renamed from: a */
    public double[] f30109a;

    /* renamed from: b */
    public int f30110b;

    public C12305r(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "bufferWithData");
        this.f30109a = dArr;
        this.f30110b = dArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        double[] dArr = this.f30109a;
        if (dArr.length < i) {
            double[] copyOf = Arrays.copyOf(dArr, C11479u.m44447u(i, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30109a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30110b;
    }

    /* renamed from: e */
    public final void mo25139e(double d) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        double[] dArr = this.f30109a;
        int d2 = mo25045d();
        this.f30110b = d2 + 1;
        dArr[d2] = d;
    }

    @C12579k
    /* renamed from: f */
    public double[] mo25043a() {
        double[] copyOf = Arrays.copyOf(this.f30109a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
