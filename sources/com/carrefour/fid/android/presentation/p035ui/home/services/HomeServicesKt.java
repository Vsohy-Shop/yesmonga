package com.carrefour.fid.android.presentation.p035ui.home.services;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p004ui.draw.C8754l;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
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
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.C37014m;
import com.carrefour.fid.android.design.components.compose.C37018n;
import com.carrefour.fid.android.design.components.compose.C37020p;
import com.carrefour.fid.android.design.components.compose.Service;
import com.carrefour.fid.android.design.components.compose.SetServiceComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;

@C11363r0({"SMAP\nHomeServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeServices.kt\ncom/carrefour/fid/android/presentation/ui/home/services/HomeServicesKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,180:1\n36#2:181\n25#2:192\n460#2,13:224\n460#2,13:258\n473#2,3:274\n473#2,3:279\n1114#3,6:182\n1114#3,3:193\n1117#3,3:199\n474#4,4:188\n478#4,2:196\n482#4:202\n474#5:198\n154#6:203\n154#6:204\n154#6:238\n154#6:239\n74#7,6:205\n80#7:237\n84#7:283\n75#8:211\n76#8,11:213\n75#8:245\n76#8,11:247\n89#8:277\n89#8:282\n76#9:212\n76#9:246\n76#10,5:240\n81#10:271\n85#10:278\n1855#11,2:272\n76#12:284\n*S KotlinDebug\n*F\n+ 1 HomeServices.kt\ncom/carrefour/fid/android/presentation/ui/home/services/HomeServicesKt\n*L\n40#1:181\n58#1:192\n95#1:224,13\n110#1:258,13\n110#1:274,3\n95#1:279,3\n40#1:182,6\n58#1:193,3\n58#1:199,3\n58#1:188,4\n58#1:196,2\n58#1:202\n58#1:198\n99#1:203\n100#1:204\n113#1:238\n115#1:239\n95#1:205,6\n95#1:237\n95#1:283\n95#1:211\n95#1:213,11\n110#1:245\n110#1:247,11\n110#1:277\n95#1:282\n95#1:212\n110#1:246\n110#1:240,5\n110#1:271\n110#1:278\n117#1:272,2\n39#1:284\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt */
public final class HomeServicesKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m106530a(float f, List<? extends Pair<? extends Service, ? extends ActiveState>> list, ScrollState scrollState, C37020p pVar, int i, C11300l<? super C37014m, C11079d2> lVar, C8592o oVar, int i2) {
        float f2;
        Arrangement arrangement;
        int i3;
        C37018n nVar;
        C37018n nVar2;
        C37018n nVar3;
        int i4 = i2;
        C8592o o = oVar.mo15009o(-1523517631);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1523517631, i4, -1, "com.carrefour.fid.android.presentation.ui.home.services.DisplayServices (HomeServices.kt:86)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        float f3 = (float) 16;
        float f4 = (float) 8;
        C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(C8754l.m32556b(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16015f.m71849d(R.drawable.background_home_service, o, 0), false, (C8734c) null, C15541c.f38696a.mo44370c(), 0.0f, (C15249k2) null, 54, (Object) null), C16483g.m74435M(f3), 0.0f, 2, (Object) null), 0.0f, C16483g.m74435M(f3), 0.0f, C16483g.m74435M(f4), 5, (Object) null);
        o.mo14918M(-483455358);
        Arrangement arrangement2 = Arrangement.f6010a;
        Arrangement.C2279l r = arrangement2.mo7631r();
        C8734c.C8735a aVar2 = C8734c.f23406a;
        C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o2);
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
        f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        o.mo14918M(-883545472);
        if (Intrinsics.areEqual(((Pair) CollectionsKt___CollectionsKt.m40706w2(list)).mo21851f(), (Object) ActiveState.Steady.f92086a)) {
            i3 = -1323940314;
            arrangement = arrangement2;
            f2 = f3;
            TextKt.m14196c(C16018i.m71858d(R.string.home_store_set_header_title, o, 0), (C8767m) null, C15240j2.m66080w(C37475b.f94185a.mo114205B(), ((float) 1) - C11479u.m44331H(f, 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153885L(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), o, 0, 0, 65530);
        } else {
            arrangement = arrangement2;
            f2 = f3;
            i3 = -1323940314;
        }
        o.mo15002m0();
        C8767m b3 = ScrollKt.m9055b(PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, C16483g.m74435M(f4), 0.0f, 0.0f, 13, (Object) null), scrollState, false, (C2195g) null, false, 14, (Object) null);
        Arrangement.C2271e z = arrangement.mo7638z(C16483g.m74435M(f2));
        o.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(z, aVar2.mo17073w(), o, 6);
        o.mo14918M(i3);
        C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(b3);
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
        Updater.m30188j(b4, d, companion.mo44588d());
        Updater.m30188j(b4, dVar2, companion.mo44586b());
        Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
        Updater.m30188j(b4, c4Var2, companion.mo44590f());
        o.mo14972e();
        f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        o.mo14918M(-883544867);
        for (Pair pair : list) {
            Service service = (Service) pair.mo21849e();
            if (Intrinsics.areEqual((Object) service, (Object) Service.Clcv.f92317a)) {
                o.mo14918M(-463158783);
                nVar3 = new C37018n(R.drawable.ds_il_delivery_active, C16018i.m71858d(R.string.set_service_clcv_title, o, 0), C16018i.m71858d(R.string.set_service_clcv_steady_subtitle, o, 0));
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) service, (Object) Service.H1h3.f92321a)) {
                o.mo14918M(-463158354);
                nVar3 = new C37018n(R.drawable.ds_il_delivery_h1h3_active, C16018i.m71858d(R.string.set_service_h1h3_title, o, 0), C16018i.m71858d(R.string.set_service_h1h3_steady_subtitle, o, 0));
                o.mo15002m0();
            } else {
                if (Intrinsics.areEqual((Object) service, (Object) Service.Drive.f92319a)) {
                    o.mo14918M(-463157919);
                    nVar2 = new C37018n(R.drawable.ds_il_drive_active, C16018i.m71858d(R.string.set_service_drive_title, o, 0), C16018i.m71858d(R.string.set_service_drive_steady_subtitle, o, 0));
                    o.mo15002m0();
                } else if (service instanceof Service.PhysicalStore) {
                    o.mo14918M(-463157479);
                    nVar2 = new C37018n(R.drawable.ds_il_store_active, C16018i.m71858d(R.string.set_service_store_title, o, 0), C16018i.m71858d(R.string.set_service_store_steady_subtitle, o, 0));
                    o.mo15002m0();
                } else {
                    o.mo14918M(-463163293);
                    o.mo15002m0();
                    throw new NoWhenBranchMatchedException();
                }
                nVar = nVar2;
                SetServiceComponentKt.m151631g((Service) pair.mo21849e(), (ActiveState) pair.mo21851f(), pVar, nVar, i, lVar, o, (C37018n.f92531d << 9) | 584 | (57344 & i4) | (458752 & i4));
            }
            nVar = nVar3;
            SetServiceComponentKt.m151631g((Service) pair.mo21849e(), (ActiveState) pair.mo21851f(), pVar, nVar, i, lVar, o, (C37018n.f92531d << 9) | 584 | (57344 & i4) | (458752 & i4));
        }
        o.mo15002m0();
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
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
            s.mo15202a(new HomeServicesKt$DisplayServices$2(f, list, scrollState, pVar, i, lVar, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.runtime.k2} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106531b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r35, float r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.Service, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r38, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41) {
        /*
            r6 = r41
            java.lang.String r0 = "viewModel"
            r1 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onButtonClicked"
            r3 = r37
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onRetry"
            r4 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onSelectSlotClicked"
            r5 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1421830483(0x54bf6953, float:6.5768464E12)
            r2 = r40
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0033
            r7 = -1
            java.lang.String r8 = "com.carrefour.fid.android.presentation.ui.home.services.ServiceComponentStateful (HomeServices.kt:29)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r7, r8)
        L_0x0033:
            kotlinx.coroutines.flow.u r0 = r35.mo76738I1()
            r7 = 0
            r8 = 8
            r13 = 1
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30233b(r0, r7, r2, r8, r13)
            kotlinx.coroutines.flow.u r9 = r35.mo76795x1()
            androidx.compose.runtime.k2 r14 = androidx.compose.runtime.C8415c2.m30233b(r9, r7, r2, r8, r13)
            kotlinx.coroutines.flow.u r9 = r35.mo76737H1()
            androidx.compose.runtime.k2 r7 = androidx.compose.runtime.C8415c2.m30233b(r9, r7, r2, r8, r13)
            java.util.Map r8 = m106532c(r7)
            r9 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r9)
            boolean r8 = r2.mo15006n0(r8)
            java.lang.Object r9 = r2.mo14921N()
            if (r8 != 0) goto L_0x006b
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x0077
        L_0x006b:
            com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$serviceList$1$1 r8 = new com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$serviceList$1$1
            r8.<init>(r7)
            androidx.compose.runtime.k2 r9 = androidx.compose.runtime.C8415c2.m30235d(r8)
            r2.mo14893C(r9)
        L_0x0077:
            r2.mo15002m0()
            r15 = r9
            androidx.compose.runtime.k2 r15 = (androidx.compose.runtime.C8578k2) r15
            kotlinx.coroutines.flow.n r7 = r35.getUiState()
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r8 = new com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c
            r16 = r8
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 65535(0xffff, float:9.1834E-41)
            r34 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = 0
            r11 = 72
            r12 = 2
            r10 = r2
            androidx.compose.runtime.k2 r7 = androidx.compose.runtime.C8415c2.m30232a(r7, r8, r9, r10, r11, r12)
            java.lang.Object r7 = r7.getValue()
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c) r7
            com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h r7 = r7.mo76959J()
            r8 = 0
            androidx.compose.foundation.ScrollState r13 = androidx.compose.foundation.ScrollKt.m9056c(r8, r2, r8, r13)
            r9 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.mo14918M(r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r9)
            java.lang.Object r9 = r2.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r9 != r10) goto L_0x00ec
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r9 = androidx.compose.runtime.EffectsKt.m29901m(r9, r2)
            androidx.compose.runtime.w r10 = new androidx.compose.runtime.w
            r10.<init>(r9)
            r2.mo14893C(r10)
            r9 = r10
        L_0x00ec:
            r2.mo15002m0()
            androidx.compose.runtime.w r9 = (androidx.compose.runtime.C8690w) r9
            kotlinx.coroutines.o0 r9 = r9.mo16831a()
            r2.mo15002m0()
            boolean r7 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h.C26474b
            if (r7 == 0) goto L_0x0109
            r0 = 2052542883(0x7a5751a3, float:2.794999E35)
            r2.mo14918M(r0)
            com.carrefour.fid.android.presentation.p035ui.home.services.HomeServicesShimmerKt.m106539a(r2, r8)
            r2.mo15002m0()
            goto L_0x014b
        L_0x0109:
            r7 = 2052542926(0x7a5751ce, float:2.7950076E35)
            r2.mo14918M(r7)
            java.lang.Object r7 = r15.getValue()
            r15 = r7
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r0 = r0.getValue()
            com.carrefour.fid.android.design.components.compose.p r0 = (com.carrefour.fid.android.design.components.compose.C37020p) r0
            java.lang.Object r7 = r14.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r14 = r7.intValue()
            com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$1 r16 = new com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$1
            r7 = r16
            r8 = r37
            r10 = r38
            r11 = r39
            r12 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            int r7 = r6 >> 3
            r7 = r7 & 14
            r12 = r7 | 4160(0x1040, float:5.83E-42)
            r7 = r36
            r8 = r15
            r9 = r13
            r10 = r0
            r11 = r14
            r0 = r12
            r12 = r16
            r13 = r2
            r14 = r0
            m106530a(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.mo15002m0()
        L_0x014b:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0154
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0154:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x015b
            goto L_0x0170
        L_0x015b:
            com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$2 r8 = new com.carrefour.fid.android.presentation.ui.home.services.HomeServicesKt$ServiceComponentStateful$2
            r0 = r8
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.services.HomeServicesKt.m106531b(com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel, float, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: c */
    public static final Map<Service, ActiveState> m106532c(C8578k2<? extends Map<Service, ? extends ActiveState>> k2Var) {
        return (Map) k2Var.getValue();
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m106533d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(788503032);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(788503032, i, -1, "com.carrefour.fid.android.presentation.ui.home.services.ServicesListPreview (HomeServices.kt:162)");
            }
            Service.Drive drive = Service.Drive.f92319a;
            ActiveState.Steady steady = ActiveState.Steady.f92086a;
            m106530a(0.0f, CollectionsKt__CollectionsKt.m40452P(new Pair(drive, steady), new Pair(Service.Clcv.f92317a, steady), new Pair(Service.H1h3.f92321a, steady), new Pair(Service.PhysicalStore.f92323a, steady)), ScrollKt.m9056c(0, o, 0, 1), C37020p.C37022b.f92538a, 0, HomeServicesKt$ServicesListPreview$1.f60500f, o, (C37020p.C37022b.f92539b << 9) | 221254);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new HomeServicesKt$ServicesListPreview$2(i));
        }
    }
}
