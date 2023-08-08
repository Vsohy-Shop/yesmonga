package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36783o4;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.OfferUnavailableModel;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25469h;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.collections.C10998z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/OfferBasketUnavailableProductListViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n800#2,11:219\n1549#2:230\n1620#2,3:231\n1#3:234\n*S KotlinDebug\n*F\n+ 1 CheckoutViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/OfferBasketUnavailableProductListViewHolder\n*L\n86#1:219,11\n86#1:230\n86#1:231,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketUnavailableProductListViewHolder */
public final class OfferBasketUnavailableProductListViewHolder extends C25469h {
    @C12579k

    /* renamed from: d */
    public static final C23336a f59071d = new C23336a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f59072e = 8;

    /* renamed from: f */
    public static final int f59073f = 11;
    @C12579k

    /* renamed from: b */
    public final C36783o4 f59074b;
    @C12579k

    /* renamed from: c */
    public final CheckoutAdapter.C23327a f59075c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.OfferBasketUnavailableProductListViewHolder$a */
    public static final class C23336a {
        public /* synthetic */ C23336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23336a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OfferBasketUnavailableProductListViewHolder(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36783o4 r3, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter.C23327a r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f59074b = r3
            r2.f59075c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketUnavailableProductListViewHolder.<init>(com.carrefour.fid.android.databinding.o4, com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter$a):void");
    }

    /* renamed from: g */
    public static final void m104138g(OfferBasketUnavailableProductListViewHolder offerBasketUnavailableProductListViewHolder, View view) {
        Intrinsics.checkNotNullParameter(offerBasketUnavailableProductListViewHolder, "this$0");
        view.setEnabled(false);
        offerBasketUnavailableProductListViewHolder.f59075c.mo68193g(!view.isActivated());
    }

    /* renamed from: e */
    public final void mo68335e(@C12579k OfferUnavailableModel offerUnavailableModel, boolean z) {
        CheckoutAdapter checkoutAdapter;
        Intrinsics.checkNotNullParameter(offerUnavailableModel, C28547h2.f69318f);
        offerUnavailableModel.mo121763g(z);
        Button button = this.f59074b.f91435b;
        button.setEnabled(false);
        button.setActivated(offerUnavailableModel.mo121762f());
        if (offerUnavailableModel.mo121762f()) {
            ImageView imageView = this.f59074b.f91437d;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageOfferProductUnavailableBasketIcon");
            ViewKt.m118982G(imageView, false, 0, 2, (Object) null);
            RecyclerView.Adapter adapter = this.f59074b.f91438e.getAdapter();
            if (adapter instanceof CheckoutAdapter) {
                checkoutAdapter = (CheckoutAdapter) adapter;
            } else {
                checkoutAdapter = null;
            }
            if (checkoutAdapter != null && checkoutAdapter.getItemCount() <= 0) {
                checkoutAdapter.mo68325p(offerUnavailableModel.mo121760e());
            }
            this.f59074b.f91435b.setEnabled(true);
            this.f59074b.f91436c.setVisibility(0);
            return;
        }
        ImageView imageView2 = this.f59074b.f91437d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageOfferProductUnavailableBasketIcon");
        ViewKt.m118982G(imageView2, true, 0, 2, (Object) null);
        this.f59074b.f91435b.setEnabled(true);
        this.f59074b.f91436c.setVisibility(8);
    }

