package com.carrefour.fid.android.presentation.viewmodels.home;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$8", mo22502f = "HomePageViewModel.kt", mo22503i = {}, mo22504l = {638, 639, 641, 642, 643, 644, 645, 646}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomePageViewModel$synchronize$8 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$synchronize$8(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$synchronize$8> cVar) {
        super(2, cVar);
        this.this$0 = homePageViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomePageViewModel$synchronize$8(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r3 = r2.this$0;
        r2.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r3.mo76788q1(r2) != r0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r2.this$0.mo76791t1();
        r3 = r2.this$0;
        r2.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r3.mo76757Z1(r2) != r0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r3 = r2.this$0;
        r2.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r3.mo76787p1(r2) != r0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        r3 = r2.this$0;
        r2.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r3.mo76786o1(r2) != r0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r3 = r2.this$0;
        r2.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r3.mo76760b1(r2) != r0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r3 = r2.this$0;
        r2.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r3.mo76790s1(r2) != r0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        r3 = r2.this$0;
        r2.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r3.mo76762c1(r2) != r0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        return kotlin.C11079d2.f28267a;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r2.label
            switch(r1) {
                case 0: goto L_0x0033;
                case 1: goto L_0x002f;
                case 2: goto L_0x002b;
                case 3: goto L_0x0027;
                case 4: goto L_0x0023;
                case 5: goto L_0x001f;
                case 6: goto L_0x001b;
                case 7: goto L_0x0016;
                case 8: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        L_0x0011:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x009c
        L_0x0016:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x008f
        L_0x001b:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0083
        L_0x001f:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0077
        L_0x0023:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x006b
        L_0x0027:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x005f
        L_0x002b:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x004e
        L_0x002f:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0042
        L_0x0033:
            kotlin.C11661u0.m45747n(r3)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 1
            r2.label = r1
            java.lang.Object r3 = r3.mo76764d1(r2)
            if (r3 != r0) goto L_0x0042
            return r0
        L_0x0042:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 2
            r2.label = r1
            java.lang.Object r3 = r3.mo76788q1(r2)
            if (r3 != r0) goto L_0x004e
            return r0
        L_0x004e:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r3.mo76791t1()
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 3
            r2.label = r1
            java.lang.Object r3 = r3.mo76757Z1(r2)
            if (r3 != r0) goto L_0x005f
            return r0
        L_0x005f:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 4
            r2.label = r1
            java.lang.Object r3 = r3.mo76787p1(r2)
            if (r3 != r0) goto L_0x006b
            return r0
        L_0x006b:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 5
            r2.label = r1
            java.lang.Object r3 = r3.mo76786o1(r2)
            if (r3 != r0) goto L_0x0077
            return r0
        L_0x0077:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 6
            r2.label = r1
            java.lang.Object r3 = r3.mo76760b1(r2)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 7
            r2.label = r1
            java.lang.Object r3 = r3.mo76790s1(r2)
            if (r3 != r0) goto L_0x008f
            return r0
        L_0x008f:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r3 = r2.this$0
            r1 = 8
            r2.label = r1
            java.lang.Object r3 = r3.mo76762c1(r2)
            if (r3 != r0) goto L_0x009c
            return r0
        L_0x009c:
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$synchronize$8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomePageViewModel$synchronize$8) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
