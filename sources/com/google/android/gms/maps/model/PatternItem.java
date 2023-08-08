package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.C40812a(creator = "PatternItemCreator")
@SafeParcelable.C40818g({1})
public class PatternItem extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<PatternItem> CREATOR = new C30605w();

    /* renamed from: c */
    public static final String f73052c = "PatternItem";
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 2)

    /* renamed from: a */
    public final int f73053a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLength", mo134489id = 3)

    /* renamed from: b */
    public final Float f73054b;

    @SafeParcelable.C40813b
    public PatternItem(@SafeParcelable.C40816e(mo134492id = 2) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C40843u.m166192b(z, sb.toString());
        this.f73053a = i;
        this.f73054b = f;
    }

    @C0363p0
    /* renamed from: M */
    public static List<PatternItem> m123081M(@C0363p0 List<PatternItem> list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem next : list) {
            if (next == null) {
                next = null;
            } else {
                int i = next.f73053a;
                boolean z = false;
                if (i == 0) {
                    if (next.f73054b != null) {
                        z = true;
                    }
                    C40843u.m166209s(z, "length must not be null.");
                    patternItem = new Dash(next.f73054b.floatValue());
                } else if (i == 1) {
                    next = new Dot();
                } else if (i != 2) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unknown PatternItem type: ");
                    sb.append(i);
                } else {
                    if (next.f73054b != null) {
                        z = true;
                    }
                    C40843u.m166209s(z, "length must not be null.");
                    patternItem = new Gap(next.f73054b.floatValue());
                }
                next = patternItem;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.f73053a != patternItem.f73053a || !C40808s.m166010b(this.f73054b, patternItem.f73054b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f73053a), this.f73054b);
    }

    @C0359n0
    public String toString() {
        int i = this.f73053a;
        String valueOf = String.valueOf(this.f73054b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f73053a);
        C40820a.m166144z(parcel, 3, this.f73054b, false);
        C40820a.m166112b(parcel, a);
    }
}
