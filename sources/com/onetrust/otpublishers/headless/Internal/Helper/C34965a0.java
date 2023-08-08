package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35013c;
import com.onetrust.otpublishers.headless.Public.DataModel.OTUXParams;
import com.onetrust.otpublishers.headless.Public.OTThemeConstants;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.a0 */
public class C34965a0 {
    /* renamed from: a */
    public String mo103629a(@C0359n0 Context context) {
        String string = new C35013c(context).mo103965b().getString("OT_UX_SDK_THEME", OTThemeConstants.NO_SDK_THEME_OVERRIDE);
        return C35020d.m143605J(string) ? OTThemeConstants.NO_SDK_THEME_OVERRIDE : string;
    }

    /* renamed from: b */
    public boolean mo103630b(@C0359n0 Context context, @C0359n0 OTUXParams oTUXParams) {
        boolean z;
        if (oTUXParams.getUxParam() != null) {
            C35020d.m143620m(context, oTUXParams.getUxParam());
            z = true;
        } else {
            z = false;
        }
        if (oTUXParams.getOTSDKTheme() != null) {
            C35020d.m143603F(context, oTUXParams.getOTSDKTheme());
        }
        return z;
    }
}
