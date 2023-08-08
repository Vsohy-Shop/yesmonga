package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.b */
public final class C40367b extends Thread {

    /* renamed from: a */
    public final /* synthetic */ Map f102894a;

    public C40367b(C40365a aVar, Map map) {
        this.f102894a = map;
    }

    public final void run() {
        Map map = this.f102894a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C40369d.m164209a(buildUpon.build().toString());
    }
}
