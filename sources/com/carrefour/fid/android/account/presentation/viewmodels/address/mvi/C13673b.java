package com.carrefour.fid.android.account.presentation.viewmodels.address.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b */
public final class C13673b {
    @C12579k

    /* renamed from: a */
    public static final C13673b f33264a = new C13673b();

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a */
    public interface C13674a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$a */
        public static final class C13675a implements C13674a {
            @C12579k

            /* renamed from: a */
            public static final C13675a f33265a = new C13675a();

            /* renamed from: b */
            public static final int f33266b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b */
        public static final class C13676b implements C13674a {

            /* renamed from: b */
            public static final int f33267b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f33268a;

            public C13676b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f33268a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13676b m58485c(C13676b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f33268a;
                }
                return bVar.mo32535b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo32534a() {
                return this.f33268a;
            }

            @C12579k
            /* renamed from: b */
            public final C13676b mo32535b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C13676b(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo32536d() {
                return this.f33268a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13676b) && Intrinsics.areEqual((Object) this.f33268a, (Object) ((C13676b) obj).f33268a);
            }

            public int hashCode() {
                return this.f33268a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33268a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$c */
        public static final class C13677c implements C13674a {
            @C12579k

            /* renamed from: a */
            public static final C13677c f33269a = new C13677c();

            /* renamed from: b */
            public static final int f33270b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b */
    public static final class C13678b implements C28505u.C28509d {

        /* renamed from: g */
        public static final int f33271g = 8;
        @C12580l

        /* renamed from: b */
        public final Address f33272b;
        @C12580l

        /* renamed from: c */
        public final String f33273c;
        @C12579k

        /* renamed from: d */
        public final List<DQEAddressModel> f33274d;
        @C12580l

        /* renamed from: e */
        public final C13683d f33275e;

        /* renamed from: f */
        public final boolean f33276f;

        public C13678b() {
            this((Address) null, (String) null, (List) null, (C13683d) null, false, 31, (DefaultConstructorMarker) null);
        }

        /* renamed from: k */
        public static /* synthetic */ C13678b m58489k(C13678b bVar, Address address, String str, List<DQEAddressModel> list, C13683d dVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                address = bVar.f33272b;
            }
            if ((i & 2) != 0) {
                str = bVar.f33273c;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                list = bVar.f33274d;
            }
            List<DQEAddressModel> list2 = list;
            if ((i & 8) != 0) {
                dVar = bVar.f33275e;
            }
            C13683d dVar2 = dVar;
            if ((i & 16) != 0) {
                z = bVar.f33276f;
            }
            return bVar.mo32550j(address, str2, list2, dVar2, z);
        }

        @C12579k
        /* renamed from: a */
        public final List<DQEAddressModel> mo32540a() {
            return this.f33274d;
        }

        @C12580l
        /* renamed from: c */
        public final String mo32541c() {
            return this.f33273c;
        }

        @C12580l
        /* renamed from: e */
        public final Address mo32542e() {
            return this.f33272b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13678b)) {
                return false;
            }
            C13678b bVar = (C13678b) obj;
            return Intrinsics.areEqual((Object) this.f33272b, (Object) bVar.f33272b) && Intrinsics.areEqual((Object) this.f33273c, (Object) bVar.f33273c) && Intrinsics.areEqual((Object) this.f33274d, (Object) bVar.f33274d) && Intrinsics.areEqual((Object) this.f33275e, (Object) bVar.f33275e) && this.f33276f == bVar.f33276f;
        }

        @C12580l
        /* renamed from: f */
        public final String mo32544f() {
            return this.f33273c;
        }

        @C12579k
        /* renamed from: g */
        public final List<DQEAddressModel> mo32545g() {
            return this.f33274d;
        }

        @C12580l
        /* renamed from: h */
        public final C13683d mo32546h() {
            return this.f33275e;
        }

        public int hashCode() {
            Address address = this.f33272b;
            int i = 0;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.f33273c;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33274d.hashCode()) * 31;
            C13683d dVar = this.f33275e;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f33276f;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo32548i() {
            return this.f33276f;
        }

        public final boolean isLoading() {
            return this.f33276f;
        }

