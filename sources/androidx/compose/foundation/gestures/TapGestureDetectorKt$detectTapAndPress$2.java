package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", mo22502f = "TapGestureDetector.kt", mo22503i = {}, mo22504l = {232}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> $onPress;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ C15472e0 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", mo22502f = "TapGestureDetector.kt", mo22503i = {0}, mo22504l = {237, 245}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture"}, mo22507s = {"L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    public static final class C21581 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21581 r0 = new C21581(o0Var, qVar, lVar, pressGestureScopeImpl, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C21581) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.ui.input.pointer.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L_0x002a
                if (r0 == r9) goto L_0x001f
                if (r0 != r8) goto L_0x0017
                kotlin.C11661u0.m45747n(r24)
                r0 = r24
                goto L_0x007d
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.c r0 = (androidx.compose.p004ui.input.pointer.C15465c) r0
                kotlin.C11661u0.m45747n(r24)
                r11 = r0
                r0 = r24
                goto L_0x0051
            L_0x002a:
                kotlin.C11661u0.m45747n(r24)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p004ui.input.pointer.C15465c) r11
                kotlinx.coroutines.o0 r0 = r4
                r1 = 0
                r2 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r7
                r3.<init>(r4, r10)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r0, r1, r2, r3, r4, r5)
                r1 = 0
                r6.L$0 = r11
                r6.label = r9
                r0 = r11
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0051
                return r7
            L_0x0051:
                androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
                r0.mo44168a()
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r1 = r5
                kotlin.jvm.functions.q r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f5912a
                if (r1 == r2) goto L_0x0072
                kotlinx.coroutines.o0 r12 = r4
                r13 = 0
                r14 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r1 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r7
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r12, r13, r14, r15, r16, r17)
            L_0x0072:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9449p(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L_0x007d
                return r7
            L_0x007d:
                androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
                if (r0 != 0) goto L_0x0093
                kotlinx.coroutines.o0 r11 = r4
                r12 = 0
                r13 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r7
                r14.<init>(r0, r10)
                r15 = 3
                r16 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r11, r12, r13, r14, r15, r16)
                goto L_0x00bd
            L_0x0093:
                r0.mo44168a()
                kotlinx.coroutines.o0 r1 = r4
                r18 = 0
                r19 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r7
                r2.<init>(r3, r10)
                r21 = 3
                r22 = 0
                r17 = r1
                r20 = r2
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r17, r18, r19, r20, r21, r22)
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r1 = r6
                if (r1 == 0) goto L_0x00bd
                long r2 = r0.mo44177q()
                androidx.compose.ui.geometry.f r0 = androidx.compose.p004ui.geometry.C15094f.m64868d(r2)
                r1.invoke(r0)
            L_0x00bd:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.C21581.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(C15472e0 e0Var, C11305q<? super C2198j, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11300l<? super C15094f, C11079d2> lVar, PressGestureScopeImpl pressGestureScopeImpl, C11045c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
        super(2, cVar);
        this.$this_detectTapAndPress = e0Var;
        this.$onPress = qVar;
        this.$onTap = lVar;
        this.$pressScope = pressGestureScopeImpl;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, cVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C12074o0 o0Var = (C12074o0) this.L$0;
            C15472e0 e0Var = this.$this_detectTapAndPress;
            final C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> qVar = this.$onPress;
            final C11300l<C15094f, C11079d2> lVar = this.$onTap;
            final PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
            C21581 r3 = new C21581((C11045c<? super C21581>) null);
            this.label = 1;
            if (ForEachGestureKt.m9336d(e0Var, r3, this) == h) {
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
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
