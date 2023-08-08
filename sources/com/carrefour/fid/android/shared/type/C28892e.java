package com.carrefour.fid.android.shared.type;

import androidx.compose.runtime.internal.C8567o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.type.e */
public abstract class C28892e<T> {

    /* renamed from: a */
    public static final int f70778a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.type.e$a */
    public static final class C28893a extends C28892e {

        /* renamed from: c */
        public static final int f70779c = 8;
        @C12580l

        /* renamed from: b */
        public final Throwable f70780b;

        public C28893a(@C12580l Throwable th) {
            super((DefaultConstructorMarker) null);
            this.f70780b = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C28893a m119469c(C28893a aVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = aVar.f70780b;
            }
            return aVar.mo84082b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo84081a() {
            return this.f70780b;
        }

        @C12579k
        /* renamed from: b */
        public final C28893a mo84082b(@C12580l Throwable th) {
            return new C28893a(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo84083d() {
            return this.f70780b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28893a) && Intrinsics.areEqual((Object) this.f70780b, (Object) ((C28893a) obj).f70780b);
        }

        public int hashCode() {
            Throwable th = this.f70780b;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f70780b;
            return "Error(exception=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.type.e$b */
    public static final class C28894b extends C28892e {
        @C12579k

        /* renamed from: b */
        public static final C28894b f70781b = new C28894b();

        /* renamed from: c */
        public static final int f70782c = 0;

        public C28894b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 1)
    /* renamed from: com.carrefour.fid.android.shared.type.e$c */
    public static final class C28895c<T> extends C28892e<T> {

        /* renamed from: c */
        public static final int f70783c = 0;

        /* renamed from: b */
        public final T f70784b;

        public C28895c(T t) {
            super((DefaultConstructorMarker) null);
            this.f70784b = t;
        }

        /* renamed from: c */
        public static /* synthetic */ C28895c m119473c(C28895c cVar, T t, int i, Object obj) {
            if ((i & 1) != 0) {
                t = cVar.f70784b;
            }
            return cVar.mo84087b(t);
        }

        /* renamed from: a */
        public final T mo84086a() {
            return this.f70784b;
        }

        @C12579k
        /* renamed from: b */
        public final C28895c<T> mo84087b(T t) {
            return new C28895c<>(t);
        }

        /* renamed from: d */
        public final T mo84088d() {
            return this.f70784b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28895c) && Intrinsics.areEqual((Object) this.f70784b, (Object) ((C28895c) obj).f70784b);
        }

        public int hashCode() {
            T t = this.f70784b;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @C12579k
        public String toString() {
            T t = this.f70784b;
            return "Success(data=" + t + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.type.e$d */
    public static final class C28896d extends C28892e {
        @C12579k

        /* renamed from: b */
        public static final C28896d f70785b = new C28896d();

        /* renamed from: c */
        public static final int f70786c = 0;

        public C28896d() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C28892e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    public String toString() {
        if (this instanceof C28895c) {
            Object d = ((C28895c) this).mo84088d();
            return "Success[data=" + d + "]";
        } else if (this instanceof C28893a) {
            Throwable d2 = ((C28893a) this).mo84083d();
            return "Error[exception=" + d2 + "]";
        } else if (Intrinsics.areEqual((Object) this, (Object) C28894b.f70781b)) {
            return "Loading";
        } else {
            if (Intrinsics.areEqual((Object) this, (Object) C28896d.f70785b)) {
                return "Uninitialized";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C28892e() {
    }
}
