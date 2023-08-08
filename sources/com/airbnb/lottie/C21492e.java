package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17821p0;
import com.airbnb.lottie.network.C21594b;
import com.airbnb.lottie.network.C21596d;
import com.airbnb.lottie.network.C21597e;
import com.airbnb.lottie.network.C21598f;
import com.airbnb.lottie.network.C21599g;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.e */
public class C21492e {

    /* renamed from: a */
    public static boolean f55431a = false;

    /* renamed from: b */
    public static final String f55432b = "LOTTIE";

    /* renamed from: c */
    public static final int f55433c = 20;

    /* renamed from: d */
    public static boolean f55434d = false;

    /* renamed from: e */
    public static String[] f55435e;

    /* renamed from: f */
    public static long[] f55436f;

    /* renamed from: g */
    public static int f55437g;

    /* renamed from: h */
    public static int f55438h;

    /* renamed from: i */
    public static C21597e f55439i;

    /* renamed from: j */
    public static C21596d f55440j;

    /* renamed from: k */
    public static volatile C21599g f55441k;

    /* renamed from: l */
    public static volatile C21598f f55442l;

    /* renamed from: com.airbnb.lottie.e$a */
    public class C21493a implements C21596d {

        /* renamed from: a */
        public final /* synthetic */ Context f55443a;

        public C21493a(Context context) {
            this.f55443a = context;
        }

        @C0359n0
        /* renamed from: a */
        public File mo64117a() {
            return new File(this.f55443a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m99017a(String str) {
        if (f55434d) {
            int i = f55437g;
            if (i == 20) {
                f55438h++;
                return;
            }
            f55435e[i] = str;
            f55436f[i] = System.nanoTime();
            C17821p0.m81248b(str);
            f55437g++;
        }
    }

    /* renamed from: b */
    public static float m99018b(String str) {
        int i = f55438h;
        if (i > 0) {
            f55438h = i - 1;
            return 0.0f;
        } else if (!f55434d) {
            return 0.0f;
        } else {
            int i2 = f55437g - 1;
            f55437g = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f55435e[i2])) {
                C17821p0.m81250d();
                return ((float) (System.nanoTime() - f55436f[f55437g])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f55435e[f55437g] + ".");
            }
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C21598f m99019c(@C0359n0 Context context) {
        Context applicationContext = context.getApplicationContext();
        C21598f fVar = f55442l;
        if (fVar == null) {
            synchronized (C21598f.class) {
                fVar = f55442l;
                if (fVar == null) {
                    C21596d dVar = f55440j;
                    if (dVar == null) {
                        dVar = new C21493a(applicationContext);
                    }
                    fVar = new C21598f(dVar);
                    f55442l = fVar;
                }
            }
        }
        return fVar;
    }

    @C0359n0
    /* renamed from: d */
    public static C21599g m99020d(@C0359n0 Context context) {
        C21599g gVar = f55441k;
        if (gVar == null) {
            synchronized (C21599g.class) {
                gVar = f55441k;
                if (gVar == null) {
                    C21598f c = m99019c(context);
                    C21597e eVar = f55439i;
                    if (eVar == null) {
                        eVar = new C21594b();
                    }
                    gVar = new C21599g(c, eVar);
                    f55441k = gVar;
                }
            }
        }
        return gVar;
    }

    /* renamed from: e */
    public static void m99021e(C21596d dVar) {
        f55440j = dVar;
    }

    /* renamed from: f */
    public static void m99022f(C21597e eVar) {
        f55439i = eVar;
    }

    /* renamed from: g */
    public static void m99023g(boolean z) {
        if (f55434d != z) {
            f55434d = z;
            if (z) {
                f55435e = new String[20];
                f55436f = new long[20];
            }
        }
    }
}
