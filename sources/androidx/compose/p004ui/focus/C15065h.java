package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.h */
public final class C15065h extends C8767m.C8772d implements C15064g {
    @C12579k

    /* renamed from: z */
    public C11300l<? super C15087z, C11079d2> f37240z;

    public C15065h(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFocusEvent");
        this.f37240z = lVar;
    }

    /* renamed from: W */
    public void mo42177W(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "focusState");
        this.f37240z.invoke(zVar);
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<C15087z, C11079d2> mo42194j0() {
        return this.f37240z;
    }

    /* renamed from: k0 */
    public final void mo42195k0(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37240z = lVar;
    }
}
