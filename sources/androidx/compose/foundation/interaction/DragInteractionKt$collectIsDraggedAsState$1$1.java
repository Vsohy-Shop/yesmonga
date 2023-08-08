package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.runtime.C8700z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", mo22502f = "DragInteraction.kt", mo22503i = {}, mo22504l = {84}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DragInteractionKt$collectIsDraggedAsState$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8700z0<Boolean> $isDragged;
    final /* synthetic */ C2241e $this_collectIsDraggedAsState;
    int label;

    /* renamed from: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1$a */
    public static final class C2226a implements C11908f<C2240d> {

        /* renamed from: a */
        public final /* synthetic */ List<C2230a.C2232b> f5978a;

        /* renamed from: b */
        public final /* synthetic */ C8700z0<Boolean> f5979b;

        public C2226a(List<C2230a.C2232b> list, C8700z0<Boolean> z0Var) {
            this.f5978a = list;
            this.f5979b = z0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C2240d dVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (dVar instanceof C2230a.C2232b) {
                this.f5978a.add(dVar);
            } else if (dVar instanceof C2230a.C2233c) {
                this.f5978a.remove(((C2230a.C2233c) dVar).mo7600a());
            } else if (dVar instanceof C2230a.C2231a) {
                this.f5978a.remove(((C2230a.C2231a) dVar).mo7599a());
            }
            this.f5979b.setValue(C11064a.m42615a(!this.f5978a.isEmpty()));
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1$1(C2241e eVar, C8700z0<Boolean> z0Var, C11045c<? super DragInteractionKt$collectIsDraggedAsState$1$1> cVar) {
        super(2, cVar);
        this.$this_collectIsDraggedAsState = eVar;
        this.$isDragged = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DragInteractionKt$collectIsDraggedAsState$1$1(this.$this_collectIsDraggedAsState, this.$isDragged, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ArrayList arrayList = new ArrayList();
            C11907e<C2240d> c = this.$this_collectIsDraggedAsState.mo7603c();
            C2226a aVar = new C2226a(arrayList, this.$isDragged);
            this.label = 1;
            if (c.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DragInteractionKt$collectIsDraggedAsState$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
