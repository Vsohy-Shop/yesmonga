package com.carrefour.fid.android.shared.base.components;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView.C28472b;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView.C28473c;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView.C28474d;
import com.carrefour.fid.android.shared.extension.ViewKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.extensions.C11683b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseExpandableRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseExpandableRecyclerView.kt\ncom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BaseExpandableRecyclerView.kt\ncom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerViewKt\n*L\n1#1,206:1\n1#2:207\n202#3,4:208\n*S KotlinDebug\n*F\n+ 1 BaseExpandableRecyclerView.kt\ncom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView\n*L\n131#1:208,4\n*E\n"})
public abstract class BaseExpandableRecyclerView<ExpandedType, ExpandableType extends C28472b<? extends ExpandedType>, PVH extends C28473c, CVH extends C28474d> extends RecyclerView.Adapter<PVH> {

    /* renamed from: e */
    public static final int f68590e = 8;
    @C12579k

    /* renamed from: a */
    public List<? extends ExpandableType> f68591a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: b */
    public int f68592b = -1;

    /* renamed from: c */
    public boolean f68593c;
    @C12580l

    /* renamed from: d */
    public RecyclerView f68594d;

    /* renamed from: com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView$a */
    public final class C28471a extends RecyclerView.Adapter<CVH> {
        @C12579k

        /* renamed from: a */
        public final ExpandableType f68595a;
        @C12579k

        /* renamed from: b */
        public final C11304p<ViewGroup, Integer, CVH> f68596b;
        @C12579k

        /* renamed from: c */
        public final List<ExpandedType> f68597c;

        /* renamed from: d */
        public final /* synthetic */ BaseExpandableRecyclerView<ExpandedType, ExpandableType, PVH, CVH> f68598d;

        public C28471a(@C12579k BaseExpandableRecyclerView baseExpandableRecyclerView, @C12579k ExpandableType expandabletype, C11304p<? super ViewGroup, ? super Integer, ? extends CVH> pVar) {
            Intrinsics.checkNotNullParameter(expandabletype, "expandableGroup");
            Intrinsics.checkNotNullParameter(pVar, "onChildRowCreated");
            this.f68598d = baseExpandableRecyclerView;
            this.f68595a = expandabletype;
            this.f68596b = pVar;
            this.f68597c = expandabletype.mo80675a();
        }

        public int getItemCount() {
            return this.f68597c.size();
        }

        /* renamed from: k */
        public void onBindViewHolder(@C12579k CVH cvh, int i) {
            boolean z;
            Intrinsics.checkNotNullParameter(cvh, "holder");
            Collection collection = this.f68597c;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f68598d.mo80701t(cvh, this.f68597c.get(i), this.f68595a, i);
            }
        }

        @C12579k
        /* renamed from: l */
        public CVH onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
            return (C28474d) this.f68596b.invoke(viewGroup, Integer.valueOf(i));
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView$b */
    public static abstract class C28472b<E> {

        /* renamed from: b */
        public static final int f68599b = 8;

        /* renamed from: a */
        public boolean f68600a;

        @C12579k
        /* renamed from: a */
        public abstract List<E> mo80675a();

        /* renamed from: b */
        public final boolean mo83380b() {
            return this.f68600a;
        }

        /* renamed from: c */
        public final void mo83381c(boolean z) {
            this.f68600a = z;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView$c */
    public static abstract class C28473c extends RecyclerView.C20061e0 implements C11683b {

        /* renamed from: b */
        public static final int f68601b = 8;
        @C12579k

        /* renamed from: a */
        public final View f68602a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28473c(@C12579k View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "containerView");
            this.f68602a = view;
        }

        @C12579k
        /* renamed from: a */
        public View mo23555a() {
            return this.f68602a;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView$d */
    public static abstract class C28474d extends RecyclerView.C20061e0 implements C11683b {

        /* renamed from: b */
        public static final int f68603b = 8;
        @C12579k

        /* renamed from: a */
        public final View f68604a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28474d(@C12579k View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "containerView");
            this.f68604a = view;
        }

        @C12579k
        /* renamed from: a */
        public View mo23555a() {
            return this.f68604a;
        }
    }

    /* renamed from: n */
    public static final void m118359n(C28472b bVar, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(bVar, "$expandableGroup");
        Intrinsics.checkNotNullParameter(recyclerView, "$this_apply");
        if (bVar.mo83380b()) {
            ViewKt.m119006s(recyclerView, false, 0.1d, (C11289a) null, 5, (Object) null);
        } else {
            ViewKt.m118999l(recyclerView, false, 0.1d, (C11289a) null, 5, (Object) null);
        }
    }

    /* renamed from: y */
    public static final void m118360y(C28473c cVar, BaseExpandableRecyclerView baseExpandableRecyclerView, View view) {
        Intrinsics.checkNotNullParameter(cVar, "$pvh");
        Intrinsics.checkNotNullParameter(baseExpandableRecyclerView, "this$0");
        int adapterPosition = cVar.getAdapterPosition();
        if (adapterPosition != -1 && adapterPosition < baseExpandableRecyclerView.f68591a.size()) {
            baseExpandableRecyclerView.mo83373q((C28472b) baseExpandableRecyclerView.f68591a.get(adapterPosition), adapterPosition);
            baseExpandableRecyclerView.mo83374r(adapterPosition);
        }
    }

    @C12579k
    /* renamed from: A */
    public PVH onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        return mo83377x(viewGroup, i);
    }

