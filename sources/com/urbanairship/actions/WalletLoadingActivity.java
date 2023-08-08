package com.urbanairship.actions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.UAirship;
import com.urbanairship.activity.C35516b;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.util.C9664m0;
import java.util.List;
import java.util.Map;

public class WalletLoadingActivity extends C35516b {

    /* renamed from: T0 */
    public final C19423g0<C35486c> f87501T0 = new C19423g0<>();

    /* renamed from: com.urbanairship.actions.WalletLoadingActivity$a */
    public class C35483a implements C19426h0<C35486c> {
        public C35483a() {
        }

        /* renamed from: b */
        public void mo4590a(C35486c cVar) {
            if (cVar.f87507b != null || cVar.f87506a == null) {
                WalletLoadingActivity.this.finish();
                return;
            }
            WalletLoadingActivity.this.startActivity(new Intent("android.intent.action.VIEW", cVar.f87506a));
        }
    }

    /* renamed from: com.urbanairship.actions.WalletLoadingActivity$b */
    public class C35484b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Uri f87503a;

        /* renamed from: com.urbanairship.actions.WalletLoadingActivity$b$a */
        public class C35485a implements C9119d<String> {
            public C35485a() {
            }

            /* renamed from: b */
            public String mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) {
                if (!C9664m0.m36195b(i) || map == null || map.get("Location") == null) {
                    return null;
                }
                return (String) map.get("Location").get(0);
            }
        }

        public C35484b(Uri uri) {
            this.f87503a = uri;
        }

        public void run() {
            try {
                C36059m.m148406b("Runner starting", new Object[0]);
                C9116c c = new C9113a().mo18134l("GET", this.f87503a).mo18133k(false).mo18128f(UAirship.m146188Y().mo106205G()).mo18125c(new C35485a());
                if (c.mo18144f() != null) {
                    WalletLoadingActivity.this.f87501T0.mo57493o(new C35486c(Uri.parse(c.mo18142d("Location")), (Exception) null));
                    return;
                }
                C36059m.m148421q("No result found for Wallet URL, finishing action.", new Object[0]);
                WalletLoadingActivity.this.f87501T0.mo57493o(new C35486c((Uri) null, (Exception) null));
            } catch (RequestException e) {
                WalletLoadingActivity.this.f87501T0.mo57493o(new C35486c((Uri) null, e));
            }
        }
    }

    /* renamed from: com.urbanairship.actions.WalletLoadingActivity$c */
    public static class C35486c {

        /* renamed from: a */
        public Uri f87506a;

        /* renamed from: b */
        public Exception f87507b;

        public C35486c(Uri uri, Exception exc) {
            this.f87506a = uri;
            this.f87507b = exc;
        }
    }

    /* renamed from: E0 */
    public final void mo106341E0(@C0359n0 Uri uri) {
        C36044d.m148370b().submit(new C35484b(uri));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C36080x.C36091k.ua_activity_wallet_loading);
        Uri data = getIntent().getData();
        if (data == null) {
            C36059m.m148421q("User URI null, unable to process link.", new Object[0]);
            finish();
            return;
        }
        this.f87501T0.mo57491k(this, new C35483a());
        mo106341E0(data);
    }
}
