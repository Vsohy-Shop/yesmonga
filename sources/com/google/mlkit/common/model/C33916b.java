package com.google.mlkit.common.model;

import android.annotation.TargetApi;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.google.android.gms.common.internal.C40808s;

/* renamed from: com.google.mlkit.common.model.b */
public class C33916b {

    /* renamed from: a */
    public final boolean f82304a;

    /* renamed from: b */
    public final boolean f82305b;

    /* renamed from: com.google.mlkit.common.model.b$a */
    public static class C33917a {

        /* renamed from: a */
        public boolean f82306a = false;

        /* renamed from: b */
        public boolean f82307b = false;

        @C0359n0
        /* renamed from: a */
        public C33916b mo98661a() {
            return new C33916b(this.f82306a, this.f82307b, (C33925h) null);
        }

        @TargetApi(24)
        @C0359n0
        @C0376v0(24)
        /* renamed from: b */
        public C33917a mo98662b() {
            this.f82306a = true;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C33917a mo98663c() {
            this.f82307b = true;
            return this;
        }
    }

    public /* synthetic */ C33916b(boolean z, boolean z2, C33925h hVar) {
        this.f82304a = z;
        this.f82305b = z2;
    }

    /* renamed from: a */
    public boolean mo98657a() {
        return this.f82304a;
    }

    /* renamed from: b */
    public boolean mo98658b() {
        return this.f82305b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33916b)) {
            return false;
        }
        C33916b bVar = (C33916b) obj;
        if (this.f82304a == bVar.f82304a && this.f82305b == bVar.f82305b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Boolean.valueOf(this.f82304a), Boolean.valueOf(this.f82305b));
    }
}
