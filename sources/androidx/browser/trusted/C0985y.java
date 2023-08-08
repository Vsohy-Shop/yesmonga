package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.C0359n0;

/* renamed from: androidx.browser.trusted.y */
public interface C0985y {

    /* renamed from: a */
    public static final String f3059a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* renamed from: androidx.browser.trusted.y$a */
    public static class C0986a implements C0985y {

        /* renamed from: b */
        public static final int f3060b = 0;

        @C0359n0
        /* renamed from: a */
        public Bundle mo4077a() {
            Bundle bundle = new Bundle();
            bundle.putInt(C0985y.f3059a, 0);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.y$b */
    public static class C0987b implements C0985y {

        /* renamed from: d */
        public static final int f3061d = 1;

        /* renamed from: e */
        public static final String f3062e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* renamed from: f */
        public static final String f3063f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* renamed from: b */
        public final boolean f3064b;

        /* renamed from: c */
        public final int f3065c;

        public C0987b(boolean z, int i) {
            this.f3064b = z;
            this.f3065c = i;
        }

        @C0359n0
        /* renamed from: b */
        public static C0985y m4354b(@C0359n0 Bundle bundle) {
            return new C0987b(bundle.getBoolean(f3062e), bundle.getInt(f3063f));
        }

        @C0359n0
        /* renamed from: a */
        public Bundle mo4077a() {
            Bundle bundle = new Bundle();
            bundle.putInt(C0985y.f3059a, 1);
            bundle.putBoolean(f3062e, this.f3064b);
            bundle.putInt(f3063f, this.f3065c);
            return bundle;
        }

        /* renamed from: c */
        public boolean mo4078c() {
            return this.f3064b;
        }

        /* renamed from: d */
        public int mo4079d() {
            return this.f3065c;
        }
    }

    @C0359n0
    /* renamed from: b */
    static C0985y m4351b(@C0359n0 Bundle bundle) {
        if (bundle.getInt(f3059a) != 1) {
            return new C0986a();
        }
        return C0987b.m4354b(bundle);
    }

    @C0359n0
    /* renamed from: a */
    Bundle mo4077a();
}
