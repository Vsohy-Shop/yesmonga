package com.carrefour.fid.android.storelocator.p048ui.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36717h8;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.util.ServiceUtil;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/customview/StoreHourDayView;", "Landroid/widget/LinearLayout;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lkotlin/d2;", "a", "Lcom/carrefour/fid/android/databinding/h8;", "Lcom/carrefour/fid/android/databinding/h8;", "getBinding", "()Lcom/carrefour/fid/android/databinding/h8;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.ui.customview.StoreHourDayView */
public final class StoreHourDayView extends LinearLayout {

    /* renamed from: b */
    public static final int f71028b = 8;
    @C12579k

    /* renamed from: a */
    public final C36717h8 f71029a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo84371a(@C12579k C38163l lVar) {
        C38163l lVar2 = lVar;
        Intrinsics.checkNotNullParameter(lVar2, "store");
        C38157h l = ServiceUtil.f70805a.mo84130l(lVar2);
        List<Boolean> H = lVar.mo119364H();
        if (l != null && H.size() > 6) {
            StoreHourDayCell storeHourDayCell = this.f71029a.f90983c;
            String string = getContext().getString(R.string.monday_prefix);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.monday_prefix)");
            storeHourDayCell.mo84368a(string, H.get(0).booleanValue(), l.mo119324q());
            StoreHourDayCell storeHourDayCell2 = this.f71029a.f90987g;
            String string2 = getContext().getString(R.string.tuedsay_prefix);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.tuedsay_prefix)");
            storeHourDayCell2.mo84368a(string2, H.get(1).booleanValue(), l.mo119330v());
            StoreHourDayCell storeHourDayCell3 = this.f71029a.f90988h;
            String string3 = getContext().getString(R.string.wednesday_prefix);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.wednesday_prefix)");
            storeHourDayCell3.mo84368a(string3, H.get(2).booleanValue(), l.mo119331w());
            StoreHourDayCell storeHourDayCell4 = this.f71029a.f90986f;
            String string4 = getContext().getString(R.string.thursday_prefix);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.thursday_prefix)");
            storeHourDayCell4.mo84368a(string4, H.get(3).booleanValue(), l.mo119329u());
            StoreHourDayCell storeHourDayCell5 = this.f71029a.f90982b;
            String string5 = getContext().getString(R.string.friday_prefix);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.friday_prefix)");
            storeHourDayCell5.mo84368a(string5, H.get(4).booleanValue(), l.mo119323p());
            StoreHourDayCell storeHourDayCell6 = this.f71029a.f90984d;
            String string6 = getContext().getString(R.string.saturday_prefix);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.saturday_prefix)");
            storeHourDayCell6.mo84368a(string6, H.get(5).booleanValue(), l.mo119326s());
            StoreHourDayCell storeHourDayCell7 = this.f71029a.f90985e;
            String string7 = getContext().getString(R.string.sunday_prefix);
            Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.string.sunday_prefix)");
            storeHourDayCell7.mo84368a(string7, H.get(6).booleanValue(), l.mo119327t());
        } else if (l != null) {
            StoreHourDayCell storeHourDayCell8 = this.f71029a.f90983c;
            String string8 = getContext().getString(R.string.monday_prefix);
            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.string.monday_prefix)");
            storeHourDayCell8.mo84368a(string8, false, l.mo119324q());
            StoreHourDayCell storeHourDayCell9 = this.f71029a.f90987g;
            String string9 = getContext().getString(R.string.tuedsay_prefix);
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.string.tuedsay_prefix)");
            storeHourDayCell9.mo84368a(string9, false, l.mo119330v());
            StoreHourDayCell storeHourDayCell10 = this.f71029a.f90988h;
            String string10 = getContext().getString(R.string.wednesday_prefix);
            Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.string.wednesday_prefix)");
            storeHourDayCell10.mo84368a(string10, false, l.mo119331w());
            StoreHourDayCell storeHourDayCell11 = this.f71029a.f90986f;
            String string11 = getContext().getString(R.string.thursday_prefix);
            Intrinsics.checkNotNullExpressionValue(string11, "context.getString(R.string.thursday_prefix)");
            storeHourDayCell11.mo84368a(string11, false, l.mo119329u());
            StoreHourDayCell storeHourDayCell12 = this.f71029a.f90982b;
            String string12 = getContext().getString(R.string.friday_prefix);
            Intrinsics.checkNotNullExpressionValue(string12, "context.getString(R.string.friday_prefix)");
            storeHourDayCell12.mo84368a(string12, false, l.mo119323p());
            StoreHourDayCell storeHourDayCell13 = this.f71029a.f90984d;
            String string13 = getContext().getString(R.string.saturday_prefix);
            Intrinsics.checkNotNullExpressionValue(string13, "context.getString(R.string.saturday_prefix)");
            storeHourDayCell13.mo84368a(string13, false, l.mo119326s());
            StoreHourDayCell storeHourDayCell14 = this.f71029a.f90985e;
            String string14 = getContext().getString(R.string.sunday_prefix);
            Intrinsics.checkNotNullExpressionValue(string14, "context.getString(R.string.sunday_prefix)");
            storeHourDayCell14.mo84368a(string14, false, l.mo119327t());
        } else if (H.size() > 6) {
            StoreHourDayCell storeHourDayCell15 = this.f71029a.f90983c;
            String string15 = getContext().getString(R.string.monday_prefix);
            Intrinsics.checkNotNullExpressionValue(string15, "context.getString(R.string.monday_prefix)");
            storeHourDayCell15.mo84368a(string15, H.get(0).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell16 = this.f71029a.f90987g;
            String string16 = getContext().getString(R.string.tuedsay_prefix);
            Intrinsics.checkNotNullExpressionValue(string16, "context.getString(R.string.tuedsay_prefix)");
            storeHourDayCell16.mo84368a(string16, H.get(1).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell17 = this.f71029a.f90988h;
            String string17 = getContext().getString(R.string.wednesday_prefix);
            Intrinsics.checkNotNullExpressionValue(string17, "context.getString(R.string.wednesday_prefix)");
            storeHourDayCell17.mo84368a(string17, H.get(2).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell18 = this.f71029a.f90986f;
            String string18 = getContext().getString(R.string.thursday_prefix);
            Intrinsics.checkNotNullExpressionValue(string18, "context.getString(R.string.thursday_prefix)");
            storeHourDayCell18.mo84368a(string18, H.get(3).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell19 = this.f71029a.f90982b;
            String string19 = getContext().getString(R.string.friday_prefix);
            Intrinsics.checkNotNullExpressionValue(string19, "context.getString(R.string.friday_prefix)");
            storeHourDayCell19.mo84368a(string19, H.get(4).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell20 = this.f71029a.f90984d;
            String string20 = getContext().getString(R.string.saturday_prefix);
            Intrinsics.checkNotNullExpressionValue(string20, "context.getString(R.string.saturday_prefix)");
            storeHourDayCell20.mo84368a(string20, H.get(5).booleanValue(), (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell21 = this.f71029a.f90985e;
            String string21 = getContext().getString(R.string.sunday_prefix);
            Intrinsics.checkNotNullExpressionValue(string21, "context.getString(R.string.sunday_prefix)");
            storeHourDayCell21.mo84368a(string21, H.get(6).booleanValue(), (List<C38147b>) null);
        } else {
            StoreHourDayCell storeHourDayCell22 = this.f71029a.f90983c;
            String string22 = getContext().getString(R.string.monday_prefix);
            Intrinsics.checkNotNullExpressionValue(string22, "context.getString(R.string.monday_prefix)");
            storeHourDayCell22.mo84368a(string22, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell23 = this.f71029a.f90987g;
            String string23 = getContext().getString(R.string.tuedsay_prefix);
            Intrinsics.checkNotNullExpressionValue(string23, "context.getString(R.string.tuedsay_prefix)");
            storeHourDayCell23.mo84368a(string23, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell24 = this.f71029a.f90988h;
            String string24 = getContext().getString(R.string.wednesday_prefix);
            Intrinsics.checkNotNullExpressionValue(string24, "context.getString(R.string.wednesday_prefix)");
            storeHourDayCell24.mo84368a(string24, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell25 = this.f71029a.f90986f;
            String string25 = getContext().getString(R.string.thursday_prefix);
            Intrinsics.checkNotNullExpressionValue(string25, "context.getString(R.string.thursday_prefix)");
            storeHourDayCell25.mo84368a(string25, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell26 = this.f71029a.f90982b;
            String string26 = getContext().getString(R.string.friday_prefix);
            Intrinsics.checkNotNullExpressionValue(string26, "context.getString(R.string.friday_prefix)");
            storeHourDayCell26.mo84368a(string26, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell27 = this.f71029a.f90984d;
            String string27 = getContext().getString(R.string.saturday_prefix);
            Intrinsics.checkNotNullExpressionValue(string27, "context.getString(R.string.saturday_prefix)");
            storeHourDayCell27.mo84368a(string27, false, (List<C38147b>) null);
            StoreHourDayCell storeHourDayCell28 = this.f71029a.f90985e;
            String string28 = getContext().getString(R.string.sunday_prefix);
            Intrinsics.checkNotNullExpressionValue(string28, "context.getString(R.string.sunday_prefix)");
            storeHourDayCell28.mo84368a(string28, false, (List<C38147b>) null);
        }
    }

    @C12579k
    public final C36717h8 getBinding() {
        return this.f71029a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreHourDayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public StoreHourDayView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36717h8 d = C36717h8.m150597d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f71029a = d;
    }
}
