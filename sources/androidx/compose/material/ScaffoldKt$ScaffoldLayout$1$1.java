package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbar;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, int i2, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i;
        this.$isFabDocked = z;
        this.$bottomBar = pVar4;
        this.$$dirty = i2;
        this.$content = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo10368a(@C12579k C15562f1 f1Var, long j) {
        Intrinsics.checkNotNullParameter(f1Var, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        final long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        final C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
        final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$snackbar;
        final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$fab;
        final int i = this.$fabPosition;
        final boolean z = this.$isFabDocked;
        final C11304p<C8592o, Integer, C11079d2> pVar4 = this.$bottomBar;
        final int i2 = this.$$dirty;
        final C15562f1 f1Var2 = f1Var;
        final int i3 = p;
        final int i4 = o;
        final C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$content;
        return C15568h0.m69206r2(f1Var, p, o, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* JADX WARNING: Removed duplicated region for block: B:101:0x0235  */
            /* JADX WARNING: Removed duplicated region for block: B:109:0x0269  */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x026d  */
            /* JADX WARNING: Removed duplicated region for block: B:115:0x0279  */
            /* JADX WARNING: Removed duplicated region for block: B:118:0x02a8 A[LOOP:9: B:117:0x02a6->B:118:0x02a8, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:121:0x02db A[LOOP:10: B:120:0x02d9->B:121:0x02db, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:124:0x030b A[LOOP:11: B:123:0x0309->B:124:0x030b, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:127:0x0328 A[LOOP:12: B:126:0x0326->B:127:0x0328, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0346 A[LOOP:13: B:129:0x0344->B:130:0x0346, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x0364  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x01e6 A[LOOP:7: B:83:0x01e4->B:84:0x01e6, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x01ff  */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x0201  */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x022c  */
            /* JADX WARNING: Removed duplicated region for block: B:99:0x0232  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo10369a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15611w0.C15612a r30) {
                /*
                    r29 = this;
                    r0 = r29
                    java.lang.String r1 = "$this$layout"
                    r9 = r30
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                    androidx.compose.ui.layout.f1 r1 = r3
                    androidx.compose.material.ScaffoldLayoutContent r2 = androidx.compose.material.ScaffoldLayoutContent.TopBar
                    kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r3 = r4
                    java.util.List r1 = r1.mo44296k0(r2, r3)
                    long r2 = r11
                    java.util.ArrayList r10 = new java.util.ArrayList
                    int r4 = r1.size()
                    r10.<init>(r4)
                    int r4 = r1.size()
                    r11 = 0
                    r5 = r11
                L_0x0024:
                    if (r5 >= r4) goto L_0x0036
                    java.lang.Object r6 = r1.get(r5)
                    androidx.compose.ui.layout.e0 r6 = (androidx.compose.p004ui.layout.C15557e0) r6
                    androidx.compose.ui.layout.w0 r6 = r6.mo44324t0(r2)
                    r10.add(r6)
                    int r5 = r5 + 1
                    goto L_0x0024
                L_0x0036:
                    boolean r1 = r10.isEmpty()
                    r3 = 1
                    if (r1 == 0) goto L_0x003f
                    r1 = 0
                    goto L_0x0065
                L_0x003f:
                    java.lang.Object r1 = r10.get(r11)
                    r4 = r1
                    androidx.compose.ui.layout.w0 r4 = (androidx.compose.p004ui.layout.C15611w0) r4
                    int r4 = r4.mo44468G0()
                    int r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r10)
                    if (r3 > r5) goto L_0x0065
                    r6 = r3
                L_0x0051:
                    java.lang.Object r7 = r10.get(r6)
                    r8 = r7
                    androidx.compose.ui.layout.w0 r8 = (androidx.compose.p004ui.layout.C15611w0) r8
                    int r8 = r8.mo44468G0()
                    if (r4 >= r8) goto L_0x0060
                    r1 = r7
                    r4 = r8
                L_0x0060:
                    if (r6 == r5) goto L_0x0065
                    int r6 = r6 + 1
                    goto L_0x0051
                L_0x0065:
                    androidx.compose.ui.layout.w0 r1 = (androidx.compose.p004ui.layout.C15611w0) r1
                    if (r1 == 0) goto L_0x006e
                    int r1 = r1.mo44468G0()
                    goto L_0x006f
                L_0x006e:
                    r1 = r11
                L_0x006f:
                    androidx.compose.ui.layout.f1 r4 = r3
                    androidx.compose.material.ScaffoldLayoutContent r5 = androidx.compose.material.ScaffoldLayoutContent.Snackbar
                    kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r6 = r5
                    java.util.List r4 = r4.mo44296k0(r5, r6)
                    long r5 = r11
                    java.util.ArrayList r12 = new java.util.ArrayList
                    int r7 = r4.size()
                    r12.<init>(r7)
                    int r7 = r4.size()
                    r8 = r11
                L_0x0089:
                    if (r8 >= r7) goto L_0x009b
                    java.lang.Object r13 = r4.get(r8)
                    androidx.compose.ui.layout.e0 r13 = (androidx.compose.p004ui.layout.C15557e0) r13
                    androidx.compose.ui.layout.w0 r13 = r13.mo44324t0(r5)
                    r12.add(r13)
                    int r8 = r8 + 1
                    goto L_0x0089
                L_0x009b:
                    boolean r4 = r12.isEmpty()
                    if (r4 == 0) goto L_0x00a3
                    r4 = 0
                    goto L_0x00c9
                L_0x00a3:
                    java.lang.Object r4 = r12.get(r11)
                    r5 = r4
                    androidx.compose.ui.layout.w0 r5 = (androidx.compose.p004ui.layout.C15611w0) r5
                    int r5 = r5.mo44468G0()
                    int r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r12)
                    if (r3 > r6) goto L_0x00c9
                    r7 = r3
                L_0x00b5:
                    java.lang.Object r8 = r12.get(r7)
                    r13 = r8
                    androidx.compose.ui.layout.w0 r13 = (androidx.compose.p004ui.layout.C15611w0) r13
                    int r13 = r13.mo44468G0()
                    if (r5 >= r13) goto L_0x00c4
                    r4 = r8
                    r5 = r13
                L_0x00c4:
                    if (r7 == r6) goto L_0x00c9
                    int r7 = r7 + 1
                    goto L_0x00b5
                L_0x00c9:
                    androidx.compose.ui.layout.w0 r4 = (androidx.compose.p004ui.layout.C15611w0) r4
                    if (r4 == 0) goto L_0x00d2
                    int r4 = r4.mo44468G0()
                    goto L_0x00d3
                L_0x00d2:
                    r4 = r11
                L_0x00d3:
                    androidx.compose.ui.layout.f1 r5 = r3
                    androidx.compose.material.ScaffoldLayoutContent r6 = androidx.compose.material.ScaffoldLayoutContent.Fab
                    kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r7 = r6
                    java.util.List r5 = r5.mo44296k0(r6, r7)
                    long r6 = r11
                    java.util.ArrayList r13 = new java.util.ArrayList
                    int r8 = r5.size()
                    r13.<init>(r8)
                    int r8 = r5.size()
                    r14 = r11
                L_0x00ed:
                    if (r14 >= r8) goto L_0x00ff
                    java.lang.Object r15 = r5.get(r14)
                    androidx.compose.ui.layout.e0 r15 = (androidx.compose.p004ui.layout.C15557e0) r15
                    androidx.compose.ui.layout.w0 r15 = r15.mo44324t0(r6)
                    r13.add(r15)
                    int r14 = r14 + 1
                    goto L_0x00ed
                L_0x00ff:
                    boolean r5 = r13.isEmpty()
                    r5 = r5 ^ r3
                    if (r5 == 0) goto L_0x01bb
                    boolean r5 = r13.isEmpty()
                    if (r5 == 0) goto L_0x010e
                    r5 = 0
                    goto L_0x0134
                L_0x010e:
                    java.lang.Object r5 = r13.get(r11)
                    r6 = r5
                    androidx.compose.ui.layout.w0 r6 = (androidx.compose.p004ui.layout.C15611w0) r6
                    int r6 = r6.mo44471K0()
                    int r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r13)
                    if (r3 > r7) goto L_0x0134
                    r8 = r3
                L_0x0120:
                    java.lang.Object r14 = r13.get(r8)
                    r15 = r14
                    androidx.compose.ui.layout.w0 r15 = (androidx.compose.p004ui.layout.C15611w0) r15
                    int r15 = r15.mo44471K0()
                    if (r6 >= r15) goto L_0x012f
                    r5 = r14
                    r6 = r15
                L_0x012f:
                    if (r8 == r7) goto L_0x0134
                    int r8 = r8 + 1
                    goto L_0x0120
                L_0x0134:
                    androidx.compose.ui.layout.w0 r5 = (androidx.compose.p004ui.layout.C15611w0) r5
                    if (r5 == 0) goto L_0x013d
                    int r5 = r5.mo44471K0()
                    goto L_0x013e
                L_0x013d:
                    r5 = r11
                L_0x013e:
                    boolean r6 = r13.isEmpty()
                    if (r6 == 0) goto L_0x0146
                    r6 = 0
                    goto L_0x016d
                L_0x0146:
                    java.lang.Object r6 = r13.get(r11)
                    r7 = r6
                    androidx.compose.ui.layout.w0 r7 = (androidx.compose.p004ui.layout.C15611w0) r7
                    int r7 = r7.mo44468G0()
                    int r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r13)
                    if (r3 > r8) goto L_0x016d
                    r14 = r3
                L_0x0158:
                    java.lang.Object r15 = r13.get(r14)
                    r16 = r15
                    androidx.compose.ui.layout.w0 r16 = (androidx.compose.p004ui.layout.C15611w0) r16
                    int r2 = r16.mo44468G0()
                    if (r7 >= r2) goto L_0x0168
                    r7 = r2
                    r6 = r15
                L_0x0168:
                    if (r14 == r8) goto L_0x016d
                    int r14 = r14 + 1
                    goto L_0x0158
                L_0x016d:
                    androidx.compose.ui.layout.w0 r6 = (androidx.compose.p004ui.layout.C15611w0) r6
                    if (r6 == 0) goto L_0x0176
                    int r2 = r6.mo44468G0()
                    goto L_0x0177
                L_0x0176:
                    r2 = r11
                L_0x0177:
                    if (r5 == 0) goto L_0x01bb
                    if (r2 == 0) goto L_0x01bb
                    int r6 = r7
                    androidx.compose.material.i0$a r7 = androidx.compose.material.C3050i0.f8146b
                    int r7 = r7.mo10793b()
                    boolean r6 = androidx.compose.material.C3050i0.m14312f(r6, r7)
                    if (r6 == 0) goto L_0x01ad
                    androidx.compose.ui.layout.f1 r6 = r3
                    androidx.compose.ui.unit.LayoutDirection r6 = r6.getLayoutDirection()
                    androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
                    if (r6 != r7) goto L_0x01a2
                    int r6 = r8
                    androidx.compose.ui.layout.f1 r7 = r3
                    float r8 = androidx.compose.material.ScaffoldKt.f7803b
                    int r7 = r7.mo7429n2(r8)
                    int r6 = r6 - r7
                    int r6 = r6 - r5
                    goto L_0x01b2
                L_0x01a2:
                    androidx.compose.ui.layout.f1 r6 = r3
                    float r7 = androidx.compose.material.ScaffoldKt.f7803b
                    int r6 = r6.mo7429n2(r7)
                    goto L_0x01b2
                L_0x01ad:
                    int r6 = r8
                    int r6 = r6 - r5
                    int r6 = r6 / 2
                L_0x01b2:
                    androidx.compose.material.h0 r7 = new androidx.compose.material.h0
                    boolean r8 = r9
                    r7.<init>(r8, r6, r5, r2)
                    r14 = r7
                    goto L_0x01bc
                L_0x01bb:
                    r14 = 0
                L_0x01bc:
                    androidx.compose.ui.layout.f1 r2 = r3
                    androidx.compose.material.ScaffoldLayoutContent r5 = androidx.compose.material.ScaffoldLayoutContent.BottomBar
                    androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1 r6 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                    kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r7 = r13
                    int r8 = r14
                    r6.<init>(r14, r7, r8)
                    r7 = 1529070963(0x5b23c573, float:4.6097519E16)
                    androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31049c(r7, r3, r6)
                    java.util.List r2 = r2.mo44296k0(r5, r6)
                    long r5 = r11
                    java.util.ArrayList r15 = new java.util.ArrayList
                    int r7 = r2.size()
                    r15.<init>(r7)
                    int r7 = r2.size()
                    r8 = r11
                L_0x01e4:
                    if (r8 >= r7) goto L_0x01f9
                    java.lang.Object r16 = r2.get(r8)
                    r3 = r16
                    androidx.compose.ui.layout.e0 r3 = (androidx.compose.p004ui.layout.C15557e0) r3
                    androidx.compose.ui.layout.w0 r3 = r3.mo44324t0(r5)
                    r15.add(r3)
                    int r8 = r8 + 1
                    r3 = 1
                    goto L_0x01e4
                L_0x01f9:
                    boolean r2 = r15.isEmpty()
                    if (r2 == 0) goto L_0x0201
                    r2 = 0
                    goto L_0x0228
                L_0x0201:
                    java.lang.Object r2 = r15.get(r11)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    int r3 = r3.mo44468G0()
                    int r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r15)
                    r6 = 1
                    if (r6 > r5) goto L_0x0228
                    r6 = 1
                L_0x0214:
                    java.lang.Object r7 = r15.get(r6)
                    r8 = r7
                    androidx.compose.ui.layout.w0 r8 = (androidx.compose.p004ui.layout.C15611w0) r8
                    int r8 = r8.mo44468G0()
                    if (r3 >= r8) goto L_0x0223
                    r2 = r7
                    r3 = r8
                L_0x0223:
                    if (r6 == r5) goto L_0x0228
                    int r6 = r6 + 1
                    goto L_0x0214
                L_0x0228:
                    androidx.compose.ui.layout.w0 r2 = (androidx.compose.p004ui.layout.C15611w0) r2
                    if (r2 == 0) goto L_0x0232
                    int r2 = r2.mo44468G0()
                    r8 = r2
                    goto L_0x0233
                L_0x0232:
                    r8 = r11
                L_0x0233:
                    if (r14 == 0) goto L_0x0269
                    androidx.compose.ui.layout.f1 r2 = r3
                    boolean r3 = r9
                    if (r8 != 0) goto L_0x0249
                    int r3 = r14.mo10770a()
                    float r5 = androidx.compose.material.ScaffoldKt.f7803b
                    int r2 = r2.mo7429n2(r5)
                L_0x0247:
                    int r3 = r3 + r2
                    goto L_0x0262
                L_0x0249:
                    if (r3 == 0) goto L_0x0254
                    int r2 = r14.mo10770a()
                    int r2 = r2 / 2
                    int r3 = r8 + r2
                    goto L_0x0262
                L_0x0254:
                    int r3 = r14.mo10770a()
                    int r3 = r3 + r8
                    float r5 = androidx.compose.material.ScaffoldKt.f7803b
                    int r2 = r2.mo7429n2(r5)
                    goto L_0x0247
                L_0x0262:
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                    r17 = r2
                    goto L_0x026b
                L_0x0269:
                    r17 = 0
                L_0x026b:
                    if (r4 == 0) goto L_0x0279
                    if (r17 == 0) goto L_0x0274
                    int r2 = r17.intValue()
                    goto L_0x0275
                L_0x0274:
                    r2 = r8
                L_0x0275:
                    int r4 = r4 + r2
                    r16 = r4
                    goto L_0x027b
                L_0x0279:
                    r16 = r11
                L_0x027b:
                    int r2 = r10
                    int r2 = r2 - r1
                    androidx.compose.ui.layout.f1 r3 = r3
                    androidx.compose.material.ScaffoldLayoutContent r4 = androidx.compose.material.ScaffoldLayoutContent.MainContent
                    androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 r5 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                    kotlin.jvm.functions.q<androidx.compose.foundation.layout.i0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r6 = r15
                    int r7 = r14
                    r5.<init>(r3, r8, r6, r7)
                    r6 = -1132241596(0xffffffffbc835d44, float:-0.016035683)
                    r7 = 1
                    androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31049c(r6, r7, r5)
                    java.util.List r3 = r3.mo44296k0(r4, r5)
                    long r4 = r11
                    java.util.ArrayList r7 = new java.util.ArrayList
                    int r6 = r3.size()
                    r7.<init>(r6)
                    int r6 = r3.size()
                L_0x02a6:
                    if (r11 >= r6) goto L_0x02d4
                    java.lang.Object r18 = r3.get(r11)
                    r26 = r3
                    r3 = r18
                    androidx.compose.ui.layout.e0 r3 = (androidx.compose.p004ui.layout.C15557e0) r3
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r24 = 7
                    r25 = 0
                    r18 = r4
                    r23 = r2
                    r27 = r4
                    long r4 = androidx.compose.p004ui.unit.C16476b.m74351e(r18, r20, r21, r22, r23, r24, r25)
                    androidx.compose.ui.layout.w0 r3 = r3.mo44324t0(r4)
                    r7.add(r3)
                    int r11 = r11 + 1
                    r3 = r26
                    r4 = r27
                    goto L_0x02a6
                L_0x02d4:
                    int r11 = r7.size()
                    r6 = 0
                L_0x02d9:
                    if (r6 >= r11) goto L_0x0302
                    java.lang.Object r2 = r7.get(r6)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    r4 = 0
                    r18 = 0
                    r19 = 4
                    r20 = 0
                    r2 = r30
                    r5 = r1
                    r21 = r6
                    r6 = r18
                    r18 = r7
                    r7 = r19
                    r19 = r8
                    r8 = r20
                    androidx.compose.p004ui.layout.C15611w0.C15612a.m69412p(r2, r3, r4, r5, r6, r7, r8)
                    int r6 = r21 + 1
                    r7 = r18
                    r8 = r19
                    goto L_0x02d9
                L_0x0302:
                    r19 = r8
                    int r1 = r10.size()
                    r11 = 0
                L_0x0309:
                    if (r11 >= r1) goto L_0x031f
                    java.lang.Object r2 = r10.get(r11)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 4
                    r8 = 0
                    r2 = r30
                    androidx.compose.p004ui.layout.C15611w0.C15612a.m69412p(r2, r3, r4, r5, r6, r7, r8)
                    int r11 = r11 + 1
                    goto L_0x0309
                L_0x031f:
                    int r1 = r10
                    int r10 = r12.size()
                    r11 = 0
                L_0x0326:
                    if (r11 >= r10) goto L_0x033d
                    java.lang.Object r2 = r12.get(r11)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    r4 = 0
                    int r5 = r1 - r16
                    r6 = 0
                    r7 = 4
                    r8 = 0
                    r2 = r30
                    androidx.compose.p004ui.layout.C15611w0.C15612a.m69412p(r2, r3, r4, r5, r6, r7, r8)
                    int r11 = r11 + 1
                    goto L_0x0326
                L_0x033d:
                    int r1 = r10
                    int r10 = r15.size()
                    r11 = 0
                L_0x0344:
                    if (r11 >= r10) goto L_0x035b
                    java.lang.Object r2 = r15.get(r11)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    r4 = 0
                    int r5 = r1 - r19
                    r6 = 0
                    r7 = 4
                    r8 = 0
                    r2 = r30
                    androidx.compose.p004ui.layout.C15611w0.C15612a.m69412p(r2, r3, r4, r5, r6, r7, r8)
                    int r11 = r11 + 1
                    goto L_0x0344
                L_0x035b:
                    int r1 = r10
                    int r10 = r13.size()
                    r11 = 0
                L_0x0362:
                    if (r11 >= r10) goto L_0x0389
                    java.lang.Object r2 = r13.get(r11)
                    r3 = r2
                    androidx.compose.ui.layout.w0 r3 = (androidx.compose.p004ui.layout.C15611w0) r3
                    if (r14 == 0) goto L_0x0373
                    int r2 = r14.mo10771b()
                    r4 = r2
                    goto L_0x0374
                L_0x0373:
                    r4 = 0
                L_0x0374:
                    if (r17 == 0) goto L_0x037b
                    int r2 = r17.intValue()
                    goto L_0x037c
                L_0x037b:
                    r2 = 0
                L_0x037c:
                    int r5 = r1 - r2
                    r6 = 0
                    r7 = 4
                    r8 = 0
                    r2 = r30
                    androidx.compose.p004ui.layout.C15611w0.C15612a.m69412p(r2, r3, r4, r5, r6, r7, r8)
                    int r11 = r11 + 1
                    goto L_0x0362
                L_0x0389:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.C29721.mo10369a(androidx.compose.ui.layout.w0$a):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo10369a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10368a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
