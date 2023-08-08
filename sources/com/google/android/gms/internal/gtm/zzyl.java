package com.google.android.gms.internal.gtm;

import androidx.compose.runtime.ComposerKt;

public enum zzyl implements C41482oj {
    LOGSID_NONE(0),
    LOGSID_IP_ADDRESS(1),
    LOGSID_IP_ADDRESS_INTERNAL(2),
    LOGSID_USER_AGENT(3),
    LOGSID_SENSITIVE_TIMESTAMP(4),
    LOGSID_SENSITIVE_LOCATION(5),
    LOGSID_APPROXIMATE_LOCATION(15),
    LOGSID_COARSE_LOCATION(6),
    LOGSID_OTHER_LOCATION(9),
    LOGSID_OTHER_VERSION_ID(7),
    LOGSID_REFERER(8),
    LOGSID_THIRD_PARTY_PARAMETERS(16),
    LOGSID_OTHER_PSEUDONYMOUS_ID(10),
    LOGSID_PREF(11),
    LOGSID_ZWIEBACK(12),
    LOGSID_BISCOTTI(13),
    LOGSID_CUSTOM_SESSION_ID(14),
    LOGSID_OTHER_PERSONAL_ID(20),
    LOGSID_GAIA_ID(21),
    LOGSID_EMAIL(22),
    LOGSID_USERNAME(23),
    LOGSID_PHONE_NUMBER(24),
    LOGSID_GAIA_ID_PUBLIC(ComposerKt.f22652v),
    LOGSID_OTHER_AUTHENTICATED_ID(30),
    LOGSID_OTHER_UNAUTHENTICATED_ID(31),
    LOGSID_PARTNER_OR_CUSTOMER_ID(32),
    LOGSID_PUBLISHER_ID(35),
    LOGSID_DASHER_ID(33),
    LOGSID_FOCUS_GROUP_ID(34),
    LOGSID_OTHER_MOBILE_DEVICE_ID(50),
    LOGSID_GSERVICES_ANDROID_ID(51),
    LOGSID_HARDWARE_ID(52),
    LOGSID_MSISDN_ID(53),
    LOGSID_BUILD_SERIAL_ID(54),
    LOGSID_UDID_ID(55),
    LOGSID_ANDROID_LOGGING_ID(56),
    LOGSID_SECURE_SETTINGS_ANDROID_ID(57),
    LOGSID_OTHER_IDENTIFYING_USER_INFO(100),
    LOGSID_USER_INPUT(200),
    LOGSID_DEMOGRAPHIC_INFO(ComposerKt.f22642l),
    LOGSID_GENERIC_KEY(ComposerKt.f22644n),
    LOGSID_GENERIC_VALUE(203),
    LOGSID_COOKIE(204),
    LOGSID_URL(205),
    LOGSID_HTTPHEADER(ComposerKt.f22650t);
    

    /* renamed from: i1 */
    public static final C41506pj<zzyl> f105881i1 = null;
    private final int zzV;

    /* access modifiers changed from: public */
    static {
        f105881i1 = new C41581sm();
    }

    /* access modifiers changed from: public */
    zzyl(int i) {
        this.zzV = i;
    }

    /* renamed from: g */
    public static C41506pj<zzyl> m169015g() {
        return f105881i1;
    }

    /* renamed from: q */
    public static zzyl m169016q(int i) {
        if (i == 100) {
            return LOGSID_OTHER_IDENTIFYING_USER_INFO;
        }
        switch (i) {
            case 0:
                return LOGSID_NONE;
            case 1:
                return LOGSID_IP_ADDRESS;
            case 2:
                return LOGSID_IP_ADDRESS_INTERNAL;
            case 3:
                return LOGSID_USER_AGENT;
            case 4:
                return LOGSID_SENSITIVE_TIMESTAMP;
            case 5:
                return LOGSID_SENSITIVE_LOCATION;
            case 6:
                return LOGSID_COARSE_LOCATION;
            case 7:
                return LOGSID_OTHER_VERSION_ID;
            case 8:
                return LOGSID_REFERER;
            case 9:
                return LOGSID_OTHER_LOCATION;
            case 10:
                return LOGSID_OTHER_PSEUDONYMOUS_ID;
            case 11:
                return LOGSID_PREF;
            case 12:
                return LOGSID_ZWIEBACK;
            case 13:
                return LOGSID_BISCOTTI;
            case 14:
                return LOGSID_CUSTOM_SESSION_ID;
            case 15:
                return LOGSID_APPROXIMATE_LOCATION;
            case 16:
                return LOGSID_THIRD_PARTY_PARAMETERS;
            default:
                switch (i) {
                    case 20:
                        return LOGSID_OTHER_PERSONAL_ID;
                    case 21:
                        return LOGSID_GAIA_ID;
                    case 22:
                        return LOGSID_EMAIL;
                    case 23:
                        return LOGSID_USERNAME;
                    case 24:
                        return LOGSID_PHONE_NUMBER;
                    default:
                        switch (i) {
                            case 30:
                                return LOGSID_OTHER_AUTHENTICATED_ID;
                            case 31:
                                return LOGSID_OTHER_UNAUTHENTICATED_ID;
                            case 32:
                                return LOGSID_PARTNER_OR_CUSTOMER_ID;
                            case 33:
                                return LOGSID_DASHER_ID;
                            case 34:
                                return LOGSID_FOCUS_GROUP_ID;
                            case 35:
                                return LOGSID_PUBLISHER_ID;
                            default:
                                switch (i) {
                                    case 50:
                                        return LOGSID_OTHER_MOBILE_DEVICE_ID;
                                    case 51:
                                        return LOGSID_GSERVICES_ANDROID_ID;
                                    case 52:
                                        return LOGSID_HARDWARE_ID;
                                    case 53:
                                        return LOGSID_MSISDN_ID;
                                    case 54:
                                        return LOGSID_BUILD_SERIAL_ID;
                                    case 55:
                                        return LOGSID_UDID_ID;
                                    case 56:
                                        return LOGSID_ANDROID_LOGGING_ID;
                                    case 57:
                                        return LOGSID_SECURE_SETTINGS_ANDROID_ID;
                                    default:
                                        switch (i) {
                                            case 200:
                                                return LOGSID_USER_INPUT;
                                            case ComposerKt.f22642l:
                                                return LOGSID_DEMOGRAPHIC_INFO;
                                            case ComposerKt.f22644n:
                                                return LOGSID_GENERIC_KEY;
                                            case 203:
                                                return LOGSID_GENERIC_VALUE;
                                            case 204:
                                                return LOGSID_COOKIE;
                                            case 205:
                                                return LOGSID_URL;
                                            case ComposerKt.f22650t:
                                                return LOGSID_HTTPHEADER;
                                            case ComposerKt.f22652v:
                                                return LOGSID_GAIA_ID_PUBLIC;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public final String toString() {
        return Integer.toString(this.zzV);
    }

    public final int zza() {
        return this.zzV;
    }
}
