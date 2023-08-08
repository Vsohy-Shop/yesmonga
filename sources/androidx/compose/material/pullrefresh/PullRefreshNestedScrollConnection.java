package androidx.compose.material.pullrefresh;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PullRefreshNestedScrollConnection implements C15446a {
    @C12579k

    /* renamed from: a */
    public final C11300l<Float, Float> f18927a;
    @C12579k

    /* renamed from: b */
    public final C11304p<Float, C11045c<? super Float>, Object> f18928b;

    /* renamed from: c */
    public final boolean f18929c;

    public PullRefreshNestedScrollConnection(@C12579k C11300l<? super Float, Float> lVar, @C12579k C11304p<? super Float, ? super C11045c<? super Float>, ? extends Object> pVar, boolean z) {
        Intrinsics.checkNotNullParameter(lVar, "onPull");
        Intrinsics.checkNotNullParameter(pVar, "onRelease");
        this.f18927a = lVar;
        this.f18928b = pVar;
        this.f18929c = z;
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (!this.f18929c) {
            return C15094f.f37256b.mo42248e();
        }
        if (!C15448b.m68343g(i, C15448b.f38435b.mo43964a()) || C15094f.m64882r(j2) <= 0.0f) {
            return C15094f.f37256b.mo42248e();
        }
        return C15096g.m64898a(0.0f, this.f18927a.invoke(Float.valueOf(C15094f.m64882r(j2))).floatValue());
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        if (!this.f18929c) {
            return C15094f.f37256b.mo42248e();
        }
        if (!C15448b.m68343g(i, C15448b.f38435b.mo43964a()) || C15094f.m64882r(j) >= 0.0f) {
            return C15094f.f37256b.mo42248e();
        }
        return C15096g.m64898a(0.0f, this.f18927a.invoke(Float.valueOf(C15094f.m64882r(j))).floatValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7922o(long r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.F$0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.C11661u0.m45747n(r7)
            kotlin.jvm.functions.p<java.lang.Float, kotlin.coroutines.c<? super java.lang.Float>, java.lang.Object> r7 = r4.f18928b
            float r5 = androidx.compose.p004ui.unit.C16509w.m74752n(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r6
        L_0x004d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.p004ui.unit.C16511x.m74763a(r5, r6)
            androidx.compose.ui.unit.w r5 = androidx.compose.p004ui.unit.C16509w.m74740b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo7922o(long, kotlin.coroutines.c):java.lang.Object");
    }
}
