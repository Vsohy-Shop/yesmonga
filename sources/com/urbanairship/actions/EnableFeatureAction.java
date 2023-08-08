package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import com.urbanairship.actions.PromptPermissionAction;
import com.urbanairship.base.C9002b;
import com.urbanairship.json.JsonException;
import com.urbanairship.modules.location.AirshipLocationClient;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.Permission;

public class EnableFeatureAction extends PromptPermissionAction {
    @C0359n0

    /* renamed from: s */
    public static final String f87429s = "enable_feature";
    @C0359n0

    /* renamed from: t */
    public static final String f87430t = "^ef";
    @C0359n0

    /* renamed from: u */
    public static final String f87431u = "user_notifications";
    @C0359n0

    /* renamed from: v */
    public static final String f87432v = "location";
    @C0359n0

    /* renamed from: w */
    public static final String f87433w = "background_location";

    /* renamed from: r */
    public final C9002b<AirshipLocationClient> f87434r;

    public EnableFeatureAction(@C0359n0 C9002b<C9439p> bVar, @C0359n0 C9002b<AirshipLocationClient> bVar2) {
        super(bVar);
        this.f87434r = bVar2;
    }

    /* renamed from: c */
    public void mo106320c(@C0359n0 C35489b bVar) {
        AirshipLocationClient airshipLocationClient;
        super.mo106320c(bVar);
        if (f87433w.equalsIgnoreCase(bVar.mo106349c().mo106309h("")) && (airshipLocationClient = this.f87434r.get()) != null) {
            airshipLocationClient.mo19111e(true);
        }
    }

    /* renamed from: p */
    public PromptPermissionAction.C35479b mo106321p(C35489b bVar) throws JsonException, IllegalArgumentException {
        String F = bVar.mo106349c().mo17264q().mo18753F();
        F.hashCode();
        char c = 65535;
        switch (F.hashCode()) {
            case 845239156:
                if (F.equals(f87431u)) {
                    c = 0;
                    break;
                }
                break;
            case 954101670:
                if (F.equals(f87433w)) {
                    c = 1;
                    break;
                }
                break;
            case 1901043637:
                if (F.equals("location")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new PromptPermissionAction.C35479b(Permission.DISPLAY_NOTIFICATIONS, true, true);
            case 1:
            case 2:
                return new PromptPermissionAction.C35479b(Permission.LOCATION, true, true);
            default:
                return super.mo106321p(bVar);
        }
    }

    public EnableFeatureAction() {
        this(new C35506l(), new C35507m());
    }
}
