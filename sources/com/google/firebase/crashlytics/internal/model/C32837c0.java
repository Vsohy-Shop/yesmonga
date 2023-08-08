package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.C32455c;
import com.google.firebase.crashlytics.internal.C32738e;

@C32455c
/* renamed from: com.google.firebase.crashlytics.internal.model.c0 */
public abstract class C32837c0 {

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.c0$a */
    public static abstract class C32838a {
        /* renamed from: b */
        public static C32838a m132727b(String str, String str2, String str3, String str4, int i, C32738e eVar) {
            return new C32911y(str, str2, str3, str4, i, eVar);
        }

        /* renamed from: a */
        public abstract String mo95440a();

        /* renamed from: c */
        public abstract int mo95441c();

        /* renamed from: d */
        public abstract C32738e mo95442d();

        /* renamed from: e */
        public abstract String mo95443e();

        /* renamed from: f */
        public abstract String mo95444f();

        /* renamed from: g */
        public abstract String mo95445g();
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.c0$b */
    public static abstract class C32839b {
        /* renamed from: c */
        public static C32839b m132734c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new C32912z(i, str, i2, j, j2, z, i3, str2, str3);
        }

        /* renamed from: a */
        public abstract int mo95446a();

        /* renamed from: b */
        public abstract int mo95447b();

        /* renamed from: d */
        public abstract long mo95448d();

        /* renamed from: e */
        public abstract boolean mo95449e();

        /* renamed from: f */
        public abstract String mo95450f();

        /* renamed from: g */
        public abstract String mo95451g();

        /* renamed from: h */
        public abstract String mo95452h();

        /* renamed from: i */
        public abstract int mo95453i();

        /* renamed from: j */
        public abstract long mo95454j();
    }

    @C32455c
    /* renamed from: com.google.firebase.crashlytics.internal.model.c0$c */
    public static abstract class C32840c {
        /* renamed from: a */
        public static C32840c m132744a(String str, String str2, boolean z) {
            return new C32829a0(str, str2, z);
        }

        /* renamed from: b */
        public abstract boolean mo95400b();

        /* renamed from: c */
        public abstract String mo95401c();

        /* renamed from: d */
        public abstract String mo95402d();
    }

    /* renamed from: b */
    public static C32837c0 m132723b(C32838a aVar, C32840c cVar, C32839b bVar) {
        return new C32910x(aVar, cVar, bVar);
    }

    /* renamed from: a */
    public abstract C32838a mo95437a();

    /* renamed from: c */
    public abstract C32839b mo95438c();

    /* renamed from: d */
    public abstract C32840c mo95439d();
}
