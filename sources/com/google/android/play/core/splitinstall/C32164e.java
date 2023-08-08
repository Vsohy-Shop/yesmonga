package com.google.android.play.core.splitinstall;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.splitinstall.e */
public class C32164e {

    /* renamed from: a */
    public final List<String> f78403a;

    /* renamed from: b */
    public final List<Locale> f78404b;

    /* renamed from: com.google.android.play.core.splitinstall.e$a */
    public static class C32165a {

        /* renamed from: a */
        public final List<String> f78405a = new ArrayList();

        /* renamed from: b */
        public final List<Locale> f78406b = new ArrayList();

        public C32165a() {
        }

        @NonNull
        /* renamed from: b */
        public C32165a mo92949b(@Nullable Locale locale) {
            this.f78406b.add(locale);
            return this;
        }

        /* renamed from: c */
        public C32165a mo92950c(String str) {
            this.f78405a.add(str);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C32164e mo92951e() {
            return new C32164e(this);
        }

        public /* synthetic */ C32165a(byte[] bArr) {
        }
    }

    public /* synthetic */ C32164e(C32165a aVar) {
        this.f78403a = new ArrayList(aVar.f78405a);
        this.f78404b = new ArrayList(aVar.f78406b);
    }

    @NonNull
    /* renamed from: c */
    public static C32165a m130163c() {
        return new C32165a((byte[]) null);
    }

    /* renamed from: a */
    public List<Locale> mo92946a() {
        return this.f78404b;
    }

    /* renamed from: b */
    public List<String> mo92947b() {
        return this.f78403a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f78403a, this.f78404b});
    }
}
