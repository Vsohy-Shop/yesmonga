package com.carrefour.fid.android.presentation.viewmodels.order.online.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a */
public final class C27012a {
    @C12579k

    /* renamed from: a */
    public static final C27012a f65697a = new C27012a();

    /* renamed from: b */
    public static final int f65698b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a */
    public interface C27013a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$a */
        public static final class C27014a implements C27013a {

            /* renamed from: b */
            public static final int f65699b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f65700a;

            public C27014a(@C12580l Throwable th) {
                this.f65700a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C27014a m114245c(C27014a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65700a;
                }
                return aVar.mo78431b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo78430a() {
                return this.f65700a;
            }

            @C12579k
            /* renamed from: b */
            public final C27014a mo78431b(@C12580l Throwable th) {
                return new C27014a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo78432d() {
                return this.f65700a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27014a) && Intrinsics.areEqual((Object) this.f65700a, (Object) ((C27014a) obj).f65700a);
            }

            public int hashCode() {
                Throwable th = this.f65700a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65700a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$b */
        public static final class C27015b implements C27013a {
            @C12579k

            /* renamed from: a */
            public static final C27015b f65701a = new C27015b();

            /* renamed from: b */
            public static final int f65702b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$a$c */
        public static final class C27016c implements C27013a {

            /* renamed from: c */
            public static final int f65703c = 0;
            @C12579k

            /* renamed from: a */
            public final String f65704a;

            /* renamed from: b */
            public final boolean f65705b;

            public C27016c(@C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f65704a = str;
                this.f65705b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27016c m114249d(C27016c cVar, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f65704a;
                }
                if ((i & 2) != 0) {
                    z = cVar.f65705b;
                }
                return cVar.mo78438c(str, z);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78436a() {
                return this.f65704a;
            }

            /* renamed from: b */
            public final boolean mo78437b() {
                return this.f65705b;
            }

            @C12579k
            /* renamed from: c */
            public final C27016c mo78438c(@C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C27016c(str, z);
            }

            @C12579k
            /* renamed from: e */
            public final String mo78439e() {
                return this.f65704a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27016c)) {
                    return false;
                }
                C27016c cVar = (C27016c) obj;
                return Intrinsics.areEqual((Object) this.f65704a, (Object) cVar.f65704a) && this.f65705b == cVar.f65705b;
            }

            /* renamed from: f */
            public final boolean mo78441f() {
                return this.f65705b;
            }

            public int hashCode() {
                int hashCode = this.f65704a.hashCode() * 31;
                boolean z = this.f65705b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                String str = this.f65704a;
                boolean z = this.f65705b;
                return "StartAdditionalOrder(orderId=" + str + ", showAdditionalOrderBackdrop=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b */
    public interface C27017b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$a */
        public static final class C27018a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114255a(@C12579k C27017b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$b */
        public static final class C27019b implements C27017b {
            @C12579k

            /* renamed from: b */
            public static final C27019b f65706b = new C27019b();

            /* renamed from: c */
            public static final int f65707c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27018a.m114255a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$b$c */
        public static final class C27020c implements C27017b {

            /* renamed from: d */
            public static final int f65708d = 8;
            @C12579k

            /* renamed from: b */
            public final String f65709b;
            @C12579k

            /* renamed from: c */
            public final List<C25237e> f65710c;

            public C27020c(@C12579k String str, @C12579k List<? extends C25237e> list) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(list, "items");
                this.f65709b = str;
                this.f65710c = list;
            }

            /* renamed from: h */
            public static /* synthetic */ C27020c m114256h(C27020c cVar, String str, List<C25237e> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f65709b;
                }
                if ((i & 2) != 0) {
                    list = cVar.f65710c;
                }
                return cVar.mo78447g(str, list);
            }

            @C12579k
            /* renamed from: e */
            public final String mo78444e() {
                return this.f65709b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27020c)) {
                    return false;
                }
                C27020c cVar = (C27020c) obj;
                return Intrinsics.areEqual((Object) this.f65709b, (Object) cVar.f65709b) && Intrinsics.areEqual((Object) this.f65710c, (Object) cVar.f65710c);
            }

            @C12579k
            /* renamed from: f */
            public final List<C25237e> mo78446f() {
                return this.f65710c;
            }

            @C12579k
            /* renamed from: g */
            public final C27020c mo78447g(@C12579k String str, @C12579k List<? extends C25237e> list) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(list, "items");
                return new C27020c(str, list);
            }

            public int hashCode() {
                return (this.f65709b.hashCode() * 31) + this.f65710c.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final List<C25237e> mo78449i() {
                return this.f65710c;
            }

            @C12579k
            /* renamed from: j */
            public final String mo78450j() {
                return this.f65709b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27018a.m114255a(this);
            }

            @C12579k
            public String toString() {
                String str = this.f65709b;
                List<C25237e> list = this.f65710c;
                return "OrderDetails(orderId=" + str + ", items=" + list + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c */
    public interface C27021c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$a */
        public static final class C27022a implements C27021c {
            @C12579k

            /* renamed from: a */
            public static final C27022a f65711a = new C27022a();

            /* renamed from: b */
            public static final int f65712b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$b */
        public static final class C27023b implements C27021c {

            /* renamed from: e */
            public static final int f65713e = 0;
            @C12579k

            /* renamed from: a */
            public final String f65714a;
            @C12579k

            /* renamed from: b */
            public final String f65715b;
            @C12579k

            /* renamed from: c */
            public final String f65716c;
            @C12579k

            /* renamed from: d */
            public final String f65717d;

            public C27023b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(str2, "downloadBillButtonName");
                Intrinsics.checkNotNullParameter(str3, "cancelOrderButtonName");
                Intrinsics.checkNotNullParameter(str4, "askRefundButtonName");
                this.f65714a = str;
                this.f65715b = str2;
                this.f65716c = str3;
                this.f65717d = str4;
            }

            /* renamed from: f */
            public static /* synthetic */ C27023b m114262f(C27023b bVar, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f65714a;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f65715b;
                }
                if ((i & 4) != 0) {
                    str3 = bVar.f65716c;
                }
                if ((i & 8) != 0) {
                    str4 = bVar.f65717d;
                }
                return bVar.mo78456e(str, str2, str3, str4);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78452a() {
                return this.f65714a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo78453b() {
                return this.f65715b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo78454c() {
                return this.f65716c;
            }

            @C12579k
            /* renamed from: d */
            public final String mo78455d() {
                return this.f65717d;
            }

            @C12579k
            /* renamed from: e */
            public final C27023b mo78456e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                Intrinsics.checkNotNullParameter(str2, "downloadBillButtonName");
                Intrinsics.checkNotNullParameter(str3, "cancelOrderButtonName");
                Intrinsics.checkNotNullParameter(str4, "askRefundButtonName");
                return new C27023b(str, str2, str3, str4);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27023b)) {
                    return false;
                }
                C27023b bVar = (C27023b) obj;
                return Intrinsics.areEqual((Object) this.f65714a, (Object) bVar.f65714a) && Intrinsics.areEqual((Object) this.f65715b, (Object) bVar.f65715b) && Intrinsics.areEqual((Object) this.f65716c, (Object) bVar.f65716c) && Intrinsics.areEqual((Object) this.f65717d, (Object) bVar.f65717d);
            }

            @C12579k
            /* renamed from: g */
            public final String mo78458g() {
                return this.f65717d;
            }

            @C12579k
            /* renamed from: h */
            public final String mo78459h() {
                return this.f65716c;
            }

            public int hashCode() {
                return (((((this.f65714a.hashCode() * 31) + this.f65715b.hashCode()) * 31) + this.f65716c.hashCode()) * 31) + this.f65717d.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final String mo78461i() {
                return this.f65715b;
            }

            @C12579k
            /* renamed from: j */
            public final String mo78462j() {
                return this.f65714a;
            }

            @C12579k
            public String toString() {
                String str = this.f65714a;
                String str2 = this.f65715b;
                String str3 = this.f65716c;
                String str4 = this.f65717d;
                return "GetOrderDetails(orderId=" + str + ", downloadBillButtonName=" + str2 + ", cancelOrderButtonName=" + str3 + ", askRefundButtonName=" + str4 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$c */
        public static final class C27024c implements C27021c {
            @C12579k

            /* renamed from: a */
            public static final C27024c f65718a = new C27024c();

            /* renamed from: b */
            public static final int f65719b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.a$c$d */
        public static final class C27025d implements C27021c {

            /* renamed from: b */
            public static final int f65720b = 8;
            @C12579k

            /* renamed from: a */
            public final Slot f65721a;

            public C27025d(@C12579k Slot slot) {
                Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
                this.f65721a = slot;
            }

            /* renamed from: c */
            public static /* synthetic */ C27025d m114272c(C27025d dVar, Slot slot, int i, Object obj) {
                if ((i & 1) != 0) {
                    slot = dVar.f65721a;
                }
                return dVar.mo78465b(slot);
            }

            @C12579k
            /* renamed from: a */
            public final Slot mo78464a() {
                return this.f65721a;
            }

            @C12579k
            /* renamed from: b */
            public final C27025d mo78465b(@C12579k Slot slot) {
                Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
                return new C27025d(slot);
            }

            @C12579k
            /* renamed from: d */
            public final Slot mo78466d() {
                return this.f65721a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27025d) && Intrinsics.areEqual((Object) this.f65721a, (Object) ((C27025d) obj).f65721a);
            }

            public int hashCode() {
                return this.f65721a.hashCode();
            }

            @C12579k
            public String toString() {
                Slot slot = this.f65721a;
                return "UpdateOrder(slot=" + slot + ")";
            }
        }
    }
}
