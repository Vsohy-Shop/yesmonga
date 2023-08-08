package com.google.mlkit.vision.text.bundled.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.mlkit.vision.text.bundled.common.c */
public abstract class C34056c {

    @C40473a
    /* renamed from: com.google.mlkit.vision.text.bundled.common.c$a */
    public static abstract class C34057a {
        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        public abstract C34056c mo99018a();

        @C40473a
        /* renamed from: b */
        public abstract C34057a mo99019b(String str);

        @RecentlyNonNull
        @C40473a
        /* renamed from: c */
        public abstract C34057a mo99020c(boolean z);

        @RecentlyNonNull
        @C40473a
        /* renamed from: d */
        public abstract C34057a mo99021d(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static C34057a m136969a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        C34060f fVar = new C34060f();
        fVar.mo99019b(str);
        fVar.mo99021d(str2);
        fVar.mo99020c(false);
        return fVar;
    }

    /* renamed from: b */
    public abstract String mo99015b();

    /* renamed from: c */
    public abstract String mo99016c();

    /* renamed from: d */
    public abstract boolean mo99017d();
}
