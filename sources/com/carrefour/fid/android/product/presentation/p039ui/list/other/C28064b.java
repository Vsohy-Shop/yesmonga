package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C17584h;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.product.databinding.C27488g;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.b */
public final class C28064b extends RecyclerView.Adapter<C28065a> {
    @C12579k

    /* renamed from: a */
    public List<String> f67992a;
    @C12579k

    /* renamed from: b */
    public final CriteoFormatRendering f67993b;

    /* renamed from: c */
    public int f67994c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Integer, C11079d2> f67995d;

    @C11363r0({"SMAP\nButterflyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButterflyAdapter.kt\ncom/carrefour/fid/android/product/presentation/ui/list/other/ButterflyAdapter$ButterflyViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.b$a */
    public final class C28065a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C27488g f67996a;

        /* renamed from: b */
        public final /* synthetic */ C28064b f67997b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28065a(@C12579k C28064b bVar, C27488g gVar) {
            super(gVar.getRoot());
            Intrinsics.checkNotNullParameter(gVar, "binding");
            this.f67997b = bVar;
            this.f67996a = gVar;
        }

        /* renamed from: e */
        public static final void m117593e(C28064b bVar, C28065a aVar, View view) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            Intrinsics.checkNotNullParameter(aVar, "this$1");
            bVar.f67994c = aVar.getAdapterPosition();
            bVar.notifyDataSetChanged();
            bVar.f67995d.invoke(Integer.valueOf(bVar.f67994c));
        }

        /* renamed from: d */
        public final void mo81641d(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "buttonText");
            this.f67996a.f66670b.setText(str);
            if (getAdapterPosition() == this.f67997b.f67994c) {
                z = true;
            } else {
                z = false;
            }
            mo81643g(z);
            this.f67996a.f66670b.setOnClickListener(new C28063a(this.f67997b, this));
        }

        @C12579k
        /* renamed from: f */
        public final C27488g mo81642f() {
            return this.f67996a;
        }

        /* renamed from: g */
        public final void mo81643g(boolean z) {
            Integer num;
            Integer num2;
            ColorFilter colorFilter;
            if (z) {
                num = this.f67997b.f67993b.mo117359u();
            } else {
                num = this.f67997b.f67993b.mo117353p();
            }
            if (z) {
                num2 = this.f67997b.f67993b.mo117360v();
            } else {
                num2 = this.f67997b.f67993b.mo117354q();
            }
            Drawable background = this.f67996a.f66670b.getBackground();
            if (num != null) {
                colorFilter = C17584h.m80560a(num.intValue(), BlendModeCompat.SRC_ATOP);
            } else {
                colorFilter = null;
            }
            background.setColorFilter(colorFilter);
            if (num2 != null) {
                this.f67996a.f66670b.setTextColor(num2.intValue());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28064b(List list, CriteoFormatRendering criteoFormatRendering, int i, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, criteoFormatRendering, i, lVar);
    }

    public int getItemCount() {
        return this.f67992a.size();
    }

    /* renamed from: o */
    public void onBindViewHolder(@C12579k C28065a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo81641d(this.f67992a.get(i));
    }

    @C12579k
    /* renamed from: p */
    public C28065a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27488g d = C27488g.m115679d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C28065a(this, d);
    }

    public C28064b(@C12579k List<String> list, @C12579k CriteoFormatRendering criteoFormatRendering, int i, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(criteoFormatRendering, "rendering");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f67992a = list;
        this.f67993b = criteoFormatRendering;
        this.f67994c = i;
        this.f67995d = lVar;
    }
}
