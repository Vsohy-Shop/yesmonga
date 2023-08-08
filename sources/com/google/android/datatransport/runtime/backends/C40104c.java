package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.datatransport.runtime.time.C40309a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
public final class C40104c extends C40110h {

    /* renamed from: b */
    public final Context f102326b;

    /* renamed from: c */
    public final C40309a f102327c;

    /* renamed from: d */
    public final C40309a f102328d;

    /* renamed from: e */
    public final String f102329e;

    public C40104c(Context context, C40309a aVar, C40309a aVar2, String str) {
        if (context != null) {
            this.f102326b = context;
            if (aVar != null) {
                this.f102327c = aVar;
                if (aVar2 != null) {
                    this.f102328d = aVar2;
                    if (str != null) {
                        this.f102329e = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: c */
    public Context mo132708c() {
        return this.f102326b;
    }

    @C0359n0
    /* renamed from: d */
    public String mo132709d() {
        return this.f102329e;
    }

    /* renamed from: e */
    public C40309a mo132710e() {
        return this.f102328d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40110h)) {
            return false;
        }
        C40110h hVar = (C40110h) obj;
        if (!this.f102326b.equals(hVar.mo132708c()) || !this.f102327c.equals(hVar.mo132712f()) || !this.f102328d.equals(hVar.mo132710e()) || !this.f102329e.equals(hVar.mo132709d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C40309a mo132712f() {
        return this.f102327c;
    }

    public int hashCode() {
        return ((((((this.f102326b.hashCode() ^ 1000003) * 1000003) ^ this.f102327c.hashCode()) * 1000003) ^ this.f102328d.hashCode()) * 1000003) ^ this.f102329e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f102326b + ", wallClock=" + this.f102327c + ", monotonicClock=" + this.f102328d + ", backendName=" + this.f102329e + "}";
    }
}
