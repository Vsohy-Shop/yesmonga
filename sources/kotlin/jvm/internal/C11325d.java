package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10901a0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.d */
public final class C11325d extends C10901a0 {
    @C12579k

    /* renamed from: a */
    public final double[] f28440a;

    /* renamed from: b */
    public int f28441b;

    public C11325d(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "array");
        this.f28440a = dArr;
    }

    /* renamed from: c */
    public double mo22044c() {
        try {
            double[] dArr = this.f28440a;
            int i = this.f28441b;
            this.f28441b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28441b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28441b < this.f28440a.length;
    }
}
