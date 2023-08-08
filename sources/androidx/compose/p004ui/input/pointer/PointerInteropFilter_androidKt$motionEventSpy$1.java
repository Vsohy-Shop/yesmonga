package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", mo22502f = "PointerInteropFilter.android.kt", mo22503i = {}, mo22504l = {343}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/e0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1 */
public final class PointerInteropFilter_androidKt$motionEventSpy$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<MotionEvent, C11079d2> $watcher;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", mo22502f = "PointerInteropFilter.android.kt", mo22503i = {0}, mo22504l = {345}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitPointerEventScope"}, mo22507s = {"L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1 */
    public static final class C154531 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C154531 r0 = new C154531(lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C154531) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r6.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
                kotlin.C11661u0.m45747n(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L_0x0039
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                kotlin.C11661u0.m45747n(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p004ui.input.pointer.C15465c) r7
                r1 = r7
                r7 = r6
            L_0x0027:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r3 = r1.mo44003i3(r3, r7)
                if (r3 != r0) goto L_0x0034
                return r0
            L_0x0034:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L_0x0039:
                androidx.compose.ui.input.pointer.o r7 = (androidx.compose.p004ui.input.pointer.C15491o) r7
                android.view.MotionEvent r7 = r7.mo44113h()
                if (r7 == 0) goto L_0x0046
                kotlin.jvm.functions.l<android.view.MotionEvent, kotlin.d2> r4 = r3
                r4.invoke(r7)
            L_0x0046:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.C154531.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$motionEventSpy$1(C11300l<? super MotionEvent, C11079d2> lVar, C11045c<? super PointerInteropFilter_androidKt$motionEventSpy$1> cVar) {
        super(2, cVar);
        this.$watcher = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.$watcher, cVar);
        pointerInteropFilter_androidKt$motionEventSpy$1.L$0 = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C15472e0 e0Var = (C15472e0) this.L$0;
            e0Var.mo43992M2(true);
            final C11300l<MotionEvent, C11079d2> lVar = this.$watcher;
            C154531 r1 = new C154531((C11045c<? super C154531>) null);
            this.label = 1;
            if (e0Var.mo43994R0(r1, this) == h) {
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
