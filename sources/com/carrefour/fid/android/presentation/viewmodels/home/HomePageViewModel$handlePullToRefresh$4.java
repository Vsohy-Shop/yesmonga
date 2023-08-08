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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePullToRefresh$4", mo22502f = "HomePageViewModel.kt", mo22503i = {}, mo22504l = {594, 595, 596, 597}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomePageViewModel$handlePullToRefresh$4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$handlePullToRefresh$4(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$handlePullToRefresh$4> cVar) {
        super(2, cVar);
        this.this$0 = homePageViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomePageViewModel$handlePullToRefresh$4(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r5) goto L_0x0028
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005b
        L_0x0018:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0020:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0050
        L_0x0024:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0045
        L_0x0028:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x003a
        L_0x002c:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r6.this$0
            r6.label = r5
            java.lang.Object r7 = r7.mo76754Y0(r6)
            if (r7 != r0) goto L_0x003a
            return r0
        L_0x003a:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r6.this$0
            r6.label = r4
            java.lang.Object r7 = r7.mo76789r1(r6)
            if (r7 != r0) goto L_0x0045
            return r0
        L_0x0045:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r6.this$0
            r6.label = r3
            java.lang.Object r7 = r7.mo76774i1(r6)
            if (r7 != r0) goto L_0x0050
            return r0
        L_0x0050:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = r7.mo76787p1(r6)
            if (r7 != r0) goto L_0x005b
            return r0
        L_0x005b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$handlePullToRefresh$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomePageViewModel$handlePullToRefresh$4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
