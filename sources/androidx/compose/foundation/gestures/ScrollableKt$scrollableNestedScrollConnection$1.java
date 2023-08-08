package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.runtime.C8578k2;

public final class ScrollableKt$scrollableNestedScrollConnection$1 implements C15446a {

    /* renamed from: a */
    public final /* synthetic */ C8578k2<ScrollingLogic> f5901a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5902b;

    public ScrollableKt$scrollableNestedScrollConnection$1(C8578k2<ScrollingLogic> k2Var, boolean z) {
        this.f5901a = k2Var;
        this.f5902b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7455a(long r3, long r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.label = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r1) goto L_0x002f
            long r5 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1) r3
            kotlin.C11661u0.m45747n(r4)
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0037:
            kotlin.C11661u0.m45747n(r4)
            boolean r4 = r2.f5902b
            if (r4 == 0) goto L_0x005f
            androidx.compose.runtime.k2<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.f5901a
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.mo7460b(r5, r3)
            if (r4 != r7) goto L_0x0053
            return r7
        L_0x0053:
            r3 = r2
        L_0x0054:
            androidx.compose.ui.unit.w r4 = (androidx.compose.p004ui.unit.C16509w) r4
            long r0 = r4.mo47914v()
            long r4 = androidx.compose.p004ui.unit.C16509w.m74754p(r5, r0)
            goto L_0x0066
        L_0x005f:
            androidx.compose.ui.unit.w$a r3 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r4 = r3.mo47915a()
            r3 = r2
        L_0x0066:
            androidx.compose.ui.unit.w r4 = androidx.compose.p004ui.unit.C16509w.m74740b(r4)
            androidx.compose.runtime.k2<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.f5901a
            r4.mo47914v()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            r5 = 0
            r3.mo7470l(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.mo7455a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (this.f5902b) {
            return this.f5901a.getValue().mo7469k(j2);
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43965b())) {
            this.f5901a.getValue().mo7470l(true);
        }
        return C15094f.f37256b.mo42248e();
    }
}
