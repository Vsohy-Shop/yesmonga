package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.shared.constant.C28554j1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a */
public interface C26122a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$a */
    public static final class C26123a implements C26122a {

        /* renamed from: b */
        public static final int f63863b = 0;
        @C12579k

        /* renamed from: a */
        public final String f63864a;

        public C26123a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            this.f63864a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C26123a m111684c(C26123a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f63864a;
            }
            return aVar.mo75881b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo75880a() {
            return this.f63864a;
        }

        @C12579k
        /* renamed from: b */
        public final C26123a mo75881b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            return new C26123a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo75882d() {
            return this.f63864a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26123a) && Intrinsics.areEqual((Object) this.f63864a, (Object) ((C26123a) obj).f63864a);
        }

        public int hashCode() {
            return this.f63864a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f63864a;
            return "CheckFidCode(fidCardNumber=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$b */
    public static final class C26124b implements C26122a {

        /* renamed from: b */
        public static final int f63865b = 0;
        @C12579k

        /* renamed from: a */
        public final String f63866a;

        public C26124b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            this.f63866a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C26124b m111688c(C26124b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f63866a;
            }
            return bVar.mo75887b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo75886a() {
            return this.f63866a;
        }

        @C12579k
        /* renamed from: b */
        public final C26124b mo75887b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            return new C26124b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo75888d() {
            return this.f63866a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26124b) && Intrinsics.areEqual((Object) this.f63866a, (Object) ((C26124b) obj).f63866a);
        }

        public int hashCode() {
            return this.f63866a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f63866a;
            return "FidCardBlocked(fidCardNumber=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$c */
    public static final class C26125c implements C26122a {
        @C12579k

        /* renamed from: a */
        public static final C26125c f63867a = new C26125c();

        /* renamed from: b */
        public static final int f63868b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$d */
    public static final class C26126d implements C26122a {

        /* renamed from: c */
        public static final int f63869c = 0;
        @C12579k

        /* renamed from: a */
        public final PaymentConfirmationModel f63870a;
        @C12579k

        /* renamed from: b */
        public final String f63871b;

        public C26126d(@C12579k PaymentConfirmationModel paymentConfirmationModel, @C12579k String str) {
            Intrinsics.checkNotNullParameter(paymentConfirmationModel, C28554j1.f69432K);
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f63870a = paymentConfirmationModel;
            this.f63871b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C26126d m111692d(C26126d dVar, PaymentConfirmationModel paymentConfirmationModel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentConfirmationModel = dVar.f63870a;
            }
            if ((i & 2) != 0) {
                str = dVar.f63871b;
            }
            return dVar.mo75894c(paymentConfirmationModel, str);
        }

        @C12579k
        /* renamed from: a */
        public final PaymentConfirmationModel mo75892a() {
            return this.f63870a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo75893b() {
            return this.f63871b;
        }

        @C12579k
        /* renamed from: c */
        public final C26126d mo75894c(@C12579k PaymentConfirmationModel paymentConfirmationModel, @C12579k String str) {
            Intrinsics.checkNotNullParameter(paymentConfirmationModel, C28554j1.f69432K);
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C26126d(paymentConfirmationModel, str);
        }

        @C12579k
        /* renamed from: e */
        public final PaymentConfirmationModel mo75895e() {
            return this.f63870a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26126d)) {
                return false;
            }
            C26126d dVar = (C26126d) obj;
            return Intrinsics.areEqual((Object) this.f63870a, (Object) dVar.f63870a) && Intrinsics.areEqual((Object) this.f63871b, (Object) dVar.f63871b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo75897f() {
            return this.f63871b;
        }

        public int hashCode() {
            return (this.f63870a.hashCode() * 31) + this.f63871b.hashCode();
        }

        @C12579k
        public String toString() {
            PaymentConfirmationModel paymentConfirmationModel = this.f63870a;
            String str = this.f63871b;
            return "PaymentConfirmed(confirmation=" + paymentConfirmationModel + ", subBasketId=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$e */
    public static final class C26127e implements C26122a {
        @C12579k

        /* renamed from: a */
        public static final C26127e f63872a = new C26127e();

        /* renamed from: b */
        public static final int f63873b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$f */
    public static final class C26128f implements C26122a {
        @C12579k

        /* renamed from: a */
        public static final C26128f f63874a = new C26128f();

        /* renamed from: b */
        public static final int f63875b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$g */
    public static final class C26129g implements C26122a {
        @C12579k

        /* renamed from: a */
        public static final C26129g f63876a = new C26129g();

        /* renamed from: b */
        public static final int f63877b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$h */
    public static final class C26130h implements C26122a {

        /* renamed from: b */
        public static final int f63878b = 0;
        @C12579k

        /* renamed from: a */
        public final String f63879a;

        public C26130h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            this.f63879a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C26130h m111698c(C26130h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f63879a;
            }
            return hVar.mo75901b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo75900a() {
            return this.f63879a;
        }

        @C12579k
        /* renamed from: b */
        public final C26130h mo75901b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            return new C26130h(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo75902d() {
            return this.f63879a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26130h) && Intrinsics.areEqual((Object) this.f63879a, (Object) ((C26130h) obj).f63879a);
        }

        public int hashCode() {
            return this.f63879a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f63879a;
            return "ResetFidCode(fidCardNumber=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.event.a$i */
    public static final class C26131i implements C26122a {
        @C12579k

        /* renamed from: a */
        public static final C26131i f63880a = new C26131i();

        /* renamed from: b */
        public static final int f63881b = 0;
    }
}
