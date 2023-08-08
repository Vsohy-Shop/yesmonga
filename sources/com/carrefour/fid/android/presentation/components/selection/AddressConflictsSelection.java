package com.carrefour.fid.android.presentation.components.selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.core.type.AddressSelectionType;
import com.carrefour.fid.android.databinding.C36807q8;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/selection/AddressConflictsSelection;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "addressSelectionType", "", "address", "Lkotlin/d2;", "v", "setAddressSelection", "u", "Lcom/carrefour/fid/android/databinding/q8;", "a", "Lcom/carrefour/fid/android/databinding/q8;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AddressConflictsSelection extends ConstraintLayout {

    /* renamed from: b */
    public static final int f97216b = 8;
    @C12579k

    /* renamed from: a */
    public final C36807q8 f97217a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressConflictsSelection(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public final void setAddressSelection() {
        this.f97217a.f91551b.setChecked(true);
        this.f97217a.f91554e.setActivated(true);
        TextView textView = this.f97217a.f91553d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.textCheckoutAddressSelectionType");
        TextViewKt.m118967r(textView, 0, (Integer) null, 1, 3, (Object) null);
    }

    /* renamed from: u */
    public final void mo121273u() {
        this.f97217a.f91551b.setChecked(false);
        this.f97217a.f91554e.setActivated(false);
        C36807q8 q8Var = this.f97217a;
        q8Var.f91553d.setText(q8Var.f91552c.getText().toString());
    }

    /* renamed from: v */
    public final void mo121274v(@C12579k AddressSelectionType addressSelectionType, @C12579k String str) {
        String str2;
        Intrinsics.checkNotNullParameter(addressSelectionType, "addressSelectionType");
        Intrinsics.checkNotNullParameter(str, "address");
        TextView textView = this.f97217a.f91553d;
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(addressSelectionType.mo108445b());
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = this.f97217a.f91552c;
        textView2.setText(str);
        textView2.setCompoundDrawablesWithIntrinsicBounds(addressSelectionType.mo108444a(), 0, 0, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressConflictsSelection(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressConflictsSelection(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressConflictsSelection(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36807q8 d = C36807q8.m150953d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f97217a = d;
    }
}
