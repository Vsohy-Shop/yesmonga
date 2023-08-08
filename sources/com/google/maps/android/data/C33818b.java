package com.google.maps.android.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.google.maps.android.data.b */
public class C33818b extends Observable {

    /* renamed from: a */
    public String f81995a;

    /* renamed from: b */
    public final Map<String, String> f81996b;

    /* renamed from: c */
    public C33819c f81997c;

    public C33818b(C33819c cVar, String str, Map<String, String> map) {
        this.f81997c = cVar;
        this.f81995a = str;
        if (map == null) {
            this.f81996b = new HashMap();
        } else {
            this.f81996b = map;
        }
    }

    /* renamed from: a */
    public C33819c mo98222a() {
        return this.f81997c;
    }

    /* renamed from: b */
    public String mo98223b() {
        return this.f81995a;
    }

    /* renamed from: c */
    public Iterable mo98224c() {
        return this.f81996b.entrySet();
    }

    /* renamed from: d */
    public String mo98225d(String str) {
        return this.f81996b.get(str);
    }

    /* renamed from: e */
    public Iterable<String> mo98226e() {
        return this.f81996b.keySet();
    }

    /* renamed from: f */
    public boolean mo98227f() {
        return this.f81997c != null;
    }

    /* renamed from: g */
    public boolean mo98228g() {
        return this.f81996b.size() > 0;
    }

    /* renamed from: h */
    public boolean mo98229h(String str) {
        return this.f81996b.containsKey(str);
    }

    /* renamed from: i */
    public String mo98230i(String str) {
        return this.f81996b.remove(str);
    }

    /* renamed from: j */
    public void mo98231j(C33819c cVar) {
        this.f81997c = cVar;
    }

    /* renamed from: k */
    public String mo98232k(String str, String str2) {
        return this.f81996b.put(str, str2);
    }
}
