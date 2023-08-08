package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", mo22502f = "Clickable.kt", mo22503i = {1}, mo22504l = {439, 442}, mo22505m = "invokeSuspend", mo22506n = {"pressInteraction"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8578k2<C11289a<Boolean>> $delayPressInteraction;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ C8700z0<C2245i.C2247b> $pressedInteraction;
    Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(C8578k2<? extends C11289a<Boolean>> k2Var, long j, C2243g gVar, C8700z0<C2245i.C2247b> z0Var, C11045c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.$delayPressInteraction = k2Var;
        this.$pressPoint = j;
        this.$interactionSource = gVar;
        this.$pressedInteraction = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C2245i.C2247b bVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (((Boolean) this.$delayPressInteraction.getValue().invoke()).booleanValue()) {
                long b = Clickable_androidKt.m8912b();
                this.label = 1;
                if (DelayKt.m45925b(b, this) == h) {
                    return h;
                }
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            bVar = (C2245i.C2247b) this.L$0;
            C11661u0.m45747n(obj);
            this.$pressedInteraction.setValue(bVar);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C2245i.C2247b bVar2 = new C2245i.C2247b(this.$pressPoint, (DefaultConstructorMarker) null);
        C2243g gVar = this.$interactionSource;
        this.L$0 = bVar2;
        this.label = 2;
        if (gVar.mo7604a(bVar2, this) == h) {
            return h;
        }
        bVar = bVar2;
        this.$pressedInteraction.setValue(bVar);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
