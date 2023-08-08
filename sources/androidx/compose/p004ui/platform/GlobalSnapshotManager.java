package androidx.compose.p004ui.platform;

import androidx.compose.runtime.snapshots.C8646f;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager */
public final class GlobalSnapshotManager {
    @C12579k

    /* renamed from: a */
    public static final GlobalSnapshotManager f39359a = new GlobalSnapshotManager();
    @C12579k

    /* renamed from: b */
    public static final AtomicBoolean f39360b = new AtomicBoolean(false);

    /* renamed from: a */
    public final void mo45547a() {
        if (f39360b.compareAndSet(false, true)) {
            C11744g d = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
            C11723c2 unused = C12038j.m48061f(C12079p0.m48260a(AndroidUiDispatcher.f39291X.mo45497b()), (CoroutineContext) null, (CoroutineStart) null, new GlobalSnapshotManager$ensureStarted$1(d, (C11045c<? super GlobalSnapshotManager$ensureStarted$1>) null), 3, (Object) null);
            C8646f.f23196e.mo16628i(new GlobalSnapshotManager$ensureStarted$2(d));
        }
    }
}
