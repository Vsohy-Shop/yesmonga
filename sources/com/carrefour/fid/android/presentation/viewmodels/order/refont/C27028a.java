package com.carrefour.fid.android.presentation.viewmodels.order.refont;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a */
public interface C27028a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$a */
    public static final class C27029a implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27029a f65728a = new C27029a();

        /* renamed from: b */
        public static final int f65729b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$b */
    public static final class C27030b implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27030b f65730a = new C27030b();

        /* renamed from: b */
        public static final int f65731b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$c */
    public static final class C27031c implements C27028a {

        /* renamed from: c */
        public static final int f65732c = OrderType.f70277d;
        @C12579k

        /* renamed from: a */
        public final String f65733a;
        @C12579k

        /* renamed from: b */
        public final OrderType f65734b;

        public C27031c(@C12579k String str, @C12579k OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f65733a = str;
            this.f65734b = orderType;
        }

        /* renamed from: d */
        public static /* synthetic */ C27031c m114280d(C27031c cVar, String str, OrderType orderType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f65733a;
            }
            if ((i & 2) != 0) {
                orderType = cVar.f65734b;
            }
            return cVar.mo78478c(str, orderType);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78476a() {
            return this.f65733a;
        }

        @C12579k
        /* renamed from: b */
        public final OrderType mo78477b() {
            return this.f65734b;
        }

        @C12579k
        /* renamed from: c */
        public final C27031c mo78478c(@C12579k String str, @C12579k OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C27031c(str, orderType);
        }

        @C12579k
        /* renamed from: e */
        public final String mo78479e() {
            return this.f65733a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27031c)) {
                return false;
            }
            C27031c cVar = (C27031c) obj;
            return Intrinsics.areEqual((Object) this.f65733a, (Object) cVar.f65733a) && Intrinsics.areEqual((Object) this.f65734b, (Object) cVar.f65734b);
        }

        @C12579k
        /* renamed from: f */
        public final OrderType mo78481f() {
            return this.f65734b;
        }

        public int hashCode() {
            return (this.f65733a.hashCode() * 31) + this.f65734b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f65733a;
            OrderType orderType = this.f65734b;
            return "OnConfirmationClickedCancelDialog(orderId=" + str + ", orderType=" + orderType + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$d */
    public static final class C27032d implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27032d f65735a = new C27032d();

        /* renamed from: b */
        public static final int f65736b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$e */
    public static final class C27033e implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27033e f65737a = new C27033e();

        /* renamed from: b */
        public static final int f65738b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$f */
    public static final class C27034f implements C27028a {

        /* renamed from: d */
        public static final int f65739d = OrderType.f70277d;
        @C12579k

        /* renamed from: a */
        public final String f65740a;
        @C12579k

        /* renamed from: b */
        public final OrderType f65741b;

        /* renamed from: c */
        public final boolean f65742c;

        public C27034f(@C12579k String str, @C12579k OrderType orderType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f65740a = str;
            this.f65741b = orderType;
            this.f65742c = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C27034f m114286e(C27034f fVar, String str, OrderType orderType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.f65740a;
            }
            if ((i & 2) != 0) {
                orderType = fVar.f65741b;
            }
            if ((i & 4) != 0) {
                z = fVar.f65742c;
            }
            return fVar.mo78487d(str, orderType, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78484a() {
            return this.f65740a;
        }

        @C12579k
        /* renamed from: b */
        public final OrderType mo78485b() {
            return this.f65741b;
        }

        /* renamed from: c */
        public final boolean mo78486c() {
            return this.f65742c;
        }

        @C12579k
        /* renamed from: d */
        public final C27034f mo78487d(@C12579k String str, @C12579k OrderType orderType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C27034f(str, orderType, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27034f)) {
                return false;
            }
            C27034f fVar = (C27034f) obj;
            return Intrinsics.areEqual((Object) this.f65740a, (Object) fVar.f65740a) && Intrinsics.areEqual((Object) this.f65741b, (Object) fVar.f65741b) && this.f65742c == fVar.f65742c;
        }

        @C12579k
        /* renamed from: f */
        public final String mo78489f() {
            return this.f65740a;
        }

        @C12579k
        /* renamed from: g */
        public final OrderType mo78490g() {
            return this.f65741b;
        }

        /* renamed from: h */
        public final boolean mo78491h() {
            return this.f65742c;
        }

        public int hashCode() {
            int hashCode = ((this.f65740a.hashCode() * 31) + this.f65741b.hashCode()) * 31;
            boolean z = this.f65742c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String str = this.f65740a;
            OrderType orderType = this.f65741b;
            boolean z = this.f65742c;
            return "OnDisplayOrder(orderId=" + str + ", orderType=" + orderType + ", statusIsAtLeastBilled=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$g */
    public static final class C27035g implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27035g f65743a = new C27035g();

        /* renamed from: b */
        public static final int f65744b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$h */
    public static final class C27036h implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27036h f65745a = new C27036h();

        /* renamed from: b */
        public static final int f65746b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$i */
    public static final class C27037i implements C27028a {
        @C12579k

        /* renamed from: a */
        public static final C27037i f65747a = new C27037i();

        /* renamed from: b */
        public static final int f65748b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$j */
    public static final class C27038j implements C27028a {

        /* renamed from: b */
        public static final int f65749b = 0;
        @C12579k

        /* renamed from: a */
        public final String f65750a;

        public C27038j(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            this.f65750a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27038j m114294c(C27038j jVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jVar.f65750a;
            }
            return jVar.mo78495b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78494a() {
            return this.f65750a;
        }

        @C12579k
        /* renamed from: b */
        public final C27038j mo78495b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            return new C27038j(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo78496d() {
            return this.f65750a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27038j) && Intrinsics.areEqual((Object) this.f65750a, (Object) ((C27038j) obj).f65750a);
        }

        public int hashCode() {
            return this.f65750a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f65750a;
            return "OnWebRedirection(url=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k */
    public interface C27039k extends C27028a {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a */
        public interface C27040a extends C27039k {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$a */
            public static final class C27041a implements C27040a {

                /* renamed from: b */
                public static final int f65751b = 0;
                @C12579k

                /* renamed from: a */
                public final String f65752a;

                public C27041a(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    this.f65752a = str;
                }

                /* renamed from: c */
                public static /* synthetic */ C27041a m114298c(C27041a aVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f65752a;
                    }
                    return aVar.mo78501b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78500a() {
                    return this.f65752a;
                }

                @C12579k
                /* renamed from: b */
                public final C27041a mo78501b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    return new C27041a(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo78502d() {
                    return this.f65752a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27041a) && Intrinsics.areEqual((Object) this.f65752a, (Object) ((C27041a) obj).f65752a);
                }

                public int hashCode() {
                    return this.f65752a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65752a;
                    return "OnAdditionalOrderAction(orderId=" + str + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$b */
            public static final class C27042b implements C27040a {

                /* renamed from: c */
                public static final int f65753c = OrderType.f70277d;
                @C12579k

                /* renamed from: a */
                public final OrderType f65754a;
                @C12579k

                /* renamed from: b */
                public final String f65755b;

                public C27042b(@C12579k OrderType orderType, @C12579k String str) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(str, "url");
                    this.f65754a = orderType;
                    this.f65755b = str;
                }

                /* renamed from: d */
                public static /* synthetic */ C27042b m114302d(C27042b bVar, OrderType orderType, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        orderType = bVar.f65754a;
                    }
                    if ((i & 2) != 0) {
                        str = bVar.f65755b;
                    }
                    return bVar.mo78508c(orderType, str);
                }

                @C12579k
                /* renamed from: a */
                public final OrderType mo78506a() {
                    return this.f65754a;
                }

                @C12579k
                /* renamed from: b */
                public final String mo78507b() {
                    return this.f65755b;
                }

                @C12579k
                /* renamed from: c */
                public final C27042b mo78508c(@C12579k OrderType orderType, @C12579k String str) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(str, "url");
                    return new C27042b(orderType, str);
                }

                @C12579k
                /* renamed from: e */
                public final OrderType mo78509e() {
                    return this.f65754a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C27042b)) {
                        return false;
                    }
                    C27042b bVar = (C27042b) obj;
                    return Intrinsics.areEqual((Object) this.f65754a, (Object) bVar.f65754a) && Intrinsics.areEqual((Object) this.f65755b, (Object) bVar.f65755b);
                }

                @C12579k
                /* renamed from: f */
                public final String mo78511f() {
                    return this.f65755b;
                }

                public int hashCode() {
                    return (this.f65754a.hashCode() * 31) + this.f65755b.hashCode();
                }

                @C12579k
                public String toString() {
                    OrderType orderType = this.f65754a;
                    String str = this.f65755b;
                    return "OnAskRefund(orderType=" + orderType + ", url=" + str + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$c */
            public static final class C27043c implements C27040a {

                /* renamed from: c */
                public static final int f65756c = OrderType.f70277d;
                @C12579k

                /* renamed from: a */
                public final String f65757a;
                @C12579k

                /* renamed from: b */
                public final OrderType f65758b;

                public C27043c(@C12579k String str, @C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    this.f65757a = str;
                    this.f65758b = orderType;
                }

                /* renamed from: d */
                public static /* synthetic */ C27043c m114308d(C27043c cVar, String str, OrderType orderType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.f65757a;
                    }
                    if ((i & 2) != 0) {
                        orderType = cVar.f65758b;
                    }
                    return cVar.mo78516c(str, orderType);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78514a() {
                    return this.f65757a;
                }

                @C12579k
                /* renamed from: b */
                public final OrderType mo78515b() {
                    return this.f65758b;
                }

                @C12579k
                /* renamed from: c */
                public final C27043c mo78516c(@C12579k String str, @C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    return new C27043c(str, orderType);
                }

                @C12579k
                /* renamed from: e */
                public final String mo78517e() {
                    return this.f65757a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C27043c)) {
                        return false;
                    }
                    C27043c cVar = (C27043c) obj;
                    return Intrinsics.areEqual((Object) this.f65757a, (Object) cVar.f65757a) && Intrinsics.areEqual((Object) this.f65758b, (Object) cVar.f65758b);
                }

                @C12579k
                /* renamed from: f */
                public final OrderType mo78519f() {
                    return this.f65758b;
                }

                public int hashCode() {
                    return (this.f65757a.hashCode() * 31) + this.f65758b.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65757a;
                    OrderType orderType = this.f65758b;
                    return "OnCancel(orderId=" + str + ", orderType=" + orderType + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$d */
            public static final class C27044d implements C27040a {

                /* renamed from: d */
                public static final int f65759d = OrderType.f70277d;
                @C12579k

                /* renamed from: a */
                public final String f65760a;
                @C12579k

                /* renamed from: b */
                public final OrderType f65761b;
                @C12579k

                /* renamed from: c */
                public final String f65762c;

                public C27044d(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
                    this.f65760a = str;
                    this.f65761b = orderType;
                    this.f65762c = str2;
                }

                /* renamed from: e */
                public static /* synthetic */ C27044d m114314e(C27044d dVar, String str, OrderType orderType, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = dVar.f65760a;
                    }
                    if ((i & 2) != 0) {
                        orderType = dVar.f65761b;
                    }
                    if ((i & 4) != 0) {
                        str2 = dVar.f65762c;
                    }
                    return dVar.mo78525d(str, orderType, str2);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78522a() {
                    return this.f65760a;
                }

                @C12579k
                /* renamed from: b */
                public final OrderType mo78523b() {
                    return this.f65761b;
                }

                @C12579k
                /* renamed from: c */
                public final String mo78524c() {
                    return this.f65762c;
                }

                @C12579k
                /* renamed from: d */
                public final C27044d mo78525d(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
                    return new C27044d(str, orderType, str2);
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C27044d)) {
                        return false;
                    }
                    C27044d dVar = (C27044d) obj;
                    return Intrinsics.areEqual((Object) this.f65760a, (Object) dVar.f65760a) && Intrinsics.areEqual((Object) this.f65761b, (Object) dVar.f65761b) && Intrinsics.areEqual((Object) this.f65762c, (Object) dVar.f65762c);
                }

                @C12579k
                /* renamed from: f */
                public final String mo78527f() {
                    return this.f65762c;
                }

                @C12579k
                /* renamed from: g */
                public final String mo78528g() {
                    return this.f65760a;
                }

                @C12579k
                /* renamed from: h */
                public final OrderType mo78529h() {
                    return this.f65761b;
                }

                public int hashCode() {
                    return (((this.f65760a.hashCode() * 31) + this.f65761b.hashCode()) * 31) + this.f65762c.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65760a;
                    OrderType orderType = this.f65761b;
                    String str2 = this.f65762c;
                    return "OnChangeDelivery(orderId=" + str + ", orderType=" + orderType + ", facilityServiceId=" + str2 + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$e */
            public static final class C27045e implements C27040a {

                /* renamed from: b */
                public static final int f65763b = 0;
                @C12579k

                /* renamed from: a */
                public final String f65764a;

                public C27045e(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    this.f65764a = str;
                }

                /* renamed from: c */
                public static /* synthetic */ C27045e m114322c(C27045e eVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = eVar.f65764a;
                    }
                    return eVar.mo78533b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78532a() {
                    return this.f65764a;
                }

                @C12579k
                /* renamed from: b */
                public final C27045e mo78533b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    return new C27045e(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo78534d() {
                    return this.f65764a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27045e) && Intrinsics.areEqual((Object) this.f65764a, (Object) ((C27045e) obj).f65764a);
                }

                public int hashCode() {
                    return this.f65764a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65764a;
                    return "OnOrderAgain(orderId=" + str + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$a$f */
            public static final class C27046f implements C27040a {

                /* renamed from: b */
                public static final int f65765b = 0;
                @C12579k

                /* renamed from: a */
                public final String f65766a;

                public C27046f(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    this.f65766a = str;
                }

                /* renamed from: c */
                public static /* synthetic */ C27046f m114326c(C27046f fVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = fVar.f65766a;
                    }
                    return fVar.mo78539b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78538a() {
                    return this.f65766a;
                }

                @C12579k
                /* renamed from: b */
                public final C27046f mo78539b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "orderId");
                    return new C27046f(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo78540d() {
                    return this.f65766a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27046f) && Intrinsics.areEqual((Object) this.f65766a, (Object) ((C27046f) obj).f65766a);
                }

                public int hashCode() {
                    return this.f65766a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65766a;
                    return "WithdrawalVoucher(orderId=" + str + ")";
                }
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$b */
        public interface C27047b extends C27039k {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$b$a */
            public static final class C27048a implements C27047b {

                /* renamed from: b */
                public static final int f65767b = OrderType.f70277d;
                @C12579k

                /* renamed from: a */
                public final OrderType f65768a;

                public C27048a(@C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    this.f65768a = orderType;
                }

                /* renamed from: c */
                public static /* synthetic */ C27048a m114330c(C27048a aVar, OrderType orderType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        orderType = aVar.f65768a;
                    }
                    return aVar.mo78545b(orderType);
                }

                @C12579k
                /* renamed from: a */
                public final OrderType mo78544a() {
                    return this.f65768a;
                }

                @C12579k
                /* renamed from: b */
                public final C27048a mo78545b(@C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    return new C27048a(orderType);
                }

                @C12579k
                /* renamed from: d */
                public final OrderType mo78546d() {
                    return this.f65768a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27048a) && Intrinsics.areEqual((Object) this.f65768a, (Object) ((C27048a) obj).f65768a);
                }

                public int hashCode() {
                    return this.f65768a.hashCode();
                }

                @C12579k
                public String toString() {
                    OrderType orderType = this.f65768a;
                    return "OnAskRefund(orderType=" + orderType + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$b$b */
            public static final class C27049b implements C27047b {

                /* renamed from: b */
                public static final int f65769b = OrderType.f70277d;
                @C12579k

                /* renamed from: a */
                public final OrderType f65770a;

                public C27049b(@C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    this.f65770a = orderType;
                }

                /* renamed from: c */
                public static /* synthetic */ C27049b m114334c(C27049b bVar, OrderType orderType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        orderType = bVar.f65770a;
                    }
                    return bVar.mo78551b(orderType);
                }

                @C12579k
                /* renamed from: a */
                public final OrderType mo78550a() {
                    return this.f65770a;
                }

                @C12579k
                /* renamed from: b */
                public final C27049b mo78551b(@C12579k OrderType orderType) {
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    return new C27049b(orderType);
                }

                @C12579k
                /* renamed from: d */
                public final OrderType mo78552d() {
                    return this.f65770a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27049b) && Intrinsics.areEqual((Object) this.f65770a, (Object) ((C27049b) obj).f65770a);
                }

                public int hashCode() {
                    return this.f65770a.hashCode();
                }

                @C12579k
                public String toString() {
                    OrderType orderType = this.f65770a;
                    return "OnCancel(orderType=" + orderType + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$b$c */
            public static final class C27050c implements C27047b {

                /* renamed from: b */
                public static final int f65771b = 0;
                @C12579k

                /* renamed from: a */
                public final String f65772a;

                public C27050c(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "url");
                    this.f65772a = str;
                }

                /* renamed from: c */
                public static /* synthetic */ C27050c m114338c(C27050c cVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.f65772a;
                    }
                    return cVar.mo78557b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo78556a() {
                    return this.f65772a;
                }

                @C12579k
                /* renamed from: b */
                public final C27050c mo78557b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "url");
                    return new C27050c(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo78558d() {
                    return this.f65772a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C27050c) && Intrinsics.areEqual((Object) this.f65772a, (Object) ((C27050c) obj).f65772a);
                }

                public int hashCode() {
                    return this.f65772a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f65772a;
                    return "OnFollowCommand(url=" + str + ")";
                }
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.a$k$c */
        public static final class C27051c implements C27040a {
            @C12579k

            /* renamed from: a */
            public static final C27051c f65773a = new C27051c();

            /* renamed from: b */
            public static final int f65774b = 0;
        }
    }
}
