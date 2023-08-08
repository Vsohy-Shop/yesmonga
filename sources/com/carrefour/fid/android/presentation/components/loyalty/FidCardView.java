package com.carrefour.fid.android.presentation.components.loyalty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.databinding.C36883y5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/loyalty/FidCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "mode", "Lkotlin/d2;", "w", "Lkotlin/Function0;", "callback", "setCardButtonListener", "setSeeAllListener", "Lcom/carrefour/fid/android/databinding/y5;", "a", "Lcom/carrefour/fid/android/databinding/y5;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FidCardView extends ConstraintLayout {

    /* renamed from: b */
    public static final int f97185b = 8;
    @C12579k

    /* renamed from: a */
    public final C36883y5 f97186a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FidCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m158894x(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        aVar.invoke();
    }

    /* renamed from: y */
    public static final void m158895y(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        aVar.invoke();
    }

    public final void setCardButtonListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        this.f97186a.f91979b.setOnClickListener(new C38378a(aVar));
    }

    public final void setSeeAllListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        this.f97186a.f91983f.setOnClickListener(new C38379b(aVar));
    }

    /* renamed from: w */
    public final void mo121249w(int i) {
        if (LoyaltyCardType.f89888a.mo108568a(i) == LoyaltyCardType.NOT_EXIST) {
            this.f97186a.f91984g.setText(getContext().getString(R.string.home_fid_get_free_money));
            this.f97186a.f91983f.setVisibility(8);
            this.f97186a.f91982e.setVisibility(0);
            this.f97186a.f91981d.setContentDescription(getContext().getString(R.string.accessibility_create_loyalty_card));
            return;
        }
        this.f97186a.f91984g.setText(getContext().getString(R.string.home_fid_advantage_text));
        AppCompatTextView appCompatTextView = this.f97186a.f91983f;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.homeFidHeaderSeeAll");
        ViewKt.m152123e(appCompatTextView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        Group group = this.f97186a.f91982e;
        Intrinsics.checkNotNullExpressionValue(group, "binding.homeFidGroup");
        ViewKt.m152126h(group, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FidCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FidCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FidCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36883y5 b = C36883y5.m151248b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97186a = b;
    }
}
