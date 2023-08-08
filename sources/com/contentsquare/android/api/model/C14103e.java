package com.contentsquare.android.api.model;

import com.contentsquare.android.api.C14092c;
import com.contentsquare.android.sdk.C14453jf;
import java.util.Locale;

/* renamed from: com.contentsquare.android.api.model.e */
public final class C14103e {

    /* renamed from: a */
    public String f34876a;

    /* renamed from: b */
    public int f34877b;

    /* renamed from: c */
    public float f34878c;

    public C14103e(C14104a aVar) {
        this.f34876a = aVar.f34880a;
        this.f34877b = aVar.f34881b;
        this.f34878c = aVar.f34882c;
    }

    /* renamed from: a */
    public static C14104a m60626a(float f, int i) {
        return new C14104a(f, i);
    }

    /* renamed from: b */
    public static C14104a m60627b(float f, String str) {
        return new C14104a(f, str);
    }

    /* renamed from: c */
    public int mo34347c() {
        return this.f34877b;
    }

    /* renamed from: d */
    public String mo34348d() {
        return this.f34876a;
    }

    /* renamed from: e */
    public float mo34349e() {
        return this.f34878c;
    }

    /* renamed from: com.contentsquare.android.api.model.e$a */
    public static class C14104a {

        /* renamed from: d */
        public static C14453jf f34879d = new C14453jf("TransactionBuilder");

        /* renamed from: a */
        public String f34880a;

        /* renamed from: b */
        public int f34881b;

        /* renamed from: c */
        public float f34882c;

        public C14104a(float f, int i) {
            this.f34882c = f;
            int c = C14092c.m60617c(i);
            this.f34881b = c;
            if (c == -1) {
                f34879d.mo35679i("Invalid currency code: \"%d\". Transaction currency is set to \"unknown(-1)\".", Integer.valueOf(i));
            }
        }

        /* renamed from: d */
        public C14103e mo34350d() {
            return new C14103e(this);
        }

        /* renamed from: e */
        public C14104a mo34351e(String str) {
            this.f34880a = str;
            return this;
        }

        public C14104a(float f, String str) {
            this.f34882c = f;
            int d = C14092c.m60618d(str.toUpperCase(Locale.ROOT));
            this.f34881b = d;
            if (d == -1) {
                f34879d.mo35679i("Invalid currency string: \"%s\". Transaction currency is set to \"unknown(-1)\".", str);
            }
        }
    }
}
