package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.C0387a;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/RadioButtonComponent;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lkotlin/d2;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class RadioButtonComponent extends AppCompatRadioButton {

    /* renamed from: e */
    public static final int f93149e = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public RadioButtonComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo113034a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.RadioButtonComponent, i, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C36896b.C36914r.RadioButtonComponent_radioButtonDrawable);
                if (drawable != null) {
                    ButtonKt.m152101c(this, drawable, (Integer) null, 2, (Object) null);
                    setPadding((int) context.getResources().getDimension(C36896b.C36903g.ds_raidobutton_drawable_left_padding), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                    setCompoundDrawablePadding((int) context.getResources().getDimension(C36896b.C36903g.ds_raidobutton_drawable_right_padding));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public RadioButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C0387a.C0389b.radioButtonStyle : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public RadioButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setButtonDrawable(C17318d.m79726i(context, C36896b.C36904h.background_radiobutton));
        setTextColor(C17318d.m79724g(context, C36896b.C36902f.textcolor_radiobutton));
        mo113034a(context, attributeSet, i);
    }
}
