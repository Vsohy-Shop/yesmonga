package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.content.res.C0507a;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;

public abstract class DialogPreference extends Preference {

    /* renamed from: i1 */
    public CharSequence f50815i1;

    /* renamed from: j1 */
    public CharSequence f50816j1;

    /* renamed from: k1 */
    public Drawable f50817k1;

    /* renamed from: l1 */
    public CharSequence f50818l1;

    /* renamed from: m1 */
    public CharSequence f50819m1;

    /* renamed from: n1 */
    public int f50820n1;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C19890a {
        @C0363p0
        /* renamed from: f0 */
        <T extends Preference> T mo58761f0(@C0359n0 CharSequence charSequence);
    }

    public DialogPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.DialogPreference, i, i2);
        String o = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.DialogPreference_dialogTitle, C19975v.C19986k.DialogPreference_android_dialogTitle);
        this.f50815i1 = o;
        if (o == null) {
            this.f50815i1 = mo58890j1();
        }
        this.f50816j1 = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.DialogPreference_dialogMessage, C19975v.C19986k.DialogPreference_android_dialogMessage);
        this.f50817k1 = C17483q.m80227c(obtainStyledAttributes, C19975v.C19986k.DialogPreference_dialogIcon, C19975v.C19986k.DialogPreference_android_dialogIcon);
        this.f50818l1 = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.DialogPreference_positiveButtonText, C19975v.C19986k.DialogPreference_android_positiveButtonText);
        this.f50819m1 = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.DialogPreference_negativeButtonText, C19975v.C19986k.DialogPreference_android_negativeButtonText);
        this.f50820n1 = C17483q.m80238n(obtainStyledAttributes, C19975v.C19986k.DialogPreference_dialogLayout, C19975v.C19986k.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A3 */
    public void mo58743A3(@C0363p0 CharSequence charSequence) {
        this.f50818l1 = charSequence;
    }

    /* renamed from: T1 */
    public void mo58744T1() {
        mo58848N0().mo59189I(this);
    }

    @C0363p0
    /* renamed from: k3 */
    public Drawable mo58745k3() {
        return this.f50817k1;
    }

    /* renamed from: l3 */
    public int mo58746l3() {
        return this.f50820n1;
    }

    @C0363p0
    /* renamed from: m3 */
    public CharSequence mo58747m3() {
        return this.f50816j1;
    }

    @C0363p0
    /* renamed from: n3 */
    public CharSequence mo58748n3() {
        return this.f50815i1;
    }

    @C0363p0
    /* renamed from: o3 */
    public CharSequence mo58749o3() {
        return this.f50819m1;
    }

    @C0363p0
    /* renamed from: p3 */
    public CharSequence mo58750p3() {
        return this.f50818l1;
    }

    /* renamed from: q3 */
    public void mo58751q3(int i) {
        this.f50817k1 = C0507a.m2346b(mo58854Q(), i);
    }

    /* renamed from: r3 */
    public void mo58752r3(@C0363p0 Drawable drawable) {
        this.f50817k1 = drawable;
    }

    /* renamed from: s3 */
    public void mo58753s3(int i) {
        this.f50820n1 = i;
    }

    /* renamed from: t3 */
    public void mo58754t3(int i) {
        mo58755u3(mo58854Q().getString(i));
    }

    /* renamed from: u3 */
    public void mo58755u3(@C0363p0 CharSequence charSequence) {
        this.f50816j1 = charSequence;
    }

    /* renamed from: v3 */
    public void mo58756v3(int i) {
        mo58757w3(mo58854Q().getString(i));
    }

    /* renamed from: w3 */
    public void mo58757w3(@C0363p0 CharSequence charSequence) {
        this.f50815i1 = charSequence;
    }

    /* renamed from: x3 */
    public void mo58758x3(int i) {
        mo58759y3(mo58854Q().getString(i));
    }

    /* renamed from: y3 */
    public void mo58759y3(@C0363p0 CharSequence charSequence) {
        this.f50819m1 = charSequence;
    }

    /* renamed from: z3 */
    public void mo58760z3(int i) {
        mo58743A3(mo58854Q().getString(i));
    }

    public DialogPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
