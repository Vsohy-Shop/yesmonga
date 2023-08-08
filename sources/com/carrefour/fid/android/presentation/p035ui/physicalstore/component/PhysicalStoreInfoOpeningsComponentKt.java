package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import android.content.Context;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
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
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.components.widgets.C37399s1;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.ServiceUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreInfoOpeningsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoOpeningsComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreInfoOpeningsComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,480:1\n74#2,6:481\n80#2:513\n84#2:606\n74#2,6:607\n80#2:639\n84#2:644\n74#2,6:771\n80#2:803\n84#2:809\n75#3:487\n76#3,11:489\n75#3:521\n76#3,11:523\n89#3:553\n75#3:561\n76#3,11:563\n89#3:600\n89#3:605\n75#3:613\n76#3,11:615\n89#3:643\n75#3:653\n76#3,11:655\n89#3:686\n75#3:694\n76#3,11:696\n89#3:726\n75#3:742\n76#3,11:744\n75#3:777\n76#3,11:779\n89#3:808\n89#3:813\n76#4:488\n76#4:522\n76#4:562\n76#4:614\n76#4:654\n76#4:695\n76#4:743\n76#4:778\n76#4:815\n460#5,13:500\n460#5,13:534\n473#5,3:550\n460#5,13:574\n36#5:590\n473#5,3:597\n473#5,3:602\n460#5,13:626\n473#5,3:640\n460#5,13:666\n473#5,3:683\n460#5,13:707\n473#5,3:723\n460#5,13:755\n460#5,13:790\n473#5,3:805\n473#5,3:810\n74#6,7:514\n81#6:547\n85#6:554\n75#6,6:555\n81#6:587\n85#6:601\n75#6,6:647\n81#6:679\n85#6:687\n75#6,6:688\n81#6:720\n85#6:727\n75#6,6:736\n81#6:768\n85#6:814\n154#7:548\n154#7:549\n154#7:588\n154#7:589\n154#7:645\n154#7:646\n154#7:680\n154#7:681\n154#7:682\n154#7:721\n154#7:722\n154#7:734\n154#7:735\n154#7:769\n154#7:770\n154#7:804\n1114#8,6:591\n766#9:728\n857#9,2:729\n766#9:731\n857#9,2:732\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoOpeningsComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreInfoOpeningsComponentKt\n*L\n62#1:481,6\n62#1:513\n62#1:606\n122#1:607,6\n122#1:639\n122#1:644\n293#1:771,6\n293#1:803\n293#1:809\n62#1:487\n62#1:489,11\n63#1:521\n63#1:523,11\n63#1:553\n79#1:561\n79#1:563,11\n79#1:600\n62#1:605\n122#1:613\n122#1:615,11\n122#1:643\n150#1:653\n150#1:655,11\n150#1:686\n187#1:694\n187#1:696,11\n187#1:726\n285#1:742\n285#1:744,11\n293#1:777\n293#1:779,11\n293#1:808\n285#1:813\n62#1:488\n63#1:522\n79#1:562\n122#1:614\n150#1:654\n187#1:695\n285#1:743\n293#1:778\n351#1:815\n62#1:500,13\n63#1:534,13\n63#1:550,3\n79#1:574,13\n89#1:590\n79#1:597,3\n62#1:602,3\n122#1:626,13\n122#1:640,3\n150#1:666,13\n150#1:683,3\n187#1:707,13\n187#1:723,3\n285#1:755,13\n293#1:790,13\n293#1:805,3\n285#1:810,3\n63#1:514,7\n63#1:547\n63#1:554\n79#1:555,6\n79#1:587\n79#1:601\n150#1:647,6\n150#1:679\n150#1:687\n187#1:688,6\n187#1:720\n187#1:727\n285#1:736,6\n285#1:768\n285#1:814\n66#1:548\n67#1:549\n84#1:588\n88#1:589\n153#1:645\n155#1:646\n161#1:680\n167#1:681\n168#1:682\n190#1:721\n191#1:722\n211#1:734\n212#1:735\n288#1:769\n289#1:770\n298#1:804\n89#1:591,6\n206#1:728\n206#1:729,2\n207#1:731\n207#1:732,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt */
public final class PhysicalStoreInfoOpeningsComponentKt {
    @C12579k

