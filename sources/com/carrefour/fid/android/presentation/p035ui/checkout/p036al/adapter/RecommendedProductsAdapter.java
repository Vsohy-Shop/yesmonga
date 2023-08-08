package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.mapper.C38512k;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25411a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25414c;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25415d;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25416e;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25417f;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.ViewKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductsAdapter */
public final class RecommendedProductsAdapter extends RecyclerView.Adapter<RecyclerView.C20061e0> implements C12074o0 {

    /* renamed from: v */
    public static final int f59085v = 8;
    @C12579k

    /* renamed from: a */
    public final List<OfferProductModel> f59086a;
    @C12580l

    /* renamed from: b */
    public final C25412b f59087b;
    @C12579k

    /* renamed from: c */
    public final C11304p<OfferProductModel, Integer, C11079d2> f59088c;
    @C12579k

    /* renamed from: d */
    public final C11304p<OfferProductModel, Integer, C11079d2> f59089d;
    @C12579k

    /* renamed from: e */
    public final C11304p<OfferProductModel, Integer, C11079d2> f59090e;
    @C12579k

    /* renamed from: f */
    public final C11677z f59091f;
    @C12579k

    /* renamed from: g */
    public final List<Long> f59092g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductsAdapter$a */
    public interface C23337a extends C25416e, C25411a, C25417f, C25414c, C25415d {

        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductsAdapter$a$a */
        public static final class C23338a {
            /* renamed from: a */
            public static void m104179a(@C12579k C23337a aVar) {
            }

            /* renamed from: b */
            public static void m104180b(@C12579k C23337a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
            }

            /* renamed from: c */
            public static void m104181c(@C12579k C23337a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
            }
        }

        /* renamed from: a */
        void mo68187a();

        /* renamed from: b */
        void mo68188b(@C12579k OfferProductModel offerProductModel);

        /* renamed from: c */
        void mo68189c(@C12579k OfferProductModel offerProductModel);
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductsAdapter$b */
    public static final class C23339b extends RecyclerView.C20061e0 {
        public C23339b(ProductCardXsComponent productCardXsComponent) {
            super(productCardXsComponent);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductsAdapter$c */
    public static final class C23340c extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ RecommendedProductsAdapter f59093a;

        /* renamed from: b */
        public final /* synthetic */ Rect f59094b;

        public C23340c(RecommendedProductsAdapter recommendedProductsAdapter, Rect rect) {
            this.f59093a = recommendedProductsAdapter;
            this.f59094b = rect;
        }

        /* renamed from: b */
        public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30662b(recyclerView, i, i2);
            this.f59093a.mo68359o(recyclerView, this.f59094b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendedProductsAdapter(List list, C25412b bVar, C11304p pVar, C11304p pVar2, C11304p pVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : bVar, pVar, pVar2, pVar3);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return C11768d1.m46783e().mo23706a0().mo7443Q(mo68358n());
    }

    public int getItemCount() {
        return this.f59086a.size();
    }

    public long getItemId(int i) {
        return this.f59086a.get(i).mo121471id();
    }

    @C12579k
    public final List<OfferProductModel> getList() {
        return this.f59086a;
    }

    /* renamed from: n */
    public final C11702a0 mo68358n() {
        return (C11702a0) this.f59091f.getValue();
    }

    /* renamed from: o */
    public final void mo68359o(@C12579k RecyclerView recyclerView, @C12579k Rect rect) {
        boolean z;
        C25412b bVar;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(rect, "scrollBounds");
        if (!recyclerView.getLocalVisibleRect(rect) || rect.height() < recyclerView.getHeight()) {
            z = false;
        } else {
            z = true;
        }
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        OfferProductModel offerProductModel = (OfferProductModel) CollectionsKt___CollectionsKt.m40559R2(this.f59086a, ((LinearLayoutManager) layoutManager).mo59435y2());
        if (z && (offerProductModel instanceof CriteoProductModel)) {
            CriteoProductModel criteoProductModel = (CriteoProductModel) offerProductModel;
            if (!this.f59092g.contains(Long.valueOf(criteoProductModel.mo121471id()))) {
                this.f59092g.add(Long.valueOf(criteoProductModel.mo121471id()));
                C25412b bVar2 = this.f59087b;
                if (bVar2 != null) {
                    bVar2.mo68180a(criteoProductModel.mo121520p2());
                }
                if (this.f59092g.size() == 1 && (bVar = this.f59087b) != null) {
                    bVar.mo68182c();
                }
            }
        }
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        OfferProductModel offerProductModel = this.f59086a.get(i);
        View view = e0Var.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent");
        Resources resources = e0Var.itemView.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "holder.itemView.context.resources");
        ((ProductCardXsComponent) view).mo113892x(C38512k.m159778b(offerProductModel, resources, new RecommendedProductsAdapter$onBindViewHolder$1(this, offerProductModel, i), new RecommendedProductsAdapter$onBindViewHolder$2(this, offerProductModel, i), new RecommendedProductsAdapter$onBindViewHolder$3(this, offerProductModel, i), (C11289a) null, (C11289a) null, 48, (Object) null));
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        ProductCardXsComponent productCardXsComponent = new ProductCardXsComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        productCardXsComponent.setLayoutParams(new RecyclerView.C20081p(ViewKt.m119002o(188.0f), ViewKt.m119002o(225.0f)));
        return new C23339b(productCardXsComponent);
    }

    public void onDetachedFromRecyclerView(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        C11723c2.C11724a.m46184b(mo68358n(), (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: p */
    public final void mo68360p(@C12579k RecyclerView recyclerView, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(rect, "scrollBounds");
        mo68359o(recyclerView, rect);
        recyclerView.mo59613r(new C23340c(this, rect));
    }

    /* renamed from: q */
    public final void mo68361q(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "newList");
        List<OfferProductModel> list2 = this.f59086a;
        list2.clear();
        list2.addAll(list);
        this.f59092g.clear();
        notifyDataSetChanged();
    }

    public RecommendedProductsAdapter(@C12579k List<OfferProductModel> list, @C12580l C25412b bVar, @C12579k C11304p<? super OfferProductModel, ? super Integer, C11079d2> pVar, @C12579k C11304p<? super OfferProductModel, ? super Integer, C11079d2> pVar2, @C12579k C11304p<? super OfferProductModel, ? super Integer, C11079d2> pVar3) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(pVar, "onAtcPressed");
        Intrinsics.checkNotNullParameter(pVar2, "onDeletePressed");
        Intrinsics.checkNotNullParameter(pVar3, "onCardPressed");
        this.f59086a = list;
        this.f59087b = bVar;
        this.f59088c = pVar;
        this.f59089d = pVar2;
        this.f59090e = pVar3;
        this.f59091f = C10864b0.m38748c(RecommendedProductsAdapter$supervisorJob$2.f59095f);
        this.f59092g = new ArrayList();
        setHasStableIds(true);
    }
}
