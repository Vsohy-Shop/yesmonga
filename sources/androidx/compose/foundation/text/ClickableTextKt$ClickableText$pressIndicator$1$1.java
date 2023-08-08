package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", mo22502f = "ClickableText.kt", mo22503i = {}, mo22504l = {82}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8700z0<C16260h0> $layoutResult;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pressIndicator$1$1(C8700z0<C16260h0> z0Var, C11300l<? super Integer, C11079d2> lVar, C11045c<? super ClickableTextKt$ClickableText$pressIndicator$1$1> cVar) {
        super(2, cVar);
        this.$layoutResult = z0Var;
        this.$onClick = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, cVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C8700z0<C16260h0> z0Var = this.$layoutResult;
            final C11300l<Integer, C11079d2> lVar = this.$onClick;
            C27011 r7 = new C11300l<C15094f, C11079d2>() {
                /* renamed from: a */
                public final void mo9253a(long j) {
                    C16260h0 value = z0Var.getValue();
                    if (value != null) {
                        lVar.invoke(Integer.valueOf(value.mo47070x(j)));
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo9253a(((C15094f) obj).mo42242A());
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.m9446m((C15472e0) this.L$0, (C11300l) null, (C11300l) null, (C11305q) null, r7, this, 7, (Object) null) == h) {
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