    /* renamed from: f */
    public final void mo68336f(@C12579k OfferUnavailableModel offerUnavailableModel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(offerUnavailableModel, C40045d.f102104u);
        Context context = this.f59074b.f91438e.getContext();
        RecyclerView recyclerView = this.f59074b.f91438e;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listOfferProductUnavailableBasket");
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        C37370b b = C37373c.m153544b(recyclerView, context, (C37390r) null, 2, (Object) null);
        ArrayList<OfferProductModel> arrayList = new ArrayList<>();
        for (Object next : offerUnavailableModel.mo121760e()) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (OfferProductModel offerProductModel : arrayList) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            arrayList2.add(C38510j.m159764b(offerProductModel, resources, OfferBasketUnavailableProductListViewHolder$bind$1$1.f59076f, OfferBasketUnavailableProductListViewHolder$bind$1$2.f59077f, new OfferBasketUnavailableProductListViewHolder$bind$1$3(offerProductModel, this, i), OfferBasketUnavailableProductListViewHolder$bind$1$4.f59078f, OfferBasketUnavailableProductListViewHolder$bind$1$5.f59079f, (C11289a) null, (C11289a) null, true, false, false, false, (C11289a) null, 7872, (Object) null));
        }
        b.setList(arrayList2);
        Group group = this.f59074b.f91436c;
        group.clearAnimation();
        if (offerUnavailableModel.mo121762f()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        group.setVisibility(i2);
        ImageView imageView = this.f59074b.f91437d;
        imageView.clearAnimation();
        Intrinsics.checkNotNullExpressionValue(imageView, "bind$lambda$2");
        ViewKt.m118981F(imageView, !offerUnavailableModel.mo121762f(), 0);
        Button button = this.f59074b.f91435b;
        button.setActivated(offerUnavailableModel.mo121762f());
        button.setEnabled(true);
        int size = C10998z.m42387a1(offerUnavailableModel.mo121760e(), OfferProductModel.class).size();
        button.setText(button.getResources().getQuantityString(R.plurals.unavailable_product_count, size, new Object[]{Integer.valueOf(size)}));
        button.setOnClickListener(new C23343b(this));
    }

    @C12579k
    /* renamed from: h */
    public final C36783o4 mo68337h() {
        return this.f59074b;
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: type inference failed for: r0v12, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68338i(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferUnavailableModel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "offer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.mo121762f()
            r1 = 0
            r2 = 0
            java.lang.String r4 = "binding.imageOfferProductUnavailableBasketIcon"
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0046
            com.carrefour.fid.android.databinding.o4 r0 = r7.f59074b
            android.widget.Button r0 = r0.f91435b
            r0.setEnabled(r6)
            r0.setActivated(r6)
            com.carrefour.fid.android.databinding.o4 r0 = r7.f59074b
            androidx.constraintlayout.widget.Group r0 = r0.f91436c
            r0.setVisibility(r5)
            com.carrefour.fid.android.databinding.o4 r0 = r7.f59074b
            android.widget.ImageView r0 = r0.f91437d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.carrefour.fid.android.shared.extension.ViewKt.m118981F(r0, r5, r2)
            com.carrefour.fid.android.databinding.o4 r0 = r7.f59074b
            androidx.recyclerview.widget.RecyclerView r0 = r0.f91438e
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r2 = r0 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter
            if (r2 == 0) goto L_0x003c
            r1 = r0
            com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter r1 = (com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter) r1
        L_0x003c:
            if (r1 == 0) goto L_0x007b
            java.util.List r8 = r8.mo121760e()
            r1.mo68325p(r8)
            goto L_0x007b
        L_0x0046:
            com.carrefour.fid.android.databinding.o4 r8 = r7.f59074b
            android.widget.Button r8 = r8.f91435b
            r8.setEnabled(r6)
            r8.setActivated(r5)
            com.carrefour.fid.android.databinding.o4 r8 = r7.f59074b
            androidx.constraintlayout.widget.Group r8 = r8.f91436c
            r0 = 8
            r8.setVisibility(r0)
            com.carrefour.fid.android.databinding.o4 r8 = r7.f59074b
            android.widget.ImageView r8 = r8.f91437d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            com.carrefour.fid.android.shared.extension.ViewKt.m118981F(r8, r6, r2)
            com.carrefour.fid.android.databinding.o4 r8 = r7.f59074b
            androidx.recyclerview.widget.RecyclerView r8 = r8.f91438e
            androidx.recyclerview.widget.RecyclerView$Adapter r8 = r8.getAdapter()
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter
            if (r0 == 0) goto L_0x0072
            r1 = r8
            com.carrefour.fid.android.presentation.ui.checkout.al.adapter.CheckoutAdapter r1 = (com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.CheckoutAdapter) r1
        L_0x0072:
            if (r1 == 0) goto L_0x007b
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r1.mo68325p(r8)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.OfferBasketUnavailableProductListViewHolder.mo68338i(com.carrefour.fid.android.presentation.models.OfferUnavailableModel):void");
    }
}
