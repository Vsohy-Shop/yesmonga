package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.n0 */
public interface C12506n0 extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    @C12579k
    C12516r0 timeout();

    void write(@C12579k C12500m mVar, long j) throws IOException;
}
