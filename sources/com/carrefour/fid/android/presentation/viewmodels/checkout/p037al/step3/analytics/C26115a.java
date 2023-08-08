package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13792d;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.analytics.C38362d;
import com.carrefour.fid.android.shared.constant.C28522c;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28590s;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.local.C33093b;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.a */
public final class C26115a {

    /* renamed from: d */
    public static final int f63856d = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f63857a;
    @C12579k

    /* renamed from: b */
    public final C28994a f63858b;
    @C12579k

    /* renamed from: c */
    public String f63859c = "";

    @Inject
    public C26115a(@C12579k C13783a aVar, @C12579k C28994a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        this.f63857a = aVar;
        this.f63858b = aVar2;
    }

    /* renamed from: a */
    public final String mo75862a(Basket basket) {
        BasketType basketType;
        boolean z;
        C38362d dVar = C38362d.f97145a;
        BasketServiceType basketServiceType = null;
        if (basket != null) {
            basketType = basket.mo116829N();
        } else {
            basketType = null;
        }
        if (basket != null) {
            basketServiceType = basket.mo116824I();
        }
        if (basket != null) {
            z = basket.mo116830O();
        } else {
            z = false;
        }
        return dVar.mo121198a(basketType, basketServiceType, z);
    }

    /* renamed from: b */
    public final void mo75863b(@C12580l Basket basket) {
        String a = mo75862a(basket);
        this.f63859c = a;
        mo75876o(a);
    }

    /* renamed from: c */
    public final void mo75864c(float f) {
        this.f63857a.mo32711n(new C13812g(FirebaseEventKey.CHECKOUT_PROGRESS, "paiement", "checkout", new C13792d(CheckoutProgressStep.FOURTH, (String) null, f, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: d */
    public final void mo75865d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        this.f63858b.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33403A0, str)));
    }

    /* renamed from: e */
    public final void mo75866e() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68838M2)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo75867f() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "utiliser-ma-cagnotte"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("panier_type", this.f63859c)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo75868g() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "choix-mode-de-paiement"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28590s.f69829u)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo75869h() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68933j, "choix-mode-de-paiement"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28590s.f69830v), C11078d1.m42659a("panier_type", this.f63859c)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75870i() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "checkout-commande-valider"), C11078d1.m42659a("panier_type", this.f63859c)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo75871j(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        Intrinsics.checkNotNullParameter(str2, "errorType");
        C13783a aVar = this.f63857a;
        String lowerCase = C11622t.replace$default(str2, C32920e.f79928l, "-", false, 4, (Object) null).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68933j, "voucher-fail"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, lowerCase + C33093b.f80279g + str)), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo75872k() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "code-promo-ok")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo75873l() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "option-paiement-en-ligne-ou-sur-place"), C11078d1.m42659a("panier_type", this.f63859c)), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo75874m() {
        C13783a.m58668o(this.f63857a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "option-paiement-en-ligne"), C11078d1.m42659a("panier_type", this.f63859c)), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo75875n(boolean z) {
        String str;
        C13783a aVar = this.f63857a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[2] = C11078d1.m42659a("screen_name", "paiement");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28522c.f68762n);
        if (z) {
            str = C28590s.f69825q;
        } else {
            str = C28590s.f69826r;
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        pairArr[6] = C11078d1.m42659a("panier_type", this.f63859c);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo75876o(String str) {
        C13783a.m58667i(this.f63857a, "checkout", "paiement", C10977s0.m41456W(C11078d1.m42659a("checkout_step", "3"), C11078d1.m42659a("panier_type", str)), false, false, false, 56, (Object) null);
    }
}
