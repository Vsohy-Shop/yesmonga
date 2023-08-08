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

public class ListPreference extends DialogPreference {

    /* renamed from: t1 */
    public static final String f50830t1 = "ListPreference";

    /* renamed from: o1 */
    public CharSequence[] f50831o1;

    /* renamed from: p1 */
    public CharSequence[] f50832p1;

    /* renamed from: q1 */
    public String f50833q1;

    /* renamed from: r1 */
    public String f50834r1;

    /* renamed from: s1 */
    public boolean f50835s1;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C19896a implements Preference.C19904f<ListPreference> {

        /* renamed from: a */
        public static C19896a f50837a;

        @C0359n0
        /* renamed from: b */
        public static C19896a m92410b() {
            if (f50837a == null) {
                f50837a = new C19896a();
            }
            return f50837a;
        }

        @C0363p0
        /* renamed from: c */
        public CharSequence mo58785a(@C0359n0 ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.mo58789D3())) {
                return listPreference.mo58854Q().getString(C19975v.C19984i.not_set);
            }
            return listPreference.mo58789D3();
        }
    }

    public ListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.ListPreference, i, i2);
        this.f50831o1 = C17483q.m80241q(obtainStyledAttributes, C19975v.C19986k.ListPreference_entries, C19975v.C19986k.ListPreference_android_entries);
        this.f50832p1 = C17483q.m80241q(obtainStyledAttributes, C19975v.C19986k.ListPreference_entryValues, C19975v.C19986k.ListPreference_android_entryValues);
        int i3 = C19975v.C19986k.ListPreference_useSimpleSummaryProvider;
        if (C17483q.m80226b(obtainStyledAttributes, i3, i3, false)) {
            mo58867Y2(C19896a.m92410b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.Preference, i, i2);
        this.f50834r1 = C17483q.m80239o(obtainStyledAttributes2, C19975v.C19986k.Preference_summary, C19975v.C19986k.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: B3 */
    public int mo58787B3(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f50832p1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f50832p1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: C3 */
    public CharSequence[] mo58788C3() {
        return this.f50831o1;
    }

    @C0363p0
    /* renamed from: D3 */
    public CharSequence mo58789D3() {
        CharSequence[] charSequenceArr;
        int G3 = mo58792G3();
        if (G3 < 0 || (charSequenceArr = this.f50831o1) == null) {
            return null;
        }
        return charSequenceArr[G3];
    }

    /* renamed from: E3 */
    public CharSequence[] mo58790E3() {
        return this.f50832p1;
    }

    /* renamed from: F3 */
    public String mo58791F3() {
        return this.f50833q1;
    }

    /* renamed from: G3 */
    public final int mo58792G3() {
        return mo58787B3(this.f50833q1);
    }

    /* renamed from: H3 */
    public void mo58793H3(@C0331e int i) {
        mo58763I3(mo58854Q().getResources().getTextArray(i));
    }

    /* renamed from: I3 */
    public void mo58763I3(CharSequence[] charSequenceArr) {
        this.f50831o1 = charSequenceArr;
    }

    /* renamed from: J3 */
    public void mo58794J3(@C0331e int i) {
        mo58795K3(mo58854Q().getResources().getTextArray(i));
    }

    /* renamed from: K3 */
    public void mo58795K3(CharSequence[] charSequenceArr) {
        this.f50832p1 = charSequenceArr;
    }

    /* renamed from: L3 */
    public void mo58796L3(String str) {
        boolean z = !TextUtils.equals(this.f50833q1, str);
        if (z || !this.f50835s1) {
            this.f50833q1 = str;
            this.f50835s1 = true;
            mo58912u2(str);
            if (z) {
                mo58762G1();
            }
        }
    }

    /* renamed from: M3 */
    public void mo58764M3(int i) {
        CharSequence[] charSequenceArr = this.f50832p1;
        if (charSequenceArr != null) {
            mo58796L3(charSequenceArr[i].toString());
        }
    }

    @C0363p0
    /* renamed from: U0 */
    public CharSequence mo58797U0() {
        if (mo58873c1() != null) {
            return mo58873c1().mo58785a(this);
        }
        Object D3 = mo58789D3();
        CharSequence U0 = super.mo58797U0();
        String str = this.f50834r1;
        if (str == null) {
            return U0;
        }
        Object[] objArr = new Object[1];
        if (D3 == null) {
            D3 = "";
        }
        objArr[0] = D3;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, U0)) {
            return U0;
        }
        return format;
    }

    /* renamed from: X2 */
    public void mo58798X2(@C0363p0 CharSequence charSequence) {
        super.mo58798X2(charSequence);
        if (charSequence == null) {
            this.f50834r1 = null;
        } else {
            this.f50834r1 = charSequence.toString();
        }
    }

    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo58776j2(savedState.getSuperState());
        mo58796L3(savedState.f50836a);
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        Parcelable k2 = super.mo58777k2();
        if (mo58921z1()) {
            return k2;
        }
        SavedState savedState = new SavedState(k2);
        savedState.f50836a = mo58791F3();
        return savedState;
    }

    /* renamed from: l2 */
    public void mo58778l2(Object obj) {
        mo58796L3(mo58834H0((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19895a();

        /* renamed from: a */
        public String f50836a;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        public class C19895a implements Parcelable.Creator<SavedState> {
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
            this.f50836a = parcel.readString();
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50836a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
