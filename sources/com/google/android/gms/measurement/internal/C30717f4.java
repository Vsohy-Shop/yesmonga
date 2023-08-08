package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
public final class C30717f4 {

    /* renamed from: a */
    public final String f73379a = "default_event_parameters";

    /* renamed from: b */
    public final Bundle f73380b = new Bundle();

    /* renamed from: c */
    public Bundle f73381c;

    /* renamed from: d */
    public final /* synthetic */ C30780k4 f73382d;

    public C30717f4(C30780k4 k4Var, String str, Bundle bundle) {
        this.f73382d = k4Var;
        C40843u.m166198h("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f73382d.f74136a.mo86903d().mo87489r().mo87463a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    @androidx.annotation.C0348i1
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo87056a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f73381c
            if (r0 == 0) goto L_0x0006
            goto L_0x00d4
        L_0x0006:
            com.google.android.gms.measurement.internal.k4 r0 = r11.f73382d
            android.content.SharedPreferences r0 = r0.mo87191o()
            java.lang.String r1 = r11.f73379a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00cc
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
            r3 = r0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r3 >= r4) goto L_0x00b8
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r9
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r10
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x009b
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x0083
            com.google.android.gms.measurement.internal.k4 r4 = r11.f73382d     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo87464b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.google.android.gms.measurement.internal.k4 r4 = r11.f73382d     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo87463a(r5)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b8:
            r11.f73381c = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            com.google.android.gms.measurement.internal.k4 r0 = r11.f73382d
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo87463a(r1)
        L_0x00cc:
            android.os.Bundle r0 = r11.f73381c
            if (r0 != 0) goto L_0x00d4
            android.os.Bundle r0 = r11.f73380b
            r11.f73381c = r0
        L_0x00d4:
            android.os.Bundle r0 = r11.f73381c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30717f4.mo87056a():android.os.Bundle");
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87057b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f73382d.mo87191o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f73379a);
        } else {
            String str = this.f73379a;
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        jSONObject.put(C9851c.f26937h, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(C10108c.f27801d, C34935s.f84988a);
                        } else if (obj instanceof Long) {
                            jSONObject.put(C10108c.f27801d, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(C10108c.f27801d, "d");
                        } else {
                            this.f73382d.f74136a.mo86903d().mo87489r().mo87464b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f73382d.f74136a.mo86903d().mo87489r().mo87464b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f73381c = bundle;
    }
}
