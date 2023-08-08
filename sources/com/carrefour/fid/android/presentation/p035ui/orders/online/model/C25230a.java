package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.a */
public final class C25230a {
    @C12579k

    /* renamed from: a */
    public static final C25230a f62196a = new C25230a();

    /* renamed from: b */
    public static final int f62197b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.a$a */
    public static final class C25231a implements C25237e {

        /* renamed from: f */
        public static final int f62198f = 8;
        @C12579k

        /* renamed from: a */
        public final String f62199a;
        @C12579k

        /* renamed from: b */
        public final String f62200b;

        /* renamed from: c */
        public final double f62201c;
        @C12580l

        /* renamed from: d */
        public final String f62202d;
        @C12579k

        /* renamed from: e */
        public final List<OrdersOnlineDetailsProductModel> f62203e;

        public C25231a(@C12579k String str, @C12579k String str2, double d, @C12580l String str3, @C12579k List<OrdersOnlineDetailsProductModel> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, "date");
            Intrinsics.checkNotNullParameter(list, "products");
            this.f62199a = str;
            this.f62200b = str2;
            this.f62201c = d;
            this.f62202d = str3;
            this.f62203e = list;
        }

        /* renamed from: h */
        public static /* synthetic */ C25231a m109165h(C25231a aVar, String str, String str2, double d, String str3, List<OrdersOnlineDetailsProductModel> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f62199a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f62200b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                d = aVar.f62201c;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                str3 = aVar.f62202d;
            }
            String str5 = str3;
            if ((i & 16) != 0) {
                list = aVar.f62203e;
            }
            return aVar.mo73506g(str, str4, d2, str5, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73500a() {
            return this.f62199a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo73501b() {
            return this.f62200b;
        }

        /* renamed from: d */
        public final double mo73502d() {
            return this.f62201c;
        }

        @C12580l
        /* renamed from: e */
        public final String mo73503e() {
            return this.f62202d;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25231a)) {
                return false;
            }
            C25231a aVar = (C25231a) obj;
            return Intrinsics.areEqual((Object) this.f62199a, (Object) aVar.f62199a) && Intrinsics.areEqual((Object) this.f62200b, (Object) aVar.f62200b) && Double.compare(this.f62201c, aVar.f62201c) == 0 && Intrinsics.areEqual((Object) this.f62202d, (Object) aVar.f62202d) && Intrinsics.areEqual((Object) this.f62203e, (Object) aVar.f62203e);
        }

        @C12579k
        /* renamed from: f */
        public final List<OrdersOnlineDetailsProductModel> mo73505f() {
            return this.f62203e;
        }

