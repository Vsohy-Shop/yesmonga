package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36728j;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/adapter/OrderInformationCardView;", "Landroidx/cardview/widget/CardView;", "", "titleId", "descriptionId", "Lkotlin/d2;", "i", "j", "Lcom/carrefour/fid/android/databinding/j;", "x", "Lcom/carrefour/fid/android/databinding/j;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrderInformationCardView */
public final class OrderInformationCardView extends CardView {

    /* renamed from: y */
    public static final int f61616y = 8;
    @C12579k

    /* renamed from: x */
    public final C36728j f61617x;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderInformationCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: k */
    public static final void m108230k(OrderInformationCardView orderInformationCardView, View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(orderInformationCardView, "this$0");
        ImageView imageView = orderInformationCardView.f61617x.f91036b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageOrderInformationArrow");
        if (orderInformationCardView.f61617x.f91037c.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        ViewKt.m118982G(imageView, z, 0, 2, (Object) null);
        if (orderInformationCardView.f61617x.f91037c.getVisibility() == 0) {
            TextView textView = orderInformationCardView.f61617x.f91037c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.textOrderInformationDescription");
            ViewKt.m118999l(textView, false, 0.0d, (C11289a) null, 7, (Object) null);
            orderInformationCardView.f61617x.f91040f.setVisibility(8);
            return;
        }
        orderInformationCardView.f61617x.f91040f.setVisibility(0);
        TextView textView2 = orderInformationCardView.f61617x.f91037c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.textOrderInformationDescription");
        ViewKt.m119006s(textView2, false, 0.0d, (C11289a) null, 7, (Object) null);
    }

    /* renamed from: i */
    public final void mo72591i(@C0324b1 int i, @C0324b1 int i2) {
        setVisibility(0);
        this.f61617x.f91037c.setText(getContext().getString(i2));
        this.f61617x.f91039e.setText(getContext().getString(i));
    }

    /* renamed from: j */
    public final void mo72592j() {
        this.f61617x.f91036b.setOnClickListener(new C24863a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderInformationCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderInformationCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderInformationCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36728j d = C36728j.m150641d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f61617x = d;
        setVisibility(8);
        mo72592j();
    }
}
