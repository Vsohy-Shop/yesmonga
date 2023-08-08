package com.carrefour.fid.android.design.components.compose.label;

import androidx.annotation.C0375v;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBaseLabelComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/BaseLabelComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,126:1\n75#2,6:127\n81#2:159\n85#2:164\n75#2,6:205\n81#2:237\n85#2:242\n75#3:133\n76#3,11:135\n89#3:163\n75#3:171\n76#3,11:173\n89#3:201\n75#3:211\n76#3,11:213\n89#3:241\n76#4:134\n76#4:172\n76#4:212\n460#5,13:146\n473#5,3:160\n460#5,13:184\n473#5,3:198\n460#5,13:224\n473#5,3:238\n74#6,6:165\n80#6:197\n84#6:202\n154#7:203\n154#7:204\n*S KotlinDebug\n*F\n+ 1 BaseLabelComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/BaseLabelComponentKt\n*L\n63#1:127,6\n63#1:159\n63#1:164\n118#1:205,6\n118#1:237\n118#1:242\n63#1:133\n63#1:135,11\n63#1:163\n80#1:171\n80#1:173,11\n80#1:201\n118#1:211\n118#1:213,11\n118#1:241\n63#1:134\n80#1:172\n118#1:212\n63#1:146,13\n63#1:160,3\n80#1:184,13\n80#1:198,3\n118#1:224,13\n118#1:238,3\n80#1:165,6\n80#1:197\n80#1:202\n95#1:203\n108#1:204\n*E\n"})
public final class BaseLabelComponentKt {
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m151750a(@C12580l C8767m mVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(pVar, C9168d0.f24880E0);
        Intrinsics.checkNotNullParameter(pVar2, C9168d0.f24887Z);
        C8592o o = oVar.mo15009o(500857823);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(pVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(500857823, i3, -1, "com.carrefour.fid.android.design.components.compose.label.BaseLabelComboHorizontalComponent (BaseLabelComponent.kt:112)");
            }
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            int i8 = (i3 & 14) | C22132b.f56831b;
            o.mo14918M(693286680);
            int i9 = i8 >> 3;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, (i9 & 112) | (i9 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i10 >> 3) & 112));
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            pVar.invoke(o, Integer.valueOf((i3 >> 3) & 14));
            pVar2.invoke(o, Integer.valueOf((i3 >> 6) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BaseLabelComponentKt$BaseLabelComboHorizontalComponent$2(mVar2, pVar, pVar2, i, i2));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m151751b(@C12580l C8767m mVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(pVar, C9156c.f24820X);
        Intrinsics.checkNotNullParameter(pVar2, C9156c.f24821Y);
        C8592o o = oVar.mo15009o(-1895909263);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(pVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1895909263, i3, -1, "com.carrefour.fid.android.design.components.compose.label.BaseLabelComboVerticalComponent (BaseLabelComponent.kt:74)");
            }
            int i8 = i3 & 14;
            o.mo14918M(-483455358);
            int i9 = i8 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i9 & 112) | (i9 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i10 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            pVar.invoke(o, Integer.valueOf((i3 >> 3) & 14));
            pVar2.invoke(o, Integer.valueOf((i3 >> 6) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BaseLabelComponentKt$BaseLabelComboVerticalComponent$2(mVar2, pVar, pVar2, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151752c(long r16, float r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r3 = r18
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 218110018(0xd001842, float:3.9472245E-31)
            r1 = r21
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r6 | 6
            r13 = r16
            goto L_0x002f
        L_0x001d:
            r2 = r6 & 14
            r13 = r16
            if (r2 != 0) goto L_0x002e
            boolean r2 = r1.mo14980g(r13)
            if (r2 == 0) goto L_0x002b
            r2 = 4
            goto L_0x002c
        L_0x002b:
            r2 = 2
        L_0x002c:
            r2 = r2 | r6
            goto L_0x002f
        L_0x002e:
            r2 = r6
        L_0x002f:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0046
        L_0x0036:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0046
            boolean r4 = r1.mo14968d(r3)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r2 = r2 | r4
        L_0x0046:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x004d
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0060
            r7 = r19
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r2 = r2 | r8
            goto L_0x0062
        L_0x0060:
            r7 = r19
        L_0x0062:
            r8 = r23 & 8
            if (r8 == 0) goto L_0x0069
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0079
            boolean r8 = r1.mo14927P(r5)
            if (r8 == 0) goto L_0x0076
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r8
        L_0x0079:
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x008c
            boolean r8 = r1.mo15011p()
            if (r8 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r1.mo14958a0()
            r4 = r7
            goto L_0x017a
        L_0x008c:
            if (r4 == 0) goto L_0x0091
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0092
        L_0x0091:
            r4 = r7
        L_0x0092:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x009e
            r7 = -1
            java.lang.String r8 = "com.carrefour.fid.android.design.components.compose.label.BaseLabelComponent (BaseLabelComponent.kt:56)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r7, r8)
        L_0x009e:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r7 = r7.mo11076b(r1, r8)
            androidx.compose.foundation.shape.e r7 = r7.mo10758e()
            androidx.compose.ui.m r7 = androidx.compose.p004ui.draw.C8744d.m32514a(r4, r7)
            r10 = 0
            r11 = 2
            r12 = 0
            r8 = r16
            androidx.compose.ui.m r7 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.PaddingKt.m10024k(r7, r3)
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            r9 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r8, r0, r1, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r8)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x010c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x010c:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0119
            r1.mo14947W(r12)
            goto L_0x011c
        L_0x0119:
            r1.mo14888A()
        L_0x011c:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r0, r15)
            kotlin.jvm.functions.p r0 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r0)
            kotlin.jvm.functions.p r0 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r0)
            kotlin.jvm.functions.p r0 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.invoke(r0, r1, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r0 = r2 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r1, r0)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x017a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x017a:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x0181
            goto L_0x0194
        L_0x0181:
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$4 r9 = new com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$4
            r0 = r9
            r1 = r16
            r3 = r18
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151752c(long, float, androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151753d(long r16, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, float r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            java.lang.String r0 = "imageContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "textContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1523079080(0xffffffffa537a858, float:-1.5929757E-16)
            r1 = r22
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            r13 = r16
            goto L_0x0036
        L_0x0024:
            r1 = r11 & 14
            r13 = r16
            if (r1 != 0) goto L_0x0035
            boolean r1 = r12.mo14980g(r13)
            if (r1 == 0) goto L_0x0032
            r1 = 4
            goto L_0x0033
        L_0x0032:
            r1 = 2
        L_0x0033:
            r1 = r1 | r11
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x003d
            r1 = r1 | 48
            goto L_0x0050
        L_0x003d:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0050
            r3 = r18
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004c:
            r4 = 16
        L_0x004e:
            r1 = r1 | r4
            goto L_0x0052
        L_0x0050:
            r3 = r18
        L_0x0052:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r12.mo14968d(r8)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
        L_0x0069:
            r4 = r24 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0080
            boolean r4 = r12.mo14927P(r9)
            if (r4 == 0) goto L_0x007d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r4
        L_0x0080:
            r4 = r24 & 16
            if (r4 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0087:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x0099
            boolean r4 = r12.mo14927P(r10)
            if (r4 == 0) goto L_0x0096
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r4
        L_0x0099:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r4 = r4 & r1
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r5) goto L_0x00ac
            boolean r4 = r12.mo15011p()
            if (r4 != 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            r12.mo14958a0()
            goto L_0x00ef
        L_0x00ac:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r2
            goto L_0x00b3
        L_0x00b2:
            r15 = r3
        L_0x00b3:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00bf
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.label.BaseLabelComponent (BaseLabelComponent.kt:37)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00bf:
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$1 r0 = new com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$1
            r0.<init>(r9, r1, r8, r10)
            r2 = -1417024274(0xffffffffab89ecee, float:-9.800197E-13)
            r3 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r2, r3, r0)
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r2 = r1 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r1 = r1 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r6 = r0 | r1
            r7 = 0
            r0 = r16
            r2 = r19
            r3 = r15
            r5 = r12
            m151752c(r0, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00ee
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ee:
            r3 = r15
        L_0x00ef:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x00f6
            goto L_0x010b
        L_0x00f6:
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$2 r15 = new com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelComponent$2
            r0 = r15
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r12.mo15202a(r15)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151753d(long, androidx.compose.ui.m, float, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151754e(long r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, float r20, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23, int r24) {
        /*
            r5 = r21
            r6 = r23
            java.lang.String r0 = "textContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -48251937(0xfffffffffd1fbbdf, float:-1.3270171E37)
            r1 = r22
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x001c
            r2 = r6 | 6
            r4 = r2
            r2 = r17
            goto L_0x0030
        L_0x001c:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r17
            boolean r4 = r1.mo14980g(r2)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002d:
            r2 = r17
            r4 = r6
        L_0x0030:
            r7 = r24 & 2
            if (r7 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r19
            boolean r9 = r1.mo15006n0(r8)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r8 = r19
        L_0x004c:
            r9 = r24 & 4
            if (r9 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            r15 = r20
            goto L_0x0067
        L_0x0055:
            r9 = r6 & 896(0x380, float:1.256E-42)
            r15 = r20
            if (r9 != 0) goto L_0x0067
            boolean r9 = r1.mo14968d(r15)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r9
        L_0x0067:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007e
            boolean r9 = r1.mo14927P(r5)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r9
        L_0x007e:
            r9 = r4 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008f
            boolean r9 = r1.mo15011p()
            if (r9 != 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            r1.mo14958a0()
            goto L_0x00d6
        L_0x008f:
            if (r7 == 0) goto L_0x0096
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r7
            goto L_0x0098
        L_0x0096:
            r16 = r8
        L_0x0098:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00a4
            r7 = -1
            java.lang.String r8 = "com.carrefour.fid.android.design.components.compose.label.BaseLabelTextComponent (BaseLabelComponent.kt:21)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r7, r8)
        L_0x00a4:
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelTextComponent$1 r0 = new com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelTextComponent$1
            r0.<init>(r5, r4)
            r7 = -1387353867(0xffffffffad4ea8f5, float:-1.174726E-11)
            r8 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r7, r8, r0)
            r0 = r4 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r7 = r4 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            int r4 = r4 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r13 = r0 | r4
            r14 = 0
            r7 = r17
            r9 = r20
            r10 = r16
            r12 = r1
            m151752c(r7, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00d4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d4:
            r8 = r16
        L_0x00d6:
            androidx.compose.runtime.t1 r9 = r1.mo15020s()
            if (r9 != 0) goto L_0x00dd
            goto L_0x00f1
        L_0x00dd:
            com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelTextComponent$2 r10 = new com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt$BaseLabelTextComponent$2
            r0 = r10
            r1 = r17
            r3 = r8
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r9.mo15202a(r10)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.label.BaseLabelComponentKt.m151754e(long, androidx.compose.ui.m, float, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151755f(long j, @C0375v int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(-1168088678);
        if ((i2 & 14) == 0) {
            if (o.mo14980g(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (o.mo14976f(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1168088678, i3, -1, "com.carrefour.fid.android.design.components.compose.label.IconLarge (BaseLabelComponent.kt:99)");
            }
            int i6 = ((i3 << 9) & 7168) | 440;
            IconKt.m13539b(C16015f.m71849d(i, o, (i3 >> 3) & 14), (String) null, SizeKt.m10121u(C8767m.f23478j, C16483g.m74435M((float) 20)), j, o, i6, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BaseLabelComponentKt$IconLarge$1(j, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m151756g(long j, @C0375v int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(420028262);
        if ((i2 & 14) == 0) {
            if (o.mo14980g(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (o.mo14976f(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(420028262, i3, -1, "com.carrefour.fid.android.design.components.compose.label.IconSmall (BaseLabelComponent.kt:86)");
            }
            IconKt.m13539b(C16015f.m71849d(i, o, (i3 >> 3) & 14), (String) null, SizeKt.m10121u(C8767m.f23478j, C16483g.m74435M((float) 16)), j, o, ((i3 << 9) & 7168) | 440, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BaseLabelComponentKt$IconSmall$1(j, i, i2));
        }
    }
}
