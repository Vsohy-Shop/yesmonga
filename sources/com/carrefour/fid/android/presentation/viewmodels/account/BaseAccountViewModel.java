package com.carrefour.fid.android.presentation.viewmodels.account;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.LiveData;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.presentation.p035ui.account.C22875a;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00148@X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/BaseAccountViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "i0", "h0", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "d", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/shared/util/q;", "Landroidx/navigation/b0;", "e", "Lcom/carrefour/fid/android/shared/util/q;", "singleNavigation", "Landroidx/lifecycle/LiveData;", "g0", "()Landroidx/lifecycle/LiveData;", "navigation", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class BaseAccountViewModel extends C28498p {

    /* renamed from: f */
    public static final int f63090f = (C28947q.f70959o | LoginRepository.f32381c);
    @C12579k

    /* renamed from: d */
    public final LoginRepository f63091d;
    @C12579k

    /* renamed from: e */
    public final C28947q<C19693b0> f63092e = new C28947q<>();

    @Inject
    public BaseAccountViewModel(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f63091d = loginRepository;
        mo74785i0();
    }

    public void clear() {
        super.clear();
        this.f63092e.mo57496r(null);
    }

    @C12579k
    /* renamed from: g0 */
    public final LiveData<C19693b0> mo74783g0() {
        return this.f63092e;
    }

    /* renamed from: h0 */
    public final boolean mo74784h0() {
        return C13181d.m57146e(this.f63091d.mo31354f());
    }

    /* renamed from: i0 */
    public final void mo74785i0() {
        if (mo74784h0()) {
            this.f63092e.mo57496r(C22875a.f58458a.mo67343b());
        } else {
            this.f63092e.mo57496r(C22875a.f58458a.mo67342a());
        }
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f63092e.mo57495q(wVar);
        mo74783g0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
