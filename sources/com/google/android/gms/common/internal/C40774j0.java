package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1886l;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.p027os.C17785f;
import com.google.android.gms.base.C40426a;
import com.google.android.gms.common.C40717i;
import com.google.android.gms.common.C40924q;
import com.google.android.gms.common.util.C40986l;
import com.google.android.gms.common.wrappers.C41008d;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.j0 */
public final class C40774j0 {
    @GuardedBy("sCache")

    /* renamed from: a */
    public static final C1886l f103891a = new C1886l();
    @C0363p0
    @GuardedBy("sCache")

    /* renamed from: b */
    public static Locale f103892b;

    /* renamed from: a */
    public static String m165924a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C41008d.m166715a(context).mo134782d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m165925b(Context context) {
        return context.getResources().getString(C40426a.C40431e.common_google_play_services_notification_channel_name);
    }

    @C0359n0
    /* renamed from: c */
    public static String m165926c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C40426a.C40431e.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C40426a.C40431e.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C40426a.C40431e.common_google_play_services_enable_button);
    }

    @C0359n0
    /* renamed from: d */
    public static String m165927d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m165924a(context);
        if (i == 1) {
            return resources.getString(C40426a.C40431e.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C40426a.C40431e.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m165931h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m165931h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C40426a.C40431e.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m165931h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m165931h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m165931h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C40426a.C40431e.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C40924q.C40926b.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C40986l.m166651l(context)) {
            return resources.getString(C40426a.C40431e.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C40426a.C40431e.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @C0359n0
    /* renamed from: e */
    public static String m165928e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m165931h(context, "common_google_play_services_resolution_required_text", m165924a(context));
        }
        return m165927d(context, i);
    }

    @C0359n0
    /* renamed from: f */
    public static String m165929f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m165932i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m165930g(context, i);
        }
        if (str == null) {
            return context.getResources().getString(C40426a.C40431e.common_google_play_services_notification_ticker);
        }
        return str;
    }

    @C0363p0
    /* renamed from: g */
    public static String m165930g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C40426a.C40431e.common_google_play_services_install_title);
            case 2:
                return resources.getString(C40426a.C40431e.common_google_play_services_update_title);
            case 3:
                return resources.getString(C40426a.C40431e.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m165932i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m165932i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m165932i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m165932i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
        }
    }

    /* renamed from: h */
    public static String m165931h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m165932i(context, str);
        if (i == null) {
            i = resources.getString(C40924q.C40926b.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    @C0363p0
    /* renamed from: i */
    public static String m165932i(Context context, String str) {
        C1886l lVar = f103891a;
        synchronized (lVar) {
            Locale d = C17785f.m81175a(context.getResources().getConfiguration()).mo52233d(0);
            if (!d.equals(f103892b)) {
                lVar.clear();
                f103892b = d;
            }
            String str2 = (String) lVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources j = C40717i.m165691j(context);
            if (j == null) {
                return null;
            }
            int identifier = j.getIdentifier(str, C16717v.C16719b.f42182e, "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing resource: ");
                sb.append(str);
                return null;
            }
            String string = j.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got empty resource: ");
                sb2.append(str);
                return null;
            }
            lVar.put(str, string);
            return string;
        }
    }
}
