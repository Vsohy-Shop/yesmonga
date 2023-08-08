package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.recyclerview.widget.RecyclerView;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.PagerModel;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.widget.k */
public class C36020k extends RecyclerView.Adapter<C36021a> {
    @C0359n0

    /* renamed from: a */
    public final List<BaseModel<?, ?>> f89005a = new ArrayList();
    @C0359n0

    /* renamed from: b */
    public final PagerModel f89006b;
    @C0359n0

    /* renamed from: c */
    public final C35614p f89007c;

    /* renamed from: com.urbanairship.android.layout.widget.k$a */
    public static class C36021a extends RecyclerView.C20061e0 {

        /* renamed from: a */
        public final ViewGroup f89008a;

        public C36021a(@C0359n0 Context context) {
            this((ViewGroup) new FrameLayout(context));
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m148309f() {
            C18196h2.m82642v1(this.itemView);
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.model.BaseModel<?, ?>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo107754e(@androidx.annotation.C0359n0 com.urbanairship.android.layout.model.BaseModel<?, ?> r2, @androidx.annotation.C0359n0 com.urbanairship.android.layout.environment.C35614p r3) {
            /*
                r1 = this;
                android.view.View r0 = r1.itemView
                android.content.Context r0 = r0.getContext()
                android.view.View r2 = r2.mo106993h(r0, r3)
                android.view.ViewGroup r3 = r1.f89008a
                r0 = -1
                r3.addView(r2, r0, r0)
                android.view.View r2 = r1.itemView
                com.urbanairship.android.layout.widget.j r3 = new com.urbanairship.android.layout.widget.j
                r3.<init>(r1)
                com.urbanairship.android.layout.util.C35916j.m148094l(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.widget.C36020k.C36021a.mo107754e(com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.environment.p):void");
        }

        /* renamed from: g */
        public void mo107755g() {
            this.f89008a.removeAllViews();
        }

        public C36021a(@C0359n0 ViewGroup viewGroup) {
            super(viewGroup);
            this.f89008a = viewGroup;
        }
    }

    public C36020k(@C0359n0 PagerModel pagerModel, @C0359n0 C35614p pVar) {
        this.f89006b = pagerModel;
        this.f89007c = pVar;
    }

    public int getItemCount() {
        return this.f89005a.size();
    }

    public int getItemViewType(int i) {
        return this.f89005a.get(i).mo107005t().ordinal();
    }

    /* renamed from: k */
    public BaseModel<?, ?> mo107749k(int i) {
        return this.f89005a.get(i);
    }

    /* renamed from: l */
    public void onBindViewHolder(@C0359n0 C36021a aVar, int i) {
        BaseModel<?, ?> k = mo107749k(i);
        aVar.f89008a.setId(this.f89006b.mo107094N(i));
        aVar.mo107754e(k, this.f89007c);
    }

    @C0359n0
    /* renamed from: m */
    public C36021a onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return new C36021a(viewGroup.getContext());
    }

    /* renamed from: n */
    public void onViewRecycled(@C0359n0 C36021a aVar) {
        super.onViewRecycled(aVar);
        aVar.mo107755g();
    }

    /* renamed from: o */
    public void mo107753o(@C0359n0 List<BaseModel<?, ?>> list) {
        if (!this.f89005a.equals(list)) {
            this.f89005a.clear();
            this.f89005a.addAll(list);
            notifyDataSetChanged();
        }
    }
}
