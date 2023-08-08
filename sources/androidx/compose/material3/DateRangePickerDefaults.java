package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.C8208h0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C8251n0
@C11363r0({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,809:1\n50#2:810\n49#2:811\n460#2,13:834\n473#2,3:848\n1114#3,6:812\n154#4:818\n79#5,2:819\n81#5:847\n85#5:852\n75#6:821\n76#6,11:823\n89#6:851\n76#7:822\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n419#1:810\n419#1:811\n418#1:834,13\n418#1:848,3\n419#1:812,6\n424#1:818\n418#1:819,2\n418#1:847\n418#1:852\n418#1:821\n418#1:823,11\n418#1:851\n418#1:822\n*E\n"})
public final class DateRangePickerDefaults {
    @C12579k

    /* renamed from: a */
    public static final DateRangePickerDefaults f19346a = new DateRangePickerDefaults();

    /* renamed from: b */
    public static final int f19347b = 0;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11451a(@org.jetbrains.annotations.C12579k androidx.compose.material3.DateRangePickerState r18, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8186d0 r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r17 = this;
            r11 = r18
            r12 = r19
            r13 = r22
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -332090137(0xffffffffec34b4e7, float:-8.7384374E26)
            r1 = r21
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r14.mo15006n0(r11)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r13
            goto L_0x0030
        L_0x002f:
            r1 = r13
        L_0x0030:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            boolean r2 = r14.mo15006n0(r12)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r23 & 4
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0061
            r3 = r20
            boolean r4 = r14.mo15006n0(r3)
            if (r4 == 0) goto L_0x005d
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r4
            goto L_0x0063
        L_0x0061:
            r3 = r20
        L_0x0063:
            r4 = r23 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r15 = r17
            goto L_0x007e
        L_0x006c:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            r15 = r17
            if (r4 != 0) goto L_0x007e
            boolean r4 = r14.mo15006n0(r15)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r4
        L_0x007e:
            r4 = r1 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0091
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            r14.mo14958a0()
            r4 = r3
            goto L_0x0101
        L_0x0091:
            if (r2 == 0) goto L_0x0098
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x009a
        L_0x0098:
            r16 = r3
        L_0x009a:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00a6
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00a6:
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r2 = r0.mo13025K()
            r3 = 6
            java.lang.String r4 = androidx.compose.material3.C8357u2.m29348a(r2, r14, r3)
            int r0 = r0.mo13022H()
            java.lang.String r5 = androidx.compose.material3.C8357u2.m29348a(r0, r14, r3)
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1 r0 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
            r0.<init>(r4)
            r2 = -1382084760(0xffffffffad9f0f68, float:-1.8083049E-11)
            r3 = 1
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r3, r0)
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2 r0 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
            r0.<init>(r5)
            r2 = -199852025(0xfffffffff4168007, float:-4.769539E31)
            androidx.compose.runtime.internal.a r7 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r3, r0)
            androidx.compose.material3.ComposableSingletons$DateRangePickerKt r0 = androidx.compose.material3.ComposableSingletons$DateRangePickerKt.f19264a
            kotlin.jvm.functions.p r8 = r0.mo11306a()
            r0 = 14352384(0xdb0000, float:2.0111974E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r1 = r1 << 15
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r10 = r0 | r1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r16
            r9 = r14
            r0.mo11452b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00ff
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ff:
            r4 = r16
        L_0x0101:
            androidx.compose.runtime.t1 r7 = r14.mo15020s()
            if (r7 != 0) goto L_0x0108
            goto L_0x011b
        L_0x0108:
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3 r8 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.mo11451a(androidx.compose.material3.DateRangePickerState, androidx.compose.material3.d0, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public final void mo11452b(DateRangePickerState dateRangePickerState, C8186d0 d0Var, C8767m mVar, String str, String str2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C8186d0 d0Var2 = d0Var;
        C8767m mVar2 = mVar;
        String str3 = str;
        String str4 = str2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        int i11 = i;
        C8592o o = oVar.mo15009o(-861159957);
        DateRangePickerState dateRangePickerState2 = dateRangePickerState;
        if ((i11 & 14) == 0) {
            if (o.mo15006n0(dateRangePickerState2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i11;
        } else {
            i2 = i11;
        }
        if ((i11 & 112) == 0) {
            if (o.mo15006n0(d0Var2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i11 & 896) == 0) {
            if (o.mo15006n0(mVar2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i11 & 7168) == 0) {
            if (o.mo15006n0(str3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i11) == 0) {
            if (o.mo15006n0(str4)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i11) == 0) {
            if (o.mo14927P(pVar4)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i11) == 0) {
            if (o.mo14927P(pVar5)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i11) == 0) {
            if (o.mo14927P(pVar6)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((23967451 & i12) != 4793490 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-861159957, i12, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData d = dateRangePickerState.mo11487d();
            Locale b = C8260p.m27433b(o, 0);
            Locale locale = b;
            int i13 = i12;
            String b2 = C8186d0.m27008b(d0Var, d.mo11993g().getValue(), d.mo11987a(), locale, false, 8, (Object) null);
            String b3 = C8186d0.m27008b(d0Var, d.mo11992f().getValue(), d.mo11987a(), locale, false, 8, (Object) null);
            Locale locale2 = b;
            String a = d0Var2.mo12519a(d.mo11993g().getValue(), d.mo11987a(), locale2, true);
            o.mo14918M(-1212634278);
            String str5 = "";
            if (a == null) {
                int i14 = d.mo11989c().getValue().mo12624i();
                C8208h0.C8209a aVar = C8208h0.f20150b;
                if (C8208h0.m27132f(i14, aVar.mo12627b())) {
                    o.mo14918M(1922096411);
                    a = C8357u2.m29348a(C8284t2.f20507b.mo13070s(), o, 6);
                    o.mo15002m0();
                } else if (C8208h0.m27132f(i14, aVar.mo12626a())) {
                    o.mo14918M(1922096500);
                    a = C8357u2.m29348a(C8284t2.f20507b.mo13065n(), o, 6);
                    o.mo15002m0();
                } else {
                    o.mo14918M(-544548443);
                    o.mo15002m0();
                    a = str5;
                }
            }
            o.mo15002m0();
            String a2 = d0Var2.mo12519a(d.mo11992f().getValue(), d.mo11987a(), locale2, true);
            o.mo14918M(-1212633768);
            if (a2 == null) {
                int i15 = d.mo11989c().getValue().mo12624i();
                C8208h0.C8209a aVar2 = C8208h0.f20150b;
                if (C8208h0.m27132f(i15, aVar2.mo12627b())) {
                    o.mo14918M(1922096919);
                    str5 = C8357u2.m29348a(C8284t2.f20507b.mo13070s(), o, 6);
                    o.mo15002m0();
                } else if (C8208h0.m27132f(i15, aVar2.mo12626a())) {
                    o.mo14918M(1922097008);
                    str5 = C8357u2.m29348a(C8284t2.f20507b.mo13065n(), o, 6);
                    o.mo15002m0();
                } else {
                    o.mo14918M(-544532695);
                    o.mo15002m0();
                }
            } else {
                str5 = a2;
            }
            o.mo15002m0();
            String str6 = str3 + ": " + a;
            String str7 = str4 + ": " + str5;
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(str6) | o.mo15006n0(str7);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new DateRangePickerDefaults$DateRangePickerHeadline$4$1$1(str6, str7);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8767m a3 = SemanticsModifierKt.m71866a(mVar2, (C11300l) N);
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            Arrangement.C2271e z = Arrangement.f6010a.mo7638z(C16483g.m74435M((float) 4));
            o.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(z, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(a3);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a4);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b4 = Updater.m30180b(o);
            Updater.m30188j(b4, d2, companion.mo44588d());
            Updater.m30188j(b4, dVar, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection, companion.mo44587c());
            Updater.m30188j(b4, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            if (b2 != null) {
                o.mo14918M(990390609);
                oVar2 = o;
                TextKt.m26700c(b2, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131070);
                oVar2.mo15002m0();
            } else {
                oVar2 = o;
                oVar2.mo14918M(990390686);
                pVar4.invoke(oVar2, Integer.valueOf((i13 >> 15) & 14));
                oVar2.mo15002m0();
            }
            pVar6.invoke(oVar2, Integer.valueOf((i13 >> 21) & 14));
            if (b3 != null) {
                oVar2.mo14918M(990390828);
                TextKt.m26700c(b3, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 0, 0, 131070);
                oVar2.mo15002m0();
            } else {
                oVar2.mo14918M(990390903);
                pVar5.invoke(oVar2, Integer.valueOf((i13 >> 18) & 14));
                oVar2.mo15002m0();
            }
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new DateRangePickerDefaults$DateRangePickerHeadline$5(this, dateRangePickerState, d0Var, mVar, str, str2, pVar, pVar2, pVar3, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11453c(@org.jetbrains.annotations.C12579k androidx.compose.material3.DateRangePickerState r30, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33, int r34) {
        /*
            r29 = this;
            r2 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 499073135(0x1dbf406f, float:5.06239E-21)
            r1 = r32
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r33 | 6
            goto L_0x0029
        L_0x0017:
            r3 = r33 & 14
            if (r3 != 0) goto L_0x0027
            boolean r3 = r1.mo15006n0(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r33 | r3
            goto L_0x0029
        L_0x0027:
            r3 = r33
        L_0x0029:
            r4 = r34 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r33 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r31
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r31
        L_0x0045:
            r15 = r3
            r3 = r15 & 91
            r6 = 18
            if (r3 != r6) goto L_0x0059
            boolean r3 = r1.mo15011p()
            if (r3 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r1.mo14958a0()
            r3 = r5
            goto L_0x0116
        L_0x0059:
            if (r4 == 0) goto L_0x0060
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r28 = r3
            goto L_0x0062
        L_0x0060:
            r28 = r5
        L_0x0062:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x006e
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r3, r4)
        L_0x006e:
            int r0 = r30.mo11484a()
            androidx.compose.material3.h0$a r3 = androidx.compose.material3.C8208h0.f20150b
            int r4 = r3.mo12627b()
            boolean r4 = androidx.compose.material3.C8208h0.m27132f(r0, r4)
            r5 = 6
            if (r4 == 0) goto L_0x00bc
            r0 = 585814427(0x22ead19b, float:6.3647756E-18)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13026L()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r5)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r0 = 0
            r4 = r15
            r15 = r0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r4 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m26700c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo15002m0()
            goto L_0x010b
        L_0x00bc:
            r4 = r15
            int r3 = r3.mo12626a()
            boolean r0 = androidx.compose.material3.C8208h0.m27132f(r0, r3)
            if (r0 == 0) goto L_0x0102
            r0 = 585814583(0x22ead237, float:6.36484E-18)
            r1.mo14918M(r0)
            androidx.compose.material3.t2$a r0 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r0.mo13020F()
            java.lang.String r3 = androidx.compose.material3.C8357u2.m29348a(r0, r1, r5)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r4 & 112(0x70, float:1.57E-43)
            r26 = 0
            r27 = 131068(0x1fffc, float:1.83665E-40)
            r4 = r28
            r24 = r1
            androidx.compose.material3.TextKt.m26700c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.mo15002m0()
            goto L_0x010b
        L_0x0102:
            r0 = 585814713(0x22ead2b9, float:6.364894E-18)
            r1.mo14918M(r0)
            r1.mo15002m0()
        L_0x010b:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0114
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0114:
            r3 = r28
        L_0x0116:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1 r7 = new androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1
            r0 = r7
            r1 = r29
            r2 = r30
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.mo11453c(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.m, androidx.compose.runtime.o, int, int):void");
    }
}
