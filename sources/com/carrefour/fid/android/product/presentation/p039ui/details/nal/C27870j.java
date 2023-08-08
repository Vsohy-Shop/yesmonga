package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j */
public interface C27870j {

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$a */
    public interface C27871a extends C27870j {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$a$a */
        public static final class C27872a implements C27871a {

            /* renamed from: f */
            public static final int f67493f = 8;

            /* renamed from: a */
            public final boolean f67494a;
            @C12579k

            /* renamed from: b */
            public final OfferDetail f67495b;
            @C12579k

            /* renamed from: c */
            public final C38110e f67496c;

            /* renamed from: d */
            public final int f67497d;

            /* renamed from: e */
            public final boolean f67498e;

            public C27872a(boolean z, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar, int i, boolean z2) {
                Intrinsics.checkNotNullParameter(offerDetail, "currentOfferDetail");
                Intrinsics.checkNotNullParameter(eVar, "product");
                this.f67494a = z;
                this.f67495b = offerDetail;
                this.f67496c = eVar;
                this.f67497d = i;
                this.f67498e = z2;
            }

            /* renamed from: g */
            public static /* synthetic */ C27872a m116950g(C27872a aVar, boolean z, OfferDetail offerDetail, C38110e eVar, int i, boolean z2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = aVar.f67494a;
                }
                if ((i2 & 2) != 0) {
                    offerDetail = aVar.f67495b;
                }
                OfferDetail offerDetail2 = offerDetail;
                if ((i2 & 4) != 0) {
                    eVar = aVar.f67496c;
                }
                C38110e eVar2 = eVar;
                if ((i2 & 8) != 0) {
                    i = aVar.f67497d;
                }
                int i3 = i;
                if ((i2 & 16) != 0) {
                    z2 = aVar.f67498e;
                }
                return aVar.mo80966f(z, offerDetail2, eVar2, i3, z2);
            }

            /* renamed from: a */
            public final boolean mo80960a() {
                return this.f67494a;
            }

            @C12579k
            /* renamed from: b */
            public final OfferDetail mo80961b() {
                return this.f67495b;
            }

            @C12579k
            /* renamed from: c */
            public final C38110e mo80962c() {
                return this.f67496c;
            }

            /* renamed from: d */
            public final int mo80963d() {
                return this.f67497d;
            }

