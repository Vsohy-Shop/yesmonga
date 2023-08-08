package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.g */
public final class C12272g extends C12271f1<boolean[]> {
    @C12579k

    /* renamed from: a */
    public boolean[] f30062a;

    /* renamed from: b */
    public int f30063b;

    public C12272g(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "bufferWithData");
        this.f30062a = zArr;
        this.f30063b = zArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        boolean[] zArr = this.f30062a;
        if (zArr.length < i) {
            boolean[] copyOf = Arrays.copyOf(zArr, C11479u.m44447u(i, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30062a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30063b;
    }

    /* renamed from: e */
    public final void mo25048e(boolean z) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        boolean[] zArr = this.f30062a;
        int d = mo25045d();
        this.f30063b = d + 1;
        zArr[d] = z;
    }

    @C12579k
    /* renamed from: f */
    public boolean[] mo25043a() {
        boolean[] copyOf = Arrays.copyOf(this.f30062a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
