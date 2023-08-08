package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.C0331e;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: o1 */
    public CharSequence[] f50838o1;

    /* renamed from: p1 */
    public CharSequence[] f50839p1;

    /* renamed from: q1 */
    public Set<String> f50840q1;

    public MultiSelectListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50840q1 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.MultiSelectListPreference, i, i2);
        this.f50838o1 = C17483q.m80241q(obtainStyledAttributes, C19975v.C19986k.MultiSelectListPreference_entries, C19975v.C19986k.MultiSelectListPreference_android_entries);
        this.f50839p1 = C17483q.m80241q(obtainStyledAttributes, C19975v.C19986k.MultiSelectListPreference_entryValues, C19975v.C19986k.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B3 */
    public int mo58805B3(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f50839p1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f50839p1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: C3 */
    public CharSequence[] mo58806C3() {
        return this.f50838o1;
    }

    /* renamed from: D3 */
    public CharSequence[] mo58807D3() {
        return this.f50839p1;
    }

    /* renamed from: E3 */
    public boolean[] mo58808E3() {
        CharSequence[] charSequenceArr = this.f50839p1;
        int length = charSequenceArr.length;
        Set<String> set = this.f50840q1;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = set.contains(charSequenceArr[i].toString());
        }
        return zArr;
    }

    /* renamed from: F3 */
    public Set<String> mo58809F3() {
        return this.f50840q1;
    }

    /* renamed from: G3 */
    public void mo58810G3(@C0331e int i) {
        mo58811H3(mo58854Q().getResources().getTextArray(i));
    }

    /* renamed from: H3 */
    public void mo58811H3(CharSequence[] charSequenceArr) {
        this.f50838o1 = charSequenceArr;
    }

    /* renamed from: I3 */
    public void mo58812I3(@C0331e int i) {
        mo58813J3(mo58854Q().getResources().getTextArray(i));
    }

    /* renamed from: J3 */
    public void mo58813J3(CharSequence[] charSequenceArr) {
        this.f50839p1 = charSequenceArr;
    }

    /* renamed from: K3 */
    public void mo58814K3(Set<String> set) {
        this.f50840q1.clear();
        this.f50840q1.addAll(set);
        mo58913v2(set);
        mo58762G1();
    }

    @C0363p0
    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo58776j2(savedState.getSuperState());
        mo58814K3(savedState.f50841a);
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        Parcelable k2 = super.mo58777k2();
        if (mo58921z1()) {
            return k2;
        }
        SavedState savedState = new SavedState(k2);
        savedState.f50841a = mo58809F3();
        return savedState;
    }

    /* renamed from: l2 */
    public void mo58778l2(Object obj) {
        mo58814K3(mo58840K0((Set) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19897a();

        /* renamed from: a */
        public Set<String> f50841a;

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$a */
        public class C19897a implements Parcelable.Creator<SavedState> {
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
            int readInt = parcel.readInt();
            this.f50841a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f50841a, strArr);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50841a.size());
            Set<String> set = this.f50841a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.dialogPreferenceStyle, 16842897));
    }

    public MultiSelectListPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
