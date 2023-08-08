package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128@X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "j0", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "d", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/shared/util/q;", "e", "Lcom/carrefour/fid/android/shared/util/q;", "singleNavigation", "Landroidx/lifecycle/LiveData;", "i0", "()Landroidx/lifecycle/LiveData;", "navigation", "<init>", "(Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class ServiceStationsViewModel extends C28498p {

    /* renamed from: f */
    public static final int f64381f = 8;
    @C12579k

    /* renamed from: d */
    public final AppPreferencesStorage f64382d;
    @C12579k

    /* renamed from: e */
    public final C28947q<Boolean> f64383e = new C28947q<>();

    @Inject
    public ServiceStationsViewModel(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f64382d = appPreferencesStorage;
    }

    @C12579k
    /* renamed from: i0 */
    public final LiveData<Boolean> mo76655i0() {
        return this.f64383e;
    }

    /* renamed from: j0 */
    public final void mo76656j0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ServiceStationsViewModel$handleCountLimit$1(this, (C11045c<? super ServiceStationsViewModel$handleCountLimit$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64383e.mo57495q(wVar);
        mo76655i0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
