package com.carrefour.fid.android.account.presentation.viewmodels.address.mvi;

import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.base.C28505u;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.util.C9650g;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a */
public final class C13645a {
    @C12579k

    /* renamed from: a */
    public static final C13645a f33197a = new C13645a();
    @C12579k

    /* renamed from: b */
    public static final C28505u.C28508c<C13658c, C13646a> f33198b = C13672e.f33263a;

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a */
    public interface C13646a extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$a */
        public static final class C13647a implements C13646a {
            @C12579k

            /* renamed from: b */
            public static final C13647a f33199b = new C13647a();

            /* renamed from: c */
            public static final int f33200c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13650d.m58383a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$b */
        public static final class C13648b implements C13646a {

            /* renamed from: c */
            public static final int f33201c = 0;
            @C12579k

            /* renamed from: b */
            public final DQEAddressModel f33202b;

            public C13648b(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                this.f33202b = dQEAddressModel;
            }

            /* renamed from: g */
            public static /* synthetic */ C13648b m58375g(C13648b bVar, DQEAddressModel dQEAddressModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    dQEAddressModel = bVar.f33202b;
                }
                return bVar.mo32407f(dQEAddressModel);
            }

            @C12579k
            /* renamed from: e */
            public final DQEAddressModel mo32405e() {
                return this.f33202b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13648b) && Intrinsics.areEqual((Object) this.f33202b, (Object) ((C13648b) obj).f33202b);
            }

            @C12579k
            /* renamed from: f */
            public final C13648b mo32407f(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                return new C13648b(dQEAddressModel);
            }

            @C12579k
            /* renamed from: h */
            public final DQEAddressModel mo32408h() {
                return this.f33202b;
            }

            public int hashCode() {
                return this.f33202b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13650d.m58383a(this);
            }

