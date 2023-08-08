package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "TextElementParcelCreator")
public final class zzly extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzly> CREATOR = new C30152na();
    @SafeParcelable.C40814c(getter = "getText", mo134489id = 1)

    /* renamed from: a */
    public final String f72642a;
    @SafeParcelable.C40814c(getter = "getBoundingBox", mo134489id = 2)

    /* renamed from: b */
    public final Rect f72643b;
    @SafeParcelable.C40814c(getter = "getCornerPointList", mo134489id = 3)

    /* renamed from: c */
    public final List<Point> f72644c;
    @SafeParcelable.C40814c(getter = "getRecognizedLanguage", mo134489id = 4)

    /* renamed from: d */
    public final String f72645d;

    @SafeParcelable.C40813b
    public zzly(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) Rect rect, @SafeParcelable.C40816e(mo134492id = 3) List<Point> list, @SafeParcelable.C40816e(mo134492id = 4) String str2) {
        this.f72642a = str;
        this.f72643b = rect;
        this.f72644c = list;
        this.f72645d = str2;
    }

    /* renamed from: M */
    public final Rect mo85496M() {
        return this.f72643b;
    }

    /* renamed from: Q */
    public final String mo85497Q() {
        return this.f72645d;
    }

    /* renamed from: W */
    public final String mo85498W() {
        return this.f72642a;
    }

    /* renamed from: X */
    public final List<Point> mo85499X() {
        return this.f72644c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f72642a, false);
        C40820a.m166102S(parcel, 2, this.f72643b, i, false);
        C40820a.m166117d0(parcel, 3, this.f72644c, false);
        C40820a.m166108Y(parcel, 4, this.f72645d, false);
        C40820a.m166112b(parcel, a);
    }
}
