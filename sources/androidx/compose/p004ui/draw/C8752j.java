package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.node.C15693i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.draw.j */
public final class C8752j extends C8767m.C8772d implements C15693i {
    @C12579k

    /* renamed from: z */
    public C11300l<? super C15184c, C11079d2> f23454z;

    public C8752j(@C12579k C11300l<? super C15184c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDraw");
        this.f23454z = lVar;
    }

    /* renamed from: C */
    public void mo17117C(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        this.f23454z.invoke(cVar);
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<C15184c, C11079d2> mo17184j0() {
        return this.f23454z;
    }

    /* renamed from: k0 */
    public final void mo17185k0(@C12579k C11300l<? super C15184c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f23454z = lVar;
    }
}
