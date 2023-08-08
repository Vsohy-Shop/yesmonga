package com.carrefour.fid.android.presentation.models.extension;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.ecommerce.utils.C38211a;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.google.firebase.installations.local.C33093b;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.text.C11620r;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOfferProductModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferProductModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,800:1\n1747#2,3:801\n1603#2,9:805\n1855#2:814\n1856#2:816\n1612#2:817\n1549#2:818\n1620#2,3:819\n1855#2,2:822\n766#2:824\n857#2,2:825\n1045#2:827\n1855#2,2:828\n1477#2:830\n1502#2,3:831\n1505#2,3:841\n1045#2:848\n1054#2:849\n1549#2:850\n1620#2,3:851\n288#2,2:854\n288#2,2:856\n766#2:858\n857#2,2:859\n766#2:861\n857#2,2:862\n766#2:864\n857#2,2:865\n1549#2:867\n1620#2,3:868\n1549#2:871\n1620#2,3:872\n1549#2:875\n1620#2,3:876\n1549#2:879\n1620#2,3:880\n1603#2,9:883\n1855#2:892\n1856#2:894\n1612#2:895\n766#2:896\n857#2,2:897\n1179#2,2:899\n1253#2,4:901\n1#3:804\n1#3:815\n1#3:893\n361#4,7:834\n125#5:844\n152#5,3:845\n*S KotlinDebug\n*F\n+ 1 OfferProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferProductModelKt\n*L\n53#1:801,3\n509#1:805,9\n509#1:814\n509#1:816\n509#1:817\n522#1:818\n522#1:819,3\n532#1:822,2\n556#1:824\n556#1:825,2\n560#1:827\n560#1:828,2\n566#1:830\n566#1:831,3\n566#1:841,3\n575#1:848\n577#1:849\n580#1:850\n580#1:851,3\n580#1:854,2\n581#1:856,2\n584#1:858\n584#1:859,2\n588#1:861\n588#1:862,2\n592#1:864\n592#1:865,2\n595#1:867\n595#1:868,3\n663#1:871\n663#1:872,3\n666#1:875\n666#1:876,3\n708#1:879\n708#1:880,3\n781#1:883,9\n781#1:892\n781#1:894\n781#1:895\n782#1:896\n782#1:897,2\n783#1:899,2\n783#1:901,4\n509#1:815\n781#1:893\n566#1:834,7\n567#1:844\n567#1:845,3\n*E\n"})
public final class OfferProductModelKt {

