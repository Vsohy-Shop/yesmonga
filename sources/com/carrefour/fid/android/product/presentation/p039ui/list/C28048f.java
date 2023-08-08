package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27502o;
import com.carrefour.fid.android.product.databinding.C27503p;
import com.carrefour.fid.android.product.databinding.C27504q;
import com.carrefour.fid.android.product.presentation.models.listable.C27680a;
import com.carrefour.fid.android.product.presentation.models.listable.C27682b;
import com.carrefour.fid.android.product.presentation.models.listable.C27683c;
import com.carrefour.fid.android.product.presentation.models.listable.C27684d;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import com.carrefour.fid.android.product.presentation.p039ui.list.other.C28072h;
import com.carrefour.fid.android.product.presentation.p039ui.list.other.CriteoPlpButterflyViewHolder;
import com.carrefour.fid.android.product.presentation.p039ui.list.other.CriteoPlpFlagshipViewHolder;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPlpViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpViewBinder.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpViewBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.f */
public final class C28048f implements C37390r {
    @C12579k

    /* renamed from: a */
    public final RecyclerView f67954a;
    @C12579k

    /* renamed from: b */
    public final C27686f f67955b;
    @C12580l

    /* renamed from: c */
    public final C27680a f67956c;
    @C12579k

    /* renamed from: d */
    public final C11304p<C38005g, Integer, C11079d2> f67957d;
    @C12579k

    /* renamed from: e */
    public final C11300l<C27684d, C11079d2> f67958e;
    @C12579k

    /* renamed from: f */
    public final LifecycleCoroutineScope f67959f;

    /* renamed from: g */
    public final int f67960g;

    /* renamed from: h */
    public final int f67961h;

