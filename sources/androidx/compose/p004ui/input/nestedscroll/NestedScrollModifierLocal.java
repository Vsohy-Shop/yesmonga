package androidx.compose.p004ui.input.nestedscroll;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNestedScrollModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n76#2:101\n102#2,2:102\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n*L\n45#1:101\n45#1:102,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal */
public final class NestedScrollModifierLocal implements C15627d, C15634j<NestedScrollModifierLocal>, C15446a {
    @C12579k

    /* renamed from: a */
    public final NestedScrollDispatcher f38430a;
    @C12579k

    /* renamed from: b */
    public final C15446a f38431b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f38432c = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    public NestedScrollModifierLocal(@C12579k NestedScrollDispatcher nestedScrollDispatcher, @C12579k C15446a aVar) {
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(aVar, "connection");
        this.f38430a = nestedScrollDispatcher;
        this.f38431b = aVar;
        nestedScrollDispatcher.mo43946i(new C11289a<C12074o0>(this) {
            final /* synthetic */ NestedScrollModifierLocal this$0;

            {
                this.this$0 = r1;
            }

            @C12579k
            /* renamed from: a */
            public final C12074o0 invoke() {
                return this.this$0.mo43954v();
            }
        });
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        mo43957z((NestedScrollModifierLocal) kVar.mo44518a(NestedScrollModifierLocalKt.m68321a()));
        this.f38430a.mo43948k(mo43955x());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7455a(long r16, long r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r4) goto L_0x0039
            if (r3 != r10) goto L_0x0031
            long r2 = r2.J$0
            kotlin.C11661u0.m45747n(r1)
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r7 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r7 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal) r7
            kotlin.C11661u0.m45747n(r1)
            r13 = r3
            r11 = r5
            goto L_0x0065
        L_0x0047:
            kotlin.C11661u0.m45747n(r1)
            androidx.compose.ui.input.nestedscroll.a r3 = r0.f38431b
            r2.L$0 = r0
            r11 = r16
            r2.J$0 = r11
            r13 = r18
            r2.J$1 = r13
            r2.label = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo7455a(r4, r6, r8)
            if (r1 != r9) goto L_0x0064
            return r9
        L_0x0064:
            r7 = r0
        L_0x0065:
            androidx.compose.ui.unit.w r1 = (androidx.compose.p004ui.unit.C16509w) r1
            long r4 = r1.mo47914v()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = r7.mo43955x()
            if (r3 == 0) goto L_0x0094
            long r6 = androidx.compose.p004ui.unit.C16509w.m74755q(r11, r4)
            long r11 = androidx.compose.p004ui.unit.C16509w.m74754p(r13, r4)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r4
            r2.label = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo7455a(r4, r6, r8)
            if (r1 != r9) goto L_0x008b
            return r9
        L_0x008b:
            r2 = r13
        L_0x008c:
            androidx.compose.ui.unit.w r1 = (androidx.compose.p004ui.unit.C16509w) r1
            long r4 = r1.mo47914v()
            r13 = r2
            goto L_0x009b
        L_0x0094:
            r13 = r4
            androidx.compose.ui.unit.w$a r1 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r4 = r1.mo47915a()
        L_0x009b:
            long r1 = androidx.compose.p004ui.unit.C16509w.m74755q(r13, r4)
            androidx.compose.ui.unit.w r1 = androidx.compose.p004ui.unit.C16509w.m74740b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal.mo7455a(long, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        long j3;
        long g = this.f38431b.mo7456g(j, j2, i);
        NestedScrollModifierLocal x = mo43955x();
        if (x != null) {
            j3 = x.mo7456g(C15094f.m64886v(j, g), C15094f.m64885u(j2, g), i);
        } else {
            j3 = C15094f.f37256b.mo42248e();
        }
        return C15094f.m64886v(g, j3);
    }

    @C12579k
    public C15638m<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.m68321a();
    }

    /* renamed from: m */
    public long mo7457m(long j, int i) {
        long j2;
        NestedScrollModifierLocal x = mo43955x();
        if (x != null) {
            j2 = x.mo7457m(j, i);
        } else {
            j2 = C15094f.f37256b.mo42248e();
        }
        return C15094f.m64886v(j2, this.f38431b.mo7457m(C15094f.m64885u(j, j2), i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7922o(long r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            long r9 = r0.J$0
            kotlin.C11661u0.m45747n(r11)
            goto L_0x007c
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r2 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal) r2
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0057
        L_0x0040:
            kotlin.C11661u0.m45747n(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r11 = r8.mo43955x()
            if (r11 == 0) goto L_0x005e
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo7922o(r9, r0)
            if (r11 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r8
        L_0x0057:
            androidx.compose.ui.unit.w r11 = (androidx.compose.p004ui.unit.C16509w) r11
            long r4 = r11.mo47914v()
            goto L_0x0065
        L_0x005e:
            androidx.compose.ui.unit.w$a r11 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r4 = r11.mo47915a()
            r2 = r8
        L_0x0065:
            r6 = r9
            r9 = r4
            r4 = r6
            androidx.compose.ui.input.nestedscroll.a r11 = r2.f38431b
            long r4 = androidx.compose.p004ui.unit.C16509w.m74754p(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo7922o(r4, r0)
            if (r11 != r1) goto L_0x007c
            return r1
        L_0x007c:
            androidx.compose.ui.unit.w r11 = (androidx.compose.p004ui.unit.C16509w) r11
            long r0 = r11.mo47914v()
            long r9 = androidx.compose.p004ui.unit.C16509w.m74755q(r9, r0)
            androidx.compose.ui.unit.w r9 = androidx.compose.p004ui.unit.C16509w.m74740b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal.mo7922o(long, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: t */
    public final C15446a mo43952t() {
        return this.f38431b;
    }

    @C12579k
    /* renamed from: u */
    public final NestedScrollDispatcher mo43953u() {
        return this.f38430a;
    }

    /* renamed from: v */
    public final C12074o0 mo43954v() {
        C12074o0 o0Var;
        NestedScrollModifierLocal x = mo43955x();
        if ((x != null && (o0Var = x.mo43954v()) != null) || (o0Var = this.f38430a.mo43944g()) != null) {
            return o0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* renamed from: x */
    public final NestedScrollModifierLocal mo43955x() {
        return (NestedScrollModifierLocal) this.f38432c.getValue();
    }

    @C12579k
    /* renamed from: y */
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    /* renamed from: z */
    public final void mo43957z(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.f38432c.setValue(nestedScrollModifierLocal);
    }
}
