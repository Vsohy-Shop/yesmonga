package com.urbanairship.iam;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.activity.C35516b;
import com.urbanairship.iam.assets.Assets;

/* renamed from: com.urbanairship.iam.k */
public abstract class C9206k extends C35516b {
    @C0359n0

    /* renamed from: Y0 */
    public static final String f25060Y0 = "display_handler";
    @C0359n0

    /* renamed from: Z0 */
    public static final String f25061Z0 = "in_app_message";
    @C0359n0

    /* renamed from: a1 */
    public static final String f25062a1 = "assets";

    /* renamed from: b1 */
    public static final String f25063b1 = "display_time";

    /* renamed from: T0 */
    public DisplayHandler f25064T0;

    /* renamed from: U0 */
    public InAppMessage f25065U0;

    /* renamed from: V0 */
    public Assets f25066V0;

    /* renamed from: W0 */
    public long f25067W0 = 0;

    /* renamed from: X0 */
    public long f25068X0 = 0;

    @C0363p0
    /* renamed from: D0 */
    public DisplayHandler mo18491D0() {
        return this.f25064T0;
    }

    /* renamed from: E0 */
    public long mo18492E0() {
        long j = this.f25068X0;
        if (this.f25067W0 > 0) {
            return j + (System.currentTimeMillis() - this.f25067W0);
        }
        return j;
    }

    @C0363p0
    /* renamed from: F0 */
    public InAppMessage mo18493F0() {
        return this.f25065U0;
    }

    @C0363p0
    /* renamed from: G0 */
    public Assets mo18494G0() {
        return this.f25066V0;
    }

    /* renamed from: H0 */
    public abstract void mo18414H0(@C0363p0 Bundle bundle);

    public void onBackPressed() {
        super.onBackPressed();
        this.f25064T0.mo18165c(C9163c0.m34349c(), mo18492E0());
        finish();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        Autopilot.m146142e(getApplicationContext());
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getExtras() == null) {
            finish();
            return;
        }
        this.f25064T0 = (DisplayHandler) getIntent().getParcelableExtra(f25060Y0);
        this.f25065U0 = (InAppMessage) getIntent().getParcelableExtra("in_app_message");
        this.f25066V0 = (Assets) getIntent().getParcelableExtra(f25062a1);
        DisplayHandler displayHandler = this.f25064T0;
        if (displayHandler == null || this.f25065U0 == null) {
            C36059m.m148409e("%s unable to show message. Missing display handler or in-app message", getClass());
            finish();
        } else if (!displayHandler.mo18170g(this)) {
            finish();
        } else {
            if (bundle != null) {
                this.f25068X0 = bundle.getLong("display_time", 0);
            }
            mo18414H0(bundle);
        }
    }

    public void onPause() {
        super.onPause();
        this.f25068X0 += System.currentTimeMillis() - this.f25067W0;
        this.f25067W0 = 0;
    }

    public void onPostCreate(@C0363p0 Bundle bundle) {
        super.onPostCreate(bundle);
        if (!this.f25064T0.mo18170g(this)) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        this.f25067W0 = System.currentTimeMillis();
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("display_time", this.f25068X0);
    }
}
