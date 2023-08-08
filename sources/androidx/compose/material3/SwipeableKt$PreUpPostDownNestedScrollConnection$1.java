package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;

public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements C15446a {

    /* renamed from: a */
    public final /* synthetic */ SwipeableState<T> f19754a;

    public SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState) {
        this.f19754a = swipeableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7455a(long r5, long r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L_0x0013
            r5 = r9
            androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0013
            int r6 = r6 - r0
            r5.label = r6
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r6 = r5.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r7 = r5.J$0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.C11661u0.m45747n(r6)
            androidx.compose.material3.SwipeableState<T> r6 = r4.f19754a
            float r0 = androidx.compose.p004ui.unit.C16509w.m74750l(r7)
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r7)
            long r2 = androidx.compose.p004ui.geometry.C15096g.m64898a(r0, r2)
            float r0 = r4.mo12022c(r2)
            r5.J$0 = r7
            r5.label = r1
            java.lang.Object r5 = r6.mo12040G(r0, r5)
            if (r5 != r9) goto L_0x0053
            return r9
        L_0x0053:
            androidx.compose.ui.unit.w r5 = androidx.compose.p004ui.unit.C16509w.m74740b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo7455a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public final float mo12022c(long j) {
        return C15094f.m64882r(j);
    }

    /* renamed from: d */
    public final long mo12023d(float f) {
        return C15096g.m64898a(0.0f, f);
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
            return mo12023d(this.f19754a.mo12039F(mo12022c(j2)));
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        float c = mo12022c(j);
        if (c >= 0.0f || !C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
            return C15094f.f37256b.mo42248e();
        }
        return mo12023d(this.f19754a.mo12039F(c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7922o(long r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r7 = r0.J$0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0078
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.C11661u0.m45747n(r9)
            float r9 = androidx.compose.p004ui.unit.C16509w.m74750l(r7)
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r7)
            long r4 = androidx.compose.p004ui.geometry.C15096g.m64898a(r9, r2)
            float r9 = r6.mo12022c(r4)
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            androidx.compose.material3.SwipeableState<T> r2 = r6.f19754a
            androidx.compose.runtime.k2 r2 = r2.mo12063v()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.material3.SwipeableState<T> r4 = r6.f19754a
            float r4 = r4.mo12062u()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0072
            androidx.compose.material3.SwipeableState<T> r2 = r6.f19754a
            r0.J$0 = r7
            r0.label = r3
            java.lang.Object r9 = r2.mo12040G(r9, r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0072:
            androidx.compose.ui.unit.w$a r7 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r7 = r7.mo47915a()
        L_0x0078:
            androidx.compose.ui.unit.w r7 = androidx.compose.p004ui.unit.C16509w.m74740b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1.mo7922o(long, kotlin.coroutines.c):java.lang.Object");
    }
}
