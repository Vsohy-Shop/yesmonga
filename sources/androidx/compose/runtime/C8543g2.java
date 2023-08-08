package androidx.compose.runtime;

import androidx.compose.runtime.internal.C8568p;
import androidx.compose.runtime.internal.C8569q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,116:1\n70#2:117\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n58#1:117\n*E\n"})
/* renamed from: androidx.compose.runtime.g2 */
public final class C8543g2<T> {
    @C12579k

    /* renamed from: a */
    public final AtomicReference<C8568p> f22977a = new AtomicReference<>(C8569q.m31067a());
    @C12579k

    /* renamed from: b */
    public final Object f22978b = new Object();

    @C12580l
    /* renamed from: a */
    public final T mo16131a() {
        return this.f22977a.get().mo16220b(Thread.currentThread().getId());
    }

    /* renamed from: b */
    public final void mo16132b(@C12580l T t) {
        long id = Thread.currentThread().getId();
        synchronized (this.f22978b) {
            C8568p pVar = this.f22977a.get();
            if (!pVar.mo16222d(id, t)) {
                this.f22977a.set(pVar.mo16221c(id, t));
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }
}
