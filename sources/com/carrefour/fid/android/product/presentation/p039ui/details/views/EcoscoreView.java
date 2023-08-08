package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.C0375v;
import com.carrefour.fid.android.product.databinding.C27493i0;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/EcoscoreView;", "Landroid/widget/LinearLayout;", "", "resourceId", "Lkotlin/d2;", "setView", "Lcom/carrefour/fid/android/product/databinding/i0;", "a", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/product/databinding/i0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.EcoscoreView */
public final class EcoscoreView extends LinearLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f67702a;

    @C11315i
    public EcoscoreView(@C12580l Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    private final C27493i0 getBinding() {
        return (C27493i0) this.f67702a.getValue();
    }

    public final void setView(@C0375v int i) {
        setVisibility(0);
        getBinding().f66694b.setImageResource(i);
    }

    @C11315i
    public EcoscoreView(@C12580l Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EcoscoreView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @C11315i
    public EcoscoreView(@C12580l Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67702a = C10864b0.m38748c(new EcoscoreView$binding$2(context, this));
        setOrientation(1);
        setVisibility(8);
    }
}
