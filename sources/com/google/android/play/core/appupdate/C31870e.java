package com.google.android.play.core.appupdate;

import android.support.annotation.NonNull;
import com.google.android.play.core.install.model.C32022b;

/* renamed from: com.google.android.play.core.appupdate.e */
public abstract class C31870e {

    /* renamed from: com.google.android.play.core.appupdate.e$a */
    public static abstract class C31871a {
        @NonNull
        /* renamed from: a */
        public abstract C31870e mo92411a();

        @NonNull
        /* renamed from: b */
        public abstract C31871a mo92412b(boolean z);

        @NonNull
        /* renamed from: c */
        public abstract C31871a mo92413c(@C32022b int i);
    }

    @NonNull
    /* renamed from: c */
    public static C31870e m129279c(@C32022b int i) {
        return m129280d(i).mo92411a();
    }

    @NonNull
    /* renamed from: d */
    public static C31871a m129280d(@C32022b int i) {
        C31890w wVar = new C31890w();
        wVar.mo92413c(i);
        wVar.mo92412b(false);
        return wVar;
    }

    /* renamed from: a */
    public abstract boolean mo92409a();

    @C32022b
    /* renamed from: b */
    public abstract int mo92410b();
}
