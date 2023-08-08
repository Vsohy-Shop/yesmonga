package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39692e;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28562m;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/StoreCatalogListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/e$b;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/e$c;", "intent", "Lkotlin/d2;", "f0", "(Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/e$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g0", "", "storeId", "e0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/catalog/f;", "a", "Lcom/carrefour/fid/android/domain/interactors/catalog/f;", "getCatalogListByStoreIdUseCase", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "b", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/catalog/f;Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class StoreCatalogListViewModel extends BaseMVIViewModel<C39692e.C39695b, C39692e.C39700c> {
    @C12579k

    /* renamed from: a */
    public final C37614f f101204a;
    @C12579k

    /* renamed from: b */
    public final C13783a f101205b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public StoreCatalogListViewModel(@C12579k C37614f fVar, @C12579k C13783a aVar) {
        super(C39692e.C39695b.C39698c.f101328b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(fVar, "getCatalogListByStoreIdUseCase");
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f101204a = fVar;
        this.f101205b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130854e0(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel$fetchData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel$fetchData$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel$fetchData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel$fetchData$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel$fetchData$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel r5 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d r6 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d
            r6.<init>(r3)
            r4.publishState(r6)
            com.carrefour.fid.android.domain.interactors.catalog.f r6 = r4.f101204a
            java.lang.String r5 = com.carrefour.fid.android.domain.models.catalog.C37978c.m156227b(r5)
            com.carrefour.fid.android.domain.models.catalog.c r5 = com.carrefour.fid.android.domain.models.catalog.C37978c.m156226a(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r5 = r4
        L_0x005c:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0076
            java.util.List r6 = (java.util.List) r6
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d
            r0.<init>(r1)
            r5.publishState(r0)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$a r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$a
            r0.<init>(r6)
            r5.publishState(r0)
            goto L_0x0083
        L_0x0076:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d r6 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$b$d
            r6.<init>(r1)
            r5.publishState(r6)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.e$a$a r6 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39692e.C39693a.C39694a.f101324a
            r5.emitEvent(r6)
        L_0x0083:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel.mo130854e0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C39692e.C39700c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C39692e.C39700c.C39702b) {
            Object e0 = mo130854e0(((C39692e.C39700c.C39702b) cVar).mo131012d(), cVar2);
            if (e0 == C11063b.m42612h()) {
                return e0;
            }
            return C11079d2.f28267a;
        }
        if (Intrinsics.areEqual((Object) cVar, (Object) C39692e.C39700c.C39701a.f101332a)) {
            mo130856g0();
        }
        return C11079d2.f28267a;
    }

    /* renamed from: g0 */
    public final void mo130856g0() {
        C13783a.m58668o(this.f101205b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "promos"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28562m.f69557x)), false, 2, (Object) null);
    }
}
