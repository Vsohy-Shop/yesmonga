package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.eg */
public class C14313eg extends C14439j3 {

    /* renamed from: m */
    public final int f35340m;

    /* renamed from: n */
    public final String f35341n;

    /* renamed from: com.contentsquare.android.sdk.eg$a */
    public static class C14314a extends C14439j3.C14440a<C14313eg> {

        /* renamed from: k */
        public int f35342k;

        /* renamed from: l */
        public String f35343l;

        public C14314a() {
            mo35603i(4);
        }

        /* renamed from: v */
        public C14314a mo35096v(String str) {
            this.f35343l = str;
            return this;
        }

        /* renamed from: w */
        public C14314a mo35097w(int i) {
            this.f35342k = i;
            return this;
        }

        /* renamed from: x */
        public C14313eg mo34709e() {
            return new C14313eg(this);
        }

        /* renamed from: y */
        public int mo35099y() {
            return this.f35342k;
        }

        /* renamed from: z */
        public String mo35100z() {
            return this.f35343l;
        }
    }

    public C14313eg(C14314a aVar) {
        super(aVar);
        this.f35340m = aVar.mo35099y();
        this.f35341n = aVar.mo35100z();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14439j3.f35661l.mo35679i("ScreenView - Screen name: %s - Screen number: %d", this.f35341n, Integer.valueOf(mo35590f()));
    }

    /* renamed from: m */
    public int mo35095m() {
        return this.f35340m;
    }
}
