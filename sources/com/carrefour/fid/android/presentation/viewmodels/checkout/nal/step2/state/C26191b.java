package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNonFoodCheckoutStep2UiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2UiState.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/state/NonFoodCheckoutStep2UiState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1726#2,3:48\n1747#2,3:51\n2624#2,3:54\n1747#2,3:57\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2UiState.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/state/NonFoodCheckoutStep2UiState\n*L\n37#1:48,3\n38#1:51,3\n38#1:54,3\n39#1:57,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b */
public final class C26191b {
    @C12579k

    /* renamed from: a */
    public final C28892e<List<C26193b>> f64038a;
    @C12580l

    /* renamed from: b */
    public final C38080a f64039b;
    @C12579k

    /* renamed from: c */
    public final C28892e<C26195d> f64040c;
    @C12579k

    /* renamed from: d */
    public final C28892e<C11079d2> f64041d;
    @C12579k

    /* renamed from: e */
    public final C28892e<C26194c> f64042e;
    @C12579k

    /* renamed from: f */
    public final C28892e<C26192a> f64043f;

    /* renamed from: g */
    public final boolean f64044g;

    /* renamed from: h */
    public final boolean f64045h;
    @C12579k

    /* renamed from: i */
    public final List<C28892e<Object>> f64046i;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$b */
    public static final class C26193b {

        /* renamed from: c */
        public static final int f64054c = 8;
        @C12579k

        /* renamed from: a */
        public final C38017b f64055a;

        /* renamed from: b */
        public final boolean f64056b;

        public C26193b(@C12579k C38017b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(bVar, "deliveryOption");
            this.f64055a = bVar;
            this.f64056b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C26193b m111954d(C26193b bVar, C38017b bVar2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar2 = bVar.f64055a;
            }
            if ((i & 2) != 0) {
                z = bVar.f64056b;
            }
            return bVar.mo76153c(bVar2, z);
        }

        @C12579k
        /* renamed from: a */
        public final C38017b mo76151a() {
            return this.f64055a;
        }

        /* renamed from: b */
        public final boolean mo76152b() {
            return this.f64056b;
        }

        @C12579k
        /* renamed from: c */
        public final C26193b mo76153c(@C12579k C38017b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(bVar, "deliveryOption");
            return new C26193b(bVar, z);
        }

