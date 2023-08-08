package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36309h;
import com.carrefour.fid.android.databinding.C36834t5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.presentation.components.image.OfferFlagListView;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.RecommendedProductsAdapter;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRecommendedProductViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendedProductViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,246:1\n262#2,2:247\n262#2,2:249\n260#2:251\n262#2,2:252\n*S KotlinDebug\n*F\n+ 1 RecommendedProductViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/RecommendedProductViewHolder\n*L\n52#1:247,2\n105#1:249,2\n109#1:251\n235#1:252,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductViewHolder */
public final class RecommendedProductViewHolder extends RecyclerView.C20061e0 {

    /* renamed from: e */
    public static final int f59080e = 8;
    @C12579k

    /* renamed from: a */
    public final C36834t5 f59081a;
    @C12579k

    /* renamed from: b */
    public final RecommendedProductsAdapter.C23337a f59082b;
    @C12579k

    /* renamed from: c */
    public final CoroutineContext f59083c;
    @C12579k

    /* renamed from: d */
    public final C11677z f59084d = C10864b0.m38748c(new RecommendedProductViewHolder$viewHolderLifeCycleScope$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendedProductViewHolder(@C12579k C36834t5 t5Var, @C12579k RecommendedProductsAdapter.C23337a aVar, @C12579k CoroutineContext coroutineContext) {
        super(t5Var.getRoot());
        Intrinsics.checkNotNullParameter(t5Var, "binding");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f59081a = t5Var;
        this.f59082b = aVar;
        this.f59083c = coroutineContext;
    }

    /* renamed from: i */
    public static final void m104151i(RecommendedProductViewHolder recommendedProductViewHolder, OfferProductModel offerProductModel, int i, View view) {
        Intrinsics.checkNotNullParameter(recommendedProductViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(offerProductModel, "$offerModel");
        recommendedProductViewHolder.mo68343j();
        ProgressBar progressBar = recommendedProductViewHolder.f59081a.f91693j;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressOfferProductShoppingList");
        ViewKt.m152123e(progressBar, (Integer) null, false, (C11289a) null, 7, (Object) null);
        if (view.isActivated()) {
            recommendedProductViewHolder.f59082b.mo68196j(offerProductModel, i);
        } else {
            recommendedProductViewHolder.f59082b.mo68191e(offerProductModel, i);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m104152n(RecommendedProductViewHolder recommendedProductViewHolder, OfferProductModel offerProductModel, int i, Object obj) {
        if ((i & 1) != 0) {
            offerProductModel = null;
        }
        recommendedProductViewHolder.mo68346m(offerProductModel);
    }

    /* renamed from: p */
    public static /* synthetic */ void m104153p(RecommendedProductViewHolder recommendedProductViewHolder, OfferProductModel offerProductModel, int i, Object obj) {
        if ((i & 1) != 0) {
            offerProductModel = null;
        }
        recommendedProductViewHolder.mo68347o(offerProductModel);
    }

    /* renamed from: h */
    public final void mo68342h(@C12579k OfferProductModel offerProductModel, int i) {
        int i2;
        List list;
        String str;
        String str2;
        boolean z;
        boolean z2;
        List<OfferFlag> t;
        Intrinsics.checkNotNullParameter(offerProductModel, "offerModel");
        ImageView imageView = this.f59081a.f91689f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageOfferProductOriginFrance");
        int i3 = 8;
        if (OfferProductModelKt.m159553B(offerProductModel)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.f59081a.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
        String d = C36309h.m148964d(offerProductModel, (String) null, 1, (Object) null);
        ImageView imageView2 = this.f59081a.f91687d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageOfferProduct");
        imageUtils.mo84101e(context, d, imageView2, R.drawable.ic_product_placeholder);
        OfferFlagListView offerFlagListView = this.f59081a.f91688e;
        Intrinsics.checkNotNullExpressionValue(offerFlagListView, "binding.imageOfferProductFlags");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 == null || (t = o0.mo121890t()) == null) {
            list = null;
        } else {
            list = CollectionsKt___CollectionsKt.m40497E5(t, 3);
        }
        OfferFlagListView.m158880c(offerFlagListView, list, (OfferFlagListView.C38373a) null, R.dimen.ds_spacing_m, R.dimen.ds_spacing_xxxs, 2, (Object) null);
        OfferProductModelKt.m159559H(offerProductModel, this.f59081a.f91694k);
        TextView textView = this.f59081a.f91702s;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str = o02.mo121898z();
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = this.f59081a.f91697n;
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str2 = o03.mo121896x();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        OfferProductModelKt.m159558G(offerProductModel, this.f59081a.f91695l);
        OfferProductModelKt.m159560I(offerProductModel, this.f59081a.f91696m);
        OfferProductModelKt.m159564M(offerProductModel, this.f59081a.f91699p);
        C36834t5 t5Var = this.f59081a;
        OfferProductModelKt.m159562K(offerProductModel, t5Var.f91698o, t5Var.f91703t);
        OfferProductModelKt.m159561J(offerProductModel, this.f59081a.f91701r);
        mo68348q(offerProductModel, i);
        ImageButton imageButton = this.f59081a.f91686c;
        if (offerProductModel.mo121497A1()) {
            z = true;
        } else {
            z = false;
        }
        imageButton.setActivated(z);
        imageButton.setEnabled(true);
        imageButton.setOnClickListener(new C23344c(this, offerProductModel, i));
        TextView textView3 = this.f59081a.f91700q;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.textOfferProductSponsored");
        if (offerProductModel instanceof CriteoProductModel) {
            i3 = 0;
        }
        textView3.setVisibility(i3);
        mo68346m(offerProductModel);
        QuantityView quantityView = this.f59081a.f91690g;
        Intrinsics.checkNotNullExpressionValue(quantityView, "binding.layoutOfferProductQuantity");
        if (quantityView.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.areEqual((Object) offerProductModel.mo121728E1(), (Object) Boolean.TRUE)) {
            this.f59081a.f91690g.mo81307v(false);
        } else {
            mo68343j();
            this.f59081a.f91690g.mo81307v(true);
        }
        ConstraintLayout b = this.f59081a.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(b), 300), C11768d1.m46783e()), new RecommendedProductViewHolder$bind$2(this, offerProductModel, (C11045c<? super RecommendedProductViewHolder$bind$2>) null)), mo68345l());
    }

