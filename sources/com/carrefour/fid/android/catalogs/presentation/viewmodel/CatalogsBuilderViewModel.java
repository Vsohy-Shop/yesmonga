package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.catalogs.core.type.CatalogStoreFormat;
import com.carrefour.fid.android.catalogs.core.type.CatalogsType;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39438b;
import com.carrefour.fid.android.catalogs.presentation.models.C39448a;
import com.carrefour.fid.android.catalogs.presentation.models.C39449b;
import com.carrefour.fid.android.catalogs.presentation.models.C39450c;
import com.carrefour.fid.android.catalogs.presentation.models.C39451d;
import com.carrefour.fid.android.catalogs.presentation.models.C39453f;
import com.carrefour.fid.android.catalogs.presentation.models.C39454g;
import com.carrefour.fid.android.catalogs.presentation.models.C39455h;
import com.carrefour.fid.android.catalogs.presentation.models.C39456i;
import com.carrefour.fid.android.catalogs.presentation.models.CatalogsMessageState;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d;
import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import com.carrefour.fid.android.domain.interactors.catalog.C37615g;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.C28995b;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bE\u0010FJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0013\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J:\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u0002J\b\u0010\"\u001a\u00020\u0005H\u0002R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogsBuilderViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/d$b;", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/d$c;", "intent", "Lkotlin/d2;", "q0", "(Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/d$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "p0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "forceStoreDisplayIfAvailable", "m0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "list", "store", "k0", "(Ljava/util/List;ZLcom/carrefour/fid/android/domain/models/service/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/criteo/a;", "criteoBanner", "withError", "i0", "catalogList", "", "numberOfItemBeforeCatalogList", "Lcom/carrefour/fid/android/catalogs/core/type/CatalogsType;", "n0", "withStore", "catalogTabList", "Lcom/carrefour/fid/android/catalogs/presentation/models/b;", "o0", "r0", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/f;", "b", "Lcom/carrefour/fid/android/domain/interactors/catalog/f;", "getCatalogListByStoreIdUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/g;", "c", "Lcom/carrefour/fid/android/domain/interactors/catalog/g;", "getCatalogsListUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/catalog/c;", "getCatalogCriteoBannerUseCase", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/b;", "e", "Lcom/carrefour/fid/android/catalogs/presentation/analytics/b;", "catalogBuilderAnalyticsReporter", "Lcom/carrefour/fid/android/tracking/b;", "f", "Lcom/carrefour/fid/android/tracking/b;", "usabillaEventDispatcher", "Lcom/carrefour/fid/android/tracking/a;", "g", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "h", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "trackingCriteoUseCase", "i", "Lcom/carrefour/fid/android/domain/models/criteo/a;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;Lcom/carrefour/fid/android/domain/interactors/catalog/f;Lcom/carrefour/fid/android/domain/interactors/catalog/g;Lcom/carrefour/fid/android/domain/interactors/catalog/c;Lcom/carrefour/fid/android/catalogs/presentation/analytics/b;Lcom/carrefour/fid/android/tracking/b;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/domain/interactors/criteo/j;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogsBuilderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsBuilderViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogsBuilderViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,285:1\n1#2:286\n1#2:308\n1549#3:287\n1620#3,3:288\n1549#3:301\n1620#3,3:302\n1747#3,3:305\n1549#3:311\n1620#3,2:312\n766#3:314\n857#3,2:315\n1622#3:317\n11653#4,9:291\n13579#4:300\n13580#4:309\n11662#4:310\n*S KotlinDebug\n*F\n+ 1 CatalogsBuilderViewModel.kt\ncom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogsBuilderViewModel\n*L\n216#1:308\n214#1:287\n214#1:288,3\n217#1:301\n217#1:302,3\n220#1:305,3\n263#1:311\n263#1:312,2\n266#1:314\n266#1:315,2\n263#1:317\n216#1:291,9\n216#1:300\n216#1:309\n216#1:310\n*E\n"})
public final class CatalogsBuilderViewModel extends BaseMVIViewModel<C39675d.C39681b, C39675d.C39686c> {
    @C12579k

