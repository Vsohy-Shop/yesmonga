package com.urbanairship.android.layout.view;

import android.content.Context;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.android.layout.widget.C36001a;
import com.urbanairship.android.layout.widget.ShapeButton;
import java.util.List;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo22516d2 = {"com/urbanairship/android/layout/view/CheckboxView$createCheckboxView$1", "Lcom/urbanairship/android/layout/widget/ShapeButton;", "Lkotlin/d2;", "toggle", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class CheckboxView$createCheckboxView$1 extends ShapeButton {

    /* renamed from: y */
    public final /* synthetic */ CheckboxView f88836y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxView$createCheckboxView$1(CheckboxView checkboxView, Context context, List<C35870a> list, List<C35870a> list2, Image.Icon icon, Image.Icon icon2) {
        super(context, list, list2, icon, icon2);
        this.f88836y = checkboxView;
    }

    public void toggle() {
        C36001a.C36004c checkedChangeListener = this.f88836y.getCheckedChangeListener();
        if (checkedChangeListener != null) {
            checkedChangeListener.mo107586a(this, !isChecked());
        }
    }
}
