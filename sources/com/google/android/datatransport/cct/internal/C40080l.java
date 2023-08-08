package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.C40070g;
import com.google.auto.value.C32455c;
import com.google.firebase.encoders.annotations.C32995a;
import java.util.List;

@C32455c
/* renamed from: com.google.android.datatransport.cct.internal.l */
public abstract class C40080l {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.cct.internal.l$a */
    public static abstract class C40081a {
        @C0359n0
        /* renamed from: a */
        public abstract C40080l mo132649a();

        @C0359n0
        /* renamed from: b */
        public abstract C40081a mo132650b(@C0363p0 ClientInfo clientInfo);

        @C0359n0
        /* renamed from: c */
        public abstract C40081a mo132651c(@C0363p0 List<C40078k> list);

        @C0359n0
        /* renamed from: d */
        public abstract C40081a mo132652d(@C0363p0 Integer num);

        @C0359n0
        /* renamed from: e */
        public abstract C40081a mo132653e(@C0363p0 String str);

        @C0359n0
        /* renamed from: f */
        public abstract C40081a mo132654f(@C0363p0 QosTier qosTier);

        @C0359n0
        /* renamed from: g */
        public abstract C40081a mo132655g(long j);

        @C0359n0
        /* renamed from: h */
        public abstract C40081a mo132656h(long j);

        @C0359n0
        /* renamed from: i */
        public C40081a mo132664i(int i) {
            return mo132652d(Integer.valueOf(i));
        }

        @C0359n0
        /* renamed from: j */
        public C40081a mo132665j(@C0359n0 String str) {
            return mo132653e(str);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C40081a m163218a() {
        return new C40070g.C40072b();
    }

    @C0363p0
    /* renamed from: b */
    public abstract ClientInfo mo132639b();

    @C0363p0
    @C32995a.C32996a(name = "logEvent")
    /* renamed from: c */
    public abstract List<C40078k> mo132640c();

    @C0363p0
    /* renamed from: d */
    public abstract Integer mo132641d();

    @C0363p0
    /* renamed from: e */
    public abstract String mo132642e();

    @C0363p0
    /* renamed from: f */
    public abstract QosTier mo132644f();

    /* renamed from: g */
    public abstract long mo132645g();

    /* renamed from: h */
    public abstract long mo132646h();
}
