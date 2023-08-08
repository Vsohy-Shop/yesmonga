package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.C40812a(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<WebImage> CREATOR = new C40728i();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103718a;
    @SafeParcelable.C40814c(getter = "getUrl", mo134489id = 2)

    /* renamed from: b */
    public final Uri f103719b;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 3)

    /* renamed from: c */
    public final int f103720c;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 4)

    /* renamed from: d */
    public final int f103721d;

    @SafeParcelable.C40813b
    public WebImage(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) Uri uri, @SafeParcelable.C40816e(mo134492id = 3) int i2, @SafeParcelable.C40816e(mo134492id = 4) int i3) {
        this.f103718a = i;
        this.f103719b = uri;
        this.f103720c = i2;
        this.f103721d = i3;
    }

    @C0359n0
    /* renamed from: M */
    public Uri mo134239M() {
        return this.f103719b;
    }

    @C40473a
    @C0359n0
    /* renamed from: Q */
    public JSONObject mo134240Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f103719b.toString());
            jSONObject.put("width", this.f103720c);
            jSONObject.put("height", this.f103721d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (C40808s.m166010b(this.f103719b, webImage.f103719b) && this.f103720c == webImage.f103720c && this.f103721d == webImage.f103721d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int getHeight() {
        return this.f103721d;
    }

    public int getWidth() {
        return this.f103720c;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f103719b, Integer.valueOf(this.f103720c), Integer.valueOf(this.f103721d));
    }

    @C0359n0
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f103720c), Integer.valueOf(this.f103721d), this.f103719b.toString()});
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103718a);
        C40820a.m166102S(parcel, 2, mo134239M(), i, false);
        C40820a.m166089F(parcel, 3, getWidth());
        C40820a.m166089F(parcel, 4, getHeight());
        C40820a.m166112b(parcel, a);
    }

    public WebImage(@C0359n0 Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@C0359n0 Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@androidx.annotation.C0359n0 org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}
