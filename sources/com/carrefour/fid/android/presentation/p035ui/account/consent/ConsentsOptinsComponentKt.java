package com.carrefour.fid.android.presentation.p035ui.account.consent;

import androidx.annotation.C0324b1;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.C7903q1;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConsentsOptinsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentsOptinsComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/ConsentsOptinsComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,454:1\n74#2,6:455\n80#2:487\n74#2,6:491\n80#2:523\n84#2:544\n84#2:550\n74#2,6:552\n80#2:584\n84#2:589\n74#2,6:716\n80#2:748\n84#2:793\n75#3:461\n76#3,11:463\n75#3:497\n76#3,11:499\n89#3:543\n89#3:549\n75#3:558\n76#3,11:560\n89#3:588\n75#3:632\n76#3,11:634\n89#3:677\n75#3:689\n76#3,11:691\n75#3:722\n76#3,11:724\n75#3:756\n76#3,11:758\n89#3:787\n89#3:792\n89#3:797\n75#3:802\n76#3,11:804\n89#3:832\n75#3:837\n76#3,11:839\n89#3:867\n76#4:462\n76#4:498\n76#4:559\n76#4:633\n76#4:690\n76#4:723\n76#4:757\n76#4:803\n76#4:838\n460#5,13:474\n460#5,13:510\n473#5,3:540\n473#5,3:546\n460#5,13:571\n473#5,3:585\n460#5,13:645\n50#5:666\n49#5:667\n473#5,3:674\n36#5:679\n460#5,13:702\n460#5,13:735\n460#5,13:769\n473#5,3:784\n473#5,3:789\n473#5,3:794\n460#5,13:815\n473#5,3:829\n460#5,13:850\n473#5,3:864\n154#6:488\n154#6:489\n154#6:490\n154#6:524\n154#6:525\n154#6:526\n154#6:529\n154#6:530\n154#6:533\n154#6:534\n154#6:537\n154#6:538\n154#6:539\n154#6:545\n154#6:551\n154#6:597\n154#6:611\n154#6:629\n154#6:686\n154#6:783\n154#6:799\n154#6:834\n288#7,2:527\n288#7,2:531\n288#7,2:535\n766#7:598\n857#7,2:599\n766#7:601\n857#7,2:602\n288#7,2:612\n288#7,2:614\n1747#7,3:869\n1098#8:590\n927#8,6:591\n1098#8:604\n927#8,6:605\n1098#8:616\n927#8,6:617\n927#8,6:623\n1098#8:659\n927#8,6:660\n79#9,2:630\n81#9:658\n85#9:678\n79#9,2:687\n81#9:715\n74#9,7:749\n81#9:782\n85#9:788\n85#9:798\n79#9,2:800\n81#9:828\n85#9:833\n79#9,2:835\n81#9:863\n85#9:868\n1114#10,6:668\n1114#10,6:680\n*S KotlinDebug\n*F\n+ 1 ConsentsOptinsComponent.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/ConsentsOptinsComponentKt\n*L\n54#1:455,6\n54#1:487\n62#1:491,6\n62#1:523\n62#1:544\n54#1:550\n123#1:552,6\n123#1:584\n123#1:589\n303#1:716,6\n303#1:748\n303#1:793\n54#1:461\n54#1:463,11\n62#1:497\n62#1:499,11\n62#1:543\n54#1:549\n123#1:558\n123#1:560,11\n123#1:588\n234#1:632\n234#1:634,11\n234#1:677\n296#1:689\n296#1:691,11\n303#1:722\n303#1:724,11\n304#1:756\n304#1:758,11\n304#1:787\n303#1:792\n296#1:797\n339#1:802\n339#1:804,11\n339#1:832\n365#1:837\n365#1:839,11\n365#1:867\n54#1:462\n62#1:498\n123#1:559\n234#1:633\n296#1:690\n303#1:723\n304#1:757\n339#1:803\n365#1:838\n54#1:474,13\n62#1:510,13\n62#1:540,3\n54#1:546,3\n123#1:571,13\n123#1:585,3\n234#1:645,13\n263#1:666\n263#1:667\n234#1:674,3\n298#1:679\n296#1:702,13\n303#1:735,13\n304#1:769,13\n304#1:784,3\n303#1:789,3\n296#1:794,3\n339#1:815,13\n339#1:829,3\n365#1:850,13\n365#1:864,3\n59#1:488\n61#1:489\n62#1:490\n67#1:524\n69#1:525\n76#1:526\n81#1:529\n86#1:530\n90#1:533\n97#1:534\n101#1:537\n108#1:538\n110#1:539\n117#1:545\n126#1:551\n152#1:597\n185#1:611\n236#1:629\n299#1:686\n309#1:783\n341#1:799\n367#1:834\n80#1:527,2\n88#1:531,2\n99#1:535,2\n153#1:598\n153#1:599,2\n159#1:601\n159#1:602,2\n186#1:612,2\n190#1:614,2\n408#1:869,3\n143#1:590\n144#1:591,6\n176#1:604\n177#1:605,6\n204#1:616\n205#1:617,6\n211#1:623,6\n241#1:659\n244#1:660,6\n234#1:630,2\n234#1:658\n234#1:678\n296#1:687,2\n296#1:715\n304#1:749,7\n304#1:782\n304#1:788\n296#1:798\n339#1:800,2\n339#1:828\n339#1:833\n365#1:835,2\n365#1:863\n365#1:868\n263#1:668,6\n298#1:680,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt */
public final class ConsentsOptinsComponentKt {
    @C12579k

