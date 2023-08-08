package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
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
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEditableSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditableSection.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/EditableSectionKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2,6:109\n80#2:141\n84#2:185\n75#3:115\n76#3,11:117\n75#3:149\n76#3,11:151\n89#3:179\n89#3:184\n75#3:196\n76#3,11:198\n89#3:227\n76#4:116\n76#4:150\n76#4:197\n460#5,13:128\n460#5,13:162\n473#5,3:176\n473#5,3:181\n36#5:186\n460#5,13:209\n473#5,3:224\n154#6:142\n154#6:143\n154#6:193\n154#6:223\n76#7,5:144\n81#7:175\n85#7:180\n79#7,2:194\n81#7:222\n85#7:228\n1114#8,6:187\n*S KotlinDebug\n*F\n+ 1 EditableSection.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/EditableSectionKt\n*L\n35#1:109,6\n35#1:141\n35#1:185\n35#1:115\n35#1:117,11\n36#1:149\n36#1:151,11\n36#1:179\n35#1:184\n64#1:196\n64#1:198,11\n64#1:227\n35#1:116\n36#1:150\n64#1:197\n35#1:128,13\n36#1:162,13\n36#1:176,3\n35#1:181,3\n65#1:186\n64#1:209,13\n64#1:224,3\n37#1:142\n40#1:143\n66#1:193\n73#1:223\n36#1:144,5\n36#1:175\n36#1:180\n64#1:194,2\n64#1:222\n64#1:228\n65#1:187,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionKt */
public final class EditableSectionKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m104614a(androidx.compose.p004ui.C8767m r30, kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, androidx.compose.runtime.C8592o r32, int r33, int r34) {
        /*
            r0 = r31
            r1 = r33
            r2 = r34
            r3 = -2050248222(0xffffffff85cbb1e2, float:-1.9155372E-35)
            r4 = r32
            androidx.compose.runtime.o r15 = r4.mo15009o(r3)
            r4 = r2 & 1
            r5 = 4
            if (r4 == 0) goto L_0x001a
            r6 = r1 | 6
            r7 = r6
            r6 = r30
            goto L_0x002e
        L_0x001a:
            r6 = r1 & 14
            if (r6 != 0) goto L_0x002b
            r6 = r30
            boolean r7 = r15.mo15006n0(r6)
            if (r7 == 0) goto L_0x0028
            r7 = r5
            goto L_0x0029
        L_0x0028:
            r7 = 2
        L_0x0029:
            r7 = r7 | r1
            goto L_0x002e
        L_0x002b:
            r6 = r30
            r7 = r1
        L_0x002e:
            r8 = r2 & 2
            r9 = 16
            if (r8 == 0) goto L_0x0037
            r7 = r7 | 48
            goto L_0x0046
        L_0x0037:
            r8 = r1 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0046
            boolean r8 = r15.mo14927P(r0)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0045
        L_0x0044:
            r8 = r9
        L_0x0045:
            r7 = r7 | r8
        L_0x0046:
            r8 = r7 & 91
            r10 = 18
            if (r8 != r10) goto L_0x0059
            boolean r8 = r15.mo15011p()
            if (r8 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r15.mo14958a0()
            r3 = r15
            goto L_0x01bf
        L_0x0059:
            if (r4 == 0) goto L_0x0060
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            r29 = r4
            goto L_0x0062
        L_0x0060:
            r29 = r6
        L_0x0062:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x006e
            r4 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.checkout.common.EditComponent (EditableSection.kt:59)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r7, r4, r6)
        L_0x006e:
            r17 = 0
            r18 = 0
            r19 = 0
            r3 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r3)
            boolean r3 = r15.mo15006n0(r0)
            java.lang.Object r4 = r15.mo14921N()
            if (r3 != 0) goto L_0x008c
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0094
        L_0x008c:
            com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionKt$EditComponent$1$1 r4 = new com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionKt$EditComponent$1$1
            r4.<init>(r0)
            r15.mo14893C(r4)
        L_0x0094:
            r15.mo15002m0()
            r20 = r4
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            r16 = r29
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.foundation.layout.Arrangement$e r4 = r4.mo7638z(r5)
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r5 = r5.mo17070q()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r6)
            r6 = 54
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r5, r15, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r8.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r11 = r15.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x00fb
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00fb:
            r15.mo14938T()
            boolean r11 = r15.mo14997l()
            if (r11 == 0) goto L_0x0108
            r15.mo14947W(r10)
            goto L_0x010b
        L_0x0108:
            r15.mo14888A()
        L_0x010b:
            r15.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r11 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r11)
            kotlin.jvm.functions.p r4 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r5, r4)
            kotlin.jvm.functions.p r4 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r6, r4)
            kotlin.jvm.functions.p r4 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r7, r4)
            r15.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            r12 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r3.invoke(r4, r15, r5)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r3)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r3 = 2131231465(0x7f0802e9, float:1.8079012E38)
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r3, r15, r12)
            com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r3.mo114218O()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            float r6 = (float) r9
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.SizeKt.m10087C(r5, r6)
            r5 = 0
            r10 = 440(0x1b8, float:6.17E-43)
            r11 = 0
            r9 = r15
            androidx.compose.material.IconKt.m13539b(r4, r5, r6, r7, r9, r10, r11)
            r4 = 2131952801(0x7f1304a1, float:1.9542055E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r15, r12)
            long r6 = r3.mo114218O()
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r5 = r15
            r15 = r3
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            int r8 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r3 = r3.mo11077c(r5, r8)
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r3)
            r26 = 0
            r27 = 0
            r28 = 65530(0xfffa, float:9.1827E-41)
            r25 = r5
            r3 = r5
            r5 = 0
            r8 = 0
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x01bd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bd:
            r6 = r29
        L_0x01bf:
            androidx.compose.runtime.t1 r3 = r3.mo15020s()
            if (r3 != 0) goto L_0x01c6
            goto L_0x01ce
        L_0x01c6:
            com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionKt$EditComponent$3 r4 = new com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionKt$EditComponent$3
            r4.<init>(r6, r0, r1, r2)
            r3.mo15202a(r4)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.common.EditableSectionKt.m104614a(androidx.compose.ui.m, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m104615b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1061313155);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1061313155, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.EditComponentPreview (EditableSection.kt:100)");
            }
            ThemeKt.m153788a(ComposableSingletons$EditableSectionKt.f59354a.mo68766e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EditableSectionKt$EditComponentPreview$1(i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m104616c(@C12580l C8767m mVar, @C12579k String str, @C12579k C11289a<C11079d2> aVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m.C8768a aVar2;
        C8592o oVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2 = str;
        C11289a<C11079d2> aVar3 = aVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(aVar3, "onEditClicked");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        C8592o o = oVar.mo15009o(1641932351);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            mVar2 = mVar;
            i3 = i8;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i8 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo14927P(aVar3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo14927P(pVar2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i10 = i3;
        if ((i10 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                aVar2 = C8767m.f23478j;
            } else {
                aVar2 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1641932351, i10, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.EditableSection (EditableSection.kt:28)");
            }
            int i11 = i10 & 14;
            o.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar4 = C8734c.f23406a;
            int i12 = i11 >> 3;
            C15560f0 b = ColumnKt.m9863b(r, aVar4.mo17072u(), o, (i12 & 112) | (i12 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar2);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i13 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            Arrangement.C2271e z = arrangement.mo7638z(C16483g.m74435M((float) 16));
            C8767m.C8768a aVar5 = C8767m.f23478j;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar5, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 12), 7, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(z, aVar4.mo17073w(), o, 6);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C16361p0 j = C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j();
            int i14 = i10;
            C8592o oVar3 = o;
            C8767m.C8768a aVar6 = aVar5;
            int i15 = i14 >> 3;
            TextKt.m14196c(str, (C8767m) null, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, j, oVar3, (i15 & 14) | C20022q.C20025c.f51280k, 0, 65502);
            oVar2 = oVar3;
            C2428y0.m10726a(C2411u0.m10660e(rowScopeInstance, aVar6, 1.0f, false, 2, (Object) null), oVar2, 0);
            C8767m.C8768a aVar7 = aVar6;
            m104614a(aVar7, aVar, oVar2, (i15 & 112) | 6, 0);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            pVar.invoke(oVar2, Integer.valueOf((i14 >> 9) & 14));
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            aVar2 = mVar2;
            oVar2 = o;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar2;
            C11289a<C11079d2> aVar8 = aVar3;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new EditableSectionKt$EditableSection$2(aVar2, str, aVar, pVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m104617d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(474750581);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(474750581, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.EditableSectionPreview (EditableSection.kt:84)");
            }
            ThemeKt.m153788a(ComposableSingletons$EditableSectionKt.f59354a.mo68764c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new EditableSectionKt$EditableSectionPreview$1(i));
        }
    }
}
