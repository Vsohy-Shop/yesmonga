package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ModuleInstallIntentResponseCreator")
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new C40883g();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPendingIntent", mo134489id = 1)

    /* renamed from: a */
    public final PendingIntent f104013a;

    @C40473a
    @SafeParcelable.C40813b
    public ModuleInstallIntentResponse(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) PendingIntent pendingIntent) {
        this.f104013a = pendingIntent;
    }

    @C0363p0
    /* renamed from: M */
    public PendingIntent mo134552M() {
        return this.f104013a;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, mo134552M(), i, false);
        C40820a.m166112b(parcel, a);
    }
}
