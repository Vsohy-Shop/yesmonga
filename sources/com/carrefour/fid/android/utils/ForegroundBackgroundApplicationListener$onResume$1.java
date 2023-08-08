package com.carrefour.fid.android.utils;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$onResume$1", mo22502f = "ForegroundBackgroundApplicationListener.kt", mo22503i = {}, mo22504l = {38, 39, 40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ForegroundBackgroundApplicationListener$onResume$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ForegroundBackgroundApplicationListener this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForegroundBackgroundApplicationListener$onResume$1(ForegroundBackgroundApplicationListener foregroundBackgroundApplicationListener, C11045c<? super ForegroundBackgroundApplicationListener$onResume$1> cVar) {
        super(2, cVar);
        this.this$0 = foregroundBackgroundApplicationListener;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ForegroundBackgroundApplicationListener$onResume$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x0021
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0049
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001d:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x003e
        L_0x0021:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0033
        L_0x0025:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r6 = r5.this$0
            r5.label = r4
            java.lang.Object r6 = r6.mo67059h(r5)
            if (r6 != r0) goto L_0x0033
            return r0
        L_0x0033:
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r6 = r5.this$0
            r5.label = r3
            java.lang.Object r6 = r6.mo67062l(r5)
            if (r6 != r0) goto L_0x003e
            return r0
        L_0x003e:
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r6 = r5.this$0
            r5.label = r2
            java.lang.Object r6 = r6.mo67058e(r5)
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$onResume$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ForegroundBackgroundApplicationListener$onResume$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
