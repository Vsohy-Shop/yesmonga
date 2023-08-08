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
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: n1 */
    public final C19913a f50924n1;

    /* renamed from: o1 */
    public CharSequence f50925o1;

    /* renamed from: p1 */
    public CharSequence f50926p1;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C19913a implements CompoundButton.OnCheckedChangeListener {
        public C19913a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo58882g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo59011o3(z);
            }
        }
    }

    public SwitchPreferenceCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50924n1 = new C19913a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.SwitchPreferenceCompat, i, i2);
        mo59016t3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreferenceCompat_summaryOn, C19975v.C19986k.SwitchPreferenceCompat_android_summaryOn));
        mo59014r3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreferenceCompat_summaryOff, C19975v.C19986k.SwitchPreferenceCompat_android_summaryOff));
        mo58999B3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreferenceCompat_switchTextOn, C19975v.C19986k.SwitchPreferenceCompat_android_switchTextOn));
        mo59005z3(C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.SwitchPreferenceCompat_switchTextOff, C19975v.C19986k.SwitchPreferenceCompat_android_switchTextOff));
        mo59012p3(C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.SwitchPreferenceCompat_disableDependentsState, C19975v.C19986k.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A3 */
    public void mo58998A3(int i) {
        mo58999B3(mo58854Q().getString(i));
    }

    /* renamed from: B3 */
    public void mo58999B3(@C0363p0 CharSequence charSequence) {
        this.f50925o1 = charSequence;
        mo58762G1();
    }

    /* renamed from: C3 */
    public final void mo59000C3(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f50928i1);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f50925o1);
            switchCompat.setTextOff(this.f50926p1);
            switchCompat.setOnCheckedChangeListener(this.f50924n1);
        }
    }

    /* renamed from: D3 */
    public final void mo59001D3(View view) {
        if (((AccessibilityManager) mo58854Q().getSystemService("accessibility")).isEnabled()) {
            mo59000C3(view.findViewById(C19975v.C19981f.switchWidget));
            mo59017u3(view.findViewById(16908304));
        }
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        super.mo34405Q1(uVar);
        mo59000C3(uVar.mo59214d(C19975v.C19981f.switchWidget));
        mo59018v3(uVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p2 */
    public void mo58739p2(@C0359n0 View view) {
        super.mo58739p2(view);
        mo59001D3(view);
    }

    @C0363p0
    /* renamed from: w3 */
    public CharSequence mo59002w3() {
        return this.f50926p1;
    }

    @C0363p0
    /* renamed from: x3 */
    public CharSequence mo59003x3() {
        return this.f50925o1;
    }

    /* renamed from: y3 */
    public void mo59004y3(int i) {
        mo59005z3(mo58854Q().getString(i));
    }

    /* renamed from: z3 */
    public void mo59005z3(@C0363p0 CharSequence charSequence) {
        this.f50926p1 = charSequence;
        mo58762G1();
    }

    public SwitchPreferenceCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C19975v.C19976a.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
