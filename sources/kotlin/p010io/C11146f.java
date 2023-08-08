package kotlin.p010io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.io.f */
public final class C11146f extends ByteArrayOutputStream {
    public C11146f(int i) {
        super(i);
    }

    @C12579k
    /* renamed from: a */
    public final byte[] mo22603a() {
        byte[] bArr = this.buf;
        Intrinsics.checkNotNullExpressionValue(bArr, "buf");
        return bArr;
    }
}
