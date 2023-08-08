package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
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
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStorePetrolComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStorePetrolComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStorePetrolComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,141:1\n76#2:142\n76#2:157\n76#2:191\n76#2:235\n25#3:143\n460#3,13:169\n460#3,13:203\n473#3,3:218\n473#3,3:223\n460#3,13:247\n473#3,3:263\n1114#4,6:144\n74#5,6:150\n80#5:182\n84#5:227\n75#6:156\n76#6,11:158\n75#6:190\n76#6,11:192\n89#6:221\n89#6:226\n75#6:234\n76#6,11:236\n89#6:266\n74#7,7:183\n81#7:216\n85#7:222\n75#7,6:228\n81#7:260\n85#7:267\n154#8:217\n154#8:261\n154#8:262\n*S KotlinDebug\n*F\n+ 1 PhysicalStorePetrolComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStorePetrolComponentKt\n*L\n36#1:142\n38#1:157\n47#1:191\n71#1:235\n39#1:143\n38#1:169,13\n47#1:203,13\n47#1:218,3\n38#1:223,3\n71#1:247,13\n71#1:263,3\n39#1:144,6\n38#1:150,6\n38#1:182\n38#1:227\n38#1:156\n38#1:158,11\n47#1:190\n47#1:192,11\n47#1:221\n38#1:226\n71#1:234\n71#1:236,11\n71#1:266\n47#1:183,7\n47#1:216\n47#1:222\n71#1:228,6\n71#1:260\n71#1:267\n58#1:217\n74#1:261\n75#1:262\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt */
public final class PhysicalStorePetrolComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109647a(@C12580l C8767m mVar, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        int i6;
        int i7;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str4, "petrolCode");
        Intrinsics.checkNotNullParameter(str5, "petrolName");
        Intrinsics.checkNotNullParameter(str6, "petrolPrice");
        C8592o o = oVar.mo15009o(473372216);
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
            if (o.mo15006n0(str4)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo15006n0(str5)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo15006n0(str6)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i10 = i3;
        if ((i10 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(473372216, i10, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolItemComponent (PhysicalStorePetrolComponent.kt:64)");
            }
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m.C8768a aVar2 = C8767m.f23478j;
            mVar3 = aVar;
            ImageKt.m8967b(C16015f.m71849d(m109653g(str), o, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(aVar2, 0.0f, 0.0f, C16483g.m74435M((float) 8), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            long m = C16506u.m74712m(12);
            C16209i0.C16210a aVar3 = C16209i0.f40292b;
            C8592o oVar3 = o;
            String str7 = str2;
            TextKt.m14196c(str7, C2411u0.m10660e(rowScopeInstance, aVar2, 1.0f, false, 2, (Object) null), 0, m, (C16190e0) null, aVar3.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, ((i10 >> 6) & 14) | 199680, 0, 131028);
            C8592o oVar4 = oVar3;
            oVar2 = oVar4;
            TextKt.m14196c(str6 + "€/L", (C8767m) null, 0, 0, (C16190e0) null, aVar3.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(oVar4, C7933t0.f19076b).mo11097j(), oVar2, C20022q.C20025c.f51280k, 0, 65502);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C25382x505dde96(mVar3, str, str2, str3, i, i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109648b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1921350138);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1921350138, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolItemComponentPreview (PhysicalStorePetrolComponent.kt:131)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStorePetrolComponentKt.f62470a.mo73969b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25383x4213832d(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109649c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r36, @org.jetbrains.annotations.C12579k java.lang.String r37, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41) {
        /*
            r2 = r37
            r4 = r40
            java.lang.String r0 = "date"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -1219946404(0xffffffffb749185c, float:-1.1986205E-5)
            r1 = r39
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r41 & 1
            r14 = 4
            if (r3 == 0) goto L_0x001d
            r5 = r4 | 6
            r6 = r5
            r5 = r36
            goto L_0x0031
        L_0x001d:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002e
            r5 = r36
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x002b
            r6 = r14
            goto L_0x002c
        L_0x002b:
            r6 = 2
        L_0x002c:
            r6 = r6 | r4
            goto L_0x0031
        L_0x002e:
            r5 = r36
            r6 = r4
        L_0x0031:
            r7 = r41 & 2
            if (r7 == 0) goto L_0x0038
            r6 = r6 | 48
            goto L_0x0048
        L_0x0038:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0048
            boolean r7 = r1.mo15006n0(r2)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r6 = r6 | r7
        L_0x0048:
            r7 = r41 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x004f:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r38
            boolean r9 = r1.mo14927P(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r9
            goto L_0x0064
        L_0x0062:
            r8 = r38
        L_0x0064:
            r6 = r6 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x0079
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r1.mo14958a0()
            r3 = r5
            r35 = r8
            goto L_0x02f3
        L_0x0079:
            if (r3 == 0) goto L_0x007e
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x007f
        L_0x007e:
            r3 = r5
        L_0x007f:
            if (r7 == 0) goto L_0x0085
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$1 r5 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.C25384x4f5e1d0d.f62522f
            r13 = r5
            goto L_0x0086
        L_0x0085:
            r13 = r8
        L_0x0086:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0092
            r5 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolSourceComponent (PhysicalStorePetrolComponent.kt:30)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r5, r6)
        L_0x0092:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71024v()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.platform.z3 r0 = (androidx.compose.p004ui.platform.C16007z3) r0
            r5 = 2131952727(0x7f130457, float:1.9541905E38)
            r12 = 0
            java.lang.String r15 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r1, r12)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r5)
            java.lang.Object r5 = r1.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r5 != r6) goto L_0x00bd
            androidx.compose.foundation.interaction.g r5 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r5)
        L_0x00bd:
            r1.mo15002m0()
            r16 = r5
            androidx.compose.foundation.interaction.g r16 = (androidx.compose.foundation.interaction.C2243g) r16
            r5 = 1
            r6 = 0
            com.carrefour.fid.android.design.theme.b r30 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r30.mo114218O()
            r10 = 6
            r11 = 2
            r9 = r1
            androidx.compose.foundation.a0 r17 = androidx.compose.material.ripple.C7922j.m25285e(r5, r6, r7, r9, r10, r11)
            r18 = 0
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$3 r5 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$3
            r5.<init>(r13, r0, r15)
            r22 = 28
            r23 = 0
            r15 = r3
            r21 = r5
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8876c(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r31 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r31.mo7631r()
            androidx.compose.ui.c$a r32 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r32.mo17072u()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r6, r1, r12)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r15)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r33 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r33.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r10 = r1.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0138
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0138:
            r1.mo14938T()
            boolean r10 = r1.mo14997l()
            if (r10 == 0) goto L_0x0145
            r1.mo14947W(r9)
            goto L_0x0148
        L_0x0145:
            r1.mo14888A()
        L_0x0148:
            r1.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r10 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r10)
            kotlin.jvm.functions.p r5 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r1.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r0.invoke(r5, r1, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r2
            r6 = 64
            r7 = 2131952724(0x7f130454, float:1.9541899E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71859e(r7, r5, r1, r6)
            r6 = 0
            r7 = 0
            r34 = 12
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r34)
            r11 = 0
            r16 = 0
            r36 = r12
            r12 = r16
            r35 = r13
            r13 = r16
            r16 = 0
            r0 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 0
            r29 = 131062(0x1fff6, float:1.83657E-40)
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.c$c r5 = r32.mo17070q()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r6)
            androidx.compose.ui.m$a r32 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement$d r6 = r31.mo7630p()
            r7 = 48
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r5, r1, r7)
            r1.mo14918M(r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r1.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            kotlin.jvm.functions.a r8 = r33.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r32)
            androidx.compose.runtime.d r10 = r1.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0214
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0214:
            r1.mo14938T()
            boolean r10 = r1.mo14997l()
            if (r10 == 0) goto L_0x0221
            r1.mo14947W(r8)
            goto L_0x0224
        L_0x0221:
            r1.mo14888A()
        L_0x0224:
            r1.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r10 = r33.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r10)
            kotlin.jvm.functions.p r5 = r33.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r0, r5)
            kotlin.jvm.functions.p r0 = r33.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r0)
            kotlin.jvm.functions.p r0 = r33.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r36)
            r9.invoke(r0, r1, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r0 = 2131952725(0x7f130455, float:1.95419E38)
            r14 = r36
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r14)
            r6 = 0
            r7 = 0
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r34)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r0 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 0
            r29 = 131062(0x1fff6, float:1.83657E-40)
            r26 = r1
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 2131952726(0x7f130456, float:1.9541903E38)
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r5, r1, r0)
            long r7 = r30.mo114218O()
            long r9 = androidx.compose.p004ui.unit.C16506u.m74712m(r34)
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r12 = r0.mo46947c()
            r0 = 4
            float r0 = (float) r0
            float r14 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r19 = 0
            r13 = r32
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.PaddingKt.m10028o(r13, r14, r15, r16, r17, r18, r19)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r27 = 199728(0x30c30, float:2.79879E-40)
            r29 = 131024(0x1ffd0, float:1.83604E-40)
            androidx.compose.material.TextKt.m14196c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02f3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02f3:
            androidx.compose.runtime.t1 r6 = r1.mo15020s()
            if (r6 != 0) goto L_0x02fa
            goto L_0x030c
        L_0x02fa:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$5 r7 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolComponentKt$PhysicalStorePetrolSourceComponent$5
            r0 = r7
            r1 = r3
            r2 = r37
            r3 = r35
            r4 = r40
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x030c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStorePetrolComponentKt.m109649c(androidx.compose.ui.m, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109650d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1059350286);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1059350286, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePetrolSourceComponentPreview (PhysicalStorePetrolComponent.kt:121)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStorePetrolComponentKt.f62470a.mo73968a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25387x9d7e8db5(i));
        }
    }

    /* renamed from: g */
    public static final int m109653g(String str) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (Intrinsics.areEqual((Object) str, (Object) PetrolCode.SP98.mo73992q())) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) str, (Object) PetrolCode.SP95.mo73992q());
        }
        if (z) {
            return R.drawable.e5;
        }
        if (Intrinsics.areEqual((Object) str, (Object) PetrolCode.E85.mo73992q())) {
            return R.drawable.e85;
        }
        if (Intrinsics.areEqual((Object) str, (Object) PetrolCode.SP95.mo73992q())) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) str, (Object) PetrolCode.E10.mo73992q());
        }
        if (z2) {
            return R.drawable.e10;
        }
        if (!Intrinsics.areEqual((Object) str, (Object) PetrolCode.GPL.mo73992q())) {
            z3 = Intrinsics.areEqual((Object) str, (Object) PetrolCode.GPLC.mo73992q());
        }
        if (z3) {
            return R.drawable.lpg;
        }
        return R.drawable.b7;
    }
}
