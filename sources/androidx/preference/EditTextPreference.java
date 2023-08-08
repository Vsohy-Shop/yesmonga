package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {

    /* renamed from: o1 */
    public String f50826o1;
    @C0363p0

    /* renamed from: p1 */
    public C19893a f50827p1;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface C19893a {
        /* renamed from: a */
        void mo58784a(@C0359n0 EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    public static final class C19894b implements Preference.C19904f<EditTextPreference> {

        /* renamed from: a */
        public static C19894b f50829a;

        @C0359n0
        /* renamed from: b */
        public static C19894b m92387b() {
            if (f50829a == null) {
                f50829a = new C19894b();
            }
            return f50829a;
        }

        @C0363p0
        /* renamed from: c */
        public CharSequence mo58785a(@C0359n0 EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.mo58771C3())) {
                return editTextPreference.mo58854Q().getString(C19975v.C19984i.not_set);
            }
            return editTextPreference.mo58771C3();
        }
    }

    public EditTextPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.EditTextPreference, i, i2);
        int i3 = C19975v.C19986k.EditTextPreference_useSimpleSummaryProvider;
        if (C17483q.m80226b(obtainStyledAttributes, i3, i3, false)) {
            mo58867Y2(C19894b.m92387b());
        }
        obtainStyledAttributes.recycle();
    }

    @C0363p0
    /* renamed from: B3 */
    public C19893a mo58770B3() {
        return this.f50827p1;
    }

    @C0363p0
    /* renamed from: C3 */
    public String mo58771C3() {
        return this.f50826o1;
    }

    /* renamed from: D3 */
    public void mo58772D3(@C0363p0 C19893a aVar) {
        this.f50827p1 = aVar;
    }

    /* renamed from: E3 */
    public void mo58773E3(@C0363p0 String str) {
        boolean e3 = mo58775e3();
        this.f50826o1 = str;
        mo58912u2(str);
        boolean e32 = mo58775e3();
        if (e32 != e3) {
            mo58835H1(e32);
        }
        mo58762G1();
    }

    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: e3 */
    public boolean mo58775e3() {
        return TextUtils.isEmpty(this.f50826o1) || super.mo58775e3();
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo58776j2(savedState.getSuperState());
        mo58773E3(savedState.f50828a);
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        Parcelable k2 = super.mo58777k2();
        if (mo58921z1()) {
            return k2;
        }
        SavedState savedState = new SavedState(k2);
        savedState.f50828a = mo58771C3();
        return savedState;
    }

    /* renamed from: l2 */
    public void mo58778l2(Object obj) {
        mo58773E3(mo58834H0((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19892a();

        /* renamed from: a */
        public String f50828a;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        public class C19892a implements Parcelable.Creator<SavedState> {
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
            this.f50828a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50828a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
