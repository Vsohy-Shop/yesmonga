package com.carrefour.fid.android.design.components.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.textfield.TextInputLayout;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/TextAreaComponent;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "errorText", "Lkotlin/d2;", "setError", "", "enabled", "setEnabled", "", "m2", "I", "defaultBackgroundColor", "n2", "defaultBoxStrokeWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public class TextAreaComponent extends TextInputLayout {

    /* renamed from: o2 */
    public static final int f93279o2 = 0;
    @SuppressLint({"CustomViewStyleable"})

    /* renamed from: m2 */
    public final int f93280m2;
    @SuppressLint({"CustomViewStyleable"})

    /* renamed from: n2 */
    public final int f93281n2;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TextAreaComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setBoxBackgroundColor(this.f93280m2);
            int i = this.f93281n2;
            if (i > 0) {
                setBoxStrokeWidth(i);
                return;
            }
            return;
        }
        setBoxBackgroundColor(getResources().getColor(C36896b.C36902f.ds_grey_80, getContext().getTheme()));
        if (this.f93281n2 > 0) {
            setBoxStrokeWidth(getResources().getDimensionPixelSize(C36896b.C36903g.ds_border_width_1));
        }
    }

    public void setError(@C12580l CharSequence charSequence) {
        super.setError(charSequence);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C36896b.C36900d.colorError, typedValue, true);
        int i = typedValue.data;
        if (charSequence != null) {
            setStartIconTintList(ColorStateList.valueOf(i));
            setEndIconTintList(ColorStateList.valueOf(i));
            return;
        }
        ColorStateList colorStateList = getResources().getColorStateList(C36896b.C36902f.ds_text_area_icon_color, getContext().getTheme());
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateL…con_color, context.theme)");
        setStartIconTintList(colorStateList);
        setEndIconTintList(colorStateList);
        mo91588k0();
        mo91584i0();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TextAreaComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextAreaComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public TextAreaComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int[] iArr = C36896b.C36914r.TextInputLayout;
        this.f93280m2 = context.obtainStyledAttributes(attributeSet, iArr).getColor(C36896b.C36914r.TextInputLayout_boxBackgroundColor, 0);
        this.f93281n2 = context.obtainStyledAttributes(attributeSet, iArr).getDimensionPixelSize(C36896b.C36914r.TextInputLayout_boxStrokeWidth, -1);
    }
}
