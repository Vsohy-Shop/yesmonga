package androidx.compose.p004ui.input.nestedscroll;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher */
public final class NestedScrollDispatcher {

    /* renamed from: d */
    public static final int f38426d = 8;
    @C12579k

    /* renamed from: a */
    public C11289a<? extends C12074o0> f38427a = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    @C12580l

    /* renamed from: b */
    public C12074o0 f38428b;
    @C12580l

    /* renamed from: c */
    public C15446a f38429c;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo43938a(long r8, long r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            kotlin.C11661u0.m45747n(r12)
            androidx.compose.ui.input.nestedscroll.a r1 = r7.f38429c
            if (r1 == 0) goto L_0x004b
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo7455a(r2, r4, r6)
            if (r12 != r0) goto L_0x0044
            return r0
        L_0x0044:
            androidx.compose.ui.unit.w r12 = (androidx.compose.p004ui.unit.C16509w) r12
            long r8 = r12.mo47914v()
            goto L_0x0051
        L_0x004b:
            androidx.compose.ui.unit.w$a r8 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r8 = r8.mo47915a()
        L_0x0051:
            androidx.compose.ui.unit.w r8 = androidx.compose.p004ui.unit.C16509w.m74740b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher.mo43938a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public final long mo43939b(long j, long j2, int i) {
        C15446a aVar = this.f38429c;
        return aVar != null ? aVar.mo7456g(j, j2, i) : C15094f.f37256b.mo42248e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo43940c(long r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            androidx.compose.ui.input.nestedscroll.a r7 = r4.f38429c
            if (r7 == 0) goto L_0x0048
            r0.label = r3
            java.lang.Object r7 = r7.mo7922o(r5, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            androidx.compose.ui.unit.w r7 = (androidx.compose.p004ui.unit.C16509w) r7
            long r5 = r7.mo47914v()
            goto L_0x004e
        L_0x0048:
            androidx.compose.ui.unit.w$a r5 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r5 = r5.mo47915a()
        L_0x004e:
            androidx.compose.ui.unit.w r5 = androidx.compose.p004ui.unit.C16509w.m74740b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher.mo43940c(long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final long mo43941d(long j, int i) {
        C15446a aVar = this.f38429c;
        return aVar != null ? aVar.mo7457m(j, i) : C15094f.f37256b.mo42248e();
    }

    @C12579k
    /* renamed from: e */
    public final C11289a<C12074o0> mo43942e() {
        return this.f38427a;
    }

    @C12579k
    /* renamed from: f */
    public final C12074o0 mo43943f() {
        C12074o0 o0Var = (C12074o0) this.f38427a.invoke();
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @C12580l
    /* renamed from: g */
    public final C12074o0 mo43944g() {
        return this.f38428b;
    }

    @C12580l
    /* renamed from: h */
    public final C15446a mo43945h() {
        return this.f38429c;
    }

    /* renamed from: i */
    public final void mo43946i(@C12579k C11289a<? extends C12074o0> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f38427a = aVar;
    }

    /* renamed from: j */
    public final void mo43947j(@C12580l C12074o0 o0Var) {
        this.f38428b = o0Var;
    }

    /* renamed from: k */
    public final void mo43948k(@C12580l C15446a aVar) {
        this.f38429c = aVar;
    }
}
