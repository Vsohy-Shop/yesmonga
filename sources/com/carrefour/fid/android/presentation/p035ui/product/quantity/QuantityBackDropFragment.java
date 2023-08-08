package com.carrefour.fid.android.presentation.p035ui.product.quantity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.databinding.C36722i3;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.list.C37268h;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\b\u0012\u0004\u0012\u00020\u00110\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/quantity/QuantityBackDropFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/i3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "Lcom/carrefour/fid/android/design/components/widgets/list/h;", "", "indexToSelect", "X0", "Lcom/carrefour/fid/android/design/components/widgets/list/i;", "U0", "Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel$b;", "event", "W0", "Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel;", "f", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel;", "viewModel", "", "g", "Z", "isQuantityUpdated", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nQuantityBackDropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuantityBackDropFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/quantity/QuantityBackDropFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n106#2,15:133\n1559#3:148\n1590#3,4:149\n1559#3:159\n1590#3,4:160\n1549#3:164\n1620#3,3:165\n183#4,6:153\n1#5:168\n*S KotlinDebug\n*F\n+ 1 QuantityBackDropFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/quantity/QuantityBackDropFragment\n*L\n52#1:133,15\n75#1:148\n75#1:149,4\n99#1:159\n99#1:160,4\n107#1:164\n107#1:165,3\n93#1:153,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.quantity.QuantityBackDropFragment */
public final class QuantityBackDropFragment extends C25497a<C36722i3> {
    @C12579k

    /* renamed from: X */
    public static final String f62740X = "basketType";
    @C12579k

    /* renamed from: v */
    public static final C25492a f62741v = new C25492a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f62742w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f62743x = "offerProduct";
    @C12579k

    /* renamed from: y */
    public static final String f62744y = "isQuantityUpdated";
    @C12579k

    /* renamed from: z */
    public static final String f62745z = "initialSelectedQuantity";
    @C12579k

    /* renamed from: f */
    public final C11677z f62746f;

    /* renamed from: g */
    public boolean f62747g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.quantity.QuantityBackDropFragment$a */
    public static final class C25492a {
        public /* synthetic */ C25492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ QuantityBackDropFragment m109994b(C25492a aVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                basketType = BasketType.BASKET_V4_DRIVE;
            }
            return aVar.mo74287a(offerProductModel, i, basketType);
        }

        @C12579k
        /* renamed from: a */
        public final QuantityBackDropFragment mo74287a(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
            Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(basketType, "basketType");
            QuantityBackDropFragment quantityBackDropFragment = new QuantityBackDropFragment();
            quantityBackDropFragment.setArguments(C17779d.m81164b(C11078d1.m42659a("offerProduct", offerProductModel), C11078d1.m42659a(QuantityBackDropFragment.f62745z, Integer.valueOf(i)), C11078d1.m42659a("basketType", basketType.mo117008q())));
            return quantityBackDropFragment;
        }

