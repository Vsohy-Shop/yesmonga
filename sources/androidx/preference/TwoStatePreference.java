package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: i1 */
    public boolean f50928i1;

    /* renamed from: j1 */
    public CharSequence f50929j1;

    /* renamed from: k1 */
    public CharSequence f50930k1;

    /* renamed from: l1 */
    public boolean f50931l1;

    /* renamed from: m1 */
    public boolean f50932m1;

    public TwoStatePreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: T1 */
    public void mo58744T1() {
        super.mo58744T1();
        boolean z = !mo59010n3();
        if (mo58882g(Boolean.valueOf(z))) {
            mo59011o3(z);
        }
    }

    @C0363p0
    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: e3 */
    public boolean mo58775e3() {
        boolean z;
        if (this.f50932m1) {
            z = this.f50928i1;
        } else if (!this.f50928i1) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.mo58775e3()) {
            return true;
        }
        return false;
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo58776j2(savedState.getSuperState());
        mo59011o3(savedState.f50933a);
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        Parcelable k2 = super.mo58777k2();
        if (mo58921z1()) {
            return k2;
        }
        SavedState savedState = new SavedState(k2);
        savedState.f50933a = mo59010n3();
        return savedState;
    }

    /* renamed from: k3 */
    public boolean mo59007k3() {
        return this.f50932m1;
    }

    /* renamed from: l2 */
    public void mo58778l2(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        mo59011o3(mo58911u0(((Boolean) obj).booleanValue()));
    }

    @C0363p0
    /* renamed from: l3 */
    public CharSequence mo59008l3() {
        return this.f50930k1;
    }

    @C0363p0
    /* renamed from: m3 */
    public CharSequence mo59009m3() {
        return this.f50929j1;
    }

    /* renamed from: n3 */
    public boolean mo59010n3() {
        return this.f50928i1;
    }

    /* renamed from: o3 */
    public void mo59011o3(boolean z) {
        boolean z2;
        if (this.f50928i1 != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.f50931l1) {
            this.f50928i1 = z;
            this.f50931l1 = true;
            mo58904q2(z);
            if (z2) {
                mo58835H1(mo58775e3());
                mo58762G1();
            }
        }
    }

    /* renamed from: p3 */
    public void mo59012p3(boolean z) {
        this.f50932m1 = z;
    }

    /* renamed from: q3 */
    public void mo59013q3(int i) {
        mo59014r3(mo58854Q().getString(i));
    }

    /* renamed from: r3 */
    public void mo59014r3(@C0363p0 CharSequence charSequence) {
        this.f50930k1 = charSequence;
        if (!mo59010n3()) {
            mo58762G1();
        }
    }

    /* renamed from: s3 */
    public void mo59015s3(int i) {
        mo59016t3(mo58854Q().getString(i));
    }

    /* renamed from: t3 */
    public void mo59016t3(@C0363p0 CharSequence charSequence) {
        this.f50929j1 = charSequence;
        if (mo59010n3()) {
            mo58762G1();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /* renamed from: u3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo59017u3(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f50928i1
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f50929j1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.CharSequence r0 = r4.f50929j1
            r5.setText(r0)
        L_0x0019:
            r0 = r1
            goto L_0x002e
        L_0x001b:
            boolean r0 = r4.f50928i1
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f50930k1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.CharSequence r0 = r4.f50930k1
            r5.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r2 = r4.mo58797U0()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003e
            r5.setText(r2)
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo59017u3(android.view.View):void");
    }

    /* renamed from: v3 */
    public void mo59018v3(@C0359n0 C19974u uVar) {
        mo59017u3(uVar.mo59214d(16908304));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19914a();

        /* renamed from: a */
        public boolean f50933a;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        public class C19914a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f50933a = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50933a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
