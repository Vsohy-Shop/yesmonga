package androidx.compose.material3;

import androidx.compose.material3.tokens.C8289b;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BadgeKt$BadgedBox$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $anchorPlaceable;
    final /* synthetic */ C15611w0 $badgePlaceable;
    final /* synthetic */ C15568h0 $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$measure$1(C15611w0 w0Var, C15568h0 h0Var, C15611w0 w0Var2) {
        super(1);
        this.$badgePlaceable = w0Var;
        this.$this_Layout = h0Var;
        this.$anchorPlaceable = w0Var2;
    }

    /* renamed from: a */
    public final void mo11168a(@C12579k C15611w0.C15612a aVar) {
        boolean z;
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        if (this.$badgePlaceable.mo44471K0() > this.$this_Layout.mo7429n2(C8289b.f20724a.mo13193h())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = BadgeKt.m25417d();
        } else {
            f = BadgeKt.m25416c();
        }
        if (z) {
            f2 = BadgeKt.m25419f();
        } else {
            f2 = BadgeKt.m25416c();
        }
        C15611w0.C15612a.m69414v(aVar, this.$anchorPlaceable, 0, 0, 0.0f, 4, (Object) null);
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, this.$badgePlaceable, this.$anchorPlaceable.mo44471K0() + this.$this_Layout.mo7429n2(f), ((-this.$badgePlaceable.mo44468G0()) / 2) + this.$this_Layout.mo7429n2(f2), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11168a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
