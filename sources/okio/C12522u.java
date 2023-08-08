package okio;

import java.io.IOException;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.u */
public abstract class C12522u implements C12510p0 {
    @C12579k
    private final C12510p0 delegate;

    public C12522u(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "delegate");
        this.delegate = p0Var;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "delegate", imports = {}))
    @C11314h(name = "-deprecated_delegate")
    @C12579k
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C12510p0 m172724deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    @C11314h(name = "delegate")
    @C12579k
    public final C12510p0 delegate() {
        return this.delegate;
    }

    public long read(@C12579k C12500m mVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "sink");
        return this.delegate.read(mVar, j);
    }

    @C12579k
    public C12516r0 timeout() {
        return this.delegate.timeout();
    }

    @C12579k
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
