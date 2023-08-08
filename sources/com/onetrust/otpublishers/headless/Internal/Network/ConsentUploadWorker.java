package com.onetrust.otpublishers.headless.Internal.Network;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;

public class ConsentUploadWorker extends Worker {

    /* renamed from: f */
    public Context f85140f;

    public ConsentUploadWorker(@C0359n0 Context context, @C0359n0 WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f85140f = context;
        OTLogger.m143458m("CPWorker", "Consent logging");
    }

    /* renamed from: y */
    public static void m143486y(@C0359n0 String str, @C0359n0 C35014d dVar) {
        dVar.mo103965b().edit().remove(str).apply();
        OTLogger.m143447b("CPWorker", "payloadKeyId: " + str + ",data present in pref:" + dVar.mo103965b().contains(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e8  */
    @androidx.annotation.C0359n0
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.C21372k.C21373a mo63077w() {
        /*
            r8 = this;
            java.lang.String r0 = "do work"
            java.lang.String r1 = "CPWorker"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r0)
            androidx.work.d r0 = r8.mo63750g()
            java.lang.String r2 = "ott_consent_log_base_url"
            java.lang.String r0 = r0.mo63151A(r2)
            androidx.work.d r2 = r8.mo63750g()
            java.lang.String r3 = "ott_consent_log_end_point"
            java.lang.String r2 = r2.mo63151A(r3)
            androidx.work.d r3 = r8.mo63750g()
            java.lang.String r4 = "ott_payload_id"
            java.lang.String r3 = r3.mo63151A(r4)
            com.onetrust.otpublishers.headless.Internal.Preferences.d r4 = new com.onetrust.otpublishers.headless.Internal.Preferences.d
            android.content.Context r5 = r8.f85140f
            java.lang.String r6 = "OTT_DEFAULT_USER"
            r4.<init>(r5, r6)
            android.content.SharedPreferences r5 = r4.mo103965b()
            java.lang.String r6 = ""
            java.lang.String r5 = r5.getString(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = ",data present in pref with payloadKeyId :"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " data: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143447b(r1, r6)
            boolean r6 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r0)
            if (r6 != 0) goto L_0x0168
            boolean r6 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r2)
            if (r6 == 0) goto L_0x0062
            goto L_0x0168
        L_0x0062:
            com.onetrust.otpublishers.headless.Internal.Network.f r6 = new com.onetrust.otpublishers.headless.Internal.Network.f
            android.content.Context r7 = r8.f85140f
            r6.<init>(r7)
            retrofit2.w r0 = r6.mo103943h(r0, r2, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "consentLoggingStatus = "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r2)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = " empty response"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r0)
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98575d()
            return r0
        L_0x008d:
            int r2 = r0.mo30573b()
            boolean r5 = com.onetrust.otpublishers.headless.Internal.Network.C35002b.m143491a(r2)
            if (r5 == 0) goto L_0x00fe
            m143486y(r3, r4)
            java.lang.Object r0 = r0.mo30572a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r0)
            if (r2 != 0) goto L_0x00cd
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b4 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r0 = "receipt"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00b4 }
            goto L_0x00ce
        L_0x00b4:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "consent receipt json error. error msg = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r1, r0)
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "consentReceiptValue = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r2)
            boolean r1 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r0)
            if (r1 != 0) goto L_0x00f9
            android.content.SharedPreferences r1 = r4.mo103965b()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "OTT_PROFILE_CONSENT_RECEIPT"
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.apply()
        L_0x00f9:
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98576e()
            return r0
        L_0x00fe:
            boolean r5 = com.onetrust.otpublishers.headless.Internal.Network.C35002b.m143493c(r2)
            java.lang.String r6 = " consent log? = "
            if (r5 == 0) goto L_0x0123
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.Object r0 = r0.mo30572a()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r0)
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98575d()
            return r0
        L_0x0123:
            boolean r2 = com.onetrust.otpublishers.headless.Internal.Network.C35002b.m143492b(r2)
            if (r2 == 0) goto L_0x0149
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.Object r0 = r0.mo30572a()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r0)
            m143486y(r3, r4)
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98573a()
            return r0
        L_0x0149:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " consent log call returned unknown error "
            r2.append(r3)
            java.lang.Object r0 = r0.mo30572a()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r1, r0)
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98575d()
            return r0
        L_0x0168:
            androidx.work.k$a r0 = androidx.work.C21372k.C21373a.m98573a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Network.ConsentUploadWorker.mo63077w():androidx.work.k$a");
    }
}
