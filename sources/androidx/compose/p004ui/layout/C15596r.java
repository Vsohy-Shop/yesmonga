package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15683e1;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.r */
public final class C15596r extends C8767m.C8772d implements C15683e1, C15598s {
    @C12579k

    /* renamed from: z */
    public Object f38740z;

    public C15596r(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "layoutId");
        this.f38740z = obj;
    }

    @C12580l
    /* renamed from: N */
    public Object mo44447N(@C12579k C16479d dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return this;
    }

    /* renamed from: j0 */
    public void mo44448j0(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f38740z = obj;
    }

    @C12579k
    /* renamed from: u */
    public Object mo44449u() {
        return this.f38740z;
    }
}
