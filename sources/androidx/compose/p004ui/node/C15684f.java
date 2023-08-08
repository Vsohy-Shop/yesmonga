package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,101:1\n76#1,6:102\n76#1,6:108\n76#1,6:114\n76#1,6:120\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n35#1:102,6\n85#1:108,6\n92#1:114,6\n98#1:120,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.f */
public abstract class C15684f extends C8767m.C8772d {

    /* renamed from: X */
    public static final int f38997X = 8;
    @C12580l

    /* renamed from: z */
    public C8767m.C8772d f38998z;

    /* renamed from: B */
    public void mo17226B() {
        super.mo17226B();
        for (C8767m.C8772d dVar = this.f38998z; dVar != null; dVar = dVar.mo17234M()) {
            dVar.mo17251i0(mo17230G());
            dVar.mo17226B();
        }
    }

    /* renamed from: D */
    public void mo17227D() {
        for (C8767m.C8772d dVar = this.f38998z; dVar != null; dVar = dVar.mo17234M()) {
            dVar.mo17227D();
        }
        super.mo17227D();
    }

    /* renamed from: V */
    public void mo17241V() {
        super.mo17241V();
        for (C8767m.C8772d dVar = this.f38998z; dVar != null; dVar = dVar.mo17234M()) {
            dVar.mo17241V();
        }
    }

    /* renamed from: i0 */
    public void mo17251i0(@C12580l NodeCoordinator nodeCoordinator) {
        super.mo17251i0(nodeCoordinator);
        for (C8767m.C8772d dVar = this.f38998z; dVar != null; dVar = dVar.mo17234M()) {
            dVar.mo17251i0(nodeCoordinator);
        }
    }

    /* renamed from: j0 */
    public final void mo45003j0(C8767m.C8772d dVar) {
        C8767m.C8772d dVar2 = this.f38998z;
        if (dVar2 != null) {
            dVar.mo17248f0(dVar2);
        }
        this.f38998z = dVar;
    }

    @C12579k
    /* renamed from: k0 */
    public final <T extends C8767m.C8772d> T mo45004k0(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "fn");
        C8767m.C8772d q = mo17252q();
        T t = (C8767m.C8772d) aVar.invoke();
        t.mo17243Z(q);
        if (mo17236Q()) {
            mo17251i0(q.mo17230G());
            t.mo17226B();
        }
        mo45003j0(t);
        return t;
    }

    /* renamed from: l0 */
    public final void mo45005l0(C11300l<? super C8767m.C8772d, C11079d2> lVar) {
        for (C8767m.C8772d dVar = this.f38998z; dVar != null; dVar = dVar.mo17234M()) {
            lVar.invoke(dVar);
        }
    }
}
