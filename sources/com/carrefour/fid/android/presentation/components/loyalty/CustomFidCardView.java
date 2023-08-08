package com.carrefour.fid.android.presentation.components.loyalty;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36808r;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.utils.C22711j;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/loyalty/CustomFidCardView;", "Landroid/widget/FrameLayout;", "", "cardNumber", "userFullName", "Lkotlin/d2;", "b", "Lcom/carrefour/fid/android/databinding/r;", "a", "Lcom/carrefour/fid/android/databinding/r;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CustomFidCardView extends FrameLayout {

    /* renamed from: b */
    public static final int f97181b = 8;
    @C12579k

    /* renamed from: a */
    public final C36808r f97182a;

    /* renamed from: com.carrefour.fid.android.presentation.components.loyalty.CustomFidCardView$a */
    public static final class C38377a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ CustomFidCardView f97183a;

        /* renamed from: b */
        public final /* synthetic */ String f97184b;

        public C38377a(CustomFidCardView customFidCardView, String str) {
            this.f97183a = customFidCardView;
            this.f97184b = str;
        }

        public void onGlobalLayout() {
            boolean z;
            Bitmap c;
            this.f97183a.f97182a.f91556b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f97184b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (c = C22711j.m102880c(this.f97184b, 160, 78, 170, 77, LoyaltyConstantsKt.LOYALTY_MAX_WIDTH)) != null) {
                this.f97183a.f97182a.f91556b.setImageBitmap(c);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CustomFidCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: b */
    public final void mo121245b(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        this.f97182a.f91558d.setText(str);
        this.f97182a.f91557c.setText(str2);
        this.f97182a.f91556b.getViewTreeObserver().addOnGlobalLayoutListener(new C38377a(this, str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CustomFidCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomFidCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CustomFidCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36808r d = C36808r.m150957d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f97182a = d;
    }
}
