package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$populateSecondaryTaglineFromOfferList$1 */
public final class BasketBuilderFragment$populateSecondaryTaglineFromOfferList$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ List<OfferDepartmentModel> $departments;
    final /* synthetic */ List<OfferModel> $offerList;
    final /* synthetic */ RecyclerView $recyclerView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketBuilderFragment$populateSecondaryTaglineFromOfferList$1(List<OfferDepartmentModel> list, RecyclerView recyclerView, List<? extends OfferModel> list2) {
        super(1);
        this.$departments = list;
        this.$recyclerView = recyclerView;
        this.$offerList = list2;
    }

    /* renamed from: a */
    public final void mo67977a(int i) {
        OfferDepartmentModel offerDepartmentModel = (OfferDepartmentModel) CollectionsKt___CollectionsKt.m40559R2(this.$departments, i);
        if (offerDepartmentModel != null) {
            RecyclerViewKt.m118876o(this.$recyclerView, this.$offerList.indexOf(offerDepartmentModel));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67977a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
