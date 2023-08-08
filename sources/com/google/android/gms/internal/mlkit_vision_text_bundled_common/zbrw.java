package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextElementParcelCreator")
public final class zbrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbrw> CREATOR = new C29718st();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f71615a;
    @SafeParcelable.C40814c(getter = "getBoundingBox", mo134489id = 2)

    /* renamed from: b */
    public final Rect f71616b;
    @SafeParcelable.C40814c(getter = "getCornerPointList", mo134489id = 3)

    /* renamed from: c */
    public final List<Point> f71617c;
    @SafeParcelable.C40814c(getter = "getRecognizedLanguage", mo134489id = 4)

    /* renamed from: d */
    public final String f71618d;

    @SafeParcelable.C40813b
    public zbrw(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) Rect rect, @SafeParcelable.C40816e(mo134492id = 3) List<Point> list, @SafeParcelable.C40816e(mo134492id = 4) String str2) {
        this.f71615a = str;
        this.f71616b = rect;
        this.f71617c = list;
        this.f71618d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f71615a, false);
        C40820a.m166102S(parcel, 2, this.f71616b, i, false);
        C40820a.m166117d0(parcel, 3, this.f71617c, false);
        C40820a.m166108Y(parcel, 4, this.f71618d, false);
        C40820a.m166112b(parcel, a);
    }
}
