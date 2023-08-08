package com.carrefour.fid.android.presentation.viewmodels.challengeFid;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.analytics.C38359a;
import com.carrefour.fid.android.presentation.analytics.C38360b;
import com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.C25987a;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001J\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001J\u001b\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/ChallengeFidViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/mvi/a$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/mvi/a$b;", "Lcom/carrefour/fid/android/presentation/analytics/a;", "", "screenName", "screenTemplate", "Lkotlin/d2;", "o", "i", "intent", "e0", "(Lcom/carrefour/fid/android/presentation/viewmodels/challengeFid/mvi/a$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "a", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/presentation/analytics/b;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/presentation/analytics/b;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ChallengeFidViewModel extends BaseMVIViewModel<C25987a.C25988a, C25987a.C25989b> implements C38359a {

    /* renamed from: c */
    public static final int f63505c = 8;
    @C12579k

    /* renamed from: a */
    public final LoyaltyPreferencesStorage f63506a;

    /* renamed from: b */
    public final /* synthetic */ C38360b f63507b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ChallengeFidViewModel(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C38360b bVar) {
        super(new C25987a.C25988a((String) null, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(bVar, "analytics");
        this.f63506a = loyaltyPreferencesStorage;
        this.f63507b = bVar;
    }

    @C12580l
    /* renamed from: e0 */
    public Object processIntent(@C12579k C25987a.C25989b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (!Intrinsics.areEqual((Object) bVar, (Object) C25987a.C25989b.C25990a.f63515a)) {
            return C11079d2.f28267a;
        }
        Object f0 = mo75402f0(cVar);
        if (f0 == C11063b.m42612h()) {
            return f0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75402f0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel$showChallengeFidWebView$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel$showChallengeFidWebView$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel$showChallengeFidWebView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel$showChallengeFidWebView$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel$showChallengeFidWebView$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$a r1 = (com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.C25987a.C25988a) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0054
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.shared.base.u$d r5 = r4.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$a r5 = (com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.C25987a.C25988a) r5
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r4.f63506a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r2.getLoyaltyCardNumber(r0)
            if (r0 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x0054:
            java.lang.String r5 = (java.lang.String) r5
            com.carrefour.fid.android.presentation.viewmodels.challengeFid.mvi.a$a r5 = r1.mo75410f(r5)
            r0.publishState(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel.mo75402f0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i */
    public void mo75403i(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        this.f63507b.mo75403i(str, str2);
    }

    /* renamed from: o */
    public void mo75404o(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        this.f63507b.mo75404o(str, str2);
    }
}
