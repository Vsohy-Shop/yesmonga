package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.core.extension.C36307f;
import com.carrefour.fid.android.databinding.C36764m5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25198c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOnlineViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,97:1\n262#2,2:98\n262#2,2:100\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrdersOnlineViewHolder\n*L\n75#1:98,2\n78#1:100,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.e0 */
public final class C24875e0 extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C24876a f61660b = new C24876a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61661c = 8;

    /* renamed from: d */
    public static final int f61662d = 0;
    @C12579k

    /* renamed from: a */
    public final C36764m5 f61663a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.e0$a */
    public static final class C24876a {
        public /* synthetic */ C24876a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24876a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24875e0(@C12579k C36764m5 m5Var) {
        super(m5Var.getRoot());
        Intrinsics.checkNotNullParameter(m5Var, "binding");
        this.f61663a = m5Var;
    }

    /* renamed from: c */
    public final void mo72624c(@C12579k OrdersOnlineItemModel ordersOnlineItemModel) {
        boolean z;
        int i;
        int i2;
        String str;
        SpannableString spannableString;
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "item");
        TextView textView = this.f61663a.f91308k;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        textView.setText(C25198c.m108891a(ordersOnlineItemModel, context));
        TextView textView2 = this.f61663a.f91312o;
        OrderStatus g = ordersOnlineItemModel.mo73380g();
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
        textView2.setText(C36306e.m148949a(g, context2));
        AppCompatTextView appCompatTextView = this.f61663a.f91313p;
        OrderType f = ordersOnlineItemModel.mo73378f();
        Context context3 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
        appCompatTextView.setText(C36307f.m148958a(f, context3));
        if (ordersOnlineItemModel.mo73378f().mo83590a() != -1) {
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(ordersOnlineItemModel.mo73378f().mo83590a(), 0, 0, 0);
        }
        this.f61663a.f91307j.setText(C28782t.m119105b(Double.valueOf(ordersOnlineItemModel.mo73491w())));
        boolean z2 = true;
        if (!Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73380g(), (Object) OrderStatus.Unknown.f89266e)) {
            TextView textView3 = this.f61663a.f91311n;
            if (Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) OrderType.DriveExpressPickup.f70284e)) {
                SpannableString spannableString2 = new SpannableString(textView3.getContext().getString(R.string.order_online_pickup_express_slot, new Object[]{StringKt.m118942v(ordersOnlineItemModel.mo73493x())}));
                spannableString2.setSpan(new StyleSpan(1), StringsKt__StringsKt.indexOf$default((CharSequence) spannableString2, "\n", 0, false, 6, (Object) null) + 1, spannableString2.length(), 18);
                spannableString = spannableString2;
            } else if (Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) OrderType.Lad.f70288e)) {
                Context context4 = textView3.getContext();
                C28932h.C28933a aVar = C28932h.f70914a;
                spannableString = context4.getString(R.string.order_online_delivery_nal, new Object[]{aVar.mo84228S(ordersOnlineItemModel.mo73493x()), aVar.mo84228S(ordersOnlineItemModel.mo73494y())});
            } else {
                spannableString = StringKt.m118941u(ordersOnlineItemModel.mo73493x(), ordersOnlineItemModel.mo73494y());
            }
            textView3.setText(spannableString);
            this.f61663a.f91306i.setVisibility(0);
        } else {
            this.f61663a.f91306i.setVisibility(8);
        }
        MaterialButton materialButton = this.f61663a.f91304g;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.buttonHolderAdditionalOrder");
        if (!ordersOnlineItemModel.mo73369b() || ordersOnlineItemModel.mo73367a() != null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        materialButton.setVisibility(i);
        Group group = this.f61663a.f91300c;
        Intrinsics.checkNotNullExpressionValue(group, "binding.additionalOrderInfo");
        if (ordersOnlineItemModel.mo73367a() == null) {
            z2 = false;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        group.setVisibility(i2);
        OrderType f2 = ordersOnlineItemModel.mo73378f();
        OrderType.Lad lad = OrderType.Lad.f70288e;
        if (Intrinsics.areEqual((Object) f2, (Object) lad)) {
            this.f61663a.f91305h.setVisibility(8);
        } else {
            this.f61663a.f91305h.setVisibility(0);
        }
        TextView textView4 = this.f61663a.f91310m;
        if (Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) OrderType.Clcv.f70280e) || Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) OrderType.H1h3.f70286e)) {
            str = textView4.getContext().getString(R.string.order_txt_order_slot_title_clcv);
        } else if (Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) lad)) {
            str = textView4.getContext().getString(R.string.order_txt_order_slot_title_lad);
        } else {
            str = textView4.getContext().getString(R.string.order_txt_order_slot_title_drive);
        }
        textView4.setText(str);
    }

    @C12579k
    /* renamed from: d */
    public final C36764m5 mo72625d() {
        return this.f61663a;
    }

    @C12579k
    /* renamed from: e */
    public final C36764m5 mo72626e() {
        return this.f61663a;
    }
}
