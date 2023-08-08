package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.v */
public class C12523v extends C12516r0 {
    @C12579k

    /* renamed from: a */
    public C12516r0 f30510a;

    public C12523v(@C12579k C12516r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "delegate");
        this.f30510a = r0Var;
    }

    @C11314h(name = "delegate")
    @C12579k
    /* renamed from: a */
    public final C12516r0 mo27448a() {
        return this.f30510a;
    }

    @C12579k
    /* renamed from: b */
    public final C12523v mo27449b(@C12579k C12516r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "delegate");
        this.f30510a = r0Var;
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo27450c(C12516r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        this.f30510a = r0Var;
    }

    @C12579k
    public C12516r0 clearDeadline() {
        return this.f30510a.clearDeadline();
    }

    @C12579k
    public C12516r0 clearTimeout() {
        return this.f30510a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f30510a.deadlineNanoTime();
    }

    public boolean hasDeadline() {
        return this.f30510a.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.f30510a.throwIfReached();
    }

    @C12579k
    public C12516r0 timeout(long j, @C12579k TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        return this.f30510a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f30510a.timeoutNanos();
    }

    @C12579k
    public C12516r0 deadlineNanoTime(long j) {
        return this.f30510a.deadlineNanoTime(j);
    }
}
