package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", mo22502f = "Draggable.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroidx/compose/ui/unit/w;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DraggableKt$draggable$7 extends SuspendLambda implements C11305q<C12074o0, C16509w, C11045c<? super C11079d2>, Object> {
    int label;

    public DraggableKt$draggable$7(C11045c<? super DraggableKt$draggable$7> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7402g(@C12579k C12074o0 o0Var, long j, @C12580l C11045c<? super C11079d2> cVar) {
        return new DraggableKt$draggable$7(cVar).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7402g((C12074o0) obj, ((C16509w) obj2).mo47914v(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
