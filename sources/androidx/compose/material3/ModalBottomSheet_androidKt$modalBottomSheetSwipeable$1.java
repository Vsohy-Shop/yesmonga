package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1 extends FunctionReferenceImpl implements C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object>, C11074j {
    public ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1(Object obj) {
        super(3, obj, Intrinsics.C11316a.class, "suspendConversion0", "modalBottomSheetSwipeable$suspendConversion0(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @C12580l
    /* renamed from: d */
    public final Object mo11687d(@C12579k C12074o0 o0Var, float f, @C12579k C11045c<? super C11079d2> cVar) {
        return ((C11304p) this.receiver).invoke(o0Var, C11064a.m42619e(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo11687d((C12074o0) obj, ((Number) obj2).floatValue(), (C11045c) obj3);
    }
}
