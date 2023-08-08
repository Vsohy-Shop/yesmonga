package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.annotations.C32558a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.a */
public interface C32537a {

    @C40473a
    /* renamed from: com.google.firebase.analytics.connector.a$a */
    public interface C32538a {
        @C40473a
        /* renamed from: a */
        void mo94653a();

        @C40473a
        /* renamed from: b */
        void mo94654b();

        @C40473a
        /* renamed from: c */
        void mo94655c(@C0359n0 Set<String> set);
    }

    @C40473a
    /* renamed from: com.google.firebase.analytics.connector.a$b */
    public interface C32539b {
        @C40473a
        /* renamed from: a */
        void mo94656a(int i, @C0363p0 Bundle bundle);
    }

    @C40473a
    /* renamed from: com.google.firebase.analytics.connector.a$c */
    public static class C32540c {
        @C40473a
        @C0359n0

        /* renamed from: a */
        public String f78982a;
        @C40473a
        @C0359n0

        /* renamed from: b */
        public String f78983b;
        @C0363p0
        @C40473a

        /* renamed from: c */
        public Object f78984c;
        @C0363p0
        @C40473a

        /* renamed from: d */
        public String f78985d;
        @C40473a

        /* renamed from: e */
        public long f78986e;
        @C0363p0
        @C40473a

        /* renamed from: f */
        public String f78987f;
        @C0363p0
        @C40473a

        /* renamed from: g */
        public Bundle f78988g;
        @C0363p0
        @C40473a

        /* renamed from: h */
        public String f78989h;
        @C0363p0
        @C40473a

        /* renamed from: i */
        public Bundle f78990i;
        @C40473a

        /* renamed from: j */
        public long f78991j;
        @C0363p0
        @C40473a

        /* renamed from: k */
        public String f78992k;
        @C0363p0
        @C40473a

        /* renamed from: l */
        public Bundle f78993l;
        @C40473a

        /* renamed from: m */
        public long f78994m;
        @C40473a

        /* renamed from: n */
        public boolean f78995n;
        @C40473a

        /* renamed from: o */
        public long f78996o;
    }

    @C40473a
    /* renamed from: a */
    void mo94645a(@C0359n0 C32540c cVar);

    @C40473a
    /* renamed from: b */
    void mo94646b(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Bundle bundle);

    @C40473a
    /* renamed from: c */
    void mo94647c(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Object obj);

    @C40473a
    void clearConditionalUserProperty(@C0359n0 @C0386z0(max = 24, min = 1) String str, @C0363p0 String str2, @C0363p0 Bundle bundle);

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: d */
    Map<String, Object> mo94649d(boolean z);

    @C0348i1
    @C40473a
    /* renamed from: e */
    int mo94650e(@C0359n0 @C0386z0(min = 1) String str);

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: f */
    List<C32540c> mo94651f(@C0359n0 String str, @C0363p0 @C0386z0(max = 23, min = 1) String str2);

    @C0363p0
    @C40473a
    @C32558a
    /* renamed from: g */
    C32538a mo94652g(@C0359n0 String str, @C0359n0 C32539b bVar);
}
