package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;

/* renamed from: com.google.firebase.platforminfo.a */
public final class C33500a extends C33505f {

    /* renamed from: a */
    public final String f81502a;

    /* renamed from: b */
    public final String f81503b;

    public C33500a(String str, String str2) {
        if (str != null) {
            this.f81502a = str;
            if (str2 != null) {
                this.f81503b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    /* renamed from: b */
    public String mo97255b() {
        return this.f81502a;
    }

    @Nonnull
    /* renamed from: c */
    public String mo97256c() {
        return this.f81503b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33505f)) {
            return false;
        }
        C33505f fVar = (C33505f) obj;
        if (!this.f81502a.equals(fVar.mo97255b()) || !this.f81503b.equals(fVar.mo97256c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f81502a.hashCode() ^ 1000003) * 1000003) ^ this.f81503b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f81502a + ", version=" + this.f81503b + "}";
    }
}