    /* renamed from: j */
    public final void mo68343j() {
        this.f59081a.f91685b.setEnabled(false);
        this.f59081a.f91686c.setEnabled(false);
        this.f59081a.getRoot().setEnabled(false);
        this.f59081a.f91690g.setEnabled(false);
    }

    @C12579k
    /* renamed from: k */
    public final C36834t5 mo68344k() {
        return this.f59081a;
    }

    /* renamed from: l */
    public final C12074o0 mo68345l() {
        return (C12074o0) this.f59084d.getValue();
    }

    /* renamed from: m */
    public final void mo68346m(@C12580l OfferProductModel offerProductModel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> t;
        if (offerProductModel != null) {
            ConstraintLayout b = this.f59081a.getRoot();
            if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            b.setActivated(z);
            b.setEnabled(b.isActivated());
            ImageButton imageButton = this.f59081a.f91686c;
            if (offerProductModel.mo121497A1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            imageButton.setActivated(z2);
            imageButton.setEnabled(true);
            this.f59081a.f91693j.setVisibility(8);
            OfferDiscountDomain w = offerProductModel.mo121523w();
            if (w == null || (t = w.mo115953t()) == null) {
                z3 = false;
            } else {
                z3 = !t.isEmpty();
            }
            Boolean A0 = offerProductModel.mo121726A0();
            if (A0 != null) {
                z4 = A0.booleanValue();
            } else {
                z4 = false;
            }
            if (z3) {
                if (z4) {
                    if (offerProductModel.mo121519p0() == 1) {
                        this.f59081a.f91692i.mo121264F(offerProductModel, this.f59082b);
                    }
                } else if (this.f59081a.f91691h.mo121253F(offerProductModel)) {
                    this.f59082b.mo68187a();
                }
            }
            QuantityView quantityView = this.f59081a.f91690g;
            Intrinsics.checkNotNullExpressionValue(quantityView, "binding.layoutOfferProductQuantity");
            QuantityView.m117255y(quantityView, OfferProductModelKt.m159573V(offerProductModel), false, 2, (Object) null);
            mo68347o(offerProductModel);
        }
    }

    /* renamed from: o */
    public final void mo68347o(OfferProductModel offerProductModel) {
        boolean z;
        ImageButton imageButton = this.f59081a.f91685b;
        boolean z2 = true;
        imageButton.setEnabled(true);
        Intrinsics.checkNotNullExpressionValue(imageButton, "updatePurchaseButton$lambda$6");
        int i = 0;
        if (offerProductModel == null || OfferProductModelKt.m159554C(offerProductModel)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || offerProductModel.mo121519p0() != 0) {
            z2 = false;
        }
        if (!z2) {
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    /* renamed from: q */
    public final void mo68348q(OfferProductModel offerProductModel, int i) {
        Offer V = OfferProductModelKt.m159573V(offerProductModel);
        C36834t5 t5Var = this.f59081a;
        QuantityView quantityView = t5Var.f91690g;
        ImageButton imageButton = t5Var.f91685b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.buttonOfferProductPurchase");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(imageButton), C11768d1.m46783e()), new RecommendedProductViewHolder$updateQuantity$1$1(this, V, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$1>) null)), 300), C11768d1.m46783e()), new RecommendedProductViewHolder$updateQuantity$1$2(this, offerProductModel, i, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$2>) null)), mo68345l());
        ImageButton imageButton2 = quantityView.getViewBinding().f66715b;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "getViewBinding().buttonProductQuantityAdd");
        int i2 = i;
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(imageButton2), C11768d1.m46781c()), new RecommendedProductViewHolder$updateQuantity$1$3(quantityView, V, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$3>) null)), 500), C11768d1.m46783e()), new RecommendedProductViewHolder$updateQuantity$1$4(this, quantityView, offerProductModel, i2, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$4>) null)), mo68345l());
        ImageButton imageButton3 = quantityView.getViewBinding().f66716c;
        Intrinsics.checkNotNullExpressionValue(imageButton3, "getViewBinding().buttonProductQuantityRemove");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(imageButton3), C11768d1.m46781c()), new RecommendedProductViewHolder$updateQuantity$1$5(offerProductModel, quantityView, V, this, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$5>) null)), 500), C11768d1.m46783e()), new RecommendedProductViewHolder$updateQuantity$1$6(this, quantityView, offerProductModel, i2, (C11045c<? super RecommendedProductViewHolder$updateQuantity$1$6>) null)), mo68345l());
    }
}
