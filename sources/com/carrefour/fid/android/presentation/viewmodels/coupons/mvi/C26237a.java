package com.carrefour.fid.android.presentation.viewmodels.coupons.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a */
public final class C26237a {
    @C12579k

    /* renamed from: a */
    public static final C26237a f64163a = new C26237a();

    /* renamed from: b */
    public static final int f64164b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$a */
    public interface C26238a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$a$a */
        public static final class C26239a implements C26238a {

            /* renamed from: b */
            public static final int f64165b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64166a;

            public C26239a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "date");
                this.f64166a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26239a m112133c(C26239a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f64166a;
                }
                return aVar.mo76302b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76301a() {
                return this.f64166a;
            }

            @C12579k
            /* renamed from: b */
            public final C26239a mo76302b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "date");
                return new C26239a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76303d() {
                return this.f64166a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26239a) && Intrinsics.areEqual((Object) this.f64166a, (Object) ((C26239a) obj).f64166a);
            }

            public int hashCode() {
                return this.f64166a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64166a;
                return "CouponsActivationStartsOn(date=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$a$b */
        public static final class C26240b implements C26238a {

            /* renamed from: b */
            public static final int f64167b = 0;

            /* renamed from: a */
            public final boolean f64168a;

            public C26240b(boolean z) {
                this.f64168a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26240b m112137c(C26240b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f64168a;
                }
                return bVar.mo76308b(z);
            }

            /* renamed from: a */
            public final boolean mo76307a() {
                return this.f64168a;
            }

            @C12579k
            /* renamed from: b */
            public final C26240b mo76308b(boolean z) {
                return new C26240b(z);
            }

            /* renamed from: d */
            public final boolean mo76309d() {
                return this.f64168a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26240b) && this.f64168a == ((C26240b) obj).f64168a;
            }

            public int hashCode() {
                boolean z = this.f64168a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64168a;
                return "CouponsEditionError(isActivation=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$a$c */
        public static final class C26241c implements C26238a {
            @C12579k

            /* renamed from: a */
            public static final C26241c f64169a = new C26241c();

            /* renamed from: b */
            public static final int f64170b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$b */
    public interface C26242b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$b$a */
        public static final class C26243a implements C26242b {
            @C12579k

            /* renamed from: a */
            public static final C26243a f64171a = new C26243a();

            /* renamed from: b */
            public static final int f64172b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$b$b */
        public static final class C26244b implements C26242b {

            /* renamed from: b */
            public static final int f64173b = 8;
            @C12579k

            /* renamed from: a */
            public final C26238a f64174a;

            public C26244b(@C12579k C26238a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                this.f64174a = aVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C26244b m112141c(C26244b bVar, C26238a aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = bVar.f64174a;
                }
                return bVar.mo76314b(aVar);
            }

            @C12579k
            /* renamed from: a */
            public final C26238a mo76313a() {
                return this.f64174a;
            }

            @C12579k
            /* renamed from: b */
            public final C26244b mo76314b(@C12579k C26238a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                return new C26244b(aVar);
            }

            @C12579k
            /* renamed from: d */
            public final C26238a mo76315d() {
                return this.f64174a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26244b) && Intrinsics.areEqual((Object) this.f64174a, (Object) ((C26244b) obj).f64174a);
            }

            public int hashCode() {
                return this.f64174a.hashCode();
            }

            @C12579k
            public String toString() {
                C26238a aVar = this.f64174a;
                return "Error(error=" + aVar + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$c */
    public static final class C26245c implements C28505u.C28509d {

        /* renamed from: e */
        public static final int f64175e = 8;

        /* renamed from: b */
        public final boolean f64176b;
        @C12580l

        /* renamed from: c */
        public final CouponModel f64177c;
        @C12580l

        /* renamed from: d */
        public final Integer f64178d;

        public C26245c() {
            this(false, (CouponModel) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: i */
        public static /* synthetic */ C26245c m112145i(C26245c cVar, boolean z, CouponModel couponModel, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f64176b;
            }
            if ((i & 2) != 0) {
                couponModel = cVar.f64177c;
            }
            if ((i & 4) != 0) {
                num = cVar.f64178d;
            }
            return cVar.mo76323h(z, couponModel, num);
        }

        /* renamed from: e */
        public final boolean mo76319e() {
            return this.f64176b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26245c)) {
                return false;
            }
            C26245c cVar = (C26245c) obj;
            return this.f64176b == cVar.f64176b && Intrinsics.areEqual((Object) this.f64177c, (Object) cVar.f64177c) && Intrinsics.areEqual((Object) this.f64178d, (Object) cVar.f64178d);
        }

        @C12580l
        /* renamed from: f */
        public final CouponModel mo76321f() {
            return this.f64177c;
        }

        @C12580l
        /* renamed from: g */
        public final Integer mo76322g() {
            return this.f64178d;
        }

        @C12579k
        /* renamed from: h */
        public final C26245c mo76323h(boolean z, @C12580l CouponModel couponModel, @C12580l Integer num) {
            return new C26245c(z, couponModel, num);
        }

        public int hashCode() {
            boolean z = this.f64176b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            CouponModel couponModel = this.f64177c;
            int i2 = 0;
            int hashCode = (i + (couponModel == null ? 0 : couponModel.hashCode())) * 31;
            Integer num = this.f64178d;
            if (num != null) {
                i2 = num.hashCode();
            }
            return hashCode + i2;
        }

        public final boolean isLoading() {
            return this.f64176b;
        }

        @C12580l
        /* renamed from: j */
        public final CouponModel mo76326j() {
            return this.f64177c;
        }

        @C12580l
        /* renamed from: k */
        public final Integer mo76327k() {
            return this.f64178d;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f64176b;
            CouponModel couponModel = this.f64177c;
            Integer num = this.f64178d;
            return "UiState(isLoading=" + z + ", coupon=" + couponModel + ", selectedCount=" + num + ")";
        }

        public C26245c(boolean z, @C12580l CouponModel couponModel, @C12580l Integer num) {
            this.f64176b = z;
            this.f64177c = couponModel;
            this.f64178d = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26245c(boolean z, CouponModel couponModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : couponModel, (i & 4) != 0 ? 0 : num);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$d */
    public static abstract class C26246d implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f64179a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$d$a */
        public static final class C26247a extends C26246d {

            /* renamed from: c */
            public static final int f64180c = 0;

            /* renamed from: b */
            public final boolean f64181b;

            public C26247a(boolean z) {
                super((DefaultConstructorMarker) null);
                this.f64181b = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26247a m112152c(C26247a aVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f64181b;
                }
                return aVar.mo76330b(z);
            }

            /* renamed from: a */
            public final boolean mo76329a() {
                return this.f64181b;
            }

            @C12579k
            /* renamed from: b */
            public final C26247a mo76330b(boolean z) {
                return new C26247a(z);
            }

            /* renamed from: d */
            public final boolean mo76331d() {
                return this.f64181b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26247a) && this.f64181b == ((C26247a) obj).f64181b;
            }

            public int hashCode() {
                boolean z = this.f64181b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64181b;
                return "EditCouponStatus(isAddingAction=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.a$d$b */
        public static final class C26248b extends C26246d {
            @C12579k

            /* renamed from: b */
            public static final C26248b f64182b = new C26248b();

            /* renamed from: c */
            public static final int f64183c = 0;

            public C26248b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C26246d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26246d() {
        }
    }
}
