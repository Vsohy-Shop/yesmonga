package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.C40812a(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new C40914j();
    @SafeParcelable.C40814c(getter = "getSessionId", mo134489id = 1)

    /* renamed from: a */
    public final int f104016a;
    @C40874a
    @SafeParcelable.C40814c(getter = "getInstallState", mo134489id = 2)

    /* renamed from: b */
    public final int f104017b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBytesDownloaded", mo134489id = 3)

    /* renamed from: c */
    public final Long f104018c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTotalBytesToDownload", mo134489id = 4)

    /* renamed from: d */
    public final Long f104019d;
    @SafeParcelable.C40814c(getter = "getErrorCode", mo134489id = 5)

    /* renamed from: e */
    public final int f104020e;
    @C0363p0

    /* renamed from: f */
    public final C40875b f104021f;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$a */
    public @interface C40874a {

        /* renamed from: Q0 */
        public static final int f104022Q0 = 0;

        /* renamed from: R0 */
        public static final int f104023R0 = 1;

        /* renamed from: S0 */
        public static final int f104024S0 = 2;

        /* renamed from: T0 */
        public static final int f104025T0 = 3;

        /* renamed from: U0 */
        public static final int f104026U0 = 4;

        /* renamed from: V0 */
        public static final int f104027V0 = 5;

        /* renamed from: W0 */
        public static final int f104028W0 = 6;

        /* renamed from: X0 */
        public static final int f104029X0 = 7;
    }

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$b */
    public static class C40875b {

        /* renamed from: a */
        public final long f104030a;

        /* renamed from: b */
        public final long f104031b;

        public C40875b(long j, long j2) {
            C40843u.m166206p(j2);
            this.f104030a = j;
            this.f104031b = j2;
        }

        /* renamed from: a */
        public long mo134563a() {
            return this.f104030a;
        }

        /* renamed from: b */
        public long mo134564b() {
            return this.f104031b;
        }
    }

    @C40473a
    @SafeParcelable.C40813b
    public ModuleInstallStatusUpdate(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) @C40874a int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) Long l, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) Long l2, @SafeParcelable.C40816e(mo134492id = 5) int i3) {
        C40875b bVar;
        this.f104016a = i;
        this.f104017b = i2;
        this.f104018c = l;
        this.f104019d = l2;
        this.f104020e = i3;
        if (l == null || l2 == null || l2.longValue() == 0) {
            bVar = null;
        } else {
            bVar = new C40875b(l.longValue(), l2.longValue());
        }
        this.f104021f = bVar;
    }

    /* renamed from: M */
    public int mo134558M() {
        return this.f104020e;
    }

    @C40874a
    /* renamed from: Q */
    public int mo134559Q() {
        return this.f104017b;
    }

    @C0363p0
    /* renamed from: W */
    public C40875b mo134560W() {
        return this.f104021f;
    }

    /* renamed from: X */
    public int mo134561X() {
        return this.f104016a;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, mo134561X());
        C40820a.m166089F(parcel, 2, mo134559Q());
        C40820a.m166097N(parcel, 3, this.f104018c, false);
        C40820a.m166097N(parcel, 4, this.f104019d, false);
        C40820a.m166089F(parcel, 5, mo134558M());
        C40820a.m166112b(parcel, a);
    }
}
