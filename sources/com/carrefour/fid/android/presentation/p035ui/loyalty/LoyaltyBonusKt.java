package com.carrefour.fid.android.presentation.p035ui.loyalty;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C7873k;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
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
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLoyaltyBonus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/LoyaltyBonusKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,404:1\n50#2:405\n49#2:406\n460#2,13:433\n473#2,3:450\n460#2,13:475\n473#2,3:491\n36#2:510\n1114#3,6:407\n1114#3,6:511\n73#4,7:413\n80#4:446\n84#4:454\n75#5:420\n76#5,11:422\n89#5:453\n75#5:462\n76#5,11:464\n89#5:494\n76#6:421\n76#6:463\n1747#7,3:447\n74#8,7:455\n81#8:488\n85#8:495\n154#9:489\n154#9:490\n154#9:496\n154#9:497\n154#9:498\n154#9:499\n154#9:500\n154#9:501\n154#9:502\n154#9:503\n154#9:504\n154#9:505\n154#9:506\n154#9:507\n154#9:508\n154#9:509\n154#9:517\n154#9:518\n*S KotlinDebug\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/LoyaltyBonusKt\n*L\n59#1:405\n59#1:406\n66#1:433,13\n66#1:450,3\n98#1:475,13\n98#1:491,3\n316#1:510\n59#1:407,6\n316#1:511,6\n66#1:413,7\n66#1:446\n66#1:454\n66#1:420\n66#1:422,11\n66#1:453\n98#1:462\n98#1:464,11\n98#1:494\n66#1:421\n98#1:463\n71#1:447,3\n98#1:455,7\n98#1:488\n98#1:495\n100#1:489\n106#1:490\n121#1:496\n123#1:497\n126#1:498\n127#1:499\n198#1:500\n199#1:501\n203#1:502\n204#1:503\n284#1:504\n285#1:505\n287#1:506\n288#1:507\n314#1:508\n315#1:509\n318#1:517\n319#1:518\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt */
public final class LoyaltyBonusKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106615a(List<LoyaltyBonus> list, C11300l<? super C24220a, C11079d2> lVar, C8592o oVar, int i) {
        List<LoyaltyBonus> list2 = list;
        C11300l<? super C24220a, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-21321253);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-21321253, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.DefaultLoyaltyBonusView (LoyaltyBonus.kt:114)");
        }
        C8767m e = ClickableKt.m8878e(SizeKt.m10115o(SizeKt.m10114n(PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 8)), 0.0f, 1, (Object) null), C16483g.m74435M((float) 80)), false, (String) null, (C16031g) null, new LoyaltyBonusKt$DefaultLoyaltyBonusView$1(lVar2, list2), 7, (Object) null);
        C2693n h = C2694o.m12166h(C37474a.f94133a.mo114189l());
        float f = (float) 1;
        C2223i a = C2250j.m9695a(C16483g.m74435M(f), C37475b.f94185a.mo114239g());
        C7873k.m25025b(e, h, 0, 0, a, C16483g.m74435M(f), ComposableSingletons$LoyaltyBonusKt.f60558a.mo70850a(), o, 1769472, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$DefaultLoyaltyBonusView$2(list2, lVar2, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m106616b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1173872150);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1173872150, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.DefaultLoyaltyBonusViewPreview (LoyaltyBonus.kt:344)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBonusKt.f60558a.mo70856g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$DefaultLoyaltyBonusViewPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106617c(kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.loyalty.C24220a, kotlin.C11079d2> r13, androidx.compose.runtime.C8592o r14, int r15) {
        /*
            r0 = -2000256574(0xffffffff88c681c2, float:-1.1947197E-33)
            androidx.compose.runtime.o r14 = r14.mo15009o(r0)
            r1 = r15 & 14
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.mo14927P(r13)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r1 & 11
            if (r3 != r2) goto L_0x0028
            boolean r2 = r14.mo15011p()
            if (r2 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r14.mo14958a0()
            goto L_0x00be
        L_0x0028:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0034
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.loyalty.ErrorLoyaltyBonusView (LoyaltyBonus.kt:309)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0034:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 0
            r2 = 0
            r3 = 1
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10114n(r0, r1, r3, r2)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            r1 = 80
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10115o(r0, r1)
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r0)
            boolean r0 = r14.mo15006n0(r13)
            java.lang.Object r1 = r14.mo14921N()
            if (r0 != 0) goto L_0x006e
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0076
        L_0x006e:
            com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$ErrorLoyaltyBonusView$1$1 r1 = new com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$ErrorLoyaltyBonusView$1$1
            r1.<init>(r13)
            r14.mo14893C(r1)
        L_0x0076:
            r14.mo15002m0()
            r8 = r1
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r9 = 7
            r10 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.ClickableKt.m8878e(r4, r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.design.theme.a r0 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r0 = r0.mo114189l()
            androidx.compose.foundation.shape.n r2 = androidx.compose.foundation.shape.C2694o.m12166h(r0)
            r4 = 0
            r6 = 0
            float r0 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.theme.b r8 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r8 = r8.mo114239g()
            androidx.compose.foundation.i r8 = androidx.compose.foundation.C2250j.m9695a(r3, r8)
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.presentation.ui.loyalty.ComposableSingletons$LoyaltyBonusKt r3 = com.carrefour.fid.android.presentation.p035ui.loyalty.ComposableSingletons$LoyaltyBonusKt.f60558a
            kotlin.jvm.functions.p r9 = r3.mo70854e()
            r11 = 1769472(0x1b0000, float:2.479558E-39)
            r12 = 12
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r0
            r10 = r14
            androidx.compose.material.C7873k.m25025b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00be
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00be:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$ErrorLoyaltyBonusView$2 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$ErrorLoyaltyBonusView$2
            r0.<init>(r13, r15)
            r14.mo15202a(r0)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.LoyaltyBonusKt.m106617c(kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106618d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-751005903);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-751005903, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.ErrorLoyaltyBonusViewPreview (LoyaltyBonus.kt:392)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBonusKt.f60558a.mo70852c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$ErrorLoyaltyBonusViewPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m106619e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1809761099);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1809761099, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoadingLoyaltyBonusView (LoyaltyBonus.kt:279)");
            }
            C8767m o2 = SizeKt.m10115o(PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 8)), C16483g.m74435M((float) 80));
            C2693n h = C2694o.m12166h(C37474a.f94133a.mo114189l());
            float f = (float) 1;
            C2223i a = C2250j.m9695a(C16483g.m74435M(f), C37475b.f94185a.mo114239g());
            C7873k.m25025b(o2, h, 0, 0, a, C16483g.m74435M(f), ComposableSingletons$LoyaltyBonusKt.f60558a.mo70853d(), o, 1769478, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$LoadingLoyaltyBonusView$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m106620f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1264582117);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1264582117, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoadingLoyaltyBonusViewPreview (LoyaltyBonus.kt:379)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBonusKt.f60558a.mo70860k(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$LoadingLoyaltyBonusViewPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m106621g(C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(1377537997);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1377537997, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusHeader (LoyaltyBonus.kt:96)");
            }
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            IconKt.m13539b(C16015f.m71849d(R.drawable.ds_ic_prime, o, 0), (String) null, PaddingKt.m10028o(aVar, C16483g.m74435M((float) 7), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, o, 440, 8);
            C8767m o2 = PaddingKt.m10028o(aVar, C16483g.m74435M((float) 10), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.my_loyalty_bonus_title, o, 0), o2, C37475b.f94185a.mo114210G(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153887N().mo11098k(), oVar2, 48, 0, 65528);
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
            s.mo15202a(new LoyaltyBonusKt$LoyaltyBonusHeader$2(i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m106622h(boolean z, boolean z2, boolean z3, List<LoyaltyBonus> list, C11300l<? super C24220a, C11079d2> lVar, C8592o oVar, int i) {
        List<LoyaltyBonus> list2 = list;
        C8592o o = oVar.mo15009o(2105344044);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2105344044, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusView (LoyaltyBonus.kt:188)");
        } else {
            int i2 = i;
        }
        C8767m e = ClickableKt.m8878e(SizeKt.m10114n(SizeKt.m10115o(PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 8)), C16483g.m74435M((float) 80)), 0.0f, 1, (Object) null), false, (String) null, (C16031g) null, new LoyaltyBonusKt$LoyaltyBonusView$1(lVar, list2), 7, (Object) null);
        float f = (float) 1;
        C8767m mVar = e;
        C7873k.m25025b(mVar, C2694o.m12166h(C37474a.f94133a.mo114189l()), 0, 0, C2250j.m9695a(C16483g.m74435M(f), C37475b.f94185a.mo114239g()), C16483g.m74435M(f), C8553b.m31048b(o, -800716593, true, new LoyaltyBonusKt$LoyaltyBonusView$2(list2, z, z2, z3)), o, 1769472, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$LoyaltyBonusView$3(z, z2, z3, list, lVar, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m106623i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(556361125);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(556361125, i, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusViewPreview (LoyaltyBonus.kt:360)");
            }
            ThemeKt.m153788a(ComposableSingletons$LoyaltyBonusKt.f60558a.mo70858i(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LoyaltyBonusKt$LoyaltyBonusViewPreview$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106624j(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r11, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r12, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.util.List<com.carrefour.fid.android.cms.domain.models.LoyaltyBonus>, kotlin.C11079d2> r13, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r14, int r15) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onRetryClickListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onLoyaltyDetailClickListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1403646513(0xffffffffac560dcf, float:-3.0418894E-12)
            androidx.compose.runtime.o r14 = r14.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0022
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusViewStateful (LoyaltyBonus.kt:51)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r15, r1, r2)
        L_0x0022:
            kotlinx.coroutines.flow.n r1 = r11.getUiState()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$g r2 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26597g.f64976b
            r3 = 0
            r5 = 56
            r6 = 2
            r4 = r14
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30232a(r1, r2, r3, r4, r5, r6)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r1)
            boolean r1 = r14.mo15006n0(r13)
            boolean r2 = r14.mo15006n0(r12)
            r1 = r1 | r2
            java.lang.Object r2 = r14.mo14921N()
            if (r1 != 0) goto L_0x004e
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x0056
        L_0x004e:
            com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$action$1$1 r2 = new com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$action$1$1
            r2.<init>(r13, r12)
            r14.mo14893C(r2)
        L_0x0056:
            r14.mo15002m0()
            r5 = r2
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r2 = r2.mo7631r()
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17072u()
            r4 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r3, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r14.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r8.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r10 = r14.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x00ae
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ae:
            r14.mo14938T()
            boolean r10 = r14.mo14997l()
            if (r10 == 0) goto L_0x00bb
            r14.mo14947W(r9)
            goto L_0x00be
        L_0x00bb:
            r14.mo14888A()
        L_0x00be:
            r14.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r10 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r2, r10)
            kotlin.jvm.functions.p r2 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r3, r2)
            kotlin.jvm.functions.p r2 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r2)
            kotlin.jvm.functions.p r2 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r2)
            r14.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1.invoke(r2, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            m106621g(r14, r4)
            java.lang.Object r1 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j r1 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j) r1
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26600j
            if (r2 == 0) goto L_0x0188
            r1 = 544167069(0x206f549d, float:2.0272084E-19)
            r14.mo14918M(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.LoyaltyDetail.UiState.Primes"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$j r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26600j) r0
            java.util.List r1 = r0.mo77340n()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x012d
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x012d
            goto L_0x0144
        L_0x012d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0131:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r1.next()
            com.carrefour.fid.android.cms.domain.models.LoyaltyBonus r2 = (com.carrefour.fid.android.cms.domain.models.LoyaltyBonus) r2
            boolean r2 = r2.isSelected()
            if (r2 == 0) goto L_0x0131
            r4 = 1
        L_0x0144:
            if (r4 == 0) goto L_0x016b
            r1 = 544167204(0x206f5524, float:2.0272258E-19)
            r14.mo14918M(r1)
            boolean r1 = r0.mo77337k()
            boolean r2 = r0.mo77338l()
            boolean r3 = r0.mo77339m()
            java.util.List r4 = r0.mo77340n()
            r7 = 4096(0x1000, float:5.74E-42)
            r6 = r14
            m106622h(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "service-ok"
            r11.tagRescuePrimeCMS(r1)
            r14.mo15002m0()
            goto L_0x017d
        L_0x016b:
            r1 = 544167671(0x206f56f7, float:2.0272862E-19)
            r14.mo14918M(r1)
            java.util.List r1 = r0.mo77340n()
            r2 = 8
            m106615a(r1, r5, r14, r2)
            r14.mo15002m0()
        L_0x017d:
            java.util.List r0 = r0.mo77340n()
            r11.sendTagPrimeFidList(r0)
            r14.mo15002m0()
            goto L_0x01aa
        L_0x0188:
            boolean r0 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26596f
            if (r0 == 0) goto L_0x019e
            r0 = 544167909(0x206f57e5, float:2.0273169E-19)
            r14.mo14918M(r0)
            m106617c(r5, r14, r4)
            java.lang.String r0 = "service-error"
            r11.tagRescuePrimeCMS(r0)
            r14.mo15002m0()
            goto L_0x01aa
        L_0x019e:
            r0 = 544168068(0x206f5884, float:2.0273375E-19)
            r14.mo14918M(r0)
            m106619e(r14, r4)
            r14.mo15002m0()
        L_0x01aa:
            r14.mo15002m0()
            r14.mo14896D()
            r14.mo15002m0()
            r14.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01bf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bf:
            androidx.compose.runtime.t1 r14 = r14.mo15020s()
            if (r14 != 0) goto L_0x01c6
            goto L_0x01ce
        L_0x01c6:
            com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$2 r0 = new com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusViewStateful$2
            r0.<init>(r11, r12, r13, r15)
            r14.mo15202a(r0)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.LoyaltyBonusKt.m106624j(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }
}
