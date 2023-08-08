package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35492e;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.modules.location.AirshipLocationClient;
import java.util.Set;

public class FetchDeviceInfoAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87435h = "fetch_device_info";
    @C0359n0

    /* renamed from: i */
    public static final String f87436i = "^fdi";
    @C0359n0

    /* renamed from: j */
    public static final String f87437j = "channel_id";
    @C0359n0

    /* renamed from: k */
    public static final String f87438k = "named_user";
    @C0359n0

    /* renamed from: l */
    public static final String f87439l = "tags";
    @C0359n0

    /* renamed from: m */
    public static final String f87440m = "push_opt_in";
    @C0359n0

    /* renamed from: n */
    public static final String f87441n = "location_enabled";

    public static class FetchDeviceInfoPredicate implements C35492e.C35494b {
        /* renamed from: a */
        public boolean mo106318a(@C0359n0 C35489b bVar) {
            if (bVar.mo106348b() == 3 || bVar.mo106348b() == 0) {
                return true;
            }
            return false;
        }
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        boolean z;
        AirshipLocationClient w = UAirship.m146188Y().mo106232w();
        C9323b.C9325b h = C9323b.m35017y().mo18823g("channel_id", UAirship.m146188Y().mo106223n().mo17793Z()).mo18824h(f87440m, UAirship.m146188Y().mo106203E().mo19425j0());
        if (w == null || !w.mo19110d()) {
            z = false;
        } else {
            z = true;
        }
        C9323b.C9325b j = h.mo18824h(f87441n, z).mo18826j("named_user", UAirship.m146188Y().mo106227r().mo18037d0());
        Set<String> h0 = UAirship.m146188Y().mo106223n().mo17801h0();
        if (!h0.isEmpty()) {
            j.mo18822f("tags", JsonValue.m34975U(h0));
        }
        return C35495f.m146459g(new ActionValue(j.mo18817a().mo17264q()));
    }
}
