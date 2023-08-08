package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36309h;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.type.ProductOverlayType;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.presentation.components.image.OfferFlagListView;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;
import com.carrefour.fid.android.shared.constant.C28547h2;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/OfferProductViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,619:1\n262#2,2:620\n*S KotlinDebug\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/OfferProductViewHolder\n*L\n339#1:620,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferProductViewHolder */
public class OfferProductViewHolder extends C25469h {
    @C12579k

    /* renamed from: x */
    public static final C25458a f62647x = new C25458a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f62648y = 8;

    /* renamed from: z */
    public static final int f62649z = 3;
    @C12579k

    /* renamed from: b */
    public final OfferListAdapter.C25454a f62650b;
    @C12579k

    /* renamed from: c */
    public final CoroutineContext f62651c;
    @C12579k

    /* renamed from: d */
    public final C11677z f62652d;
    @C12579k

    /* renamed from: e */
    public final C11677z f62653e;
    @C12579k

    /* renamed from: f */
    public final C11677z f62654f;
    @C12579k

    /* renamed from: g */
    public final C11677z f62655g;
    @C12579k

    /* renamed from: h */
    public final C11677z f62656h;
    @C12579k

    /* renamed from: i */
    public final C11677z f62657i;
    @C12579k

    /* renamed from: j */
    public final C11677z f62658j;
    @C12579k

    /* renamed from: k */
    public final C11677z f62659k;
    @C12579k

    /* renamed from: l */
    public final C11677z f62660l;
    @C12579k

    /* renamed from: m */
    public final C11677z f62661m;
    @C12579k

    /* renamed from: n */
    public final C11677z f62662n;
    @C12579k

    /* renamed from: o */
    public final C11677z f62663o;
    @C12579k

    /* renamed from: p */
    public final C11677z f62664p;
    @C12579k

    /* renamed from: q */
    public final C11677z f62665q;
    @C12579k

    /* renamed from: r */
    public final C11677z f62666r;
    @C12579k

    /* renamed from: s */
    public final C11677z f62667s;
    @C12579k

    /* renamed from: t */
    public final C11677z f62668t;
    @C12579k

    /* renamed from: u */
    public final C11677z f62669u;
    @C12579k

    /* renamed from: v */
    public final C11677z f62670v;
    @C12579k

    /* renamed from: w */
    public final C11677z f62671w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferProductViewHolder$a */
    public static final class C25458a {
        public /* synthetic */ C25458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25458a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferProductViewHolder(@C12579k View view, @C12579k OfferListAdapter.C25454a aVar, @C12579k CoroutineContext coroutineContext) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f62650b = aVar;
        this.f62651c = coroutineContext;
        this.f62652d = C10864b0.m38748c(new OfferProductViewHolder$viewHolderLifeCycleScope$2(view, this));
        this.f62653e = C10864b0.m38748c(new OfferProductViewHolder$imageProduct$2(view));
        this.f62654f = C10864b0.m38748c(new OfferProductViewHolder$imageProductFlags$2(view));
        this.f62655g = C10864b0.m38748c(new OfferProductViewHolder$imageProductOriginFrance$2(view));
        this.f62656h = C10864b0.m38748c(new OfferProductViewHolder$textProductHighlight$2(view));
        this.f62657i = C10864b0.m38748c(new OfferProductViewHolder$textProductTitle$2(view));
        this.f62658j = C10864b0.m38748c(new OfferProductViewHolder$textProductPackaging$2(view));
        this.f62659k = C10864b0.m38748c(new OfferProductViewHolder$textProductOrigin$2(view));
        this.f62660l = C10864b0.m38748c(new OfferProductViewHolder$textProductStrikeThroughPrice$2(view));
        this.f62661m = C10864b0.m38748c(new OfferProductViewHolder$textProductPrice$2(view));
        this.f62662n = C10864b0.m38748c(new OfferProductViewHolder$textProductWeightPrice$2(view));
        this.f62663o = C10864b0.m38748c(new OfferProductViewHolder$textProductPromo$2(view));
        this.f62664p = C10864b0.m38748c(new OfferProductViewHolder$buttonShoppingList$2(view));
        this.f62665q = C10864b0.m38748c(new OfferProductViewHolder$progressShoppingList$2(view));
        this.f62666r = C10864b0.m38748c(new OfferProductViewHolder$buttonPurchase$2(view));
        this.f62667s = C10864b0.m38748c(new OfferProductViewHolder$layoutQuantity$2(view));
        this.f62668t = C10864b0.m38748c(new OfferProductViewHolder$notification$2(view));
        this.f62669u = C10864b0.m38748c(new OfferProductViewHolder$overlay$2(view));
        this.f62670v = C10864b0.m38748c(new OfferProductViewHolder$textInformationFlag$2(view));
        this.f62671w = C10864b0.m38748c(new OfferProductViewHolder$textSponsoredLabel$2(view));
    }

