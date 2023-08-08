package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.C2694o;
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
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCardNumberOfActivatedCoupons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberOfActivatedCoupons.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CardNumberOfActivatedCouponsKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,121:1\n74#2,7:122\n81#2:155\n85#2:199\n75#3:129\n76#3,11:131\n75#3:163\n76#3,11:165\n89#3:193\n89#3:198\n76#4:130\n76#4:164\n460#5,13:142\n460#5,13:176\n473#5,3:190\n473#5,3:195\n154#6:156\n154#6:157\n68#7,5:158\n73#7:189\n77#7:194\n*S KotlinDebug\n*F\n+ 1 CardNumberOfActivatedCoupons.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CardNumberOfActivatedCouponsKt\n*L\n85#1:122,7\n85#1:155\n85#1:199\n85#1:129\n85#1:131,11\n92#1:163\n92#1:165,11\n92#1:193\n85#1:198\n85#1:130\n92#1:164\n85#1:142,13\n92#1:176,13\n92#1:190,3\n85#1:195,3\n94#1:156\n96#1:157\n92#1:158,5\n92#1:189\n92#1:194\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt */
public final class CardNumberOfActivatedCouponsKt {
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m105597a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, boolean r25, int r26, int r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r7 = r28
            r8 = r29
            r9 = r31
            java.lang.String r0 = "onDisplayFidCardClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onDisplayCouponBarCodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -205170106(0xfffffffff3c55a46, float:-3.1271773E31)
            r1 = r30
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0023
            r2 = r9 | 6
            r3 = r2
            r2 = r24
            goto L_0x0037
        L_0x0023:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x0034
            r2 = r24
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x0031
            r3 = 4
            goto L_0x0032
        L_0x0031:
            r3 = 2
        L_0x0032:
            r3 = r3 | r9
            goto L_0x0037
        L_0x0034:
            r2 = r24
            r3 = r9
        L_0x0037:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            r15 = r25
            goto L_0x0052
        L_0x0040:
            r4 = r9 & 112(0x70, float:1.57E-43)
            r15 = r25
            if (r4 != 0) goto L_0x0052
            boolean r4 = r14.mo14961b(r15)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r3 = r3 | r4
        L_0x0052:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x005b
            r3 = r3 | 384(0x180, float:5.38E-43)
            r12 = r26
            goto L_0x006d
        L_0x005b:
            r4 = r9 & 896(0x380, float:1.256E-42)
            r12 = r26
            if (r4 != 0) goto L_0x006d
            boolean r4 = r14.mo14976f(r12)
            if (r4 == 0) goto L_0x006a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r3 = r3 | r4
        L_0x006d:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r13 = r27
            goto L_0x0088
        L_0x0076:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            r13 = r27
            if (r4 != 0) goto L_0x0088
            boolean r4 = r14.mo14976f(r13)
            if (r4 == 0) goto L_0x0085
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r4
        L_0x0088:
            r4 = r32 & 16
            if (r4 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008f:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00a1
            boolean r4 = r14.mo14927P(r7)
            if (r4 == 0) goto L_0x009e
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r4
        L_0x00a1:
            r4 = r32 & 32
            if (r4 == 0) goto L_0x00a9
            r4 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r3 = r3 | r4
            goto L_0x00ba
        L_0x00a9:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00ba
            boolean r4 = r14.mo14927P(r8)
            if (r4 == 0) goto L_0x00b7
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r3
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r5) goto L_0x00d1
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r14.mo14958a0()
            r1 = r2
            r4 = r14
            goto L_0x013f
        L_0x00d1:
            if (r1 == 0) goto L_0x00d7
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r11 = r1
            goto L_0x00d8
        L_0x00d7:
            r11 = r2
        L_0x00d8:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00e4
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCoupons (CardNumberOfActivatedCoupons.kt:29)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r1, r2)
        L_0x00e4:
            r0 = 0
            r1 = 0
            r10 = 1
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.SizeKt.m10114n(r11, r0, r10, r1)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r1 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r0 = r0.mo11076b(r14, r1)
            androidx.compose.foundation.shape.e r17 = r0.mo10758e()
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1 r6 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$1
            r0 = r6
            r1 = r28
            r2 = r3
            r3 = r25
            r4 = r29
            r5 = r26
            r7 = r6
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 2094027817(0x7cd05429, float:8.653638E36)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r10, r7)
            r1 = 1572864(0x180000, float:2.204052E-39)
            r2 = 60
            r10 = r16
            r3 = r11
            r11 = r17
            r12 = r18
            r4 = r14
            r14 = r20
            r16 = r22
            r17 = r23
            r18 = r0
            r19 = r4
            r20 = r1
            r21 = r2
            androidx.compose.material.C7873k.m25025b(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x013e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013e:
            r1 = r3
        L_0x013f:
            androidx.compose.runtime.t1 r10 = r4.mo15020s()
            if (r10 != 0) goto L_0x0146
            goto L_0x015d
        L_0x0146:
            com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$2 r11 = new com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsKt$CardNumberOfActivatedCoupons$2
            r0 = r11
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CardNumberOfActivatedCouponsKt.m105597a(androidx.compose.ui.m, boolean, int, int, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105598b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2056417185);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2056417185, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CardNumberOfActivatedCouponsPreview (CardNumberOfActivatedCoupons.kt:110)");
            }
            ThemeKt.m153788a(ComposableSingletons$CardNumberOfActivatedCouponsKt.f59989a.mo69851a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23864x64d234da(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105599c(String str, String str2, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str3 = str;
        String str4 = str2;
        int i5 = i;
        C8592o o = oVar.mo15009o(-352610147);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-352610147, i6, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsCounterDisplayer (CardNumberOfActivatedCoupons.kt:83)");
            }
            C8734c.C8735a aVar = C8734c.f23406a;
            C8734c.C8737c q = aVar.mo17070q();
            o.mo14918M(693286680);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar2);
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
            int i7 = i6;
            C8592o oVar3 = o;
            C7933t0 t0Var = C7933t0.f19075a;
            int i8 = C7933t0.f19076b;
            C8592o oVar4 = oVar3;
            C7933t0 t0Var2 = t0Var;
            int i9 = i8;
            TextKt.m14196c(str, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar3, i8).mo11088c(), oVar3, i7 & 14, 0, 65534);
            C8767m o2 = PaddingKt.m10028o(aVar2, C16483g.m74435M((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C37475b bVar = C37475b.f94185a;
            C8767m m = PaddingKt.m10026m(BackgroundKt.m8824c(o2, bVar.mo114258z(), C2694o.m12169k()), C16483g.m74435M((float) 5), 0.0f, 2, (Object) null);
            C8734c i10 = aVar.mo17066i();
            C8592o oVar5 = oVar4;
            oVar5.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(i10, false, oVar5, 6);
            oVar5.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar5.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar5.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar5.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(m);
            if (!(oVar5.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar5.mo14938T();
            if (oVar5.mo14997l()) {
                oVar5.mo14947W(a2);
            } else {
                oVar5.mo14888A();
            }
            oVar5.mo14941U();
            C8592o b2 = Updater.m30180b(oVar5);
            Updater.m30188j(b2, k, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            oVar5.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar5)), oVar5, 0);
            oVar5.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            oVar2 = oVar5;
            TextKt.m14196c(str2, (C8767m) null, bVar.mo114231a0(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var2.mo11077c(oVar5, i9).mo11089d(), oVar2, (i7 >> 3) & 14, 0, 65018);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
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
            s.mo15202a(new CardNumberOfActivatedCouponsKt$CouponsCounterDisplayer$2(str, str2, i));
        }
    }
}
