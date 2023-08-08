package com.google.firebase.heartbeatinfo;

import java.util.List;

/* renamed from: com.google.firebase.heartbeatinfo.a */
public final class C33040a extends C33052l {

    /* renamed from: a */
    public final String f80166a;

    /* renamed from: b */
    public final List<String> f80167b;

    public C33040a(String str, List<String> list) {
        if (str != null) {
            this.f80166a = str;
            if (list != null) {
                this.f80167b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    /* renamed from: b */
    public List<String> mo95735b() {
        return this.f80167b;
    }

    /* renamed from: c */
    public String mo95736c() {
        return this.f80166a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33052l)) {
            return false;
        }
        C33052l lVar = (C33052l) obj;
        if (!this.f80166a.equals(lVar.mo95736c()) || !this.f80167b.equals(lVar.mo95735b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f80166a.hashCode() ^ 1000003) * 1000003) ^ this.f80167b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f80166a + ", usedDates=" + this.f80167b + "}";
    }
}
