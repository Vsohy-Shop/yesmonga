package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, mo22516d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "floatValue", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstrainScope$translationY$1 extends Lambda implements C11304p<ConstraintReference, Float, C11079d2> {

    /* renamed from: f */
    public static final ConstrainScope$translationY$1 f41124f = new ConstrainScope$translationY$1();

    public ConstrainScope$translationY$1() {
        super(2);
    }

    /* renamed from: a */
    public final void mo48242a(@C12579k ConstraintReference constraintReference, float f) {
        Intrinsics.checkNotNullParameter(constraintReference, "$this$addFloatTransformFromDp");
        constraintReference.mo49207G0(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo48242a((ConstraintReference) obj, ((Number) obj2).floatValue());
        return C11079d2.f28267a;
    }
}
