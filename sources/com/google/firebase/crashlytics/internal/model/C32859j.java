package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.j */
public final class C32859j extends CrashlyticsReport.C32774f.C32775a.C32777b {

    /* renamed from: a */
    public final String f79779a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.j$b */
    public static final class C32861b extends CrashlyticsReport.C32774f.C32775a.C32777b.C32778a {

        /* renamed from: a */
        public String f79780a;

        /* renamed from: a */
        public CrashlyticsReport.C32774f.C32775a.C32777b mo95234a() {
            String str = "";
            if (this.f79780a == null) {
                str = str + " clsId";
            }
            if (str.isEmpty()) {
                return new C32859j(this.f79780a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32774f.C32775a.C32777b.C32778a mo95235b(String str) {
            if (str != null) {
                this.f79780a = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        public C32861b() {
        }

        public C32861b(CrashlyticsReport.C32774f.C32775a.C32777b bVar) {
            this.f79780a = bVar.mo95232b();
        }
    }

    @C0359n0
    /* renamed from: b */
    public String mo95232b() {
        return this.f79779a;
    }

    /* renamed from: c */
    public CrashlyticsReport.C32774f.C32775a.C32777b.C32778a mo95233c() {
        return new C32861b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C32774f.C32775a.C32777b) {
            return this.f79779a.equals(((CrashlyticsReport.C32774f.C32775a.C32777b) obj).mo95232b());
        }
        return false;
    }

    public int hashCode() {
        return this.f79779a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f79779a + "}";
    }

    public C32859j(String str) {
        this.f79779a = str;
    }
}
