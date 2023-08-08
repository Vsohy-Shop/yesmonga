package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39443f;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39654b;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37616h;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0002J\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogFavoriteProductsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/b$b;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/b$c;", "intent", "Lkotlin/d2;", "h0", "(Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "k0", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "i0", "(Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "onlyExpired", "j0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "a", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "getCatalogFavoriteProductsUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "b", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "removeCatalogFavoriteProductUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/h;", "c", "Lcom/carrefour/fid/android/domain/interactors/catalog/h;", "removeCatalogFavoriteListUseCase", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/f;", "d", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/f;", "catalogFavoriteProductsAnalyticsReporter", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/catalog/e;Lcom/carrefour/fid/android/domain/interactors/catalog/i;Lcom/carrefour/fid/android/domain/interactors/catalog/h;Lcom/carrefour/fid/android/catalogs/presentation/analytics/f;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogFavoriteProductsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogFavoriteProductsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogFavoriteProductsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 CatalogFavoriteProductsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogFavoriteProductsViewModel\n*L\n40#1:67\n40#1:68,3\n*E\n"})
public final class CatalogFavoriteProductsViewModel extends BaseMVIViewModel<C39654b.C39656b, C39654b.C39660c> {
    @C12579k

    /* renamed from: a */
    public final C37613e f101187a;
    @C12579k

    /* renamed from: b */
    public final C37618i f101188b;
    @C12579k

    /* renamed from: c */
    public final C37616h f101189c;
    @C12579k

    /* renamed from: d */
    public final C39443f f101190d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CatalogFavoriteProductsViewModel(@C12579k C37613e eVar, @C12579k C37618i iVar, @C12579k C37616h hVar, @C12579k C39443f fVar) {
        super(C39654b.C39656b.C39659c.f101275b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getCatalogFavoriteProductsUseCase");
        Intrinsics.checkNotNullParameter(iVar, "removeCatalogFavoriteProductUseCase");
        Intrinsics.checkNotNullParameter(hVar, "removeCatalogFavoriteListUseCase");
        Intrinsics.checkNotNullParameter(fVar, "catalogFavoriteProductsAnalyticsReporter");
        this.f101187a = eVar;
        this.f101188b = iVar;
        this.f101189c = hVar;
        this.f101190d = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130835g0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$loadFavoriteProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$loadFavoriteProducts$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$loadFavoriteProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$loadFavoriteProducts$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$loadFavoriteProducts$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.catalog.e r6 = r5.f101187a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r5
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x0084
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x0065:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r2 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r2
            com.carrefour.fid.android.catalogs.presentation.models.e r4 = new com.carrefour.fid.android.catalogs.presentation.models.e
            r4.<init>(r2, r3)
            r1.add(r4)
            goto L_0x0065
        L_0x007a:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b$a r6 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b$a
            r2 = 0
            r3 = 2
            r6.<init>(r1, r2, r3, r2)
            r0.publishState(r6)
        L_0x0084:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel.mo130835g0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C39654b.C39660c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (Intrinsics.areEqual((Object) cVar, (Object) C39654b.C39660c.C39662b.f101279a)) {
            Object g0 = mo130835g0(cVar2);
            if (g0 == C11063b.m42612h()) {
                return g0;
            }
            return C11079d2.f28267a;
        }
        if (Intrinsics.areEqual((Object) cVar, (Object) C39654b.C39660c.C39661a.f101277a)) {
            mo130839k0();
        } else if (cVar instanceof C39654b.C39660c.C39665e) {
            Object i0 = mo130837i0(((C39654b.C39660c.C39665e) cVar).mo130940d(), cVar2);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C39654b.C39660c.C39663c.f101281a)) {
            Object j0 = mo130838j0(false, cVar2);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C39654b.C39660c.C39664d.f101283a)) {
            Object j02 = mo130838j0(true, cVar2);
            if (j02 == C11063b.m42612h()) {
                return j02;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130837i0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProduct$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProduct$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProduct$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x006f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel r6 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0058
        L_0x0042:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.catalogs.presentation.analytics.f r7 = r5.f101190d
            r7.mo130531b()
            com.carrefour.fid.android.domain.interactors.catalog.i r7 = r5.f101188b
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r5
        L_0x0058:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x006f
            r2 = r7
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.mo130835g0(r0)
            if (r6 != r1) goto L_0x006f
            return r1
        L_0x006f:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel.mo130837i0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130838j0(boolean r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProducts$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProducts$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel$removeProducts$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel r6 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005f
        L_0x0042:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.catalog.h r7 = r5.f101189c
            com.carrefour.fid.android.domain.interactors.catalog.h$a r2 = new com.carrefour.fid.android.domain.interactors.catalog.h$a
            if (r6 == 0) goto L_0x004e
            com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval r6 = com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval.EXPIRED_ONLY
            goto L_0x0050
        L_0x004e:
            com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval r6 = com.carrefour.fid.android.domain.interactors.catalog.CatalogFavoriteRemoval.f94364b
        L_0x0050:
            r2.<init>(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r6 = r5
        L_0x005f:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x0076
            r2 = r7
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.mo130835g0(r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel.mo130838j0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k0 */
    public final void mo130839k0() {
        this.f101190d.mo130530a();
    }
}
