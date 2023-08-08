package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36745k6;
import com.carrefour.fid.android.loyalty.presentation.models.DataPrimeCmsModel;
import com.carrefour.fid.android.shared.util.ImageUtils;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.h */
public final class C24233h extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: b */
    public static final int f60615b = 8;
    @C12579k

    /* renamed from: a */
    public List<DataPrimeCmsModel> f60616a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.h$a */
    public final class C24234a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36745k6 f60617a;

        /* renamed from: b */
        public final /* synthetic */ C24233h f60618b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24234a(@C12579k C24233h hVar, C36745k6 k6Var) {
            super(k6Var.getRoot());
            Intrinsics.checkNotNullParameter(k6Var, "binding");
            this.f60618b = hVar;
            this.f60617a = k6Var;
        }

        /* renamed from: c */
        public final void mo70924c(@C12579k DataPrimeCmsModel dataPrimeCmsModel) {
            String str;
            Intrinsics.checkNotNullParameter(dataPrimeCmsModel, "dataPrimeCmsModel");
            if (dataPrimeCmsModel.isSelected()) {
                str = dataPrimeCmsModel.getImageUrl();
            } else {
                str = dataPrimeCmsModel.getImageUrlOff();
            }
            ImageUtils imageUtils = ImageUtils.f70796a;
            ImageView imageView = this.f60617a.f91149b;
            if (str == null) {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(imageView, "itemImgPrimes");
            imageUtils.mo84105i(str, imageView);
        }
    }

    public int getItemCount() {
        return this.f60616a.size();
    }

    @C12579k
    /* renamed from: k */
    public final List<DataPrimeCmsModel> mo70922k() {
        return this.f60616a;
    }

    /* renamed from: l */
    public final void mo70923l(@C12579k List<DataPrimeCmsModel> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f60616a = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        ((C24234a) e0Var).mo70924c(this.f60616a.get(i));
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36745k6 d = C36745k6.m150709d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C24234a(this, d);
    }
}
