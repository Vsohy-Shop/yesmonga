package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.C28499q;
import com.carrefour.fid.android.shared.type.C28892e;
import com.contentsquare.android.api.C14092c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nShoppingListScreenStateFul.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,492:1\n43#2,6:493\n45#3,3:499\n76#4:502\n76#4:503\n76#4:504\n36#5:505\n1114#6,6:506\n*S KotlinDebug\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt\n*L\n75#1:493,6\n75#1:499,3\n80#1:502\n84#1:503\n87#1:504\n184#1:505\n184#1:506,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt */
public final class ShoppingListScreenStateFulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103535a(C28892e<? extends List<? extends C27670g>> eVar, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        C28892e<? extends List<? extends C27670g>> eVar2 = eVar;
        C28499q qVar2 = qVar;
        C11300l<? super C23066f, C11079d2> lVar2 = lVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(1250094930);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(eVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(qVar2)) {
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
                ComposerKt.m29845w0(1250094930, i7, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreen (ShoppingListScreenStateFul.kt:273)");
            }
            C8592o oVar3 = o;
            oVar2 = oVar3;
            ScaffoldKt.m13747a((C8767m) null, ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, o, 0, 3), C8553b.m31048b(o, -1552422675, true, new ShoppingListScreenStateFulKt$ShoppingListScreen$1(eVar2, lVar2, i7)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, 0, 0, C8553b.m31048b(oVar3, -1379032876, true, new ShoppingListScreenStateFulKt$ShoppingListScreen$2(eVar2, qVar2, lVar2, i7)), oVar3, C22132b.f56831b, 12582912, 131065);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListScreenStateFulKt$ShoppingListScreen$3(eVar2, qVar2, lVar2, i6));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m103536b(C8592o oVar, int i) {
        int i2 = i;
        C8592o o = oVar.mo15009o(1414565859);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1414565859, i2, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenPreview (ShoppingListScreenStateFul.kt:452)");
            }
            C38114b bVar = r6;
            C38114b bVar2 = new C38114b(new C38115c(Gtin.m157308b(""), (ProductCategory) null, "Pomme", "", "", C10977s0.m41492z(), "une pomme verte", CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E(), "", (Double) null, false, true, CollectionsKt__CollectionsKt.m40441E(), "", CollectionsKt__CollectionsKt.m40441E(), (ProductNutriScore) null, (C38012n) null, (DefaultConstructorMarker) null), 0, false, false, false, false, false, 126, (DefaultConstructorMarker) null);
            CollectionsKt__CollectionsKt.m40448L(new C27670g.C27675e(1, "Fruits et légumes"), new C27670g.C27676f(bVar, false));
            ThemeKt.m153788a(ComposableSingletons$ShoppingListScreenStateFulKt.f58683a.mo67669b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListScreenStateFulKt$ShoppingListScreenPreview$1(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m103537c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.domain.models.offer.OfferIdentifier, ? super java.lang.Boolean, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super com.carrefour.fid.android.domain.models.product.Gtin, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant, ? super java.lang.String, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.product.plp.PlpOffer, kotlin.C11079d2> r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.domain.models.product.Gtin, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r39, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a r40, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.base.C28499q r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43, int r44, int r45) {
        /*
            r12 = r40
            r13 = r41
            r14 = r44
            java.lang.String r0 = "onCardPressed"
            r15 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onOpenBackDrop"
            r11 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onOpenPlp"
            r10 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onOpenLogin"
            r9 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onNavigationBackClicked"
            r8 = r34
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onDisplaySnackbar"
            r7 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onMixingPressed"
            r6 = r36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onOpenServiceSelection"
            r5 = r37
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onAntiInflationClick"
            r4 = r38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1846715295(0xffffffff91ed5c61, float:-3.744894E-28)
            r1 = r42
            androidx.compose.runtime.o r3 = r1.mo15009o(r0)
            r2 = r45
            r1 = r2 & 512(0x200, float:7.175E-43)
            r0 = 8
            if (r1 == 0) goto L_0x00a2
            r1 = -550968255(0xffffffffdf28e441, float:-1.2169924E19)
            r3.mo14918M(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f49869a
            androidx.lifecycle.b1 r1 = r1.mo57681a(r3, r0)
            if (r1 == 0) goto L_0x0096
            androidx.lifecycle.x0$b r19 = androidx.hilt.navigation.compose.C19298a.m90444a(r1, r3, r0)
            r0 = 564614654(0x21a755fe, float:1.1339122E-18)
            r3.mo14918M(r0)
            r18 = 0
            java.lang.Class<com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel> r16 = com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel.class
            r21 = 4168(0x1048, float:5.84E-42)
            r22 = 0
            r17 = r1
            r20 = r3
            androidx.lifecycle.v0 r0 = androidx.lifecycle.viewmodel.compose.C19490c.m90838f(r16, r17, r18, r19, r20, r21, r22)
            r3.mo15002m0()
            r3.mo15002m0()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel) r0
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r43 & r1
            goto L_0x00a6
        L_0x0096:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a2:
            r0 = r39
            r1 = r43
        L_0x00a6:
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x00b4
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFul (ShoppingListScreenStateFul.kt:64)"
            r4 = -1846715295(0xffffffff91ed5c61, float:-3.744894E-28)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r14, r2)
        L_0x00b4:
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r1 = r3.mo15032w(r1)
            r27 = r1
            android.content.Context r27 = (android.content.Context) r27
            kotlinx.coroutines.flow.j r1 = r0.mo75134o0()
            r2 = 0
            r4 = 1
            r5 = 8
            androidx.compose.runtime.k2 r5 = androidx.compose.runtime.C8415c2.m30233b(r1, r2, r3, r5, r4)
            kotlinx.coroutines.flow.e r16 = r0.mo75133n0()
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r1 = r3.mo15032w(r1)
            androidx.lifecycle.w r1 = (androidx.lifecycle.C19499w) r1
            androidx.lifecycle.Lifecycle r17 = r1.getLifecycle()
            r18 = 0
            r20 = 72
            r21 = 4
            r19 = r3
            kotlinx.coroutines.flow.e r4 = com.carrefour.fid.android.shared.extension.FlowKt.m118809b(r16, r17, r18, r19, r20, r21)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r1 = r3.mo15032w(r1)
            r16 = r1
            androidx.lifecycle.w r16 = (androidx.lifecycle.C19499w) r16
            r17 = 0
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$1 r1 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$1
            r1.<init>(r0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 8
            r26 = 246(0xf6, float:3.45E-43)
            r19 = r1
            r24 = r3
            com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt.m119612a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$actioner$1 r2 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$actioner$1
            r16 = r0
            r0 = r2
            r1 = r40
            r15 = r2
            r2 = r27
            r13 = r3
            r3 = r16
            r39 = r4
            r4 = r30
            r42 = r5
            r5 = r35
            r6 = r34
            r7 = r33
            r8 = r32
            r9 = r31
            r10 = r36
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r42.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo75173d()
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 == 0) goto L_0x0155
            com.carrefour.fid.android.shared.type.e$c r0 = (com.carrefour.fid.android.shared.type.C28892e.C28895c) r0
            java.lang.Object r0 = r0.mo84088d()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0155
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r0 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.ACCOUNT_LIST
            r12.mo75166w(r0)
        L_0x0155:
            java.lang.Object r1 = r42.getValue()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r0)
            r0 = r42
            boolean r2 = r13.mo15006n0(r0)
            java.lang.Object r3 = r13.mo14921N()
            if (r2 != 0) goto L_0x0173
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x017b
        L_0x0173:
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$2$1 r3 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$2$1
            r3.<init>(r0)
            r13.mo14893C(r3)
        L_0x017b:
            r13.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3 r3 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3
            r3.<init>(r0, r12)
            int r7 = com.carrefour.fid.android.shared.type.C28892e.f70778a
            r6 = 0
            r4 = r13
            r5 = r7
            com.carrefour.fid.android.shared.util.events.SingleEventCoroutineLauncherKt.m119625a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r0.getValue()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f) r0
            com.carrefour.fid.android.shared.type.e r0 = r0.mo75173d()
            int r1 = com.carrefour.fid.android.shared.base.C28499q.$stable
            int r1 = r1 << 3
            r1 = r1 | r7
            r2 = r14 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r7 = r13
            r13 = r41
            m103535a(r0, r13, r15, r7, r1)
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4 r0 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4
            r6 = 0
            r1 = r0
            r2 = r39
            r3 = r15
            r4 = r27
            r5 = r37
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 72
            androidx.compose.runtime.EffectsKt.m29896h(r2, r0, r7, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c2:
            androidx.compose.runtime.t1 r15 = r7.mo15020s()
            if (r15 != 0) goto L_0x01c9
            goto L_0x01f8
        L_0x01c9:
            com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$5 r11 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$5
            r0 = r11
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r16
            r28 = r11
            r11 = r40
            r12 = r41
            r13 = r43
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.mo15202a(r1)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListScreenStateFulKt.m103537c(kotlin.jvm.functions.p, kotlin.jvm.functions.q, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.p, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel, com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.a, com.carrefour.fid.android.shared.base.q, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m103538d(List<? extends C27670g> list, C2366i0 i0Var, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(202475469);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(202475469, i, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListWithItems (ShoppingListScreenStateFul.kt:336)");
        } else {
            int i2 = i;
        }
        LazyDslKt.m10737b(PaddingKt.m10023j(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), i0Var), (LazyListState) null, (C2366i0) null, false, (Arrangement.C2279l) null, C8734c.f23406a.mo17068m(), (C2195g) null, false, new ShoppingListScreenStateFulKt$ShoppingListWithItems$1(list, qVar, lVar), o, C20022q.C20025c.f51280k, C14092c.f34587c0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ShoppingListScreenStateFulKt$ShoppingListWithItems$2(list, i0Var, qVar, lVar, i));
        }
    }
}
