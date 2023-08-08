package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstrainScope$alpha$1 extends Lambda implements C11300l<ConstraintReference, C11079d2> {
    final /* synthetic */ float $value;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainScope$alpha$1(ConstrainScope constrainScope, float f) {
        super(1);
        this.this$0 = constrainScope;
        this.$value = f;
    }

    /* renamed from: a */
    public final void mo48223a(@C12579k ConstraintReference constraintReference) {
        Intrinsics.checkNotNullParameter(constraintReference, "$this$addTransform");
        if (!Intrinsics.areEqual((Object) this.this$0.mo48174M(), (Object) C16625r0.f41307b.mo48577c())) {
            constraintReference.mo49247h(this.$value);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48223a((ConstraintReference) obj);
        return C11079d2.f28267a;
    }
}
