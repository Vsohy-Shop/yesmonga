package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36693f4;
import com.carrefour.fid.android.databinding.C36703g4;
import com.carrefour.fid.android.databinding.C36733j4;
import com.carrefour.fid.android.databinding.C36773n4;
import com.carrefour.fid.android.databinding.C36783o4;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel;
import com.carrefour.fid.android.presentation.models.OfferClearModel;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferMixingModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.OfferUnavailableModel;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25411a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25417f;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25467g;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25469h;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferProductViewHolder;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.remotedata.C9628n;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter */
public final class CheckoutAdapter extends RecyclerView.Adapter<C25469h> implements C12074o0 {

    /* renamed from: d */
    public static final int f59056d = 8;
    @C12579k

    /* renamed from: a */
    public final C23327a f59057a;
    @C12579k

    /* renamed from: b */
    public final List<OfferModel> f59058b;
    @C12579k

    /* renamed from: c */
    public final C11677z f59059c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter$a */
    public interface C23327a extends C25411a, C25417f, OfferListAdapter.C25454a {

        /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter$a$a */
        public static final class C23328a {
            /* renamed from: a */
            public static void m104125a(@C12579k C23327a aVar) {
                OfferListAdapter.C25454a.C25455a.m109851a(aVar);
            }

            /* renamed from: b */
            public static void m104126b(@C12579k C23327a aVar, @C12579k LuckyCartBannerModel luckyCartBannerModel) {
                Intrinsics.checkNotNullParameter(luckyCartBannerModel, "banner");
                OfferListAdapter.C25454a.C25455a.m109852b(aVar, luckyCartBannerModel);
            }

            /* renamed from: c */
            public static void m104127c(@C12579k C23327a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
                OfferListAdapter.C25454a.C25455a.m109853c(aVar, offerProductModel);
            }

            /* renamed from: d */
            public static void m104128d(@C12579k C23327a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
                OfferListAdapter.C25454a.C25455a.m109854d(aVar, offerProductModel);
            }
        }

        /* renamed from: g */
        void mo68193g(boolean z);

        /* renamed from: k */
        void mo68197k();

