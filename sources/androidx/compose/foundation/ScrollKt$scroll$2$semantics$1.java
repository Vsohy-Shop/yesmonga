package androidx.compose.foundation;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.p004ui.semantics.C16033h;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScrollKt$scroll$2$semantics$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1(boolean z, boolean z2, boolean z3, ScrollState scrollState, C12074o0 o0Var) {
        super(1);
        this.$reverseScrolling = z;
        this.$isVertical = z2;
        this.$isScrollable = z3;
        this.$state = scrollState;
        this.$coroutineScope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        C16033h hVar = new C16033h(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.$state), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.$state), this.$reverseScrolling);
        if (this.$isVertical) {
            SemanticsPropertiesKt.m72006c1(qVar, hVar);
        } else {
            SemanticsPropertiesKt.m71967K0(qVar, hVar);
        }
        if (this.$isScrollable) {
            final C12074o0 o0Var = this.$coroutineScope;
            final boolean z = this.$isVertical;
            final ScrollState scrollState = this.$state;
            SemanticsPropertiesKt.m72053z0(qVar, (String) null, new C11304p<Float, Float, Boolean>() {

                @C11067d(mo22501c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", mo22502f = "Scroll.kt", mo22503i = {}, mo22504l = {285, 287}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1 */
                public static final class C20981 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return new C20981(z, scrollState, f3, f4, cVar);
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        Object h = C11063b.m42612h();
                        int i = this.label;
                        if (i == 0) {
                            C11661u0.m45747n(obj);
                            if (z) {
                                ScrollState scrollState = scrollState;
                                Intrinsics.checkNotNull(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f = f3;
                                this.label = 1;
                                if (ScrollExtensionsKt.m9368b(scrollState, f, (C1968g) null, this, 2, (Object) null) == h) {
                                    return h;
                                }
                            } else {
                                ScrollState scrollState2 = scrollState;
                                Intrinsics.checkNotNull(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f2 = f4;
                                this.label = 2;
                                if (ScrollExtensionsKt.m9368b(scrollState2, f2, (C1968g) null, this, 2, (Object) null) == h) {
                                    return h;
                                }
                            }
                        } else if (i == 1 || i == 2) {
                            C11661u0.m45747n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C11079d2.f28267a;
                    }

                    @C12580l
                    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                        return ((C20981) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                    }
                }

                @C12579k
                /* renamed from: a */
                public final Boolean mo7245a(float f, float f2) {
                    C12074o0 o0Var = o0Var;
                    final boolean z = z;
                    final ScrollState scrollState = scrollState;
                    final float f3 = f2;
                    final float f4 = f;
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C20981((C11045c<? super C20981>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return mo7245a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            }, 1, (Object) null);
        }
    }
}
