package com.carrefour.fid.android.presentation.viewmodels.account.list.home;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
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

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/list/home/AccountListHomeViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lkotlin/d2;", "k0", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "d", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "remoteConfigUseCase", "Lcom/carrefour/fid/android/shared/util/q;", "", "e", "Lcom/carrefour/fid/android/shared/util/q;", "singleMemoResult", "Landroidx/lifecycle/LiveData;", "j0", "()Landroidx/lifecycle/LiveData;", "memoResult", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class AccountListHomeViewModel extends C28498p {

    /* renamed from: f */
    public static final int f63210f = 8;
    @C12579k

    /* renamed from: d */
    public final C37807b f63211d;
    @C12579k

    /* renamed from: e */
    public final C28947q<Boolean> f63212e = new C28947q<>();

    @Inject
    public AccountListHomeViewModel(@C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigUseCase");
        this.f63211d = bVar;
    }

    @C12579k
    /* renamed from: j0 */
    public final LiveData<Boolean> mo74909j0() {
        return this.f63212e;
    }

    /* renamed from: k0 */
    public final void mo74910k0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountListHomeViewModel$memoRemoteConfig$1(this, (C11045c<? super AccountListHomeViewModel$memoRemoteConfig$1>) null), 3, (Object) null);
    }
}