    @C11363r0({"SMAP\nPlpViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpViewBinder.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpViewBinder$getDiffUtils$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1864#2,3:147\n*S KotlinDebug\n*F\n+ 1 PlpViewBinder.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpViewBinder$getDiffUtils$1\n*L\n129#1:147,3\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.f$a */
    public static final class C28049a extends C20157j.C20163f<C37369a> {
        /* renamed from: d */
        public boolean mo60477a(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if ((aVar instanceof C27682b) && (aVar2 instanceof C27682b)) {
                C27682b bVar = (C27682b) aVar;
                int i = 0;
                for (Object next : bVar.mo80422e().mo117435d()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    C38114b bVar2 = (C38114b) next;
                    C38114b bVar3 = (C38114b) CollectionsKt___CollectionsKt.m40559R2(((C27682b) aVar2).mo80422e().mo117435d(), i);
                    if (bVar3 == null || !Intrinsics.areEqual((Object) bVar2, (Object) bVar3)) {
                        return false;
                    }
                    i = i2;
                }
                if (bVar.mo80424f() == ((C27682b) aVar2).mo80424f()) {
                    return true;
                }
                return false;
            } else if ((aVar instanceof C27683c) && (aVar2 instanceof C27683c)) {
                return Intrinsics.areEqual((Object) aVar, (Object) aVar2);
            } else {
                if (!(aVar instanceof C27684d) || !(aVar2 instanceof C27684d)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) aVar, (Object) aVar2);
            }
        }

        /* renamed from: e */
        public boolean mo60478b(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if (!(aVar instanceof C27682b) || !(aVar2 instanceof C27682b)) {
                if (!(aVar instanceof C27683c) || !(aVar2 instanceof C27683c)) {
                    if (!(aVar instanceof C27684d) || !(aVar2 instanceof C27684d)) {
                        return false;
                    }
                    if (((C27684d) aVar).mo80444g() == ((C27684d) aVar2).mo80444g()) {
                        return true;
                    }
                    return false;
                } else if (((C27683c) aVar).mo80435g() == ((C27683c) aVar2).mo80435g()) {
                    return true;
                } else {
                    return false;
                }
            } else if (((C27682b) aVar).mo80425g() == ((C27682b) aVar2).mo80425g()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public C28048f(@C12579k RecyclerView recyclerView, @C12579k Resources resources, @C12579k Resources.Theme theme, @C12579k C27686f fVar, @C12580l C27680a aVar, @C12579k C11304p<? super C38005g, ? super Integer, C11079d2> pVar, @C12579k C11300l<? super C27684d, C11079d2> lVar, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        Intrinsics.checkNotNullParameter(fVar, "productCardCallbacks");
        Intrinsics.checkNotNullParameter(pVar, "onCriteoProductSelectedCallback");
        Intrinsics.checkNotNullParameter(lVar, "onLuckyCartBannerCallback");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleScope");
        this.f67954a = recyclerView;
        this.f67955b = fVar;
        this.f67956c = aVar;
        this.f67957d = pVar;
        this.f67958e = lVar;
        this.f67959f = lifecycleCoroutineScope;
        this.f67960g = resources.getDimensionPixelSize(C27609f.C27616g.ds_border_width_1);
        this.f67961h = resources.getColor(C27609f.C27615f.ds_grey_60, theme);
    }

    @C12580l
    /* renamed from: a */
    public C37375a mo67717a(int i) {
        if (i == 5 || i == 7 || i == 8) {
            return new C37375a.C37376a().mo113959d(this.f67960g).mo113957b(this.f67961h).mo113956a();
        }
        return null;
    }

    /* renamed from: b */
    public int mo67718b(@C12579k C37369a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        if (!(aVar instanceof C27682b) && !(aVar instanceof C27683c) && !(aVar instanceof C27684d)) {
            return -1;
        }
        return 2;
    }

    @C12580l
    /* renamed from: c */
    public RecyclerView.C20061e0 mo67719c(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (i == 5) {
            C27502o c = C27502o.m115728c(LayoutInflater.from(this.f67954a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c, "inflate(LayoutInflater.from(recyclerView.context))");
            return new C28072h(c, this.f67958e);
        } else if (i == 7) {
            C27503p c2 = C27503p.m115732c(LayoutInflater.from(this.f67954a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c2, "inflate(LayoutInflater.from(recyclerView.context))");
            return new CriteoPlpButterflyViewHolder(c2, this.f67955b, this.f67956c, this.f67957d);
        } else if (i != 8) {
            return null;
        } else {
            C27504q c3 = C27504q.m115736c(LayoutInflater.from(this.f67954a.getContext()));
            Intrinsics.checkNotNullExpressionValue(c3, "inflate(LayoutInflater.from(recyclerView.context))");
            return new CriteoPlpFlagshipViewHolder(c3, this.f67955b, this.f67956c, this.f67957d, this.f67959f);
        }
    }

    @C12579k
    /* renamed from: d */
    public C20157j.C20163f<C37369a> mo67720d() {
        return new C28049a();
    }

    /* renamed from: e */
    public boolean mo67721e(@C12579k C37369a aVar, @C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(e0Var, "viewHolder");
        if (e0Var instanceof CriteoPlpButterflyViewHolder) {
            ((CriteoPlpButterflyViewHolder) e0Var).mo81622e(aVar, i);
            C11079d2 d2Var = C11079d2.f28267a;
            return true;
        } else if (e0Var instanceof CriteoPlpFlagshipViewHolder) {
            ((CriteoPlpFlagshipViewHolder) e0Var).mo81629f(aVar, i);
            C11079d2 d2Var2 = C11079d2.f28267a;
            return true;
        } else if (!(e0Var instanceof C28072h)) {
            return false;
        } else {
            ((C28072h) e0Var).mo81651d(aVar);
            C11079d2 d2Var3 = C11079d2.f28267a;
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28048f(RecyclerView recyclerView, Resources resources, Resources.Theme theme, C27686f fVar, C27680a aVar, C11304p pVar, C11300l lVar, LifecycleCoroutineScope lifecycleCoroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, resources, theme, fVar, (i & 16) != 0 ? null : aVar, pVar, lVar, lifecycleCoroutineScope);
    }
}
