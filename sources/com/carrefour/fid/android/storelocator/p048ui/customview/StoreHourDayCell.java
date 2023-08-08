package com.carrefour.fid.android.storelocator.p048ui.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36707g8;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/customview/StoreHourDayCell;", "Landroid/widget/LinearLayout;", "", "dayName", "", "isPassDay", "", "Lcom/carrefour/fid/android/domain/models/service/models/b;", "timeRange", "Lkotlin/d2;", "a", "Lcom/carrefour/fid/android/databinding/g8;", "Lcom/carrefour/fid/android/databinding/g8;", "getBinding", "()Lcom/carrefour/fid/android/databinding/g8;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.ui.customview.StoreHourDayCell */
public final class StoreHourDayCell extends LinearLayout {

    /* renamed from: b */
    public static final int f71026b = 8;
    @C12579k

    /* renamed from: a */
    public final C36707g8 f71027a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayCell(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo84368a(@C12579k String str, boolean z, @C12580l List<C38147b> list) {
        int i;
        Intrinsics.checkNotNullParameter(str, "dayName");
        this.f71027a.f90907b.setText(str);
        if (list == null) {
            this.f71027a.f90908c.setText(getContext().getString(R.string.store_hour_unavailable));
        } else if (list.isEmpty()) {
            this.f71027a.f90908c.setText(getContext().getString(R.string.general_closed));
        } else {
            this.f71027a.f90908c.setText(CollectionsKt___CollectionsKt.m40639h3(list, " / ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new StoreHourDayCell$updateCell$1(this), 30, (Object) null));
        }
        TextView textView = this.f71027a.f90909d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @C12579k
    public final C36707g8 getBinding() {
        return this.f71027a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayCell(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayCell(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36707g8 d = C36707g8.m150557d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f71027a = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreHourDayCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
