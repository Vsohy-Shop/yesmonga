package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10953k0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.f */
public final class C11329f extends C10953k0 {
    @C12579k

    /* renamed from: a */
    public final int[] f28445a;

    /* renamed from: b */
    public int f28446b;

    public C11329f(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "array");
        this.f28445a = iArr;
    }

    /* renamed from: c */
    public int mo6374c() {
        try {
            int[] iArr = this.f28445a;
            int i = this.f28446b;
            this.f28446b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28446b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28446b < this.f28445a.length;
    }
}
