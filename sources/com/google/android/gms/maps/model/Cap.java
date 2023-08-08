package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CapCreator")
@SafeParcelable.C40818g({1})
public class Cap extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<Cap> CREATOR = new C30597o();

    /* renamed from: d */
    public static final String f72998d = "Cap";
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 2)

    /* renamed from: a */
    public final int f72999a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getWrappedBitmapDescriptorImplBinder", mo134489id = 3, type = "android.os.IBinder")

    /* renamed from: b */
    public final C30573a f73000b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBitmapRefWidth", mo134489id = 4)

    /* renamed from: c */
    public final Float f73001c;

    public Cap(int i) {
        this(i, (C30573a) null, (Float) null);
    }

    /* renamed from: M */
    public final Cap mo86290M() {
        boolean z;
        int i = this.f72999a;
        if (i == 0) {
            return new ButtCap();
        }
        boolean z2 = true;
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown Cap type: ");
            sb.append(i);
            return this;
        }
        if (this.f73000b != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "bitmapDescriptor must not be null");
        if (this.f73001c == null) {
            z2 = false;
        }
        C40843u.m166209s(z2, "bitmapRefWidth must not be null");
        return new CustomCap(this.f73000b, this.f73001c.floatValue());
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.f72999a != cap.f72999a || !C40808s.m166010b(this.f73000b, cap.f73000b) || !C40808s.m166010b(this.f73001c, cap.f73001c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72999a), this.f73000b, this.f73001c);
    }

    @C0359n0
    public String toString() {
        int i = this.f72999a;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        IBinder iBinder;
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f72999a);
        C30573a aVar = this.f73000b;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo86479a().asBinder();
        }
        C40820a.m166085B(parcel, 3, iBinder, false);
        C40820a.m166144z(parcel, 4, this.f73001c, false);
        C40820a.m166112b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C40813b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cap(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.C40816e(mo134492id = 2) int r2, @androidx.annotation.C0363p0 @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C40816e(mo134492id = 3) android.os.IBinder r3, @androidx.annotation.C0363p0 @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C40816e(mo134492id = 4) java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            com.google.android.gms.dynamic.d r3 = com.google.android.gms.dynamic.C41016d.C41017a.m166799H0(r3)
            com.google.android.gms.maps.model.a r0 = new com.google.android.gms.maps.model.a
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>((int) r2, (com.google.android.gms.maps.model.C30573a) r3, (java.lang.Float) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    public Cap(int i, @C0363p0 C30573a aVar, @C0363p0 Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = aVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        C40843u.m166192b(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.f72999a = i;
        this.f73000b = aVar;
        this.f73001c = f;
    }

    public Cap(@C0359n0 C30573a aVar, float f) {
        this(3, aVar, Float.valueOf(f));
    }
}
