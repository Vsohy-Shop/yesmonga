package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.v */
public final class C12318v extends C12271f1<float[]> {
    @C12579k

    /* renamed from: a */
    public float[] f30136a;

    /* renamed from: b */
    public int f30137b;

    public C12318v(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "bufferWithData");
        this.f30136a = fArr;
        this.f30137b = fArr.length;
        mo25044b(10);
    }

    /* renamed from: b */
    public void mo25044b(int i) {
        float[] fArr = this.f30136a;
        if (fArr.length < i) {
            float[] copyOf = Arrays.copyOf(fArr, C11479u.m44447u(i, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30136a = copyOf;
        }
    }

    /* renamed from: d */
    public int mo25045d() {
        return this.f30137b;
    }

    /* renamed from: e */
    public final void mo25190e(float f) {
        C12271f1.m49284c(this, 0, 1, (Object) null);
        float[] fArr = this.f30136a;
        int d = mo25045d();
        this.f30137b = d + 1;
        fArr[d] = f;
    }

    @C12579k
    /* renamed from: f */
    public float[] mo25043a() {
        float[] copyOf = Arrays.copyOf(this.f30136a, mo25045d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
