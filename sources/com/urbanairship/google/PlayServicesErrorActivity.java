package com.urbanairship.google;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.C19232h;
import com.google.android.gms.common.C40713g;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

public class PlayServicesErrorActivity extends C19232h {

    /* renamed from: R0 */
    public static final int f24616R0 = 1000;

    /* renamed from: S0 */
    public static final String f24617S0 = "error_dialog";

    /* renamed from: com.urbanairship.google.PlayServicesErrorActivity$a */
    public static class C9107a extends C19215c {
        @C0359n0

        /* renamed from: a */
        public static final String f24618a = "dialog_error";

        @C0359n0
        /* renamed from: K0 */
        public static C9107a m34007K0(int i) {
            C9107a aVar = new C9107a();
            Bundle bundle = new Bundle();
            bundle.putInt(f24618a, i);
            aVar.setArguments(bundle);
            return aVar;
        }

        public void onCancel(@C0359n0 DialogInterface dialogInterface) {
            super.onCancel(dialogInterface);
            if (getActivity() != null) {
                getActivity().finish();
            }
        }

        @C0359n0
        public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
            int i;
            if (getArguments() != null) {
                i = getArguments().getInt(f24618a);
            } else {
                i = 0;
            }
            return C40713g.m165640x().mo134213s(getActivity(), i, 1000);
        }
    }

    /* renamed from: A0 */
    public final void mo18121A0() {
        C36059m.m148413i("Checking Google Play services.", new Object[0]);
        int a = C9108a.m34008a(this);
        if (a == 0) {
            C36059m.m148406b("Google Play services available!", new Object[0]);
            finish();
        } else if (C9108a.m34009b(a)) {
            C36059m.m148406b("Google Play services recoverable error: %s", Integer.valueOf(a));
            C9107a.m34007K0(a).show(mo57175g0(), f24617S0);
        } else {
            C36059m.m148409e("Unrecoverable Google Play services error: %s", Integer.valueOf(a));
            finish();
        }
    }

    public void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            return;
        }
        if (i2 == -1) {
            C36059m.m148406b("Google Play services resolution received result ok.", new Object[0]);
            mo18121A0();
            return;
        }
        C36059m.m148406b("Google Play services resolution canceled.", new Object[0]);
        finish();
    }

    public void onStart() {
        super.onStart();
        if (mo57175g0().mo56903s0(f24617S0) == null) {
            mo18121A0();
        }
    }

    public void onStop() {
        super.onStop();
        if (isFinishing() && C9108a.m34008a(this) == 0 && UAirship.m146188Y().mo106203E().mo19427l0()) {
            UAirship.m146188Y().mo106223n().mo17817y0();
        }
    }
}
