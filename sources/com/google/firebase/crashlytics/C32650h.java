package com.google.firebase.crashlytics;

import androidx.annotation.C0359n0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.h */
public class C32650h {

    /* renamed from: a */
    public final Map<String, String> f79211a;

    /* renamed from: com.google.firebase.crashlytics.h$a */
    public static class C32651a {

        /* renamed from: a */
        public Map<String, String> f79212a = new HashMap();

        @C0359n0
        /* renamed from: b */
        public C32650h mo94815b() {
            return new C32650h(this);
        }

        @C0359n0
        /* renamed from: c */
        public C32651a mo94816c(@C0359n0 String str, boolean z) {
            this.f79212a.put(str, Boolean.toString(z));
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C32651a mo94817d(@C0359n0 String str, double d) {
            this.f79212a.put(str, Double.toString(d));
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C32651a mo94818e(@C0359n0 String str, float f) {
            this.f79212a.put(str, Float.toString(f));
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C32651a mo94819f(@C0359n0 String str, int i) {
            this.f79212a.put(str, Integer.toString(i));
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C32651a mo94820g(@C0359n0 String str, long j) {
            this.f79212a.put(str, Long.toString(j));
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C32651a mo94821h(@C0359n0 String str, @C0359n0 String str2) {
            this.f79212a.put(str, str2);
            return this;
        }
    }

    public C32650h(@C0359n0 C32651a aVar) {
        this.f79211a = aVar.f79212a;
    }
}