    /* renamed from: a */
    public final C37832c f101195a;
    @C12579k

    /* renamed from: b */
    public final C37614f f101196b;
    @C12579k

    /* renamed from: c */
    public final C37615g f101197c;
    @C12579k

    /* renamed from: d */
    public final C37611c f101198d;
    @C12579k

    /* renamed from: e */
    public final C39438b f101199e;
    @C12579k

    /* renamed from: f */
    public final C28995b f101200f;
    @C12579k

    /* renamed from: g */
    public final C28994a f101201g;
    @C12579k

    /* renamed from: h */
    public final C37672j f101202h;
    @C12580l

    /* renamed from: i */
    public C37999a f101203i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CatalogsBuilderViewModel(@C12579k C37832c cVar, @C12579k C37614f fVar, @C12579k C37615g gVar, @C12579k C37611c cVar2, @C12579k C39438b bVar, @C12579k C28995b bVar2, @C12579k C28994a aVar, @C12579k C37672j jVar) {
        super(C39675d.C39681b.C39684c.f101310b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cVar, "getFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(fVar, "getCatalogListByStoreIdUseCase");
        Intrinsics.checkNotNullParameter(gVar, "getCatalogsListUseCase");
        Intrinsics.checkNotNullParameter(cVar2, "getCatalogCriteoBannerUseCase");
        Intrinsics.checkNotNullParameter(bVar, "catalogBuilderAnalyticsReporter");
        Intrinsics.checkNotNullParameter(bVar2, "usabillaEventDispatcher");
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(jVar, "trackingCriteoUseCase");
        this.f101195a = cVar;
        this.f101196b = fVar;
        this.f101197c = gVar;
        this.f101198d = cVar2;
        this.f101199e = bVar;
        this.f101200f = bVar2;
        this.f101201g = aVar;
        this.f101202h = jVar;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m161993j0(CatalogsBuilderViewModel catalogsBuilderViewModel, C38163l lVar, List list, C37999a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        catalogsBuilderViewModel.mo130843i0(lVar, list, aVar, z, z2);
    }

    /* renamed from: l0 */
    public static /* synthetic */ Object m161994l0(CatalogsBuilderViewModel catalogsBuilderViewModel, List list, boolean z, C38163l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        return catalogsBuilderViewModel.mo130844k0(list, z, lVar, cVar);
    }

    /* renamed from: i0 */
    public final void mo130843i0(C38163l lVar, List<Catalog> list, C37999a aVar, boolean z, boolean z2) {
        boolean z3;
        List<Catalog> list2;
        boolean z4 = false;
        publishState(new C39675d.C39681b.C39685d(false));
        if (!z2 || lVar == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (list == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list2 = list;
        }
        boolean isEmpty = list2.isEmpty();
        List<CatalogsType> E = CollectionsKt__CollectionsKt.m40441E();
        List i = C10976s.m41417i();
        if (z2) {
            i.add(new C39456i(lVar));
        }
        if (z) {
            if (z3) {
                this.f101199e.mo130518f();
            } else {
                this.f101199e.mo130516d();
            }
            i.add(new C39453f(CatalogsMessageState.LOADING_ERROR, new CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$1(this, z2)));
        } else {
            E = mo130846n0(list, i.size());
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            if (lVar != null) {
                z4 = true;
            }
            i.addAll(mo130847o0(list, z4, z2, E));
        }
        i.add(new C39451d(new CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$2(this, z3, isEmpty)));
        if (lVar != null) {
            i.add(new C39454g(new CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$3(this, isEmpty)));
        }
        if (aVar != null) {
            String l = aVar.mo117379l();
            if (l == null) {
                l = "";
            }
            i.add(new C39450c(l, new CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$4$1(aVar, this)));
        }
        publishState(new C39675d.C39681b.C39682a(lVar, C10976s.m41409a(i), E));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130844k0(java.util.List<com.carrefour.fid.android.domain.models.catalog.Catalog> r16, boolean r17, com.carrefour.fid.android.domain.models.service.models.C38163l r18, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSectionsWithCriteoBanner$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSectionsWithCriteoBanner$1 r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSectionsWithCriteoBanner$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSectionsWithCriteoBanner$1 r2 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSectionsWithCriteoBanner$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L_0x0068
            if (r4 == r5) goto L_0x004c
            if (r4 != r6) goto L_0x0044
            boolean r3 = r2.Z$0
            java.lang.Object r4 = r2.L$2
            com.carrefour.fid.android.domain.models.service.models.l r4 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r4
            java.lang.Object r5 = r2.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00b8
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            boolean r4 = r2.Z$0
            java.lang.Object r5 = r2.L$2
            com.carrefour.fid.android.domain.models.service.models.l r5 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r5
            java.lang.Object r7 = r2.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel r8 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r12 = r4
            r9 = r7
            r7 = r8
            r8 = r5
            goto L_0x0088
        L_0x0068:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.catalog.c r1 = r0.f101198d
            r2.L$0 = r0
            r4 = r16
            r2.L$1 = r4
            r7 = r18
            r2.L$2 = r7
            r8 = r17
            r2.Z$0 = r8
            r2.label = r5
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x0084
            return r3
        L_0x0084:
            r9 = r4
            r12 = r8
            r8 = r7
            r7 = r0
        L_0x0088:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 != 0) goto L_0x00ce
            com.carrefour.fid.android.domain.models.criteo.a r1 = (com.carrefour.fid.android.domain.models.criteo.C37999a) r1
            r7.f101203i = r1
            if (r1 == 0) goto L_0x00c0
            java.lang.String r1 = r1.mo117381n()
            if (r1 == 0) goto L_0x00c0
            com.carrefour.fid.android.domain.interactors.criteo.j r4 = r7.f101202h
            com.carrefour.fid.android.domain.interactors.criteo.j$a r5 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r10 = 0
            r11 = 0
            r5.<init>(r1, r10, r6, r11)
            r2.L$0 = r7
            r2.L$1 = r9
            r2.L$2 = r8
            r2.Z$0 = r12
            r2.label = r6
            java.lang.Object r1 = r4.m172966invokegIAlus(r5, r2)
            if (r1 != r3) goto L_0x00b4
            return r3
        L_0x00b4:
            r2 = r7
            r4 = r8
            r5 = r9
            r3 = r12
        L_0x00b8:
            kotlin.Result.m38701a(r1)
            r6 = r2
            r11 = r3
            r7 = r4
            r8 = r5
            goto L_0x00c4
        L_0x00c0:
            r6 = r7
            r7 = r8
            r8 = r9
            r11 = r12
        L_0x00c4:
            com.carrefour.fid.android.domain.models.criteo.a r9 = r6.f101203i
            r10 = 0
            r12 = 8
            r13 = 0
            m161993j0(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00d6
        L_0x00ce:
            r10 = 0
            r11 = 0
            r13 = 12
            r14 = 0
            m161993j0(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00d6:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel.mo130844k0(java.util.List, boolean, com.carrefour.fid.android.domain.models.service.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130845m0(boolean r20, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$fetchData$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$fetchData$1 r2 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$fetchData$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$fetchData$1 r2 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$fetchData$1
            r2.<init>(r0, r1)
        L_0x001c:
            r7 = r2
            java.lang.Object r1 = r7.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r7.label
            r4 = 5
            r5 = 4
            r6 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L_0x007d
            if (r3 == r10) goto L_0x006e
            if (r3 == r8) goto L_0x005b
            if (r3 == r6) goto L_0x0037
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
        L_0x0037:
            kotlin.C11661u0.m45747n(r1)
            goto L_0x012c
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            boolean r3 = r7.Z$0
            java.lang.Object r5 = r7.L$1
            com.carrefour.fid.android.domain.models.service.models.l r5 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r5
            java.lang.Object r6 = r7.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel r6 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel) r6
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r11 = r5
            r10 = r6
            goto L_0x00d4
        L_0x005b:
            boolean r3 = r7.Z$0
            java.lang.Object r4 = r7.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel r4 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r5 = r3
            r10 = r4
            goto L_0x0106
        L_0x006e:
            boolean r3 = r7.Z$0
            java.lang.Object r10 = r7.L$0
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel r10 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel) r10
            kotlin.C11661u0.m45747n(r1)
            r18 = r3
            r3 = r1
            r1 = r18
            goto L_0x0098
        L_0x007d:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$d r1 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$d
            r1.<init>(r10)
            r0.publishState(r1)
            r7.L$0 = r0
            r1 = r20
            r7.Z$0 = r1
            r7.label = r10
            java.lang.Object r3 = r0.mo130848p0(r7)
            if (r3 != r2) goto L_0x0097
            return r2
        L_0x0097:
            r10 = r0
        L_0x0098:
            com.carrefour.fid.android.domain.models.service.models.l r3 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r3
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$a r15 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$a
            r13 = 0
            r14 = 0
            r16 = 6
            r17 = 0
            r11 = r15
            r12 = r3
            r6 = r15
            r15 = r16
            r16 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            r10.publishState(r6)
            if (r3 == 0) goto L_0x00f5
            if (r1 != 0) goto L_0x00b4
            goto L_0x00f5
        L_0x00b4:
            com.carrefour.fid.android.domain.interactors.catalog.f r6 = r10.f101196b
            java.lang.String r8 = r3.mo119359C()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.catalog.C37978c.m156227b(r8)
            com.carrefour.fid.android.domain.models.catalog.c r8 = com.carrefour.fid.android.domain.models.catalog.C37978c.m156226a(r8)
            r7.L$0 = r10
            r7.L$1 = r3
            r7.Z$0 = r1
            r7.label = r5
            java.lang.Object r5 = r6.m172966invokegIAlus(r8, r7)
            if (r5 != r2) goto L_0x00d1
            return r2
        L_0x00d1:
            r11 = r3
            r3 = r1
            r1 = r5
        L_0x00d4:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r1)
            if (r5 != 0) goto L_0x00e9
            java.util.List r1 = (java.util.List) r1
            r7.L$0 = r9
            r7.L$1 = r9
            r7.label = r4
            java.lang.Object r1 = r10.mo130844k0(r1, r3, r11, r7)
            if (r1 != r2) goto L_0x012c
            return r2
        L_0x00e9:
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 22
            r17 = 0
            m161993j0(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x012c
        L_0x00f5:
            com.carrefour.fid.android.domain.interactors.catalog.g r3 = r10.f101197c
            r7.L$0 = r10
            r7.Z$0 = r1
            r7.label = r8
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r7)
            if (r3 != r2) goto L_0x0104
            return r2
        L_0x0104:
            r5 = r1
            r1 = r3
        L_0x0106:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 != 0) goto L_0x0120
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r8 = 4
            r1 = 0
            r7.L$0 = r9
            r3 = 3
            r7.label = r3
            r3 = r10
            r9 = r1
            java.lang.Object r1 = m161994l0(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L_0x012c
            return r2
        L_0x0120:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 23
            r17 = 0
            m161993j0(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x012c:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel.mo130845m0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final List<CatalogsType> mo130846n0(List<Catalog> list, int i) {
        boolean z;
        if (list != null) {
            Iterable<Catalog> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (Catalog C : iterable) {
                arrayList.add(C.mo117046C());
            }
            List V1 = CollectionsKt___CollectionsKt.m40578V1(arrayList);
            if (V1 != null) {
                CatalogsType[] values = CatalogsType.values();
                ArrayList arrayList2 = new ArrayList();
                for (CatalogsType catalogsType : values) {
                    Iterable<CatalogStoreFormat> r = catalogsType.mo130272r();
                    ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(r, 10));
                    for (CatalogStoreFormat q : r) {
                        arrayList3.add(q.mo130269q());
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (V1.contains((String) it.next())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        catalogsType.mo130274y(i);
                        i++;
                    } else {
                        catalogsType = null;
                    }
                    if (catalogsType != null) {
                        arrayList2.add(catalogsType);
                    }
                }
                return arrayList2;
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    /* renamed from: o0 */
    public final List<C39449b> mo130847o0(List<Catalog> list, boolean z, boolean z2, List<? extends CatalogsType> list2) {
        boolean z3;
        if (list.isEmpty()) {
            if (!z2 || !z) {
                this.f101199e.mo130515c();
            } else {
                this.f101199e.mo130517e();
            }
            return C10976s.m41419k(new C39453f(CatalogsMessageState.EMPTY_LIST, (C11289a) null, 2, (DefaultConstructorMarker) null));
        } else if (z) {
            this.f101199e.mo130519g();
            return C10976s.m41419k(new C39455h(list, new CatalogsBuilderViewModel$getCatalogsList$1(this)));
        } else {
            if (!z2) {
                this.f101199e.mo130513a();
            } else {
                this.f101199e.mo130514b();
            }
            Iterable<CatalogsType> iterable = list2;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (CatalogsType catalogsType : iterable) {
                int w = catalogsType.mo130273w();
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list) {
                    Catalog catalog = (Catalog) next;
                    if (catalogsType.mo130272r().isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = CollectionsKt___CollectionsKt.m40558R1(catalogsType.mo130272r(), CatalogStoreFormat.f100736a.mo130270a(catalog.mo117046C()));
                    }
                    if (z3) {
                        arrayList2.add(next);
                    }
                }
                arrayList.add(new C39448a(w, arrayList2, catalogsType, new CatalogsBuilderViewModel$getCatalogsList$2$2(this)));
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130848p0(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.C38163l> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$getFavoriteStore$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$getFavoriteStore$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$getFavoriteStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$getFavoriteStore$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$getFavoriteStore$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r5 = r4.f101195a
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel.mo130848p0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$processIntent$1 r0 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$processIntent$1 r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$processIntent$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0048
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00bf
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x009d
        L_0x0048:
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0062
        L_0x004c:
            kotlin.C11661u0.m45747n(r9)
            boolean r9 = r8 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39689c
            if (r9 == 0) goto L_0x0065
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$c r8 = (com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39689c) r8
            boolean r8 = r8.mo130994d()
            r0.label = r4
            java.lang.Object r8 = r7.mo130845m0(r8, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0065:
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$e r9 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39691e.f101322a
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x0075
            com.carrefour.fid.android.tracking.b r8 = r7.f101200f
            com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType r9 = com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType.EVENT_CATALOGS
            r8.mo67288d(r9)
            goto L_0x00c2
        L_0x0075:
            boolean r9 = r8 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39690d
            if (r9 == 0) goto L_0x007d
            r7.mo130850r0()
            goto L_0x00c2
        L_0x007d:
            boolean r9 = r8 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39687a
            r2 = 0
            r4 = 0
            if (r9 == 0) goto L_0x00a1
            com.carrefour.fid.android.domain.models.criteo.a r8 = r7.f101203i
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = r8.mo117380m()
            if (r8 == 0) goto L_0x00c2
            com.carrefour.fid.android.domain.interactors.criteo.j r9 = r7.f101202h
            com.carrefour.fid.android.domain.interactors.criteo.j$a r3 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r3.<init>(r8, r4, r5, r2)
            r0.label = r5
            java.lang.Object r8 = r9.m172966invokegIAlus(r3, r0)
            if (r8 != r1) goto L_0x009d
            return r1
        L_0x009d:
            kotlin.Result.m38701a(r8)
            goto L_0x00c2
        L_0x00a1:
            boolean r8 = r8 instanceof com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d.C39686c.C39688b
            if (r8 == 0) goto L_0x00c2
            com.carrefour.fid.android.domain.models.criteo.a r8 = r7.f101203i
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = r8.mo117382o()
            if (r8 == 0) goto L_0x00c2
            com.carrefour.fid.android.domain.interactors.criteo.j r9 = r7.f101202h
            com.carrefour.fid.android.domain.interactors.criteo.j$a r6 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r6.<init>(r8, r4, r5, r2)
            r0.label = r3
            java.lang.Object r8 = r9.m172966invokegIAlus(r6, r0)
            if (r8 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            kotlin.Result.m38701a(r8)
        L_0x00c2:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel.processIntent(com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r0 */
    public final void mo130850r0() {
        this.f101201g.mo32669d(C13758b.f33406C, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33408D, C28932h.f70914a.mo84245o())));
    }
}