        @C12579k
        /* renamed from: e */
        public final C38017b mo76154e() {
            return this.f64055a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26193b)) {
                return false;
            }
            C26193b bVar = (C26193b) obj;
            return Intrinsics.areEqual((Object) this.f64055a, (Object) bVar.f64055a) && this.f64056b == bVar.f64056b;
        }

        /* renamed from: f */
        public final boolean mo76156f() {
            return this.f64056b;
        }

        public int hashCode() {
            int hashCode = this.f64055a.hashCode() * 31;
            boolean z = this.f64056b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            C38017b bVar = this.f64055a;
            boolean z = this.f64056b;
            return "SelectableDeliveryOption(deliveryOption=" + bVar + ", isSelected=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$c */
    public static final class C26194c {

        /* renamed from: d */
        public static final int f64057d = 8;
        @C12579k

        /* renamed from: a */
        public final BasketAmounts f64058a;
        @C12580l

        /* renamed from: b */
        public final BasketPromotionCode f64059b;

        /* renamed from: c */
        public final int f64060c;

        public C26194c(@C12579k BasketAmounts basketAmounts, @C12580l BasketPromotionCode basketPromotionCode, int i) {
            Intrinsics.checkNotNullParameter(basketAmounts, "basketAmounts");
            this.f64058a = basketAmounts;
            this.f64059b = basketPromotionCode;
            this.f64060c = i;
        }

        /* renamed from: e */
        public static /* synthetic */ C26194c m111960e(C26194c cVar, BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                basketAmounts = cVar.f64058a;
            }
            if ((i2 & 2) != 0) {
                basketPromotionCode = cVar.f64059b;
            }
            if ((i2 & 4) != 0) {
                i = cVar.f64060c;
            }
            return cVar.mo76162d(basketAmounts, basketPromotionCode, i);
        }

        @C12579k
        /* renamed from: a */
        public final BasketAmounts mo76159a() {
            return this.f64058a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketPromotionCode mo76160b() {
            return this.f64059b;
        }

        /* renamed from: c */
        public final int mo76161c() {
            return this.f64060c;
        }

        @C12579k
        /* renamed from: d */
        public final C26194c mo76162d(@C12579k BasketAmounts basketAmounts, @C12580l BasketPromotionCode basketPromotionCode, int i) {
            Intrinsics.checkNotNullParameter(basketAmounts, "basketAmounts");
            return new C26194c(basketAmounts, basketPromotionCode, i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26194c)) {
                return false;
            }
            C26194c cVar = (C26194c) obj;
            return Intrinsics.areEqual((Object) this.f64058a, (Object) cVar.f64058a) && Intrinsics.areEqual((Object) this.f64059b, (Object) cVar.f64059b) && this.f64060c == cVar.f64060c;
        }

        @C12579k
        /* renamed from: f */
        public final BasketAmounts mo76164f() {
            return this.f64058a;
        }

        /* renamed from: g */
        public final int mo76165g() {
            return this.f64060c;
        }

        @C12580l
        /* renamed from: h */
        public final BasketPromotionCode mo76166h() {
            return this.f64059b;
        }

        public int hashCode() {
            int hashCode = this.f64058a.hashCode() * 31;
            BasketPromotionCode basketPromotionCode = this.f64059b;
            return ((hashCode + (basketPromotionCode == null ? 0 : basketPromotionCode.hashCode())) * 31) + Integer.hashCode(this.f64060c);
        }

        @C12579k
        public String toString() {
            BasketAmounts basketAmounts = this.f64058a;
            BasketPromotionCode basketPromotionCode = this.f64059b;
            int i = this.f64060c;
            return "TotalBasket(basketAmounts=" + basketAmounts + ", promoCode=" + basketPromotionCode + ", productCount=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$d */
    public static final class C26195d {

        /* renamed from: d */
        public static final int f64061d = 8;
        @C12579k

        /* renamed from: a */
        public final Address f64062a;
        @C12579k

        /* renamed from: b */
        public final Address f64063b;
        @C12579k

        /* renamed from: c */
        public final String f64064c;

        public C26195d(@C12579k Address address, @C12579k Address address2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "deliveryAddress");
            Intrinsics.checkNotNullParameter(address2, "billingAddress");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            this.f64062a = address;
            this.f64063b = address2;
            this.f64064c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C26195d m111968e(C26195d dVar, Address address, Address address2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                address = dVar.f64062a;
            }
            if ((i & 2) != 0) {
                address2 = dVar.f64063b;
            }
            if ((i & 4) != 0) {
                str = dVar.f64064c;
            }
            return dVar.mo76172d(address, address2, str);
        }

        @C12579k
        /* renamed from: a */
        public final Address mo76169a() {
            return this.f64062a;
        }

        @C12579k
        /* renamed from: b */
        public final Address mo76170b() {
            return this.f64063b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo76171c() {
            return this.f64064c;
        }

        @C12579k
        /* renamed from: d */
        public final C26195d mo76172d(@C12579k Address address, @C12579k Address address2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "deliveryAddress");
            Intrinsics.checkNotNullParameter(address2, "billingAddress");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            return new C26195d(address, address2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26195d)) {
                return false;
            }
            C26195d dVar = (C26195d) obj;
            return Intrinsics.areEqual((Object) this.f64062a, (Object) dVar.f64062a) && Intrinsics.areEqual((Object) this.f64063b, (Object) dVar.f64063b) && Intrinsics.areEqual((Object) this.f64064c, (Object) dVar.f64064c);
        }

        @C12579k
        /* renamed from: f */
        public final Address mo76174f() {
            return this.f64063b;
        }

        @C12579k
        /* renamed from: g */
        public final Address mo76175g() {
            return this.f64062a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo76176h() {
            return this.f64064c;
        }

        public int hashCode() {
            return (((this.f64062a.hashCode() * 31) + this.f64063b.hashCode()) * 31) + this.f64064c.hashCode();
        }

        @C12579k
        public String toString() {
            Address address = this.f64062a;
            Address address2 = this.f64063b;
            String str = this.f64064c;
            return "UserInfoState(deliveryAddress=" + address + ", billingAddress=" + address2 + ", phone=" + str + ")";
        }
    }

    public C26191b() {
        this((C28892e) null, (C38080a) null, (C28892e) null, (C28892e) null, (C28892e) null, (C28892e) null, false, false, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public static /* synthetic */ C26191b m111921j(C26191b bVar, C28892e eVar, C38080a aVar, C28892e eVar2, C28892e eVar3, C28892e eVar4, C28892e eVar5, boolean z, boolean z2, int i, Object obj) {
        C26191b bVar2 = bVar;
        int i2 = i;
        return bVar.mo76124i((i2 & 1) != 0 ? bVar2.f64038a : eVar, (i2 & 2) != 0 ? bVar2.f64039b : aVar, (i2 & 4) != 0 ? bVar2.f64040c : eVar2, (i2 & 8) != 0 ? bVar2.f64041d : eVar3, (i2 & 16) != 0 ? bVar2.f64042e : eVar4, (i2 & 32) != 0 ? bVar2.f64043f : eVar5, (i2 & 64) != 0 ? bVar2.f64044g : z, (i2 & 128) != 0 ? bVar2.f64045h : z2);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<List<C26193b>> mo76114a() {
        return this.f64038a;
    }

    @C12580l
    /* renamed from: b */
    public final C38080a mo76115b() {
        return this.f64039b;
    }

    @C12579k
    /* renamed from: c */
    public final C28892e<C26195d> mo76116c() {
        return this.f64040c;
    }

    @C12579k
    /* renamed from: d */
    public final C28892e<C11079d2> mo76117d() {
        return this.f64041d;
    }

    @C12579k
    /* renamed from: e */
    public final C28892e<C26194c> mo76118e() {
        return this.f64042e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26191b)) {
            return false;
        }
        C26191b bVar = (C26191b) obj;
        return Intrinsics.areEqual((Object) this.f64038a, (Object) bVar.f64038a) && Intrinsics.areEqual((Object) this.f64039b, (Object) bVar.f64039b) && Intrinsics.areEqual((Object) this.f64040c, (Object) bVar.f64040c) && Intrinsics.areEqual((Object) this.f64041d, (Object) bVar.f64041d) && Intrinsics.areEqual((Object) this.f64042e, (Object) bVar.f64042e) && Intrinsics.areEqual((Object) this.f64043f, (Object) bVar.f64043f) && this.f64044g == bVar.f64044g && this.f64045h == bVar.f64045h;
    }

    @C12579k
    /* renamed from: f */
    public final C28892e<C26192a> mo76120f() {
        return this.f64043f;
    }

    /* renamed from: g */
    public final boolean mo76121g() {
        return this.f64044g;
    }

    /* renamed from: h */
    public final boolean mo76122h() {
        return this.f64045h;
    }

    public int hashCode() {
        int hashCode = this.f64038a.hashCode() * 31;
        C38080a aVar = this.f64039b;
        int hashCode2 = (((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f64040c.hashCode()) * 31) + this.f64041d.hashCode()) * 31) + this.f64042e.hashCode()) * 31) + this.f64043f.hashCode()) * 31;
        boolean z = this.f64044g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f64045h;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C26191b mo76124i(@C12579k C28892e<? extends List<C26193b>> eVar, @C12580l C38080a aVar, @C12579k C28892e<C26195d> eVar2, @C12579k C28892e<C11079d2> eVar3, @C12579k C28892e<C26194c> eVar4, @C12579k C28892e<C26192a> eVar5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "selectableDeliveryModes");
        Intrinsics.checkNotNullParameter(eVar2, "userInfo");
        Intrinsics.checkNotNullParameter(eVar3, "validatePromoCode");
        Intrinsics.checkNotNullParameter(eVar4, "totalBasket");
        C28892e<C26192a> eVar6 = eVar5;
        Intrinsics.checkNotNullParameter(eVar6, "cardFid");
        return new C26191b(eVar, aVar, eVar2, eVar3, eVar4, eVar6, z, z2);
    }

    @C12579k
    /* renamed from: k */
    public final C28892e<C26192a> mo76125k() {
        return this.f64043f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3 A[EDGE_INSN: B:58:0x00b3->B:48:0x00b3 ?: BREAK  , SYNTHETIC] */
    @org.jetbrains.annotations.C12579k
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.shared.type.C28892e<kotlin.C11079d2> mo76126l() {
        /*
            r4 = this;
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.f64046i
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0015
        L_0x0013:
            r0 = r3
            goto L_0x002a
        L_0x0015:
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 != 0) goto L_0x0019
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0035
            com.carrefour.fid.android.shared.type.e$c r0 = new com.carrefour.fid.android.shared.type.e$c
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            r0.<init>(r1)
            goto L_0x00c4
        L_0x0035:
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.f64046i
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0048
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0048
        L_0x0046:
            r0 = r2
            goto L_0x005d
        L_0x0048:
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28894b
            if (r1 == 0) goto L_0x004c
            r0 = r3
        L_0x005d:
            if (r0 == 0) goto L_0x008c
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.f64046i
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0072
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0072
        L_0x0070:
            r0 = r3
            goto L_0x0087
        L_0x0072:
            java.util.Iterator r0 = r0.iterator()
        L_0x0076:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x0076
            r0 = r2
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            com.carrefour.fid.android.shared.type.e$b r0 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            goto L_0x00c4
        L_0x008c:
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.f64046i
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x009e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x009e
            goto L_0x00b3
        L_0x009e:
            java.util.Iterator r0 = r0.iterator()
        L_0x00a2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x00a2
            r2 = r3
        L_0x00b3:
            if (r2 == 0) goto L_0x00c2
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.f64046i
            java.lang.Throwable r0 = com.carrefour.fid.android.shared.type.C28897f.m119477a(r0)
            com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
            r1.<init>(r0)
            r0 = r1
            goto L_0x00c4
        L_0x00c2:
            com.carrefour.fid.android.shared.type.e$d r0 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.mo76126l():com.carrefour.fid.android.shared.type.e");
    }

    @C12580l
    /* renamed from: m */
    public final C38080a mo76127m() {
        return this.f64039b;
    }

    @C12579k
    /* renamed from: n */
    public final C28892e<List<C26193b>> mo76128n() {
        return this.f64038a;
    }

    @C12579k
    /* renamed from: o */
    public final C28892e<C26194c> mo76129o() {
        return this.f64042e;
    }

    @C12579k
    /* renamed from: p */
    public final C28892e<C26195d> mo76130p() {
        return this.f64040c;
    }

    @C12579k
    /* renamed from: q */
    public final C28892e<C11079d2> mo76131q() {
        return this.f64041d;
    }

    /* renamed from: r */
    public final boolean mo76132r() {
        return this.f64045h;
    }

    /* renamed from: s */
    public final boolean mo76133s() {
        return this.f64044g;
    }

    @C12579k
    public String toString() {
        C28892e<List<C26193b>> eVar = this.f64038a;
        C38080a aVar = this.f64039b;
        C28892e<C26195d> eVar2 = this.f64040c;
        C28892e<C11079d2> eVar3 = this.f64041d;
        C28892e<C26194c> eVar4 = this.f64042e;
        C28892e<C26192a> eVar5 = this.f64043f;
        boolean z = this.f64044g;
        boolean z2 = this.f64045h;
        return "NonFoodCheckoutStep2UiState(selectableDeliveryModes=" + eVar + ", pickupSelected=" + aVar + ", userInfo=" + eVar2 + ", validatePromoCode=" + eVar3 + ", totalBasket=" + eVar4 + ", cardFid=" + eVar5 + ", isValidatingBasket=" + z + ", isValidatePaymentEnabled=" + z2 + ")";
    }

    public C26191b(@C12579k C28892e<? extends List<C26193b>> eVar, @C12580l C38080a aVar, @C12579k C28892e<C26195d> eVar2, @C12579k C28892e<C11079d2> eVar3, @C12579k C28892e<C26194c> eVar4, @C12579k C28892e<C26192a> eVar5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eVar, "selectableDeliveryModes");
        Intrinsics.checkNotNullParameter(eVar2, "userInfo");
        Intrinsics.checkNotNullParameter(eVar3, "validatePromoCode");
        Intrinsics.checkNotNullParameter(eVar4, "totalBasket");
        Intrinsics.checkNotNullParameter(eVar5, "cardFid");
        this.f64038a = eVar;
        this.f64039b = aVar;
        this.f64040c = eVar2;
        this.f64041d = eVar3;
        this.f64042e = eVar4;
        this.f64043f = eVar5;
        this.f64044g = z;
        this.f64045h = z2;
        this.f64046i = CollectionsKt__CollectionsKt.m40448L(eVar, eVar2, eVar4);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.b$a */
    public static final class C26192a {

        /* renamed from: g */
        public static final int f64047g = 0;
        @C12579k

        /* renamed from: a */
        public final String f64048a;

        /* renamed from: b */
        public final boolean f64049b;

        /* renamed from: c */
        public final double f64050c;

        /* renamed from: d */
        public final double f64051d;

        /* renamed from: e */
        public final boolean f64052e;

        /* renamed from: f */
        public final boolean f64053f;

        public C26192a(@C12579k String str, boolean z, double d, double d2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            this.f64048a = str;
            this.f64049b = z;
            this.f64050c = d;
            this.f64051d = d2;
            this.f64052e = z2;
            this.f64053f = z3;
        }

        /* renamed from: h */
        public static /* synthetic */ C26192a m111940h(C26192a aVar, String str, boolean z, double d, double d2, boolean z2, boolean z3, int i, Object obj) {
            C26192a aVar2 = aVar;
            return aVar.mo76142g((i & 1) != 0 ? aVar2.f64048a : str, (i & 2) != 0 ? aVar2.f64049b : z, (i & 4) != 0 ? aVar2.f64050c : d, (i & 8) != 0 ? aVar2.f64051d : d2, (i & 16) != 0 ? aVar2.f64052e : z2, (i & 32) != 0 ? aVar2.f64053f : z3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo76135a() {
            return this.f64048a;
        }

        /* renamed from: b */
        public final boolean mo76136b() {
            return this.f64049b;
        }

        /* renamed from: c */
        public final double mo76137c() {
            return this.f64050c;
        }

        /* renamed from: d */
        public final double mo76138d() {
            return this.f64051d;
        }

        /* renamed from: e */
        public final boolean mo76139e() {
            return this.f64052e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26192a)) {
                return false;
            }
            C26192a aVar = (C26192a) obj;
            return Intrinsics.areEqual((Object) this.f64048a, (Object) aVar.f64048a) && this.f64049b == aVar.f64049b && Double.compare(this.f64050c, aVar.f64050c) == 0 && Double.compare(this.f64051d, aVar.f64051d) == 0 && this.f64052e == aVar.f64052e && this.f64053f == aVar.f64053f;
        }

        /* renamed from: f */
        public final boolean mo76141f() {
            return this.f64053f;
        }

        @C12579k
        /* renamed from: g */
        public final C26192a mo76142g(@C12579k String str, boolean z, double d, double d2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            return new C26192a(str, z, d, d2, z2, z3);
        }

        public int hashCode() {
            int hashCode = this.f64048a.hashCode() * 31;
            boolean z = this.f64049b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (((((hashCode + (z ? 1 : 0)) * 31) + Double.hashCode(this.f64050c)) * 31) + Double.hashCode(this.f64051d)) * 31;
            boolean z3 = this.f64052e;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f64053f;
            if (!z4) {
                z2 = z4;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final double mo76144i() {
            return this.f64051d;
        }

        /* renamed from: j */
        public final double mo76145j() {
            return this.f64050c;
        }

        @C12579k
        /* renamed from: k */
        public final String mo76146k() {
            return this.f64048a;
        }

        /* renamed from: l */
        public final boolean mo76147l() {
            return this.f64049b;
        }

        /* renamed from: m */
        public final boolean mo76148m() {
            return this.f64053f;
        }

        /* renamed from: n */
        public final boolean mo76149n() {
            return this.f64052e;
        }

        @C12579k
        public String toString() {
            String str = this.f64048a;
            boolean z = this.f64049b;
            double d = this.f64050c;
            double d2 = this.f64051d;
            boolean z2 = this.f64052e;
            boolean z3 = this.f64053f;
            return "CardFid(cardFidNumber=" + str + ", hasCardFid=" + z + ", cardFidBalance=" + d + ", amountValidated=" + d2 + ", useAllAmount=" + z2 + ", hasError=" + z3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26192a(String str, boolean z, double d, double d2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26191b(com.carrefour.fid.android.shared.type.C28892e r10, com.carrefour.fid.android.domain.models.pickup.C38080a r11, com.carrefour.fid.android.shared.type.C28892e r12, com.carrefour.fid.android.shared.type.C28892e r13, com.carrefour.fid.android.shared.type.C28892e r14, com.carrefour.fid.android.shared.type.C28892e r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            com.carrefour.fid.android.shared.type.e$d r1 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = r11
        L_0x0011:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0018
            com.carrefour.fid.android.shared.type.e$d r3 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x0019
        L_0x0018:
            r3 = r12
        L_0x0019:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0020
            com.carrefour.fid.android.shared.type.e$d r4 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x0021
        L_0x0020:
            r4 = r13
        L_0x0021:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0028
            com.carrefour.fid.android.shared.type.e$d r5 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x0029
        L_0x0028:
            r5 = r14
        L_0x0029:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0030
            com.carrefour.fid.android.shared.type.e$d r6 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
            goto L_0x0031
        L_0x0030:
            r6 = r15
        L_0x0031:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x0038
            r7 = r8
            goto L_0x003a
        L_0x0038:
            r7 = r16
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r8 = r17
        L_0x0041:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b.<init>(com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.domain.models.pickup.a, com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
