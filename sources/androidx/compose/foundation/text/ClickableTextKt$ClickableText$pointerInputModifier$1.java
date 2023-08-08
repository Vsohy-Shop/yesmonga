package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", mo22502f = "ClickableText.kt", mo22503i = {}, mo22504l = {174}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C8700z0<C16260h0> $layoutResult;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;
    final /* synthetic */ C11300l<Integer, C11079d2> $onHover;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", mo22502f = "ClickableText.kt", mo22503i = {}, mo22504l = {165}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1 */
    public static final class C26981 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C26981(e0Var, lVar, z0Var, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C15472e0 e0Var = e0Var;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                final C11300l<Integer, C11079d2> lVar = lVar;
                final C8700z0<C16260h0> z0Var = z0Var;
                C26991 r4 = new C11300l<C15094f, C11079d2>() {
                    /* renamed from: a */
                    public final void mo9250a(long j) {
                        T d = ClickableTextKt.m12221c(z0Var, j);
                        if (!Intrinsics.areEqual((Object) objectRef.element, (Object) d)) {
                            objectRef.element = d;
                            lVar.invoke(d);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo9250a(((C15094f) obj).mo42242A());
                        return C11079d2.f28267a;
                    }
                };
                this.label = 1;
                if (PointerMoveDetectorKt.m12328a(e0Var, pointerEventPass, r4, this) == h) {
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
            return ((C26981) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pointerInputModifier$1(C12074o0 o0Var, C11300l<? super Integer, C11079d2> lVar, C8700z0<C16260h0> z0Var, C11300l<? super Integer, C11079d2> lVar2, C11045c<? super ClickableTextKt$ClickableText$pointerInputModifier$1> cVar) {
        super(2, cVar);
        this.$coroutineScope = o0Var;
        this.$onHover = lVar;
        this.$layoutResult = z0Var;
        this.$onClick = lVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, cVar);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C15472e0 e0Var = (C15472e0) this.L$0;
            C12074o0 o0Var = this.$coroutineScope;
            final C11300l<Integer, C11079d2> lVar = this.$onHover;
            final C8700z0<C16260h0> z0Var = this.$layoutResult;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C26981((C11045c<? super C26981>) null), 3, (Object) null);
            final C11300l<Integer, C11079d2> lVar2 = this.$onClick;
            final C8700z0<C16260h0> z0Var2 = this.$layoutResult;
            C27002 r7 = new C11300l<C15094f, C11079d2>() {
                /* renamed from: a */
                public final void mo9251a(long j) {
                    Integer d = ClickableTextKt.m12221c(z0Var2, j);
                    if (d != null) {
                        lVar2.invoke(d);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo9251a(((C15094f) obj).mo42242A());
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.m9446m(e0Var, (C11300l) null, (C11300l) null, (C11305q) null, r7, this, 7, (Object) null) == h) {
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
