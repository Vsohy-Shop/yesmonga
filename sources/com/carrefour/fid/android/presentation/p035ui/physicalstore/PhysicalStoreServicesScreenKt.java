package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.content.Context;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import com.carrefour.fid.android.utils.C22702d;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreServicesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreServicesScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreServicesScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,130:1\n76#2:131\n76#2:132\n76#3:133\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreServicesScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreServicesScreenKt\n*L\n41#1:131\n47#1:132\n40#1:133\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreenKt */
public final class PhysicalStoreServicesScreenKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109474a(@C12580l C8767m mVar, @C12579k List<StoreService> list, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1 physicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1;
        List<StoreService> list2 = list;
        int i3 = i;
        Intrinsics.checkNotNullParameter(list2, C28531e0.f69095y);
        C8592o o = oVar.mo15009o(253087183);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 4) != 0) {
            physicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1 = PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1.f62382f;
        } else {
            physicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(253087183, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreen (PhysicalStoreServicesScreen.kt:67)");
        }
        C11289a<C11079d2> aVar2 = physicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1;
        ScaffoldKt.m13747a(SizeKt.m10112l(mVar2, 0.0f, 1, (Object) null), (C3036d1) null, C8553b.m31048b(o, -1286072342, true, new PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$2(physicalStoreServicesScreenKt$PhysicalStoreServicesScreen$1, i3)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, C37475b.f94185a.mo114231a0(), 0, C8553b.m31048b(o, 2144154193, true, new PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$3(list2)), o, C22132b.f56831b, 12582912, 98298);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreServicesScreenKt$PhysicalStoreServicesScreen$4(mVar2, list, aVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109475b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1600345114);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1600345114, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreenPreview (PhysicalStoreServicesScreen.kt:106)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreServicesScreenKt.f62367a.mo73763a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25329x804b4608(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109476c(@C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        C8592o oVar2;
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel2 = physicalStoreInfoViewModel;
        C29018a aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar3, "analytics");
        Intrinsics.checkNotNullParameter(aVar4, "onBackPressed");
        C8592o o = oVar.mo15009o(980354534);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(980354534, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesStateful (PhysicalStoreServicesScreen.kt:34)");
        }
        C8578k2<C27145c> b = C8415c2.m30233b(physicalStoreInfoViewModel.mo78889k0(), (CoroutineContext) null, o, 8, 1);
        EventLifecycleObserverKt.m119612a((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), new PhysicalStoreServicesScreenKt$PhysicalStoreServicesStateful$1(aVar3, C22702d.m102799a((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g()))), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, o, 8, 252);
        C27160i i3 = m109477d(b).mo78930i();
        if (Intrinsics.areEqual((Object) i3, (Object) C27160i.C27161a.f66033a) || Intrinsics.areEqual((Object) i3, (Object) C27160i.C27162b.f66035a) || !(i3 instanceof C27160i.C27163c)) {
            oVar2 = o;
        } else {
            oVar2 = o;
            m109474a((C8767m) null, ((C27160i.C27163c) i3).mo78952d(), aVar2, o, (i2 & 896) | 64, 1);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreServicesScreenKt$PhysicalStoreServicesStateful$2(physicalStoreInfoViewModel2, aVar3, aVar4, i2));
        }
    }

    /* renamed from: d */
    public static final C27145c m109477d(C8578k2<C27145c> k2Var) {
        return k2Var.getValue();
    }
}
