package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.content.Context;
import androidx.appcompat.app.C0475e;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C3036d1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import androidx.compose.runtime.C8415c2;
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
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.compose.C37019o;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27136a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27156h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import com.carrefour.fid.android.utils.C22702d;
import com.google.android.material.badge.C31132a;
import com.urbanairship.push.notifications.C9527p;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,374:1\n76#2:375\n76#2:376\n76#2:384\n74#3,6:377\n80#3:409\n84#3:419\n75#4:383\n76#4,11:385\n89#4:418\n460#5,13:396\n473#5,3:415\n154#6:410\n154#6:411\n154#6:412\n154#6:413\n154#6:414\n76#7:420\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt\n*L\n73#1:375\n107#1:376\n298#1:384\n298#1:377,6\n298#1:409\n298#1:419\n298#1:383\n298#1:385,11\n298#1:418\n298#1:396,13\n298#1:415,3\n301#1:410\n302#1:411\n303#1:412\n308#1:413\n309#1:414\n74#1:420\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt */
public final class PhysicalStoreInfoScreenKt {

    /* renamed from: a */
    public static final int f62374a = 3;

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109436a(@C12580l C8767m mVar, @C12579k C27164j.C27167c cVar, @C12579k C27160i iVar, @C12579k C27152g gVar, @C12579k C27156h hVar, @C12579k C11300l<? super C27136a, C11079d2> lVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        C11300l<? super C27136a, C11079d2> lVar2 = lVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(cVar, "storeState");
        Intrinsics.checkNotNullParameter(iVar, "servicesState");
        Intrinsics.checkNotNullParameter(gVar, "petrolState");
        Intrinsics.checkNotNullParameter(hVar, "reviewState");
        Intrinsics.checkNotNullParameter(lVar2, "actioner");
        C8592o o = oVar.mo15009o(1816079878);
        if ((i2 & 1) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1816079878, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen (PhysicalStoreInfoScreen.kt:134)");
        }
        C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
        long a0 = C37475b.f94185a.mo114231a0();
        C8552a b = C8553b.m31048b(o, -55641183, true, new PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$1(lVar2, i3));
        PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2 physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2 = r0;
        C8767m mVar2 = aVar;
        C8592o oVar2 = o;
        PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2 physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$22 = new PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2(iVar, gVar, hVar, cVar, lVar, i);
        ScaffoldKt.m13747a(l, (C3036d1) null, b, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, a0, 0, C8553b.m31048b(oVar2, 940791688, true, physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2), oVar2, C22132b.f56831b, 12582912, 98298);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$3(mVar2, cVar, iVar, gVar, hVar, lVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109437b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2136553926);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2136553926, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenPreview (PhysicalStoreInfoScreen.kt:329)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreInfoScreenKt.f62350a.mo73752e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreenPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109438c(@C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11289a<C11079d2> aVar4, @C12579k C11300l<? super String, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        C29018a aVar5 = aVar;
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar5, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPressed");
        Intrinsics.checkNotNullParameter(aVar3, "onSeeAllServicesClicked");
        Intrinsics.checkNotNullParameter(aVar4, "onSeeOpeningClicked");
        Intrinsics.checkNotNullParameter(lVar, "onRedirectToPhoneClicked");
        C8592o o = oVar.mo15009o(-119912895);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-119912895, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoStateful (PhysicalStoreInfoScreen.kt:64)");
        } else {
            int i2 = i;
        }
        C0475e a = C22702d.m102799a((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g()));
        C8578k2<C27145c> b = C8415c2.m30233b(physicalStoreInfoViewModel.mo78889k0(), (CoroutineContext) null, o, 8, 1);
        PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1 physicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1 = new PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1(aVar2, aVar, lVar, aVar3, aVar4, physicalStoreInfoViewModel, a);
        C8592o oVar2 = o;
        EventLifecycleObserverKt.m119612a((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), new PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$1(aVar5, a), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, oVar2, 8, 252);
        C27164j j = m109439d(b).mo78931j();
        if (j instanceof C27164j.C27167c) {
            m109436a((C8767m) null, (C27164j.C27167c) j, m109439d(b).mo78930i(), m109439d(b).mo78927g(), m109439d(b).mo78928h(), physicalStoreInfoScreenKt$PhysicalStoreInfoStateful$actioner$1, oVar2, 64, 1);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$2(physicalStoreInfoViewModel, aVar, aVar2, aVar3, aVar4, lVar, i));
        }
    }

    /* renamed from: d */
    public static final C27145c m109439d(C8578k2<C27145c> k2Var) {
        return k2Var.getValue();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m109440e(@C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(852346223);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i5 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(852346223, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreItemShimmer (PhysicalStoreInfoScreen.kt:294)");
            }
            int i6 = i3 & 14;
            o.mo14918M(-483455358);
            int i7 = i6 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i7 & 112) | (i7 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 16), 7, (Object) null);
            float f2 = (float) C9527p.f26031b;
            float f3 = (float) 8;
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10092H(o2, C16483g.m74435M(f2)), C2694o.m12166h(C16483g.m74435M(f3))), true, (C15218g4) null, 2, (Object) null), o, 0);
            C2428y0.m10726a(C37019o.m151909b(C8744d.m32514a(SizeKt.m10092H(aVar, C16483g.m74435M(f2)), C2694o.m12166h(C16483g.m74435M(f3))), true, (C15218g4) null, 2, (Object) null), o, 0);
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
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreInfoScreenKt$PhysicalStoreItemShimmer$2(mVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m109441f(@C12580l C8767m mVar, int i, @C12580l C8592o oVar, int i2, int i3) {
        int i4;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        C8592o o = oVar.mo15009o(-145575301);
        int i10 = i9 & 1;
        if (i10 != 0) {
            i4 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i8;
        } else {
            mVar2 = mVar;
            i4 = i8;
        }
        if ((i9 & 2) != 0) {
            i4 |= 48;
        } else if ((i8 & 112) == 0) {
            if (o.mo14976f(i7)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        int i11 = i4;
        if ((i11 & 91) != 18 || !o.mo15011p()) {
            if (i10 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-145575301, i11, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreTitleComponent (PhysicalStoreInfoScreen.kt:315)");
            }
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(i7, o, (i11 >> 3) & 14), aVar, 0, 0, (C16190e0) null, C16209i0.f40292b.mo46947c(), (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j(), oVar2, ((i11 << 3) & 112) | C20022q.C20025c.f51280k, 0, 65500);
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
            s.mo15202a(new PhysicalStoreInfoScreenKt$PhysicalStoreTitleComponent$1(mVar2, i7, i8, i9));
        }
    }

    /* renamed from: j */
    public static final String m109445j(C38163l lVar) {
        StoreAddress v = lVar.mo119392v();
        if (v != null) {
            String str = v.mo119126h() + v.mo119128i() + "\n" + v.mo119131l() + " " + v.mo119129j();
            if (str == null) {
                return "";
            }
            return str;
        }
        return "";
    }

    /* renamed from: k */
    public static final String m109446k(C38163l lVar) {
        String str;
        StoreAddress v = lVar.mo119392v();
        if (v == null) {
            return "";
        }
        StoreCoordinates k = v.mo119130k();
        String str2 = null;
        if (k != null) {
            str = k.mo119145e();
        } else {
            str = null;
        }
        StoreCoordinates k2 = v.mo119130k();
        if (k2 != null) {
            str2 = k2.mo119147f();
        }
        return "geo:" + str + "," + str2 + "?q=" + v.mo119126h() + C31132a.f74628J0 + v.mo119131l() + C31132a.f74628J0 + v.mo119129j();
    }
}
