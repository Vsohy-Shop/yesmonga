package com.carrefour.fid.android.presentation.viewmodels.feesback;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/feesback/FeedbackViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lkotlin/d2;", "l0", "m0", "Landroidx/lifecycle/w;", "owner", "", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "success", "k0", "Lcom/carrefour/fid/android/domain/interactors/feedback/a;", "d", "Lcom/carrefour/fid/android/domain/interactors/feedback/a;", "checkFeedbackConsentUseCase", "Lkotlinx/coroutines/o0;", "e", "Lkotlinx/coroutines/o0;", "scope", "Lcom/carrefour/fid/android/shared/util/q;", "f", "Lcom/carrefour/fid/android/shared/util/q;", "singleStoreFeedbackDialog", "g", "singleStoreFeedbackVisibility", "Landroidx/lifecycle/LiveData;", "n0", "()Landroidx/lifecycle/LiveData;", "storeFeedbackDialog", "o0", "storeFeedbackVisibility", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/feedback/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class FeedbackViewModel extends C28498p {

    /* renamed from: h */
    public static final int f64362h = 8;
    @C12579k

    /* renamed from: d */
    public final C37686a f64363d;
    @C12579k

    /* renamed from: e */
    public final C12074o0 f64364e;
    @C12579k

    /* renamed from: f */
    public final C28947q<Boolean> f64365f = new C28947q<>();
    @C12579k

    /* renamed from: g */
    public final C28947q<Boolean> f64366g = new C28947q<>();

    @Inject
    public FeedbackViewModel(@C12579k C37686a aVar, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(aVar, "checkFeedbackConsentUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f64363d = aVar;
        this.f64364e = C12079p0.m48272m(C19500w0.m90846a(this), coroutineDispatcher);
    }

    /* renamed from: k0 */
    public final void mo76626k0(C11300l<? super Boolean, C11079d2> lVar) {
        C11723c2 unused = C12038j.m48061f(this.f64364e, (CoroutineContext) null, (CoroutineStart) null, new FeedbackViewModel$checkStoreFeedback$1(this, lVar, (C11045c<? super FeedbackViewModel$checkStoreFeedback$1>) null), 3, (Object) null);
    }

    /* renamed from: l0 */
    public final void mo76627l0() {
        mo76626k0(new FeedbackViewModel$checkStoreFeedbackDialog$1(this));
    }

    /* renamed from: m0 */
    public final void mo76628m0() {
        mo76626k0(new FeedbackViewModel$checkStoreFeedbackVisibility$1(this));
    }

    @C12579k
    /* renamed from: n0 */
    public final LiveData<Boolean> mo76629n0() {
        return this.f64365f;
    }

    @C12579k
    /* renamed from: o0 */
    public final LiveData<Boolean> mo76630o0() {
        return this.f64366g;
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64365f.mo57495q(wVar);
        mo76630o0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