            /* renamed from: e */
            public final boolean mo80964e() {
                return this.f67498e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27872a)) {
                    return false;
                }
                C27872a aVar = (C27872a) obj;
                return this.f67494a == aVar.f67494a && Intrinsics.areEqual((Object) this.f67495b, (Object) aVar.f67495b) && Intrinsics.areEqual((Object) this.f67496c, (Object) aVar.f67496c) && this.f67497d == aVar.f67497d && this.f67498e == aVar.f67498e;
            }

            @C12579k
            /* renamed from: f */
            public final C27872a mo80966f(boolean z, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar, int i, boolean z2) {
                Intrinsics.checkNotNullParameter(offerDetail, "currentOfferDetail");
                Intrinsics.checkNotNullParameter(eVar, "product");
                return new C27872a(z, offerDetail, eVar, i, z2);
            }

            @C12579k
            /* renamed from: h */
            public final OfferDetail mo80967h() {
                return this.f67495b;
            }

            public int hashCode() {
                boolean z = this.f67494a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int hashCode = (((((((z ? 1 : 0) * true) + this.f67495b.hashCode()) * 31) + this.f67496c.hashCode()) * 31) + Integer.hashCode(this.f67497d)) * 31;
                boolean z3 = this.f67498e;
                if (!z3) {
                    z2 = z3;
                }
                return hashCode + (z2 ? 1 : 0);
            }

            /* renamed from: i */
            public final boolean mo80969i() {
                return this.f67498e;
            }

            @C12579k
            /* renamed from: j */
            public final C38110e mo80970j() {
                return this.f67496c;
            }

            /* renamed from: k */
            public final int mo80971k() {
                return this.f67497d;
            }

            /* renamed from: l */
            public final boolean mo80972l() {
                return this.f67494a;
            }

            @C12579k
            public String toString() {
                boolean z = this.f67494a;
                OfferDetail offerDetail = this.f67495b;
                C38110e eVar = this.f67496c;
                int i = this.f67497d;
                boolean z2 = this.f67498e;
                return "AddToCartSuccess(isHomeDeliveryNal=" + z + ", currentOfferDetail=" + offerDetail + ", product=" + eVar + ", quantity=" + i + ", hasMultipleOffers=" + z2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$a$b */
        public static final class C27873b implements C27871a {

            /* renamed from: e */
            public static final int f67499e = 8;

            /* renamed from: a */
            public final int f67500a;
            @C12580l

            /* renamed from: b */
            public final List<C27934i> f67501b;
            @C12579k

            /* renamed from: c */
            public final OfferDetail f67502c;
            @C12579k

            /* renamed from: d */
            public final C38110e f67503d;

            public C27873b(int i, @C12580l List<C27934i> list, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar) {
                Intrinsics.checkNotNullParameter(offerDetail, "offerSelected");
                Intrinsics.checkNotNullParameter(eVar, "product");
                this.f67500a = i;
                this.f67501b = list;
                this.f67502c = offerDetail;
                this.f67503d = eVar;
            }

            /* renamed from: f */
            public static /* synthetic */ C27873b m116962f(C27873b bVar, int i, List<C27934i> list, OfferDetail offerDetail, C38110e eVar, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f67500a;
                }
                if ((i2 & 2) != 0) {
                    list = bVar.f67501b;
                }
                if ((i2 & 4) != 0) {
                    offerDetail = bVar.f67502c;
                }
                if ((i2 & 8) != 0) {
                    eVar = bVar.f67503d;
                }
                return bVar.mo80978e(i, list, offerDetail, eVar);
            }

            /* renamed from: a */
            public final int mo80974a() {
                return this.f67500a;
            }

            @C12580l
            /* renamed from: b */
            public final List<C27934i> mo80975b() {
                return this.f67501b;
            }

            @C12579k
            /* renamed from: c */
            public final OfferDetail mo80976c() {
                return this.f67502c;
            }

            @C12579k
            /* renamed from: d */
            public final C38110e mo80977d() {
                return this.f67503d;
            }

            @C12579k
            /* renamed from: e */
            public final C27873b mo80978e(int i, @C12580l List<C27934i> list, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar) {
                Intrinsics.checkNotNullParameter(offerDetail, "offerSelected");
                Intrinsics.checkNotNullParameter(eVar, "product");
                return new C27873b(i, list, offerDetail, eVar);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27873b)) {
                    return false;
                }
                C27873b bVar = (C27873b) obj;
                return this.f67500a == bVar.f67500a && Intrinsics.areEqual((Object) this.f67501b, (Object) bVar.f67501b) && Intrinsics.areEqual((Object) this.f67502c, (Object) bVar.f67502c) && Intrinsics.areEqual((Object) this.f67503d, (Object) bVar.f67503d);
            }

            @C12579k
            /* renamed from: g */
            public final OfferDetail mo80980g() {
                return this.f67502c;
            }

            @C12579k
            /* renamed from: h */
            public final C38110e mo80981h() {
                return this.f67503d;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f67500a) * 31;
                List<C27934i> list = this.f67501b;
                return ((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f67502c.hashCode()) * 31) + this.f67503d.hashCode();
            }

            /* renamed from: i */
            public final int mo80983i() {
                return this.f67500a;
            }

            @C12580l
            /* renamed from: j */
            public final List<C27934i> mo80984j() {
                return this.f67501b;
            }

            @C12579k
            public String toString() {
                int i = this.f67500a;
                List<C27934i> list = this.f67501b;
                OfferDetail offerDetail = this.f67502c;
                C38110e eVar = this.f67503d;
                return "OnAddToCartPressed(quantity=" + i + ", serviceSets=" + list + ", offerSelected=" + offerDetail + ", product=" + eVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$a$c */
        public static final class C27874c implements C27871a {

            /* renamed from: c */
            public static final int f67504c = 0;

            /* renamed from: a */
            public final int f67505a;

            /* renamed from: b */
            public final int f67506b;

            public C27874c(int i, int i2) {
                this.f67505a = i;
                this.f67506b = i2;
            }

            /* renamed from: d */
            public static /* synthetic */ C27874c m116972d(C27874c cVar, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = cVar.f67505a;
                }
                if ((i3 & 2) != 0) {
                    i2 = cVar.f67506b;
                }
                return cVar.mo80988c(i, i2);
            }

            /* renamed from: a */
            public final int mo80986a() {
                return this.f67505a;
            }

            /* renamed from: b */
            public final int mo80987b() {
                return this.f67506b;
            }

            @C12579k
            /* renamed from: c */
            public final C27874c mo80988c(int i, int i2) {
                return new C27874c(i, i2);
            }

            /* renamed from: e */
            public final int mo80989e() {
                return this.f67506b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27874c)) {
                    return false;
                }
                C27874c cVar = (C27874c) obj;
                return this.f67505a == cVar.f67505a && this.f67506b == cVar.f67506b;
            }

            /* renamed from: f */
            public final int mo80991f() {
                return this.f67505a;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f67505a) * 31) + Integer.hashCode(this.f67506b);
            }

            @C12579k
            public String toString() {
                int i = this.f67505a;
                int i2 = this.f67506b;
                return "OnAddToCartWithQuantityPressed(quantity=" + i + ", maxQuantity=" + i2 + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$b */
    public static final class C27875b implements C27870j {

        /* renamed from: b */
        public static final int f67507b = 0;

        /* renamed from: a */
        public final int f67508a;

        public C27875b(int i) {
            this.f67508a = i;
        }

        /* renamed from: c */
        public static /* synthetic */ C27875b m116978c(C27875b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f67508a;
            }
            return bVar.mo80995b(i);
        }

        /* renamed from: a */
        public final int mo80994a() {
            return this.f67508a;
        }

        @C12579k
        /* renamed from: b */
        public final C27875b mo80995b(int i) {
            return new C27875b(i);
        }

        /* renamed from: d */
        public final int mo80996d() {
            return this.f67508a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27875b) && this.f67508a == ((C27875b) obj).f67508a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f67508a);
        }

        @C12579k
        public String toString() {
            int i = this.f67508a;
            return "HandleComponentExpandComplete(position=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$c */
    public static final class C27876c implements C27870j {
        @C12579k

        /* renamed from: a */
        public static final C27876c f67509a = new C27876c();

        /* renamed from: b */
        public static final int f67510b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$d */
    public static final class C27877d implements C27870j {

        /* renamed from: b */
        public static final int f67511b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f67512a;

        public C27877d(@C12580l Throwable th) {
            this.f67512a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27877d m116982c(C27877d dVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = dVar.f67512a;
            }
            return dVar.mo81001b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo81000a() {
            return this.f67512a;
        }

        @C12579k
        /* renamed from: b */
        public final C27877d mo81001b(@C12580l Throwable th) {
            return new C27877d(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo81002d() {
            return this.f67512a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27877d) && Intrinsics.areEqual((Object) this.f67512a, (Object) ((C27877d) obj).f67512a);
        }

        public int hashCode() {
            Throwable th = this.f67512a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f67512a;
            return "OnError(exception=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$e */
    public static final class C27878e implements C27870j {
        @C12579k

        /* renamed from: a */
        public static final C27878e f67513a = new C27878e();

        /* renamed from: b */
        public static final int f67514b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$f */
    public static final class C27879f implements C27870j {
        @C12579k

        /* renamed from: a */
        public static final C27879f f67515a = new C27879f();

        /* renamed from: b */
        public static final int f67516b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$g */
    public static final class C27880g implements C27870j {

        /* renamed from: b */
        public static final int f67517b = 0;
        @C12579k

        /* renamed from: a */
        public final String f67518a;

        public C27880g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "cmsRedirectionUrl");
            this.f67518a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27880g m116986c(C27880g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f67518a;
            }
            return gVar.mo81007b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo81006a() {
            return this.f67518a;
        }

        @C12579k
        /* renamed from: b */
        public final C27880g mo81007b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "cmsRedirectionUrl");
            return new C27880g(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo81008d() {
            return this.f67518a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27880g) && Intrinsics.areEqual((Object) this.f67518a, (Object) ((C27880g) obj).f67518a);
        }

        public int hashCode() {
            return this.f67518a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67518a;
            return "OnWebRedirection(cmsRedirectionUrl=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h */
    public interface C27881h extends C27870j {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$a */
        public static final class C27882a implements C27881h {
            @C12579k

            /* renamed from: a */
            public static final C27882a f67519a = new C27882a();

            /* renamed from: b */
            public static final int f67520b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$b */
        public static final class C27883b implements C27881h {

            /* renamed from: d */
            public static final int f67521d = 8;
            @C12580l

            /* renamed from: a */
            public final String f67522a;
            @C12579k

            /* renamed from: b */
            public final List<OfferDetail> f67523b;
            @C12579k

            /* renamed from: c */
            public final C38110e f67524c;

            public /* synthetic */ C27883b(String str, List list, C38110e eVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, list, eVar);
            }

            /* renamed from: e */
            public static /* synthetic */ C27883b m116990e(C27883b bVar, String str, List<OfferDetail> list, C38110e eVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f67522a;
                }
                if ((i & 2) != 0) {
                    list = bVar.f67523b;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.f67524c;
                }
                return bVar.mo81015d(str, list, eVar);
            }

            @C12580l
            /* renamed from: a */
            public final String mo81012a() {
                return this.f67522a;
            }

            @C12579k
            /* renamed from: b */
            public final List<OfferDetail> mo81013b() {
                return this.f67523b;
            }

            @C12579k
            /* renamed from: c */
            public final C38110e mo81014c() {
                return this.f67524c;
            }

            @C12579k
            /* renamed from: d */
            public final C27883b mo81015d(@C12580l String str, @C12579k List<OfferDetail> list, @C12579k C38110e eVar) {
                Intrinsics.checkNotNullParameter(list, "offers");
                Intrinsics.checkNotNullParameter(eVar, "product");
                return new C27883b(str, list, eVar, (DefaultConstructorMarker) null);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0037 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L_0x0004
                    return r0
                L_0x0004:
                    boolean r1 = r5 instanceof com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27883b
                    r2 = 0
                    if (r1 != 0) goto L_0x000a
                    return r2
                L_0x000a:
                    com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$b r5 = (com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27883b) r5
                    java.lang.String r1 = r4.f67522a
                    java.lang.String r3 = r5.f67522a
                    if (r1 != 0) goto L_0x0016
                    if (r3 != 0) goto L_0x0018
                    r1 = r0
                    goto L_0x001e
                L_0x0016:
                    if (r3 != 0) goto L_0x001a
                L_0x0018:
                    r1 = r2
                    goto L_0x001e
                L_0x001a:
                    boolean r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r3)
                L_0x001e:
                    if (r1 != 0) goto L_0x0021
                    return r2
                L_0x0021:
                    java.util.List<com.carrefour.fid.android.domain.models.product.detail.OfferDetail> r1 = r4.f67523b
                    java.util.List<com.carrefour.fid.android.domain.models.product.detail.OfferDetail> r3 = r5.f67523b
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
                    if (r1 != 0) goto L_0x002c
                    return r2
                L_0x002c:
                    com.carrefour.fid.android.domain.models.product.detail.e r1 = r4.f67524c
                    com.carrefour.fid.android.domain.models.product.detail.e r5 = r5.f67524c
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
                    if (r5 != 0) goto L_0x0037
                    return r2
                L_0x0037:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j.C27881h.C27883b.equals(java.lang.Object):boolean");
            }

            @C12580l
            /* renamed from: f */
            public final String mo81017f() {
                return this.f67522a;
            }

            @C12579k
            /* renamed from: g */
            public final List<OfferDetail> mo81018g() {
                return this.f67523b;
            }

            @C12579k
            /* renamed from: h */
            public final C38110e mo81019h() {
                return this.f67524c;
            }

            public int hashCode() {
                String str = this.f67522a;
                return ((((str == null ? 0 : FacilityServiceId.m157963h(str)) * 31) + this.f67523b.hashCode()) * 31) + this.f67524c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f67522a;
                String i = str == null ? "null" : FacilityServiceId.m157964i(str);
                List<OfferDetail> list = this.f67523b;
                C38110e eVar = this.f67524c;
                return "OnDeliveryChoiceClicked(facilityServiceId=" + i + ", offers=" + list + ", product=" + eVar + ")";
            }

            public C27883b(String str, List<OfferDetail> list, C38110e eVar) {
                Intrinsics.checkNotNullParameter(list, "offers");
                Intrinsics.checkNotNullParameter(eVar, "product");
                this.f67522a = str;
                this.f67523b = list;
                this.f67524c = eVar;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$c */
        public static final class C27884c implements C27881h {

            /* renamed from: b */
            public static final int f67525b = 0;

            /* renamed from: a */
            public final boolean f67526a;

            public C27884c(boolean z) {
                this.f67526a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C27884c m116998c(C27884c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f67526a;
                }
                return cVar.mo81023b(z);
            }

            /* renamed from: a */
            public final boolean mo81022a() {
                return this.f67526a;
            }

            @C12579k
            /* renamed from: b */
            public final C27884c mo81023b(boolean z) {
                return new C27884c(z);
            }

            /* renamed from: d */
            public final boolean mo81024d() {
                return this.f67526a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27884c) && this.f67526a == ((C27884c) obj).f67526a;
            }

            public int hashCode() {
                boolean z = this.f67526a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f67526a;
                return "OnDeliveryChoiceInfoClicked(isRelayPointEligible=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$d */
        public static final class C27885d implements C27881h {
            @C12579k

            /* renamed from: a */
            public static final C27885d f67527a = new C27885d();

            /* renamed from: b */
            public static final int f67528b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$h$e */
        public static final class C27886e implements C27881h {
            @C12579k

            /* renamed from: a */
            public static final C27886e f67529a = new C27886e();

            /* renamed from: b */
            public static final int f67530b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$i */
    public interface C27887i extends C27870j {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.j$i$a */
        public static final class C27888a implements C27887i {

            /* renamed from: b */
            public static final int f67531b = 0;
            @C12579k

            /* renamed from: a */
            public final ReinsuranceType f67532a;

            public C27888a(@C12579k ReinsuranceType reinsuranceType) {
                Intrinsics.checkNotNullParameter(reinsuranceType, "type");
                this.f67532a = reinsuranceType;
            }

            /* renamed from: c */
            public static /* synthetic */ C27888a m117002c(C27888a aVar, ReinsuranceType reinsuranceType, int i, Object obj) {
                if ((i & 1) != 0) {
                    reinsuranceType = aVar.f67532a;
                }
                return aVar.mo81029b(reinsuranceType);
            }

            @C12579k
            /* renamed from: a */
            public final ReinsuranceType mo81028a() {
                return this.f67532a;
            }

            @C12579k
            /* renamed from: b */
            public final C27888a mo81029b(@C12579k ReinsuranceType reinsuranceType) {
                Intrinsics.checkNotNullParameter(reinsuranceType, "type");
                return new C27888a(reinsuranceType);
            }

            @C12579k
            /* renamed from: d */
            public final ReinsuranceType mo81030d() {
                return this.f67532a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27888a) && this.f67532a == ((C27888a) obj).f67532a;
            }

            public int hashCode() {
                return this.f67532a.hashCode();
            }

            @C12579k
            public String toString() {
                ReinsuranceType reinsuranceType = this.f67532a;
                return "OnReinsuranceClicked(type=" + reinsuranceType + ")";
            }
        }
    }
}
