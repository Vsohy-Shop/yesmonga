package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10955l0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.j */
public final class C11337j extends C10955l0 {
    @C12579k

    /* renamed from: a */
    public final long[] f28455a;

    /* renamed from: b */
    public int f28456b;

    public C11337j(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "array");
        this.f28455a = jArr;
    }

    /* renamed from: c */
    public long mo6234c() {
        try {
            long[] jArr = this.f28455a;
            int i = this.f28456b;
            this.f28456b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28456b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28456b < this.f28455a.length;
    }
}
