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
import com.onetrust.otpublishers.headless.p052UI.fragment.C35217j;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.c */
public class C35034c {
    /* renamed from: a */
    public static void m143796a(@C0359n0 C19232h hVar) {
        if (new C35020d().mo104026a(hVar) < 1) {
            new C35020d().mo104028i(hVar, 1);
        }
    }

    /* renamed from: b */
    public static void m143797b(@C0359n0 C19232h hVar, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        UIUtils.m143740C(hVar, C35217j.m145183P0(OTFragmentTags.OT_BANNER_FRAGMENT_TAG, aVar, oTConfiguration), OTFragmentTags.OT_BANNER_FRAGMENT_TAG);
    }

    /* renamed from: c */
    public static void m143798c(@C0359n0 C19232h hVar, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        UIUtils.m143740C(hVar, C35081h.m144058Q0(OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG, aVar, 0), OTFragmentTags.OT_TV_MAIN_FRAGMENT_TAG);
    }

    /* renamed from: d */
    public boolean mo104300d(@C0359n0 C19232h hVar, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        if (C35020d.m143624s(hVar, OTFragmentTags.OT_BANNER_FRAGMENT_TAG)) {
            return false;
        }
        if (new C35015e((Context) hVar).mo103990a() == 101) {
            m143798c(hVar, aVar, oTConfiguration);
        } else {
            m143797b(hVar, aVar, oTConfiguration);
        }
        OTLogger.m143458m("OneTrust", "Showing Banner");
        new UIUtils().mo104267E(new C34963b(1), aVar);
        m143796a(hVar);
        return true;
    }
}
