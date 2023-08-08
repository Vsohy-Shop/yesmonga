package com.carrefour.fid.android.product.presentation.models.extensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.mapper.C27641a;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.c */
public final class C27659c {

    /* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.c$a */
    public /* synthetic */ class C27660a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.PromoType[] r0 = com.carrefour.fid.android.domain.models.offer.PromoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PROMO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PF     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.TA     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.BUNDLE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.extensions.C27659c.C27660a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final String m116363a(@C12579k Offer offer) {
        PromoType promoType;
        PromoType promoType2;
        PromoType promoType3;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Discount T = offer.mo118011T();
        Double d = null;
        if (T != null) {
            promoType = T.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType != PromoType.PF) {
            Discount T2 = offer.mo118011T();
            if (T2 != null) {
                promoType2 = T2.mo117953A();
            } else {
                promoType2 = null;
            }
            if (promoType2 != PromoType.RD) {
                Discount T3 = offer.mo118011T();
                if (T3 != null) {
                    promoType3 = T3.mo117953A();
                } else {
                    promoType3 = null;
                }
                if (promoType3 != PromoType.RI) {
                    if (offer.mo118009R().mo118171l() > 0.0d) {
                        return String.valueOf(offer.mo118009R().mo118171l());
                    }
                    if (offer.mo118009R().mo118172m() > 0.0d) {
                        return String.valueOf(offer.mo118009R().mo118172m());
                    }
                    return new String();
                }
            }
        }
        Discount T4 = offer.mo118011T();
        if (T4 != null) {
            d = Double.valueOf(C27641a.m116297b(T4.mo117980t()));
        }
        return String.valueOf(d);
    }

