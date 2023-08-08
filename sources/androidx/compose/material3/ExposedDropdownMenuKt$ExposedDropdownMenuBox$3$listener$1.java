package androidx.compose.material3;

import android.view.View;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C15695i1<C15588o> $coordinates;
    final /* synthetic */ C8700z0<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$listener$1(View view, C15695i1<C15588o> i1Var, int i, C8700z0<Integer> z0Var) {
        super(0);
        this.$view = view;
        this.$coordinates = i1Var;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = z0Var;
    }

    public final void invoke() {
        View rootView = this.$view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        int i = this.$verticalMarginInPx;
        final C8700z0<Integer> z0Var = this.$menuHeight$delegate;
        ExposedDropdownMenuKt.m25784n(rootView, this.$coordinates.mo45026a(), i, new C11300l<Integer, C11079d2>() {
            /* renamed from: a */
            public final void mo11561a(int i) {
                ExposedDropdownMenuKt.m25775e(z0Var, i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11561a(((Number) obj).intValue());
                return C11079d2.f28267a;
            }
        });
    }
}
