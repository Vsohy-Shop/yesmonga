package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.f2 */
public final class C20311f2 implements Executor {
    @C12579k

    /* renamed from: a */
    public final Executor f52444a;
    @C12579k

    /* renamed from: b */
    public final ArrayDeque<Runnable> f52445b = new ArrayDeque<>();
    @C12580l

    /* renamed from: c */
    public Runnable f52446c;
    @C12579k

    /* renamed from: d */
    public final Object f52447d = new Object();

    public C20311f2(@C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f52444a = executor;
    }

    /* renamed from: b */
    public static final void m95022b(Runnable runnable, C20311f2 f2Var) {
        Intrinsics.checkNotNullParameter(runnable, "$command");
        Intrinsics.checkNotNullParameter(f2Var, "this$0");
        try {
            runnable.run();
        } finally {
            f2Var.mo61068c();
        }
    }

    /* renamed from: c */
    public final void mo61068c() {
        synchronized (this.f52447d) {
            Runnable poll = this.f52445b.poll();
            Runnable runnable = poll;
            this.f52446c = runnable;
            if (poll != null) {
                this.f52444a.execute(runnable);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    public void execute(@C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "command");
        synchronized (this.f52447d) {
            this.f52445b.offer(new C20304e2(runnable, this));
            if (this.f52446c == null) {
                mo61068c();
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