        @C12579k
        /* renamed from: g */
        public final C25231a mo73506g(@C12579k String str, @C12579k String str2, double d, @C12580l String str3, @C12579k List<OrdersOnlineDetailsProductModel> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, "date");
            Intrinsics.checkNotNullParameter(list, "products");
            return new C25231a(str, str2, d, str3, list);
        }

        public int hashCode() {
            int hashCode = ((((this.f62199a.hashCode() * 31) + this.f62200b.hashCode()) * 31) + Double.hashCode(this.f62201c)) * 31;
            String str = this.f62202d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f62203e.hashCode();
        }

        /* renamed from: i */
        public final double mo73508i() {
            return this.f62201c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo73509j() {
            return this.f62200b;
        }

        @C12580l
        /* renamed from: k */
        public final String mo73510k() {
            return this.f62202d;
        }

        @C12579k
        /* renamed from: l */
        public final String mo73511l() {
            return this.f62199a;
        }

        @C12579k
        /* renamed from: m */
        public final List<OrdersOnlineDetailsProductModel> mo73512m() {
            return this.f62203e;
        }

        @C12579k
        public String toString() {
            String str = this.f62199a;
            String str2 = this.f62200b;
            double d = this.f62201c;
            String str3 = this.f62202d;
            List<OrdersOnlineDetailsProductModel> list = this.f62203e;
            return "AdditionalOrderProductModel(orderId=" + str + ", date=" + str2 + ", amount=" + d + ", downloadBillUrl=" + str3 + ", products=" + list + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.a$b */
    public static final class C25232b implements C25237e {

        /* renamed from: c */
        public static final int f62204c = 8;
        @C12579k

        /* renamed from: a */
        public final String f62205a;
        @C12579k

        /* renamed from: b */
        public final List<C25237e> f62206b;

        public C25232b(@C12579k String str, @C12579k List<? extends C25237e> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(list, "products");
            this.f62205a = str;
            this.f62206b = list;
        }

        /* renamed from: e */
        public static /* synthetic */ C25232b m109177e(C25232b bVar, String str, List<C25237e> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f62205a;
            }
            if ((i & 2) != 0) {
                list = bVar.f62206b;
            }
            return bVar.mo73516d(str, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73514a() {
            return this.f62205a;
        }

        @C12579k
        /* renamed from: b */
        public final List<C25237e> mo73515b() {
            return this.f62206b;
        }

        @C12579k
        /* renamed from: d */
        public final C25232b mo73516d(@C12579k String str, @C12579k List<? extends C25237e> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(list, "products");
            return new C25232b(str, list);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25232b)) {
                return false;
            }
            C25232b bVar = (C25232b) obj;
            return Intrinsics.areEqual((Object) this.f62205a, (Object) bVar.f62205a) && Intrinsics.areEqual((Object) this.f62206b, (Object) bVar.f62206b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo73518f() {
            return this.f62205a;
        }

        @C12579k
        /* renamed from: g */
        public final List<C25237e> mo73519g() {
            return this.f62206b;
        }

        public int hashCode() {
            return (this.f62205a.hashCode() * 31) + this.f62206b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62205a;
            List<C25237e> list = this.f62206b;
            return "MissingProductModel(orderId=" + str + ", products=" + list + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.a$c */
    public static final class C25233c implements C25237e {

        /* renamed from: f */
        public static final int f62207f = 8;
        @C12579k

        /* renamed from: a */
        public final String f62208a;
        @C12579k

        /* renamed from: b */
        public final String f62209b;

        /* renamed from: c */
        public final double f62210c;
        @C12580l

        /* renamed from: d */
        public final String f62211d;
        @C12579k

        /* renamed from: e */
        public final List<OrdersOnlineDetailsProductModel> f62212e;

        public C25233c(@C12579k String str, @C12579k String str2, double d, @C12580l String str3, @C12579k List<OrdersOnlineDetailsProductModel> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, "date");
            Intrinsics.checkNotNullParameter(list, "products");
            this.f62208a = str;
            this.f62209b = str2;
            this.f62210c = d;
            this.f62211d = str3;
            this.f62212e = list;
        }

        /* renamed from: h */
        public static /* synthetic */ C25233c m109183h(C25233c cVar, String str, String str2, double d, String str3, List<OrdersOnlineDetailsProductModel> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f62208a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f62209b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                d = cVar.f62210c;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                str3 = cVar.f62211d;
            }
            String str5 = str3;
            if ((i & 16) != 0) {
                list = cVar.f62212e;
            }
            return cVar.mo73528g(str, str4, d2, str5, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73522a() {
            return this.f62208a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo73523b() {
            return this.f62209b;
        }

        /* renamed from: d */
        public final double mo73524d() {
            return this.f62210c;
        }

        @C12580l
        /* renamed from: e */
        public final String mo73525e() {
            return this.f62211d;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25233c)) {
                return false;
            }
            C25233c cVar = (C25233c) obj;
            return Intrinsics.areEqual((Object) this.f62208a, (Object) cVar.f62208a) && Intrinsics.areEqual((Object) this.f62209b, (Object) cVar.f62209b) && Double.compare(this.f62210c, cVar.f62210c) == 0 && Intrinsics.areEqual((Object) this.f62211d, (Object) cVar.f62211d) && Intrinsics.areEqual((Object) this.f62212e, (Object) cVar.f62212e);
        }

        @C12579k
        /* renamed from: f */
        public final List<OrdersOnlineDetailsProductModel> mo73527f() {
            return this.f62212e;
        }

        @C12579k
        /* renamed from: g */
        public final C25233c mo73528g(@C12579k String str, @C12579k String str2, double d, @C12580l String str3, @C12579k List<OrdersOnlineDetailsProductModel> list) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, "date");
            Intrinsics.checkNotNullParameter(list, "products");
            return new C25233c(str, str2, d, str3, list);
        }

        public int hashCode() {
            int hashCode = ((((this.f62208a.hashCode() * 31) + this.f62209b.hashCode()) * 31) + Double.hashCode(this.f62210c)) * 31;
            String str = this.f62211d;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f62212e.hashCode();
        }

        /* renamed from: i */
        public final double mo73530i() {
            return this.f62210c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo73531j() {
            return this.f62209b;
        }

        @C12580l
        /* renamed from: k */
        public final String mo73532k() {
            return this.f62211d;
        }

        @C12579k
        /* renamed from: l */
        public final String mo73533l() {
            return this.f62208a;
        }

        @C12579k
        /* renamed from: m */
        public final List<OrdersOnlineDetailsProductModel> mo73534m() {
            return this.f62212e;
        }

        @C12579k
        public String toString() {
            String str = this.f62208a;
            String str2 = this.f62209b;
            double d = this.f62210c;
            String str3 = this.f62211d;
            List<OrdersOnlineDetailsProductModel> list = this.f62212e;
            return "OriginalOrderProductModel(orderId=" + str + ", date=" + str2 + ", amount=" + d + ", downloadBillUrl=" + str3 + ", products=" + list + ")";
        }
    }
}
