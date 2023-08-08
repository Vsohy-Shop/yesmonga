package com.carrefour.fid.android.storelocator.p048ui.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36697f8;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28951s;
import com.urbanairship.iam.events.C9175a;
import java.util.Arrays;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/storelocator/ui/customview/ExceptionalOpeningView;", "Landroid/widget/LinearLayout;", "", "Lcom/carrefour/fid/android/domain/models/service/models/g;", "openings", "Lkotlin/d2;", "c", "b", "", "isOpen", "", "day", "Landroid/widget/TextView;", "a", "Lcom/carrefour/fid/android/databinding/f8;", "Lcom/carrefour/fid/android/databinding/f8;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.ui.customview.ExceptionalOpeningView */
public final class ExceptionalOpeningView extends LinearLayout {

    /* renamed from: b */
    public static final int f71024b = 8;
    @C12579k

    /* renamed from: a */
    public final C36697f8 f71025a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ExceptionalOpeningView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final TextView mo84365a(boolean z, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(-16777216);
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_blue_oval, 0, 0, 0);
            C11368t0 t0Var = C11368t0.f28504a;
            String string = getContext().getString(R.string.store_exceptional_open);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.store_exceptional_open)");
            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            textView.setText(format);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_red_oval, 0, 0, 0);
            C11368t0 t0Var2 = C11368t0.f28504a;
            String string2 = getContext().getString(R.string.store_exceptional_close);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri….store_exceptional_close)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            textView.setText(format2);
        }
        C28951s sVar = C28951s.f70964a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        textView.setCompoundDrawablePadding(sVar.mo84277c(11, context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        int c = sVar.mo84277c(15, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
        layoutParams.setMargins(c, sVar.mo84277c(8, context3), 0, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: b */
    public final void mo84366b() {
        this.f71025a.f90851c.removeAllViews();
    }

    /* renamed from: c */
    public final void mo84367c(@C12579k List<C38154g> list) {
        Intrinsics.checkNotNullParameter(list, "openings");
        this.f71025a.f90851c.removeAllViews();
        if (list.isEmpty()) {
            this.f71025a.f90850b.setVisibility(8);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i < 4) {
                this.f71025a.f90851c.addView(mo84365a(Intrinsics.areEqual((Object) list.get(i).mo119302l(), (Object) "1"), C28932h.f70914a.mo84246p(list.get(i).mo119299i(), C28932h.f70924k)));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ExceptionalOpeningView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ExceptionalOpeningView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36697f8 d = C36697f8.m150517d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f71025a = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExceptionalOpeningView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
