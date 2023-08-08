package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39441d;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a;
import com.carrefour.fid.android.domain.interactors.catalog.C37609a;
import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import com.carrefour.fid.android.domain.interactors.catalog.C37612d;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.tracking.C28995b;
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
@C11076d0(mo22515d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\b<\u0010=J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J%\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$b;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$c;", "intent", "Lkotlin/d2;", "j0", "(Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "h0", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "pageNumber", "k0", "searchContent", "i0", "(Lcom/carrefour/fid/android/domain/models/catalog/Catalog;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "", "isFavorite", "slug", "m0", "(Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;ZLjava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "n0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "l0", "Lcom/carrefour/fid/android/domain/interactors/catalog/d;", "a", "Lcom/carrefour/fid/android/domain/interactors/catalog/d;", "getCatalogDetailsUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "b", "Lcom/carrefour/fid/android/domain/interactors/catalog/e;", "getCatalogFavoriteProductsUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/a;", "c", "Lcom/carrefour/fid/android/domain/interactors/catalog/a;", "addCatalogFavoriteProductUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "d", "Lcom/carrefour/fid/android/domain/interactors/catalog/i;", "removeCatalogFavoriteProductUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/c;", "e", "Lcom/carrefour/fid/android/domain/interactors/catalog/c;", "getCatalogCriteoBannerUseCase", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/d;", "f", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/d;", "catalogDetailsAnalyticsReporter", "Lcom/carrefour/fid/android/tracking/b;", "g", "Lcom/carrefour/fid/android/tracking/b;", "usabillaEventDispatcher", "Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;", "h", "Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;", "catalogPreferencesStorage", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/catalog/d;Lcom/carrefour/fid/android/domain/interactors/catalog/e;Lcom/carrefour/fid/android/domain/interactors/catalog/a;Lcom/carrefour/fid/android/domain/interactors/catalog/i;Lcom/carrefour/fid/android/domain/interactors/catalog/c;Lcom/carrefour/fid/android/catalogs/presentation/analytics/d;Lcom/carrefour/fid/android/tracking/b;Lcom/carrefour/fid/android/catalogs/core/datastore/CatalogPreferencesStorage;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogDetailsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n766#2:186\n857#2,2:187\n1549#2:189\n1620#2,2:190\n1747#2,3:192\n1622#2:195\n1549#2:196\n1620#2,3:197\n*S KotlinDebug\n*F\n+ 1 CatalogDetailsViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel\n*L\n112#1:186\n112#1:187,2\n117#1:189\n117#1:190,2\n120#1:192,3\n117#1:195\n161#1:196\n161#1:197,3\n*E\n"})
public final class CatalogDetailsViewModel extends BaseMVIViewModel<C39635a.C39638b, C39635a.C39646c> {
    @C12579k

    /* renamed from: a */
    public final C37612d f101179a;
    @C12579k

    /* renamed from: b */
    public final C37613e f101180b;
    @C12579k

    /* renamed from: c */
    public final C37609a f101181c;
    @C12579k

    /* renamed from: d */
    public final C37618i f101182d;
    @C12579k

    /* renamed from: e */
    public final C37611c f101183e;
    @C12579k

    /* renamed from: f */
    public final C39441d f101184f;
    @C12579k

    /* renamed from: g */
    public final C28995b f101185g;
    @C12579k

    /* renamed from: h */
    public final CatalogPreferencesStorage f101186h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CatalogDetailsViewModel(@C12579k C37612d dVar, @C12579k C37613e eVar, @C12579k C37609a aVar, @C12579k C37618i iVar, @C12579k C37611c cVar, @C12579k C39441d dVar2, @C12579k C28995b bVar, @C12579k CatalogPreferencesStorage catalogPreferencesStorage) {
        super(C39635a.C39638b.C39643e.f101247b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(dVar, "getCatalogDetailsUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getCatalogFavoriteProductsUseCase");
        Intrinsics.checkNotNullParameter(aVar, "addCatalogFavoriteProductUseCase");
        Intrinsics.checkNotNullParameter(iVar, "removeCatalogFavoriteProductUseCase");
        Intrinsics.checkNotNullParameter(cVar, "getCatalogCriteoBannerUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "catalogDetailsAnalyticsReporter");
        Intrinsics.checkNotNullParameter(bVar, "usabillaEventDispatcher");
        Intrinsics.checkNotNullParameter(catalogPreferencesStorage, "catalogPreferencesStorage");
        this.f101179a = dVar;
        this.f101180b = eVar;
        this.f101181c = aVar;
        this.f101182d = iVar;
        this.f101183e = cVar;
        this.f101184f = dVar2;
        this.f101185g = bVar;
        this.f101186h = catalogPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130828h0(com.carrefour.fid.android.domain.models.catalog.Catalog r17, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchCatalogStream$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchCatalogStream$1 r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchCatalogStream$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchCatalogStream$1 r2 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchCatalogStream$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            java.lang.String r5 = ""
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0058
            if (r4 == r8) goto L_0x004a
            if (r4 != r7) goto L_0x0042
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r3 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00c0
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r4 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x007d
        L_0x0058:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r1 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r1.<init>(r8)
            r0.publishState(r1)
            com.carrefour.fid.android.domain.interactors.catalog.d r1 = r0.f101179a
            java.lang.String r4 = r17.mo117073u()
            java.lang.String r4 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156218b(r4)
            com.carrefour.fid.android.domain.models.catalog.b r4 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156217a(r4)
            r2.L$0 = r0
            r2.label = r8
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x007c
            return r3
        L_0x007c:
            r4 = r0
        L_0x007d:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r1)
            r9 = 0
            if (r8 != 0) goto L_0x00e3
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r1 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r1
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r8 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r8.<init>(r9)
            r4.publishState(r8)
            if (r1 == 0) goto L_0x00eb
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$c r8 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$c
            com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails r9 = r1.mo117135g()
            if (r9 == 0) goto L_0x009d
            java.lang.String r9 = r9.mo117179x()
            goto L_0x009e
        L_0x009d:
            r9 = r6
        L_0x009e:
            if (r9 != 0) goto L_0x00a2
            r12 = r5
            goto L_0x00a3
        L_0x00a2:
            r12 = r9
        L_0x00a3:
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r8
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r4.publishState(r8)
            com.carrefour.fid.android.domain.interactors.catalog.c r8 = r4.f101183e
            r2.L$0 = r4
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r2 = r8.m172965invokeIoAF18A(r2)
            if (r2 != r3) goto L_0x00bd
            return r3
        L_0x00bd:
            r3 = r1
            r1 = r2
            r2 = r4
        L_0x00c0:
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x00df
            r4 = r1
            com.carrefour.fid.android.domain.models.criteo.a r4 = (com.carrefour.fid.android.domain.models.criteo.C37999a) r4
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$c r7 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$c
            com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails r8 = r3.mo117135g()
            if (r8 == 0) goto L_0x00d5
            java.lang.String r6 = r8.mo117179x()
        L_0x00d5:
            if (r6 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r5 = r6
        L_0x00d9:
            r7.<init>(r3, r5, r4)
            r2.publishState(r7)
        L_0x00df:
            kotlin.Result.m38701a(r1)
            goto L_0x00eb
        L_0x00e3:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r1 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r1.<init>(r9)
            r4.publishState(r1)
        L_0x00eb:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel.mo130828h0(com.carrefour.fid.android.domain.models.catalog.Catalog, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        if (kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r13, false, 2, (java.lang.Object) null) == true) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
        if (r6 != null) goto L_0x010e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130829i0(com.carrefour.fid.android.domain.models.catalog.Catalog r12, java.lang.String r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchProductList$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchProductList$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchProductList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchProductList$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$fetchProductList$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r12 = r0.L$3
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00be
        L_0x003f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0047:
            java.lang.Object r12 = r0.L$2
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.domain.models.catalog.Catalog r12 = (com.carrefour.fid.android.domain.models.catalog.Catalog) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0094
        L_0x005e:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.catalogs.presentation.analytics.d r5 = r11.f101184f
            java.lang.String r6 = r12.mo117073u()
            java.lang.String r7 = r12.mo117079z()
            java.lang.String r8 = r12.mo117044A()
            java.lang.String r9 = r12.mo117046C()
            java.lang.String r10 = r12.mo117075w()
            r5.mo130526b(r6, r7, r8, r9, r10)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r14 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r14.<init>(r4)
            r11.publishState(r14)
            com.carrefour.fid.android.domain.interactors.catalog.e r14 = r11.f101180b
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r4
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r2 = r11
        L_0x0094:
            boolean r5 = kotlin.Result.m38710j(r14)
            if (r5 == 0) goto L_0x0197
            r5 = r14
            java.util.List r5 = (java.util.List) r5
            com.carrefour.fid.android.domain.interactors.catalog.d r6 = r2.f101179a
            java.lang.String r12 = r12.mo117073u()
            java.lang.String r12 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156218b(r12)
            com.carrefour.fid.android.domain.models.catalog.b r12 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156217a(r12)
            r0.L$0 = r2
            r0.L$1 = r13
            r0.L$2 = r14
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r14 = r6.m172966invokegIAlus(r12, r0)
            if (r14 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r0 = r2
            r12 = r5
        L_0x00be:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r14)
            r2 = 0
            if (r1 != 0) goto L_0x018f
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r14 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r14
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r1 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r1.<init>(r2)
            r0.publishState(r1)
            if (r14 == 0) goto L_0x0197
            java.util.List r14 = com.carrefour.fid.android.domain.models.catalog.details.extension.C37985a.m156311a(r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00e0:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0117
            java.lang.Object r5 = r14.next()
            r6 = r5
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r6
            if (r13 == 0) goto L_0x010c
            if (r6 == 0) goto L_0x0110
            java.lang.String r6 = r6.mo117243z()
            if (r6 == 0) goto L_0x0110
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            if (r6 == 0) goto L_0x0110
            r7 = 0
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r13, (boolean) r2, (int) r3, (java.lang.Object) r7)
            if (r6 != r4) goto L_0x0110
            goto L_0x010e
        L_0x010c:
            if (r6 == 0) goto L_0x0110
        L_0x010e:
            r6 = r4
            goto L_0x0111
        L_0x0110:
            r6 = r2
        L_0x0111:
            if (r6 == 0) goto L_0x00e0
            r1.add(r5)
            goto L_0x00e0
        L_0x0117:
            java.util.List r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40664n2(r1)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r14, r3)
            r1.<init>(r3)
            java.util.Iterator r14 = r14.iterator()
        L_0x012c:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0172
            java.lang.Object r3 = r14.next()
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r3 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r3
            r5 = r12
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x014a
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x014a
        L_0x0148:
            r5 = r2
            goto L_0x0169
        L_0x014a:
            java.util.Iterator r5 = r5.iterator()
        L_0x014e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0148
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r6
            java.lang.String r6 = r6.mo117239w()
            java.lang.String r7 = r3.mo117239w()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x014e
            r5 = r4
        L_0x0169:
            com.carrefour.fid.android.catalogs.presentation.models.e r6 = new com.carrefour.fid.android.catalogs.presentation.models.e
            r6.<init>(r3, r5)
            r1.add(r6)
            goto L_0x012c
        L_0x0172:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L_0x0186
            if (r13 == 0) goto L_0x0180
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$g r12 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39638b.C39645g.f101251b
            r0.publishState(r12)
            goto L_0x0197
        L_0x0180:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$a r12 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39638b.C39639a.f101239b
            r0.publishState(r12)
            goto L_0x0197
        L_0x0186:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b r12 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b
            r12.<init>(r1)
            r0.publishState(r12)
            goto L_0x0197
        L_0x018f:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f r12 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f
            r12.<init>(r2)
            r0.publishState(r12)
        L_0x0197:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel.mo130829i0(com.carrefour.fid.android.domain.models.catalog.Catalog, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: j0 */
    public Object processIntent(@C12579k C39635a.C39646c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C39635a.C39646c.C39648b) {
            Object h0 = mo130828h0(((C39635a.C39646c.C39648b) cVar).mo130902d(), cVar2);
            if (h0 == C11063b.m42612h()) {
                return h0;
            }
            return C11079d2.f28267a;
        }
        if (cVar instanceof C39635a.C39646c.C39649c) {
            C39635a.C39646c.C39649c cVar3 = (C39635a.C39646c.C39649c) cVar;
            mo130831k0(cVar3.mo130909e(), cVar3.mo130911f());
        } else if (cVar instanceof C39635a.C39646c.C39647a) {
            C39635a.C39646c.C39647a aVar = (C39635a.C39646c.C39647a) cVar;
            Object i0 = mo130829i0(aVar.mo130895e(), aVar.mo130897f(), cVar2);
            if (i0 == C11063b.m42612h()) {
                return i0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C39635a.C39646c.C39652f) {
            C39635a.C39646c.C39652f fVar = (C39635a.C39646c.C39652f) cVar;
            Object m0 = mo130833m0(fVar.mo130925f(), fVar.mo130927h(), fVar.mo130926g(), cVar2);
            if (m0 == C11063b.m42612h()) {
                return m0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C39635a.C39646c.C39650d) {
            mo130832l0(((C39635a.C39646c.C39650d) cVar).mo130916d());
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C39635a.C39646c.C39651e.f101263a)) {
            this.f101185g.mo67288d(UsabillaEventType.EVENT_CATALOGS);
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C39635a.C39646c.C39653g.f101269a)) {
            Object n0 = mo130834n0(cVar2);
            if (n0 == C11063b.m42612h()) {
                return n0;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: k0 */
    public final void mo130831k0(Catalog catalog, String str) {
        this.f101184f.mo130525a(catalog.mo117073u(), catalog.mo117079z(), catalog.mo117044A(), catalog.mo117046C(), str);
    }

    /* renamed from: l0 */
    public final void mo130832l0(Catalog catalog) {
        this.f101184f.mo130527c(catalog.mo117079z(), catalog.mo117073u(), catalog.mo117075w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130833m0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6, boolean r7, java.lang.String r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$toggleFavorite$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$toggleFavorite$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$toggleFavorite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$toggleFavorite$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$toggleFavorite$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            boolean r7 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r6 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r6
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r8 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            r9.mo21858l()
            goto L_0x0072
        L_0x0044:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.catalogs.presentation.analytics.d r9 = r5.f101184f
            r9.mo130528d(r7, r6, r8)
            if (r7 == 0) goto L_0x0061
            com.carrefour.fid.android.domain.interactors.catalog.a r8 = r5.f101181c
            r0.L$0 = r5
            r0.L$1 = r6
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r6, r0)
            if (r8 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r8 = r5
            goto L_0x0072
        L_0x0061:
            com.carrefour.fid.android.domain.interactors.catalog.i r8 = r5.f101182d
            r0.L$0 = r5
            r0.L$1 = r6
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.m172966invokegIAlus(r6, r0)
            if (r8 != r1) goto L_0x005f
            return r1
        L_0x0072:
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            boolean r9 = r9 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39638b.C39640b
            if (r9 == 0) goto L_0x00d0
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            java.lang.String r0 = "null cannot be cast to non-null type com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.CatalogDetailsMvi.UiState.CatalogProductListContent"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r0)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b r9 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39638b.C39640b) r9
            com.carrefour.fid.android.shared.base.u$d r1 = r8.getCurrentState()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b r1 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39638b.C39640b) r1
            java.util.List r0 = r1.mo130873h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r0.next()
            com.carrefour.fid.android.catalogs.presentation.models.e r2 = (com.carrefour.fid.android.catalogs.presentation.models.C39452e) r2
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r3 = r2.mo130545e()
            java.lang.String r3 = r3.mo117239w()
            java.lang.String r4 = r6.mo117239w()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x00c5
            com.carrefour.fid.android.catalogs.presentation.models.e r2 = r2.mo130544c(r6, r7)
        L_0x00c5:
            r1.add(r2)
            goto L_0x00a3
        L_0x00c9:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b r6 = r9.mo130872f(r1)
            r8.publishState(r6)
        L_0x00d0:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel.mo130833m0(com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, boolean, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130834n0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$updateCatalogLaunchCount$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$updateCatalogLaunchCount$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$updateCatalogLaunchCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$updateCatalogLaunchCount$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel$updateCatalogLaunchCount$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage r6 = r5.f101186h
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo130257a(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            com.carrefour.fid.android.catalogs.core.datastore.a r6 = (com.carrefour.fid.android.catalogs.core.datastore.C39390a) r6
            com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage r2 = r2.f101186h
            int r6 = r6.mo130264d()
            int r6 = r6 + r4
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo130259c(r6, r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel.mo130834n0(kotlin.coroutines.c):java.lang.Object");
    }
}
