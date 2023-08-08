package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10972q;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.c */
public final class C11323c extends C10972q {
    @C12579k

    /* renamed from: a */
    public final char[] f28433a;

    /* renamed from: b */
    public int f28434b;

    public C11323c(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "array");
        this.f28433a = cArr;
    }

    /* renamed from: c */
    public char mo22395c() {
        try {
            char[] cArr = this.f28433a;
            int i = this.f28434b;
            this.f28434b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28434b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28434b < this.f28433a.length;
    }
}
