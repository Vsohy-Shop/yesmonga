package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C42260x7;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.internal.C30732g6;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C33180f;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
public final class C32548c {

    /* renamed from: a */
    public static final zzjb f79005a = zzjb.m171327A("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.C32531a.f78893g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    public static final zzja f79006b = zzja.m171320H("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final zzja f79007c = zzja.m171319A("auto", FirebaseMessaging.f80405r, "am");

    /* renamed from: d */
    public static final zzja f79008d = zzja.m171322y("_r", "_dbg");

    /* renamed from: e */
    public static final zzja f79009e;

    /* renamed from: f */
    public static final zzja f79010f = zzja.m171322y("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: g */
    public static final /* synthetic */ int f79011g = 0;

    static {
        C42260x7 x7Var = new C42260x7();
        x7Var.mo137453a(C30732g6.f73458a);
        x7Var.mo137453a(C30732g6.f73459b);
        f79009e = x7Var.mo137454b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m131554a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r6 = m131557d(r5)
            r1 = 0
            if (r6 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r7 != 0) goto L_0x0015
            return r1
        L_0x0015:
            com.google.android.gms.internal.measurement.zzja r6 = f79008d
            int r2 = r6.size()
            r3 = r1
        L_0x001c:
            if (r3 >= r2) goto L_0x002d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L_0x001c
            return r1
        L_0x002d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L_0x0056
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L_0x004c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L_0x0042
            goto L_0x0060
        L_0x0042:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r3
            goto L_0x0061
        L_0x004c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r0
            goto L_0x0061
        L_0x0056:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            r5 = r1
            goto L_0x0061
        L_0x0060:
            r5 = -1
        L_0x0061:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L_0x0076
            if (r5 == r0) goto L_0x0070
            if (r5 == r3) goto L_0x006a
            return r1
        L_0x006a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L_0x0070:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L_0x0076:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C32548c.m131554a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: b */
    public static boolean m131555b(String str, Bundle bundle) {
        if (f79006b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzja = f79008d;
        int size = zzja.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) zzja.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m131556c(String str) {
        return !f79005a.contains(str);
    }

    /* renamed from: d */
    public static boolean m131557d(String str) {
        return !f79007c.contains(str);
    }

    /* renamed from: e */
    public static boolean m131558e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
            return false;
        } else if (C33180f.C33186f.f80644q.equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
            return false;
        } else if (f79009e.contains(str2)) {
            return false;
        } else {
            zzja zzja = f79010f;
            int size = zzja.size();
            int i = 0;
            while (i < size) {
                boolean matches = str2.matches((String) zzja.get(i));
                i++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
    }
}
