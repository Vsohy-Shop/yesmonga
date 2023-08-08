package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", mo22502f = "TapGestureDetector.kt", mo22503i = {0, 0}, mo22504l = {212}, mo22505m = "invokeSuspend", mo22506n = {"$this$withTimeoutOrNull", "minUptime"}, mo22507s = {"L$0", "J$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/w;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C15507w>, Object> {
    final /* synthetic */ C15507w $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C15507w wVar, C11045c<? super TapGestureDetectorKt$awaitSecondDown$2> cVar) {
        super(2, cVar);
        this.$firstUp = wVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, cVar);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C15507w> cVar2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            long r3 = r12.J$0
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r13)
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L_0x0052
        L_0x0019:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0021:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p004ui.input.pointer.C15465c) r13
            androidx.compose.ui.input.pointer.w r1 = r12.$firstUp
            long r3 = r1.mo44186z()
            androidx.compose.ui.platform.c4 r1 = r13.getViewConfiguration()
            long r5 = r1.mo44719b()
            long r3 = r3 + r5
            r1 = r13
            r9 = r3
            r13 = r12
        L_0x003a:
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            r13.L$0 = r1
            r13.J$0 = r9
            r13.label = r2
            r3 = r1
            r6 = r13
            java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r3, r4, r5, r6, r7, r8)
            if (r3 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r11 = r0
            r0 = r13
            r13 = r3
            r3 = r1
            r1 = r11
        L_0x0052:
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            long r4 = r13.mo44186z()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x005d
            return r13
        L_0x005d:
            r13 = r0
            r0 = r1
            r1 = r3
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
