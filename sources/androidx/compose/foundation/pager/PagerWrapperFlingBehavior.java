package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PagerWrapperFlingBehavior implements C2195g {
    @C12579k

    /* renamed from: a */
    public final SnapFlingBehavior f7018a;
    @C12579k

    /* renamed from: b */
    public final PagerState f7019b;

    public PagerWrapperFlingBehavior(@C12579k SnapFlingBehavior snapFlingBehavior, @C12579k PagerState pagerState) {
        Intrinsics.checkNotNullParameter(snapFlingBehavior, "originalFlingBehavior");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.f7018a = snapFlingBehavior;
        this.f7019b = pagerState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7354a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2201l r5, float r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7 = r4.f7018a
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r7 = r7.mo7557k(r5, r6, r2, r0)
            if (r7 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.mo7354a(androidx.compose.foundation.gestures.l, float, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: b */
    public final SnapFlingBehavior mo9105b() {
        return this.f7018a;
    }

    @C12579k
    /* renamed from: c */
    public final PagerState mo9106c() {
        return this.f7019b;
    }
}
