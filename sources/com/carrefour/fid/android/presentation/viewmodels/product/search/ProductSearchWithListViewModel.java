package com.carrefour.fid.android.presentation.viewmodels.product.search;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c;
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
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/c$c;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/c$d;", "intent", "Lkotlin/d2;", "h0", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/c$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "", "searchListItems", "i0", "(Ljava/util/Set;Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchWithListHistoryUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchWithListHistoryUseCase;", "getSearchWithListHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/SetSearchWithListHistoryUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/product/search/SetSearchWithListHistoryUseCase;", "setSearchWithListHistoryUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;", "searchWithListUseCase", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/search/GetSearchWithListHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/SetSearchWithListHistoryUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ProductSearchWithListViewModel extends BaseMVIViewModel<C27323c.C27331c, C27323c.C27332d> {

    /* renamed from: d */
    public static final int f66235d = 8;
    @C12579k

    /* renamed from: a */
    public final GetSearchWithListHistoryUseCase f66236a;
    @C12579k

    /* renamed from: b */
    public final SetSearchWithListHistoryUseCase f66237b;
    @C12579k

    /* renamed from: c */
    public final SearchWithListUseCase f66238c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ProductSearchWithListViewModel(@C12579k GetSearchWithListHistoryUseCase getSearchWithListHistoryUseCase, @C12579k SetSearchWithListHistoryUseCase setSearchWithListHistoryUseCase, @C12579k SearchWithListUseCase searchWithListUseCase) {
        super(new C27323c.C27331c(false, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getSearchWithListHistoryUseCase, "getSearchWithListHistoryUseCase");
        Intrinsics.checkNotNullParameter(setSearchWithListHistoryUseCase, "setSearchWithListHistoryUseCase");
        Intrinsics.checkNotNullParameter(searchWithListUseCase, "searchWithListUseCase");
        this.f66236a = getSearchWithListHistoryUseCase;
        this.f66237b = setSearchWithListHistoryUseCase;
        this.f66238c = searchWithListUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79289g0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$getSavedSearchList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$getSavedSearchList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$getSavedSearchList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$getSavedSearchList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$getSavedSearchList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase r5 = r4.f66236a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172998invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r5)
            if (r1 == 0) goto L_0x005e
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$a r1 = new com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$a
            java.util.Set r2 = kotlin.collections.C10930d1.m40892k()
            r1.<init>(r2)
            r0.emitEvent(r1)
        L_0x005e:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x006e
            java.util.Set r5 = (java.util.Set) r5
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$a r1 = new com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$a
            r1.<init>(r5)
            r0.emitEvent(r1)
        L_0x006e:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel.mo79289g0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C27323c.C27332d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (dVar instanceof C27323c.C27332d.C27333a) {
            Object g0 = mo79289g0(cVar);
            if (g0 == C11063b.m42612h()) {
                return g0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C27323c.C27332d.C27334b) {
            Object i0 = mo79291i0(((C27323c.C27332d.C27334b) dVar).mo79547d(), cVar);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else if (!(dVar instanceof C27323c.C27332d.C27335c)) {
            return C11079d2.f28267a;
        } else {
            Object j0 = mo79292j0(((C27323c.C27332d.C27335c) dVar).mo79553d(), cVar);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79291i0(java.util.Set<java.lang.String> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$saveSearchList$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$saveSearchList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$saveSearchList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$saveSearchList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$saveSearchList$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.mo21858l()
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase r6 = r4.f66237b
            com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase$a
            r2.<init>(r5)
            r0.label = r3
            java.lang.Object r5 = r6.m173002invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel.mo79291i0(java.util.Set, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79292j0(java.util.Set<java.lang.String> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$search$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$search$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$search$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$search$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel$search$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.base.u$d r6 = r4.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$c r6 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c.C27331c) r6
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$c r6 = r6.mo79541f(r3)
            r4.publishState(r6)
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase r6 = r4.f66238c
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m173001invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r5 = r4
        L_0x005f:
            boolean r0 = kotlin.Result.m38709i(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0071
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$b r6 = new com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$b
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$a$a r0 = com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c.C27324a.C27325a.f66362a
            r6.<init>(r0)
            r5.emitEvent(r6)
            goto L_0x00a3
        L_0x0071:
            boolean r0 = kotlin.Result.m38709i(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0079
            r6 = r2
        L_0x0079:
            com.carrefour.fid.android.data.entities.APIMRecommendedNeeds r6 = (com.carrefour.fid.android.data.entities.APIMRecommendedNeeds) r6
            if (r6 == 0) goto L_0x0081
            java.util.HashMap r2 = com.carrefour.fid.android.data.entities.extension.C36446e.m149515a(r6)
        L_0x0081:
            if (r2 == 0) goto L_0x008b
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r3 = r1
        L_0x008b:
            if (r3 == 0) goto L_0x009b
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$c r6 = new com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.<init>(r0)
            r5.emitEvent(r6)
            goto L_0x00a3
        L_0x009b:
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$c r6 = new com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$c
            r6.<init>(r2)
            r5.emitEvent(r6)
        L_0x00a3:
            com.carrefour.fid.android.shared.base.u$d r6 = r5.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$c r6 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c.C27331c) r6
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$c r6 = r6.mo79541f(r1)
            r5.publishState(r6)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel.mo79292j0(java.util.Set, kotlin.coroutines.c):java.lang.Object");
    }
}