        /* renamed from: l */
        void mo68198l(boolean z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutAdapter(C23327a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return C11768d1.m46783e().mo23706a0().mo7443Q(mo68321l());
    }

    public int getItemCount() {
        return this.f59058b.size();
    }

    public long getItemId(int i) {
        return this.f59058b.get(i).mo121471id();
    }

    public int getItemViewType(int i) {
        if (this.f59058b.get(i) instanceof OfferClearModel) {
            return 13;
        }
        if (this.f59058b.get(i) instanceof OfferBasketContainAlcoholModel) {
            return 12;
        }
        if (this.f59058b.get(i) instanceof OfferDepartmentModel) {
            return 2;
        }
        if (this.f59058b.get(i) instanceof OfferProductModel) {
            return 3;
        }
        if (this.f59058b.get(i) instanceof OfferUnavailableModel) {
            return 11;
        }
        if (this.f59058b.get(i) instanceof OfferMixingModel) {
            return 14;
        }
        OfferModel offerModel = this.f59058b.get(i);
        throw new Throwable("Can't get viewType at " + i + ": " + offerModel);
    }

    /* renamed from: k */
    public final void mo68320k(boolean z) {
        notifyItemChanged(0, Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final C11702a0 mo68321l() {
        return (C11702a0) this.f59059c.getValue();
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C25469h hVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "holder");
        if (hVar instanceof OfferBasketClearViewHolder) {
            return;
        }
        if (hVar instanceof OfferBasketContainAlcoholViewHolder) {
            OfferModel offerModel = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel");
            ((OfferBasketContainAlcoholViewHolder) hVar).mo68330d((OfferBasketContainAlcoholModel) offerModel);
        } else if (hVar instanceof C25467g) {
            OfferModel offerModel2 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferDepartmentModel");
            ((C25467g) hVar).mo74238c((OfferDepartmentModel) offerModel2);
        } else if (hVar instanceof OfferProductViewHolder) {
            OfferModel offerModel3 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel3, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
            ((OfferProductViewHolder) hVar).mo74183i((OfferProductModel) offerModel3, true, i);
        } else if (hVar instanceof OfferBasketUnavailableProductListViewHolder) {
            OfferModel offerModel4 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel4, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferUnavailableModel");
            ((OfferBasketUnavailableProductListViewHolder) hVar).mo68336f((OfferUnavailableModel) offerModel4, i);
        } else if (hVar instanceof C23341a) {
            OfferModel offerModel5 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel5, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferMixingModel");
            ((C23341a) hVar).mo68363c((OfferMixingModel) offerModel5);
        }
    }

    /* renamed from: n */
    public void onBindViewHolder(@C12579k C25469h hVar, int i, @C12579k List<Object> list) {
        Intrinsics.checkNotNullParameter(hVar, "holder");
        Intrinsics.checkNotNullParameter(list, C9628n.f26375e);
        if (!(hVar instanceof OfferBasketUnavailableProductListViewHolder) || !(!list.isEmpty())) {
            if (!(hVar instanceof OfferProductViewHolder) || !(!list.isEmpty())) {
                if (!(hVar instanceof C23341a) || !(!list.isEmpty())) {
                    super.onBindViewHolder(hVar, i, list);
                } else if (list.get(0) instanceof OfferMixingModel) {
                    Object obj = list.get(0);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferMixingModel");
                    ((C23341a) hVar).mo68363c((OfferMixingModel) obj);
                } else {
                    OfferModel offerModel = this.f59058b.get(i);
                    Intrinsics.checkNotNull(offerModel, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferMixingModel");
                    ((C23341a) hVar).mo68363c((OfferMixingModel) offerModel);
                }
            } else if (list.get(0) instanceof OfferProductModel) {
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
                ((OfferProductViewHolder) hVar).mo74180G((OfferProductModel) obj2);
            } else {
                OfferModel offerModel2 = this.f59058b.get(i);
                Intrinsics.checkNotNull(offerModel2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
                ((OfferProductViewHolder) hVar).mo74180G((OfferProductModel) offerModel2);
            }
        } else if (list.get(0) instanceof Boolean) {
            OfferModel offerModel3 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel3, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferUnavailableModel");
            Object obj3 = list.get(0);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            ((OfferBasketUnavailableProductListViewHolder) hVar).mo68335e((OfferUnavailableModel) offerModel3, ((Boolean) obj3).booleanValue());
        } else if (list.get(0) instanceof OfferUnavailableModel) {
            OfferModel offerModel4 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel4, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferUnavailableModel");
            ((OfferBasketUnavailableProductListViewHolder) hVar).mo68338i((OfferUnavailableModel) offerModel4);
        } else {
            OfferModel offerModel5 = this.f59058b.get(i);
            Intrinsics.checkNotNull(offerModel5, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferUnavailableModel");
            ((OfferBasketUnavailableProductListViewHolder) hVar).mo68338i((OfferUnavailableModel) offerModel5);
        }
    }

    @C12579k
    /* renamed from: o */
    public C25469h onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 2) {
            C36733j4 d = C36733j4.m150661d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
            return new C25467g(d);
        } else if (i != 3) {
            switch (i) {
                case 11:
                    C36783o4 d2 = C36783o4.m150861d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …rent, false\n            )");
                    return new OfferBasketUnavailableProductListViewHolder(d2, this.f59057a);
                case 12:
                    C36703g4 d3 = C36703g4.m150541d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …rent, false\n            )");
                    return new OfferBasketContainAlcoholViewHolder(d3, this.f59057a);
                case 13:
                    C36693f4 d4 = C36693f4.m150501d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(d4, "inflate(\n               …rent, false\n            )");
                    return new OfferBasketClearViewHolder(d4, this.f59057a);
                case 14:
                    C36773n4 d5 = C36773n4.m150821d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(d5, "inflate(\n               …rent, false\n            )");
                    return new C23341a(d5);
                default:
                    throw new Throwable("Unavailable viewType (" + i + ")");
            }
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_offer_product, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …r_product, parent, false)");
            return new OfferProductViewHolder(inflate, this.f59057a, getCoroutineContext());
        }
    }

    /* renamed from: p */
    public final void mo68325p(@C12579k List<? extends OfferModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<OfferModel> list2 = this.f59058b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public CheckoutAdapter(@C12579k C23327a aVar, @C12579k List<OfferModel> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f59057a = aVar;
        this.f59058b = list;
        this.f59059c = C10864b0.m38748c(CheckoutAdapter$supervisorJob$2.f59060f);
        setHasStableIds(true);
    }
}
