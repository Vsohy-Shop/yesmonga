package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10936f1;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.k */
public final class C11339k extends C10936f1 {
    @C12579k

    /* renamed from: a */
    public final short[] f28459a;

    /* renamed from: b */
    public int f28460b;

    public C11339k(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "array");
        this.f28459a = sArr;
    }

    /* renamed from: c */
    public short mo22253c() {
        try {
            short[] sArr = this.f28459a;
            int i = this.f28460b;
            this.f28460b = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28460b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28460b < this.f28459a.length;
    }
}
