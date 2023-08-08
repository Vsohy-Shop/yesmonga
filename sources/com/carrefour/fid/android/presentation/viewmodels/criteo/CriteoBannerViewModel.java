package com.carrefour.fid.android.presentation.viewmodels.criteo;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/criteo/CriteoBannerViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;", "pageType", "Lkotlin/d2;", "k0", "", "trackingUrl", "n0", "Landroidx/lifecycle/w;", "owner", "", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;", "criteoBannerUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "e", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "criteoTrackingUseCase", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/domain/models/criteo/a;", "f", "Lcom/carrefour/fid/android/shared/util/q;", "singleCriteoBanner", "", "g", "singleCriteoBannersList", "Landroidx/lifecycle/LiveData;", "l0", "()Landroidx/lifecycle/LiveData;", "criteoBanner", "m0", "criteoBannersList", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase;Lcom/carrefour/fid/android/domain/interactors/criteo/j;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class CriteoBannerViewModel extends C28498p {

    /* renamed from: h */
    public static final int f64342h = 8;
    @C12579k

    /* renamed from: d */
    public final GetCriteoBannerUseCase f64343d;
    @C12579k

    /* renamed from: e */
    public final C37672j f64344e;
    @C12579k

    /* renamed from: f */
    public final C28947q<C37999a> f64345f = new C28947q<>();
    @C12579k

    /* renamed from: g */
    public final C28947q<List<C37999a>> f64346g = new C28947q<>();

    @Inject
    public CriteoBannerViewModel(@C12579k GetCriteoBannerUseCase getCriteoBannerUseCase, @C12579k C37672j jVar) {
        Intrinsics.checkNotNullParameter(getCriteoBannerUseCase, "criteoBannerUseCase");
        Intrinsics.checkNotNullParameter(jVar, "criteoTrackingUseCase");
        this.f64343d = getCriteoBannerUseCase;
        this.f64344e = jVar;
    }

    /* renamed from: k0 */
    public final void mo76607k0(@C12579k CriteoPageType criteoPageType) {
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CriteoBannerViewModel$getCriteoBanner$1(this, criteoPageType, (C11045c<? super CriteoBannerViewModel$getCriteoBanner$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: l0 */
    public final LiveData<C37999a> mo76608l0() {
        return this.f64345f;
    }

    @C12579k
    /* renamed from: m0 */
    public final LiveData<List<C37999a>> mo76609m0() {
        return this.f64346g;
    }

    /* renamed from: n0 */
    public final void mo76610n0(@C12580l String str) {
        if (str != null) {
            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CriteoBannerViewModel$sendCriteoTracking$1$1(this, str, (C11045c<? super CriteoBannerViewModel$sendCriteoTracking$1$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64345f.mo57495q(wVar);
        mo76608l0().mo57495q(wVar);
        this.f64346g.mo57495q(wVar);
        mo76609m0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
