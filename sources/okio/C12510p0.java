package okio;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.p0 */
public interface C12510p0 extends Closeable {
    void close() throws IOException;

    long read(@C12579k C12500m mVar, long j) throws IOException;

    @C12579k
    C12516r0 timeout();
}