    /* renamed from: b */
    public static final double m116364b(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Double doubleOrNull = C11620r.toDoubleOrNull(m116363a(offer));
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: c */
    public static final boolean m116365c(@C12579k Offer offer) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Discount T = offer.mo118011T();
        if (T != null) {
            str = T.mo117986x();
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: d */
    public static final boolean m116366d(@C12579k Offer offer) {
        PromoType promoType;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Discount T = offer.mo118011T();
        PromoType promoType2 = null;
        if (T != null) {
            promoType = T.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType != PromoType.PROMO) {
            Discount T2 = offer.mo118011T();
            if (T2 != null) {
                promoType2 = T2.mo117953A();
            }
            if (promoType2 == PromoType.PF) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m116367e(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        if (offer.mo118004M() < offer.mo118012U() + offer.mo118002K()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final void m116368f(@C12579k Offer offer, @C12580l TextView textView, @C12579k ImageView imageView, @C12579k LinearLayout linearLayout) {
        String str;
        PromoType A;
        OfferDiscountType k;
        PromoType promoType;
        PromoType promoType2;
        PromoType promoType3;
        PromoType promoType4;
        PromoType promoType5;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Intrinsics.checkNotNullParameter(imageView, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(linearLayout, "layout");
        if (textView != null) {
            if (offer.mo118017Z()) {
                str = textView.getContext().getString(C27609f.C27627r.product_highlight_available_soon);
            } else if (!offer.mo118019a0()) {
                str = textView.getContext().getString(C27609f.C27627r.product_highlight_unavailable);
            } else if (C27666h.m116405d(offer.mo118010S())) {
                str = textView.getContext().getString(C27609f.C27627r.product_highlight_club_bio);
            } else if (offer.mo118014W()) {
                str = textView.getContext().getString(C27609f.C27627r.product_highlight_club_family);
            } else if (C27666h.m116406e(offer.mo118010S())) {
                str = textView.getContext().getString(C27609f.C27627r.product_highlight_club_marche);
            } else {
                if (m116365c(offer)) {
                    Discount T = offer.mo118011T();
                    if (T != null) {
                        promoType = T.mo117953A();
                    } else {
                        promoType = null;
                    }
                    if (promoType == PromoType.PF) {
                        str = textView.getContext().getString(C27609f.C27627r.product_highlight_pf);
                    } else {
                        Discount T2 = offer.mo118011T();
                        if (T2 != null) {
                            promoType2 = T2.mo117953A();
                        } else {
                            promoType2 = null;
                        }
                        if (promoType2 == PromoType.PROMO) {
                            str = textView.getContext().getString(C27609f.C27627r.product_highlight_promo);
                        } else {
                            Discount T3 = offer.mo118011T();
                            if (T3 != null) {
                                promoType3 = T3.mo117953A();
                            } else {
                                promoType3 = null;
                            }
                            if (promoType3 == PromoType.RD) {
                                str = textView.getContext().getString(C27609f.C27627r.product_highlight_rd);
                            } else {
                                Discount T4 = offer.mo118011T();
                                if (T4 != null) {
                                    promoType4 = T4.mo117953A();
                                } else {
                                    promoType4 = null;
                                }
                                if (promoType4 == PromoType.RI) {
                                    str = textView.getContext().getString(C27609f.C27627r.product_highlight_ri);
                                } else {
                                    Discount T5 = offer.mo118011T();
                                    if (T5 != null) {
                                        promoType5 = T5.mo117953A();
                                    } else {
                                        promoType5 = null;
                                    }
                                    if (promoType5 == PromoType.TA) {
                                        str = textView.getContext().getString(C27609f.C27627r.product_highlight_ta);
                                    }
                                }
                            }
                        }
                    }
                }
                str = null;
            }
            textView.setText(str);
            if (offer.mo117995D() != OfferAvailability.AVAILABLE) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), C27609f.C27615f.ds_primary_dark));
                linearLayout.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), 17170445)));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            } else if (C27666h.m116405d(offer.mo118010S()) || offer.mo118014W() || C27666h.m116406e(offer.mo118010S())) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), C27609f.C27615f.ds_primary_dark));
                linearLayout.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), C27609f.C27615f.blue_memo)));
                m116372j(offer, imageView);
            } else {
                Discount T6 = offer.mo118011T();
                if (T6 == null || (A = T6.mo117953A()) == null || (k = m116373k(A)) == null) {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), C27609f.C27615f.ds_primary_dark));
                    linearLayout.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), C27609f.C27615f.blue_memo)));
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), k.mo118121r()));
                    linearLayout.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), k.mo118120q())));
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }

    @C12580l
    /* renamed from: g */
    public static final SpannableString m116369g(@C12579k Offer offer, @C12579k Context context) {
        PromoType promoType;
        PromoType promoType2;
        boolean z;
        PromoType promoType3;
        boolean z2;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Discount T = offer.mo118011T();
        if (T != null) {
            promoType = T.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType == PromoType.RD) {
            if (offer.mo118009R().mo118169j() == 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                SpannableString spannableString = new SpannableString(context.getString(C27609f.C27627r.basket_price_discount_rd, new Object[]{C28782t.m119105b(Double.valueOf(offer.mo118009R().mo118169j()))}));
                spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, OfferDiscountType.RD.mo118121r())), 0, spannableString.length(), 18);
                return spannableString;
            }
        }
        Discount T2 = offer.mo118011T();
        if (T2 != null) {
            promoType2 = T2.mo117953A();
        } else {
            promoType2 = null;
        }
        if (promoType2 != PromoType.RI) {
            Discount T3 = offer.mo118011T();
            if (T3 != null) {
                promoType3 = T3.mo117953A();
            } else {
                promoType3 = null;
            }
            if (promoType3 != PromoType.PROMO) {
                return null;
            }
        }
        if (offer.mo118009R().mo118168i() == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        SpannableString spannableString2 = new SpannableString(context.getString(C27609f.C27627r.basket_price_discount_ri, new Object[]{C28782t.m119105b(Double.valueOf(offer.mo118009R().mo118168i()))}));
        spannableString2.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, OfferDiscountType.RI.mo118121r())), 0, spannableString2.length(), 18);
        return spannableString2;
    }

    /* renamed from: h */
    public static final int m116370h(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        int U = offer.mo118012U() + offer.mo118002K();
        if (U < offer.mo118006O()) {
            return offer.mo118006O();
        }
        return U;
    }

    /* renamed from: i */
    public static final int m116371i(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "<this>");
        int U = offer.mo118012U() - offer.mo118002K();
        if (U < offer.mo118006O()) {
            return 0;
        }
        return U;
    }

    /* renamed from: j */
    public static final void m116372j(@C12579k Offer offer, @C12579k ImageView imageView) {
        int i;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Intrinsics.checkNotNullParameter(imageView, C9127a0.f24709d);
        if (C27666h.m116405d(offer.mo118010S())) {
            i = OfferFlag.ORGANIC.mo118127w();
        } else if (offer.mo118014W()) {
            i = C27609f.C27617h.nutriscore_a;
        } else if (C27666h.m116406e(offer.mo118010S())) {
            i = OfferFlag.CLUB_MARCHE.mo118127w();
        } else {
            i = 0;
        }
        imageView.setImageResource(i);
    }

    @C12579k
    /* renamed from: k */
    public static final OfferDiscountType m116373k(@C12579k PromoType promoType) {
        Intrinsics.checkNotNullParameter(promoType, "<this>");
        switch (C27660a.$EnumSwitchMapping$0[promoType.ordinal()]) {
            case 1:
                return OfferDiscountType.PROMO;
            case 2:
                return OfferDiscountType.RI;
            case 3:
                return OfferDiscountType.RD;
            case 4:
                return OfferDiscountType.PF;
            case 5:
                return OfferDiscountType.TA;
            case 6:
                return OfferDiscountType.BUNDLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
