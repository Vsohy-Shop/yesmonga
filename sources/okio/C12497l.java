package okio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.l */
public final class C12497l implements C12506n0 {
    public void close() {
    }

    public void flush() {
    }

    @C12579k
    public C12516r0 timeout() {
        return C12516r0.NONE;
    }

    public void write(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        mVar.skip(j);
    }
}
