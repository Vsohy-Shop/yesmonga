package androidx.compose.p004ui.text.font;

import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16217k1;
import androidx.compose.p004ui.text.platform.C16385n;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.n0 */
public final class C16225n0 implements C16252y {
    @C12579k

    /* renamed from: a */
    public final C16233q0 f40327a = C16241t0.m73158a();

    @C12580l
    /* renamed from: a */
    public C16217k1 mo46792a(@C12579k C16214j1 j1Var, @C12579k C16227o0 o0Var, @C12579k C11300l<? super C16217k1.C16219b, C11079d2> lVar, @C12579k C11300l<? super C16214j1, ? extends Object> lVar2) {
        boolean z;
        Typeface typeface;
        Intrinsics.checkNotNullParameter(j1Var, "typefaceRequest");
        Intrinsics.checkNotNullParameter(o0Var, "platformFontLoader");
        Intrinsics.checkNotNullParameter(lVar, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(lVar2, "createDefaultTypeface");
        C16242u h = j1Var.mo46968h();
        if (h == null) {
            z = true;
        } else {
            z = h instanceof C16220l;
        }
        if (z) {
            typeface = this.f40327a.mo47000b(j1Var.mo46972k(), j1Var.mo46970i());
        } else if (h instanceof C16216k0) {
            typeface = this.f40327a.mo46999a((C16216k0) j1Var.mo46968h(), j1Var.mo46972k(), j1Var.mo46970i());
        } else if (!(h instanceof C16221l0)) {
            return null;
        } else {
            C16251x0 H = ((C16221l0) j1Var.mo46968h()).mo46980H();
            Intrinsics.checkNotNull(H, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typeface = ((C16385n) H).mo47534b(j1Var.mo46972k(), j1Var.mo46970i(), j1Var.mo46971j());
        }
        return new C16217k1.C16219b(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}
