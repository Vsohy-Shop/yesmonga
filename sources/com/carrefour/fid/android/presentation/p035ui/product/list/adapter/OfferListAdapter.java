package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36683e4;
import com.carrefour.fid.android.databinding.C36713h4;
import com.carrefour.fid.android.databinding.C36733j4;
import com.carrefour.fid.android.databinding.C36743k4;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferLoadingModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25411a;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25412b;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25414c;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25415d;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25416e;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25417f;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.remotedata.C9628n;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/OfferListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter */
public final class OfferListAdapter extends RecyclerView.Adapter<C25469h> implements C12074o0 {

    /* renamed from: v */
    public static final int f62637v = 8;
    @C12579k

    /* renamed from: a */
    public final C25454a f62638a;
    @C12580l

    /* renamed from: b */
    public final C25412b f62639b;
    @C12579k

    /* renamed from: c */
    public List<OfferModel> f62640c;
    @C12579k

    /* renamed from: d */
    public final C11677z f62641d;
    @C12579k

    /* renamed from: e */
    public final List<Long> f62642e;
    @C12579k

    /* renamed from: f */
    public final List<String> f62643f;
    @C12580l

    /* renamed from: g */
    public LinearLayoutManager f62644g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter$a */
    public interface C25454a extends C25416e, C25411a, C25417f, C25414c, C25415d {

        /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter$a$a */
        public static final class C25455a {
            /* renamed from: a */
            public static void m109851a(@C12579k C25454a aVar) {
            }

            /* renamed from: b */
            public static void m109852b(@C12579k C25454a aVar, @C12579k LuckyCartBannerModel luckyCartBannerModel) {
                Intrinsics.checkNotNullParameter(luckyCartBannerModel, "banner");
            }

            /* renamed from: c */
            public static void m109853c(@C12579k C25454a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
            }

            /* renamed from: d */
            public static void m109854d(@C12579k C25454a aVar, @C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
            }
        }

        /* renamed from: a */
        void mo68187a();

        /* renamed from: b */
        void mo68188b(@C12579k OfferProductModel offerProductModel);

        /* renamed from: c */
        void mo68189c(@C12579k OfferProductModel offerProductModel);

        /* renamed from: i */
        void mo68195i(@C12579k LuckyCartBannerModel luckyCartBannerModel);
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter$b */
    public static final class C25456b extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ OfferListAdapter f62645a;

        public C25456b(OfferListAdapter offerListAdapter) {
            this.f62645a = offerListAdapter;
        }

