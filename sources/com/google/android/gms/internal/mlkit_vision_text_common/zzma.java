package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextLineParcelCreator")
public final class zzma extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzma> CREATOR = new C30176pa();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f72646a;
    @SafeParcelable.C40814c(getter = "getBoundingBox", mo134489id = 2)

    /* renamed from: b */
    public final Rect f72647b;
    @SafeParcelable.C40814c(getter = "getCornerPointList", mo134489id = 3)

    /* renamed from: c */
    public final List<Point> f72648c;
    @SafeParcelable.C40814c(getter = "getRecognizedLanguage", mo134489id = 4)

    /* renamed from: d */
    public final String f72649d;
    @SafeParcelable.C40814c(getter = "getTextElementList", mo134489id = 5)

    /* renamed from: e */
    public final List<zzly> f72650e;

    @SafeParcelable.C40813b
    public zzma(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) Rect rect, @SafeParcelable.C40816e(mo134492id = 3) List<Point> list, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) List<zzly> list2) {
        this.f72646a = str;
        this.f72647b = rect;
        this.f72648c = list;
        this.f72649d = str2;
        this.f72650e = list2;
    }

    /* renamed from: M */
    public final Rect mo85501M() {
        return this.f72647b;
    }

    /* renamed from: Q */
    public final String mo85502Q() {
        return this.f72649d;
    }

    /* renamed from: W */
    public final String mo85503W() {
        return this.f72646a;
    }

    /* renamed from: X */
    public final List<Point> mo85504X() {
        return this.f72648c;
    }

    /* renamed from: e0 */
    public final List<zzly> mo85505e0() {
        return this.f72650e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f72646a, false);
        C40820a.m166102S(parcel, 2, this.f72647b, i, false);
        C40820a.m166117d0(parcel, 3, this.f72648c, false);
        C40820a.m166108Y(parcel, 4, this.f72649d, false);
        C40820a.m166117d0(parcel, 5, this.f72650e, false);
        C40820a.m166112b(parcel, a);
    }
}
