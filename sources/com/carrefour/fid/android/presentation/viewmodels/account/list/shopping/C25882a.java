package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13790b;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28536f1;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28576p0;
import com.carrefour.fid.android.shared.constant.C28612y1;
import com.carrefour.fid.android.tracking.C28994a;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListShoppingAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListShoppingAnalytics.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/AccountListShoppingAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1360#2:611\n1446#2,2:612\n1549#2:614\n1620#2,3:615\n1448#2,3:618\n1864#2,2:621\n1559#2:623\n1590#2,4:624\n1866#2:628\n1864#2,2:629\n1559#2:631\n1590#2,4:632\n1866#2:636\n*S KotlinDebug\n*F\n+ 1 AccountListShoppingAnalytics.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/AccountListShoppingAnalytics\n*L\n62#1:611\n62#1:612,2\n62#1:614\n62#1:615,3\n62#1:618,3\n64#1:621,2\n72#1:623\n72#1:624,4\n64#1:628\n93#1:629,2\n101#1:631\n101#1:632,4\n93#1:636\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.a */
public final class C25882a {

    /* renamed from: f */
    public static final int f63359f = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63360a;
    @C12579k

    /* renamed from: b */
    public final C13814a f63361b;
    @C12579k

    /* renamed from: c */
    public final C28994a f63362c;

    /* renamed from: d */
    public boolean f63363d;