        /* renamed from: b */
        public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager;
            int i3;
            C25412b l;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30662b(recyclerView, i, i2);
            OfferListAdapter offerListAdapter = this.f62645a;
            RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            offerListAdapter.f62644g = linearLayoutManager;
            LinearLayoutManager m = this.f62645a.f62644g;
            if (m != null) {
                i3 = m.mo59435y2();
            } else {
                i3 = -1;
            }
            OfferModel offerModel = (OfferModel) CollectionsKt___CollectionsKt.m40559R2(this.f62645a.f62640c, i3);
            boolean z = true;
            if (offerModel instanceof CriteoProductModel) {
                CriteoProductModel criteoProductModel = (CriteoProductModel) offerModel;
                if (!this.f62645a.f62642e.contains(Long.valueOf(criteoProductModel.mo121471id()))) {
                    this.f62645a.f62642e.add(Long.valueOf(criteoProductModel.mo121471id()));
                    C25412b l2 = this.f62645a.f62639b;
                    if (l2 != null) {
                        l2.mo68180a(criteoProductModel.mo121520p2());
                    }
                    if (this.f62645a.f62642e.size() == 1 && (l = this.f62645a.f62639b) != null) {
                        l.mo68182c();
                        return;
                    }
                    return;
                }
            }
            if (offerModel instanceof CriteoButterFlyModel) {
                CriteoButterFlyModel criteoButterFlyModel = (CriteoButterFlyModel) offerModel;
                String d = criteoButterFlyModel.mo121464d();
                if (!(d == null || d.length() == 0)) {
                    z = false;
                }
                if (!z && !this.f62645a.f62643f.contains(criteoButterFlyModel.mo121464d())) {
                    this.f62645a.f62643f.add(criteoButterFlyModel.mo121464d());
                    C25412b l3 = this.f62645a.f62639b;
                    if (l3 != null) {
                        l3.mo68180a(criteoButterFlyModel.mo121464d());
                    }
                    this.f62645a.mo74167t(criteoButterFlyModel.mo121461a().get(criteoButterFlyModel.mo121467f()));
                }
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.OfferListAdapter$c */
    public static final class C25457c extends C25469h {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25457c(LinearLayout linearLayout) {
            super(linearLayout);
            Intrinsics.checkNotNullExpressionValue(linearLayout, C10108c.f27819v);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferListAdapter(C25454a aVar, C25412b bVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? new ArrayList() : list);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return C11768d1.m46783e().mo23706a0().mo7443Q(mo74166s());
    }

    public int getItemCount() {
        return this.f62640c.size();
    }

    public long getItemId(int i) {
        return this.f62640c.get(i).mo121471id();
    }

    public int getItemViewType(int i) {
        OfferModel offerModel = this.f62640c.get(i);
        if (offerModel instanceof OfferLoadingModel) {
            return 1;
        }
        if (offerModel instanceof OfferDepartmentModel) {
            return 2;
        }
        if (offerModel instanceof OfferProductModel) {
            return 3;
        }
        if (offerModel instanceof CriteoButterFlyModel) {
            return 4;
        }
        if (offerModel instanceof LuckyCartBannerModel) {
            return 5;
        }
        OfferModel offerModel2 = this.f62640c.get(i);
        throw new Throwable("Can't get viewType at " + i + ": " + offerModel2);
    }

    public void onAttachedToRecyclerView(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo59613r(new C25456b(this));
    }

    public void onDetachedFromRecyclerView(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        C11723c2.C11724a.m46184b(mo74166s(), (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: r */
    public final void mo74165r() {
        if (!this.f62640c.isEmpty()) {
            this.f62640c.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: s */
    public final C11702a0 mo74166s() {
        return (C11702a0) this.f62641d.getValue();
    }

    /* renamed from: t */
    public final void mo74167t(CriteoProductModel criteoProductModel) {
        int i;
        boolean z;
        LinearLayoutManager linearLayoutManager = this.f62644g;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.mo59435y2();
        } else {
            i = -1;
        }
        if (((OfferModel) CollectionsKt___CollectionsKt.m40559R2(this.f62640c, i)) instanceof CriteoButterFlyModel) {
            String p2 = criteoProductModel.mo121520p2();
            if (p2 == null || p2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.f62643f.contains(criteoProductModel.mo121520p2())) {
                this.f62643f.add(criteoProductModel.mo121520p2());
                C25412b bVar = this.f62639b;
                if (bVar != null) {
                    bVar.mo68180a(criteoProductModel.mo121520p2());
                }
            }
        }
    }

    /* renamed from: u */
    public void onBindViewHolder(@C12579k C25469h hVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "holder");
        if (hVar instanceof CriteoButterflyViewHolder) {
            OfferModel offerModel = this.f62640c.get(i);
            Intrinsics.checkNotNull(offerModel, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.CriteoButterFlyModel");
            ((CriteoButterflyViewHolder) hVar).mo74149f((CriteoButterFlyModel) offerModel, i);
        } else if (hVar instanceof OfferProductViewHolder) {
            OfferModel offerModel2 = this.f62640c.get(i);
            Intrinsics.checkNotNull(offerModel2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
            OfferProductViewHolder.m109865j((OfferProductViewHolder) hVar, (OfferProductModel) offerModel2, false, i, 2, (Object) null);
        } else if (hVar instanceof C25467g) {
            OfferModel offerModel3 = this.f62640c.get(i);
            Intrinsics.checkNotNull(offerModel3, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferDepartmentModel");
            ((C25467g) hVar).mo74238c((OfferDepartmentModel) offerModel3);
        } else if (hVar instanceof C25465f) {
            OfferModel offerModel4 = this.f62640c.get(i);
            Intrinsics.checkNotNull(offerModel4, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.LuckyCartBannerModel");
            ((C25465f) hVar).mo74235d((LuckyCartBannerModel) offerModel4);
        }
    }

    /* renamed from: v */
    public void onBindViewHolder(@C12579k C25469h hVar, int i, @C12579k List<Object> list) {
        Intrinsics.checkNotNullParameter(hVar, "holder");
        Intrinsics.checkNotNullParameter(list, C9628n.f26375e);
        if (!(hVar instanceof OfferProductViewHolder) || (hVar instanceof CriteoButterflyViewHolder) || !(!list.isEmpty())) {
            super.onBindViewHolder(hVar, i, list);
        } else if (list.get(0) instanceof OfferProductModel) {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
            ((OfferProductViewHolder) hVar).mo74180G((OfferProductModel) obj);
        } else {
            OfferModel offerModel = this.f62640c.get(i);
            Intrinsics.checkNotNull(offerModel, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.OfferProductModel");
            ((OfferProductViewHolder) hVar).mo74180G((OfferProductModel) offerModel);
        }
    }

    @C12579k
    /* renamed from: w */
    public C25469h onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 1) {
            C36743k4 d = C36743k4.m150701d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C25470i(d);
        } else if (i == 2) {
            C36733j4 d2 = C36733j4.m150661d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C25467g(d2);
        } else if (i == 3) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_offer_product, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …r_product, parent, false)");
            return new OfferProductViewHolder(inflate, this.f62638a, getCoroutineContext());
        } else if (i == 4) {
            return new C25457c(C36713h4.m150580c(LayoutInflater.from(viewGroup.getContext())).getRoot());
        } else {
            if (i == 5) {
                C36683e4 c = C36683e4.m150462c(LayoutInflater.from(viewGroup.getContext()));
                Intrinsics.checkNotNullExpressionValue(c, "inflate(LayoutInflater.from(parent.context))");
                return new C25465f(c, this.f62638a);
            }
            throw new Throwable("Unavailable viewType (" + i + ")");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.presentation.models.OfferModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74171x(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferProductModel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "offer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> r0 = r5.f62640c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.carrefour.fid.android.presentation.models.OfferModel r3 = (com.carrefour.fid.android.presentation.models.OfferModel) r3
            boolean r4 = r3 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r4 == 0) goto L_0x0022
            com.carrefour.fid.android.presentation.models.OfferProductModel r3 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r3
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            if (r3 == 0) goto L_0x0030
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r3 = r3.mo121502W()
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.mo115986f()
            goto L_0x0031
        L_0x0030:
            r3 = r2
        L_0x0031:
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r4 = r6.mo121502W()
            if (r4 == 0) goto L_0x003b
            java.lang.String r2 = r4.mo115986f()
        L_0x003b:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x000d
            r2 = r1
        L_0x0042:
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            if (r2 == 0) goto L_0x0054
            java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> r0 = r5.f62640c
            int r0 = r0.indexOf(r2)
            java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> r1 = r5.f62640c
            r1.set(r0, r6)
            r5.notifyItemChanged(r0, r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.list.adapter.OfferListAdapter.mo74171x(com.carrefour.fid.android.presentation.models.OfferProductModel):void");
    }

    /* renamed from: y */
    public final void mo74172y(@C12579k List<? extends OfferModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<OfferModel> list2 = this.f62640c;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public OfferListAdapter(@C12579k C25454a aVar, @C12580l C25412b bVar, @C12579k List<OfferModel> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f62638a = aVar;
        this.f62639b = bVar;
        this.f62640c = list;
        this.f62641d = C10864b0.m38748c(OfferListAdapter$supervisorJob$2.f62646f);
        this.f62642e = new ArrayList();
        this.f62643f = new ArrayList();
        setHasStableIds(true);
    }
}
