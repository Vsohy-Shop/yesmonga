package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.n */
public final class C12293n extends C12271f1<char[]> {
    @C12579k

    /* renamed from: a */
    public char[] f30091a;

    /* renamed from: b */
    public int f30092b;

    public C12293n(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "bufferWithData");
        this.f30091a = cArr;
        this.f30092b = cArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        char[] cArr = this.f30091a;
        if (cArr.length < i) {
            char[] copyOf = Arrays.copyOf(cArr, C11479u.m44447u(i, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30091a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30092b;
    }

    /* renamed from: e */
    public final void mo25110e(char c) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        char[] cArr = this.f30091a;
        int d = mo25045d();
        this.f30092b = d + 1;
        cArr[d] = c;
    }

    @C12579k
    /* renamed from: f */
    public char[] mo25043a() {
        char[] copyOf = Arrays.copyOf(this.f30091a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
