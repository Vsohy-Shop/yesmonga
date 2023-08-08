package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39446h;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39666c;
import com.carrefour.fid.android.domain.interactors.catalog.C37609a;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
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
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogProductDetailsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/c$b;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/c$c;", "intent", "Lkotlin/d2;", "g0", "(Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/c$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "f0", "(Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "isFavorite", "h0", "(Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "a", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "getCatalogFavoriteProductsUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/a;", "b", "Lcom/carrefour/fid/android/domain/interactors/catalog/a;", "addCatalogFavoriteProductUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "c", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "removeCatalogFavoriteProductUseCase", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/h;", "d", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/h;", "catalogProductDetailsAnalyticsReporter", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/catalog/e;Lcom/carrefour/fid/android/domain/interactors/catalog/a;Lcom/carrefour/fid/android/domain/interactors/catalog/i;Lcom/carrefour/fid/android/catalogs/presentation/analytics/h;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogProductDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogProductDetailsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogProductDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1747#2,3:53\n*S KotlinDebug\n*F\n+ 1 CatalogProductDetailsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogProductDetailsViewModel\n*L\n32#1:53,3\n*E\n"})
public final class CatalogProductDetailsViewModel extends BaseMVIViewModel<C39666c.C39668b, C39666c.C39672c> {
    @C12579k

    /* renamed from: a */
    public final C37613e f101191a;
    @C12579k

    /* renamed from: b */
    public final C37609a f101192b;
    @C12579k

    /* renamed from: c */
    public final C37618i f101193c;
    @C12579k

    /* renamed from: d */
    public final C39446h f101194d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CatalogProductDetailsViewModel(@C12579k C37613e eVar, @C12579k C37609a aVar, @C12579k C37618i iVar, @C12579k C39446h hVar) {
        super(C39666c.C39668b.C39670b.f101288b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getCatalogFavoriteProductsUseCase");
        Intrinsics.checkNotNullParameter(aVar, "addCatalogFavoriteProductUseCase");
        Intrinsics.checkNotNullParameter(iVar, "removeCatalogFavoriteProductUseCase");
        Intrinsics.checkNotNullParameter(hVar, "catalogProductDetailsAnalyticsReporter");
        this.f101191a = eVar;
        this.f101192b = aVar;
        this.f101193c = iVar;
        this.f101194d = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130840f0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$checkIfProductIsFavorite$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$checkIfProductIsFavorite$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$checkIfProductIsFavorite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$checkIfProductIsFavorite$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$checkIfProductIsFavorite$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0052
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.catalog.e r7 = r5.f101191a
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r5
        L_0x0052:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x0092
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x006c
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x006c
        L_0x006a:
            r3 = r2
            goto L_0x008a
        L_0x006c:
            java.util.Iterator r7 = r7.iterator()
        L_0x0070:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r7.next()
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r1
            java.lang.String r1 = r1.mo117239w()
            java.lang.String r4 = r6.mo117239w()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x0070
        L_0x008a:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b$c r6 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b$c
            r6.<init>(r3)
            r0.publishState(r6)
        L_0x0092:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel.mo130840f0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: g0 */
    public Object processIntent(@C12579k C39666c.C39672c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C39666c.C39672c.C39673a) {
            Object f0 = mo130840f0(((C39666c.C39672c.C39673a) cVar).mo130952d(), cVar2);
            if (f0 == C11063b.m42612h()) {
                return f0;
            }
            return C11079d2.f28267a;
        } else if (!(cVar instanceof C39666c.C39672c.C39674b)) {
            return C11079d2.f28267a;
        } else {
            C39666c.C39672c.C39674b bVar = (C39666c.C39672c.C39674b) cVar;
            Object h0 = mo130842h0(bVar.mo130959e(), bVar.mo130961f(), cVar2);
            if (h0 == C11063b.m42612h()) {
                return h0;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130842h0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r9, boolean r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$toggleFavorite$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$toggleFavorite$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$toggleFavorite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$toggleFavorite$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel$toggleFavorite$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r7) goto L_0x004e
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            goto L_0x004a
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r9 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel r10 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00a3
        L_0x004a:
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00bc
        L_0x004e:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r9 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel r10 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x007a
        L_0x0060:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.catalogs.presentation.analytics.h r11 = r8.f101194d
            r11.mo130533a(r10, r9)
            if (r10 == 0) goto L_0x0093
            com.carrefour.fid.android.domain.interactors.catalog.a r10 = r8.f101192b
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r7
            java.lang.Object r11 = r10.m172966invokegIAlus(r9, r0)
            if (r11 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r10 = r8
        L_0x007a:
            boolean r2 = kotlin.Result.m38710j(r11)
            if (r2 == 0) goto L_0x00bc
            r2 = r11
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            r0.L$0 = r11
            r0.L$1 = r3
            r0.label = r6
            java.lang.Object r9 = r10.mo130840f0(r9, r0)
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x0093:
            com.carrefour.fid.android.domain.interactors.catalog.i r10 = r8.f101193c
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r11 = r10.m172966invokegIAlus(r9, r0)
            if (r11 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r10 = r8
        L_0x00a3:
            boolean r2 = kotlin.Result.m38710j(r11)
            if (r2 == 0) goto L_0x00bc
            r2 = r11
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            r0.L$0 = r11
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r9 = r10.mo130840f0(r9, r0)
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel.mo130842h0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
