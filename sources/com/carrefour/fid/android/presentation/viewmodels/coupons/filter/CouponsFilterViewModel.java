package com.carrefour.fid.android.presentation.viewmodels.coupons.filter;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.presentation.models.BrandSize;
import com.carrefour.fid.android.presentation.models.CouponCategory;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsContent;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.models.FilterSection;
import com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.C26249b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J6\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/coupons/filter/CouponsFilterViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/mvi/b$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/mvi/b$c;", "intent", "Lkotlin/d2;", "k0", "(Lcom/carrefour/fid/android/presentation/viewmodels/coupons/mvi/b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "coupons", "Lcom/carrefour/fid/android/presentation/models/CouponsFilter;", "filters", "", "inStore", "j0", "Lcom/carrefour/fid/android/presentation/models/FilterSection;", "section", "", "key", "m0", "list", "i0", "l0", "h0", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponsFilterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsFilterViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/filter/CouponsFilterViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n11335#2:194\n11670#2,3:195\n11335#2:201\n11670#2,3:202\n11335#2:210\n11670#2,3:211\n11335#2:225\n11670#2,3:226\n1549#3:198\n1620#3,2:199\n1622#3:205\n1549#3:206\n1620#3,3:207\n1549#3:214\n1620#3,3:215\n223#3,2:218\n766#3:220\n857#3,2:221\n1855#3:223\n1855#3:224\n1747#3,3:229\n1856#3:232\n1856#3:233\n1855#3,2:234\n1#4:236\n*S KotlinDebug\n*F\n+ 1 CouponsFilterViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/filter/CouponsFilterViewModel\n*L\n53#1:194\n53#1:195,3\n59#1:201\n59#1:202,3\n66#1:210\n66#1:211,3\n138#1:225\n138#1:226,3\n58#1:198\n58#1:199,2\n58#1:205\n61#1:206\n61#1:207,3\n74#1:214\n74#1:215,3\n89#1:218,2\n92#1:220\n92#1:221,2\n115#1:223\n117#1:224\n151#1:229,3\n117#1:232\n115#1:233\n173#1:234,2\n*E\n"})
public final class CouponsFilterViewModel extends BaseMVIViewModel<C26249b.C26252b, C26249b.C26253c> {

    /* renamed from: a */
    public static final int f64158a = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel$a */
    public /* synthetic */ class C26226a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.models.FilterSection[] r0 = com.carrefour.fid.android.presentation.models.FilterSection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.COUPONS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.DEPARTMENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.BRAND_SIZE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel.C26226a.<clinit>():void");
        }
    }

    @Inject
    public CouponsFilterViewModel() {
        super(new C26249b.C26252b((List) null, (List) null, (List) null, false, 15, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
    }

    /* renamed from: h0 */
    public final void mo76290h0() {
        List<CouponsFilter> m = ((C26249b.C26252b) getCurrentState()).mo76352m();
        if (m != null) {
            emitEvent(new C26249b.C26250a.C26251a(m, ((C26249b.C26252b) getCurrentState()).mo76351l()));
        }
    }

    /* renamed from: i0 */
    public final void mo76291i0(List<CouponsFilter> list, List<CouponModel> list2, List<CouponsFilter> list3) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        for (CouponModel couponModel : list2) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            if (list != null) {
                for (CouponsFilter couponsFilter : list) {
                    int i = C26226a.$EnumSwitchMapping$0[couponsFilter.mo121452h().ordinal()];
                    boolean z4 = false;
                    if (i == 1) {
                        if (booleanRef.element) {
                            if (couponsFilter.mo121450f().contains(CouponsContent.ACTIVATED.mo121443q())) {
                                z = couponModel.isSelected();
                            } else if (couponsFilter.mo121450f().contains(CouponsContent.AVAILABLE.mo121443q())) {
                                z = CouponStatus.Companion.mo110929a().contains(couponModel.mo121403S());
                            } else {
                                z = true;
                            }
                            if (z) {
                                z4 = true;
                            }
                        }
                        booleanRef.element = z4;
                    } else if (i == 2) {
                        if (booleanRef.element) {
                            if (couponsFilter.mo121450f().isEmpty()) {
                                z2 = true;
                            } else {
                                CouponCategory[] values = CouponCategory.values();
                                ArrayList arrayList2 = new ArrayList(values.length);
                                for (CouponCategory q : values) {
                                    arrayList2.add(q.mo121356q());
                                }
                                if (arrayList2.contains(couponModel.mo121386B())) {
                                    z2 = couponsFilter.mo121450f().contains(couponModel.mo121386B());
                                } else {
                                    z2 = couponsFilter.mo121450f().contains(CouponCategory.OTHERS.mo121356q());
                                }
                            }
                            if (z2) {
                                z4 = true;
                            }
                        }
                        booleanRef.element = z4;
                    } else if (i == 3) {
                        if (booleanRef.element) {
                            if (couponsFilter.mo121450f().isEmpty()) {
                                z3 = true;
                            } else {
                                Iterable f = couponsFilter.mo121450f();
                                if (!(f instanceof Collection) || !((Collection) f).isEmpty()) {
                                    Iterator it = f.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        if (StringsKt__StringsKt.contains$default((CharSequence) couponModel.mo121404T(), (CharSequence) (String) it.next(), false, 2, (Object) null)) {
                                            break;
                                        }
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                            if (z3) {
                                z4 = true;
                            }
                        }
                        booleanRef.element = z4;
                    }
                }
            }
            if (booleanRef.element) {
                arrayList.add(couponModel);
            }
        }
        publishState(C26249b.C26252b.m112162j((C26249b.C26252b) getCurrentState(), list3, list2, arrayList, false, 8, (Object) null));
    }

    /* renamed from: j0 */
    public final void mo76292j0(List<CouponModel> list, List<CouponsFilter> list2, boolean z) {
        List list3;
        String str;
        if (!list2.isEmpty()) {
            mo76291i0(list2, list, list2);
            return;
        }
        if (z) {
            CouponsFilter[] couponsFilterArr = new CouponsFilter[3];
            FilterSection filterSection = FilterSection.COUPONS;
            CouponsContent[] values = CouponsContent.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (CouponsContent couponsContent : values) {
                arrayList.add(C11078d1.m42659a(couponsContent.mo121443q(), couponsContent.mo121443q()));
            }
            couponsFilterArr[0] = new CouponsFilter(filterSection, C10977s0.m41426B0(arrayList), CollectionsKt__CollectionsKt.m40441E());
            FilterSection filterSection2 = FilterSection.DEPARTMENT;
            Iterable<CouponModel> iterable = list;
            ArrayList<String> arrayList2 = new ArrayList<>(C10978t.m41495Y(iterable, 10));
            for (CouponModel couponModel : iterable) {
                CouponCategory[] values2 = CouponCategory.values();
                ArrayList arrayList3 = new ArrayList(values2.length);
                for (CouponCategory q : values2) {
                    arrayList3.add(q.mo121356q());
                }
                if (arrayList3.contains(couponModel.mo121386B())) {
                    str = couponModel.mo121386B();
                } else {
                    str = CouponCategory.OTHERS.mo121356q();
                }
                arrayList2.add(str);
            }
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
            for (String str2 : arrayList2) {
                arrayList4.add(C11078d1.m42659a(str2, str2));
            }
            couponsFilterArr[1] = new CouponsFilter(filterSection2, C10977s0.m41426B0(arrayList4), CollectionsKt__CollectionsKt.m40441E());
            FilterSection filterSection3 = FilterSection.BRAND_SIZE;
            BrandSize[] values3 = BrandSize.values();
            ArrayList arrayList5 = new ArrayList(values3.length);
            for (BrandSize brandSize : values3) {
                arrayList5.add(C11078d1.m42659a(brandSize.mo121337q(), brandSize.mo121337q()));
            }
            couponsFilterArr[2] = new CouponsFilter(filterSection3, C10977s0.m41426B0(arrayList5), CollectionsKt__CollectionsKt.m40441E());
            list3 = CollectionsKt__CollectionsKt.m40448L(couponsFilterArr);
        } else {
            FilterSection filterSection4 = FilterSection.DEPARTMENT;
            Iterable<CouponModel> iterable2 = list;
            ArrayList arrayList6 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (CouponModel couponModel2 : iterable2) {
                arrayList6.add(C11078d1.m42659a(couponModel2.mo121386B(), couponModel2.mo121386B()));
            }
            list3 = C10976s.m41419k(new CouponsFilter(filterSection4, C10977s0.m41426B0(arrayList6), CollectionsKt__CollectionsKt.m40441E()));
        }
        mo76291i0(list2, list, list3);
    }

    @C12580l
    /* renamed from: k0 */
    public Object processIntent(@C12579k C26249b.C26253c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CouponsFilterViewModel$processIntent$2(cVar, this, (C11045c<? super CouponsFilterViewModel$processIntent$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    /* renamed from: l0 */
    public final void mo76294l0() {
        List<CouponsFilter> list;
        List<CouponsFilter> m = ((C26249b.C26252b) getCurrentState()).mo76352m();
        if (m != null) {
            list = CollectionsKt___CollectionsKt.m40572T5(m);
        } else {
            list = null;
        }
        if (list != null) {
            for (CouponsFilter i : list) {
                i.mo121454i(CollectionsKt__CollectionsKt.m40441E());
            }
        }
        mo76291i0(list, ((C26249b.C26252b) getCurrentState()).mo76350k(), list);
    }

    /* renamed from: m0 */
    public final void mo76295m0(FilterSection filterSection, String str) {
        List<CouponsFilter> list;
        boolean z;
        List list2;
        List<CouponsFilter> m = ((C26249b.C26252b) getCurrentState()).mo76352m();
        if (m != null) {
            list = CollectionsKt___CollectionsKt.m40572T5(m);
        } else {
            list = null;
        }
        if (list != null) {
            for (CouponsFilter couponsFilter : list) {
                if (couponsFilter.mo121452h() == filterSection) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    if (couponsFilter != null) {
                        if (couponsFilter.mo121450f().contains(str)) {
                            list2 = new ArrayList();
                            for (Object next : couponsFilter.mo121450f()) {
                                if (!Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                                    list2.add(next);
                                }
                            }
                        } else if (filterSection == FilterSection.COUPONS) {
                            list2 = C10976s.m41419k(str);
                        } else {
                            list2 = CollectionsKt___CollectionsKt.m40723z4(couponsFilter.mo121450f(), str);
                        }
                        couponsFilter.mo121454i(list2);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        mo76291i0(list, ((C26249b.C26252b) getCurrentState()).mo76350k(), list);
    }
}
