package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.C32837c0;

/* renamed from: com.google.firebase.crashlytics.internal.model.x */
public final class C32910x extends C32837c0 {

    /* renamed from: a */
    public final C32837c0.C32838a f79894a;

    /* renamed from: b */
    public final C32837c0.C32840c f79895b;

    /* renamed from: c */
    public final C32837c0.C32839b f79896c;

    public C32910x(C32837c0.C32838a aVar, C32837c0.C32840c cVar, C32837c0.C32839b bVar) {
        if (aVar != null) {
            this.f79894a = aVar;
            if (cVar != null) {
                this.f79895b = cVar;
                if (bVar != null) {
                    this.f79896c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public C32837c0.C32838a mo95437a() {
        return this.f79894a;
    }

    /* renamed from: c */
    public C32837c0.C32839b mo95438c() {
        return this.f79896c;
    }

    /* renamed from: d */
    public C32837c0.C32840c mo95439d() {
        return this.f79895b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32837c0)) {
            return false;
        }
        C32837c0 c0Var = (C32837c0) obj;
        if (!this.f79894a.equals(c0Var.mo95437a()) || !this.f79895b.equals(c0Var.mo95439d()) || !this.f79896c.equals(c0Var.mo95438c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f79894a.hashCode() ^ 1000003) * 1000003) ^ this.f79895b.hashCode()) * 1000003) ^ this.f79896c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f79894a + ", osData=" + this.f79895b + ", deviceData=" + this.f79896c + "}";
    }
}
