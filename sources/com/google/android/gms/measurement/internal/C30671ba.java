package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C41998i4;
import com.google.android.gms.internal.measurement.C42132pf;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class C30671ba extends C30953y9 {
    public C30671ba(C30822na naVar) {
        super(naVar);
    }

    /* renamed from: i */
    public final C30658aa mo86908i(String str) {
        String str2;
        C42132pf.m170727b();
        C30658aa aaVar = null;
        if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73558s0)) {
            this.f74136a.mo86903d().mo87493v().mo87463a("sgtm feature flag enabled.");
            C30693d6 R = this.f74119b.mo87360W().mo87214R(str);
            if (R == null) {
                return new C30658aa(mo86909j(str));
            }
            if (R.mo86965O()) {
                this.f74136a.mo86903d().mo87493v().mo87463a("sgtm upload enabled in manifest.");
                C41998i4 t = this.f74119b.mo87364a0().mo87588t(R.mo86994i0());
                if (t != null) {
                    String K = t.mo137021K();
                    if (!TextUtils.isEmpty(K)) {
                        String J = t.mo137020J();
                        C30875s3 v = this.f74136a.mo86903d().mo87493v();
                        if (true != TextUtils.isEmpty(J)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        v.mo87465c("sgtm configured with upload_url, server_info", K, str2);
                        if (TextUtils.isEmpty(J)) {
                            this.f74136a.mo86901b();
                            aaVar = new C30658aa(K);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", J);
                            aaVar = new C30658aa(K, hashMap);
                        }
                    }
                }
            }
            if (aaVar != null) {
                return aaVar;
            }
        }
        return new C30658aa(mo86909j(str));
    }

    /* renamed from: j */
    public final String mo86909j(String str) {
        String w = this.f74119b.mo87364a0().mo87591w(str);
        if (TextUtils.isEmpty(w)) {
            return (String) C30742h3.f73557s.mo87094a((Object) null);
        }
        Uri parse = Uri.parse((String) C30742h3.f73557s.mo87094a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(w + "." + authority);
        return buildUpon.build().toString();
    }
}
