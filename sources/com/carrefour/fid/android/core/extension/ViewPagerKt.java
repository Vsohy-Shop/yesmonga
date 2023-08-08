package com.carrefour.fid.android.core.extension;

import androidx.annotation.C0349j;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C31624d;
import com.google.android.material.tabs.TabLayout;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ViewPagerKt {

    /* renamed from: com.carrefour.fid.android.core.extension.ViewPagerKt$a */
    public static final class C36300a extends ViewPager2.C20817j {

        /* renamed from: a */
        public final /* synthetic */ C12074o0 f89635a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Integer, C11079d2> f89636b;

        public C36300a(C12074o0 o0Var, C11300l<? super Integer, C11079d2> lVar) {
            this.f89635a = o0Var;
            this.f89636b = lVar;
        }

        /* renamed from: a */
        public void mo30665a(int i) {
            if (C12079p0.m48270k(this.f89635a)) {
                this.f89636b.invoke(Integer.valueOf(i));
            }
        }

        /* renamed from: b */
        public void mo30666b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo30667c(int i) {
        }
    }

    /* renamed from: c */
    public static final void m148931c(@C12579k ViewPager2 viewPager2, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope, long j) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleScope");
        lifecycleCoroutineScope.mo57477c(new ViewPagerKt$autoScroll$1(viewPager2, j, (C11045c<? super ViewPagerKt$autoScroll$1>) null));
    }

    @C0349j
    /* renamed from: d */
    public static final C36300a m148932d(C12074o0 o0Var, C11300l<? super Integer, C11079d2> lVar) {
        return new C36300a(o0Var, lVar);
    }

    @C0349j
    @C12579k
    /* renamed from: e */
    public static final C11907e<Integer> m148933e(@C12579k ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        return C11909g.m47500w(new ViewPagerKt$pageScrollStateChanges$1(viewPager2, (C11045c<? super ViewPagerKt$pageScrollStateChanges$1>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m148934f(@org.jetbrains.annotations.C12579k androidx.viewpager2.widget.ViewPager2 r6, long r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            boolean r0 = r9 instanceof com.carrefour.fid.android.core.extension.ViewPagerKt$scrollIndefinitely$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.core.extension.ViewPagerKt$scrollIndefinitely$1 r0 = (com.carrefour.fid.android.core.extension.ViewPagerKt$scrollIndefinitely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.core.extension.ViewPagerKt$scrollIndefinitely$1 r0 = new com.carrefour.fid.android.core.extension.ViewPagerKt$scrollIndefinitely$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0085
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            long r7 = r0.J$0
            java.lang.Object r6 = r0.L$0
            androidx.viewpager2.widget.ViewPager2 r6 = (androidx.viewpager2.widget.ViewPager2) r6
            kotlin.C11661u0.m45747n(r9)
            goto L_0x004e
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            r0.L$0 = r6
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m45925b(r7, r0)
            if (r9 != r1) goto L_0x004e
            return r1
        L_0x004e:
            boolean r9 = r6.isFocusableInTouchMode()
            r2 = 0
            if (r9 != 0) goto L_0x0076
            androidx.recyclerview.widget.RecyclerView$Adapter r9 = r6.getAdapter()
            if (r9 == 0) goto L_0x0060
            int r9 = r9.getItemCount()
            goto L_0x0061
        L_0x0060:
            r9 = r2
        L_0x0061:
            if (r9 <= 0) goto L_0x0065
            int r9 = r9 - r4
            goto L_0x0066
        L_0x0065:
            r9 = r2
        L_0x0066:
            int r5 = r6.getCurrentItem()
            if (r5 != r9) goto L_0x006e
            r9 = r2
            goto L_0x0073
        L_0x006e:
            int r9 = r6.getCurrentItem()
            int r9 = r9 + r4
        L_0x0073:
            r6.setCurrentItem(r9, r4)
        L_0x0076:
            r6.setFocusableInTouchMode(r2)
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r6 = m148934f(r6, r7, r0)
            if (r6 != r1) goto L_0x0085
            return r1
        L_0x0085:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.extension.ViewPagerKt.m148934f(androidx.viewpager2.widget.ViewPager2, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public static final void m148935g(@C12579k TabLayout tabLayout, @C12580l ViewPager2 viewPager2, int i) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(tabLayout, "<this>");
        boolean z = false;
        if (!(viewPager2 == null || (adapter = viewPager2.getAdapter()) == null || i != adapter.getItemCount())) {
            z = true;
        }
        if (z) {
            new C31624d(tabLayout, viewPager2, new C36313k()).mo91446a();
            return;
        }
        throw new Exception("The size of list and the tab count should be equal!");
    }

    /* renamed from: h */
    public static final void m148936h(TabLayout.C31615i iVar, int i) {
        Intrinsics.checkNotNullParameter(iVar, "<anonymous parameter 0>");
    }
}
