package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36693f4;
import com.carrefour.fid.android.databinding.C36703g4;
import com.carrefour.fid.android.databinding.C36773n4;
import com.carrefour.fid.android.databinding.C36783o4;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.carrefour.fid.android.presentation.models.OfferBasketContainAlcoholModel;
import com.carrefour.fid.android.presentation.models.OfferClearModel;
import com.carrefour.fid.android.presentation.models.OfferMixingModel;
import com.carrefour.fid.android.presentation.models.OfferUnavailableModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.C23341a;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketClearViewHolder;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketContainAlcoholViewHolder;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketUnavailableProductListViewHolder;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutViewBinder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutViewBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.w */
public final class C23436w implements C37390r {

    /* renamed from: f */
    public static final int f59281f = 8;
    @C12579k

    /* renamed from: a */
    public final RecyclerView f59282a;
    @C12579k

    /* renamed from: b */
    public final CheckoutAdapter.C23327a f59283b;
    @C12579k

    /* renamed from: c */
    public final C37390r f59284c;

    /* renamed from: d */
    public final int f59285d;

    /* renamed from: e */
    public final int f59286e;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.w$a */
    public static final class C23437a extends C20157j.C20163f<C37369a> {

        /* renamed from: a */
        public final /* synthetic */ C23436w f59287a;

        public C23437a(C23436w wVar) {
            this.f59287a = wVar;
        }

