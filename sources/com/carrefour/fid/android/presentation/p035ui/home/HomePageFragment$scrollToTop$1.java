package com.carrefour.fid.android.presentation.p035ui.home;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.home.HomePageFragment$scrollToTop$1", mo22502f = "HomePageFragment.kt", mo22503i = {}, mo22504l = {762, 764, 766}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$scrollToTop$1 */
public final class HomePageFragment$scrollToTop$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$scrollToTop$1(HomePageFragment homePageFragment, C11045c<? super HomePageFragment$scrollToTop$1> cVar) {
        super(2, cVar);
        this.this$0 = homePageFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomePageFragment$scrollToTop$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 10
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r6) goto L_0x0023
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0069
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001f:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0048
        L_0x0023:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0033
        L_0x0027:
            kotlin.C11661u0.m45747n(r8)
            r7.label = r6
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m45925b(r2, r7)
            if (r8 != r0) goto L_0x0033
            return r0
        L_0x0033:
            com.carrefour.fid.android.presentation.ui.home.HomePageFragment r8 = r7.this$0
            com.carrefour.fid.android.databinding.f6 r8 = r8.mo70413q1()
            androidx.core.widget.NestedScrollView r8 = r8.f90839r
            r1 = 0
            r8.mo53233Y(r1, r1)
            r7.label = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m45925b(r2, r7)
            if (r8 != r0) goto L_0x0048
            return r0
        L_0x0048:
            com.carrefour.fid.android.presentation.ui.home.HomePageFragment r8 = r7.this$0
            com.carrefour.fid.android.databinding.g2 r8 = com.carrefour.fid.android.presentation.p035ui.home.HomePageFragment.m106126U0(r8)
            com.google.android.material.appbar.AppBarLayout r8 = r8.f90877b
            r8.setExpanded(r6, r6)
            com.carrefour.fid.android.presentation.ui.home.HomePageFragment r8 = r7.this$0
            com.carrefour.fid.android.databinding.f6 r8 = r8.mo70413q1()
            androidx.core.widget.NestedScrollView r8 = r8.f90839r
            java.lang.String r1 = "bindingHomeContent.nestedScrollView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            r7.label = r4
            java.lang.Object r8 = com.carrefour.fid.android.shared.extension.NestedScrollViewKt.m118857b(r8, r7)
            if (r8 != r0) goto L_0x0069
            return r0
        L_0x0069:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.HomePageFragment$scrollToTop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomePageFragment$scrollToTop$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
