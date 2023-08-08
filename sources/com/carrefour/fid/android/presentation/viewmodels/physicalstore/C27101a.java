package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a */
public interface C27101a {

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a */
    public interface C27102a extends C27101a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$a */
        public static final class C27103a implements C27102a {
            @C12579k

            /* renamed from: a */
            public static final C27103a f65920a = new C27103a();

            /* renamed from: b */
            public static final int f65921b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$b */
        public static final class C27104b implements C27102a {
            @C12579k

            /* renamed from: a */
            public static final C27104b f65922a = new C27104b();

            /* renamed from: b */
            public static final int f65923b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$c */
        public static final class C27105c implements C27102a {
            @C12579k

            /* renamed from: a */
            public static final C27105c f65924a = new C27105c();

            /* renamed from: b */
            public static final int f65925b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$d */
        public static final class C27106d implements C27102a {

            /* renamed from: b */
            public static final int f65926b = 0;

            /* renamed from: a */
            public final int f65927a;

            public C27106d(int i) {
                this.f65927a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C27106d m114614c(C27106d dVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = dVar.f65927a;
                }
                return dVar.mo78818b(i);
            }

            /* renamed from: a */
            public final int mo78817a() {
                return this.f65927a;
            }

            @C12579k
            /* renamed from: b */
            public final C27106d mo78818b(int i) {
                return new C27106d(i);
            }

            /* renamed from: d */
            public final int mo78819d() {
                return this.f65927a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27106d) && this.f65927a == ((C27106d) obj).f65927a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65927a);
            }

            @C12579k
            public String toString() {
                int i = this.f65927a;
                return "OnLoyaltyBalanceClicked(balanceInCents=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$e */
        public static final class C27107e implements C27102a {

            /* renamed from: c */
            public static final int f65928c = 0;
            @C12579k

            /* renamed from: a */
            public final String f65929a;
            @C12579k

            /* renamed from: b */
            public final String f65930b;

            public C27107e(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "stickersTitle");
                Intrinsics.checkNotNullParameter(str2, "stickersUrl");
                this.f65929a = str;
                this.f65930b = str2;
            }

            /* renamed from: d */
            public static /* synthetic */ C27107e m114618d(C27107e eVar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eVar.f65929a;
                }
                if ((i & 2) != 0) {
                    str2 = eVar.f65930b;
                }
                return eVar.mo78825c(str, str2);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78823a() {
                return this.f65929a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo78824b() {
                return this.f65930b;
            }

            @C12579k
            /* renamed from: c */
            public final C27107e mo78825c(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "stickersTitle");
                Intrinsics.checkNotNullParameter(str2, "stickersUrl");
                return new C27107e(str, str2);
            }

            @C12579k
            /* renamed from: e */
            public final String mo78826e() {
                return this.f65929a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27107e)) {
                    return false;
                }
                C27107e eVar = (C27107e) obj;
                return Intrinsics.areEqual((Object) this.f65929a, (Object) eVar.f65929a) && Intrinsics.areEqual((Object) this.f65930b, (Object) eVar.f65930b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo78828f() {
                return this.f65930b;
            }

            public int hashCode() {
                return (this.f65929a.hashCode() * 31) + this.f65930b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65929a;
                String str2 = this.f65930b;
                return "OnMyStickersClicked(stickersTitle=" + str + ", stickersUrl=" + str2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$f */
        public static final class C27108f implements C27102a {
            @C12579k

            /* renamed from: a */
            public static final C27108f f65931a = new C27108f();

            /* renamed from: b */
            public static final int f65932b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$a$g */
        public static final class C27109g implements C27102a {
            @C12579k

            /* renamed from: a */
            public static final C27109g f65933a = new C27109g();

            /* renamed from: b */
            public static final int f65934b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$b */
    public static final class C27110b implements C27101a {
        @C12579k

        /* renamed from: a */
        public static final C27110b f65935a = new C27110b();

        /* renamed from: b */
        public static final int f65936b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$c */
    public static final class C27111c implements C27101a {
        @C12579k

        /* renamed from: a */
        public static final C27111c f65937a = new C27111c();

        /* renamed from: b */
        public static final int f65938b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$d */
    public static final class C27112d implements C27101a {
        @C12579k

        /* renamed from: a */
        public static final C27112d f65939a = new C27112d();

        /* renamed from: b */
        public static final int f65940b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$e */
    public static final class C27113e implements C27101a {
        @C12579k

        /* renamed from: a */
        public static final C27113e f65941a = new C27113e();

        /* renamed from: b */
        public static final int f65942b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.a$f */
    public static final class C27114f implements C27101a {
        @C12579k

        /* renamed from: a */
        public static final C27114f f65943a = new C27114f();

        /* renamed from: b */
        public static final int f65944b = 0;
    }
}
