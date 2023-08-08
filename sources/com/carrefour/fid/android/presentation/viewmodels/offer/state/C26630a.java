package com.carrefour.fid.android.presentation.viewmodels.offer.state;

import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.offer.state.a */
public final class C26630a {
    /* renamed from: a */
    public static final <T extends C28505u.C28507b> void m113214a(@C12579k BaseMVIViewModel<C26636c, T> baseMVIViewModel, @C12579k C26631b bVar) {
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "partialState");
        baseMVIViewModel.reduceAndPublishState(C26636c.f65043e.mo77403b(), bVar);
    }
}
