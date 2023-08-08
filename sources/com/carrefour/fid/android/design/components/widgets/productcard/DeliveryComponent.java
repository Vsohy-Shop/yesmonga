package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.databinding.C37068o0;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/DeliveryComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "", "listDeliveryMode", "Lkotlin/d2;", "u", "Lcom/carrefour/fid/android/design/components/databinding/o0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/o0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class DeliveryComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93594b = 8;
    @C12579k

    /* renamed from: a */
    public final C37068o0 f93595a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliveryComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: u */
    public final void mo113649u(@C12579k List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "listDeliveryMode");
        this.f93595a.f92759b.setVisibility(8);
        this.f93595a.f92761d.setVisibility(8);
        int size = list.size();
        if (size == 1) {
            this.f93595a.f92759b.setVisibility(0);
            this.f93595a.f92759b.setText(getContext().getString(list.get(0).intValue()));
        } else if (size == 2) {
            this.f93595a.f92759b.setVisibility(0);
            this.f93595a.f92761d.setVisibility(0);
            this.f93595a.f92759b.setText(getContext().getString(list.get(0).intValue()));
            this.f93595a.f92761d.setText(getContext().getString(list.get(1).intValue()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliveryComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliveryComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37068o0 b = C37068o0.m152034b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…           this\n        )");
        this.f93595a = b;
    }
}
