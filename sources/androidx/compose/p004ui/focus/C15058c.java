package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
/* renamed from: androidx.compose.ui.focus.c */
public final class C15058c extends C8767m.C8772d implements C15064g {
    @C12580l

    /* renamed from: X */
    public C15087z f37226X;
    @C12579k

    /* renamed from: z */
    public C11300l<? super C15087z, C11079d2> f37227z;

    public C15058c(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFocusChanged");
        this.f37227z = lVar;
    }

    /* renamed from: W */
    public void mo42177W(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "focusState");
        if (!Intrinsics.areEqual((Object) this.f37226X, (Object) zVar)) {
            this.f37226X = zVar;
            this.f37227z.invoke(zVar);
        }
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<C15087z, C11079d2> mo42178j0() {
        return this.f37227z;
    }

    /* renamed from: k0 */
    public final void mo42179k0(@C12579k C11300l<? super C15087z, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37227z = lVar;
    }
}
