package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10970p;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.b */
public final class C11321b extends C10970p {
    @C12579k

    /* renamed from: a */
    public final byte[] f28431a;

    /* renamed from: b */
    public int f28432b;

    public C11321b(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "array");
        this.f28431a = bArr;
    }

    public boolean hasNext() {
        return this.f28432b < this.f28431a.length;
    }

    public byte nextByte() {
        try {
            byte[] bArr = this.f28431a;
            int i = this.f28432b;
            this.f28432b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28432b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
