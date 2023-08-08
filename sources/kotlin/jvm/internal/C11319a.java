package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10968o;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.a */
public final class C11319a extends C10968o {
    @C12579k

    /* renamed from: a */
    public final boolean[] f28429a;

    /* renamed from: b */
    public int f28430b;

    public C11319a(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "array");
        this.f28429a = zArr;
    }

    /* renamed from: c */
    public boolean mo22368c() {
        try {
            boolean[] zArr = this.f28429a;
            int i = this.f28430b;
            this.f28430b = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28430b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28430b < this.f28429a.length;
    }
}
