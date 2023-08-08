package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import com.carrefour.fid.android.product.C27457d;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/SlideOfferCellModel;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/cms/presentation/models/SlideOfferCellModel;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleOffersList$1$1 */
public final class HomePageFragment$handleOffersList$1$1 extends Lambda implements C11300l<SlideOfferCellModel, C11079d2> {
    final /* synthetic */ List<SlideOfferCellModel> $listSlideOfferModels;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleOffersList$1$1(HomePageFragment homePageFragment, List<SlideOfferCellModel> list) {
        super(1);
        this.this$0 = homePageFragment;
        this.$listSlideOfferModels = list;
    }

    /* renamed from: a */
    public final void mo70471a(@C12579k SlideOfferCellModel slideOfferCellModel) {
        Intrinsics.checkNotNullParameter(slideOfferCellModel, "it");
        this.this$0.mo70419t1().sendIntent(new C26406a.C26407a.C26425m(this.$listSlideOfferModels.indexOf(slideOfferCellModel)));
        String query = slideOfferCellModel.getQuery();
        if (query != null) {
            HomePageFragment homePageFragment = this.this$0;
            String title = slideOfferCellModel.getTitle();
            String str = "";
            if (title == null) {
                title = str;
            }
            String dates = slideOfferCellModel.getDates();
            if (dates != null) {
                str = dates;
            }
            C19736g.m91827a(homePageFragment).mo58130W(R.id.product_list_query_graph, new C27457d(query, StringsKt__StringsKt.trim(title + "\n" + str).toString()).mo79820h());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70471a((SlideOfferCellModel) obj);
        return C11079d2.f28267a;
    }
}