    /* renamed from: B */
    public final void mo83367B(@C12579k List<? extends ExpandableType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f68591a = list;
    }

    /* renamed from: C */
    public final void mo83368C(PVH pvh, int i) {
        C28472b bVar = (C28472b) this.f68591a.get(i);
        C28471a aVar = new C28471a(this, bVar, new C28475xcf47c3e8(this, i));
        RecyclerView p = mo83372p(pvh.mo23555a());
        if (p != null) {
            p.setAdapter(aVar);
        }
        mo83370m(bVar, pvh.mo23555a());
        mo80702u(pvh, bVar, i);
    }

    /* renamed from: D */
    public final void mo83369D(@C12579k List<? extends ExpandableType> list) {
        Intrinsics.checkNotNullParameter(list, "newExpandableList");
        if (!Intrinsics.areEqual((Object) list, (Object) this.f68591a)) {
            this.f68591a = list;
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        return this.f68591a.size();
    }

    /* renamed from: m */
    public final void mo83370m(ExpandableType expandabletype, View view) {
        RecyclerView p = mo83372p(view);
        if (p != null) {
            p.post(new C28476a(expandabletype, p));
        }
    }

    @C12579k
    /* renamed from: o */
    public final List<ExpandableType> mo83371o() {
        return this.f68591a;
    }

    public void onAttachedToRecyclerView(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f68593c = true;
        this.f68594d = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
    }

    public void onDetachedFromRecyclerView(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f68593c = false;
        this.f68594d = null;
    }

    /* renamed from: p */
    public final RecyclerView mo83372p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final void mo83373q(ExpandableType expandabletype, int i) {
        expandabletype.mo83381c(!expandabletype.mo83380b());
        notifyItemChanged(i);
    }

    /* renamed from: r */
    public final void mo83374r(int i) {
        RecyclerView recyclerView;
        if (i == CollectionsKt__CollectionsKt.m40443G(this.f68591a) && (recyclerView = this.f68594d) != null) {
            recyclerView.mo59587m0(0, i);
        }
    }

    /* renamed from: s */
    public final void mo83375s(RecyclerView recyclerView) {
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            linearLayoutManager.mo59404f3(1);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
    }

    /* renamed from: t */
    public abstract void mo80701t(@C12579k CVH cvh, @C12580l ExpandedType expandedtype, @C12579k ExpandableType expandabletype, int i);

    /* renamed from: u */
    public abstract void mo80702u(@C12579k PVH pvh, @C12579k ExpandableType expandabletype, int i);

    /* renamed from: v */
    public void onBindViewHolder(@C12579k PVH pvh, int i) {
        Intrinsics.checkNotNullParameter(pvh, "holder");
        mo83368C(pvh, i);
    }

    @C12579k
    /* renamed from: w */
    public abstract CVH mo80703w(@C12579k ViewGroup viewGroup, int i);

    /* renamed from: x */
    public final PVH mo83377x(ViewGroup viewGroup, int i) {
        PVH z = mo80704z(viewGroup, i);
        mo83375s(mo83372p(z.mo23555a()));
        z.mo23555a().setOnClickListener(new C28477b(z, this));
        return z;
    }

    @C12579k
    /* renamed from: z */
    public abstract PVH mo80704z(@C12579k ViewGroup viewGroup, int i);
}
