package androidx.compose.foundation.pager;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerKt$pagerSemantics$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$1(boolean z, PagerState pagerState, C12074o0 o0Var) {
        super(1);
        this.$isVertical = z;
        this.$state = pagerState;
        this.$scope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        if (this.$isVertical) {
            final PagerState pagerState = this.$state;
            final C12074o0 o0Var = this.$scope;
            SemanticsPropertiesKt.m72037r0(qVar, (String) null, new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.m11910n(pagerState, o0Var));
                }
            }, 1, (Object) null);
            final PagerState pagerState2 = this.$state;
            final C12074o0 o0Var2 = this.$scope;
            SemanticsPropertiesKt.m72025l0(qVar, (String) null, new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.m11911o(pagerState2, o0Var2));
                }
            }, 1, (Object) null);
            return;
        }
        final PagerState pagerState3 = this.$state;
        final C12074o0 o0Var3 = this.$scope;
        SemanticsPropertiesKt.m72029n0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.m11910n(pagerState3, o0Var3));
            }
        }, 1, (Object) null);
        final PagerState pagerState4 = this.$state;
        final C12074o0 o0Var4 = this.$scope;
        SemanticsPropertiesKt.m72033p0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.m11911o(pagerState4, o0Var4));
            }
        }, 1, (Object) null);
    }
}
