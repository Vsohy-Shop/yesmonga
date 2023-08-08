package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.C16755c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintLayoutBaseScope$createAbsoluteLeftBarrier$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ C16591e[] $elements;
    final /* synthetic */ int $id;
    final /* synthetic */ float $margin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutBaseScope$createAbsoluteLeftBarrier$1(int i, float f, C16591e[] eVarArr) {
        super(1);
        this.$id = i;
        this.$margin = f;
        this.$elements = eVarArr;
    }

    /* renamed from: a */
    public final void mo48302a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        C16755c b = l0Var.mo49305b(Integer.valueOf(this.$id), State.Direction.LEFT);
        C16591e[] eVarArr = this.$elements;
        ArrayList arrayList = new ArrayList(eVarArr.length);
        for (C16591e k : eVarArr) {
            arrayList.add(k.mo48480k());
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array != null) {
            b.mo49328M0(Arrays.copyOf(array, array.length));
            b.mo49237c0(l0Var.mo48546f(C16483g.m74451w(this.$margin)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48302a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
