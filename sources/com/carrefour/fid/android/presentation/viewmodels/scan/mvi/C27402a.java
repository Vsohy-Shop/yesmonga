package com.carrefour.fid.android.presentation.viewmodels.scan.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a */
public final class C27402a {
    @C12579k

    /* renamed from: a */
    public static final C27402a f66482a = new C27402a();

    /* renamed from: b */
    public static final int f66483b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a */
    public interface C27403a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$a */
        public static final class C27404a implements C27403a {

            /* renamed from: b */
            public static final int f66484b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f66485a;

            public C27404a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f66485a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C27404a m115421c(C27404a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f66485a;
                }
                return aVar.mo79700b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo79699a() {
                return this.f66485a;
            }

            @C12579k
            /* renamed from: b */
            public final C27404a mo79700b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C27404a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo79701d() {
                return this.f66485a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27404a) && Intrinsics.areEqual((Object) this.f66485a, (Object) ((C27404a) obj).f66485a);
            }

            public int hashCode() {
                return this.f66485a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f66485a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$b */
        public static final class C27405b implements C27403a {

            /* renamed from: c */
            public static final int f66486c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66487a;

            /* renamed from: b */
            public final boolean f66488b;

            public C27405b(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66487a = offerProductModel;
                this.f66488b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27405b m115425d(C27405b bVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66487a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f66488b;
                }
                return bVar.mo79707c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79705a() {
                return this.f66487a;
            }

            /* renamed from: b */
            public final boolean mo79706b() {
                return this.f66488b;
            }

            @C12579k
            /* renamed from: c */
            public final C27405b mo79707c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27405b(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo79708e() {
                return this.f66488b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27405b)) {
                    return false;
                }
                C27405b bVar = (C27405b) obj;
                return Intrinsics.areEqual((Object) this.f66487a, (Object) bVar.f66487a) && this.f66488b == bVar.f66488b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79710f() {
                return this.f66487a;
            }

            public int hashCode() {
                int hashCode = this.f66487a.hashCode() * 31;
                boolean z = this.f66488b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66487a;
                boolean z = this.f66488b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$a$c */
        public static final class C27406c implements C27403a {

            /* renamed from: b */
            public static final int f66489b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66490a;

            public C27406c(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66490a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27406c m115431c(C27406c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66490a;
                }
                return cVar.mo79714b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79713a() {
                return this.f66490a;
            }

            @C12579k
            /* renamed from: b */
            public final C27406c mo79714b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27406c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79715d() {
                return this.f66490a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27406c) && Intrinsics.areEqual((Object) this.f66490a, (Object) ((C27406c) obj).f66490a);
            }

            public int hashCode() {
                return this.f66490a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66490a;
                return "NavigateToProductPage(offerProductModel=" + offerProductModel + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b */
    public interface C27407b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$a */
        public static final class C27408a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m115435a(@C12579k C27407b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$b */
        public static final class C27409b implements C27407b {
            @C12579k

            /* renamed from: b */
            public static final C27409b f66491b = new C27409b();

            /* renamed from: c */
            public static final int f66492c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27408a.m115435a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$c */
        public static final class C27410c implements C27407b {
            @C12579k

            /* renamed from: b */
            public static final C27410c f66493b = new C27410c();

            /* renamed from: c */
            public static final int f66494c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27408a.m115435a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$d */
        public static final class C27411d implements C27407b {
            @C12579k

            /* renamed from: b */
            public static final C27411d f66495b = new C27411d();

            /* renamed from: c */
            public static final int f66496c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27408a.m115435a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$b$e */
        public static final class C27412e implements C27407b {
            @C12579k

            /* renamed from: b */
            public static final C27412e f66497b = new C27412e();

            /* renamed from: c */
            public static final int f66498c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27408a.m115435a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c */
    public interface C27413c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$a */
        public static final class C27414a implements C27413c {

            /* renamed from: b */
            public static final int f66499b = 0;
            @C12579k

            /* renamed from: a */
            public final String f66500a;

            public C27414a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "ean");
                this.f66500a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C27414a m115436c(C27414a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f66500a;
                }
                return aVar.mo79720b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo79719a() {
                return this.f66500a;
            }

            @C12579k
            /* renamed from: b */
            public final C27414a mo79720b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "ean");
                return new C27414a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo79721d() {
                return this.f66500a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27414a) && Intrinsics.areEqual((Object) this.f66500a, (Object) ((C27414a) obj).f66500a);
            }

            public int hashCode() {
                return this.f66500a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f66500a;
                return "ProductScanned(ean=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$b */
        public static final class C27415b implements C27413c {
            @C12579k

            /* renamed from: a */
            public static final C27415b f66501a = new C27415b();

            /* renamed from: b */
            public static final int f66502b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$c */
        public static final class C27416c implements C27413c {

            /* renamed from: b */
            public static final int f66503b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66504a;

            public C27416c(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66504a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27416c m115440c(C27416c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66504a;
                }
                return cVar.mo79726b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79725a() {
                return this.f66504a;
            }

            @C12579k
            /* renamed from: b */
            public final C27416c mo79726b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27416c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79727d() {
                return this.f66504a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27416c) && Intrinsics.areEqual((Object) this.f66504a, (Object) ((C27416c) obj).f66504a);
            }

            public int hashCode() {
                return this.f66504a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66504a;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.mvi.a$c$d */
        public static final class C27417d implements C27413c {
            @C12579k

            /* renamed from: a */
            public static final C27417d f66505a = new C27417d();

            /* renamed from: b */
            public static final int f66506b = 0;
        }
    }
}
