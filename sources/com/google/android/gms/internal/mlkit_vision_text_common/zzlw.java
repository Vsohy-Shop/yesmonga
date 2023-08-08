package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextBlockParcelCreator")
public final class zzlw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlw> CREATOR = new C30140ma();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f72637a;
    @SafeParcelable.C40814c(getter = "getBoundingBox", mo134489id = 2)

    /* renamed from: b */
    public final Rect f72638b;
    @SafeParcelable.C40814c(getter = "getCornerPointList", mo134489id = 3)

    /* renamed from: c */
    public final List<Point> f72639c;
    @SafeParcelable.C40814c(getter = "getRecognizedLanguage", mo134489id = 4)

    /* renamed from: d */
    public final String f72640d;
    @SafeParcelable.C40814c(getter = "getTextLineList", mo134489id = 5)

    /* renamed from: e */
    public final List<zzma> f72641e;

    @SafeParcelable.C40813b
    public zzlw(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) Rect rect, @SafeParcelable.C40816e(mo134492id = 3) List<Point> list, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) List<zzma> list2) {
        this.f72637a = str;
        this.f72638b = rect;
        this.f72639c = list;
        this.f72640d = str2;
        this.f72641e = list2;
    }

    /* renamed from: M */
    public final Rect mo85490M() {
        return this.f72638b;
    }

    /* renamed from: Q */
    public final String mo85491Q() {
        return this.f72640d;
    }

    /* renamed from: W */
    public final String mo85492W() {
        return this.f72637a;
    }

    /* renamed from: X */
    public final List<Point> mo85493X() {
        return this.f72639c;
    }

    /* renamed from: e0 */
    public final List<zzma> mo85494e0() {
        return this.f72641e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f72637a, false);
        C40820a.m166102S(parcel, 2, this.f72638b, i, false);
        C40820a.m166117d0(parcel, 3, this.f72639c, false);
        C40820a.m166108Y(parcel, 4, this.f72640d, false);
        C40820a.m166117d0(parcel, 5, this.f72641e, false);
        C40820a.m166112b(parcel, a);
    }
}
