package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.google.android.gms.internal.gtm.jf */
public final class C41357jf {

    /* renamed from: a */
    public final String f104709a = "https://www.google-analytics.com";

    /* renamed from: b */
    public static final String m167786b(String str) {
        String str2;
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Cannot encode the string: ".concat(valueOf);
            } else {
                str2 = new String("Cannot encode the string: ");
            }
            C41493p6.m168149a(str2);
            return "";
        }
    }

    /* renamed from: a */
    public final String mo135513a(C41525qe qeVar) {
        String str;
        String str2;
        String str3 = this.f104709a;
        if (qeVar.mo135779g()) {
            str = qeVar.mo135773a();
        } else {
            if (!qeVar.mo135777e().trim().equals("")) {
                str2 = qeVar.mo135777e().trim();
            } else {
                str2 = "-1";
            }
            StringBuilder sb = new StringBuilder();
            if (qeVar.mo135778f() != null) {
                sb.append(qeVar.mo135778f());
            } else {
                sb.append("id");
            }
            sb.append("=");
            sb.append(m167786b(qeVar.mo135774b()));
            sb.append("&pv=");
            sb.append(m167786b(str2));
            sb.append("&rv=5.0");
            if (qeVar.mo135779g()) {
                sb.append("&gtm_debug=x");
            }
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(str3.length() + 13 + String.valueOf(str).length());
        sb2.append(str3);
        sb2.append("/gtm/android?");
        sb2.append(str);
        return sb2.toString();
    }
}
