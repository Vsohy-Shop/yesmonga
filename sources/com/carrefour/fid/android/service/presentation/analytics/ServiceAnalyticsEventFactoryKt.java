package com.carrefour.fid.android.service.presentation.analytics;

import com.carrefour.fid.android.analytics.presentation.C13821a;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a0\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo22516d2 = {"CHANNEL_SWITCH_CATEGORY", "", "CHANNEL_SWITCH_TEMPLATE", "channelSwitchEvent", "", "screenName", "action", "label", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceAnalyticsEventFactoryKt {
    @C12579k
    private static final String CHANNEL_SWITCH_CATEGORY = "channel-switch";
    @C12579k
    private static final String CHANNEL_SWITCH_TEMPLATE = "channel-switch";

    @C12579k
    public static final Map<String, String> channelSwitchEvent(@C12579k String str, @C12579k String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "action");
        return C13821a.m58743a(str, "channel-switch", "channel-switch", str2, str3);
    }

    public static /* synthetic */ Map channelSwitchEvent$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return channelSwitchEvent(str, str2, str3);
    }
}
