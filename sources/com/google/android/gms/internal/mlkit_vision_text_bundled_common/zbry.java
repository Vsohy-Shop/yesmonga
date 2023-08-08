package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextLineParcelCreator")
public final class zbry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbry> CREATOR = new C29755tt();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f71619a;
    @SafeParcelable.C40814c(getter = "getBoundingBox", mo134489id = 2)

    /* renamed from: b */
    public final Rect f71620b;
    @SafeParcelable.C40814c(getter = "getCornerPointList", mo134489id = 3)

    /* renamed from: c */
    public final List<Point> f71621c;
    @SafeParcelable.C40814c(getter = "getRecognizedLanguage", mo134489id = 4)

    /* renamed from: d */
    public final String f71622d;
    @SafeParcelable.C40814c(getter = "getTextElementList", mo134489id = 5)

    /* renamed from: e */
    public final List<zbrw> f71623e;

    @SafeParcelable.C40813b
    public zbry(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) Rect rect, @SafeParcelable.C40816e(mo134492id = 3) List<Point> list, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) List<zbrw> list2) {
        this.f71619a = str;
        this.f71620b = rect;
        this.f71621c = list;
        this.f71622d = str2;
        this.f71623e = list2;
    }

    /* renamed from: M */
    public final String mo84984M() {
        return this.f71622d;
    }

    /* renamed from: Q */
    public final String mo84985Q() {
        return this.f71619a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f71619a, false);
        C40820a.m166102S(parcel, 2, this.f71620b, i, false);
        C40820a.m166117d0(parcel, 3, this.f71621c, false);
        C40820a.m166108Y(parcel, 4, this.f71622d, false);
        C40820a.m166117d0(parcel, 5, this.f71623e, false);
        C40820a.m166112b(parcel, a);
    }
}
