package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", mo22502f = "Scrollable.kt", mo22503i = {0, 1, 1, 2, 2}, mo22504l = {406, 408, 410}, mo22505m = "invokeSuspend", mo22506n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, mo22507s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/unit/w;", "velocity", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements C11304p<C16509w, C11045c<? super C16509w>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, C11045c<? super ScrollingLogic$onDragStopped$performFling$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, cVar);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((C16509w) obj).mo47914v();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7483g(long j, @C12580l C11045c<? super C16509w> cVar) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(C16509w.m74740b(j), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo7483g(((C16509w) obj).mo47914v(), (C11045c) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r3) goto L_0x002e
            if (r0 == r2) goto L_0x0024
            if (r0 != r1) goto L_0x001c
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.C11661u0.m45747n(r14)
            r9 = r0
            r0 = r14
            goto L_0x0095
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            long r2 = r13.J$1
            long r4 = r13.J$0
            kotlin.C11661u0.m45747n(r14)
            r0 = r14
            r7 = r4
            goto L_0x006e
        L_0x002e:
            long r3 = r13.J$0
            kotlin.C11661u0.m45747n(r14)
            r0 = r14
            goto L_0x0052
        L_0x0035:
            kotlin.C11661u0.m45747n(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.k2 r0 = r0.mo7462d()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r0
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.mo43940c(r4, r13)
            if (r0 != r6) goto L_0x0051
            return r6
        L_0x0051:
            r3 = r4
        L_0x0052:
            androidx.compose.ui.unit.w r0 = (androidx.compose.p004ui.unit.C16509w) r0
            long r7 = r0.mo47914v()
            long r7 = androidx.compose.p004ui.unit.C16509w.m74754p(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.mo7460b(r7, r13)
            if (r0 != r6) goto L_0x006b
            return r6
        L_0x006b:
            r11 = r3
            r2 = r7
            r7 = r11
        L_0x006e:
            androidx.compose.ui.unit.w r0 = (androidx.compose.p004ui.unit.C16509w) r0
            long r9 = r0.mo47914v()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.k2 r0 = r0.mo7462d()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r0
            long r2 = androidx.compose.p004ui.unit.C16509w.m74754p(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.mo43938a(r1, r3, r5)
            if (r0 != r6) goto L_0x0094
            return r6
        L_0x0094:
            r2 = r7
        L_0x0095:
            androidx.compose.ui.unit.w r0 = (androidx.compose.p004ui.unit.C16509w) r0
            long r0 = r0.mo47914v()
            long r0 = androidx.compose.p004ui.unit.C16509w.m74754p(r9, r0)
            long r0 = androidx.compose.p004ui.unit.C16509w.m74754p(r2, r0)
            androidx.compose.ui.unit.w r0 = androidx.compose.p004ui.unit.C16509w.m74740b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
