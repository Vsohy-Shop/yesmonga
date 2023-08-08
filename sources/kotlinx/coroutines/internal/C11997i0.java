package kotlinx.coroutines.internal;

import kotlin.jvm.C11287e;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.i0 */
public final class C11997i0 {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final LockFreeLinkedListNode f29597a;

    public C11997i0(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f29597a = lockFreeLinkedListNode;
    }

    @C12579k
    public String toString() {
        return "Removed[" + this.f29597a + C12361b.f30261l;
    }
}
