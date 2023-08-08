package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.C16760g;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintLayoutBaseScope$createHorizontalChain$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ C16586c $chainStyle;
    final /* synthetic */ C16591e[] $elements;
    final /* synthetic */ int $id;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutBaseScope$createHorizontalChain$1(int i, C16591e[] eVarArr, C16586c cVar) {
        super(1);
        this.$id = i;
        this.$elements = eVarArr;
        this.$chainStyle = cVar;
    }

    /* renamed from: a */
    public final void mo48315a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        C16745a m = l0Var.mo49315m(Integer.valueOf(this.$id), State.C16743Helper.HORIZONTAL_CHAIN);
        if (m != null) {
            C16760g gVar = (C16760g) m;
            C16591e[] eVarArr = this.$elements;
            ArrayList arrayList = new ArrayList(eVarArr.length);
            for (C16591e k : eVarArr) {
                arrayList.add(k.mo48480k());
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                gVar.mo49328M0(Arrays.copyOf(array, array.length));
                gVar.mo49348T0(this.$chainStyle.mo48456e());
                gVar.mo49232a();
                if (this.$chainStyle.mo48455d() != null) {
                    l0Var.mo49308e(this.$elements[0].mo48480k()).mo49230Y(this.$chainStyle.mo48455d().floatValue());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48315a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
