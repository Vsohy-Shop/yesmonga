package com.google.android.gms.internal.gtm;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.gtm.d8 */
public final class C41206d8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Uri f104529a;

    /* renamed from: b */
    public final /* synthetic */ C41375k8 f104530b;

    public C41206d8(C41375k8 k8Var, Uri uri) {
        this.f104530b = k8Var;
        this.f104529a = uri;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f104529a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 25);
        sb.append("Preview requested to uri ");
        sb.append(valueOf);
        C41493p6.m168152d(sb.toString());
        synchronized (this.f104530b.f104757i) {
            if (this.f104530b.f104760l == 2) {
                C41493p6.m168152d("Still initializing. Defer preview container loading.");
                this.f104530b.f104761m.add(this);
                return;
            }
            String str = (String) this.f104530b.mo135579p((String[]) null).first;
            if (str == null) {
                C41493p6.m168153e("Preview failed (no container found)");
            } else if (!this.f104530b.f104755g.mo136020f(str, this.f104529a)) {
                String valueOf2 = String.valueOf(this.f104529a);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 73);
                sb2.append("Cannot preview the app with the uri: ");
                sb2.append(valueOf2);
                sb2.append(". Launching current version instead.");
                C41493p6.m168153e(sb2.toString());
            } else if (!this.f104530b.f104762n) {
                String valueOf3 = String.valueOf(this.f104529a);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 84);
                sb3.append("Deferring container loading for preview uri: ");
                sb3.append(valueOf3);
                sb3.append("(Tag Manager has not been initialized).");
                C41493p6.m168152d(sb3.toString());
            } else {
                String valueOf4 = String.valueOf(this.f104529a);
                StringBuilder sb4 = new StringBuilder(valueOf4.length() + 36);
                sb4.append("Starting to load preview container: ");
                sb4.append(valueOf4);
                C41493p6.m168151c(sb4.toString());
                if (!this.f104530b.f104752d.mo135857e()) {
                    C41493p6.m168153e("Failed to reset TagManager service for preview");
                    return;
                }
                this.f104530b.f104762n = false;
                this.f104530b.f104760l = 1;
                this.f104530b.mo135577m((String[]) null);
            }
        }
    }
}
