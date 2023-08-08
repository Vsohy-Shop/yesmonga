package androidx.compose.foundation;

import androidx.compose.runtime.C8415c2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", mo22502f = "BasicMarquee.kt", mo22503i = {}, mo22504l = {272}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MarqueeModifier$runAnimation$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ MarqueeModifier this$0;

    @C11067d(mo22501c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", mo22502f = "BasicMarquee.kt", mo22503i = {0, 0}, mo22504l = {285, 287, 289, 289}, mo22505m = "invokeSuspend", mo22506n = {"contentWithSpacingWidth", "spec"}, mo22507s = {"L$0", "L$1"})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H@"}, mo22516d2 = {"", "contentWithSpacingWidth", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2 */
    public static final class C20952 extends SuspendLambda implements C11304p<Float, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C20952 r0 = new C20952(marqueeModifier2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12580l Float f, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C20952) create(f, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba A[RETURN] */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r0 = r9.label
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L_0x0043
                if (r0 == r2) goto L_0x0036
                if (r0 == r1) goto L_0x002e
                if (r0 == r12) goto L_0x0029
                if (r0 == r11) goto L_0x0020
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0020:
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.C11661u0.m45747n(r22)
                goto L_0x00d5
            L_0x0029:
                kotlin.C11661u0.m45747n(r22)
                goto L_0x00bb
            L_0x002e:
                kotlin.C11661u0.m45747n(r22)     // Catch:{ all -> 0x0033 }
                goto L_0x00a8
            L_0x0033:
                r0 = move-exception
                goto L_0x00be
            L_0x0036:
                java.lang.Object r0 = r9.L$1
                androidx.compose.animation.core.g r0 = (androidx.compose.animation.core.C1968g) r0
                java.lang.Object r2 = r9.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                kotlin.C11661u0.m45747n(r22)
                r3 = r0
                goto L_0x008d
            L_0x0043:
                kotlin.C11661u0.m45747n(r22)
                java.lang.Object r0 = r9.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L_0x004f
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            L_0x004f:
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r15 = r3.f5753a
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r17 = r3.f5755c
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r18 = r3.f5754b
                androidx.compose.foundation.MarqueeModifier r3 = r3
                float r19 = r3.f5756d
                androidx.compose.foundation.MarqueeModifier r3 = r3
                androidx.compose.ui.unit.d r20 = r3.f5757e
                androidx.compose.animation.core.g r3 = androidx.compose.foundation.BasicMarqueeKt.m8832e(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifier r4 = r3
                androidx.compose.animation.core.Animatable r4 = r4.f5763y
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r14)
                r9.L$0 = r0
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r2 = r4.mo6597B(r5, r9)
                if (r2 != r10) goto L_0x008c
                return r10
            L_0x008c:
                r2 = r0
            L_0x008d:
                androidx.compose.foundation.MarqueeModifier r0 = r3     // Catch:{ all -> 0x0033 }
                androidx.compose.animation.core.Animatable r0 = r0.f5763y     // Catch:{ all -> 0x0033 }
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r9.L$0 = r13     // Catch:{ all -> 0x0033 }
                r9.L$1 = r13     // Catch:{ all -> 0x0033 }
                r9.label = r1     // Catch:{ all -> 0x0033 }
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.m7942i(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0033 }
                if (r0 != r10) goto L_0x00a8
                return r10
            L_0x00a8:
                androidx.compose.foundation.MarqueeModifier r0 = r3
                androidx.compose.animation.core.Animatable r0 = r0.f5763y
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r14)
                r9.label = r12
                java.lang.Object r0 = r0.mo6597B(r1, r9)
                if (r0 != r10) goto L_0x00bb
                return r10
            L_0x00bb:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            L_0x00be:
                androidx.compose.foundation.MarqueeModifier r1 = r3
                androidx.compose.animation.core.Animatable r1 = r1.f5763y
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r14)
                r9.L$0 = r0
                r9.L$1 = r13
                r9.label = r11
                java.lang.Object r1 = r1.mo6597B(r2, r9)
                if (r1 != r10) goto L_0x00d5
                return r10
            L_0x00d5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier$runAnimation$2.C20952.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeModifier$runAnimation$2(MarqueeModifier marqueeModifier, C11045c<? super MarqueeModifier$runAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = marqueeModifier;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new MarqueeModifier$runAnimation$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final MarqueeModifier marqueeModifier = this.this$0;
            C11907e v = C8415c2.m30253v(new C11289a<Float>() {
                @C12580l
                /* renamed from: a */
                public final Float invoke() {
                    if (marqueeModifier.mo7221v() <= marqueeModifier.mo7220u()) {
                        return null;
                    }
                    if (!C2120f0.m9149f(marqueeModifier.mo7219t(), C2120f0.f5809b.mo7308c()) || marqueeModifier.mo7222x()) {
                        return Float.valueOf((float) (marqueeModifier.mo7221v() + marqueeModifier.mo7224z()));
                    }
                    return null;
                }
            });
            final MarqueeModifier marqueeModifier2 = this.this$0;
            C20952 r1 = new C20952((C11045c<? super C20952>) null);
            this.label = 1;
            if (C11909g.m47348A(v, r1, this) == h) {
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
        return ((MarqueeModifier$runAnimation$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