    /* renamed from: H */
    public static /* synthetic */ void m109857H(OfferProductViewHolder offerProductViewHolder, OfferProductModel offerProductModel, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                offerProductModel = null;
            }
            offerProductViewHolder.mo74180G(offerProductModel);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    /* renamed from: J */
    public static /* synthetic */ void m109858J(OfferProductViewHolder offerProductViewHolder, OfferProductModel offerProductModel, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                offerProductModel = null;
            }
            offerProductViewHolder.mo74181I(offerProductModel);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePurchaseButton");
    }

    /* renamed from: j */
    public static /* synthetic */ void m109865j(OfferProductViewHolder offerProductViewHolder, OfferProductModel offerProductModel, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            offerProductViewHolder.mo74183i(offerProductModel, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: k */
    public static final void m109866k(OfferProductViewHolder offerProductViewHolder, OfferProductModel offerProductModel, int i, View view) {
        Intrinsics.checkNotNullParameter(offerProductViewHolder, "this$0");
        Intrinsics.checkNotNullParameter(offerProductModel, "$offer");
        offerProductViewHolder.mo74184l();
        ViewKt.m152123e(offerProductViewHolder.mo74193u(), (Integer) null, false, (C11289a) null, 7, (Object) null);
        if (view.isActivated()) {
            offerProductViewHolder.f62650b.mo68196j(offerProductModel, i);
        } else {
            offerProductViewHolder.f62650b.mo68191e(offerProductModel, i);
        }
    }

    /* renamed from: A */
    public final TextView mo74174A() {
        Object value = this.f62663o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductPromo>(...)");
        return (TextView) value;
    }

    /* renamed from: B */
    public final TextView mo74175B() {
        Object value = this.f62660l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductStrikeThroughPrice>(...)");
        return (TextView) value;
    }

    /* renamed from: C */
    public final TextView mo74176C() {
        Object value = this.f62657i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductTitle>(...)");
        return (TextView) value;
    }

    /* renamed from: D */
    public final TextView mo74177D() {
        Object value = this.f62662n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductWeightPrice>(...)");
        return (TextView) value;
    }

    /* renamed from: E */
    public final TextView mo74178E() {
        Object value = this.f62671w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textSponsoredLabel>(...)");
        return (TextView) value;
    }

    /* renamed from: F */
    public final C12074o0 mo74179F() {
        return (C12074o0) this.f62652d.getValue();
    }

    /* renamed from: G */
    public final void mo74180G(@C12580l OfferProductModel offerProductModel) {
        boolean z;
        boolean z2;
        boolean z3;
        List<String> t;
        if (offerProductModel != null) {
            View view = this.itemView;
            boolean z4 = false;
            if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            view.setActivated(z);
            view.setEnabled(view.isActivated());
            ImageButton n = mo74186n();
            if (offerProductModel.mo121497A1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            n.setActivated(z2);
            n.setEnabled(true);
            mo74193u().setVisibility(8);
            QuantityView.m117255y(mo74190r(), OfferProductModelKt.m159573V(offerProductModel), false, 2, (Object) null);
            mo74181I(offerProductModel);
            OfferDiscountDomain w = offerProductModel.mo121523w();
            if (w == null || (t = w.mo115953t()) == null) {
                z3 = false;
            } else {
                z3 = !t.isEmpty();
            }
            Boolean A0 = offerProductModel.mo121726A0();
            if (A0 != null) {
                z4 = A0.booleanValue();
            }
            if (!z3) {
                return;
            }
            if (z4) {
                if (offerProductModel.mo121519p0() == 1) {
                    mo74192t().mo113010A(new ProductOverlayComponent.C37161b(OfferProductModelKt.m159570S(offerProductModel), (String) null, ProductOverlayType.HORIZONTAL, new OfferProductViewHolder$update$1$3(this, offerProductModel), new OfferProductViewHolder$update$1$4(this, offerProductModel), false, 32, (DefaultConstructorMarker) null));
                }
            } else if (offerProductModel.mo121727C0() && mo74191s().mo121253F(offerProductModel)) {
                this.f62650b.mo68187a();
            }
        }
    }

    /* renamed from: I */
    public final void mo74181I(OfferProductModel offerProductModel) {
        boolean z;
        ImageButton m = mo74185m();
        boolean z2 = true;
        m.setEnabled(true);
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
        m.setVisibility(i);
    }

    /* renamed from: K */
    public final void mo74182K(OfferProductModel offerProductModel, int i) {
        Offer V = OfferProductModelKt.m159573V(offerProductModel);
        QuantityView r = mo74190r();
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(mo74185m()), C11768d1.m46783e()), new OfferProductViewHolder$updateQuantity$1$1(this, V, (C11045c<? super OfferProductViewHolder$updateQuantity$1$1>) null)), 300), C11768d1.m46783e()), new OfferProductViewHolder$updateQuantity$1$2(this, offerProductModel, i, (C11045c<? super OfferProductViewHolder$updateQuantity$1$2>) null)), mo74179F());
        ImageButton imageButton = r.getViewBinding().f66715b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "getViewBinding().buttonProductQuantityAdd");
        int i2 = i;
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(imageButton), C11768d1.m46781c()), new OfferProductViewHolder$updateQuantity$1$3(r, V, (C11045c<? super OfferProductViewHolder$updateQuantity$1$3>) null)), 500), C11768d1.m46783e()), new OfferProductViewHolder$updateQuantity$1$4(this, r, offerProductModel, i2, (C11045c<? super OfferProductViewHolder$updateQuantity$1$4>) null)), mo74179F());
        ImageButton imageButton2 = r.getViewBinding().f66716c;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "getViewBinding().buttonProductQuantityRemove");
        C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(C11909g.m47448f1(C11909g.m47391O0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(imageButton2), C11768d1.m46781c()), new OfferProductViewHolder$updateQuantity$1$5(offerProductModel, r, V, this, (C11045c<? super OfferProductViewHolder$updateQuantity$1$5>) null)), 500), C11768d1.m46783e()), new OfferProductViewHolder$updateQuantity$1$6(this, r, offerProductModel, i2, (C11045c<? super OfferProductViewHolder$updateQuantity$1$6>) null)), mo74179F());
    }

    /* renamed from: i */
    public final void mo74183i(@C12579k OfferProductModel offerProductModel, boolean z, int i) {
        int i2;
        List list;
        String str;
        String str2;
        boolean z2;
        List<OfferFlag> t;
        OfferProductModel offerProductModel2 = offerProductModel;
        int i3 = i;
        Intrinsics.checkNotNullParameter(offerProductModel2, C28547h2.f69318f);
        CriteoProductModel criteoProductModel = null;
        if (!z) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            C11909g.m47412V0(C11909g.m47448f1(C11909g.m47391O0(C11909g.m47427a0(com.carrefour.fid.android.shared.extension.ViewKt.m118997j(view), 300), C11768d1.m46783e()), new OfferProductViewHolder$bind$1(this, offerProductModel2, (C11045c<? super OfferProductViewHolder$bind$1>) null)), mo74179F());
        } else {
            this.itemView.setForeground((Drawable) null);
        }
        ImageView q = mo74189q();
        int i4 = 8;
        if (OfferProductModelKt.m159553B(offerProductModel)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        q.setVisibility(i2);
        ImageUtils imageUtils = ImageUtils.f70796a;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        boolean z3 = true;
        imageUtils.mo84101e(context, C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null), mo74187o(), R.drawable.ic_product_placeholder);
        OfferFlagListView p = mo74188p();
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 == null || (t = o0.mo121890t()) == null) {
            list = null;
        } else {
            list = CollectionsKt___CollectionsKt.m40497E5(t, 3);
        }
        OfferFlagListView.m158880c(p, list, (OfferFlagListView.C38373a) null, R.dimen.ds_spacing_m, R.dimen.ds_spacing_xxxs, 2, (Object) null);
        OfferProductModelKt.m159559H(offerProductModel2, mo74194v());
        TextView C = mo74176C();
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str = o02.mo121898z();
        } else {
            str = null;
        }
        C.setText(str);
        TextView y = mo74197y();
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str2 = o03.mo121896x();
        } else {
            str2 = null;
        }
        y.setText(str2);
        OfferProductModelKt.m159558G(offerProductModel2, mo74195w());
        OfferProductModelKt.m159560I(offerProductModel2, mo74196x());
        OfferProductModelKt.m159564M(offerProductModel2, mo74174A());
        OfferProductModelKt.m159562K(offerProductModel2, mo74198z(), mo74177D());
        OfferProductModelKt.m159561J(offerProductModel2, mo74175B());
        mo74182K(offerProductModel2, i3);
        ImageButton n = mo74186n();
        if (offerProductModel.mo121497A1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        n.setActivated(z2);
        n.setEnabled(true);
        n.setOnClickListener(new C25472j(this, offerProductModel2, i3));
        TextView E = mo74178E();
        if (offerProductModel2 instanceof CriteoProductModel) {
            criteoProductModel = (CriteoProductModel) offerProductModel2;
        }
        if (criteoProductModel == null || !criteoProductModel.mo121522r2()) {
            z3 = false;
        }
        if (z3) {
            i4 = 0;
        }
        E.setVisibility(i4);
        mo74180G(offerProductModel);
    }

    /* renamed from: l */
    public final void mo74184l() {
        mo74185m().setEnabled(false);
        mo74186n().setEnabled(false);
        this.itemView.setEnabled(false);
        mo74190r().setEnabled(false);
    }

    /* renamed from: m */
    public final ImageButton mo74185m() {
        Object value = this.f62666r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-buttonPurchase>(...)");
        return (ImageButton) value;
    }

    /* renamed from: n */
    public final ImageButton mo74186n() {
        Object value = this.f62664p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-buttonShoppingList>(...)");
        return (ImageButton) value;
    }

    /* renamed from: o */
    public final ImageView mo74187o() {
        Object value = this.f62653e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imageProduct>(...)");
        return (ImageView) value;
    }

    /* renamed from: p */
    public final OfferFlagListView mo74188p() {
        Object value = this.f62654f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imageProductFlags>(...)");
        return (OfferFlagListView) value;
    }

    /* renamed from: q */
    public final ImageView mo74189q() {
        Object value = this.f62655g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imageProductOriginFrance>(...)");
        return (ImageView) value;
    }

    /* renamed from: r */
    public final QuantityView mo74190r() {
        Object value = this.f62667s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-layoutQuantity>(...)");
        return (QuantityView) value;
    }

    /* renamed from: s */
    public final NotificationView mo74191s() {
        Object value = this.f62668t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-notification>(...)");
        return (NotificationView) value;
    }

    /* renamed from: t */
    public final ProductOverlayComponent mo74192t() {
        Object value = this.f62669u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-overlay>(...)");
        return (ProductOverlayComponent) value;
    }

    /* renamed from: u */
    public final ProgressBar mo74193u() {
        Object value = this.f62665q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-progressShoppingList>(...)");
        return (ProgressBar) value;
    }

    /* renamed from: v */
    public final TextView mo74194v() {
        Object value = this.f62670v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textInformationFlag>(...)");
        return (TextView) value;
    }

    /* renamed from: w */
    public final TextView mo74195w() {
        Object value = this.f62656h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductHighlight>(...)");
        return (TextView) value;
    }

    /* renamed from: x */
    public final TextView mo74196x() {
        Object value = this.f62659k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductOrigin>(...)");
        return (TextView) value;
    }

    /* renamed from: y */
    public final TextView mo74197y() {
        Object value = this.f62658j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductPackaging>(...)");
        return (TextView) value;
    }

    /* renamed from: z */
    public final TextView mo74198z() {
        Object value = this.f62661m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-textProductPrice>(...)");
        return (TextView) value;
    }
}