        /* renamed from: d */
        public boolean mo60477a(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if ((aVar instanceof OfferClearModel) && (aVar2 instanceof OfferClearModel)) {
                return true;
            }
            if ((aVar instanceof OfferBasketContainAlcoholModel) && (aVar2 instanceof OfferBasketContainAlcoholModel)) {
                OfferBasketContainAlcoholModel offerBasketContainAlcoholModel = (OfferBasketContainAlcoholModel) aVar;
                OfferBasketContainAlcoholModel offerBasketContainAlcoholModel2 = (OfferBasketContainAlcoholModel) aVar2;
                if (offerBasketContainAlcoholModel.mo121675z() == offerBasketContainAlcoholModel2.mo121675z() && offerBasketContainAlcoholModel.mo121674y() == offerBasketContainAlcoholModel2.mo121674y()) {
                    return true;
                }
                return false;
            } else if ((aVar instanceof OfferUnavailableModel) && (aVar2 instanceof OfferUnavailableModel)) {
                OfferUnavailableModel offerUnavailableModel = (OfferUnavailableModel) aVar;
                OfferUnavailableModel offerUnavailableModel2 = (OfferUnavailableModel) aVar2;
                if (!Intrinsics.areEqual((Object) offerUnavailableModel.mo121760e(), (Object) offerUnavailableModel2.mo121760e()) || offerUnavailableModel.mo121762f() != offerUnavailableModel2.mo121762f()) {
                    return false;
                }
                return true;
            } else if (!(aVar instanceof OfferMixingModel) || !(aVar2 instanceof OfferMixingModel)) {
                return this.f59287a.f59284c.mo67720d().mo60477a(aVar, aVar2);
            } else {
                OfferMixingModel offerMixingModel = (OfferMixingModel) aVar;
                OfferMixingModel offerMixingModel2 = (OfferMixingModel) aVar2;
                if (!Intrinsics.areEqual((Object) offerMixingModel.mo121718a(), (Object) offerMixingModel2.mo121718a()) || !Intrinsics.areEqual((Object) offerMixingModel.mo121719b(), (Object) offerMixingModel2.mo121719b())) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo60478b(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if ((aVar instanceof OfferClearModel) && (aVar2 instanceof OfferClearModel)) {
                return true;
            }
            if ((aVar instanceof OfferBasketContainAlcoholModel) && (aVar2 instanceof OfferBasketContainAlcoholModel)) {
                return true;
            }
            if ((aVar instanceof OfferUnavailableModel) && (aVar2 instanceof OfferUnavailableModel)) {
                return true;
            }
            if (!(aVar instanceof OfferMixingModel) || !(aVar2 instanceof OfferMixingModel)) {
                return this.f59287a.f59284c.mo67720d().mo60478b(aVar, aVar2);
            }
            return true;
        }
    }

    public C23436w(@C12579k RecyclerView recyclerView, @C12579k Resources resources, @C12579k Resources.Theme theme, @C12579k CheckoutAdapter.C23327a aVar, @C12579k C37390r rVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        Intrinsics.checkNotNullParameter(aVar, "basketCallback");
        Intrinsics.checkNotNullParameter(rVar, "nextViewBinder");
        this.f59282a = recyclerView;
        this.f59283b = aVar;
        this.f59284c = rVar;
        this.f59285d = resources.getDimensionPixelSize(R.dimen.ds_border_width_1);
        this.f59286e = resources.getColor(R.color.ds_grey_60, theme);
    }

    @C12580l
    /* renamed from: a */
    public C37375a mo67717a(int i) {
        switch (i) {
            case 11:
            case 12:
            case 13:
            case 14:
                return new C37375a.C37376a().mo113959d(this.f59285d).mo113957b(this.f59286e).mo113956a();
            default:
                return this.f59284c.mo67717a(i);
        }
    }

    /* renamed from: b */
    public int mo67718b(@C12579k C37369a aVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        boolean z3 = true;
        if (aVar instanceof OfferClearModel) {
            z = true;
        } else {
            z = aVar instanceof OfferUnavailableModel;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = aVar instanceof OfferMixingModel;
        }
        if (!z2) {
            z3 = aVar instanceof OfferBasketContainAlcoholModel;
        }
        if (z3) {
            return 2;
        }
        return this.f59284c.mo67718b(aVar);
    }

    @C12580l
    /* renamed from: c */
    public RecyclerView.C20061e0 mo67719c(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        switch (i) {
            case 11:
                C36783o4 d = C36783o4.m150861d(LayoutInflater.from(this.f59282a.getContext()), this.f59282a, false);
                Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
                return new OfferBasketUnavailableProductListViewHolder(d, this.f59283b);
            case 12:
                C36703g4 d2 = C36703g4.m150541d(LayoutInflater.from(this.f59282a.getContext()), this.f59282a, false);
                Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
                return new OfferBasketContainAlcoholViewHolder(d2, this.f59283b);
            case 13:
                C36693f4 d3 = C36693f4.m150501d(LayoutInflater.from(this.f59282a.getContext()), this.f59282a, false);
                Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …, false\n                )");
                return new OfferBasketClearViewHolder(d3, this.f59283b);
            case 14:
                C36773n4 d4 = C36773n4.m150821d(LayoutInflater.from(this.f59282a.getContext()), this.f59282a, false);
                Intrinsics.checkNotNullExpressionValue(d4, "inflate(\n               …, false\n                )");
                return new C23341a(d4);
            default:
                return this.f59284c.mo67719c(i, context);
        }
    }

    @C12579k
    /* renamed from: d */
    public C20157j.C20163f<C37369a> mo67720d() {
        return new C23437a(this);
    }

    /* renamed from: e */
    public boolean mo67721e(@C12579k C37369a aVar, @C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(e0Var, "viewHolder");
        if (aVar instanceof OfferClearModel) {
            return true;
        }
        if (aVar instanceof OfferBasketContainAlcoholModel) {
            ((OfferBasketContainAlcoholViewHolder) e0Var).mo68330d((OfferBasketContainAlcoholModel) aVar);
            C11079d2 d2Var = C11079d2.f28267a;
            return true;
        } else if (aVar instanceof OfferUnavailableModel) {
            ((OfferBasketUnavailableProductListViewHolder) e0Var).mo68336f((OfferUnavailableModel) aVar, i);
            C11079d2 d2Var2 = C11079d2.f28267a;
            return true;
        } else if (!(aVar instanceof OfferMixingModel)) {
            return this.f59284c.mo67721e(aVar, e0Var, i);
        } else {
            ((C23341a) e0Var).mo68363c((OfferMixingModel) aVar);
            C11079d2 d2Var3 = C11079d2.f28267a;
            return true;
        }
    }
}
