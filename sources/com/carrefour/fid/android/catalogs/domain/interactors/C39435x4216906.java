package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.domain.models.catalog.Catalog;
import java.util.Comparator;
import kotlin.C11076d0;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CatalogsGetCatalogListUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogListUseCase\n*L\n1#1,328:1\n15#2:329\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase$invoke_IoAF18A$lambda$3$$inlined$compareBy$1 */
public final class C39435x4216906<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C11006g.m42424l(((Catalog) t).mo117071t(), ((Catalog) t2).mo117071t());
    }
}
