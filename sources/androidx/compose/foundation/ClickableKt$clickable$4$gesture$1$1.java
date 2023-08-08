package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C2198j;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
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
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", mo22502f = "Clickable.kt", mo22503i = {}, mo22504l = {156}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,565:1\n157#2:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n*L\n155#1:566\n*E\n"})
public final class ClickableKt$clickable$4$gesture$1$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8700z0<C15094f> $centreOffset;
    final /* synthetic */ C8578k2<C11289a<Boolean>> $delayPressInteraction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8578k2<C11289a<C11079d2>> $onClickState;
    final /* synthetic */ C8700z0<C2245i.C2247b> $pressedInteraction;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", mo22502f = "Clickable.kt", mo22503i = {}, mo22504l = {159}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1 */
    public static final class C20591 extends SuspendLambda implements C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object mo7153g(@C12579k C2198j jVar, long j, @C12580l C11045c<? super C11079d2> cVar) {
            C20591 r0 = new C20591(z, gVar, z0Var2, k2Var, cVar);
            r0.L$0 = jVar;
            r0.J$0 = j;
            return r0.invokeSuspend(C11079d2.f28267a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo7153g((C2198j) obj, ((C15094f) obj2).mo42242A(), (C11045c) obj3);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C2198j jVar = (C2198j) this.L$0;
                long j = this.J$0;
                if (z) {
                    C2243g gVar = gVar;
                    C8700z0<C2245i.C2247b> z0Var = z0Var2;
                    C8578k2<C11289a<Boolean>> k2Var = k2Var;
                    this.label = 1;
                    if (ClickableKt.m8887n(jVar, j, gVar, z0Var, k2Var, this) == h) {
                        return h;
                    }
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$gesture$1$1(C8700z0<C15094f> z0Var, boolean z, C2243g gVar, C8700z0<C2245i.C2247b> z0Var2, C8578k2<? extends C11289a<Boolean>> k2Var, C8578k2<? extends C11289a<C11079d2>> k2Var2, C11045c<? super ClickableKt$clickable$4$gesture$1$1> cVar) {
        super(2, cVar);
        this.$centreOffset = z0Var;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$pressedInteraction = z0Var2;
        this.$delayPressInteraction = k2Var;
        this.$onClickState = k2Var2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ClickableKt$clickable$4$gesture$1$1 clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(this.$centreOffset, this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, cVar);
        clickableKt$clickable$4$gesture$1$1.L$0 = obj;
        return clickableKt$clickable$4$gesture$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ClickableKt$clickable$4$gesture$1$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C15472e0 e0Var = (C15472e0) this.L$0;
            C8700z0<C15094f> z0Var = this.$centreOffset;
            long b = C16502r.m74669b(e0Var.mo44043a());
            z0Var.setValue(C15094f.m64868d(C15096g.m64898a((float) C16494m.m74581m(b), (float) C16494m.m74583o(b))));
            final boolean z = this.$enabled;
            final C2243g gVar = this.$interactionSource;
            final C8700z0<C2245i.C2247b> z0Var2 = this.$pressedInteraction;
            final C8578k2<C11289a<Boolean>> k2Var = this.$delayPressInteraction;
            C20591 r4 = new C20591((C11045c<? super C20591>) null);
            final boolean z2 = this.$enabled;
            final C8578k2<C11289a<C11079d2>> k2Var2 = this.$onClickState;
            C20602 r3 = new C11300l<C15094f, C11079d2>() {
                /* renamed from: a */
                public final void mo7154a(long j) {
                    if (z2) {
                        k2Var2.getValue().invoke();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo7154a(((C15094f) obj).mo42242A());
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.m9443j(e0Var, r4, r3, this) == h) {
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
