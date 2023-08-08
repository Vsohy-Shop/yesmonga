package com.urbanairship.android.layout.view;

import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import com.urbanairship.android.layout.widget.C36001a;
import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo22516d2 = {"com/urbanairship/android/layout/view/RadioInputView$createSwitchView$1", "Landroidx/appcompat/widget/SwitchCompat;", "Lkotlin/d2;", "toggle", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class RadioInputView$createSwitchView$1 extends SwitchCompat {

    /* renamed from: u1 */
    public final /* synthetic */ RadioInputView f88897u1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioInputView$createSwitchView$1(RadioInputView radioInputView, Context context) {
        super(context);
        this.f88897u1 = radioInputView;
    }

    public void toggle() {
        C36001a.C36004c checkedChangeListener = this.f88897u1.getCheckedChangeListener();
        if (checkedChangeListener != null) {
            checkedChangeListener.mo107586a(this, !isChecked());
        }
    }
}
