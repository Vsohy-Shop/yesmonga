package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.cms.domain.interactors.GetCheckoutCgvUseCase;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26075b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutCgvViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$d;", "intent", "Lkotlin/d2;", "f0", "(Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "e0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$a;", "partialState", "g0", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCheckoutCgvUseCase;", "a", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCheckoutCgvUseCase;", "getCheckoutCgvUseCase", "<init>", "(Lcom/carrefour/fid/android/cms/domain/interactors/GetCheckoutCgvUseCase;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel */
public final class CheckoutCgvViewModel extends BaseMVIViewModel<C26075b.C26080b, C26075b.C26083d> {

    /* renamed from: b */
    public static final int f63517b = 8;
    @C12579k

    /* renamed from: a */
    public final GetCheckoutCgvUseCase f63518a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CheckoutCgvViewModel(@C12579k GetCheckoutCgvUseCase getCheckoutCgvUseCase) {
        super(new C26075b.C26080b(false, (String) null, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getCheckoutCgvUseCase, "getCheckoutCgvUseCase");
        this.f63518a = getCheckoutCgvUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75414e0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel$loadCheckoutCgvInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel$loadCheckoutCgvInfo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel$loadCheckoutCgvInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel$loadCheckoutCgvInfo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel$loadCheckoutCgvInfo$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$c r5 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$c
            r5.<init>(r3)
            r4.mo75416g0(r5)
            com.carrefour.fid.android.cms.domain.interactors.GetCheckoutCgvUseCase r5 = r4.f63518a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m173120invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
        L_0x0054:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0065
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$b r2 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$b
            r2.<init>(r1)
            r0.mo75416g0(r2)
        L_0x0065:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 == 0) goto L_0x007c
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$c$a r1 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$c$a
            r1.<init>(r5)
            r0.emitEvent(r1)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$c r5 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$c
            r1 = 0
            r5.<init>(r1)
            r0.mo75416g0(r5)
        L_0x007c:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel.mo75414e0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C26075b.C26083d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (!(dVar instanceof C26075b.C26083d.C26084a)) {
            return C11079d2.f28267a;
        }
        Object e0 = mo75414e0(cVar);
        if (e0 == C11063b.m42612h()) {
            return e0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: g0 */
    public final void mo75416g0(C26075b.C26076a aVar) {
        reduceAndPublishState(C26075b.f63709a.mo75718a(), aVar);
    }
}