    /* renamed from: a */
    public static final String f58515a = "PartnersClickTag";

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103240a(@C0324b1 int i, boolean z, C11300l<? super Boolean, C11079d2> lVar, C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        boolean z2 = z;
        C11300l<? super Boolean, C11079d2> lVar2 = lVar;
        int i8 = i2;
        C8592o o = oVar.mo15009o(1712660199);
        if ((i8 & 14) == 0) {
            if (o.mo14976f(i7)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 112) == 0) {
            if (o.mo14961b(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i8 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1712660199, i3, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentRowComponent (ConsentsOptinsComponent.kt:333)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M((float) 8), 1, (Object) null), 0.0f, 1, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, o, 54);
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
            TextKt.m14196c(C16018i.m71858d(i7, o, i3 & 14), C2411u0.m10660e(RowScopeInstance.f6147a, aVar, 1.0f, false, 2, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), o, 0, 0, 65532);
            int i9 = i3 >> 3;
            int i10 = (i9 & 14) | (i9 & 112);
            boolean z3 = z;
            C11300l<? super Boolean, C11079d2> lVar3 = lVar;
            oVar2 = o;
            SwitchKt.m14058a(z3, lVar3, (C8767m) null, false, (C2243g) null, C7903q1.f18967a.mo10989a(C37475b.f94185a.mo114218O(), 0, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, o, 0, C7903q1.f18968b, 1022), o, i10, 28);
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
            s.mo15202a(new ConsentsOptinsComponentKt$ConsentRowComponent$2(i7, z2, lVar2, i8));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103241b(C16156d dVar, boolean z, C11300l<? super Boolean, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        C16156d dVar2 = dVar;
        boolean z2 = z;
        C11300l<? super Boolean, C11079d2> lVar2 = lVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(1719601869);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(dVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1719601869, i7, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentRowComponent (ConsentsOptinsComponent.kt:359)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(PaddingKt.m10026m(aVar, 0.0f, C16483g.m74435M((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
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
            Updater.m30188j(b, dVar3, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            int i8 = i7;
            oVar2 = o;
            TextKt.m14197d(dVar, C2411u0.m10660e(RowScopeInstance.f6147a, aVar, 1.0f, false, 2, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), oVar2, i8 & 14, 0, 131068);
            int i9 = i8 >> 3;
            int i10 = (i9 & 14) | (i9 & 112);
            SwitchKt.m14058a(z, lVar, (C8767m) null, false, (C2243g) null, C7903q1.f18967a.mo10989a(C37475b.f94185a.mo114218O(), 0, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, oVar2, 0, C7903q1.f18968b, 1022), oVar2, i10, 28);
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
            s.mo15202a(new ConsentsOptinsComponentKt$ConsentRowComponent$4(dVar, z, lVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m103242c(@C0324b1 int i, C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(-1368567353);
        if ((i6 & 14) == 0) {
            if (o.mo14976f(i5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i6;
        } else {
            i3 = i6;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1368567353, i3, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsCategoryComponent (ConsentsOptinsComponent.kt:121)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C37475b bVar = C37475b.f94185a;
            C8767m n = SizeKt.m10114n(PaddingKt.m10025l(BackgroundKt.m8825d(aVar, bVar.mo114208E(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16), C16483g.m74435M((float) 8)), 0.0f, 1, (Object) null);
            o.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, 0);
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(i5, o, i3 & 14), (C8767m) null, bVar.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153886M(C37477d.m153887N()), oVar2, 0, 0, 65530);
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
            s.mo15202a(new ConsentsOptinsComponentKt$ConsentsCategoryComponent$2(i5, i6));
        }
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m103243d(ConsentOptIn consentOptIn, C11300l<? super C22934l, C11079d2> lVar, C8592o oVar, int i) {
        boolean z;
        ConsentOptIn consentOptIn2 = consentOptIn;
        C11300l<? super C22934l, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(710596058);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(710596058, i2, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsLoyaltyByPostComponent (ConsentsOptinsComponent.kt:196)");
        }
        ChoiceOptIn f = consentOptIn.mo117324f();
        ChoiceOptIn choiceOptIn = ChoiceOptIn.ACCEPTED;
        if (f != choiceOptIn) {
            z = choiceOptIn.mo117315r();
        } else {
            z = ChoiceOptIn.REFUSED.mo117315r();
        }
        o.mo14918M(1839440936);
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        o.mo14918M(1839440971);
        C16209i0.C16210a aVar2 = C16209i0.f40292b;
        int r = aVar.mo46713r(new C16151c0(0, 0, aVar2.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
        try {
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_loyalty_by_post_part1_bold, o, 0));
            C11079d2 d2Var = C11079d2.f28267a;
            aVar.mo46710o(r);
            o.mo15002m0();
            aVar.mo46707l(" ");
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_loyalty_by_post_part2, o, 0));
            aVar.mo46707l(" ");
            int r2 = aVar.mo46713r(new C16151c0(0, 0, aVar2.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
            try {
                aVar.mo46707l(C16018i.m71858d(R.string.account_notification_loyalty_by_post_part3_bold, o, 0));
                aVar.mo46710o(r2);
                C16156d u = aVar.mo46716u();
                o.mo15002m0();
                m103241b(u, z, new ConsentsOptinsComponentKt$ConsentsLoyaltyByPostComponent$2(lVar2, consentOptIn2), o, 0);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new ConsentsOptinsComponentKt$ConsentsLoyaltyByPostComponent$3(consentOptIn2, lVar2, i2));
                }
            } catch (Throwable th) {
                aVar.mo46710o(r2);
                throw th;
            }
        } catch (Throwable th2) {
            aVar.mo46710o(r);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m103244e(List<ConsentOptIn> list, C11300l<? super C22934l, C11079d2> lVar, C8592o oVar, int i) {
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        List<ConsentOptIn> list2 = list;
        C11300l<? super C22934l, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1372726191);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1372726191, i2, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsLoyaltyComponent (ConsentsOptinsComponent.kt:170)");
        }
        o.mo14918M(1150458039);
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        o.mo14918M(1150458074);
        int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
        try {
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_personalized_fid_part1_bold, o, 0));
            C11079d2 d2Var = C11079d2.f28267a;
            aVar.mo46710o(r);
            o.mo15002m0();
            aVar.mo46707l(" ");
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_personalized_fid_part2, o, 0));
            C16156d u = aVar.mo46716u();
            o.mo15002m0();
            C8592o oVar2 = o;
            TextKt.m14197d(u, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), oVar2, 0, 0, 131070);
            C8592o oVar3 = oVar2;
            C2428y0.m10726a(SizeKt.m10115o(C8767m.f23478j, C16483g.m74435M((float) 8)), oVar3, 6);
            Iterable iterable = list2;
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ConsentOptIn) obj).mo117326h() == ConsentName.OPTIN_FID_EMAIL) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            ConsentOptIn consentOptIn = (ConsentOptIn) obj;
            oVar3.mo14918M(1150458543);
            if (consentOptIn != null) {
                m103250k(consentOptIn, R.string.account_notification_type_email, lVar2, oVar3, ((i2 << 3) & 896) | 8);
                C11079d2 d2Var2 = C11079d2.f28267a;
            }
            oVar3.mo15002m0();
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((ConsentOptIn) obj2).mo117326h() == ConsentName.OPTIN_FID_SMS) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ConsentOptIn consentOptIn2 = (ConsentOptIn) obj2;
            if (consentOptIn2 != null) {
                m103250k(consentOptIn2, R.string.account_notification_type_sms, lVar2, oVar3, ((i2 << 3) & 896) | 8);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = oVar3.mo15020s();
            if (s != null) {
                s.mo15202a(new ConsentsOptinsComponentKt$ConsentsLoyaltyComponent$4(list2, lVar2, i2));
            }
        } catch (Throwable th) {
            aVar.mo46710o(r);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103245f(boolean r29, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l, kotlin.C11079d2> r30, androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r0 = r29
            r1 = r30
            r2 = r32
            r3 = -238147139(0xfffffffff1ce29bd, float:-2.0417399E30)
            r4 = r31
            androidx.compose.runtime.o r15 = r4.mo15009o(r3)
            r4 = r2 & 14
            if (r4 != 0) goto L_0x001e
            boolean r4 = r15.mo14961b(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 112(0x70, float:1.57E-43)
            r6 = 16
            if (r5 != 0) goto L_0x0030
            boolean r5 = r15.mo14927P(r1)
            if (r5 == 0) goto L_0x002e
            r5 = 32
            goto L_0x002f
        L_0x002e:
            r5 = r6
        L_0x002f:
            r4 = r4 | r5
        L_0x0030:
            r5 = r4 & 91
            r7 = 18
            if (r5 != r7) goto L_0x0043
            boolean r5 = r15.mo15011p()
            if (r5 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r15.mo14958a0()
            r14 = r15
            goto L_0x034e
        L_0x0043:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x004f
            r5 = -1
            java.lang.String r7 = "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsNotificationsComponent (ConsentsOptinsComponent.kt:291)"
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r4, r5, r7)
        L_0x004f:
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r4)
            boolean r4 = r15.mo15006n0(r1)
            java.lang.Object r5 = r15.mo14921N()
            if (r4 != 0) goto L_0x006c
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r5 != r4) goto L_0x0074
        L_0x006c:
            com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsNotificationsComponent$1$1 r5 = new com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsNotificationsComponent$1$1
            r5.<init>(r1)
            r15.mo14893C(r5)
        L_0x0074:
            r15.mo15002m0()
            r12 = r5
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r13 = 7
            r14 = 0
            r8 = r3
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8878e(r8, r9, r10, r11, r12, r13, r14)
            float r5 = (float) r6
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.PaddingKt.m10024k(r4, r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r6 = r5.mo7628l()
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r8 = r7.mo17070q()
            r14 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r14)
            r9 = 54
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r8, r15, r9)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r13)
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.unit.d r8 = (androidx.compose.p004ui.unit.C16479d) r8
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r16.mo44585a()
            kotlin.jvm.functions.q r4 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r4)
            androidx.compose.runtime.d r12 = r15.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x00db
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00db:
            r15.mo14938T()
            boolean r12 = r15.mo14997l()
            if (r12 == 0) goto L_0x00e8
            r15.mo14947W(r11)
            goto L_0x00eb
        L_0x00e8:
            r15.mo14888A()
        L_0x00eb:
            r15.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r12 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r12)
            kotlin.jvm.functions.p r6 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r8, r6)
            kotlin.jvm.functions.p r6 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r6)
            kotlin.jvm.functions.p r6 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r6)
            r15.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r12 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r4.invoke(r6, r15, r8)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.RowScopeInstance r8 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r6 = 2
            r17 = 0
            r9 = r3
            r14 = r12
            r12 = r6
            r6 = r13
            r13 = r17
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.C2411u0.m10660e(r8, r9, r10, r11, r12, r13)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement$l r9 = r5.mo7631r()
            androidx.compose.ui.c$b r10 = r7.mo17072u()
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.ColumnKt.m9863b(r9, r10, r15, r14)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r15.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r15.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            kotlin.jvm.functions.a r13 = r16.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r6 = r15.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x017f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x017f:
            r15.mo14938T()
            boolean r6 = r15.mo14997l()
            if (r6 == 0) goto L_0x018c
            r15.mo14947W(r13)
            goto L_0x018f
        L_0x018c:
            r15.mo14888A()
        L_0x018f:
            r15.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r13 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r13)
            kotlin.jvm.functions.p r9 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r9)
            kotlin.jvm.functions.p r9 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r11, r9)
            kotlin.jvm.functions.p r9 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r9)
            r15.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8.invoke(r6, r15, r9)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r6 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r6)
            androidx.compose.foundation.layout.Arrangement$d r5 = r5.mo7630p()
            androidx.compose.ui.c$c r6 = r7.mo17073w()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r6, r15, r14)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r15.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r16.mo44585a()
            kotlin.jvm.functions.q r10 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r11 = r15.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0212
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0212:
            r15.mo14938T()
            boolean r11 = r15.mo14997l()
            if (r11 == 0) goto L_0x021f
            r15.mo14947W(r9)
            goto L_0x0222
        L_0x021f:
            r15.mo14888A()
        L_0x0222:
            r15.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r11 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r11)
            kotlin.jvm.functions.p r5 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r15.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r10.invoke(r5, r15, r6)
            r15.mo14918M(r4)
            r4 = 2131951817(0x7f1300c9, float:1.954006E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r15, r14)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r31 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material.w1 r24 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153886M(r24)
            r26 = 0
            r27 = 0
            r28 = 65534(0xfffe, float:9.1833E-41)
            r25 = r31
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = 10
            float r4 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10092H(r3, r4)
            r4 = 6
            r15 = r31
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r15, r4)
            if (r0 == 0) goto L_0x02aa
            r3 = 2131231380(0x7f080294, float:1.807884E38)
            goto L_0x02ad
        L_0x02aa:
            r3 = 2131231379(0x7f080293, float:1.8078837E38)
        L_0x02ad:
            r14 = 0
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r3, r15, r14)
            if (r0 == 0) goto L_0x02b8
            r3 = 2131951652(0x7f130024, float:1.9539725E38)
            goto L_0x02bb
        L_0x02b8:
            r3 = 2131951651(0x7f130023, float:1.9539723E38)
        L_0x02bb:
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r14)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 8
            r13 = 124(0x7c, float:1.74E-43)
            r11 = r15
            androidx.compose.foundation.ImageKt.m8967b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.mo15002m0()
            r15.mo14896D()
            r15.mo15002m0()
            r15.mo15002m0()
            if (r0 == 0) goto L_0x02de
            r3 = 2131951815(0x7f1300c7, float:1.9540055E38)
            goto L_0x02e1
        L_0x02de:
            r3 = 2131951816(0x7f1300c8, float:1.9540057E38)
        L_0x02e1:
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r14)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r3 = r14
            r13 = r16
            r16 = 0
            r31 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material.w1 r24 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r24 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r24)
            r26 = 0
            r27 = 0
            r28 = 65534(0xfffe, float:9.1833E-41)
            r25 = r31
            androidx.compose.material.TextKt.m14196c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r31.mo15002m0()
            r31.mo14896D()
            r31.mo15002m0()
            r31.mo15002m0()
            r4 = 2131231601(0x7f080371, float:1.8079288E38)
            r14 = r31
            androidx.compose.ui.graphics.painter.Painter r4 = androidx.compose.p004ui.res.C16015f.m71849d(r4, r14, r3)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 56
            r13 = 124(0x7c, float:1.74E-43)
            r11 = r14
            androidx.compose.foundation.ImageKt.m8967b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.mo15002m0()
            r14.mo14896D()
            r14.mo15002m0()
            r14.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x034e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x034e:
            androidx.compose.runtime.t1 r3 = r14.mo15020s()
            if (r3 != 0) goto L_0x0355
            goto L_0x035d
        L_0x0355:
            com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsNotificationsComponent$3 r4 = new com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsNotificationsComponent$3
            r4.<init>(r0, r1, r2)
            r3.mo15202a(r4)
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.consent.ConsentsOptinsComponentKt.m103245f(boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m103246g(@C12579k List<ConsentOptIn> list, @C12579k List<ConsentOptIn> list2, @C12579k String str, boolean z, boolean z2, @C12579k C11300l<? super C22934l, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Object obj;
        Object obj2;
        float f;
        int i2;
        int i3;
        int i4;
        C8592o oVar2;
        Object obj3;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        List<ConsentOptIn> list3 = list;
        List<ConsentOptIn> list4 = list2;
        C11300l<? super C22934l, C11079d2> lVar2 = lVar;
        int i8 = i;
        Intrinsics.checkNotNullParameter(list3, "userConsents");
        Intrinsics.checkNotNullParameter(list4, "loyaltyConsents");
        Intrinsics.checkNotNullParameter(str, "carrefourPartnerUrl");
        Intrinsics.checkNotNullParameter(lVar2, "actioner");
        C8592o o = oVar.mo15009o(-343556765);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-343556765, i8, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponent (ConsentsOptinsComponent.kt:45)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m n = SizeKt.m10114n(ScrollKt.m9059f(aVar, ScrollKt.m9056c(0, o, 0, 1), false, (C2195g) null, false, 14, (Object) null), 0.0f, 1, (Object) null);
        o.mo14918M(-483455358);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement.mo7631r();
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n);
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
        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        float f3 = (float) 8;
        C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f3)), o, 6);
        m103242c(R.string.account_notification_category_manage_news, o, 0);
        float f4 = (float) 24;
        C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f4)), o, 6);
        float f5 = (float) 16;
        C8767m m = PaddingKt.m10026m(aVar, C16483g.m74435M(f5), 0.0f, 2, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b3 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(m);
        float f7 = f3;
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
        C8592o b4 = Updater.m30180b(o);
        Updater.m30188j(b4, b3, companion.mo44588d());
        Updater.m30188j(b4, dVar2, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b4, c4Var2, companion.mo44590f());
        o.mo14972e();
        f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        int i9 = (i8 >> 12) & 112;
        int i10 = i9 | 8;
        m103248i(list3, lVar2, o, i10);
        C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f5)), o, 6);
        C37475b bVar = C37475b.f94185a;
        float f8 = f5;
        DividerKt.m13428a((C8767m) null, bVar.mo114206C(), 0.0f, 0.0f, o, 0, 13);
        C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f4)), o, 6);
        o.mo14918M(72806291);
        if (z2) {
            m103244e(list4, lVar2, o, i10);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(f8)), o, 6);
            DividerKt.m13428a((C8767m) null, bVar.mo114206C(), 0.0f, 0.0f, o, 0, 13);
        }
        o.mo15002m0();
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ConsentOptIn) obj).mo117326h() == ConsentName.OPTIN_FID_POST) {
                z4 = true;
                continue;
            } else {
                z4 = false;
                continue;
            }
            if (z4) {
                break;
            }
        }
        ConsentOptIn consentOptIn = (ConsentOptIn) obj;
        o.mo14918M(72806669);
        if (consentOptIn != null) {
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M(f8)), o, 6);
            m103243d(consentOptIn, lVar2, o, i10);
            C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M(f8)), o, 6);
            C11079d2 d2Var = C11079d2.f28267a;
        }
        o.mo15002m0();
        Iterable iterable = list3;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((ConsentOptIn) obj2).mo117326h() == ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        ConsentOptIn consentOptIn2 = (ConsentOptIn) obj2;
        o.mo14918M(72807093);
        if (consentOptIn2 == null) {
            i4 = 0;
            oVar2 = o;
            f = f7;
            i3 = 6;
            i2 = 1;
        } else {
            DividerKt.m13428a((C8767m) null, C37475b.f94185a.mo114206C(), 0.0f, 0.0f, o, 0, 13);
            C8767m.C8768a aVar4 = C8767m.f23478j;
            C2428y0.m10726a(SizeKt.m10115o(aVar4, C16483g.m74435M(f8)), o, 6);
            i3 = 6;
            f = f7;
            i2 = 1;
            i4 = 0;
            oVar2 = o;
            m103249j(consentOptIn2, str, R.string.consent_config_notification_personalized_advertisement, lVar, o, ((i8 >> 6) & 7168) | ((i8 >> 3) & 112) | 8);
            C2428y0.m10726a(SizeKt.m10115o(aVar4, C16483g.m74435M(f8)), oVar2, 6);
            C11079d2 d2Var2 = C11079d2.f28267a;
        }
        oVar2.mo15002m0();
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (((ConsentOptIn) obj3).mo117326h() == ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING) {
                i7 = i2;
                continue;
            } else {
                i7 = i4;
                continue;
            }
            if (i7 != 0) {
                break;
            }
        }
        ConsentOptIn consentOptIn3 = (ConsentOptIn) obj3;
        oVar2.mo14918M(72807697);
        if (consentOptIn3 == null) {
            i5 = i4;
            i6 = i3;
        } else {
            int i11 = i4;
            int i12 = i3;
            DividerKt.m13428a((C8767m) null, C37475b.f94185a.mo114206C(), 0.0f, 0.0f, oVar2, 0, 13);
            C8767m.C8768a aVar5 = C8767m.f23478j;
            C2428y0.m10726a(SizeKt.m10115o(aVar5, C16483g.m74435M(f8)), oVar2, i12);
            i6 = i12;
            i5 = i11;
            m103249j(consentOptIn3, str, R.string.consent_config_notification_allow_sharing_data_with_partners_part3, lVar, oVar2, ((i8 >> 3) & 112) | 8 | ((i8 >> 6) & 7168));
            C2428y0.m10726a(SizeKt.m10115o(aVar5, C16483g.m74435M(f8)), oVar2, i6);
            C11079d2 d2Var3 = C11079d2.f28267a;
        }
        oVar2.mo15002m0();
        C8767m.C8768a aVar6 = C8767m.f23478j;
        C2428y0.m10726a(SizeKt.m10115o(aVar6, C16483g.m74435M(f)), oVar2, i6);
        oVar2.mo15002m0();
        oVar2.mo14896D();
        oVar2.mo15002m0();
        oVar2.mo15002m0();
        m103242c(R.string.account_notification_category_notifications, oVar2, i5);
        m103245f(z, lVar2, oVar2, ((i8 >> 9) & 14) | i9);
        C2428y0.m10726a(SizeKt.m10115o(aVar6, C16483g.m74435M((float) 32)), oVar2, i6);
        oVar2.mo15002m0();
        oVar2.mo14896D();
        oVar2.mo15002m0();
        oVar2.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ConsentsOptinsComponentKt$ConsentsOptinsComponent$2(list, list2, str, z, z2, lVar, i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 16777215, showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m103247h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1765404907);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1765404907, i, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentPreview (ConsentsOptinsComponent.kt:421)");
            }
            ThemeKt.m153788a(ComposableSingletons$ConsentsOptinsComponentKt.f58508a.mo67403a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ConsentsOptinsComponentKt$ConsentsOptinsComponentPreview$1(i));
        }
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m103248i(List<ConsentOptIn> list, C11300l<? super C22934l, C11079d2> lVar, C8592o oVar, int i) {
        boolean z;
        boolean z2;
        List<ConsentOptIn> list2 = list;
        C11300l<? super C22934l, C11079d2> lVar2 = lVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1303500187);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1303500187, i2, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsPromosComponent (ConsentsOptinsComponent.kt:137)");
        }
        o.mo14918M(60622240);
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        o.mo14918M(60622275);
        int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
        try {
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_personalized_promos_part1_bold, o, 0));
            C11079d2 d2Var = C11079d2.f28267a;
            aVar.mo46710o(r);
            o.mo15002m0();
            aVar.mo46707l(" ");
            aVar.mo46707l(C16018i.m71858d(R.string.account_notification_personalized_promos_part2, o, 0));
            C16156d u = aVar.mo46716u();
            o.mo15002m0();
            C8592o oVar2 = o;
            TextKt.m14197d(u, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C37477d.m153887N()), oVar2, 0, 0, 131070);
            C8592o oVar3 = oVar2;
            C2428y0.m10726a(SizeKt.m10115o(C8767m.f23478j, C16483g.m74435M((float) 8)), oVar3, 6);
            Iterable iterable = list2;
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((ConsentOptIn) next).mo117326h() == ConsentName.OPTIN_CARREFOUR_EMAIL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            int i3 = 8 | ((i2 << 3) & 896);
            m103251l(arrayList, R.string.account_notification_type_email, lVar2, oVar3, i3);
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : iterable) {
                if (((ConsentOptIn) next2).mo117326h() == ConsentName.OPTIN_CARREFOUR_SMS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                m103251l(arrayList2, R.string.account_notification_type_sms, lVar2, oVar3, i3);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = oVar3.mo15020s();
            if (s != null) {
                s.mo15202a(new ConsentsOptinsComponentKt$ConsentsPromosComponent$3(list2, lVar2, i2));
            }
        } catch (Throwable th) {
            aVar.mo46710o(r);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103249j(com.carrefour.fid.android.domain.models.consent.ConsentOptIn r30, java.lang.String r31, int r32, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l, kotlin.C11079d2> r33, androidx.compose.runtime.C8592o r34, int r35) {
        /*
            r0 = r33
            r6 = r35
            r1 = 204543626(0xc31168a, float:1.3642367E-31)
            r2 = r34
            androidx.compose.runtime.o r2 = r2.mo15009o(r1)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0019
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.account.consent.ConsentsShareDataToPartnersComponent (ConsentsOptinsComponent.kt:227)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r6, r3, r4)
        L_0x0019:
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r3 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r8, r3, r1, r4, r5)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r1, r3, r4, r5)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r3 = r3.mo7628l()
            androidx.compose.ui.c$a r7 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r7 = r7.mo17070q()
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r9)
            r9 = 54
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r7, r2, r9)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r2.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.platform.c4 r10 = (androidx.compose.p004ui.platform.C15863c4) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r11.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r13 = r2.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x007e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x007e:
            r2.mo14938T()
            boolean r13 = r2.mo14997l()
            if (r13 == 0) goto L_0x008b
            r2.mo14947W(r12)
            goto L_0x008e
        L_0x008b:
            r2.mo14888A()
        L_0x008e:
            r2.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r13 = r11.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r3, r13)
            kotlin.jvm.functions.p r3 = r11.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r3)
            kotlin.jvm.functions.p r3 = r11.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r3)
            kotlin.jvm.functions.p r3 = r11.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r3)
            r2.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r1.invoke(r3, r2, r9)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r3 = 1007654232(0x3c0f9558, float:0.008763634)
            r2.mo14918M(r3)
            androidx.compose.ui.text.d$a r3 = new androidx.compose.ui.text.d$a
            r3.<init>(r7, r4, r5)
            r4 = 2131952301(0x7f1302ad, float:1.954104E38)
            java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r4, r2, r7)
            r3.mo46707l(r4)
            java.lang.String r4 = " "
            r3.mo46707l(r4)
            r4 = 1007654408(0x3c0f9608, float:0.008763798)
            r2.mo14918M(r4)
            androidx.compose.ui.text.font.i0$a r4 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r14 = r4.mo46947c()
            androidx.compose.ui.text.style.j$a r4 = androidx.compose.p004ui.text.style.C16434j.f40726b
            androidx.compose.ui.text.style.j r26 = r4.mo47683f()
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r4.mo114218O()
            androidx.compose.ui.text.c0 r5 = new androidx.compose.ui.text.c0
            r9 = r5
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 12282(0x2ffa, float:1.7211E-41)
            r29 = 0
            r9.<init>((long) r10, (long) r12, (androidx.compose.p004ui.text.font.C16209i0) r14, (androidx.compose.p004ui.text.font.C16190e0) r15, (androidx.compose.p004ui.text.font.C16194f0) r16, (androidx.compose.p004ui.text.font.C16242u) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p004ui.text.style.C16410a) r21, (androidx.compose.p004ui.text.style.C16439m) r22, (androidx.compose.p004ui.text.intl.C16342f) r23, (long) r24, (androidx.compose.p004ui.text.style.C16434j) r26, (androidx.compose.p004ui.graphics.C15205e4) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            int r5 = r3.mo46713r(r5)
            java.lang.String r9 = "PartnersClickTag"
            r15 = r31
            r3.mo46711p(r9, r15)     // Catch:{ all -> 0x0207 }
            r9 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r7 = androidx.compose.p004ui.res.C16018i.m71858d(r9, r2, r7)     // Catch:{ all -> 0x0207 }
            r3.mo46707l(r7)     // Catch:{ all -> 0x0207 }
            r3.mo46709n()     // Catch:{ all -> 0x0207 }
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0207 }
            r3.mo46710o(r5)
            r2.mo15002m0()
            int r5 = r6 >> 6
            r5 = r5 & 14
            r14 = r32
            java.lang.String r5 = androidx.compose.p004ui.res.C16018i.m71858d(r14, r2, r5)
            r3.mo46707l(r5)
            androidx.compose.ui.text.d r3 = r3.mo46716u()
            r2.mo15002m0()
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 2
            r12 = 0
            r7 = r1
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.C2411u0.m10660e(r7, r8, r9, r10, r11, r12)
            androidx.compose.material.w1 r1 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r9 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r1)
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.mo14918M(r1)
            boolean r1 = r2.mo15006n0(r3)
            boolean r5 = r2.mo15006n0(r0)
            r1 = r1 | r5
            java.lang.Object r5 = r2.mo14921N()
            if (r1 != 0) goto L_0x0183
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r5 != r1) goto L_0x018b
        L_0x0183:
            com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$1$1$1 r5 = new com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$1$1$1
            r5.<init>(r3, r0)
            r2.mo14893C(r5)
        L_0x018b:
            r2.mo15002m0()
            r1 = r5
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            r16 = 0
            r17 = 120(0x78, float:1.68E-43)
            r7 = r3
            r14 = r1
            r15 = r2
            androidx.compose.foundation.text.ClickableTextKt.m12220b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.material.q1 r7 = androidx.compose.material.C7903q1.f18967a
            long r8 = r4.mo114218O()
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r27 = 0
            int r28 = androidx.compose.material.C7903q1.f18968b
            r29 = 1022(0x3fe, float:1.432E-42)
            r26 = r2
            androidx.compose.material.p1 r12 = r7.mo10989a(r8, r10, r12, r13, r15, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r1 = r30.mo117324f()
            boolean r7 = r1.mo117315r()
            com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$1$2 r8 = new com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$1$2
            r3 = r30
            r8.<init>(r0, r3)
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 28
            r13 = r2
            androidx.compose.material.SwitchKt.m14058a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01ec
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01ec:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x01f3
            goto L_0x0206
        L_0x01f3:
            com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$2 r8 = new com.carrefour.fid.android.presentation.ui.account.consent.ConsentsOptinsComponentKt$ConsentsShareDataToPartnersComponent$2
            r1 = r8
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r35
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0206:
            return
        L_0x0207:
            r0 = move-exception
            r3.mo46710o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.consent.ConsentsOptinsComponentKt.m103249j(com.carrefour.fid.android.domain.models.consent.ConsentOptIn, java.lang.String, int, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m103250k(ConsentOptIn consentOptIn, @C0324b1 int i, C11300l<? super C22934l, C11079d2> lVar, C8592o oVar, int i2) {
        C8592o o = oVar.mo15009o(1814070098);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1814070098, i2, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ToComponent (ConsentsOptinsComponent.kt:385)");
        }
        m103240a(i, consentOptIn.mo117324f().mo117315r(), new ConsentsOptinsComponentKt$ToComponent$1(lVar, consentOptIn), o, (i2 >> 3) & 14);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ConsentsOptinsComponentKt$ToComponent$2(consentOptIn, i, lVar, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m103251l(List<ConsentOptIn> list, @C0324b1 int i, C11300l<? super C22934l, C11079d2> lVar, C8592o oVar, int i2) {
        C8592o o = oVar.mo15009o(-664033294);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-664033294, i2, -1, "com.carrefour.fid.android.presentation.ui.account.consent.ToComponent (ConsentsOptinsComponent.kt:402)");
        }
        Iterable iterable = list;
        boolean z = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((ConsentOptIn) it.next()).mo117324f().mo117315r()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        m103240a(i, !z, new ConsentsOptinsComponentKt$ToComponent$4(lVar, list), o, (i2 >> 3) & 14);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ConsentsOptinsComponentKt$ToComponent$5(list, i, lVar, i2));
        }
    }
}
