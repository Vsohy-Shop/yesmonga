package com.carrefour.fid.android.shared.type;

import androidx.compose.runtime.internal.C8567o;
import java.lang.Throwable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.type.a */
public interface C28879a<L, R extends Throwable> {

    @C8567o(parameters = 1)
    /* renamed from: com.carrefour.fid.android.shared.type.a$a */
    public static final class C28880a<R extends Throwable> implements C28879a {

        /* renamed from: b */
        public static final int f70754b = 0;
        @C12579k

        /* renamed from: a */
        public final R f70755a;

        public C28880a(@C12579k R r) {
            Intrinsics.checkNotNullParameter(r, "error");
            this.f70755a = r;
        }

        /* renamed from: c */
        public static /* synthetic */ C28880a m119437c(C28880a aVar, R r, int i, Object obj) {
            if ((i & 1) != 0) {
                r = aVar.f70755a;
            }
            return aVar.mo84053b(r);
        }

        @C12579k
        /* renamed from: a */
        public final R mo84052a() {
            return this.f70755a;
        }

        @C12579k
        /* renamed from: b */
        public final C28880a<R> mo84053b(@C12579k R r) {
            Intrinsics.checkNotNullParameter(r, "error");
            return new C28880a<>(r);
        }

        @C12579k
        /* renamed from: d */
        public final R mo84054d() {
            return this.f70755a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28880a) && Intrinsics.areEqual((Object) this.f70755a, (Object) ((C28880a) obj).f70755a);
        }

        public int hashCode() {
            return this.f70755a.hashCode();
        }

        @C12579k
        public String toString() {
            R r = this.f70755a;
            return "Failure(error=" + r + ")";
        }
    }

    @C8567o(parameters = 1)
    /* renamed from: com.carrefour.fid.android.shared.type.a$b */
    public static final class C28881b<L> implements C28879a {

        /* renamed from: b */
        public static final int f70756b = 0;

        /* renamed from: a */
        public final L f70757a;

        public C28881b(L l) {
            this.f70757a = l;
        }

        /* renamed from: c */
        public static /* synthetic */ C28881b m119441c(C28881b bVar, L l, int i, Object obj) {
            if ((i & 1) != 0) {
                l = bVar.f70757a;
            }
            return bVar.mo84059b(l);
        }

        /* renamed from: a */
        public final L mo84058a() {
            return this.f70757a;
        }

        @C12579k
        /* renamed from: b */
        public final C28881b<L> mo84059b(L l) {
            return new C28881b<>(l);
        }

        /* renamed from: d */
        public final L mo84060d() {
            return this.f70757a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28881b) && Intrinsics.areEqual((Object) this.f70757a, (Object) ((C28881b) obj).f70757a);
        }

        public int hashCode() {
            L l = this.f70757a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        @C12579k
        public String toString() {
            L l = this.f70757a;
            return "Success(value=" + l + ")";
        }
    }
}
