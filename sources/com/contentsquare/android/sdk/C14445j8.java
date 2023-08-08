package com.contentsquare.android.sdk;

import androidx.preference.C19928i;
import androidx.preference.C19944m;
import androidx.preference.Preference;
import androidx.preference.SeekBarPreference;
import androidx.preference.SwitchPreferenceCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.j8 */
public final class C14445j8 {

    /* renamed from: a */
    public final C19944m f35687a;

    /* renamed from: b */
    public final C19928i f35688b;

    public C14445j8(C19944m mVar, C19928i iVar) {
        Intrinsics.checkNotNullParameter(mVar, "preferenceFragment");
        Intrinsics.checkNotNullParameter(iVar, "preferenceDataStore");
        this.f35687a = mVar;
        this.f35688b = iVar;
    }

    /* renamed from: c */
    public static /* synthetic */ SwitchPreferenceCompat m62203c(C14445j8 j8Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return j8Var.mo35640b(i, z);
    }

    /* renamed from: a */
    public final SeekBarPreference mo35639a(int i, int i2, boolean z) {
        SeekBarPreference seekBarPreference = (SeekBarPreference) mo35642e(i);
        if (seekBarPreference != null) {
            seekBarPreference.mo58977x3(this.f35688b.mo36776c(mo35641d(i), i2));
        }
        if (seekBarPreference != null) {
            seekBarPreference.mo58829E2(z);
        }
        return seekBarPreference;
    }

    /* renamed from: b */
    public final SwitchPreferenceCompat mo35640b(int i, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) mo35642e(i);
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.mo59011o3(this.f35688b.mo36774a(mo35641d(i), z));
        }
        return switchPreferenceCompat;
    }

    /* renamed from: d */
    public final String mo35641d(int i) {
        String string = this.f35687a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "preferenceFragment.getString(resIdKey)");
        return string;
    }

    /* renamed from: e */
    public final <T extends Preference> T mo35642e(int i) {
        T f0 = this.f35687a.mo58761f0(mo35641d(i));
        if (f0 != null) {
            f0.mo58872b3(i);
        }
        if (f0 != null) {
            f0.mo58858S2(this.f35688b);
        }
        return f0;
    }
}
