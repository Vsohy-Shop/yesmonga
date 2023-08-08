package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: n1 */
    public final C19912a f50920n1;

    /* renamed from: o1 */
    public CharSequence f50921o1;

    /* renamed from: p1 */
    public CharSequence f50922p1;

    /* renamed from: androidx.preference.SwitchPreference$a */
    public class C19912a implements CompoundButton.OnCheckedChangeListener {
        public C19912a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo58882g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo59011o3(z);
            }
        }
    }

    public SwitchPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50920n1 = new C19912a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.SwitchPreference, i, i2);
        mo59016t3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreference_summaryOn, C19975v.C19986k.SwitchPreference_android_summaryOn));
        mo59014r3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreference_summaryOff, C19975v.C19986k.SwitchPreference_android_summaryOff));
        mo58990B3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreference_switchTextOn, C19975v.C19986k.SwitchPreference_android_switchTextOn));
        mo58996z3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreference_switchTextOff, C19975v.C19986k.SwitchPreference_android_switchTextOff));
        mo59012p3(C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.SwitchPreference_disableDependentsState, C19975v.C19986k.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A3 */
    public void mo58989A3(int i) {
        mo58990B3(mo58854Q().getString(i));
    }

    /* renamed from: B3 */
    public void mo58990B3(@C0363p0 CharSequence charSequence) {
        this.f50921o1 = charSequence;
        mo58762G1();
    }

    /* renamed from: C3 */
    public final void mo58991C3(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f50928i1);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f50921o1);
            switchR.setTextOff(this.f50922p1);
            switchR.setOnCheckedChangeListener(this.f50920n1);
        }
    }

    /* renamed from: D3 */
    public final void mo58992D3(View view) {
        if (((AccessibilityManager) mo58854Q().getSystemService("accessibility")).isEnabled()) {
            mo58991C3(view.findViewById(C19915a.f50936c));
            mo59017u3(view.findViewById(16908304));
        }
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        mo58991C3(uVar.mo59214d(C19915a.f50936c));
        mo59018v3(uVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p2 */
    public void mo58739p2(@C0359n0 View view) {
        super.mo58739p2(view);
        mo58992D3(view);
    }

    @C0363p0
    /* renamed from: w3 */
    public CharSequence mo58993w3() {
        return this.f50922p1;
    }

    @C0363p0
    /* renamed from: x3 */
    public CharSequence mo58994x3() {
        return this.f50921o1;
    }

    /* renamed from: y3 */
    public void mo58995y3(int i) {
        mo58996z3(mo58854Q().getString(i));
    }

    /* renamed from: z3 */
    public void mo58996z3(@C0363p0 CharSequence charSequence) {
        this.f50922p1 = charSequence;
        mo58762G1();
    }

    public SwitchPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
