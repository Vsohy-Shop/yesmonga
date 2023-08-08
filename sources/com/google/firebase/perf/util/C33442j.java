package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.firebase.perf.util.j */
public class C33442j {

    /* renamed from: a */
    public final URL f81343a;

    public C33442j(URL url) {
        this.f81343a = url;
    }

    /* renamed from: a */
    public URLConnection mo96915a() throws IOException {
        return this.f81343a.openConnection();
    }

    public String toString() {
        return this.f81343a.toString();
    }
}
