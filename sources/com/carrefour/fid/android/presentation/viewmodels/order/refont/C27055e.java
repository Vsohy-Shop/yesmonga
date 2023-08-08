package com.carrefour.fid.android.presentation.viewmodels.order.refont;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.e */
public interface C27055e {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.e$a */
    public static final class C27056a implements C27055e {

        /* renamed from: c */
        public static final int f65778c = OrderType.f70277d;
        @C12579k

        /* renamed from: a */
        public final String f65779a;
        @C12580l

        /* renamed from: b */
        public final OrderType f65780b;

        public C27056a(@C12579k String str, @C12580l OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            this.f65779a = str;
            this.f65780b = orderType;
        }

        /* renamed from: d */
        public static /* synthetic */ C27056a m114374d(C27056a aVar, String str, OrderType orderType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f65779a;
            }
            if ((i & 2) != 0) {
                orderType = aVar.f65780b;
            }
            return aVar.mo78581c(str, orderType);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78579a() {
            return this.f65779a;
        }

        @C12580l
        /* renamed from: b */
        public final OrderType mo78580b() {
            return this.f65780b;
        }

        @C12579k
        /* renamed from: c */
        public final C27056a mo78581c(@C12579k String str, @C12580l OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C27056a(str, orderType);
        }

        @C12579k
        /* renamed from: e */
        public final String mo78582e() {
            return this.f65779a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27056a)) {
                return false;
            }
            C27056a aVar = (C27056a) obj;
            return Intrinsics.areEqual((Object) this.f65779a, (Object) aVar.f65779a) && Intrinsics.areEqual((Object) this.f65780b, (Object) aVar.f65780b);
        }

        @C12580l
        /* renamed from: f */
        public final OrderType mo78584f() {
            return this.f65780b;
        }

        public int hashCode() {
            int hashCode = this.f65779a.hashCode() * 31;
            OrderType orderType = this.f65780b;
            return hashCode + (orderType == null ? 0 : orderType.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f65779a;
            OrderType orderType = this.f65780b;
            return "OnOrderCancelled(orderId=" + str + ", orderType=" + orderType + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.e$b */
    public static final class C27057b implements C27055e {

        /* renamed from: b */
        public static final int f65781b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f65782a;

        public C27057b(@C12580l Throwable th) {
            this.f65782a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27057b m114380c(C27057b bVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f65782a;
            }
            return bVar.mo78588b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo78587a() {
            return this.f65782a;
        }

        @C12579k
        /* renamed from: b */
        public final C27057b mo78588b(@C12580l Throwable th) {
            return new C27057b(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo78589d() {
            return this.f65782a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27057b) && Intrinsics.areEqual((Object) this.f65782a, (Object) ((C27057b) obj).f65782a);
        }

        public int hashCode() {
            Throwable th = this.f65782a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f65782a;
            return "OnOrderCancelledError(throwable=" + th + ")";
        }
    }
}
