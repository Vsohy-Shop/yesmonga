package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAlternativeProductsBottomSheetStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,485:1\n1549#2:486\n1620#2,3:487\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsBottomSheetStateful.kt\ncom/carrefour/fid/android/product/presentation/ui/bottomsheet/AlternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$4\n*L\n406#1:486\n406#1:487,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$4 */
public final class C27702x487596ca extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ String $initialProductGtin;
    final /* synthetic */ C28892e<List<C38114b>> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27702x487596ca(C28892e<? extends List<C38114b>> eVar, C27631a aVar, String str) {
        super(0);
        this.$state = eVar;
        this.$analytics = aVar;
        this.$initialProductGtin = str;
    }

    @C12579k
    public final Boolean invoke() {
        C28892e<List<C38114b>> eVar = this.$state;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type com.carrefour.fid.android.shared.type.ResultState.Success<kotlin.collections.List<com.carrefour.fid.android.domain.models.product.plp.PlpItemData>>");
        List list = (List) ((C28892e.C28895c) eVar).mo84088d();
        List X1 = CollectionsKt___CollectionsKt.m40588X1(list, 1);
        if (X1.isEmpty()) {
            this.$analytics.mo80247h(this.$initialProductGtin);
        } else {
            C27631a aVar = this.$analytics;
            C38115c j = ((C38114b) list.get(0)).mo118842j();
            Iterable<C38114b> iterable = X1;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38114b j2 : iterable) {
                arrayList.add(j2.mo118842j());
            }
            aVar.mo80248i(j, arrayList);
        }
        return Boolean.TRUE;
    }
}