            @C12579k
            public String toString() {
                DQEAddressModel dQEAddressModel = this.f33202b;
                return "DQEAddress(dqeAddressModel=" + dQEAddressModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$c */
        public static final class C13649c implements C13646a {

            /* renamed from: c */
            public static final int f33203c = 8;
            @C12579k

            /* renamed from: b */
            public final List<DQEAddressModel> f33204b;

            public C13649c(@C12579k List<DQEAddressModel> list) {
                Intrinsics.checkNotNullParameter(list, "suggestions");
                this.f33204b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C13649c m58379g(C13649c cVar, List<DQEAddressModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.f33204b;
                }
                return cVar.mo32413f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<DQEAddressModel> mo32411e() {
                return this.f33204b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13649c) && Intrinsics.areEqual((Object) this.f33204b, (Object) ((C13649c) obj).f33204b);
            }

            @C12579k
            /* renamed from: f */
            public final C13649c mo32413f(@C12579k List<DQEAddressModel> list) {
                Intrinsics.checkNotNullParameter(list, "suggestions");
                return new C13649c(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<DQEAddressModel> mo32414h() {
                return this.f33204b;
            }

            public int hashCode() {
                return this.f33204b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13650d.m58383a(this);
            }

            @C12579k
            public String toString() {
                List<DQEAddressModel> list = this.f33204b;
                return "DQEAddressSuggestions(suggestions=" + list + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$d */
        public static final class C13650d {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m58383a(@C12579k C13646a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e */
        public static final class C13651e implements C13646a {

            /* renamed from: c */
            public static final int f33205c = 0;

            /* renamed from: b */
            public final boolean f33206b;

            public C13651e() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C13651e m58384g(C13651e eVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = eVar.f33206b;
                }
                return eVar.mo32419f(z);
            }

            /* renamed from: e */
            public final boolean mo32417e() {
                return this.f33206b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13651e) && this.f33206b == ((C13651e) obj).f33206b;
            }

            @C12579k
            /* renamed from: f */
            public final C13651e mo32419f(boolean z) {
                return new C13651e(z);
            }

            public int hashCode() {
                boolean z = this.f33206b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f33206b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13650d.m58383a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33206b;
                return "Loading(isLoading=" + z + ")";
            }

            public C13651e(boolean z) {
                this.f33206b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13651e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$f */
        public static final class C13652f implements C13646a {

            /* renamed from: d */
            public static final int f33207d = 8;
            @C12579k

            /* renamed from: b */
            public final Address f33208b;
            @C12579k

            /* renamed from: c */
            public final String f33209c;

            public C13652f(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.f33208b = address;
                this.f33209c = str;
            }

            /* renamed from: h */
            public static /* synthetic */ C13652f m58387h(C13652f fVar, Address address, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = fVar.f33208b;
                }
                if ((i & 2) != 0) {
                    str = fVar.f33209c;
                }
                return fVar.mo32427g(address, str);
            }

            @C12579k
            /* renamed from: c */
            public final String mo32423c() {
                return this.f33209c;
            }

            @C12579k
            /* renamed from: e */
            public final Address mo32424e() {
                return this.f33208b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13652f)) {
                    return false;
                }
                C13652f fVar = (C13652f) obj;
                return Intrinsics.areEqual((Object) this.f33208b, (Object) fVar.f33208b) && Intrinsics.areEqual((Object) this.f33209c, (Object) fVar.f33209c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32426f() {
                return this.f33209c;
            }

            @C12579k
            /* renamed from: g */
            public final C13652f mo32427g(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new C13652f(address, str);
            }

            public int hashCode() {
                return (this.f33208b.hashCode() * 31) + this.f33209c.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final Address mo32429i() {
                return this.f33208b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13650d.m58383a(this);
            }

            @C12579k
            public String toString() {
                Address address = this.f33208b;
                String str = this.f33209c;
                return "RememberUserInput(address=" + address + ", telephone=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b */
    public interface C13653b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$a */
        public static final class C13654a implements C13653b {
            @C12579k

            /* renamed from: a */
            public static final C13654a f33210a = new C13654a();

            /* renamed from: b */
            public static final int f33211b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b */
        public static final class C13655b implements C13653b {

            /* renamed from: b */
            public static final int f33212b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f33213a;

            public C13655b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f33213a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13655b m58393c(C13655b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f33213a;
                }
                return bVar.mo32432b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo32431a() {
                return this.f33213a;
            }

            @C12579k
            /* renamed from: b */
            public final C13655b mo32432b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C13655b(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo32433d() {
                return this.f33213a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13655b) && Intrinsics.areEqual((Object) this.f33213a, (Object) ((C13655b) obj).f33213a);
            }

            public int hashCode() {
                return this.f33213a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33213a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$c */
        public static final class C13656c implements C13653b {

            /* renamed from: b */
            public static final int f33214b = 0;

            /* renamed from: a */
            public final boolean f33215a;

            public C13656c(boolean z) {
                this.f33215a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C13656c m58397c(C13656c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f33215a;
                }
                return cVar.mo32438b(z);
            }

            /* renamed from: a */
            public final boolean mo32437a() {
                return this.f33215a;
            }

            @C12579k
            /* renamed from: b */
            public final C13656c mo32438b(boolean z) {
                return new C13656c(z);
            }

            /* renamed from: d */
            public final boolean mo32439d() {
                return this.f33215a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13656c) && this.f33215a == ((C13656c) obj).f33215a;
            }

            public int hashCode() {
                boolean z = this.f33215a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f33215a;
                return "ShowFillWithDeliveryAddressSwitch(isChecked=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$d */
        public static final class C13657d implements C13653b {

            /* renamed from: c */
            public static final int f33216c = 8;
            @C12579k

            /* renamed from: a */
            public final Address f33217a;
            @C12579k

            /* renamed from: b */
            public final String f33218b;

            public C13657d(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "addressModel");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.f33217a = address;
                this.f33218b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C13657d m58401d(C13657d dVar, Address address, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = dVar.f33217a;
                }
                if ((i & 2) != 0) {
                    str = dVar.f33218b;
                }
                return dVar.mo32445c(address, str);
            }

            @C12579k
            /* renamed from: a */
            public final Address mo32443a() {
                return this.f33217a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32444b() {
                return this.f33218b;
            }

            @C12579k
            /* renamed from: c */
            public final C13657d mo32445c(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "addressModel");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new C13657d(address, str);
            }

            @C12579k
            /* renamed from: e */
            public final Address mo32446e() {
                return this.f33217a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13657d)) {
                    return false;
                }
                C13657d dVar = (C13657d) obj;
                return Intrinsics.areEqual((Object) this.f33217a, (Object) dVar.f33217a) && Intrinsics.areEqual((Object) this.f33218b, (Object) dVar.f33218b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32448f() {
                return this.f33218b;
            }

            public int hashCode() {
                return (this.f33217a.hashCode() * 31) + this.f33218b.hashCode();
            }

            @C12579k
            public String toString() {
                Address address = this.f33217a;
                String str = this.f33218b;
                return "UserNeedsToVerifyTheAddress(addressModel=" + address + ", telephone=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c */
    public interface C13658c extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$a */
        public interface C13659a extends C13658c {

            /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$a$a */
            public static final class C13660a {
                /* renamed from: a */
                public static boolean m58411a(@C12579k C13659a aVar) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    if (aVar.getAddress().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (aVar.getPostcode().length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (aVar.getCity().length() > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                if (aVar.getCountry().length() > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    if (aVar.mo32453c().length() > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }

                @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
                @C12579k
                /* renamed from: b */
                public static C28505u.C28509d m58412b(@C12579k C13659a aVar) {
                    return C13662c.m58427a(aVar);
                }
            }

            @C12579k
            /* renamed from: a */
            List<DQEAddressModel> mo32451a();

            /* renamed from: b */
            boolean mo32452b();

            @C12579k
            /* renamed from: c */
            String mo32453c();

            /* renamed from: d */
            boolean mo32454d();

            @C12579k
            String getAddress();

            @C12579k
            String getCity();

            @C12579k
            String getCountry();

            @C12579k
            String getPostcode();

            boolean isLoading();
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b */
        public static final class C13661b implements C13659a {

            /* renamed from: j */
            public static final int f33219j = 8;
            @C12579k

            /* renamed from: b */
            public final String f33220b;
            @C12579k

            /* renamed from: c */
            public final String f33221c;
            @C12579k

            /* renamed from: d */
            public final String f33222d;
            @C12579k

            /* renamed from: e */
            public final String f33223e;
            @C12579k

            /* renamed from: f */
            public final String f33224f;

            /* renamed from: g */
            public final boolean f33225g;

            /* renamed from: h */
            public final boolean f33226h;
            @C12579k

            /* renamed from: i */
            public final List<DQEAddressModel> f33227i;

            public C13661b() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, false, false, (List) null, 255, (DefaultConstructorMarker) null);
            }

            /* renamed from: n */
            public static /* synthetic */ C13661b m58413n(C13661b bVar, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, List list, int i, Object obj) {
                C13661b bVar2 = bVar;
                int i2 = i;
                return bVar.mo32470m((i2 & 1) != 0 ? bVar2.f33220b : str, (i2 & 2) != 0 ? bVar2.f33221c : str2, (i2 & 4) != 0 ? bVar2.f33222d : str3, (i2 & 8) != 0 ? bVar2.f33223e : str4, (i2 & 16) != 0 ? bVar2.f33224f : str5, (i2 & 32) != 0 ? bVar2.f33225g : z, (i2 & 64) != 0 ? bVar2.f33226h : z2, (i2 & 128) != 0 ? bVar2.f33227i : list);
            }

            @C12579k
            /* renamed from: a */
            public List<DQEAddressModel> mo32451a() {
                return this.f33227i;
            }

            /* renamed from: b */
            public boolean mo32452b() {
                return C13659a.C13660a.m58411a(this);
            }

            @C12579k
            /* renamed from: c */
            public String mo32453c() {
                return this.f33224f;
            }

            /* renamed from: d */
            public boolean mo32454d() {
                return this.f33225g;
            }

            @C12579k
            /* renamed from: e */
            public final String mo32460e() {
                return this.f33220b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13661b)) {
                    return false;
                }
                C13661b bVar = (C13661b) obj;
                return Intrinsics.areEqual((Object) this.f33220b, (Object) bVar.f33220b) && Intrinsics.areEqual((Object) this.f33221c, (Object) bVar.f33221c) && Intrinsics.areEqual((Object) this.f33222d, (Object) bVar.f33222d) && Intrinsics.areEqual((Object) this.f33223e, (Object) bVar.f33223e) && Intrinsics.areEqual((Object) this.f33224f, (Object) bVar.f33224f) && this.f33225g == bVar.f33225g && this.f33226h == bVar.f33226h && Intrinsics.areEqual((Object) this.f33227i, (Object) bVar.f33227i);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32462f() {
                return this.f33221c;
            }

            @C12579k
            /* renamed from: g */
            public final String mo32463g() {
                return this.f33222d;
            }

            @C12579k
            public String getAddress() {
                return this.f33220b;
            }

            @C12579k
            public String getCity() {
                return this.f33222d;
            }

            @C12579k
            public String getCountry() {
                return this.f33223e;
            }

            @C12579k
            public String getPostcode() {
                return this.f33221c;
            }

            @C12579k
            /* renamed from: h */
            public final String mo32464h() {
                return this.f33223e;
            }

            public int hashCode() {
                int hashCode = ((((((((this.f33220b.hashCode() * 31) + this.f33221c.hashCode()) * 31) + this.f33222d.hashCode()) * 31) + this.f33223e.hashCode()) * 31) + this.f33224f.hashCode()) * 31;
                boolean z = this.f33225g;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                boolean z3 = this.f33226h;
                if (!z3) {
                    z2 = z3;
                }
                return ((i + (z2 ? 1 : 0)) * 31) + this.f33227i.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final String mo32466i() {
                return this.f33224f;
            }

            public boolean isLoading() {
                return this.f33226h;
            }

            /* renamed from: j */
            public final boolean mo32467j() {
                return this.f33225g;
            }

            /* renamed from: k */
            public final boolean mo32468k() {
                return this.f33226h;
            }

            @C12579k
            /* renamed from: l */
            public final List<DQEAddressModel> mo32469l() {
                return this.f33227i;
            }

            @C12579k
            /* renamed from: m */
            public final C13661b mo32470m(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z, boolean z2, @C12579k List<DQEAddressModel> list) {
                Intrinsics.checkNotNullParameter(str, "address");
                Intrinsics.checkNotNullParameter(str2, "postcode");
                Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
                Intrinsics.checkNotNullParameter(str4, "country");
                Intrinsics.checkNotNullParameter(str5, "telephone");
                List<DQEAddressModel> list2 = list;
                Intrinsics.checkNotNullParameter(list2, "dqeAddressSuggestions");
                return new C13661b(str, str2, str3, str4, str5, z, z2, list2);
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13659a.C13660a.m58412b(this);
            }

            @C12579k
            public String toString() {
                String str = this.f33220b;
                String str2 = this.f33221c;
                String str3 = this.f33222d;
                String str4 = this.f33223e;
                String str5 = this.f33224f;
                boolean z = this.f33225g;
                boolean z2 = this.f33226h;
                List<DQEAddressModel> list = this.f33227i;
                return "BillingAddress(address=" + str + ", postcode=" + str2 + ", city=" + str3 + ", country=" + str4 + ", telephone=" + str5 + ", isFromDQE=" + z + ", isLoading=" + z2 + ", dqeAddressSuggestions=" + list + ")";
            }

            public C13661b(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z, boolean z2, @C12579k List<DQEAddressModel> list) {
                Intrinsics.checkNotNullParameter(str, "address");
                Intrinsics.checkNotNullParameter(str2, "postcode");
                Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
                Intrinsics.checkNotNullParameter(str4, "country");
                Intrinsics.checkNotNullParameter(str5, "telephone");
                Intrinsics.checkNotNullParameter(list, "dqeAddressSuggestions");
                this.f33220b = str;
                this.f33221c = str2;
                this.f33222d = str3;
                this.f33223e = str4;
                this.f33224f = str5;
                this.f33225g = z;
                this.f33226h = z2;
                this.f33227i = list;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C13661b(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
                /*
                    r9 = this;
                    r0 = r18
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x000c
                    java.lang.String r1 = new java.lang.String
                    r1.<init>()
                    goto L_0x000d
                L_0x000c:
                    r1 = r10
                L_0x000d:
                    r2 = r0 & 2
                    if (r2 == 0) goto L_0x0017
                    java.lang.String r2 = new java.lang.String
                    r2.<init>()
                    goto L_0x0018
                L_0x0017:
                    r2 = r11
                L_0x0018:
                    r3 = r0 & 4
                    if (r3 == 0) goto L_0x0022
                    java.lang.String r3 = new java.lang.String
                    r3.<init>()
                    goto L_0x0023
                L_0x0022:
                    r3 = r12
                L_0x0023:
                    r4 = r0 & 8
                    if (r4 == 0) goto L_0x002d
                    java.lang.String r4 = new java.lang.String
                    r4.<init>()
                    goto L_0x002e
                L_0x002d:
                    r4 = r13
                L_0x002e:
                    r5 = r0 & 16
                    if (r5 == 0) goto L_0x0038
                    java.lang.String r5 = new java.lang.String
                    r5.<init>()
                    goto L_0x0039
                L_0x0038:
                    r5 = r14
                L_0x0039:
                    r6 = r0 & 32
                    r7 = 0
                    if (r6 == 0) goto L_0x0040
                    r6 = r7
                    goto L_0x0041
                L_0x0040:
                    r6 = r15
                L_0x0041:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0046
                    goto L_0x0048
                L_0x0046:
                    r7 = r16
                L_0x0048:
                    r0 = r0 & 128(0x80, float:1.794E-43)
                    if (r0 == 0) goto L_0x0051
                    java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                    goto L_0x0053
                L_0x0051:
                    r0 = r17
                L_0x0053:
                    r10 = r9
                    r11 = r1
                    r12 = r2
                    r13 = r3
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r0
                    r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a.C13658c.C13661b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$c */
        public static final class C13662c {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m58427a(@C12579k C13658c cVar) {
                return C28505u.C28509d.C28510a.m118428a(cVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d */
        public static final class C13663d implements C13659a {

            /* renamed from: p */
            public static final int f33228p = 8;
            @C12579k

            /* renamed from: b */
            public final String f33229b;
            @C12579k

            /* renamed from: c */
            public final String f33230c;
            @C12579k

            /* renamed from: d */
            public final String f33231d;
            @C12579k

            /* renamed from: e */
            public final String f33232e;
            @C12579k

            /* renamed from: f */
            public final String f33233f;
            @C12579k

            /* renamed from: g */
            public final String f33234g;
            @C12579k

            /* renamed from: h */
            public final String f33235h;
            @C12579k

            /* renamed from: i */
            public final String f33236i;
            @C12579k

            /* renamed from: j */
            public final String f33237j;

            /* renamed from: k */
            public final boolean f33238k;
            @C12579k

            /* renamed from: l */
            public final String f33239l;

            /* renamed from: m */
            public final boolean f33240m;

            /* renamed from: n */
            public final boolean f33241n;
            @C12579k

            /* renamed from: o */
            public final List<DQEAddressModel> f33242o;

            public C13663d() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, false, (List) null, 16383, (DefaultConstructorMarker) null);
            }

            /* renamed from: t */
            public static /* synthetic */ C13663d m58428t(C13663d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, boolean z3, List list, int i, Object obj) {
                C13663d dVar2 = dVar;
                int i2 = i;
                return dVar.mo32488s((i2 & 1) != 0 ? dVar2.f33229b : str, (i2 & 2) != 0 ? dVar2.f33230c : str2, (i2 & 4) != 0 ? dVar2.f33231d : str3, (i2 & 8) != 0 ? dVar2.f33232e : str4, (i2 & 16) != 0 ? dVar2.f33233f : str5, (i2 & 32) != 0 ? dVar2.f33234g : str6, (i2 & 64) != 0 ? dVar2.f33235h : str7, (i2 & 128) != 0 ? dVar2.f33236i : str8, (i2 & 256) != 0 ? dVar2.f33237j : str9, (i2 & 512) != 0 ? dVar2.f33238k : z, (i2 & 1024) != 0 ? dVar2.f33239l : str10, (i2 & 2048) != 0 ? dVar2.f33240m : z2, (i2 & 4096) != 0 ? dVar2.f33241n : z3, (i2 & 8192) != 0 ? dVar2.f33242o : list);
            }

            @C12579k
            /* renamed from: a */
            public List<DQEAddressModel> mo32451a() {
                return this.f33242o;
            }

            /* renamed from: b */
            public boolean mo32452b() {
                return C13659a.C13660a.m58411a(this);
            }

            @C12579k
            /* renamed from: c */
            public String mo32453c() {
                return this.f33233f;
            }

            /* renamed from: d */
            public boolean mo32454d() {
                return this.f33240m;
            }

            @C12579k
            /* renamed from: e */
            public final String mo32472e() {
                return this.f33229b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13663d)) {
                    return false;
                }
                C13663d dVar = (C13663d) obj;
                return Intrinsics.areEqual((Object) this.f33229b, (Object) dVar.f33229b) && Intrinsics.areEqual((Object) this.f33230c, (Object) dVar.f33230c) && Intrinsics.areEqual((Object) this.f33231d, (Object) dVar.f33231d) && Intrinsics.areEqual((Object) this.f33232e, (Object) dVar.f33232e) && Intrinsics.areEqual((Object) this.f33233f, (Object) dVar.f33233f) && Intrinsics.areEqual((Object) this.f33234g, (Object) dVar.f33234g) && Intrinsics.areEqual((Object) this.f33235h, (Object) dVar.f33235h) && Intrinsics.areEqual((Object) this.f33236i, (Object) dVar.f33236i) && Intrinsics.areEqual((Object) this.f33237j, (Object) dVar.f33237j) && this.f33238k == dVar.f33238k && Intrinsics.areEqual((Object) this.f33239l, (Object) dVar.f33239l) && this.f33240m == dVar.f33240m && this.f33241n == dVar.f33241n && Intrinsics.areEqual((Object) this.f33242o, (Object) dVar.f33242o);
            }

            /* renamed from: f */
            public final boolean mo32474f() {
                return this.f33238k;
            }

            @C12579k
            /* renamed from: g */
            public final String mo32475g() {
                return this.f33239l;
            }

            @C12579k
            public String getAddress() {
                return this.f33229b;
            }

            @C12579k
            public String getCity() {
                return this.f33231d;
            }

            @C12579k
            public String getCountry() {
                return this.f33232e;
            }

            @C12579k
            public String getPostcode() {
                return this.f33230c;
            }

            /* renamed from: h */
            public final boolean mo32476h() {
                return this.f33240m;
            }

            public int hashCode() {
                int hashCode = ((((((((((((((((this.f33229b.hashCode() * 31) + this.f33230c.hashCode()) * 31) + this.f33231d.hashCode()) * 31) + this.f33232e.hashCode()) * 31) + this.f33233f.hashCode()) * 31) + this.f33234g.hashCode()) * 31) + this.f33235h.hashCode()) * 31) + this.f33236i.hashCode()) * 31) + this.f33237j.hashCode()) * 31;
                boolean z = this.f33238k;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f33239l.hashCode()) * 31;
                boolean z3 = this.f33240m;
                if (z3) {
                    z3 = true;
                }
                int i = (hashCode2 + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f33241n;
                if (!z4) {
                    z2 = z4;
                }
                return ((i + (z2 ? 1 : 0)) * 31) + this.f33242o.hashCode();
            }

            /* renamed from: i */
            public final boolean mo32478i() {
                return this.f33241n;
            }

            public boolean isLoading() {
                return this.f33241n;
            }

            @C12579k
            /* renamed from: j */
            public final List<DQEAddressModel> mo32479j() {
                return this.f33242o;
            }

            @C12579k
            /* renamed from: k */
            public final String mo32480k() {
                return this.f33230c;
            }

            @C12579k
            /* renamed from: l */
            public final String mo32481l() {
                return this.f33231d;
            }

            @C12579k
            /* renamed from: m */
            public final String mo32482m() {
                return this.f33232e;
            }

            @C12579k
            /* renamed from: n */
            public final String mo32483n() {
                return this.f33233f;
            }

            @C12579k
            /* renamed from: o */
            public final String mo32484o() {
                return this.f33234g;
            }

            @C12579k
            /* renamed from: p */
            public final String mo32485p() {
                return this.f33235h;
            }

            @C12579k
            /* renamed from: q */
            public final String mo32486q() {
                return this.f33236i;
            }

            @C12579k
            /* renamed from: r */
            public final String mo32487r() {
                return this.f33237j;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13659a.C13660a.m58412b(this);
            }

            @C12579k
            /* renamed from: s */
            public final C13663d mo32488s(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, boolean z, @C12579k String str10, boolean z2, boolean z3, @C12579k List<DQEAddressModel> list) {
                String str11 = str;
                Intrinsics.checkNotNullParameter(str11, "address");
                String str12 = str2;
                Intrinsics.checkNotNullParameter(str12, "postcode");
                String str13 = str3;
                Intrinsics.checkNotNullParameter(str13, C9650g.f26444g);
                String str14 = str4;
                Intrinsics.checkNotNullParameter(str14, "country");
                String str15 = str5;
                Intrinsics.checkNotNullParameter(str15, "telephone");
                String str16 = str6;
                Intrinsics.checkNotNullParameter(str16, "building");
                String str17 = str7;
                Intrinsics.checkNotNullParameter(str17, "digitalCode");
                String str18 = str8;
                Intrinsics.checkNotNullParameter(str18, "interphone");
                String str19 = str9;
                Intrinsics.checkNotNullParameter(str19, "floor");
                String str20 = str10;
                Intrinsics.checkNotNullParameter(str20, "additionalInfo");
                List<DQEAddressModel> list2 = list;
                Intrinsics.checkNotNullParameter(list2, "dqeAddressSuggestions");
                return new C13663d(str11, str12, str13, str14, str15, str16, str17, str18, str19, z, str20, z2, z3, list2);
            }

            @C12579k
            public String toString() {
                String str = this.f33229b;
                String str2 = this.f33230c;
                String str3 = this.f33231d;
                String str4 = this.f33232e;
                String str5 = this.f33233f;
                String str6 = this.f33234g;
                String str7 = this.f33235h;
                String str8 = this.f33236i;
                String str9 = this.f33237j;
                boolean z = this.f33238k;
                String str10 = this.f33239l;
                boolean z2 = this.f33240m;
                boolean z3 = this.f33241n;
                List<DQEAddressModel> list = this.f33242o;
                return "DeliveryAddress(address=" + str + ", postcode=" + str2 + ", city=" + str3 + ", country=" + str4 + ", telephone=" + str5 + ", building=" + str6 + ", digitalCode=" + str7 + ", interphone=" + str8 + ", floor=" + str9 + ", lift=" + z + ", additionalInfo=" + str10 + ", isFromDQE=" + z2 + ", isLoading=" + z3 + ", dqeAddressSuggestions=" + list + ")";
            }

            @C12579k
            /* renamed from: u */
            public final String mo32490u() {
                return this.f33239l;
            }

            @C12579k
            /* renamed from: v */
            public final String mo32491v() {
                return this.f33234g;
            }

            @C12579k
            /* renamed from: w */
            public final String mo32492w() {
                return this.f33235h;
            }

            @C12579k
            /* renamed from: x */
            public final String mo32493x() {
                return this.f33237j;
            }

            @C12579k
            /* renamed from: y */
            public final String mo32494y() {
                return this.f33236i;
            }

            /* renamed from: z */
            public final boolean mo32495z() {
                return this.f33238k;
            }

            public C13663d(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, boolean z, @C12579k String str10, boolean z2, boolean z3, @C12579k List<DQEAddressModel> list) {
                Intrinsics.checkNotNullParameter(str, "address");
                Intrinsics.checkNotNullParameter(str2, "postcode");
                Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
                Intrinsics.checkNotNullParameter(str4, "country");
                Intrinsics.checkNotNullParameter(str5, "telephone");
                Intrinsics.checkNotNullParameter(str6, "building");
                Intrinsics.checkNotNullParameter(str7, "digitalCode");
                Intrinsics.checkNotNullParameter(str8, "interphone");
                Intrinsics.checkNotNullParameter(str9, "floor");
                Intrinsics.checkNotNullParameter(str10, "additionalInfo");
                Intrinsics.checkNotNullParameter(list, "dqeAddressSuggestions");
                this.f33229b = str;
                this.f33230c = str2;
                this.f33231d = str3;
                this.f33232e = str4;
                this.f33233f = str5;
                this.f33234g = str6;
                this.f33235h = str7;
                this.f33236i = str8;
                this.f33237j = str9;
                this.f33238k = z;
                this.f33239l = str10;
                this.f33240m = z2;
                this.f33241n = z3;
                this.f33242o = list;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C13663d(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, boolean r27, boolean r28, java.util.List r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
                /*
                    r15 = this;
                    r0 = r30
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x000c
                    java.lang.String r1 = new java.lang.String
                    r1.<init>()
                    goto L_0x000e
                L_0x000c:
                    r1 = r16
                L_0x000e:
                    r2 = r0 & 2
                    if (r2 == 0) goto L_0x0018
                    java.lang.String r2 = new java.lang.String
                    r2.<init>()
                    goto L_0x001a
                L_0x0018:
                    r2 = r17
                L_0x001a:
                    r3 = r0 & 4
                    if (r3 == 0) goto L_0x0024
                    java.lang.String r3 = new java.lang.String
                    r3.<init>()
                    goto L_0x0026
                L_0x0024:
                    r3 = r18
                L_0x0026:
                    r4 = r0 & 8
                    if (r4 == 0) goto L_0x0030
                    java.lang.String r4 = new java.lang.String
                    r4.<init>()
                    goto L_0x0032
                L_0x0030:
                    r4 = r19
                L_0x0032:
                    r5 = r0 & 16
                    if (r5 == 0) goto L_0x003c
                    java.lang.String r5 = new java.lang.String
                    r5.<init>()
                    goto L_0x003e
                L_0x003c:
                    r5 = r20
                L_0x003e:
                    r6 = r0 & 32
                    if (r6 == 0) goto L_0x0048
                    java.lang.String r6 = new java.lang.String
                    r6.<init>()
                    goto L_0x004a
                L_0x0048:
                    r6 = r21
                L_0x004a:
                    r7 = r0 & 64
                    if (r7 == 0) goto L_0x0054
                    java.lang.String r7 = new java.lang.String
                    r7.<init>()
                    goto L_0x0056
                L_0x0054:
                    r7 = r22
                L_0x0056:
                    r8 = r0 & 128(0x80, float:1.794E-43)
                    if (r8 == 0) goto L_0x0060
                    java.lang.String r8 = new java.lang.String
                    r8.<init>()
                    goto L_0x0062
                L_0x0060:
                    r8 = r23
                L_0x0062:
                    r9 = r0 & 256(0x100, float:3.59E-43)
                    if (r9 == 0) goto L_0x006c
                    java.lang.String r9 = new java.lang.String
                    r9.<init>()
                    goto L_0x006e
                L_0x006c:
                    r9 = r24
                L_0x006e:
                    r10 = r0 & 512(0x200, float:7.175E-43)
                    r11 = 0
                    if (r10 == 0) goto L_0x0075
                    r10 = r11
                    goto L_0x0077
                L_0x0075:
                    r10 = r25
                L_0x0077:
                    r12 = r0 & 1024(0x400, float:1.435E-42)
                    if (r12 == 0) goto L_0x0081
                    java.lang.String r12 = new java.lang.String
                    r12.<init>()
                    goto L_0x0083
                L_0x0081:
                    r12 = r26
                L_0x0083:
                    r13 = r0 & 2048(0x800, float:2.87E-42)
                    if (r13 == 0) goto L_0x0089
                    r13 = r11
                    goto L_0x008b
                L_0x0089:
                    r13 = r27
                L_0x008b:
                    r14 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r14 == 0) goto L_0x0090
                    goto L_0x0092
                L_0x0090:
                    r11 = r28
                L_0x0092:
                    r0 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r0 == 0) goto L_0x009b
                    java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                    goto L_0x009d
                L_0x009b:
                    r0 = r29
                L_0x009d:
                    r16 = r15
                    r17 = r1
                    r18 = r2
                    r19 = r3
                    r20 = r4
                    r21 = r5
                    r22 = r6
                    r23 = r7
                    r24 = r8
                    r25 = r9
                    r26 = r10
                    r27 = r12
                    r28 = r13
                    r29 = r11
                    r30 = r0
                    r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a.C13658c.C13663d.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$e */
        public static final class C13664e implements C13658c {
            @C12579k

            /* renamed from: b */
            public static final C13664e f33243b = new C13664e();

            /* renamed from: c */
            public static final int f33244c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13662c.m58427a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$e */
    public static final class C13672e implements C28505u.C28508c<C13658c, C13646a> {

        /* renamed from: a */
        public static final C13672e f33263a = new C13672e();

        @C12579k
        /* renamed from: b */
        public final C13658c mo32307a(@C12579k C13658c cVar, @C12579k C13646a aVar) {
            boolean z;
            boolean z2;
            C13658c cVar2 = cVar;
            C13646a aVar2 = aVar;
            Intrinsics.checkNotNullParameter(cVar2, "state");
            Intrinsics.checkNotNullParameter(aVar2, "partialState");
            if (aVar2 instanceof C13646a.C13648b) {
                if (cVar2 instanceof C13658c.C13661b) {
                    C13646a.C13648b bVar = (C13646a.C13648b) aVar2;
                    return C13658c.C13661b.m58413n((C13658c.C13661b) cVar2, bVar.mo32408h().mo31628j(), bVar.mo32408h().mo31634p(), bVar.mo32408h().mo31629k(), (String) null, (String) null, true, false, CollectionsKt__CollectionsKt.m40441E(), 88, (Object) null);
                } else if (!(cVar2 instanceof C13658c.C13663d)) {
                    return cVar2;
                } else {
                    C13646a.C13648b bVar2 = (C13646a.C13648b) aVar2;
                    return C13658c.C13663d.m58428t((C13658c.C13663d) cVar2, bVar2.mo32408h().mo31628j(), bVar2.mo32408h().mo31634p(), bVar2.mo32408h().mo31629k(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, true, false, CollectionsKt__CollectionsKt.m40441E(), 6136, (Object) null);
                }
            } else if (Intrinsics.areEqual((Object) aVar2, (Object) C13646a.C13647a.f33199b)) {
                if (cVar2 instanceof C13658c.C13661b) {
                    return C13658c.C13661b.m58413n((C13658c.C13661b) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, CollectionsKt__CollectionsKt.m40441E(), 127, (Object) null);
                }
                if (cVar2 instanceof C13658c.C13663d) {
                    return C13658c.C13663d.m58428t((C13658c.C13663d) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, false, CollectionsKt__CollectionsKt.m40441E(), C16476b.f40864p, (Object) null);
                }
                return cVar2;
            } else if (aVar2 instanceof C13646a.C13649c) {
                if (cVar2 instanceof C13658c.C13661b) {
                    return C13658c.C13661b.m58413n((C13658c.C13661b) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, ((C13646a.C13649c) aVar2).mo32414h(), 63, (Object) null);
                }
                if (cVar2 instanceof C13658c.C13663d) {
                    return C13658c.C13663d.m58428t((C13658c.C13663d) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, false, ((C13646a.C13649c) aVar2).mo32414h(), 4095, (Object) null);
                }
                return cVar2;
            } else if (aVar2 instanceof C13646a.C13651e) {
                if (cVar2 instanceof C13658c.C13661b) {
                    return C13658c.C13661b.m58413n((C13658c.C13661b) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, false, ((C13646a.C13651e) aVar2).isLoading(), (List) null, C14092c.f34557T, (Object) null);
                }
                if (cVar2 instanceof C13658c.C13663d) {
                    return C13658c.C13663d.m58428t((C13658c.C13663d) cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, ((C13646a.C13651e) aVar2).isLoading(), (List) null, 12287, (Object) null);
                }
                return cVar2;
            } else if (!(aVar2 instanceof C13646a.C13652f)) {
                throw new NoWhenBranchMatchedException();
            } else if (cVar2 instanceof C13658c.C13661b) {
                C13658c.C13661b bVar3 = (C13658c.C13661b) cVar2;
                C13646a.C13652f fVar = (C13646a.C13652f) aVar2;
                String B = fVar.mo32429i().mo116677B();
                String S = fVar.mo32429i().mo116694S();
                String I = fVar.mo32429i().mo116684I();
                String J = fVar.mo32429i().mo116685J();
                String c = fVar.mo32423c();
                if (!bVar3.mo32454d() || !C13645a.f33197a.mo32403c((C13658c.C13659a) cVar2, fVar.mo32429i())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                return C13658c.C13661b.m58413n(bVar3, B, S, I, J, c, z2, true, (List) null, 128, (Object) null);
            } else if (!(cVar2 instanceof C13658c.C13663d)) {
                return cVar2;
            } else {
                C13658c.C13663d dVar = (C13658c.C13663d) cVar2;
                C13646a.C13652f fVar2 = (C13646a.C13652f) aVar2;
                String B2 = fVar2.mo32429i().mo116677B();
                String S2 = fVar2.mo32429i().mo116694S();
                String I2 = fVar2.mo32429i().mo116684I();
                String J2 = fVar2.mo32429i().mo116685J();
                String c2 = fVar2.mo32423c();
                String G = fVar2.mo32429i().mo116682G();
                String K = fVar2.mo32429i().mo116686K();
                String N = fVar2.mo32429i().mo116689N();
                String L = fVar2.mo32429i().mo116687L();
                if (L == null) {
                    L = "";
                }
                String str = L;
                boolean Q = fVar2.mo32429i().mo116692Q();
                String M = fVar2.mo32429i().mo116688M();
                if (!dVar.mo32454d() || !C13645a.f33197a.mo32403c((C13658c.C13659a) cVar2, fVar2.mo32429i())) {
                    z = false;
                } else {
                    z = true;
                }
                return C13658c.C13663d.m58428t(dVar, B2, S2, I2, J2, c2, G, K, N, str, Q, M, z, true, (List) null, 8192, (Object) null);
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public final C28505u.C28508c<C13658c, C13646a> mo32402b() {
        return f33198b;
    }

    /* renamed from: c */
    public final boolean mo32403c(C13658c.C13659a aVar, Address address) {
        if (!Intrinsics.areEqual((Object) aVar.getAddress(), (Object) address.mo116677B()) || !Intrinsics.areEqual((Object) aVar.getPostcode(), (Object) address.mo116694S()) || !Intrinsics.areEqual((Object) aVar.getCity(), (Object) address.mo116684I())) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: d */
    public final Pair<Address, String> mo32404d(@C12579k C13658c cVar) {
        C13658c cVar2 = cVar;
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        if (cVar2 instanceof C13658c.C13661b) {
            C13658c.C13661b bVar = (C13658c.C13661b) cVar2;
            return C11078d1.m42659a(new Address(bVar.getCountry(), (String) null, (String) null, bVar.getCity(), bVar.getAddress(), bVar.getPostcode(), (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.BILLING, 0, true, 0.0d, 0.0d, (Boolean) null, (String) null, 1007558, (DefaultConstructorMarker) null), bVar.mo32453c());
        } else if (cVar2 instanceof C13658c.C13663d) {
            C13658c.C13663d dVar = (C13658c.C13663d) cVar2;
            return C11078d1.m42659a(new Address(dVar.getCountry(), (String) null, (String) null, dVar.getCity(), dVar.getAddress(), dVar.getPostcode(), dVar.mo32492w(), dVar.mo32494y(), dVar.mo32495z(), dVar.mo32491v(), dVar.mo32493x(), dVar.mo32490u(), (String) null, AddressCategory.DELIVERY, 0, true, 0.0d, 0.0d, (Boolean) null, (String) null, 1003526, (DefaultConstructorMarker) null), dVar.mo32453c());
        } else if (Intrinsics.areEqual((Object) cVar2, (Object) C13658c.C13664e.f33243b)) {
            throw new IllegalStateException("Current state address cannot be Empty at this stage.".toString());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d */
    public interface C13665d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$a */
        public static final class C13666a implements C13665d {
            @C12579k

            /* renamed from: a */
            public static final C13666a f33245a = new C13666a();

            /* renamed from: b */
            public static final int f33246b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$c */
        public static final class C13668c implements C13665d {

            /* renamed from: c */
            public static final int f33252c = 8;
            @C12579k

            /* renamed from: a */
            public final Address f33253a;
            @C12579k

            /* renamed from: b */
            public final String f33254b;

            public C13668c(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.f33253a = address;
                this.f33254b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C13668c m58464d(C13668c cVar, Address address, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = cVar.f33253a;
                }
                if ((i & 2) != 0) {
                    str = cVar.f33254b;
                }
                return cVar.mo32510c(address, str);
            }

            @C12579k
            /* renamed from: a */
            public final Address mo32508a() {
                return this.f33253a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32509b() {
                return this.f33254b;
            }

            @C12579k
            /* renamed from: c */
            public final C13668c mo32510c(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new C13668c(address, str);
            }

            @C12579k
            /* renamed from: e */
            public final Address mo32511e() {
                return this.f33253a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13668c)) {
                    return false;
                }
                C13668c cVar = (C13668c) obj;
                return Intrinsics.areEqual((Object) this.f33253a, (Object) cVar.f33253a) && Intrinsics.areEqual((Object) this.f33254b, (Object) cVar.f33254b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32513f() {
                return this.f33254b;
            }

            public int hashCode() {
                return (this.f33253a.hashCode() * 31) + this.f33254b.hashCode();
            }

            @C12579k
            public String toString() {
                Address address = this.f33253a;
                String str = this.f33254b;
                return "GetDQESuggestions(address=" + address + ", telephone=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$d */
        public static final class C13669d implements C13665d {

            /* renamed from: b */
            public static final int f33255b = 0;
            @C12579k

            /* renamed from: a */
            public final DQEAddressModel f33256a;

            public C13669d(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                this.f33256a = dQEAddressModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C13669d m58470c(C13669d dVar, DQEAddressModel dQEAddressModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    dQEAddressModel = dVar.f33256a;
                }
                return dVar.mo32517b(dQEAddressModel);
            }

            @C12579k
            /* renamed from: a */
            public final DQEAddressModel mo32516a() {
                return this.f33256a;
            }

            @C12579k
            /* renamed from: b */
            public final C13669d mo32517b(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                return new C13669d(dQEAddressModel);
            }

            @C12579k
            /* renamed from: d */
            public final DQEAddressModel mo32518d() {
                return this.f33256a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13669d) && Intrinsics.areEqual((Object) this.f33256a, (Object) ((C13669d) obj).f33256a);
            }

            public int hashCode() {
                return this.f33256a.hashCode();
            }

            @C12579k
            public String toString() {
                DQEAddressModel dQEAddressModel = this.f33256a;
                return "SelectDQEAddress(dqeAddressModel=" + dQEAddressModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$e */
        public static final class C13670e implements C13665d {
            @C12579k

            /* renamed from: a */
            public static final C13670e f33257a = new C13670e();

            /* renamed from: b */
            public static final int f33258b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$f */
        public static final class C13671f implements C13665d {

            /* renamed from: d */
            public static final int f33259d = 8;
            @C12579k

            /* renamed from: a */
            public final Address f33260a;
            @C12579k

            /* renamed from: b */
            public final String f33261b;

            /* renamed from: c */
            public final boolean f33262c;

            public C13671f(@C12579k Address address, @C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.f33260a = address;
                this.f33261b = str;
                this.f33262c = z;
            }

            /* renamed from: e */
            public static /* synthetic */ C13671f m58474e(C13671f fVar, Address address, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = fVar.f33260a;
                }
                if ((i & 2) != 0) {
                    str = fVar.f33261b;
                }
                if ((i & 4) != 0) {
                    z = fVar.f33262c;
                }
                return fVar.mo32525d(address, str, z);
            }

            @C12579k
            /* renamed from: a */
            public final Address mo32522a() {
                return this.f33260a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32523b() {
                return this.f33261b;
            }

            /* renamed from: c */
            public final boolean mo32524c() {
                return this.f33262c;
            }

            @C12579k
            /* renamed from: d */
            public final C13671f mo32525d(@C12579k Address address, @C12579k String str, boolean z) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new C13671f(address, str, z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13671f)) {
                    return false;
                }
                C13671f fVar = (C13671f) obj;
                return Intrinsics.areEqual((Object) this.f33260a, (Object) fVar.f33260a) && Intrinsics.areEqual((Object) this.f33261b, (Object) fVar.f33261b) && this.f33262c == fVar.f33262c;
            }

            @C12579k
            /* renamed from: f */
            public final Address mo32527f() {
                return this.f33260a;
            }

            /* renamed from: g */
            public final boolean mo32528g() {
                return this.f33262c;
            }

            @C12579k
            /* renamed from: h */
            public final String mo32529h() {
                return this.f33261b;
            }

            public int hashCode() {
                int hashCode = ((this.f33260a.hashCode() * 31) + this.f33261b.hashCode()) * 31;
                boolean z = this.f33262c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                Address address = this.f33260a;
                String str = this.f33261b;
                boolean z = this.f33262c;
                return "ValidateUserInput(address=" + address + ", telephone=" + str + ", autoSave=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$d$b */
        public static final class C13667b implements C13665d {

            /* renamed from: e */
            public static final int f33247e = 8;
            @C12580l

            /* renamed from: a */
            public final Address f33248a;
            @C12580l

            /* renamed from: b */
            public final Address f33249b;
            @C12579k

            /* renamed from: c */
            public final AddressCategory f33250c;
            @C12580l

            /* renamed from: d */
            public final String f33251d;

            public C13667b(@C12580l Address address, @C12580l Address address2, @C12579k AddressCategory addressCategory, @C12580l String str) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                this.f33248a = address;
                this.f33249b = address2;
                this.f33250c = addressCategory;
                this.f33251d = str;
            }

            /* renamed from: f */
            public static /* synthetic */ C13667b m58454f(C13667b bVar, Address address, Address address2, AddressCategory addressCategory, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = bVar.f33248a;
                }
                if ((i & 2) != 0) {
                    address2 = bVar.f33249b;
                }
                if ((i & 4) != 0) {
                    addressCategory = bVar.f33250c;
                }
                if ((i & 8) != 0) {
                    str = bVar.f33251d;
                }
                return bVar.mo32500e(address, address2, addressCategory, str);
            }

            @C12580l
            /* renamed from: a */
            public final Address mo32496a() {
                return this.f33248a;
            }

            @C12580l
            /* renamed from: b */
            public final Address mo32497b() {
                return this.f33249b;
            }

            @C12579k
            /* renamed from: c */
            public final AddressCategory mo32498c() {
                return this.f33250c;
            }

            @C12580l
            /* renamed from: d */
            public final String mo32499d() {
                return this.f33251d;
            }

            @C12579k
            /* renamed from: e */
            public final C13667b mo32500e(@C12580l Address address, @C12580l Address address2, @C12579k AddressCategory addressCategory, @C12580l String str) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                return new C13667b(address, address2, addressCategory, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13667b)) {
                    return false;
                }
                C13667b bVar = (C13667b) obj;
                return Intrinsics.areEqual((Object) this.f33248a, (Object) bVar.f33248a) && Intrinsics.areEqual((Object) this.f33249b, (Object) bVar.f33249b) && this.f33250c == bVar.f33250c && Intrinsics.areEqual((Object) this.f33251d, (Object) bVar.f33251d);
            }

            @C12580l
            /* renamed from: g */
            public final Address mo32502g() {
                return this.f33248a;
            }

            @C12579k
            /* renamed from: h */
            public final AddressCategory mo32503h() {
                return this.f33250c;
            }

            public int hashCode() {
                Address address = this.f33248a;
                int i = 0;
                int hashCode = (address == null ? 0 : address.hashCode()) * 31;
                Address address2 = this.f33249b;
                int hashCode2 = (((hashCode + (address2 == null ? 0 : address2.hashCode())) * 31) + this.f33250c.hashCode()) * 31;
                String str = this.f33251d;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode2 + i;
            }

            @C12580l
            /* renamed from: i */
            public final Address mo32505i() {
                return this.f33249b;
            }

            @C12580l
            /* renamed from: j */
            public final String mo32506j() {
                return this.f33251d;
            }

            @C12579k
            public String toString() {
                Address address = this.f33248a;
                Address address2 = this.f33249b;
                AddressCategory addressCategory = this.f33250c;
                String str = this.f33251d;
                return "DisplayAddress(billingAddress=" + address + ", deliveryAddress=" + address2 + ", category=" + addressCategory + ", phone=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13667b(Address address, Address address2, AddressCategory addressCategory, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : address2, addressCategory, (i & 8) != 0 ? null : str);
            }
        }
    }
}
