package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import androidx.core.content.res.C17483q;
import androidx.preference.C19975v;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: r1 */
    public static final String f50889r1 = "PreferenceGroup";

    /* renamed from: i1 */
    public final C1886l<String, Long> f50890i1;

    /* renamed from: j1 */
    public final Handler f50891j1;

    /* renamed from: k1 */
    public final List<Preference> f50892k1;

    /* renamed from: l1 */
    public boolean f50893l1;

    /* renamed from: m1 */
    public int f50894m1;

    /* renamed from: n1 */
    public boolean f50895n1;

    /* renamed from: o1 */
    public int f50896o1;

    /* renamed from: p1 */
    public C19907b f50897p1;

    /* renamed from: q1 */
    public final Runnable f50898q1;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    public class C19906a implements Runnable {
        public C19906a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f50890i1.clear();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C19907b {
        /* renamed from: a */
        void mo58958a();
    }

    /* renamed from: androidx.preference.PreferenceGroup$c */
    public interface C19908c {
        /* renamed from: e */
        int mo58959e(@C0359n0 Preference preference);

        /* renamed from: j */
        int mo58960j(@C0359n0 String str);
    }

    public PreferenceGroup(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50890i1 = new C1886l<>();
        this.f50891j1 = new Handler(Looper.getMainLooper());
        this.f50893l1 = true;
        this.f50894m1 = 0;
        this.f50895n1 = false;
        this.f50896o1 = Integer.MAX_VALUE;
        this.f50897p1 = null;
        this.f50898q1 = new C19906a();
        this.f50892k1 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.PreferenceGroup, i, i2);
        int i3 = C19975v.C19986k.PreferenceGroup_orderingFromXml;
        this.f50893l1 = C17483q.m80226b(obtainStyledAttributes, i3, i3, true);
        int i4 = C19975v.C19986k.PreferenceGroup_initialExpandedChildrenCount;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo58951z3(C17483q.m80228d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: A3 */
    public void mo58933A3(@C0363p0 C19907b bVar) {
        this.f50897p1 = bVar;
    }

    /* renamed from: B3 */
    public void mo58934B3(boolean z) {
        this.f50893l1 = z;
    }

    /* renamed from: C3 */
    public void mo58935C3() {
        synchronized (this) {
            Collections.sort(this.f50892k1);
        }
    }

    /* renamed from: H1 */
    public void mo58835H1(boolean z) {
        super.mo58835H1(z);
        int q3 = mo58942q3();
        for (int i = 0; i < q3; i++) {
            mo58941p3(i).mo58879e2(this, z);
        }
    }

    /* renamed from: L1 */
    public void mo58843L1() {
        super.mo58843L1();
        this.f50895n1 = true;
        int q3 = mo58942q3();
        for (int i = 0; i < q3; i++) {
            mo58941p3(i).mo58843L1();
        }
    }

    /* renamed from: Y1 */
    public void mo58866Y1() {
        super.mo58866Y1();
        this.f50895n1 = false;
        int q3 = mo58942q3();
        for (int i = 0; i < q3; i++) {
            mo58941p3(i).mo58866Y1();
        }
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo58776j2(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f50896o1 = savedState.f50899a;
        super.mo58776j2(savedState.getSuperState());
    }

    @C0359n0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        return new SavedState(super.mo58777k2(), this.f50896o1);
    }

    /* renamed from: k3 */
    public void mo58936k3(@C0359n0 Preference preference) {
        mo58937l3(preference);
    }

    /* renamed from: l3 */
    public boolean mo58937l3(@C0359n0 Preference preference) {
        long j;
        if (this.f50892k1.contains(preference)) {
            return true;
        }
        if (preference.mo58889j0() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.mo58908t0() != null) {
                preferenceGroup = preferenceGroup.mo58908t0();
            }
            String j0 = preference.mo58889j0();
            if (preferenceGroup.mo58938m3(j0) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Found duplicated key: \"");
                sb.append(j0);
                sb.append("\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.mo58901p0() == Integer.MAX_VALUE) {
            if (this.f50893l1) {
                int i = this.f50894m1;
                this.f50894m1 = i + 1;
                preference.mo58855Q2(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).mo58934B3(this.f50893l1);
            }
        }
        int binarySearch = Collections.binarySearch(this.f50892k1, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!mo58946u3(preference)) {
            return false;
        }
        synchronized (this) {
            this.f50892k1.add(binarySearch, preference);
        }
        C19966s N0 = mo58848N0();
        String j02 = preference.mo58889j0();
        if (j02 == null || !this.f50890i1.containsKey(j02)) {
            j = N0.mo59194h();
        } else {
            j = this.f50890i1.get(j02).longValue();
            this.f50890i1.remove(j02);
        }
        preference.mo58849N1(N0, j);
        preference.mo58871b(this);
        if (this.f50895n1) {
            preference.mo58843L1();
        }
        mo58837I1();
        return true;
    }

    @C0363p0
    /* renamed from: m3 */
    public <T extends Preference> T mo58938m3(@C0359n0 CharSequence charSequence) {
        T m3;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(mo58889j0(), charSequence)) {
            return this;
        } else {
            int q3 = mo58942q3();
            for (int i = 0; i < q3; i++) {
                T p3 = mo58941p3(i);
                if (TextUtils.equals(p3.mo58889j0(), charSequence)) {
                    return p3;
                }
                if ((p3 instanceof PreferenceGroup) && (m3 = ((PreferenceGroup) p3).mo58938m3(charSequence)) != null) {
                    return m3;
                }
            }
            return null;
        }
    }

    /* renamed from: n3 */
    public int mo58939n3() {
        return this.f50896o1;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: o3 */
    public C19907b mo58940o3() {
        return this.f50897p1;
    }

    @C0359n0
    /* renamed from: p3 */
    public Preference mo58941p3(int i) {
        return this.f50892k1.get(i);
    }

    /* renamed from: q3 */
    public int mo58942q3() {
        return this.f50892k1.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: r3 */
    public boolean mo58943r3() {
        return this.f50895n1;
    }

    /* renamed from: s3 */
    public boolean mo58944s3() {
        return true;
    }

    /* renamed from: t3 */
    public boolean mo58945t3() {
        return this.f50893l1;
    }

    /* renamed from: u3 */
    public boolean mo58946u3(@C0359n0 Preference preference) {
        preference.mo58879e2(this, mo58775e3());
        return true;
    }

    /* renamed from: v3 */
    public void mo58947v3() {
        synchronized (this) {
            List<Preference> list = this.f50892k1;
            for (int size = list.size() - 1; size >= 0; size--) {
                mo58949x3(list.get(0));
            }
        }
        mo58837I1();
    }

    /* renamed from: w */
    public void mo58914w(@C0359n0 Bundle bundle) {
        super.mo58914w(bundle);
        int q3 = mo58942q3();
        for (int i = 0; i < q3; i++) {
            mo58941p3(i).mo58914w(bundle);
        }
    }

    /* renamed from: w3 */
    public boolean mo58948w3(@C0359n0 Preference preference) {
        boolean x3 = mo58949x3(preference);
        mo58837I1();
        return x3;
    }

    /* renamed from: x3 */
    public final boolean mo58949x3(@C0359n0 Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.mo58887i2();
            if (preference.mo58908t0() == this) {
                preference.mo58871b((PreferenceGroup) null);
            }
            remove = this.f50892k1.remove(preference);
            if (remove) {
                String j0 = preference.mo58889j0();
                if (j0 != null) {
                    this.f50890i1.put(j0, Long.valueOf(preference.mo58884h0()));
                    this.f50891j1.removeCallbacks(this.f50898q1);
                    this.f50891j1.post(this.f50898q1);
                }
                if (this.f50895n1) {
                    preference.mo58866Y1();
                }
            }
        }
        return remove;
    }

    /* renamed from: y */
    public void mo58918y(@C0359n0 Bundle bundle) {
        super.mo58918y(bundle);
        int q3 = mo58942q3();
        for (int i = 0; i < q3; i++) {
            mo58941p3(i).mo58918y(bundle);
        }
    }

    /* renamed from: y3 */
    public boolean mo58950y3(@C0359n0 CharSequence charSequence) {
        Preference m3 = mo58938m3(charSequence);
        if (m3 == null) {
            return false;
        }
        return m3.mo58908t0().mo58948w3(m3);
    }

    /* renamed from: z3 */
    public void mo58951z3(int i) {
        if (i != Integer.MAX_VALUE && !mo58893l1()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
        }
        this.f50896o1 = i;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19905a();

        /* renamed from: a */
        public int f50899a;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        public class C19905a implements Parcelable.Creator<SavedState> {
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
            this.f50899a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50899a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f50899a = i;
        }
    }

    public PreferenceGroup(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
