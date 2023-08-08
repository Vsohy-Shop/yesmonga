package com.carrefour.fid.android.presentation.viewmodels.environment;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.C37607c;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0013\u0010\f\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/environment/AppEnvironmentSelectionViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "", "position", "l0", "j0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/c;", "updateAppEnvironmentUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "e", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "f", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "clearAppManager", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/shared/util/environment/a;", "g", "Lcom/carrefour/fid/android/shared/util/q;", "singleAppEnvironmentChanged", "Landroidx/lifecycle/LiveData;", "k0", "()Landroidx/lifecycle/LiveData;", "appEnvironmentChanged", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/c;Lcom/carrefour/fid/android/domain/interactors/service/a;Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class AppEnvironmentSelectionViewModel extends C28498p {

    /* renamed from: h */
    public static final int f64353h = 8;
    @C12579k

    /* renamed from: d */
    public final C37607c f64354d;
    @C12579k

    /* renamed from: e */
    public final C37811a f64355e;
    @C12579k

    /* renamed from: f */
    public final ClearAppManager f64356f;
    @C12579k

    /* renamed from: g */
    public final C28947q<C28912a> f64357g = new C28947q<>();

    @Inject
    public AppEnvironmentSelectionViewModel(@C12579k C37607c cVar, @C12579k C37811a aVar, @C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(cVar, "updateAppEnvironmentUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(clearAppManager, "clearAppManager");
        this.f64354d = cVar;
        this.f64355e = aVar;
        this.f64356f = clearAppManager;
    }

    public void clear() {
        super.clear();
        this.f64357g.mo57496r(null);
    }

    @C12580l
    /* renamed from: j0 */
    public final Object mo76619j0(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = this.f64356f.mo111416a(cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: k0 */
    public final LiveData<C28912a> mo76620k0() {
        return this.f64357g;
    }

    /* renamed from: l0 */
    public final void mo76621l0(int i) {
        mo83421f0().mo57496r(Boolean.TRUE);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AppEnvironmentSelectionViewModel$update$1(this, i, (C11045c<? super AppEnvironmentSelectionViewModel$update$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64357g.mo57495q(wVar);
        mo76620k0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