    /* renamed from: e */
    public int f63364e;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.a$a */
    public /* synthetic */ class C25883a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen[] r0 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.BASKET_BUILDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.ACCOUNT_LIST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a.C25883a.<clinit>():void");
        }
    }

    @Inject
    public C25882a(@C12579k C13783a aVar, @C12579k C13814a aVar2, @C12579k C28994a aVar3) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        Intrinsics.checkNotNullParameter(aVar3, "audienceTrackingAdapter");
        this.f63360a = aVar;
        this.f63361b = aVar2;
        this.f63362c = aVar3;
    }

    /* renamed from: a */
    public final String mo75144a(AccountListFragment.ParentScreen parentScreen) {
        int i = C25883a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "mes-produits";
        }
        if (i == 2) {
            return "listes";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final String mo75145b(AccountListFragment.ParentScreen parentScreen) {
        int i = C25883a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return C28536f1.f69211l;
        }
        if (i == 2) {
            return C28576p0.f69680c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public final String mo75146c(AccountListFragment.ParentScreen parentScreen) {
        int i = C25883a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "mes-produits";
        }
        if (i == 2) {
            return "listes";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public final void mo75147d(@C12579k List<C38115c> list, @C12579k AccountListFragment.ParentScreen parentScreen) {
        int i;
        String str;
        List<C38115c> list2 = list;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(list2, "listProducts");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            C38115c cVar = (C38115c) it.next();
            Iterable<PlpOffer> F = cVar.mo118855F();
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(F, 10));
            for (PlpOffer pair : F) {
                arrayList2.add(new Pair(cVar, pair));
            }
            C10994x.m42360n0(arrayList, arrayList2);
        }
        if (this.f63364e != arrayList.size()) {
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(arrayList, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f63360a;
                C13813h[] hVarArr = new C13813h[1];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                String b = mo75145b(parentScreen2);
                String c = mo75146c(parentScreen2);
                String b2 = mo75145b(parentScreen2);
                Iterable iterable = (List) next;
                ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable, i));
                int i4 = 0;
                for (Object next2 : iterable) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    Pair pair2 = (Pair) next2;
                    String D = ((C38115c) pair2.mo21849e()).mo118853D();
                    String A = ((C38115c) pair2.mo21849e()).mo118850A();
                    ProductCategory v = ((C38115c) pair2.mo21849e()).mo118885v();
                    if (v == null || (str = v.mo117297q()) == null) {
                        str = "";
                    }
                    arrayList3.add(new C13804k(D, A, str, Integer.valueOf((i2 * 10) + i4 + 1), (String) null, (float) ((PlpOffer) pair2.mo21851f()).mo118822y().mo118173n(), CollectionsKt___CollectionsKt.m40639h3(((PlpOffer) pair2.mo21851f()).mo118816t(), "-", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null), (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, 3984, (DefaultConstructorMarker) null));
                    i4 = i5;
                    hVarArr = hVarArr;
                }
                C13813h[] hVarArr2 = hVarArr;
                hVarArr2[0] = new C13812g(firebaseEventKey, b, c, new C13790b(b2, (String) null, arrayList3, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr2);
                i2 = i3;
                i = 10;
            }
            this.f63364e = arrayList.size();
        }
    }

    /* renamed from: e */
    public final void mo75148e(@C12579k List<? extends OfferProductModel> list, @C12579k AccountListFragment.ParentScreen parentScreen) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        OfferDiscountType z;
        ProductCategoryDomain q;
        List<? extends OfferProductModel> list2 = list;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        if (this.f63364e != list.size()) {
            int i = 10;
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f63360a;
                C13813h[] hVarArr = new C13813h[1];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                String b = mo75145b(parentScreen2);
                String c = mo75146c(parentScreen2);
                String b2 = mo75145b(parentScreen2);
                Iterable iterable = (List) next;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, i));
                int i4 = 0;
                for (Object next2 : iterable) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    OfferProductModel offerProductModel = (OfferProductModel) next2;
                    ProductModel o0 = offerProductModel.mo121517o0();
                    String str8 = null;
                    if (o0 != null) {
                        str = o0.mo121898z();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    ProductModel o02 = offerProductModel.mo121517o0();
                    if (o02 != null) {
                        str3 = o02.mo121889s();
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ProductModel o03 = offerProductModel.mo121517o0();
                    if (o03 == null || (q = o03.mo121887q()) == null) {
                        str5 = null;
                    } else {
                        str5 = q.mo116513j();
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    Integer valueOf = Integer.valueOf((i2 * 10) + i4 + 1);
                    float k = OfferProductModelKt.m159589k(offerProductModel);
                    OfferDiscountDomain w = offerProductModel.mo121523w();
                    if (!(w == null || (z = w.mo115961z()) == null)) {
                        str8 = z.mo118123y();
                    }
                    if (str8 == null) {
                        str7 = "";
                    } else {
                        str7 = str8;
                    }
                    arrayList.add(new C13804k(str2, str4, str6, valueOf, (String) null, k, str7, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, offerProductModel.mo121498K0(), 3984, (DefaultConstructorMarker) null));
                    i4 = i5;
                }
                hVarArr[0] = new C13812g(firebaseEventKey, b, c, new C13790b(b2, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i2 = i3;
                i = 10;
            }
            this.f63364e = list.size();
        }
    }

    /* renamed from: f */
    public final void mo75149f(@C12579k AccountListFragment.ParentScreen parentScreen) {
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        if (parentScreen2 == AccountListFragment.ParentScreen.BASKET_BUILDER) {
            C13783a.m58667i(this.f63360a, "mes-produits", C28536f1.f69211l, (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f63360a, "listes", C28576p0.f69680c, (Map) null, false, false, false, 60, (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo75150g() {
        this.f63362c.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33414G, "Oui")));
    }

    /* renamed from: h */
    public final void mo75151h(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63360a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", mo75145b(parentScreen)), C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, C28612y1.f70082c), C11078d1.m42659a(C28526d.f68929i, mo75146c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75152i(@C12579k C38115c cVar, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        float f2;
        float f3;
        String str5;
        float f4;
        Prices y;
        Prices y2;
        Prices y3;
        Prices y4;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(cVar, "product");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[3];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        String D = cVar.mo118853D();
        String A = cVar.mo118850A();
        ProductCategory v = cVar.mo118885v();
        String str6 = null;
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        PlpOffer i3 = C27662e.m116389i(cVar);
        if (i3 == null || (y4 = i3.mo118822y()) == null) {
            f = 0.0f;
        } else {
            f = (float) y4.mo118173n();
        }
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        C13806m mVar = r9;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(D, A, str2, i2, f, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        String D2 = cVar.mo118853D();
        String A2 = cVar.mo118850A();
        ProductCategory v2 = cVar.mo118885v();
        if (v2 != null) {
            str3 = v2.mo117297q();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        PlpOffer i4 = C27662e.m116389i(cVar);
        if (i4 == null || (y3 = i4.mo118822y()) == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) y3.mo118173n();
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(b4, (String) null, new C13802i(D2, A2, str4, i2, f2, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, b3, c2, nVar);
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String b5 = mo75145b(parentScreen2);
        String c3 = mo75146c(parentScreen2);
        String b6 = mo75145b(parentScreen2);
        PlpOffer i5 = C27662e.m116389i(cVar);
        if (i5 == null || (y2 = i5.mo118822y()) == null) {
            f3 = 0.0f;
        } else {
            f3 = (float) y2.mo118173n();
        }
        String D3 = cVar.mo118853D();
        String A3 = cVar.mo118850A();
        ProductCategory v3 = cVar.mo118885v();
        if (v3 != null) {
            str6 = v3.mo117297q();
        }
        if (str6 == null) {
            str5 = "";
        } else {
            str5 = str6;
        }
        Integer valueOf = Integer.valueOf(i2);
        PlpOffer i6 = C27662e.m116389i(cVar);
        if (i6 == null || (y = i6.mo118822y()) == null) {
            f4 = 0.0f;
        } else {
            f4 = (float) y.mo118173n();
        }
        C13789a aVar2 = r9;
        C13789a aVar3 = new C13789a(b6, f3, (String) null, C10976s.m41419k(new C13803j(D3, A3, str5, valueOf, f4, Integer.valueOf(i), (Integer) null, (String) null, (String) null, (String) null, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[2] = new C13812g(firebaseEventKey3, b5, c3, aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public final void mo75153j(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75145b(parentScreen2));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen2));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75144a(parentScreen2));
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115984e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_cdBase", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[8] = C11078d1.m42659a("product_EAN", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_name", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str6 = o02.mo121898z();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str8 = o03.mo121889s();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q3.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        } else {
            str12 = null;
        }
        C13806m mVar = r14;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str13 = o05.mo121898z();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str15 = o06.mo121889s();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str17 = null;
        } else {
            str17 = q2.mo116513j();
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str19 = offerProductModel.mo121498K0();
        } else {
            str19 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, b3, c2, new C13807n(b4, (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String b5 = mo75145b(parentScreen2);
        String c3 = mo75146c(parentScreen2);
        String b6 = mo75145b(parentScreen2);
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str20 = o08.mo121898z();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str22 = o09.mo121889s();
        } else {
            str22 = null;
        }
        if (str22 == null) {
            str23 = "";
        } else {
            str23 = str22;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str24 = null;
        } else {
            str24 = q.mo116513j();
        }
        if (str24 == null) {
            str25 = "";
        } else {
            str25 = str24;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str26 = offerProductModel.mo121498K0();
        } else {
            str26 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, b5, c3, new C13789a(b6, k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: k */
    public final void mo75154k(@C12579k C38115c cVar, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        float f2;
        float f3;
        String str5;
        float f4;
        Prices y;
        Prices y2;
        Prices y3;
        Prices y4;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(cVar, "product");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[3];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        String D = cVar.mo118853D();
        String A = cVar.mo118850A();
        ProductCategory v = cVar.mo118885v();
        String str6 = null;
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        PlpOffer i3 = C27662e.m116389i(cVar);
        if (i3 == null || (y4 = i3.mo118822y()) == null) {
            f = 0.0f;
        } else {
            f = (float) y4.mo118173n();
        }
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        C13806m mVar = r9;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(D, A, str2, i2, f, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        String D2 = cVar.mo118853D();
        String A2 = cVar.mo118850A();
        ProductCategory v2 = cVar.mo118885v();
        if (v2 != null) {
            str3 = v2.mo117297q();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        PlpOffer i4 = C27662e.m116389i(cVar);
        if (i4 == null || (y3 = i4.mo118822y()) == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) y3.mo118173n();
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(b4, (String) null, new C13802i(D2, A2, str4, i2, f2, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, b3, c2, nVar);
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String b5 = mo75145b(parentScreen2);
        String c3 = mo75146c(parentScreen2);
        String b6 = mo75145b(parentScreen2);
        PlpOffer i5 = C27662e.m116389i(cVar);
        if (i5 == null || (y2 = i5.mo118822y()) == null) {
            f3 = 0.0f;
        } else {
            f3 = (float) y2.mo118173n();
        }
        String D3 = cVar.mo118853D();
        String A3 = cVar.mo118850A();
        ProductCategory v3 = cVar.mo118885v();
        if (v3 != null) {
            str6 = v3.mo117297q();
        }
        if (str6 == null) {
            str5 = "";
        } else {
            str5 = str6;
        }
        Integer valueOf = Integer.valueOf(i2);
        PlpOffer i6 = C27662e.m116389i(cVar);
        if (i6 == null || (y = i6.mo118822y()) == null) {
            f4 = 0.0f;
        } else {
            f4 = (float) y.mo118173n();
        }
        C13789a aVar2 = r9;
        C13789a aVar3 = new C13789a(b6, f3, (String) null, C10976s.m41419k(new C13803j(D3, A3, str5, valueOf, f4, Integer.valueOf(i), (Integer) null, (String) null, (String) null, (String) null, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[2] = new C13812g(firebaseEventKey3, b5, c3, aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: l */
    public final void mo75155l(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[2] = C11078d1.m42659a("ecommerce_zone", mo75144a(parentScreen2));
        pairArr[3] = C11078d1.m42659a("screen_name", mo75145b(parentScreen2));
        pairArr[4] = C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen2));
        pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[6] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115984e();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[8] = C11078d1.m42659a("product_cdBase", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_name", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str6 = o02.mo121898z();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str8 = o03.mo121889s();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q3.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        } else {
            str12 = null;
        }
        C13806m mVar = r14;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str13 = o05.mo121898z();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str15 = o06.mo121889s();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str17 = null;
        } else {
            str17 = q2.mo116513j();
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str19 = offerProductModel.mo121498K0();
        } else {
            str19 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, b3, c2, new C13807n(b4, (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String b5 = mo75145b(parentScreen2);
        String c3 = mo75146c(parentScreen2);
        String b6 = mo75145b(parentScreen2);
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str20 = o08.mo121898z();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str22 = o09.mo121889s();
        } else {
            str22 = null;
        }
        if (str22 == null) {
            str23 = "";
        } else {
            str23 = str22;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str24 = null;
        } else {
            str24 = q.mo116513j();
        }
        if (str24 == null) {
            str25 = "";
        } else {
            str25 = str24;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str26 = offerProductModel.mo121498K0();
        } else {
            str26 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, b5, c3, new C13789a(b6, k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: m */
    public final void mo75156m(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63360a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", mo75145b(parentScreen)), C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, "ajouter-produits"), C11078d1.m42659a(C28526d.f68929i, mo75146c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo75157n(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63360a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen)), C11078d1.m42659a("screen_name", mo75145b(parentScreen)), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0)), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo75158o(@C12579k C38115c cVar, @C12579k AccountListFragment.ParentScreen parentScreen, int i) {
        String str;
        String str2;
        float f;
        String str3;
        float f2;
        Prices y;
        Prices y2;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(cVar, "product");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        String D = cVar.mo118853D();
        String A = cVar.mo118850A();
        ProductCategory v = cVar.mo118885v();
        String str4 = null;
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        PlpOffer i2 = C27662e.m116389i(cVar);
        if (i2 == null || (y2 = i2.mo118822y()) == null) {
            f = 0.0f;
        } else {
            f = (float) y2.mo118173n();
        }
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        C13806m mVar = r9;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(D, A, str2, i, f, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        String D2 = cVar.mo118853D();
        String A2 = cVar.mo118850A();
        ProductCategory v2 = cVar.mo118885v();
        if (v2 != null) {
            str4 = v2.mo117297q();
        }
        if (str4 == null) {
            str3 = "";
        } else {
            str3 = str4;
        }
        PlpOffer i3 = C27662e.m116389i(cVar);
        if (i3 == null || (y = i3.mo118822y()) == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) y.mo118173n();
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(b4, (String) null, new C13802i(D2, A2, str3, i, f2, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, b3, c2, nVar);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: p */
    public final void mo75159p(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63360a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String b = mo75145b(parentScreen2);
        String c = mo75146c(parentScreen2);
        String b2 = mo75145b(parentScreen2);
        ProductModel o0 = offerProductModel.mo121517o0();
        String str13 = null;
        if (o0 != null) {
            str = o0.mo121898z();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str3 = o02.mo121889s();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 == null || (q2 = o03.mo121887q()) == null) {
            str5 = null;
        } else {
            str5 = q2.mo116513j();
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q3 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13806m mVar = r9;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(str2, str4, str6, i, k, q3, (Integer) null, (String) null, str7, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75145b(parentScreen2);
        String c2 = mo75146c(parentScreen2);
        String b4 = mo75145b(parentScreen2);
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 != null) {
            str8 = o04.mo121898z();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str10 = o05.mo121889s();
        } else {
            str10 = null;
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (!(o06 == null || (q = o06.mo121887q()) == null)) {
            str13 = q.mo116513j();
        }
        if (str13 == null) {
            str12 = "";
        } else {
            str12 = str13;
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(b4, (String) null, new C13802i(str9, str11, str12, i, OfferProductModelKt.m159589k(offerProductModel), firebaseProductDimension.mo32726q(), (Integer) null, (String) null, (String) null, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, b3, c2, nVar);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: q */
    public final void mo75160q(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a aVar = this.f63360a;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75145b(parentScreen));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75144a(parentScreen));
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
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
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        pairArr[8] = C11078d1.m42659a("product_name", str3);
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: r */
    public final void mo75161r(@C12579k C38115c cVar, @C12579k AccountListFragment.ParentScreen parentScreen) {
        Double d;
        Prices y;
        Intrinsics.checkNotNullParameter(cVar, "product");
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a aVar = this.f63360a;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75145b(parentScreen));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75144a(parentScreen));
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[7] = C11078d1.m42659a("product_EAN", cVar.mo118850A());
        pairArr[8] = C11078d1.m42659a("product_name", cVar.mo118853D());
        PlpOffer plpOffer = (PlpOffer) CollectionsKt___CollectionsKt.m40479B2(cVar.mo118855F());
        if (plpOffer == null || (y = plpOffer.mo118822y()) == null) {
            d = null;
        } else {
            d = Double.valueOf(y.mo118173n());
        }
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, String.valueOf(d));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: s */
    public final void mo75162s(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a aVar = this.f63360a;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75145b(parentScreen));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75144a(parentScreen));
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
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
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        pairArr[8] = C11078d1.m42659a("product_name", str3);
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: t */
    public final void mo75163t(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63360a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", mo75145b(parentScreen)), C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, C28536f1.f69211l), C11078d1.m42659a(C28526d.f68937k, "me-connecter"), C11078d1.m42659a(C28526d.f68929i, mo75146c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: u */
    public final void mo75164u(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63360a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, mo75146c(parentScreen)), C11078d1.m42659a("screen_name", mo75145b(parentScreen)), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0)), false, 2, (Object) null);
    }

    /* renamed from: v */
    public final void mo75165v(@C12579k Context context, @C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.f63361b.mo32735i(context, "af_add_to_cart", C10977s0.m41456W(C11078d1.m42659a("af_add_to_cart", "Oui"), C11078d1.m42659a("af_content_id", str), C11078d1.m42659a("af_quantity", String.valueOf(i))));
    }

    /* renamed from: w */
    public final void mo75166w(@C12579k AccountListFragment.ParentScreen parentScreen) {
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        if (parentScreen2 == AccountListFragment.ParentScreen.BASKET_BUILDER) {
            C13783a.m58667i(this.f63360a, "mes-produits", C28536f1.f69212m, (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f63360a, "listes", C28576p0.f69680c, (Map) null, false, false, false, 60, (Object) null);
        }
    }
}
