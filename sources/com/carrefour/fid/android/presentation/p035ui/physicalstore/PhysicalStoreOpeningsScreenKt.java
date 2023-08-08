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
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27145c;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.shared.util.events.EventLifecycleObserverKt;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import com.carrefour.fid.android.utils.C22702d;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreOpeningsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreOpeningsScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreOpeningsScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,137:1\n76#2:138\n76#2:139\n76#3:140\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreOpeningsScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreOpeningsScreenKt\n*L\n45#1:138\n51#1:139\n44#1:140\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreenKt */
public final class PhysicalStoreOpeningsScreenKt {

    /* renamed from: a */
    public static final int f62378a = 7;

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109453a(@C12580l C8767m mVar, @C12579k C38163l lVar, @C12580l C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1 physicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1;
        C38163l lVar2 = lVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(lVar2, "store");
        C8592o o = oVar.mo15009o(2130438034);
        if ((i2 & 1) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 4) != 0) {
            physicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1 = PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1.f62379f;
        } else {
            physicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1 = aVar;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2130438034, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreen (PhysicalStoreOpeningsScreen.kt:74)");
        }
        C11289a<C11079d2> aVar2 = physicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1;
        ScaffoldKt.m13747a(SizeKt.m10112l(mVar2, 0.0f, 1, (Object) null), (C3036d1) null, C8553b.m31048b(o, 1661133015, true, new PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$2(physicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$1, i3)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, 0, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, false, (C15218g4) null, 0.0f, 0, 0, 0, C37475b.f94185a.mo114231a0(), 0, C8553b.m31048b(o, 623973200, true, new PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3(lVar2)), o, C22132b.f56831b, 12582912, 98298);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$4(mVar2, lVar, aVar2, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109454b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-328366612);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-328366612, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreenPreview (PhysicalStoreOpeningsScreen.kt:120)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreOpeningsScreenKt.f62362a.mo73760b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25317x80b8980e(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109455c(@C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2, @C12580l C8592o oVar, int i) {
        C8592o oVar2;
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel2 = physicalStoreInfoViewModel;
        C29018a aVar3 = aVar;
        C11289a<C11079d2> aVar4 = aVar2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(aVar3, "analytics");
        Intrinsics.checkNotNullParameter(aVar4, "onBackPressed");
        C8592o o = oVar.mo15009o(-1260566612);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1260566612, i2, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsStateful (PhysicalStoreOpeningsScreen.kt:38)");
        }
        C8578k2<C27145c> b = C8415c2.m30233b(physicalStoreInfoViewModel.mo78889k0(), (CoroutineContext) null, o, 8, 1);
        EventLifecycleObserverKt.m119612a((C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i()), new PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsStateful$1(aVar3, C22702d.m102799a((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g()))), (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, (C11289a<C11079d2>) null, o, 8, 252);
        C27164j j = m109456d(b).mo78931j();
        if (Intrinsics.areEqual((Object) j, (Object) C27164j.C27165a.f66039a) || Intrinsics.areEqual((Object) j, (Object) C27164j.C27166b.f66041a) || !(j instanceof C27164j.C27167c)) {
            oVar2 = o;
        } else {
            oVar2 = o;
            m109453a((C8767m) null, ((C27164j.C27167c) j).mo78958d(), aVar2, o, (i2 & 896) | 64, 1);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsStateful$2(physicalStoreInfoViewModel2, aVar3, aVar4, i2));
        }
    }

    /* renamed from: d */
    public static final C27145c m109456d(C8578k2<C27145c> k2Var) {
        return k2Var.getValue();
    }
}
