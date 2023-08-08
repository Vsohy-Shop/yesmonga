package com.onetrust.otpublishers.headless.p052UI.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35081h;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35201e0;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.d */
public class C35035d {
    /* renamed from: a */
    public boolean mo104301a(@C0359n0 C19232h hVar, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        if (C35020d.m143624s(hVar, OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG)) {
            return false;
        }
        OTLogger.m143458m("OneTrust", "Showing Preference Center");
        if (new C35015e((Context) hVar).mo103990a() == 101) {
            UIUtils.m143740C(hVar, C35081h.m144058Q0(OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG, aVar, 1), OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG);
        } else {
            UIUtils.m143740C(hVar, C35201e0.m145086P0(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG, aVar, oTConfiguration), OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG);
        }
        new UIUtils().mo104267E(new C34963b(5), aVar);
        if (new C35020d().mo104026a(hVar) < 1) {
            new C35020d().mo104028i(hVar, 1);
        }
        return true;
    }
}
