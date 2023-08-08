package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", mo22502f = "Draggable.kt", mo22503i = {}, mo22504l = {193}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroidx/compose/ui/unit/w;", "velocity", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DraggableKt$draggable$5 extends SuspendLambda implements C11305q<C12074o0, C16509w, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$5(C11305q<? super C12074o0, ? super Float, ? super C11045c<? super C11079d2>, ? extends Object> qVar, Orientation orientation, C11045c<? super DraggableKt$draggable$5> cVar) {
        super(3, cVar);
        this.$onDragStopped = qVar;
        this.$orientation = orientation;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7400g(@C12579k C12074o0 o0Var, long j, @C12580l C11045c<? super C11079d2> cVar) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, cVar);
        draggableKt$draggable$5.L$0 = o0Var;
        draggableKt$draggable$5.J$0 = j;
        return draggableKt$draggable$5.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7400g((C12074o0) obj, ((C16509w) obj2).mo47914v(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            long j = this.J$0;
            C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> qVar = this.$onDragStopped;
            Float e = C11064a.m42619e(DraggableKt.m9312p(j, this.$orientation));
            this.label = 1;
            if (qVar.invoke((C12074o0) this.L$0, e, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