        public C25492a() {
        }
    }

    public QuantityBackDropFragment() {
        super(C254901.f62748a, C254912.f62749a, false);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new QuantityBackDropFragment$special$$inlined$viewModels$default$2(new QuantityBackDropFragment$special$$inlined$viewModels$default$1(this)));
        this.f62746f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(QuantityBottomSheetViewModel.class), new QuantityBackDropFragment$special$$inlined$viewModels$default$3(b), new QuantityBackDropFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new QuantityBackDropFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36722i3 m109985R0(QuantityBackDropFragment quantityBackDropFragment) {
        return (C36722i3) quantityBackDropFragment.getBinding();
    }

    /* renamed from: U0 */
    public final List<C37269i> mo74281U0(List<? extends C37269i> list) {
        Iterable<Object> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Object obj : iterable) {
            if (obj instanceof C37268h) {
                obj = C37268h.m152944f((C37268h) obj, (String) null, false, false, (C11289a) null, 11, (Object) null);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: V0 */
    public final QuantityBottomSheetViewModel mo74282V0() {
        return (QuantityBottomSheetViewModel) this.f62746f.getValue();
    }

    /* renamed from: W0 */
    public final void mo74283W0(QuantityBottomSheetViewModel.C27235b bVar) {
        if (bVar instanceof QuantityBottomSheetViewModel.C27235b.C27237b) {
            this.f62747g = true;
        } else if (Intrinsics.areEqual((Object) bVar, (Object) QuantityBottomSheetViewModel.C27235b.C27236a.f66191a)) {
            C28935i.m119704b(C28935i.f70940a, "Quantity cannot be updated", (Throwable) null, 0, 6, (Object) null);
        }
        ((C36722i3) getBinding()).f91011b.setList(mo74281U0(((C36722i3) getBinding()).f91011b.getList()));
        dismiss();
    }

    /* renamed from: X0 */
    public final List<C37268h> mo74284X0(List<C37268h> list, int i) {
        boolean z;
        boolean z2;
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        int i2 = 0;
        for (Object next : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C37268h hVar = (C37268h) next;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            if (i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(C37268h.m152944f(hVar, (String) null, z, z2, (C11289a) null, 9, (Object) null));
            i2 = i3;
        }
        return arrayList;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        FragmentManager g0 = requireActivity().mo57175g0();
        Bundle bundle = new Bundle();
        bundle.putBoolean(f62744y, this.f62747g);
        C11079d2 d2Var = C11079d2.f28267a;
        g0.mo56857a(C37185a.ON_DISMISS_FRAGMENT_RESULT_KEY, bundle);
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        int i;
        int i2;
        boolean z;
        int i3;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        OfferProductModel offerProductModel = (OfferProductModel) requireArguments().getParcelable("offerProduct");
        int i4 = requireArguments().getInt(f62745z);
        BasketType a = BasketType.f95520a.mo117009a(requireArguments().getString("basketType"));
        if (offerProductModel != null) {
            Integer X = offerProductModel.mo121503X();
            if (X != null) {
                int intValue = X.intValue();
                Integer h0 = offerProductModel.mo121510h0();
                if (h0 != null) {
                    i3 = h0.intValue();
                } else {
                    i3 = 1;
                }
                i = intValue * i3;
            } else {
                i = 1;
            }
            Collection k = C10976s.m41419k(0);
            Integer f0 = offerProductModel.mo121508f0();
            if (f0 != null) {
                i2 = f0.intValue();
            } else {
                i2 = 0;
            }
            List y4 = CollectionsKt___CollectionsKt.m40718y4(k, CollectionsKt___CollectionsKt.m40557Q5(C11479u.m44315B1(new C11466l(i, i2), i)));
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = CollectionsKt__CollectionsKt.m40441E();
            Iterable iterable = y4;
            T arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                int intValue2 = ((Number) next).intValue();
                String valueOf = String.valueOf(intValue2);
                if (intValue2 == i4) {
                    z = true;
                } else {
                    z = false;
                }
                QuantityBackDropFragment$onViewCreated$1$1 quantityBackDropFragment$onViewCreated$1$1 = r1;
                Iterator it2 = it;
                boolean z2 = z;
                QuantityBackDropFragment$onViewCreated$1$1 quantityBackDropFragment$onViewCreated$1$12 = new QuantityBackDropFragment$onViewCreated$1$1(this, objectRef, i5, offerProductModel, intValue2, a);
                arrayList.add(new C37268h(valueOf, z2, false, quantityBackDropFragment$onViewCreated$1$1));
                i4 = i4;
                i5 = i6;
                it = it2;
                offerProductModel = offerProductModel;
            }
            objectRef.element = arrayList;
            QuantityBottomSheetViewModel V0 = mo74282V0();
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new QuantityBackDropFragment$onViewCreated$$inlined$processEvent$1(this, V0, (C11045c) null, this), 3, (Object) null);
            ((C36722i3) getBinding()).f91011b.setList((List) objectRef.element);
            return;
        }
        throw new IllegalStateException("Offer shouldn't be null");
    }
}
