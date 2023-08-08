package com.carrefour.fid.android.presentation.viewmodels.store;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\t\u001a\u00020\nH\u0014R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128@X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/store/StoreViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "", "sourceGraphId", "Lkotlinx/coroutines/c2;", "i0", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/shared/util/q;", "Landroidx/navigation/b0;", "d", "Lcom/carrefour/fid/android/shared/util/q;", "singleNavigation", "Landroidx/lifecycle/LiveData;", "h0", "()Landroidx/lifecycle/LiveData;", "navigation", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class StoreViewModel extends C28498p {

    /* renamed from: e */
    public static final int f66564e = C28947q.f70959o;
    @C12579k

    /* renamed from: d */
    public final C28947q<C19693b0> f66565d = new C28947q<>();

    public void clear() {
        super.clear();
        this.f66565d.mo57496r(null);
    }

    @C12579k
    /* renamed from: h0 */
    public final LiveData<C19693b0> mo79786h0() {
        return this.f66565d;
    }

    @C12579k
    /* renamed from: i0 */
    public final C11723c2 mo79787i0(int i) {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new StoreViewModel$initNavigationToStore$1(this, i, (C11045c<? super StoreViewModel$initNavigationToStore$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f66565d.mo57495q(wVar);
        mo79786h0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
