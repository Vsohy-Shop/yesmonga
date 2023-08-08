package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: n1 */
    public final C19889a f50813n1;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    public class C19889a implements CompoundButton.OnCheckedChangeListener {
        public C19889a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo58882g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo59011o3(z);
            }
        }
    }

    public CheckBoxPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        mo58740w3(uVar.mo59214d(16908289));
        mo59018v3(uVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p2 */
    public void mo58739p2(@C0359n0 View view) {
        super.mo58739p2(view);
        mo58741x3(view);
    }

    /* renamed from: w3 */
    public final void mo58740w3(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f50928i1);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f50813n1);
        }
    }

    /* renamed from: x3 */
    public final void mo58741x3(@C0359n0 View view) {
        if (((AccessibilityManager) mo58854Q().getSystemService("accessibility")).isEnabled()) {
            mo58740w3(view.findViewById(16908289));
            mo59017u3(view.findViewById(16908304));
        }
    }

    public CheckBoxPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50813n1 = new C19889a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.CheckBoxPreference, i, i2);
        mo59016t3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.CheckBoxPreference_summaryOn, C19975v.C19986k.CheckBoxPreference_android_summaryOn));
        mo59014r3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.CheckBoxPreference_summaryOff, C19975v.C19986k.CheckBoxPreference_android_summaryOff));
        mo59012p3(C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.CheckBoxPreference_disableDependentsState, C19975v.C19986k.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
