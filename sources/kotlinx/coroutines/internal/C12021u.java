package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C19135a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.u */
public class C12021u extends LockFreeLinkedListNode {
    /* renamed from: A */
    public final boolean mo24405A() {
        return mo24314m() == this;
    }

    @C12579k
    /* renamed from: B */
    public final Void mo24406B() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* renamed from: C */
    public final void mo24407C() {
        Object m = mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m;
        C12021u uVar = this;
        while (!Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) this)) {
            LockFreeLinkedListNode n = lockFreeLinkedListNode.mo24315n();
            lockFreeLinkedListNode.mo24324y(uVar, n);
            uVar = lockFreeLinkedListNode;
            lockFreeLinkedListNode = n;
        }
        Object m2 = mo24314m();
        Intrinsics.checkNotNull(m2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        mo24324y(uVar, (LockFreeLinkedListNode) m2);
    }

    /* renamed from: p */
    public boolean mo24317p() {
        return false;
    }

    @C12580l
    /* renamed from: t */
    public LockFreeLinkedListNode mo24319t() {
        return null;
    }

    /* renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo24320u() {
        return ((Boolean) mo24406B()).booleanValue();
    }

    /* renamed from: z */
    public final /* synthetic */ <T extends LockFreeLinkedListNode> void mo24408z(C11300l<? super T, C11079d2> lVar) {
        Object m = mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m; !Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) this); lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n()) {
            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                lVar.invoke(lockFreeLinkedListNode);
            }
        }
    }
}
