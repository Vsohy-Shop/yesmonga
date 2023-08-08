package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.C40247a;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
public abstract class C40257e {

    /* renamed from: a */
    public static final long f102593a = 10485760;

    /* renamed from: b */
    public static final int f102594b = 200;

    /* renamed from: c */
    public static final int f102595c = 10000;

    /* renamed from: d */
    public static final long f102596d = 604800000;

    /* renamed from: e */
    public static final int f102597e = 81920;

    /* renamed from: f */
    public static final C40257e f102598f = m163653a().mo132915f(10485760).mo132913d(200).mo132911b(10000).mo132912c(604800000).mo132914e(f102597e).mo132910a();

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e$a */
    public static abstract class C40258a {
        /* renamed from: a */
        public abstract C40257e mo132910a();

        /* renamed from: b */
        public abstract C40258a mo132911b(int i);

        /* renamed from: c */
        public abstract C40258a mo132912c(long j);

        /* renamed from: d */
        public abstract C40258a mo132913d(int i);

        /* renamed from: e */
        public abstract C40258a mo132914e(int i);

        /* renamed from: f */
        public abstract C40258a mo132915f(long j);
    }

    /* renamed from: a */
    public static C40258a m163653a() {
        return new C40247a.C40249b();
    }

    /* renamed from: b */
    public abstract int mo132902b();

    /* renamed from: c */
    public abstract long mo132903c();

    /* renamed from: d */
    public abstract int mo132904d();

    /* renamed from: e */
    public abstract int mo132905e();

    /* renamed from: f */
    public abstract long mo132907f();

    /* renamed from: g */
    public C40258a mo132935g() {
        return m163653a().mo132915f(mo132907f()).mo132913d(mo132904d()).mo132911b(mo132902b()).mo132912c(mo132903c()).mo132914e(mo132905e());
    }
}
