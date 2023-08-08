package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.C40812a(creator = "ModuleAvailabilityResponseCreator")
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new C40882f();
    @SafeParcelable.C40814c(getter = "areModulesAvailable", mo134489id = 1)

    /* renamed from: a */
    public final boolean f104008a;
    @SafeParcelable.C40814c(getter = "getAvailabilityStatus", mo134489id = 2)

    /* renamed from: b */
    public final int f104009b;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse$a */
    public @interface C40873a {

        /* renamed from: N0 */
        public static final int f104010N0 = 0;

        /* renamed from: O0 */
        public static final int f104011O0 = 1;

        /* renamed from: P0 */
        public static final int f104012P0 = 2;
    }

    @C40473a
    @SafeParcelable.C40813b
    public ModuleAvailabilityResponse(@SafeParcelable.C40816e(mo134492id = 1) boolean z, @SafeParcelable.C40816e(mo134492id = 2) int i) {
        this.f104008a = z;
        this.f104009b = i;
    }

    /* renamed from: M */
    public boolean mo134549M() {
        return this.f104008a;
    }

    @C40873a
    /* renamed from: Q */
    public int mo134550Q() {
        return this.f104009b;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166122g(parcel, 1, mo134549M());
        C40820a.m166089F(parcel, 2, mo134550Q());
        C40820a.m166112b(parcel, a);
    }
}
