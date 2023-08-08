package com.carrefour.fid.android.core.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.core.types.a */
public abstract class C36371a<T> {
    @C12579k

    /* renamed from: a */
    public static final C36372a f89974a = new C36372a((DefaultConstructorMarker) null);

    /* renamed from: com.carrefour.fid.android.core.types.a$a */
    public static final class C36372a {
        public /* synthetic */ C36372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <T> C36371a<T> mo108619a(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            return new C36373b(th);
        }

        @C12579k
        /* renamed from: b */
        public final <T> C36371a<T> mo108620b() {
            return new C36374c();
        }

        @C12579k
        /* renamed from: c */
        public final <T> C36371a<T> mo108621c(T t) {
            return new C36375d(t);
        }

        public C36372a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.core.types.a$b */
    public static final class C36373b extends C36371a {
        @C12579k

        /* renamed from: b */
        public final Throwable f89975b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36373b(@C12579k Throwable th) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, "exception");
            this.f89975b = th;
        }

        /* renamed from: h */
        public static /* synthetic */ C36373b m149197h(C36373b bVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f89975b;
            }
            return bVar.mo108624g(th);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36373b) && Intrinsics.areEqual((Object) this.f89975b, (Object) ((C36373b) obj).f89975b);
        }

        @C12579k
        /* renamed from: f */
        public final Throwable mo108623f() {
            return this.f89975b;
        }

        @C12579k
        /* renamed from: g */
        public final C36373b mo108624g(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "exception");
            return new C36373b(th);
        }

        public int hashCode() {
            return this.f89975b.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final Throwable mo108626i() {
            return this.f89975b;
        }

        @C12579k
        public String toString() {
            Throwable th = this.f89975b;
            return "Failure(" + th + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.core.types.a$c */
    public static final class C36374c extends C36371a {
        public C36374c() {
            super((DefaultConstructorMarker) null);
        }

        @C12579k
        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.carrefour.fid.android.core.types.a$d */
    public static final class C36375d<T> extends C36371a<T> {

        /* renamed from: b */
        public final T f89976b;

        public C36375d(T t) {
            super((DefaultConstructorMarker) null);
            this.f89976b = t;
        }

        /* renamed from: h */
        public static /* synthetic */ C36375d m149201h(C36375d dVar, T t, int i, Object obj) {
            if ((i & 1) != 0) {
                t = dVar.f89976b;
            }
            return dVar.mo108631g(t);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36375d) && Intrinsics.areEqual((Object) this.f89976b, (Object) ((C36375d) obj).f89976b);
        }

        /* renamed from: f */
        public final T mo108630f() {
            return this.f89976b;
        }

        @C12579k
        /* renamed from: g */
        public final C36375d<T> mo108631g(T t) {
            return new C36375d<>(t);
        }

        public int hashCode() {
            T t = this.f89976b;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* renamed from: i */
        public final T mo108633i() {
            return this.f89976b;
        }

        @C12579k
        public String toString() {
            T t = this.f89976b;
            return "Success(" + t + ")";
        }
    }

    public /* synthetic */ C36371a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12580l
    /* renamed from: a */
    public final Throwable mo108614a() {
        if (this instanceof C36373b) {
            return ((C36373b) this).mo108626i();
        }
        if ((this instanceof C36375d) || (this instanceof C36374c)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12580l
    /* renamed from: b */
    public final T mo108615b() {
        if ((this instanceof C36373b) || (this instanceof C36374c)) {
            return null;
        }
        if (this instanceof C36375d) {
            return ((C36375d) this).mo108633i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public final boolean mo108616c() {
        return this instanceof C36373b;
    }

    /* renamed from: d */
    public final boolean mo108617d() {
        return this instanceof C36374c;
    }

    /* renamed from: e */
    public final boolean mo108618e() {
        return this instanceof C36375d;
    }

    public C36371a() {
    }
}
