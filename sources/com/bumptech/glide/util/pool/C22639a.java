package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.util.pool.a */
public final class C22639a {

    /* renamed from: a */
    public static final String f58037a = "FactoryPools";

    /* renamed from: b */
    public static final int f58038b = 20;

    /* renamed from: c */
    public static final C22646g<Object> f58039c = new C22640a();

    /* renamed from: com.bumptech.glide.util.pool.a$a */
    public class C22640a implements C22646g<Object> {
        /* renamed from: a */
        public void mo67013a(@C0359n0 Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$b */
    public class C22641b implements C22643d<List<T>> {
        @C0359n0
        /* renamed from: b */
        public List<T> mo66065a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$c */
    public class C22642c implements C22646g<List<T>> {
        /* renamed from: b */
        public void mo67013a(@C0359n0 List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$d */
    public interface C22643d<T> {
        /* renamed from: a */
        T mo66065a();
    }

    /* renamed from: com.bumptech.glide.util.pool.a$e */
    public static final class C22644e<T> implements C17997q.C17998a<T> {

        /* renamed from: a */
        public final C22643d<T> f58040a;

        /* renamed from: b */
        public final C22646g<T> f58041b;

        /* renamed from: c */
        public final C17997q.C17998a<T> f58042c;

        public C22644e(@C0359n0 C17997q.C17998a<T> aVar, @C0359n0 C22643d<T> dVar, @C0359n0 C22646g<T> gVar) {
            this.f58042c = aVar;
            this.f58040a = dVar;
            this.f58041b = gVar;
        }

        /* renamed from: a */
        public boolean mo52468a(@C0359n0 T t) {
            if (t instanceof C22645f) {
                ((C22645f) t).mo65861g().mo67016b(true);
            }
            this.f58041b.mo67013a(t);
            return this.f58042c.mo52468a(t);
        }

        /* renamed from: b */
        public T mo52469b() {
            T b = this.f58042c.mo52469b();
            if (b == null) {
                b = this.f58040a.mo66065a();
                if (Log.isLoggable(C22639a.f58037a, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(b.getClass());
                }
            }
            if (b instanceof C22645f) {
                ((C22645f) b).mo65861g().mo67016b(false);
            }
            return b;
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$f */
    public interface C22645f {
        @C0359n0
        /* renamed from: g */
        C22648c mo65861g();
    }

    /* renamed from: com.bumptech.glide.util.pool.a$g */
    public interface C22646g<T> {
        /* renamed from: a */
        void mo67013a(@C0359n0 T t);
    }

    @C0359n0
    /* renamed from: a */
    public static <T extends C22645f> C17997q.C17998a<T> m102658a(@C0359n0 C17997q.C17998a<T> aVar, @C0359n0 C22643d<T> dVar) {
        return m102659b(aVar, dVar, m102660c());
    }

    @C0359n0
    /* renamed from: b */
    public static <T> C17997q.C17998a<T> m102659b(@C0359n0 C17997q.C17998a<T> aVar, @C0359n0 C22643d<T> dVar, @C0359n0 C22646g<T> gVar) {
        return new C22644e(aVar, dVar, gVar);
    }

    @C0359n0
    /* renamed from: c */
    public static <T> C22646g<T> m102660c() {
        return f58039c;
    }

    @C0359n0
    /* renamed from: d */
    public static <T extends C22645f> C17997q.C17998a<T> m102661d(int i, @C0359n0 C22643d<T> dVar) {
        return m102658a(new C17997q.C17999b(i), dVar);
    }

    @C0359n0
    /* renamed from: e */
    public static <T extends C22645f> C17997q.C17998a<T> m102662e(int i, @C0359n0 C22643d<T> dVar) {
        return m102658a(new C17997q.C18000c(i), dVar);
    }

    @C0359n0
    /* renamed from: f */
    public static <T> C17997q.C17998a<List<T>> m102663f() {
        return m102664g(20);
    }

    @C0359n0
    /* renamed from: g */
    public static <T> C17997q.C17998a<List<T>> m102664g(int i) {
        return m102659b(new C17997q.C18000c(i), new C22641b(), new C22642c());
    }
}
