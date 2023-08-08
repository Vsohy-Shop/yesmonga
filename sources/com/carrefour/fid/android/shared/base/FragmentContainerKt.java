package com.carrefour.fid.android.shared.base;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFragmentContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainer.kt\ncom/carrefour/fid/android/shared/base/FragmentContainerKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,48:1\n76#2:49\n*S KotlinDebug\n*F\n+ 1 FragmentContainer.kt\ncom/carrefour/fid/android/shared/base/FragmentContainerKt\n*L\n24#1:49\n*E\n"})
public final class FragmentContainerKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m118331a(@C12580l C8767m mVar, @C12579k FragmentManager fragmentManager, @C12579k C11304p<? super C19234h0, ? super Integer, C11079d2> pVar, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(pVar, "commit");
        Intrinsics.checkNotNullParameter(aVar, "tagScreenPreview");
        C8592o o = oVar.mo15009o(-759538178);
        if ((i2 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-759538178, i, -1, "com.carrefour.fid.android.shared.base.FragmentContainer (FragmentContainer.kt:17)");
        }
        AndroidView_androidKt.m74829a(new FragmentContainerKt$FragmentContainer$1(aVar, fragmentManager, (C8700z0) RememberSaveableKt.m31343d(new Object[0], (C8628e) null, (String) null, FragmentContainerKt$FragmentContainer$containerId$2.f68573f, o, 3080, 6), pVar), mVar, FragmentContainerKt$FragmentContainer$2.f68572f, o, ((i << 3) & 112) | C22132b.f56831b, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FragmentContainerKt$FragmentContainer$3(mVar, fragmentManager, pVar, aVar, i, i2));
        }
    }

    /* renamed from: b */
    public static final int m118332b(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    @C12579k
    /* renamed from: d */
    public static final C11304p<C19234h0, Integer, C11079d2> m118334d(@C12579k Fragment fragment, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "tag");
        return new FragmentContainerKt$getCommitFunction$1(fragment, str);
    }
}
