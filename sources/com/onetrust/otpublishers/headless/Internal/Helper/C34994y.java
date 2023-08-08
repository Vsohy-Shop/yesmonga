package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTCache;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.y */
public class C34994y {
    @C0359n0
    /* renamed from: a */
    public OTCache mo103913a(@C0359n0 Context context) {
        OTCache.OTCacheBuilder newInstance = OTCache.OTCacheBuilder.newInstance();
        newInstance.setDataSubjectIdentifier(new C35015e(new C35014d(context, "OTT_DEFAULT_USER")).mo103967B());
        return newInstance.build();
    }

    /* renamed from: b */
    public boolean mo103914b(@C0359n0 Context context, @C0359n0 OTCache oTCache) {
        return new C35020d().mo104019I(context, oTCache.getDataSubjectIdentifier());
    }
}
