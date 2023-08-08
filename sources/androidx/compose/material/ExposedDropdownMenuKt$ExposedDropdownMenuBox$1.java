package androidx.compose.material;

import android.view.View;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ C15695i1<C15588o> $coordinates;
    final /* synthetic */ C8700z0<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ C8700z0<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$1(C15695i1<C15588o> i1Var, View view, int i, C8700z0<Integer> z0Var, C8700z0<Integer> z0Var2) {
        super(1);
        this.$coordinates = i1Var;
        this.$view = view;
        this.$verticalMarginInPx = i;
        this.$width$delegate = z0Var;
        this.$menuHeight$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo10210a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        ExposedDropdownMenuKt.m13513c(this.$width$delegate, C16500q.m74662m(oVar.mo44434a()));
        this.$coordinates.mo45027b(oVar);
        View rootView = this.$view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        int i = this.$verticalMarginInPx;
        final C8700z0<Integer> z0Var = this.$menuHeight$delegate;
        ExposedDropdownMenuKt.m13522l(rootView, this.$coordinates.mo45026a(), i, new C11300l<Integer, C11079d2>() {
            /* renamed from: a */
            public final void mo10211a(int i) {
                ExposedDropdownMenuKt.m13515e(z0Var, i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo10211a(((Number) obj).intValue());
                return C11079d2.f28267a;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10210a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
