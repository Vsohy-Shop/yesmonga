package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C32837c0;

/* renamed from: com.google.firebase.crashlytics.internal.model.a0 */
public final class C32829a0 extends C32837c0.C32840c {

    /* renamed from: a */
    public final String f79687a;

    /* renamed from: b */
    public final String f79688b;

    /* renamed from: c */
    public final boolean f79689c;

    public C32829a0(String str, String str2, boolean z) {
        if (str != null) {
            this.f79687a = str;
            if (str2 != null) {
                this.f79688b = str2;
                this.f79689c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    /* renamed from: b */
    public boolean mo95400b() {
        return this.f79689c;
    }

    /* renamed from: c */
    public String mo95401c() {
        return this.f79688b;
    }

    /* renamed from: d */
    public String mo95402d() {
        return this.f79687a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32837c0.C32840c)) {
            return false;
        }
        C32837c0.C32840c cVar = (C32837c0.C32840c) obj;
        if (!this.f79687a.equals(cVar.mo95402d()) || !this.f79688b.equals(cVar.mo95401c()) || this.f79689c != cVar.mo95400b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f79687a.hashCode() ^ 1000003) * 1000003) ^ this.f79688b.hashCode()) * 1000003;
        if (this.f79689c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f79687a + ", osCodeName=" + this.f79688b + ", isRooted=" + this.f79689c + "}";
    }
}