    /* renamed from: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt$a */
    public /* synthetic */ class C38458a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore[] r0 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.A     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.B     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.C     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.D     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.E     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.C38458a.<clinit>():void");
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OfferProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferProductModelKt\n*L\n1#1,328:1\n575#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt$b */
    public static final class C38459b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Double.valueOf(((OfferDepartmentModel) ((Pair) t).mo21849e()).mo121691X()), Double.valueOf(((OfferDepartmentModel) ((Pair) t2).mo21849e()).mo121691X()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 OfferProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferProductModelKt\n*L\n1#1,328:1\n577#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt$c */
    public static final class C38460c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(((OfferProductModel) t2).mo121749t0(), ((OfferProductModel) t).mo121749t0());
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OfferProductModel.kt\ncom/carrefour/fid/android/presentation/models/extension/OfferProductModelKt\n*L\n1#1,328:1\n560#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt$d */
    public static final class C38461d<T> implements Comparator {
        public final int compare(T t, T t2) {
            String str;
            ProductModel o0 = ((OfferProductModel) t).mo121517o0();
            String str2 = null;
            if (o0 != null) {
                str = o0.mo121898z();
            } else {
                str = null;
            }
            ProductModel o02 = ((OfferProductModel) t2).mo121517o0();
            if (o02 != null) {
                str2 = o02.mo121898z();
            }
            return C11006g.m42424l(str, str2);
        }
    }

    /* renamed from: A */
    public static final boolean m159552A(@C12579k OfferProductModel offerProductModel, @C12579k List<? extends C38033d> list) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(list, "shoppingList");
        Iterable<C38033d> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38033d a : iterable) {
            String a2 = a.mo117724a();
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str = o0.mo121889s();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual((Object) a2, (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public static final boolean m159553B(@C12579k OfferProductModel offerProductModel) {
        String str;
        String w;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 == null || (w = o0.mo121894w()) == null) {
            str = null;
        } else {
            str = StringsKt__StringsKt.trim(w).toString();
        }
        return C11622t.equals(str, "france", true);
    }

    /* renamed from: C */
    public static final boolean m159554C(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static final boolean m159555D(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        int i;
        Integer o;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType != OfferDiscountType.RI) {
            return false;
        }
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (o = w2.mo115948o()) == null) {
            i = 0;
        } else {
            i = o.intValue();
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: E */
    public static final Boolean m159556E(@C12579k OfferProductModel offerProductModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Integer f0 = offerProductModel.mo121508f0();
        if (f0 == null) {
            return null;
        }
        if (f0.intValue() < offerProductModel.mo121519p0()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: F */
    public static final void m159557F(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            if (offerProductModel.mo121509g() == OfferAvailability.NOT_IN_STORE) {
                str = textView.getContext().getString(R.string.product_highlight_available_soon);
            } else if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
                str = textView.getContext().getString(R.string.product_highlight_unavailable);
            } else if (m159601w(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_bio);
            } else if (m159602x(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_family);
            } else if (m159603y(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_marche);
            } else {
                str = null;
            }
            textView.setText(str);
            if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
                textView.setVisibility(0);
                textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), 17170445)));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            } else if (m159601w(offerProductModel) || m159602x(offerProductModel) || m159603y(offerProductModel)) {
                textView.setVisibility(0);
                textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), R.color.blue_memo)));
                m159569R(offerProductModel, textView);
            } else {
                textView.setVisibility(4);
            }
        }
    }

    /* renamed from: G */
    public static final void m159558G(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        String str;
        OfferDiscountType z;
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        OfferDiscountType offerDiscountType3;
        OfferDiscountType offerDiscountType4;
        OfferDiscountType offerDiscountType5;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            if (offerProductModel.mo121509g() == OfferAvailability.NOT_IN_STORE) {
                str = textView.getContext().getString(R.string.product_highlight_available_soon);
            } else if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
                str = textView.getContext().getString(R.string.product_highlight_unavailable);
            } else if (m159601w(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_bio);
            } else if (m159602x(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_family);
            } else if (m159603y(offerProductModel)) {
                str = textView.getContext().getString(R.string.product_highlight_club_marche);
            } else {
                if (m159599u(offerProductModel)) {
                    OfferDiscountDomain w = offerProductModel.mo121523w();
                    if (w != null) {
                        offerDiscountType = w.mo115961z();
                    } else {
                        offerDiscountType = null;
                    }
                    if (offerDiscountType == OfferDiscountType.PF) {
                        str = textView.getContext().getString(R.string.product_highlight_pf);
                    } else {
                        OfferDiscountDomain w2 = offerProductModel.mo121523w();
                        if (w2 != null) {
                            offerDiscountType2 = w2.mo115961z();
                        } else {
                            offerDiscountType2 = null;
                        }
                        if (offerDiscountType2 == OfferDiscountType.PROMO) {
                            str = textView.getContext().getString(R.string.product_highlight_promo);
                        } else {
                            OfferDiscountDomain w3 = offerProductModel.mo121523w();
                            if (w3 != null) {
                                offerDiscountType3 = w3.mo115961z();
                            } else {
                                offerDiscountType3 = null;
                            }
                            if (offerDiscountType3 == OfferDiscountType.RD) {
                                str = textView.getContext().getString(R.string.product_highlight_rd);
                            } else {
                                OfferDiscountDomain w4 = offerProductModel.mo121523w();
                                if (w4 != null) {
                                    offerDiscountType4 = w4.mo115961z();
                                } else {
                                    offerDiscountType4 = null;
                                }
                                if (offerDiscountType4 == OfferDiscountType.RI) {
                                    str = textView.getContext().getString(R.string.product_highlight_ri);
                                } else {
                                    OfferDiscountDomain w5 = offerProductModel.mo121523w();
                                    if (w5 != null) {
                                        offerDiscountType5 = w5.mo115961z();
                                    } else {
                                        offerDiscountType5 = null;
                                    }
                                    if (offerDiscountType5 == OfferDiscountType.TA) {
                                        str = textView.getContext().getString(R.string.product_highlight_ta);
                                    }
                                }
                            }
                        }
                    }
                }
                str = null;
            }
            textView.setText(str);
            if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), 17170445)));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            } else if (m159601w(offerProductModel) || m159602x(offerProductModel) || m159603y(offerProductModel)) {
                textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), R.color.blue_memo)));
                m159569R(offerProductModel, textView);
            } else {
                OfferDiscountDomain w6 = offerProductModel.mo121523w();
                if (w6 == null || (z = w6.mo115961z()) == null) {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                    textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), R.color.blue_memo)));
                    C11079d2 d2Var = C11079d2.f28267a;
                } else {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), z.mo118121r()));
                    textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), z.mo118120q())));
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }

    /* renamed from: H */
    public static final void m159559H(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            String Z = offerProductModel.mo121505Z();
            if (Z == null || C11622t.isBlank(Z)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(offerProductModel.mo121505Z());
        }
    }

    /* renamed from: I */
    public static final void m159560I(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            ProductModel o0 = offerProductModel.mo121517o0();
            String str2 = null;
            if (o0 != null) {
                str = o0.mo121894w();
            } else {
                str = null;
            }
            int i = 0;
            if (str == null || C11622t.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                ProductModel o02 = offerProductModel.mo121517o0();
                if (o02 != null) {
                    str2 = o02.mo121894w();
                }
                textView.setText(str2);
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: J */
    public static final void m159561J(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        int i;
        Double d;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            if (m159554C(offerProductModel) || !m159599u(offerProductModel) || !m159600v(offerProductModel)) {
                i = 8;
            } else {
                OfferPriceDomain m0 = offerProductModel.mo121514m0();
                if (m0 != null) {
                    d = m0.mo116007l();
                } else {
                    d = null;
                }
                TextViewKt.m118962m(textView, d);
                TextViewKt.m118965p(textView);
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: K */
    public static final void m159562K(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView, @C12580l TextView textView2) {
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        if (m0 == null) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (m159554C(offerProductModel)) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView != null) {
                TextViewKt.m118963n(textView, m159583e(offerProductModel));
                if (m159601w(offerProductModel)) {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                    textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), R.color.blue_memo)));
                } else if (m159599u(offerProductModel)) {
                    OfferDiscountDomain w = offerProductModel.mo121523w();
                    if (!(w == null || (z = w.mo115961z()) == null)) {
                        textView.setTextColor(C17318d.m79723f(textView.getContext(), z.mo118121r()));
                        textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), z.mo118120q())));
                    }
                } else {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), R.color.ds_primary_dark));
                    textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), 17170445)));
                }
                textView.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setText(m0.mo116005j());
                textView2.setVisibility(0);
            }
        }
    }

    /* renamed from: L */
    public static final void m159563L(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        OfferDiscountDomain w;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            int i = 8;
            if (m159599u(offerProductModel) && (w = offerProductModel.mo121523w()) != null) {
                textView.setText(w.mo115956v());
                OfferDiscountType z = w.mo115961z();
                if (z != null) {
                    textView.setTextColor(C17318d.m79723f(textView.getContext(), z.mo118121r()));
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(z.mo118122w(), 0, 0, 0);
                    textView.setBackgroundTintList(ColorStateList.valueOf(C17318d.m79723f(textView.getContext(), z.mo118120q())));
                }
                Integer num = 0;
                i = num.intValue();
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: M */
    public static final void m159564M(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView == null) {
            return;
        }
        if (!m159599u(offerProductModel)) {
            textView.setVisibility(8);
        } else {
            m159563L(offerProductModel, textView);
        }
    }

    @C12580l
    /* renamed from: N */
    public static final SpannableString m159565N(@C12579k OfferProductModel offerProductModel, @C12579k Context context) {
        OfferDiscountType offerDiscountType;
        SpannableString spannableString;
        OfferDiscountType offerDiscountType2;
        OfferDiscountType offerDiscountType3;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        OfferPriceDomain m0 = offerProductModel.mo121514m0();
        if (m0 == null) {
            return null;
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        OfferDiscountType offerDiscountType4 = OfferDiscountType.RD;
        if (offerDiscountType == offerDiscountType4) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 == null || !w2.mo115955u()) {
                z = false;
            } else {
                z = true;
            }
            if (z && m0.mo116004i() != null && !Intrinsics.areEqual(m0.mo116004i(), 0.0d)) {
                spannableString = new SpannableString(context.getString(R.string.basket_price_discount_rd, new Object[]{C28782t.m119105b(m0.mo116004i())}));
                spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, offerDiscountType4.mo118121r())), 0, spannableString.length(), 18);
                return spannableString;
            }
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 != null) {
            offerDiscountType2 = w3.mo115961z();
        } else {
            offerDiscountType2 = null;
        }
        OfferDiscountType offerDiscountType5 = OfferDiscountType.RI;
        if (offerDiscountType2 != offerDiscountType5) {
            OfferDiscountDomain w4 = offerProductModel.mo121523w();
            if (w4 != null) {
                offerDiscountType3 = w4.mo115961z();
            } else {
                offerDiscountType3 = null;
            }
            if (offerDiscountType3 != OfferDiscountType.PROMO) {
                return null;
            }
        }
        if (m0.mo116002h() == null || Intrinsics.areEqual(m0.mo116002h(), 0.0d)) {
            return null;
        }
        spannableString = new SpannableString(context.getString(R.string.basket_price_discount_ri, new Object[]{C28782t.m119105b(m0.mo116002h())}));
        spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, offerDiscountType5.mo118121r())), 0, spannableString.length(), 18);
        return spannableString;
    }

    @C12579k
    /* renamed from: O */
    public static final SpannableString m159566O(@C12579k OfferProductModel offerProductModel, @C12579k Context context) {
        String str;
        int i;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str = w.mo115956v();
        } else {
            str = null;
        }
        SpannableString spannableString = new SpannableString(str);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            i = 17170445;
        } else {
            i = z.mo118121r();
        }
        spannableString.setSpan(new ForegroundColorSpan(C17318d.m79723f(context, i)), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: P */
    public static final int m159567P(@C12579k OfferProductModel offerProductModel) {
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (offerProductModel.mo121519p0() != 0) {
            return offerProductModel.mo121519p0() + m159585g(offerProductModel);
        }
        Integer h0 = offerProductModel.mo121510h0();
        if (h0 != null) {
            i = h0.intValue();
        } else {
            i = 1;
        }
        return i * m159585g(offerProductModel);
    }

    /* renamed from: Q */
    public static final int m159568Q(@C12579k OfferProductModel offerProductModel) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        int p0 = offerProductModel.mo121519p0();
        Integer X = offerProductModel.mo121503X();
        if (X != null) {
            i = X.intValue();
        } else {
            i = 1;
        }
        int i3 = p0 - i;
        Integer h0 = offerProductModel.mo121510h0();
        if (h0 != null) {
            i2 = h0.intValue();
        } else {
            i2 = 0;
        }
        if (i3 < i2) {
            return 0;
        }
        return i3;
    }

    /* renamed from: R */
    public static final void m159569R(@C12579k OfferProductModel offerProductModel, @C12580l TextView textView) {
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (textView != null) {
            if (m159601w(offerProductModel)) {
                i = OfferFlag.CLUB_BIO.mo118127w();
            } else if (m159602x(offerProductModel)) {
                i = OfferFlag.CLUB_FAMILY.mo118127w();
            } else if (m159603y(offerProductModel)) {
                i = OfferFlag.CLUB_MARCHE.mo118127w();
            } else {
                i = 0;
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @C12580l
    /* renamed from: S */
    public static final String m159570S(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountDomain w;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (!m159599u(offerProductModel) || (w = offerProductModel.mo121523w()) == null) {
            return null;
        }
        return w.mo115956v();
    }

    @C12579k
    /* renamed from: T */
    public static final List<OfferProductModel> m159571T(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40675p5(list, new C38460c());
    }

    @C12579k
    /* renamed from: U */
    public static final List<OfferProductModel> m159572U(@C12579k List<? extends OfferProductModel> list, @C12580l BasketDomain basketDomain) {
        BasketOfferDomain basketOfferDomain;
        List<BasketOfferDomain> B;
        Object obj;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<OfferProductModel> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductModel offerProductModel : iterable) {
            if (basketDomain == null || (B = basketDomain.mo115459B()) == null) {
                basketOfferDomain = null;
            } else {
                Iterator it = B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    OfferIdentifierDomain s = ((BasketOfferDomain) obj).mo115567s();
                    if (s != null) {
                        str = s.mo115986f();
                    } else {
                        str = null;
                    }
                    OfferIdentifierDomain W = offerProductModel.mo121502W();
                    if (W != null) {
                        str2 = W.mo115986f();
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                        break;
                    }
                }
                basketOfferDomain = (BasketOfferDomain) obj;
            }
            if (basketOfferDomain != null) {
                offerProductModel.mo121513j2(basketOfferDomain.mo115541B());
                offerProductModel.mo121501Q1(basketOfferDomain.mo115568t());
                offerProductModel.mo121504Y1(basketOfferDomain.mo115570u());
                offerProductModel.mo121506a2(basketOfferDomain.mo115572w());
                offerProductModel.mo121512i2(basketOfferDomain.mo115576z());
            } else {
                offerProductModel.mo121513j2(0);
                offerProductModel.mo121501Q1(offerProductModel.mo121503X());
                offerProductModel.mo121504Y1(offerProductModel.mo121508f0());
                offerProductModel.mo121506a2(offerProductModel.mo121510h0());
                offerProductModel.mo121512i2((Double) null);
            }
            arrayList.add(offerProductModel);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.offer.Offer m159573V(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferProductModel r62) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r62
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r0 = r62.mo121502W()
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.mo115986f()
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x001b
            r0 = r4
        L_0x001b:
            java.lang.String r0 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r0)
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r5 = r62.mo121502W()
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = r5.mo115984e()
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            if (r5 != 0) goto L_0x002e
            r5 = r4
        L_0x002e:
            java.lang.String r5 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r5)
            r2.<init>(r0, r5, r3)
            com.carrefour.fid.android.domain.models.OfferDiscountDomain r5 = r62.mo121523w()
            r6 = 10
            if (r5 == 0) goto L_0x0125
            java.lang.Double r7 = r5.mo115951r()
            double r9 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r7)
            java.lang.Integer r7 = r5.mo115948o()
            if (r7 == 0) goto L_0x0054
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            int r11 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            java.lang.String r7 = r5.mo115949p()
            if (r7 != 0) goto L_0x0061
            r12 = r4
            goto L_0x0062
        L_0x0061:
            r12 = r7
        L_0x0062:
            java.lang.String r7 = r5.mo115950q()
            if (r7 != 0) goto L_0x006a
            r13 = r4
            goto L_0x006b
        L_0x006a:
            r13 = r7
        L_0x006b:
            java.lang.Double r7 = r5.mo115952s()
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r7)
            java.lang.String r7 = r5.mo115956v()
            if (r7 != 0) goto L_0x007c
            r16 = r4
            goto L_0x007e
        L_0x007c:
            r16 = r7
        L_0x007e:
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r7 = r5.mo115961z()
            if (r7 != 0) goto L_0x0086
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r7 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PF
        L_0x0086:
            r17 = r7
            boolean r18 = r5.mo115955u()
            java.util.List r7 = r5.mo115953t()
            if (r7 != 0) goto L_0x0096
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0096:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = kotlin.collections.C10978t.m41495Y(r7, r6)
            r8.<init>(r0)
            java.util.Iterator r0 = r7.iterator()
        L_0x00a5:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r7)
            com.carrefour.fid.android.domain.models.product.Gtin r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r7)
            r8.add(r7)
            goto L_0x00a5
        L_0x00bd:
            java.lang.Long r0 = r5.mo115957w()
            long r20 = com.carrefour.fid.android.shared.extension.C28750d0.m119041c(r0)
            java.lang.Integer r0 = r5.mo115959x()
            int r22 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r0)
            java.util.List r0 = r5.mo115960y()
            if (r0 != 0) goto L_0x00d7
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00d7:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = kotlin.collections.C10978t.m41495Y(r0, r6)
            r5.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x00e6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0117
            java.lang.Object r7 = r0.next()
            com.carrefour.fid.android.domain.models.OfferDiscountArticle r7 = (com.carrefour.fid.android.domain.models.OfferDiscountArticle) r7
            com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle r6 = new com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle
            java.lang.String r19 = r7.mo115922e()
            if (r19 != 0) goto L_0x00fc
            r19 = r4
        L_0x00fc:
            java.lang.String r3 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r19)
            java.lang.Integer r7 = r7.mo115924f()
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r7)
            r19 = r0
            r0 = 0
            r6.<init>(r3, r7, r0)
            r5.add(r6)
            r3 = r0
            r0 = r19
            r6 = 10
            goto L_0x00e6
        L_0x0117:
            r0 = r3
            com.carrefour.fid.android.domain.models.offer.OfferDiscount r3 = new com.carrefour.fid.android.domain.models.offer.OfferDiscount
            r6 = r8
            r8 = r3
            r19 = r6
            r23 = r5
            r8.<init>(r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22, r23)
            r5 = r3
            goto L_0x0127
        L_0x0125:
            r0 = r3
            r5 = r0
        L_0x0127:
            com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain r3 = r62.mo121525y()
            if (r3 == 0) goto L_0x0142
            com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode r6 = new com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode
            java.lang.String r7 = r3.mo115970e()
            if (r7 != 0) goto L_0x0136
            r7 = r4
        L_0x0136:
            java.lang.Double r3 = r3.mo115972f()
            double r8 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            r6.<init>(r7, r8)
            goto L_0x0143
        L_0x0142:
            r6 = r0
        L_0x0143:
            java.lang.Integer r3 = r62.mo121503X()
            int r7 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.lang.Integer r3 = r62.mo121508f0()
            int r8 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.lang.Integer r3 = r62.mo121510h0()
            int r9 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r3)
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.domain.models.offer.Prices r23 = new com.carrefour.fid.android.domain.models.offer.Prices
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x0176
            java.lang.Double r3 = r3.mo116007l()
            if (r3 == 0) goto L_0x0176
            double r11 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            goto L_0x0177
        L_0x0176:
            r3 = r0
        L_0x0177:
            double r12 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x0190
            java.lang.Double r3 = r3.mo116006k()
            if (r3 == 0) goto L_0x0190
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r14)
            goto L_0x0191
        L_0x0190:
            r3 = r0
        L_0x0191:
            double r14 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x01a0
            java.lang.Double r3 = r3.mo116007l()
            goto L_0x01a1
        L_0x01a0:
            r3 = r0
        L_0x01a1:
            double r16 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x01b0
            java.lang.String r3 = r3.mo116005j()
            goto L_0x01b1
        L_0x01b0:
            r3 = r0
        L_0x01b1:
            if (r3 != 0) goto L_0x01b6
            r18 = r4
            goto L_0x01b8
        L_0x01b6:
            r18 = r3
        L_0x01b8:
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x01c3
            java.lang.Double r3 = r3.mo116002h()
            goto L_0x01c4
        L_0x01c3:
            r3 = r0
        L_0x01c4:
            double r19 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            com.carrefour.fid.android.domain.models.OfferPriceDomain r3 = r62.mo121514m0()
            if (r3 == 0) goto L_0x01d3
            java.lang.Double r3 = r3.mo116004i()
            goto L_0x01d4
        L_0x01d3:
            r3 = r0
        L_0x01d4:
            double r21 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            r11 = r23
            r11.<init>(r12, r14, r16, r18, r19, r21)
            java.lang.Double r3 = r62.mo121515n0()
            if (r3 == 0) goto L_0x01ed
            double r12 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r12)
            r12 = r3
            goto L_0x01ee
        L_0x01ed:
            r12 = r0
        L_0x01ee:
            java.lang.Double r3 = r62.mo121741j0()
            if (r3 == 0) goto L_0x01fe
            double r13 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r13)
            r13 = r3
            goto L_0x01ff
        L_0x01fe:
            r13 = r0
        L_0x01ff:
            com.carrefour.fid.android.presentation.models.ProductModel r3 = r62.mo121517o0()
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = r3.mo121889s()
            goto L_0x020b
        L_0x020a:
            r3 = r0
        L_0x020b:
            if (r3 != 0) goto L_0x020e
            r3 = r4
        L_0x020e:
            java.lang.String r32 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r3)
            com.carrefour.fid.android.presentation.models.ProductModel r3 = r62.mo121517o0()
            if (r3 == 0) goto L_0x0259
            com.carrefour.fid.android.domain.models.ProductCategoryDomain r3 = r3.mo121887q()
            if (r3 == 0) goto L_0x0259
            java.lang.String r34 = r3.mo116510h()
            java.lang.String r35 = r3.mo116513j()
            int r36 = r3.mo116512i()
            java.lang.String r37 = r3.mo116514k()
            java.lang.String r38 = new java.lang.String
            r38.<init>()
            com.carrefour.fid.android.domain.models.category.CategoryType r39 = com.carrefour.fid.android.domain.models.category.CategoryType.RAYON
            java.util.List r41 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            java.util.List r40 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            int r14 = r3.mo116512i()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r3 = r3.mo116513j()
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r14, r3)
            java.util.Map r42 = kotlin.collections.C10975r0.m41401k(r3)
            com.carrefour.fid.android.domain.models.category.ProductCategory r3 = new com.carrefour.fid.android.domain.models.category.ProductCategory
            r33 = r3
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x025b
        L_0x0259:
            r33 = r0
        L_0x025b:
            java.util.List r3 = r62.mo121499M()
            if (r3 != 0) goto L_0x0265
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0265:
            r34 = r3
            com.carrefour.fid.android.presentation.models.ProductModel r3 = r62.mo121517o0()
            if (r3 == 0) goto L_0x0272
            java.util.List r3 = r3.mo121892u()
            goto L_0x0273
        L_0x0272:
            r3 = r0
        L_0x0273:
            if (r3 != 0) goto L_0x0279
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0279:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.C10978t.m41495Y(r3, r15)
            r14.<init>(r15)
            java.util.Iterator r3 = r3.iterator()
        L_0x028a:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x02a8
            java.lang.Object r15 = r3.next()
            com.carrefour.fid.android.domain.models.ProductPictureDomain r15 = (com.carrefour.fid.android.domain.models.ProductPictureDomain) r15
            com.carrefour.fid.android.domain.models.product.ProductPicture r0 = new com.carrefour.fid.android.domain.models.product.ProductPicture
            java.lang.String r11 = r15.mo116585e()
            int r15 = r15.getOrder()
            r0.<init>(r11, r15)
            r14.add(r0)
            r0 = 0
            goto L_0x028a
        L_0x02a8:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x02b5
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore r0 = r0.mo121893v()
            r36 = r0
            goto L_0x02b7
        L_0x02b5:
            r36 = 0
        L_0x02b7:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x02c2
            java.lang.String r0 = r0.mo121894w()
            goto L_0x02c3
        L_0x02c2:
            r0 = 0
        L_0x02c3:
            if (r0 != 0) goto L_0x02c8
            r37 = r4
            goto L_0x02ca
        L_0x02c8:
            r37 = r0
        L_0x02ca:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x02d5
            java.lang.String r0 = r0.mo121896x()
            goto L_0x02d6
        L_0x02d5:
            r0 = 0
        L_0x02d6:
            if (r0 != 0) goto L_0x02db
            r38 = r4
            goto L_0x02dd
        L_0x02db:
            r38 = r0
        L_0x02dd:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = r0.mo121897y()
            goto L_0x02e9
        L_0x02e8:
            r0 = 0
        L_0x02e9:
            if (r0 != 0) goto L_0x02ec
            r0 = r4
        L_0x02ec:
            java.lang.String r39 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r0)
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x02fb
            java.lang.String r3 = r0.mo121898z()
            goto L_0x02fc
        L_0x02fb:
            r3 = 0
        L_0x02fc:
            if (r3 != 0) goto L_0x0301
            r40 = r4
            goto L_0x0303
        L_0x0301:
            r40 = r3
        L_0x0303:
            java.lang.String r41 = new java.lang.String
            r41.<init>()
            java.lang.String r42 = new java.lang.String
            r42.<init>()
            java.lang.String r43 = new java.lang.String
            r43.<init>()
            java.util.List r53 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            r3 = 0
            if (r0 == 0) goto L_0x0324
            boolean r0 = r0.mo121867A()
            r57 = r0
            goto L_0x0326
        L_0x0324:
            r57 = r3
        L_0x0326:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x0333
            boolean r0 = r0.mo121888r()
            r59 = r0
            goto L_0x0335
        L_0x0333:
            r59 = r3
        L_0x0335:
            com.carrefour.fid.android.presentation.models.ProductModel r0 = r62.mo121517o0()
            if (r0 == 0) goto L_0x0345
            java.lang.String r0 = r0.mo121886p()
            if (r0 != 0) goto L_0x0342
            goto L_0x0345
        L_0x0342:
            r58 = r0
            goto L_0x0347
        L_0x0345:
            r58 = r4
        L_0x0347:
            com.carrefour.fid.android.domain.models.product.Product r0 = new com.carrefour.fid.android.domain.models.product.Product
            r31 = r0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r60 = 25427968(0x1840000, float:4.848914E-38)
            r61 = 0
            r35 = r14
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            int r15 = r62.mo121519p0()
            r17 = 0
            boolean r18 = r62.mo121497A1()
            r19 = 0
            com.carrefour.fid.android.presentation.models.ProductModel r4 = r62.mo121517o0()
            if (r4 == 0) goto L_0x0385
            boolean r4 = r4.mo121868B()
            r20 = r4
            goto L_0x0387
        L_0x0385:
            r20 = r3
        L_0x0387:
            r21 = 0
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r22 = r62.mo121509g()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r4 = r62.mo121509g()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r11 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            r14 = 1
            if (r4 != r11) goto L_0x0399
            r31 = r14
            goto L_0x039b
        L_0x0399:
            r31 = r3
        L_0x039b:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = r62.mo121509g()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r4 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.NOT_IN_STORE
            if (r1 != r4) goto L_0x03a6
            r32 = r14
            goto L_0x03a8
        L_0x03a6:
            r32 = r3
        L_0x03a8:
            r24 = 0
            r25 = 0
            java.lang.String r26 = ""
            r27 = 0
            java.util.List r28 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r29 = 33816576(0x2040000, float:9.697828E-38)
            r30 = 0
            com.carrefour.fid.android.domain.models.offer.Offer r33 = new com.carrefour.fid.android.domain.models.offer.Offer
            r1 = r33
            r3 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r23
            r11 = 0
            r14 = r0
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r31
            r23 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159573V(com.carrefour.fid.android.presentation.models.OfferProductModel):com.carrefour.fid.android.domain.models.offer.Offer");
    }

    @C12579k
    /* renamed from: W */
    public static final OfferIdentifier m159574W(@C12579k OfferProductModel offerProductModel) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        String b = Gtin.m157308b(str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115984e();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        return new OfferIdentifier(b, ProductReference.m157466b(str3), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: X */
    public static final Map<String, Integer> m159575X(@C12579k List<? extends OfferProductModel> list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<OfferProductModel> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductModel offerProductModel : iterable) {
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str = o0.mo121889s();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            arrayList.add(C11078d1.m42659a(str, Integer.valueOf(offerProductModel.mo121519p0())));
        }
        return C10977s0.m41426B0(arrayList);
    }

    /* renamed from: Y */
    public static final void m159576Y(@C12579k OfferProductModel offerProductModel, @C12580l ImageButton imageButton) {
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (imageButton != null) {
            imageButton.setEnabled(true);
            if (offerProductModel.mo121519p0() > 0) {
                i = 8;
            } else {
                i = 0;
            }
            imageButton.setVisibility(i);
        }
    }

    @C12579k
    /* renamed from: Z */
    public static final List<OfferModel> m159577Z(@C12579k List<? extends OfferProductModel> list) {
        ProductCategoryDomain q;
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List i = C10976s.m41417i();
        OfferDepartmentModel offerDepartmentModel = null;
        for (OfferProductModel offerProductModel : CollectionsKt___CollectionsKt.m40675p5(list, C11006g.m42420h(OfferProductModelKt$withDepartment$1$1.f97592f, OfferProductModelKt$withDepartment$1$2.f97593f))) {
            ProductModel o0 = offerProductModel.mo121517o0();
            if (!(o0 == null || (q = o0.mo121887q()) == null)) {
                String j = q.mo116513j();
                if (offerDepartmentModel != null) {
                    str = offerDepartmentModel.mo121689Q();
                } else {
                    str = null;
                }
                if (!C11622t.equals(j, str, true)) {
                    offerDepartmentModel = new OfferDepartmentModel(String.valueOf(q.mo116510h()), q.mo116513j(), offerProductModel.mo121519p0(), C28782t.m119111h(offerProductModel.mo121751u0()));
                    i.add(offerDepartmentModel);
                } else if (offerDepartmentModel != null) {
                    offerDepartmentModel.mo121692Z(offerDepartmentModel.mo121688M() + offerProductModel.mo121519p0());
                }
                i.add(offerProductModel);
            }
        }
        i.addAll(m159579a0(list));
        return C10976s.m41409a(i);
    }

    /* renamed from: a */
    public static final boolean m159578a(@C12579k OfferProductModel offerProductModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (offerProductModel.mo121509g() != OfferAvailability.AVAILABLE) {
            return false;
        }
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            z = o0.mo121888r();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: a0 */
    public static final List<OfferModel> m159579a0(@C12579k List<? extends OfferProductModel> list) {
        ProductCategoryDomain productCategoryDomain;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List i = C10976s.m41417i();
        ArrayList<OfferProductModel> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ProductModel o0 = ((OfferProductModel) next).mo121517o0();
            if (o0 != null) {
                productCategoryDomain = o0.mo121887q();
            } else {
                productCategoryDomain = null;
            }
            if (productCategoryDomain == null) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            String str = new String();
            int i2 = 0;
            for (OfferProductModel p0 : arrayList) {
                i2 += p0.mo121519p0();
            }
            i.add(new OfferDepartmentModel(str, "", i2, 0.0d, 8, (DefaultConstructorMarker) null));
            for (OfferProductModel add : CollectionsKt___CollectionsKt.m40675p5(arrayList, new C38461d())) {
                i.add(add);
            }
        }
        return C10976s.m41409a(i);
    }

    /* renamed from: b */
    public static final int m159580b(@C12579k List<? extends OfferProductModel> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((OfferProductModel) next).mo121509g() == OfferAvailability.AVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    @C12579k
    /* renamed from: c */
    public static final HashMap<String, CategoryModel> m159581c(@C12579k List<? extends OfferProductModel> list) {
        ProductCategoryDomain productCategoryDomain;
        ProductCategoryDomain productCategoryDomain2;
        ProductCategoryDomain productCategoryDomain3;
        String str;
        String str2;
        String str3;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (OfferProductModel o0 : list) {
            ProductModel o02 = o0.mo121517o0();
            if (o02 != null) {
                arrayList.add(o02);
            }
        }
        ArrayList<ProductModel> arrayList2 = new ArrayList<>();
        for (Object next : arrayList) {
            if (((ProductModel) next).mo121889s() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(arrayList2, 10)), 16));
        for (ProductModel productModel : arrayList2) {
            ProductCategoryDomain q = productModel.mo121887q();
            String str4 = null;
            if (q != null) {
                productCategoryDomain = q.mo116515l();
            } else {
                productCategoryDomain = null;
            }
            if (productCategoryDomain != null) {
                productCategoryDomain2 = productCategoryDomain.mo116515l();
            } else {
                productCategoryDomain2 = null;
            }
            if (productCategoryDomain2 != null) {
                productCategoryDomain3 = productCategoryDomain2.mo116515l();
            } else {
                productCategoryDomain3 = null;
            }
            String s = productModel.mo121889s();
            Intrinsics.checkNotNull(s);
            if (q != null) {
                str = q.mo116513j();
            } else {
                str = null;
            }
            if (productCategoryDomain != null) {
                str2 = productCategoryDomain.mo116513j();
            } else {
                str2 = null;
            }
            if (productCategoryDomain2 != null) {
                str3 = productCategoryDomain2.mo116513j();
            } else {
                str3 = null;
            }
            if (productCategoryDomain3 != null) {
                str4 = productCategoryDomain3.mo116513j();
            }
            Pair pair = new Pair(s, new CategoryModel(str, str2, str3, str4));
            linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static final String m159582d(List<? extends OfferProductModel> list, String str) {
        Object obj;
        Object obj2;
        ProductModel o0;
        ProductCategoryDomain q;
        String j;
        String str2;
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            ProductCategoryDomain productCategoryDomain = null;
            if (!it.hasNext()) {
                break;
            }
            ProductModel o02 = ((OfferProductModel) it.next()).mo121517o0();
            if (o02 != null) {
                productCategoryDomain = o02.mo121887q();
            }
            arrayList.add(productCategoryDomain);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            ProductCategoryDomain productCategoryDomain2 = (ProductCategoryDomain) obj;
            if (productCategoryDomain2 != null) {
                str2 = productCategoryDomain2.mo116510h();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual((Object) String.valueOf(str2), (Object) str)) {
                break;
            }
        }
        ProductCategoryDomain productCategoryDomain3 = (ProductCategoryDomain) obj;
        if (productCategoryDomain3 != null && (j = productCategoryDomain3.mo116513j()) != null) {
            return j;
        }
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (Intrinsics.areEqual((Object) String.valueOf(((OfferProductModel) obj2).mo121739e0()), (Object) str)) {
                break;
            }
        }
        OfferProductModel offerProductModel = (OfferProductModel) obj2;
        if (offerProductModel == null || (o0 = offerProductModel.mo121517o0()) == null || (q = o0.mo121887q()) == null) {
            return null;
        }
        return q.mo116513j();
    }

    @C12580l
    /* renamed from: e */
    public static final String m159583e(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        OfferDiscountType offerDiscountType3;
        double d;
        double d2;
        Double l;
        Double l2;
        Double k;
        Double k2;
        Double l3;
        Double s;
        Double s2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType == OfferDiscountType.PF) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 == null || (s2 = w2.mo115952s()) == null) {
                return null;
            }
            return s2.toString();
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 != null) {
            offerDiscountType2 = w3.mo115961z();
        } else {
            offerDiscountType2 = null;
        }
        if (offerDiscountType2 == OfferDiscountType.RD) {
            OfferDiscountDomain w4 = offerProductModel.mo121523w();
            if (w4 == null || (s = w4.mo115952s()) == null) {
                return null;
            }
            return s.toString();
        }
        OfferDiscountDomain w5 = offerProductModel.mo121523w();
        if (w5 != null) {
            offerDiscountType3 = w5.mo115961z();
        } else {
            offerDiscountType3 = null;
        }
        if (offerDiscountType3 == OfferDiscountType.RI) {
            OfferPriceDomain m0 = offerProductModel.mo121514m0();
            if (m0 == null || (l3 = m0.mo116007l()) == null) {
                return null;
            }
            return l3.toString();
        }
        OfferPriceDomain m02 = offerProductModel.mo121514m0();
        if (m02 == null || (k2 = m02.mo116006k()) == null) {
            d = 0.0d;
        } else {
            d = k2.doubleValue();
        }
        if (d > 0.0d) {
            OfferPriceDomain m03 = offerProductModel.mo121514m0();
            if (m03 == null || (k = m03.mo116006k()) == null) {
                return null;
            }
            return k.toString();
        }
        OfferPriceDomain m04 = offerProductModel.mo121514m0();
        if (m04 == null || (l2 = m04.mo116007l()) == null) {
            d2 = 0.0d;
        } else {
            d2 = l2.doubleValue();
        }
        if (d2 <= 0.0d) {
            return C38211a.f96779a.mo119636a(offerProductModel.mo121514m0());
        }
        OfferPriceDomain m05 = offerProductModel.mo121514m0();
        if (m05 == null || (l = m05.mo116007l()) == null) {
            return null;
        }
        return l.toString();
    }

    /* renamed from: f */
    public static final double m159584f(@C12579k OfferProductModel offerProductModel) {
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        String e = m159583e(offerProductModel);
        if (e == null || (doubleOrNull = C11620r.toDoubleOrNull(e)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    /* renamed from: g */
    public static final int m159585g(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Integer X = offerProductModel.mo121503X();
        if (X != null) {
            return X.intValue();
        }
        return 1;
    }

    /* renamed from: h */
    public static final int m159586h(@C12579k List<? extends OfferProductModel> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((OfferProductModel) next).mo121509g() == OfferAvailability.NOT_IN_STORE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    @C12580l
    /* renamed from: i */
    public static final NutriscoreComponent.C37157a m159587i(@C12579k OfferProductModel offerProductModel, boolean z, @C12580l NutriscoreComponent.Size size) {
        ProductNutriScore v;
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 == null || (v = o0.mo121893v()) == null) {
            return null;
        }
        int i2 = C38458a.$EnumSwitchMapping$0[v.ordinal()];
        if (i2 == 1) {
            i = R.drawable.ds_pa_nutriscorea;
        } else if (i2 == 2) {
            i = R.drawable.ds_pa_nutriscoreb;
        } else if (i2 == 3) {
            i = R.drawable.ds_pa_nutriscorec;
        } else if (i2 == 4) {
            i = R.drawable.ds_pa_nutriscored;
        } else if (i2 == 5) {
            i = R.drawable.ds_pa_nutriscoree;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new NutriscoreComponent.C37157a(v.mo118184q(), i, z, size);
    }

    /* renamed from: j */
    public static /* synthetic */ NutriscoreComponent.C37157a m159588j(OfferProductModel offerProductModel, boolean z, NutriscoreComponent.Size size, int i, Object obj) {
        if ((i & 2) != 0) {
            size = null;
        }
        return m159587i(offerProductModel, z, size);
    }

    @C11395k(message = "Use getPrice from OfferProductDomain instead", replaceWith = @C11587t0(expression = "OfferProductDomain@getPrice", imports = {}))
    /* renamed from: k */
    public static final float m159589k(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        double d;
        Double l;
        Double k;
        Double k2;
        Double l2;
        Double s;
        Double s2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        OfferDiscountType offerDiscountType3 = null;
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        double d2 = 0.0d;
        if (offerDiscountType == OfferDiscountType.PF) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (!(w2 == null || (s2 = w2.mo115952s()) == null)) {
                d2 = s2.doubleValue();
            }
        } else {
            OfferDiscountDomain w3 = offerProductModel.mo121523w();
            if (w3 != null) {
                offerDiscountType2 = w3.mo115961z();
            } else {
                offerDiscountType2 = null;
            }
            if (offerDiscountType2 == OfferDiscountType.RD) {
                OfferDiscountDomain w4 = offerProductModel.mo121523w();
                if (!(w4 == null || (s = w4.mo115952s()) == null)) {
                    d2 = s.doubleValue();
                }
            } else {
                OfferDiscountDomain w5 = offerProductModel.mo121523w();
                if (w5 != null) {
                    offerDiscountType3 = w5.mo115961z();
                }
                if (offerDiscountType3 == OfferDiscountType.RI) {
                    OfferPriceDomain m0 = offerProductModel.mo121514m0();
                    if (!(m0 == null || (l2 = m0.mo116007l()) == null)) {
                        d2 = l2.doubleValue();
                    }
                } else {
                    OfferPriceDomain m02 = offerProductModel.mo121514m0();
                    if (m02 == null || (k2 = m02.mo116006k()) == null) {
                        d = 0.0d;
                    } else {
                        d = k2.doubleValue();
                    }
                    if (d > 0.0d) {
                        OfferPriceDomain m03 = offerProductModel.mo121514m0();
                        if (!(m03 == null || (k = m03.mo116006k()) == null)) {
                            d2 = k.doubleValue();
                        }
                    } else {
                        OfferPriceDomain m04 = offerProductModel.mo121514m0();
                        if (!(m04 == null || (l = m04.mo116007l()) == null)) {
                            d2 = l.doubleValue();
                        }
                    }
                }
            }
        }
        return (float) d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r7 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r7 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (r7 == null) goto L_0x0081;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m159590l(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferProductModel r7, @org.jetbrains.annotations.C12579k android.content.res.Resources r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7.mo121519p0()
            if (r0 != 0) goto L_0x001d
            r7 = 2131951712(0x7f130060, float:1.9539846E38)
            java.lang.String r7 = r8.getString(r7)
            java.lang.String r8 = "resources.getString(R.st…roduct_in_basket_removed)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        L_0x001d:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r7.mo121519p0()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r2 = 2131951716(0x7f130064, float:1.9539854E38)
            java.lang.String r1 = r8.getString(r2, r1)
            java.lang.String r2 = "resources.getString(\n   …quantity.toString()\n    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r2 = com.carrefour.fid.android.presentation.models.mapper.ProductCardMapperKt.m159738k(r7)
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0048
            java.lang.String r7 = com.carrefour.fid.android.presentation.models.mapper.ProductCardMapperKt.m159734g(r7, r8)
            if (r7 != 0) goto L_0x0046
            goto L_0x0081
        L_0x0046:
            r4 = r7
            goto L_0x0081
        L_0x0048:
            com.carrefour.fid.android.domain.models.OfferDiscountDomain r2 = r7.mo121523w()
            r5 = 0
            if (r2 == 0) goto L_0x0054
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r2 = r2.mo115961z()
            goto L_0x0055
        L_0x0054:
            r2 = r5
        L_0x0055:
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r6 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI
            if (r2 != r6) goto L_0x0060
            java.lang.String r7 = com.carrefour.fid.android.presentation.models.mapper.ProductCardMapperKt.m159731d(r7, r8)
            if (r7 != 0) goto L_0x0046
            goto L_0x0081
        L_0x0060:
            com.carrefour.fid.android.domain.models.OfferDiscountDomain r2 = r7.mo121523w()
            if (r2 == 0) goto L_0x006a
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r5 = r2.mo115961z()
        L_0x006a:
            com.carrefour.fid.android.domain.models.offer.OfferDiscountType r2 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD
            if (r5 != r2) goto L_0x0081
            java.lang.String r7 = com.carrefour.fid.android.presentation.models.mapper.ProductCardMapperKt.m159732e(r7, r8)
            if (r7 == 0) goto L_0x0081
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r7
            r7 = 2131951685(0x7f130045, float:1.9539791E38)
            java.lang.String r7 = r8.getString(r7, r0)
            if (r7 != 0) goto L_0x0046
        L_0x0081:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159590l(com.carrefour.fid.android.presentation.models.OfferProductModel, android.content.res.Resources):java.lang.String");
    }

    @C12579k
    /* renamed from: m */
    public static final String m159591m(@C12579k List<? extends OfferProductModel> list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (OfferProductModel o0 : list) {
            ProductModel o02 = o0.mo121517o0();
            if (o02 != null) {
                str = o02.mo121889s();
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return CollectionsKt___CollectionsKt.m40639h3(arrayList, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
    }

    @C12580l
    /* renamed from: n */
    public static final String m159592n(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        OfferDiscountType offerDiscountType2;
        OfferDiscountType offerDiscountType3;
        double d;
        Double l;
        Double k;
        Double k2;
        Double l2;
        Double s;
        Double s2;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType == OfferDiscountType.PF) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 == null || (s2 = w2.mo115952s()) == null) {
                return null;
            }
            return s2.toString();
        }
        OfferDiscountDomain w3 = offerProductModel.mo121523w();
        if (w3 != null) {
            offerDiscountType2 = w3.mo115961z();
        } else {
            offerDiscountType2 = null;
        }
        if (offerDiscountType2 == OfferDiscountType.RD) {
            OfferDiscountDomain w4 = offerProductModel.mo121523w();
            if (w4 == null || (s = w4.mo115952s()) == null) {
                return null;
            }
            return s.toString();
        }
        OfferDiscountDomain w5 = offerProductModel.mo121523w();
        if (w5 != null) {
            offerDiscountType3 = w5.mo115961z();
        } else {
            offerDiscountType3 = null;
        }
        if (offerDiscountType3 == OfferDiscountType.RI) {
            OfferPriceDomain m0 = offerProductModel.mo121514m0();
            if (m0 == null || (l2 = m0.mo116007l()) == null) {
                return null;
            }
            return l2.toString();
        }
        OfferPriceDomain m02 = offerProductModel.mo121514m0();
        if (m02 == null || (k2 = m02.mo116006k()) == null) {
            d = 0.0d;
        } else {
            d = k2.doubleValue();
        }
        if (d > 0.0d) {
            OfferPriceDomain m03 = offerProductModel.mo121514m0();
            if (m03 == null || (k = m03.mo116006k()) == null) {
                return null;
            }
            return k.toString();
        }
        OfferPriceDomain m04 = offerProductModel.mo121514m0();
        if (m04 == null || (l = m04.mo116007l()) == null) {
            return null;
        }
        return l.toString();
    }

    @C12579k
    /* renamed from: o */
    public static final String m159593o(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, OfferProductModelKt$getTagPriceList$1.f97590f, 30, (Object) null);
    }

    @C12579k
    /* renamed from: p */
    public static final String m159594p(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, OfferProductModelKt$getTagQuantityList$1.f97591f, 30, (Object) null);
    }

    /* renamed from: q */
    public static final int m159595q(@C12579k List<? extends OfferProductModel> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((OfferProductModel) next).mo121509g() == OfferAvailability.UNAVAILABLE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    @C12579k
    /* renamed from: r */
    public static final List<Pair<OfferDepartmentModel, List<OfferProductModel>>> m159596r(@C12579k List<? extends OfferProductModel> list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String e0 = ((OfferProductModel) next).mo121739e0();
            Object obj = linkedHashMap.get(e0);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(e0, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2 == null) {
                str2 = "";
            }
            String d = m159582d(list, str2);
            if (d == null) {
                d = "Department no found";
            }
            String str3 = d;
            String str4 = (String) entry.getKey();
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            arrayList.add(C11078d1.m42659a(new OfferDepartmentModel(str, str3, ((Collection) entry.getValue()).size(), C28782t.m119111h(((OfferProductModel) CollectionsKt___CollectionsKt.m40706w2((List) entry.getValue())).mo121751u0())), entry.getValue()));
        }
        return CollectionsKt___CollectionsKt.m40675p5(arrayList, new C38459b());
    }

    /* renamed from: s */
    public static final boolean m159597s(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (m159599u(offerProductModel)) {
            OfferDiscountDomain w = offerProductModel.mo121523w();
            if (w != null) {
                offerDiscountType = w.mo115961z();
            } else {
                offerDiscountType = null;
            }
            if (offerDiscountType == OfferDiscountType.PF) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m159598t(@C12579k OfferProductModel offerProductModel) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str = o0.mo121894w();
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

    /* renamed from: u */
    public static final boolean m159599u(@C12579k OfferProductModel offerProductModel) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str = w.mo115956v();
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

    /* renamed from: v */
    public static final boolean m159600v(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        OfferDiscountDomain w = offerProductModel.mo121523w();
        OfferDiscountType offerDiscountType2 = null;
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType != OfferDiscountType.PROMO) {
            OfferDiscountDomain w2 = offerProductModel.mo121523w();
            if (w2 != null) {
                offerDiscountType2 = w2.mo115961z();
            }
            if (offerDiscountType2 == OfferDiscountType.PF) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public static final boolean m159601w(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        List<OfferFlag> M = offerProductModel.mo121499M();
        if (M == null || !M.contains(OfferFlag.CLUB_BIO)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static final boolean m159602x(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        List<OfferFlag> M = offerProductModel.mo121499M();
        if (M == null || !M.contains(OfferFlag.CLUB_FAMILY)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m159603y(@C12579k OfferProductModel offerProductModel) {
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        List<OfferFlag> M = offerProductModel.mo121499M();
        if (M == null || !M.contains(OfferFlag.CLUB_MARCHE)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static final boolean m159604z(@C12579k OfferProductModel offerProductModel) {
        OfferDiscountType offerDiscountType;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        if (m159599u(offerProductModel)) {
            OfferDiscountDomain w = offerProductModel.mo121523w();
            if (w != null) {
                offerDiscountType = w.mo115961z();
            } else {
                offerDiscountType = null;
            }
            if (offerDiscountType == OfferDiscountType.RD) {
                return true;
            }
        }
        return false;
    }
}
