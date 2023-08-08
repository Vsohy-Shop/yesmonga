package okio;

import java.io.IOException;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.t */
public abstract class C12521t implements C12506n0 {
    @C12579k
    private final C12506n0 delegate;

    public C12521t(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "delegate");
        this.delegate = n0Var;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "delegate", imports = {}))
    @C11314h(name = "-deprecated_delegate")
    @C12579k
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C12506n0 m172723deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @C11314h(name = "delegate")
    @C12579k
    public final C12506n0 delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    @C12579k
    public C12516r0 timeout() {
        return this.delegate.timeout();
    }

    @C12579k
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "source");
        this.delegate.write(mVar, j);
    }
}
