package com.carrefour.fid.android.presentation.p035ui.product.list;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36683e4;
import com.carrefour.fid.android.databinding.C36713h4;
import com.carrefour.fid.android.databinding.C36723i4;
import com.carrefour.fid.android.databinding.C36733j4;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;
import com.carrefour.fid.android.presentation.models.CriteoFlagshipModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25465f;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25467g;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.CriteoButterflyViewHolder;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.CriteoFlagshipViewHolder;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListViewBinder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/ProductListViewBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.a */
public final class C25450a implements C37390r {

    /* renamed from: i */
    public static final int f62609i = 8;
    @C12579k

    /* renamed from: a */
    public final RecyclerView f62610a;
    @C12579k

    /* renamed from: b */
    public final C24646a f62611b;
    @C12579k

    /* renamed from: c */
    public final OfferListAdapter.C25454a f62612c;
    @C12580l

    /* renamed from: d */
    public final C25412b f62613d;
    @C12579k

    /* renamed from: e */
    public final C11300l<CriteoBaseFormatModel, C11079d2> f62614e;
    @C12579k

    /* renamed from: f */
    public final LifecycleCoroutineScope f62615f;

    /* renamed from: g */
    public final int f62616g;

    /* renamed from: h */
    public final int f62617h;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.a$a */
    public static final class C25451a extends C20157j.C20163f<C37369a> {
        /* renamed from: d */
        public boolean mo60477a(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if ((aVar instanceof CriteoButterFlyModel) && (aVar2 instanceof CriteoButterFlyModel)) {
                return false;
            }
            if ((aVar instanceof CriteoFlagshipModel) && (aVar2 instanceof CriteoFlagshipModel)) {
                return false;
            }
            if (((aVar instanceof LuckyCartBannerModel) && (aVar2 instanceof LuckyCartBannerModel)) || !(aVar instanceof OfferDepartmentModel) || !(aVar2 instanceof OfferDepartmentModel)) {
                return false;
            }
            OfferDepartmentModel offerDepartmentModel = (OfferDepartmentModel) aVar;
            OfferDepartmentModel offerDepartmentModel2 = (OfferDepartmentModel) aVar2;
            if (!Intrinsics.areEqual((Object) offerDepartmentModel.mo121689Q(), (Object) offerDepartmentModel2.mo121689Q()) || offerDepartmentModel.mo121688M() != offerDepartmentModel2.mo121688M()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo60478b(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if (!(aVar instanceof CriteoButterFlyModel) || !(aVar2 instanceof CriteoButterFlyModel)) {
                if (!(aVar instanceof CriteoFlagshipModel) || !(aVar2 instanceof CriteoFlagshipModel)) {
                    if (!(aVar instanceof LuckyCartBannerModel) || !(aVar2 instanceof LuckyCartBannerModel)) {
                        if (!(aVar instanceof OfferDepartmentModel) || !(aVar2 instanceof OfferDepartmentModel)) {
                            return false;
                        }
                        return Intrinsics.areEqual((Object) ((OfferDepartmentModel) aVar).mo121690W(), (Object) ((OfferDepartmentModel) aVar2).mo121690W());
                    } else if (((LuckyCartBannerModel) aVar).mo121471id() == ((LuckyCartBannerModel) aVar2).mo121471id()) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (((CriteoFlagshipModel) aVar).mo121471id() == ((CriteoFlagshipModel) aVar2).mo121471id()) {
                    return true;
                } else {
                    return false;
                }
            } else if (((CriteoButterFlyModel) aVar).mo121471id() == ((CriteoButterFlyModel) aVar2).mo121471id()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public final boolean mo74148f(CriteoProductModel criteoProductModel, CriteoProductModel criteoProductModel2) {
            if (criteoProductModel.mo121744l1() == criteoProductModel2.mo121744l1() && criteoProductModel.mo121733N0() == criteoProductModel2.mo121733N0() && criteoProductModel.mo121519p0() == criteoProductModel2.mo121519p0() && criteoProductModel.mo121497A1() == criteoProductModel2.mo121497A1() && Intrinsics.areEqual((Object) criteoProductModel.mo121726A0(), (Object) criteoProductModel2.mo121726A0())) {
                return true;
            }
            return false;
        }
    }

    public C25450a(@C12579k RecyclerView recyclerView, @C12579k Resources resources, @C12579k Resources.Theme theme, @C12579k C24646a aVar, @C12579k OfferListAdapter.C25454a aVar2, @C12580l C25412b bVar, @C12579k C11300l<? super CriteoBaseFormatModel, C11079d2> lVar, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        Intrinsics.checkNotNullParameter(aVar, "productCardCallbacks");
        Intrinsics.checkNotNullParameter(aVar2, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(lVar, "onCriteoProductSelectedCallback");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleScope");
        this.f62610a = recyclerView;
        this.f62611b = aVar;
        this.f62612c = aVar2;
        this.f62613d = bVar;
        this.f62614e = lVar;
        this.f62615f = lifecycleCoroutineScope;
        this.f62616g = resources.getDimensionPixelSize(R.dimen.ds_border_width_1);
        this.f62617h = resources.getColor(R.color.ds_grey_60, theme);
    }

    @C12580l
    /* renamed from: a */
    public C37375a mo67717a(int i) {
        boolean z;
        boolean z2 = false;
        if (i == 4 || i == 6 || i == C11342l0.m43547d(LuckyCartBannerModel.class).hashCode()) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 2) {
            z2 = true;
        }
        if (z2) {
            return new C37375a.C37376a().mo113959d(this.f62616g).mo113957b(this.f62617h).mo113956a();
        }
        return null;
    }

    /* renamed from: b */
    public int mo67718b(@C12579k C37369a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        if (!(aVar instanceof CriteoButterFlyModel) && !(aVar instanceof CriteoFlagshipModel) && !(aVar instanceof LuckyCartBannerModel) && !(aVar instanceof OfferDepartmentModel)) {
            return -1;
        }
        return 2;
    }

    @C12580l
    /* renamed from: c */
    public RecyclerView.C20061e0 mo67719c(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (i == 4) {
            C36713h4 c = C36713h4.m150580c(LayoutInflater.from(this.f62610a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c, "inflate(LayoutInflater.from(recyclerView.context))");
            return new CriteoButterflyViewHolder(c, this.f62611b, this.f62613d, this.f62614e);
        } else if (i == 6) {
            C36723i4 c2 = C36723i4.m150620c(LayoutInflater.from(this.f62610a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c2, "inflate(LayoutInflater.from(recyclerView.context))");
            return new CriteoFlagshipViewHolder(c2, this.f62611b, this.f62613d, this.f62614e, this.f62615f);
        } else if (i == C11342l0.m43547d(LuckyCartBannerModel.class).hashCode()) {
            C36683e4 c3 = C36683e4.m150462c(LayoutInflater.from(this.f62610a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c3, "inflate(LayoutInflater.from(recyclerView.context))");
            return new C25465f(c3, this.f62612c);
        } else if (i != 2) {
            return null;
        } else {
            C36733j4 d = C36733j4.m150661d(LayoutInflater.from(this.f62610a.getContext()), this.f62610a, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …lse\n                    )");
            return new C25467g(d);
        }
    }

    @C12579k
    /* renamed from: d */
    public C20157j.C20163f<C37369a> mo67720d() {
        return new C25451a();
    }

    /* renamed from: e */
    public boolean mo67721e(@C12579k C37369a aVar, @C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(e0Var, "viewHolder");
        if (aVar instanceof CriteoButterFlyModel) {
            ((CriteoButterflyViewHolder) e0Var).mo74149f((CriteoButterFlyModel) aVar, i);
            C11079d2 d2Var = C11079d2.f28267a;
            return true;
        } else if (aVar instanceof LuckyCartBannerModel) {
            ((C25465f) e0Var).mo74235d((LuckyCartBannerModel) aVar);
            C11079d2 d2Var2 = C11079d2.f28267a;
            return true;
        } else if (aVar instanceof OfferDepartmentModel) {
            ((C25467g) e0Var).mo74238c((OfferDepartmentModel) aVar);
            C11079d2 d2Var3 = C11079d2.f28267a;
            return true;
        } else if (!(aVar instanceof CriteoFlagshipModel)) {
            return false;
        } else {
            ((CriteoFlagshipViewHolder) e0Var).mo74157f((CriteoFlagshipModel) aVar, i);
            C11079d2 d2Var4 = C11079d2.f28267a;
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25450a(RecyclerView recyclerView, Resources resources, Resources.Theme theme, C24646a aVar, OfferListAdapter.C25454a aVar2, C25412b bVar, C11300l lVar, LifecycleCoroutineScope lifecycleCoroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, resources, theme, aVar, aVar2, (i & 32) != 0 ? null : bVar, lVar, lifecycleCoroutineScope);
    }
}