    /* renamed from: a */
    public static final String f62512a = "1";

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109604a(C8767m mVar, @C0375v int i, @C0324b1 int i2, List<C38154g> list, C8592o oVar, int i3, int i4) {
        C8767m.C8768a aVar;
        int i5;
        int i6;
        int i7;
        int i8;
        C8592o o = oVar.mo15009o(-583022165);
        if ((i4 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i4 & 2) != 0) {
            i6 = i3 & -113;
            i5 = R.drawable.dot_green;
        } else {
            i5 = i;
            i6 = i3;
        }
        if ((i4 & 4) != 0) {
            i8 = i6 & -897;
            i7 = R.string.store_exceptional_opening_title;
        } else {
            i7 = i2;
            i8 = i6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-583022165, i8, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.HoursBlockComponent (PhysicalStoreInfoOpeningsComponent.kt:278)");
        }
        int i9 = i8 & 14;
        o.mo14918M(693286680);
        Arrangement arrangement = Arrangement.f6010a;
        Arrangement.C2269d p = arrangement.mo7630p();
        C8734c.C8735a aVar2 = C8734c.f23406a;
        int i10 = i9 >> 3;
        C15560f0 d = RowKt.m10071d(p, aVar2.mo17073w(), o, (i10 & 112) | (i10 & 14));
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
        int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
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
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i11 >> 3) & 112));
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        C8767m.C8768a aVar3 = C8767m.f23478j;
        float f2 = (float) 8;
        float f3 = f2;
        C8767m.C8768a aVar4 = aVar3;
        ImageKt.m8967b(C16015f.m71849d(i5, o, (i8 >> 3) & 14), (String) null, SizeKt.m10087C(PaddingKt.m10024k(aVar3, C16483g.m74435M(f2)), C16483g.m74435M(f2)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
        C8767m e = C2411u0.m10660e(rowScopeInstance, aVar4, 1.0f, false, 2, (Object) null);
        o.mo14918M(-483455358);
        C15560f0 b2 = ColumnKt.m9863b(arrangement.mo7631r(), aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(e);
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
        Updater.m30188j(b3, b2, companion.mo44588d());
        Updater.m30188j(b3, dVar2, companion.mo44586b());
        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b3, c4Var2, companion.mo44590f());
        o.mo14972e();
        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        String d2 = C16018i.m71858d(i7, o, (i8 >> 6) & 14);
        C16209i0 c = C16209i0.f40292b.mo46947c();
        int i12 = i7;
        C8592o oVar2 = o;
        int i13 = i5;
        TextKt.m14196c(d2, PaddingKt.m10028o(aVar4, 0.0f, 0.0f, 0.0f, C16483g.m74435M(f3), 7, (Object) null), 0, C16506u.m74712m(12), (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 199728, 0, 131028);
        C8592o oVar3 = oVar2;
        oVar3.mo14918M(-227474509);
        for (C38154g i14 : list) {
            C8592o oVar4 = oVar3;
            TextKt.m14196c(C28932h.f70914a.mo84246p(i14.mo119299i(), C28932h.f70924k), (C8767m) null, 0, C16506u.m74712m(12), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar4, 3072, 0, 131062);
            oVar3 = oVar4;
        }
        C8592o oVar5 = oVar3;
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        oVar5.mo14896D();
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        oVar5.mo14896D();
        oVar5.mo15002m0();
        oVar5.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar5.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoOpeningsComponentKt$HoursBlockComponent$2(aVar, i13, i12, list, i3, i4));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109605b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(73671850);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(73671850, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsClosingOnlyComponentPreview (PhysicalStoreInfoOpeningsComponent.kt:438)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73949f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25362xc9d4273d(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109606c(@C12580l C8767m mVar, boolean z, @C12579k List<C38154g> list, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        boolean z2;
        List<C38154g> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "openings");
        C8592o o = oVar.mo15009o(6910312);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(6910312, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsComponent (PhysicalStoreInfoOpeningsComponent.kt:200)");
        } else {
            int i3 = i;
        }
        Iterable iterable = list2;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (Intrinsics.areEqual((Object) ((C38154g) next).mo119302l(), (Object) "1")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (!Intrinsics.areEqual((Object) ((C38154g) next2).mo119302l(), (Object) "1")) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
            float f = (float) 8;
            boolean z3 = z2;
            SurfaceKt.m13879b(SizeKt.m10114n(mVar2, 0.0f, 1, (Object) null), C2694o.m12166h(C16483g.m74435M(f)), 0, 0, (C2223i) null, C16483g.m74435M(f), C8553b.m31048b(o, -1052118620, true, new C25364xd99384cf(z2, arrayList, arrayList2)), o, 1769472, 28);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new C25365xd99384d0(mVar2, z3, list, i, i2));
                return;
            }
            return;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new C25363xd99384ce(mVar2, z2, list, i, i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109607d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(986788313);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(986788313, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsComponentPreview (PhysicalStoreInfoOpeningsComponent.kt:411)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73947d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25366x77a1ad4(i));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m109608e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(227755759);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(227755759, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsComponentVerticalPreview (PhysicalStoreInfoOpeningsComponent.kt:424)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73948e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25367xa3bce8fe(i));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m109609f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1852050163);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1852050163, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreExceptionalOpeningsOnlyComponentPreview (PhysicalStoreInfoOpeningsComponent.kt:450)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73950g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25368x2da705a0(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109610g(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r40, @org.jetbrains.annotations.C12579k java.lang.String r41, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.widgets.C37396r1 r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45, int r46) {
        /*
            r2 = r41
            r10 = r42
            r11 = r43
            r12 = r45
            java.lang.String r0 = "storeBanner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "storeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onSeeOpeningsClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1141563463(0x440ae047, float:555.50433)
            r1 = r44
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r46 & 1
            if (r3 == 0) goto L_0x002a
            r4 = r12 | 6
            r5 = r4
            r4 = r40
            goto L_0x003e
        L_0x002a:
            r4 = r12 & 14
            if (r4 != 0) goto L_0x003b
            r4 = r40
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0038
            r5 = 4
            goto L_0x0039
        L_0x0038:
            r5 = 2
        L_0x0039:
            r5 = r5 | r12
            goto L_0x003e
        L_0x003b:
            r4 = r40
            r5 = r12
        L_0x003e:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0045
            r5 = r5 | 48
            goto L_0x0055
        L_0x0045:
            r6 = r12 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0055
            boolean r6 = r1.mo15006n0(r2)
            if (r6 == 0) goto L_0x0052
            r6 = 32
            goto L_0x0054
        L_0x0052:
            r6 = 16
        L_0x0054:
            r5 = r5 | r6
        L_0x0055:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x005c
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006c
            boolean r6 = r1.mo15006n0(r10)
            if (r6 == 0) goto L_0x0069
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r5 = r5 | r6
        L_0x006c:
            r6 = r46 & 8
            if (r6 == 0) goto L_0x0073
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r6 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0083
            boolean r6 = r1.mo14927P(r11)
            if (r6 == 0) goto L_0x0080
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r5 = r5 | r6
        L_0x0083:
            r6 = r5 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0095
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r1.mo14958a0()
            goto L_0x03c7
        L_0x0095:
            if (r3 == 0) goto L_0x009c
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r38 = r3
            goto L_0x009e
        L_0x009c:
            r38 = r4
        L_0x009e:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00aa
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpenings (PhysicalStoreInfoOpeningsComponent.kt:55)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r3, r4)
        L_0x00aa:
            r0 = r5 & 14
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r3.mo7631r()
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r9 = r6.mo17072u()
            int r13 = r0 >> 3
            r14 = r13 & 14
            r13 = r13 & 112(0x70, float:1.57E-43)
            r13 = r13 | r14
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r9, r1, r13)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r1.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r39 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r39.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r38)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 6
            androidx.compose.runtime.d r9 = r1.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x010c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x010c:
            r1.mo14938T()
            boolean r9 = r1.mo14997l()
            if (r9 == 0) goto L_0x0119
            r1.mo14947W(r8)
            goto L_0x011c
        L_0x0119:
            r1.mo14888A()
        L_0x011c:
            r1.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r9 = r39.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r9)
            kotlin.jvm.functions.p r4 = r39.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r13, r4)
            kotlin.jvm.functions.p r4 = r39.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r14, r4)
            kotlin.jvm.functions.p r4 = r39.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r15, r4)
            r1.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            int r0 = r0 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r4, r1, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$c r4 = r6.mo17070q()
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r7)
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement$d r9 = r3.mo7630p()
            r15 = 48
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r4, r1, r15)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r15 = r39.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r8)
            androidx.compose.runtime.d r0 = r1.mo15017r()
            boolean r0 = r0 instanceof androidx.compose.runtime.C8428d
            if (r0 != 0) goto L_0x01aa
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01aa:
            r1.mo14938T()
            boolean r0 = r1.mo14997l()
            if (r0 == 0) goto L_0x01b7
            r1.mo14947W(r15)
            goto L_0x01ba
        L_0x01b7:
            r1.mo14888A()
        L_0x01ba:
            r1.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r39.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r4, r15)
            kotlin.jvm.functions.p r4 = r39.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r9, r4)
            kotlin.jvm.functions.p r4 = r39.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r13, r4)
            kotlin.jvm.functions.p r4 = r39.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r14, r4)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r4 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r7.invoke(r0, r1, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r7 = 32
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.SizeKt.m10087C(r8, r7)
            r19 = 0
            r20 = 0
            r7 = 8
            float r7 = (float) r7
            float r21 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r22 = 0
            r23 = 11
            r24 = 0
            androidx.compose.ui.m r15 = androidx.compose.foundation.layout.PaddingKt.m10028o(r18, r19, r20, r21, r22, r23, r24)
            int r7 = m109626w(r41)
            androidx.compose.ui.graphics.painter.Painter r13 = androidx.compose.p004ui.res.C16015f.m71849d(r7, r1, r4)
            r14 = 0
            r16 = 0
            r7 = 0
            r18 = 0
            r19 = 0
            r21 = 440(0x1b8, float:6.17E-43)
            r22 = 120(0x78, float:1.68E-43)
            r9 = 48
            r17 = r7
            r20 = r1
            androidx.compose.foundation.ImageKt.m8967b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r13 = r42.mo113983f()
            androidx.compose.ui.text.font.i0$a r7 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r20 = r7.mo46947c()
            androidx.compose.material.t0 r7 = androidx.compose.material.C7933t0.f19075a
            int r14 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r7 = r7.mo11077c(r1, r14)
            androidx.compose.ui.text.p0 r33 = r7.mo11096i()
            r7 = 18
            long r17 = androidx.compose.p004ui.unit.C16506u.m74712m(r7)
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 199680(0x30c00, float:2.79811E-40)
            r36 = 0
            r37 = 65494(0xffd6, float:9.1777E-41)
            r34 = r1
            androidx.compose.material.TextKt.m14196c(r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            androidx.compose.ui.c$c r6 = r6.mo17062a()
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.layout.SizeKt.m10114n(r8, r13, r14, r15)
            r13 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r13)
            androidx.compose.foundation.layout.Arrangement$d r3 = r3.mo7630p()
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r6, r1, r9)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r1.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r1.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p004ui.unit.LayoutDirection) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r1.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            kotlin.jvm.functions.a r15 = r39.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r7)
            androidx.compose.runtime.d r9 = r1.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x02cf
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02cf:
            r1.mo14938T()
            boolean r9 = r1.mo14997l()
            if (r9 == 0) goto L_0x02dc
            r1.mo14947W(r15)
            goto L_0x02df
        L_0x02dc:
            r1.mo14888A()
        L_0x02df:
            r1.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r39.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r3, r15)
            kotlin.jvm.functions.p r3 = r39.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r3)
            kotlin.jvm.functions.p r3 = r39.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r13, r3)
            kotlin.jvm.functions.p r3 = r39.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r14, r3)
            r1.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.invoke(r3, r1, r4)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r3)
            r3 = 14
            long r6 = androidx.compose.p004ui.unit.C16506u.m74712m(r3)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 2
            r22 = 0
            r17 = r0
            r18 = r8
            androidx.compose.ui.m r25 = androidx.compose.foundation.layout.C2411u0.m10660e(r17, r18, r19, r20, r21, r22)
            r26 = 0
            r27 = 0
            r28 = 0
            r0 = 16
            float r0 = (float) r0
            float r29 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r30 = 7
            r31 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r25, r26, r27, r28, r29, r30, r31)
            int r4 = com.carrefour.fid.android.design.components.widgets.C37396r1.f93965d
            int r4 = r4 << 6
            r8 = 48
            r4 = r4 | r8
            r5 = r5 & 896(0x380, float:1.256E-42)
            r8 = r4 | r5
            r9 = 0
            r4 = r6
            r6 = r42
            r7 = r1
            com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreOpeningsTextKt.m109642d(r3, r4, r6, r7, r8, r9)
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.foundation.layout.i0 r21 = androidx.compose.foundation.layout.PaddingKt.m10016c(r4, r0, r5, r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.mo14918M(r0)
            boolean r0 = r1.mo15006n0(r11)
            java.lang.Object r3 = r1.mo14921N()
            if (r0 != 0) goto L_0x037b
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x0383
        L_0x037b:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreInfoOpenings$1$2$1$1 r3 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreInfoOpenings$1$2$1$1
            r3.<init>(r11)
            r1.mo14893C(r3)
        L_0x0383:
            r1.mo15002m0()
            r13 = r3
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.presentation.ui.physicalstore.component.ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt r0 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a
            kotlin.jvm.functions.q r22 = r0.mo73944a()
            r24 = 905969664(0x36000000, float:1.9073486E-6)
            r25 = 254(0xfe, float:3.56E-43)
            r23 = r1
            androidx.compose.material.ButtonKt.m13346d(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03c5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03c5:
            r4 = r38
        L_0x03c7:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x03ce
            goto L_0x03e2
        L_0x03ce:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreInfoOpenings$2 r8 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreInfoOpenings$2
            r0 = r8
            r1 = r4
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt.m109610g(androidx.compose.ui.m, java.lang.String, com.carrefour.fid.android.design.components.widgets.r1, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m109611h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1863021434);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1863021434, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsPreview (PhysicalStoreInfoOpeningsComponent.kt:462)");
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 857374845, true, new C25370x8553d093(new C37396r1("Express Pasteur Antony", Boolean.FALSE, new C37399s1(new Date(), new Date())))), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25372x8553d094(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109612i(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, long r42, @org.jetbrains.annotations.C12579k java.lang.String r44, @org.jetbrains.annotations.C12579k java.lang.String r45, boolean r46, boolean r47, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r48, int r49, int r50) {
        /*
            r7 = r44
            r4 = r45
            r5 = r49
            java.lang.String r0 = "day"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "openings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -76326311(0xfffffffffb735a59, float:-1.2635606E36)
            r1 = r48
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r50 & 1
            if (r1 == 0) goto L_0x0023
            r2 = r5 | 6
            r3 = r2
            r2 = r41
            goto L_0x0037
        L_0x0023:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x0034
            r2 = r41
            boolean r3 = r15.mo15006n0(r2)
            if (r3 == 0) goto L_0x0031
            r3 = 4
            goto L_0x0032
        L_0x0031:
            r3 = 2
        L_0x0032:
            r3 = r3 | r5
            goto L_0x0037
        L_0x0034:
            r2 = r41
            r3 = r5
        L_0x0037:
            r6 = r50 & 2
            if (r6 == 0) goto L_0x0040
            r3 = r3 | 48
            r13 = r42
            goto L_0x0052
        L_0x0040:
            r6 = r5 & 112(0x70, float:1.57E-43)
            r13 = r42
            if (r6 != 0) goto L_0x0052
            boolean r6 = r15.mo14980g(r13)
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r3 = r3 | r6
        L_0x0052:
            r6 = r50 & 4
            if (r6 == 0) goto L_0x0059
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r6 = r5 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0069
            boolean r6 = r15.mo15006n0(r7)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r6
        L_0x0069:
            r6 = r50 & 8
            if (r6 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r6 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0080
            boolean r6 = r15.mo15006n0(r4)
            if (r6 == 0) goto L_0x007d
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r6
        L_0x0080:
            r6 = r50 & 16
            if (r6 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0087:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r5
            if (r9 != 0) goto L_0x009c
            r9 = r46
            boolean r10 = r15.mo14961b(r9)
            if (r10 == 0) goto L_0x0098
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r3 = r3 | r10
            goto L_0x009e
        L_0x009c:
            r9 = r46
        L_0x009e:
            r10 = r50 & 32
            if (r10 == 0) goto L_0x00a6
            r11 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r11
            goto L_0x00ba
        L_0x00a6:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r5
            if (r11 != 0) goto L_0x00ba
            r11 = r47
            boolean r12 = r15.mo14961b(r11)
            if (r12 == 0) goto L_0x00b6
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r12
            goto L_0x00bc
        L_0x00ba:
            r11 = r47
        L_0x00bc:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r3
            r8 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r8) goto L_0x00d6
            boolean r8 = r15.mo15011p()
            if (r8 != 0) goto L_0x00cc
            goto L_0x00d6
        L_0x00cc:
            r15.mo14958a0()
            r1 = r2
            r6 = r9
            r7 = r11
            r27 = r15
            goto L_0x02d1
        L_0x00d6:
            if (r1 == 0) goto L_0x00dc
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r8 = r1
            goto L_0x00dd
        L_0x00dc:
            r8 = r2
        L_0x00dd:
            r2 = 0
            if (r6 == 0) goto L_0x00e3
            r25 = r2
            goto L_0x00e5
        L_0x00e3:
            r25 = r9
        L_0x00e5:
            if (r10 == 0) goto L_0x00ea
            r26 = r2
            goto L_0x00ec
        L_0x00ea:
            r26 = r11
        L_0x00ec:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00f8
            r1 = -1
            java.lang.String r6 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsItem (PhysicalStoreInfoOpeningsComponent.kt:141)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r1, r6)
        L_0x00f8:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            r1 = 8
            float r6 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            androidx.compose.foundation.shape.n r1 = androidx.compose.foundation.shape.C2694o.m12166h(r1)
            androidx.compose.ui.m r9 = androidx.compose.p004ui.draw.C8744d.m32514a(r8, r1)
            r12 = 0
            r1 = 2
            r16 = 0
            r10 = r42
            r13 = r1
            r14 = r16
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r9, r10, r12, r13, r14)
            r9 = 16
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r9)
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r9 = r9.mo7630p()
            r10 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r0, r15, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r15.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r15.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r15.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r13 = r12.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r14 = r15.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x0170
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0170:
            r15.mo14938T()
            boolean r14 = r15.mo14997l()
            if (r14 == 0) goto L_0x017d
            r15.mo14947W(r13)
            goto L_0x0180
        L_0x017d:
            r15.mo14888A()
        L_0x0180:
            r15.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r14 = r12.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r0, r14)
            kotlin.jvm.functions.p r0 = r12.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r0)
            kotlin.jvm.functions.p r0 = r12.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r10, r0)
            kotlin.jvm.functions.p r0 = r12.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r0)
            r15.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0, r15, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r27 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r28 = 14
            long r29 = androidx.compose.p004ui.unit.C16506u.m74712m(r28)
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            if (r26 == 0) goto L_0x01cc
            androidx.compose.ui.text.font.i0 r0 = r0.mo46947c()
            goto L_0x01d0
        L_0x01cc:
            androidx.compose.ui.text.font.i0 r0 = r0.mo46952m()
        L_0x01d0:
            r21 = r0
            androidx.compose.ui.m$a r38 = androidx.compose.p004ui.C8767m.f23478j
            r32 = 0
            r33 = 0
            float r34 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r35 = 0
            r36 = 11
            r37 = 0
            r31 = r38
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r31, r32, r33, r34, r35, r36, r37)
            r9 = 0
            r0 = r2
            r39 = r3
            r2 = r9
            r9 = 0
            r31 = r6
            r6 = r9
            r40 = r8
            r8 = r9
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r41 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            int r22 = r39 >> 6
            r0 = r22 & 14
            r0 = r0 | 3120(0xc30, float:4.372E-42)
            r22 = r0
            r23 = 0
            r24 = 131028(0x1ffd4, float:1.8361E-40)
            r0 = r44
            r4 = r29
            r7 = r21
            r21 = r41
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -1797898610(0xffffffff94d63e8e, float:-2.1633151E-26)
            r15 = r41
            r15.mo14918M(r0)
            if (r25 == 0) goto L_0x025f
            r32 = 0
            r33 = 0
            float r34 = androidx.compose.p004ui.unit.C16483g.m74435M(r31)
            r35 = 0
            r36 = 11
            r37 = 0
            r31 = r38
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r31, r32, r33, r34, r35, r36, r37)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r0, r1)
            r0 = 2131231501(0x7f08030d, float:1.8079085E38)
            r1 = 0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r15, r1)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 440(0x1b8, float:6.17E-43)
            r10 = 120(0x78, float:1.68E-43)
            r8 = r15
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x025f:
            r15.mo15002m0()
            long r4 = androidx.compose.p004ui.unit.C16506u.m74712m(r28)
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r27
            r17 = r40
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.C2411u0.m10660e(r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.style.i$a r0 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r0 = r0.mo47668b()
            if (r26 == 0) goto L_0x0285
            androidx.compose.ui.text.font.i0$a r2 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r2 = r2.mo46947c()
            goto L_0x0286
        L_0x0285:
            r2 = 0
        L_0x0286:
            r7 = r2
            r2 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            androidx.compose.ui.text.style.i r12 = androidx.compose.p004ui.text.style.C16432i.m74172g(r0)
            r13 = 0
            r0 = 0
            r27 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            int r0 = r39 >> 9
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r22 = r0
            r23 = 0
            r24 = 130516(0x1fdd4, float:1.82892E-40)
            r0 = r45
            r21 = r27
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r27.mo15002m0()
            r27.mo14896D()
            r27.mo15002m0()
            r27.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02cb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02cb:
            r6 = r25
            r7 = r26
            r1 = r40
        L_0x02d1:
            androidx.compose.runtime.t1 r10 = r27.mo15020s()
            if (r10 != 0) goto L_0x02d8
            goto L_0x02eb
        L_0x02d8:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreOpeningsItem$2 r11 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$PhysicalStoreOpeningsItem$2
            r0 = r11
            r2 = r42
            r4 = r44
            r5 = r45
            r8 = r49
            r9 = r50
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt.m109612i(androidx.compose.ui.m, long, java.lang.String, java.lang.String, boolean, boolean, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m109613j(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-950679649);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-950679649, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsItemPreview (PhysicalStoreInfoOpeningsComponent.kt:364)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73945b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25373x1360934e(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m109614k(@C12580l C8767m mVar, @C12579k C38163l lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        List<Boolean> list;
        List<Boolean> list2;
        List<C38147b> list3;
        List<C38147b> list4;
        List<C38147b> list5;
        List<C38147b> list6;
        List<C38147b> list7;
        List<C38147b> list8;
        List<C38147b> list9;
        long j;
        boolean z;
        C38163l lVar2 = lVar;
        int i3 = i;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(lVar2, "store");
        C8592o o = oVar.mo15009o(2013213521);
        if ((i4 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2013213521, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreOpeningsWeekly (PhysicalStoreInfoOpeningsComponent.kt:101)");
        }
        StoreService storeService = (StoreService) CollectionsKt___CollectionsKt.m40479B2(lVar.mo119367K());
        if (storeService != null) {
            list = storeService.mo119172P();
        } else {
            list = null;
        }
        if (list == null || list.size() <= 6) {
            Boolean bool = Boolean.FALSE;
            list2 = CollectionsKt__CollectionsKt.m40448L(bool, bool, bool, bool, bool, bool, bool);
        } else {
            StoreService storeService2 = (StoreService) CollectionsKt___CollectionsKt.m40479B2(lVar.mo119367K());
            if (storeService2 != null) {
                list2 = storeService2.mo119172P();
            } else {
                list2 = null;
            }
        }
        String[] c = C16018i.m71857c(R.array.days_of_the_week, o, 0);
        C38157h l = ServiceUtil.f70805a.mo84130l(lVar2);
        String[] strArr = new String[7];
        if (l != null) {
            list3 = l.mo119324q();
        } else {
            list3 = null;
        }
        strArr[0] = m109625v(list3, o, 8);
        if (l != null) {
            list4 = l.mo119330v();
        } else {
            list4 = null;
        }
        strArr[1] = m109625v(list4, o, 8);
        if (l != null) {
            list5 = l.mo119331w();
        } else {
            list5 = null;
        }
        strArr[2] = m109625v(list5, o, 8);
        if (l != null) {
            list6 = l.mo119329u();
        } else {
            list6 = null;
        }
        strArr[3] = m109625v(list6, o, 8);
        if (l != null) {
            list7 = l.mo119323p();
        } else {
            list7 = null;
        }
        strArr[4] = m109625v(list7, o, 8);
        if (l != null) {
            list8 = l.mo119326s();
        } else {
            list8 = null;
        }
        strArr[5] = m109625v(list8, o, 8);
        if (l != null) {
            list9 = l.mo119327t();
        } else {
            list9 = null;
        }
        strArr[6] = m109625v(list9, o, 8);
        List L = CollectionsKt__CollectionsKt.m40448L(strArr);
        int i5 = i3 & 14;
        o.mo14918M(-483455358);
        int i6 = i5 >> 3;
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i6 & 112) | (i6 & 14));
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
        int i7 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
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
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i7 >> 3) & 112));
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        o.mo14918M(562249805);
        int i8 = 0;
        for (int i9 = 7; i8 < i9; i9 = i9) {
            String str = c[i8];
            if (i8 % 2 == 0) {
                j = C37475b.f94185a.mo114208E();
            } else {
                j = C37475b.f94185a.mo114231a0();
            }
            long j2 = j;
            String str2 = (String) L.get(i8);
            boolean x = m109627x(i8);
            if (list2 != null) {
                z = list2.get(i8).booleanValue();
            } else {
                z = false;
            }
            m109612i((C8767m) null, j2, str, str2, z, x, o, 0, 1);
            i8++;
            L = L;
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25374x6d58c683(aVar, lVar2, i3, i4));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m109615l(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5 = i;
        int i6 = i2;
        C8592o o = oVar.mo15009o(27284217);
        int i7 = i6 & 1;
        if (i7 != 0) {
            i3 = i5 | 6;
            mVar2 = mVar;
        } else if ((i5 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i5;
        } else {
            mVar2 = mVar;
            i3 = i5;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i7 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(27284217, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePassInfo (PhysicalStoreInfoOpeningsComponent.kt:185)");
            }
            int i8 = i3 & 14;
            o.mo14918M(693286680);
            int i9 = i8 >> 3;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, (i9 & 112) | (i9 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_icon_carte_pass, o, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 8), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24)), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 440, 120);
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(R.string.pass_info, o, 0), (C8767m) null, 0, C16506u.m74712m(12), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar2, 3072, 0, 131062);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = aVar;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoOpeningsComponentKt$PhysicalStorePassInfo$2(mVar2, i5, i6));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m109616m(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(988533360);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(988533360, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStorePassInfoPreview (PhysicalStoreInfoOpeningsComponent.kt:403)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoOpeningsComponentKt.f62443a.mo73946c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25375xbeeac55d(i));
        }
    }

    @C8540g
    /* renamed from: v */
    public static final String m109625v(List<C38147b> list, C8592o oVar, int i) {
        String str;
        oVar.mo14918M(-2028750824);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2028750824, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.generateDaysPattern (PhysicalStoreInfoOpeningsComponent.kt:340)");
        }
        if (list == null) {
            oVar.mo14918M(613872283);
            str = C16018i.m71858d(R.string.store_hour_unavailable, oVar, 0);
            oVar.mo15002m0();
        } else if (list.isEmpty()) {
            oVar.mo14918M(613872386);
            str = C16018i.m71858d(R.string.general_closed, oVar, 0);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(613872478);
            str = CollectionsKt___CollectionsKt.m40639h3(list, " / ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new PhysicalStoreInfoOpeningsComponentKt$generateDaysPattern$1((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())), 30, (Object) null);
            oVar.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        return com.carrefour.fid.android.R.drawable.ic_crf_express_logo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        return com.carrefour.fid.android.R.drawable.ic_crf_market_logo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m109626w(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 2131231438(0x7f0802ce, float:1.8078957E38)
            switch(r0) {
                case -2027976644: goto L_0x0074;
                case -1162676091: goto L_0x0067;
                case -1033870472: goto L_0x005a;
                case -734094995: goto L_0x0051;
                case -117562718: goto L_0x0048;
                case 65768: goto L_0x003b;
                case 780456706: goto L_0x002e;
                case 1300366525: goto L_0x0025;
                case 1673062174: goto L_0x0016;
                case 1773813039: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0081
        L_0x000c:
            java.lang.String r0 = "CARREFOUR MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x007d
            goto L_0x0081
        L_0x0016:
            java.lang.String r0 = "CARREFOUR CITY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0020
            goto L_0x0081
        L_0x0020:
            r1 = 2131231437(0x7f0802cd, float:1.8078955E38)
            goto L_0x0084
        L_0x0025:
            java.lang.String r0 = "CARREFOUR EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0070
            goto L_0x0081
        L_0x002e:
            java.lang.String r0 = "BON APP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0037
            goto L_0x0081
        L_0x0037:
            r1 = 2131231436(0x7f0802cc, float:1.8078953E38)
            goto L_0x0084
        L_0x003b:
            java.lang.String r0 = "BIO"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0044
            goto L_0x0081
        L_0x0044:
            r1 = 2131231435(0x7f0802cb, float:1.807895E38)
            goto L_0x0084
        L_0x0048:
            java.lang.String r0 = "CONTACT MARCHE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0084
            goto L_0x0081
        L_0x0051:
            java.lang.String r0 = "CARREFOUR CONTACT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0084
            goto L_0x0081
        L_0x005a:
            java.lang.String r0 = "CARREFOUR MONTAGNE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0063
            goto L_0x0081
        L_0x0063:
            r1 = 2131231443(0x7f0802d3, float:1.8078967E38)
            goto L_0x0084
        L_0x0067:
            java.lang.String r0 = "CORNER EXPRESS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0070
            goto L_0x0081
        L_0x0070:
            r1 = 2131231441(0x7f0802d1, float:1.8078963E38)
            goto L_0x0084
        L_0x0074:
            java.lang.String r0 = "MARKET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            r1 = 2131231442(0x7f0802d2, float:1.8078965E38)
            goto L_0x0084
        L_0x0081:
            r1 = 2131231487(0x7f0802ff, float:1.8079056E38)
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt.m109626w(java.lang.String):int");
    }

    /* renamed from: x */
    public static final boolean m109627x(int i) {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance()");
        int i2 = instance.get(7);
        if ((i == 6 && i2 == 1) || i == i2 - 2) {
            return true;
        }
        return false;
    }
}
