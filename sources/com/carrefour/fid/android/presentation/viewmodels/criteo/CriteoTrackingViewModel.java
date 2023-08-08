package com.carrefour.fid.android.presentation.viewmodels.criteo;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoTrackingSyncUseCase;
import com.carrefour.fid.android.shared.base.C28498p;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class CriteoTrackingViewModel extends C28498p {

    /* renamed from: e */
    public static final int f64347e = 8;
    @C12579k

    /* renamed from: d */
    public final CriteoTrackingSyncUseCase f64348d;

    @Inject
    public CriteoTrackingViewModel(@C12579k CriteoTrackingSyncUseCase criteoTrackingSyncUseCase) {
        Intrinsics.checkNotNullParameter(criteoTrackingSyncUseCase, "criteoTrackingSyncUseCase");
        this.f64348d = criteoTrackingSyncUseCase;
    }

    /* renamed from: h0 */
    public final void mo76613h0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CriteoTrackingViewModel$syncCriteoTracking$1(this, (C11045c<? super CriteoTrackingViewModel$syncCriteoTracking$1>) null), 3, (Object) null);
    }
}