        @C12579k
        /* renamed from: j */
        public final C13678b mo32550j(@C12580l Address address, @C12580l String str, @C12579k List<DQEAddressModel> list, @C12580l C13683d dVar, boolean z) {
            Intrinsics.checkNotNullParameter(list, "dqeAddressSuggestions");
            return new C13678b(address, str, list, dVar, z);
        }

        @C12580l
        /* renamed from: l */
        public final Address mo32551l() {
            return this.f33272b;
        }

        @C12580l
        /* renamed from: m */
        public final C13683d mo32552m() {
            return this.f33275e;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            Address address = this.f33272b;
            String str = this.f33273c;
            List<DQEAddressModel> list = this.f33274d;
            C13683d dVar = this.f33275e;
            boolean z = this.f33276f;
            return "UiState(addressModel=" + address + ", telephone=" + str + ", dqeAddressSuggestions=" + list + ", choice=" + dVar + ", isLoading=" + z + ")";
        }

        public C13678b(@C12580l Address address, @C12580l String str, @C12579k List<DQEAddressModel> list, @C12580l C13683d dVar, boolean z) {
            Intrinsics.checkNotNullParameter(list, "dqeAddressSuggestions");
            this.f33272b = address;
            this.f33273c = str;
            this.f33274d = list;
            this.f33275e = dVar;
            this.f33276f = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13678b(com.carrefour.fid.android.domain.models.account.Address r4, java.lang.String r5, java.util.List r6, com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13683d r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                r0 = 0
                if (r10 == 0) goto L_0x0007
                r10 = r0
                goto L_0x0008
            L_0x0007:
                r10 = r4
            L_0x0008:
                r4 = r9 & 2
                if (r4 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r5
            L_0x000f:
                r4 = r9 & 4
                if (r4 == 0) goto L_0x0017
                java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            L_0x0017:
                r2 = r6
                r4 = r9 & 8
                if (r4 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r0 = r7
            L_0x001e:
                r4 = r9 & 16
                if (r4 == 0) goto L_0x0023
                r8 = 0
            L_0x0023:
                r9 = r8
                r4 = r3
                r5 = r10
                r6 = r1
                r7 = r2
                r8 = r0
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.<init>(com.carrefour.fid.android.domain.models.account.Address, java.lang.String, java.util.List, com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$c */
    public interface C13679c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$c$a */
        public static final class C13680a implements C13679c {

            /* renamed from: b */
            public static final int f33277b = 0;

            /* renamed from: a */
            public final boolean f33278a;

            public C13680a(boolean z) {
                this.f33278a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C13680a m58500c(C13680a aVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f33278a;
                }
                return aVar.mo32555b(z);
            }

            /* renamed from: a */
            public final boolean mo32554a() {
                return this.f33278a;
            }

            @C12579k
            /* renamed from: b */
            public final C13680a mo32555b(boolean z) {
                return new C13680a(z);
            }

            /* renamed from: d */
            public final boolean mo32556d() {
                return this.f33278a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13680a) && this.f33278a == ((C13680a) obj).f33278a;
            }

            public int hashCode() {
                boolean z = this.f33278a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f33278a;
                return "Save(autoSave=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$c$b */
        public static final class C13681b implements C13679c {

            /* renamed from: c */
            public static final int f33279c = 8;
            @C12579k

            /* renamed from: a */
            public final Address f33280a;
            @C12579k

            /* renamed from: b */
            public final String f33281b;

            public C13681b(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "addressModel");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.f33280a = address;
                this.f33281b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C13681b m58504d(C13681b bVar, Address address, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = bVar.f33280a;
                }
                if ((i & 2) != 0) {
                    str = bVar.f33281b;
                }
                return bVar.mo32562c(address, str);
            }

            @C12579k
            /* renamed from: a */
            public final Address mo32560a() {
                return this.f33280a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32561b() {
                return this.f33281b;
            }

            @C12579k
            /* renamed from: c */
            public final C13681b mo32562c(@C12579k Address address, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address, "addressModel");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new C13681b(address, str);
            }

            @C12579k
            /* renamed from: e */
            public final Address mo32563e() {
                return this.f33280a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13681b)) {
                    return false;
                }
                C13681b bVar = (C13681b) obj;
                return Intrinsics.areEqual((Object) this.f33280a, (Object) bVar.f33280a) && Intrinsics.areEqual((Object) this.f33281b, (Object) bVar.f33281b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32565f() {
                return this.f33281b;
            }

            public int hashCode() {
                return (this.f33280a.hashCode() * 31) + this.f33281b.hashCode();
            }

            @C12579k
            public String toString() {
                Address address = this.f33280a;
                String str = this.f33281b;
                return "SetUserInput(addressModel=" + address + ", telephone=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$c$c */
        public static final class C13682c implements C13679c {

            /* renamed from: b */
            public static final int f33282b = 8;
            @C12579k

            /* renamed from: a */
            public final C13683d f33283a;

            public C13682c(@C12579k C13683d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "choice");
                this.f33283a = dVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C13682c m58510c(C13682c cVar, C13683d dVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    dVar = cVar.f33283a;
                }
                return cVar.mo32569b(dVar);
            }

            @C12579k
            /* renamed from: a */
            public final C13683d mo32568a() {
                return this.f33283a;
            }

            @C12579k
            /* renamed from: b */
            public final C13682c mo32569b(@C12579k C13683d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "choice");
                return new C13682c(dVar);
            }

            @C12579k
            /* renamed from: d */
            public final C13683d mo32570d() {
                return this.f33283a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13682c) && Intrinsics.areEqual((Object) this.f33283a, (Object) ((C13682c) obj).f33283a);
            }

            public int hashCode() {
                return this.f33283a.hashCode();
            }

            @C12579k
            public String toString() {
                C13683d dVar = this.f33283a;
                return "UpdateChoice(choice=" + dVar + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d */
    public interface C13683d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$a */
        public static final class C13684a implements C13683d {
            @C12579k

            /* renamed from: a */
            public static final C13684a f33284a = new C13684a();

            /* renamed from: b */
            public static final int f33285b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$b */
        public static final class C13685b implements C13683d {
            @C12579k

            /* renamed from: a */
            public static final C13685b f33286a = new C13685b();

            /* renamed from: b */
            public static final int f33287b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$c */
        public static final class C13686c implements C13683d {

            /* renamed from: b */
            public static final int f33288b = 0;
            @C12579k

            /* renamed from: a */
            public final DQEAddressModel f33289a;

            public C13686c(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                this.f33289a = dQEAddressModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C13686c m58514c(C13686c cVar, DQEAddressModel dQEAddressModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    dQEAddressModel = cVar.f33289a;
                }
                return cVar.mo32575b(dQEAddressModel);
            }

            @C12579k
            /* renamed from: a */
            public final DQEAddressModel mo32574a() {
                return this.f33289a;
            }

            @C12579k
            /* renamed from: b */
            public final C13686c mo32575b(@C12579k DQEAddressModel dQEAddressModel) {
                Intrinsics.checkNotNullParameter(dQEAddressModel, "dqeAddressModel");
                return new C13686c(dQEAddressModel);
            }

            @C12579k
            /* renamed from: d */
            public final DQEAddressModel mo32576d() {
                return this.f33289a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13686c) && Intrinsics.areEqual((Object) this.f33289a, (Object) ((C13686c) obj).f33289a);
            }

            public int hashCode() {
                return this.f33289a.hashCode();
            }

            @C12579k
            public String toString() {
                DQEAddressModel dQEAddressModel = this.f33289a;
                return "SelectDQEAddress(dqeAddressModel=" + dQEAddressModel + ")";
            }
        }
    }

    @C12579k
    /* renamed from: a */
    public final String mo32533a(@C12579k C13678b bVar) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Address l = bVar.mo32551l();
        String str3 = null;
        if (l != null) {
            str = l.mo116677B();
        } else {
            str = null;
        }
        Address l2 = bVar.mo32551l();
        if (l2 != null) {
            str2 = l2.mo116694S();
        } else {
            str2 = null;
        }
        Address l3 = bVar.mo32551l();
        if (l3 != null) {
            str3 = l3.mo116684I();
        }
        return str + "\n" + str2 + " " + str3;
    }
}
