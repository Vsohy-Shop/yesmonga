package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.databinding.C36676d7;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.f */
public final class C24229f extends RecyclerView.Adapter<C24231b> {

    /* renamed from: c */
    public static final int f60607c = 8;
    @C12579k

    /* renamed from: a */
    public C24230a f60608a;
    @C12579k

    /* renamed from: b */
    public List<DataPrimeCmsResponse> f60609b = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.f$a */
    public interface C24230a {
        /* renamed from: h0 */
        void mo70916h0();

        void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse);

        void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse);
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.f$b */
    public final class C24231b extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36676d7 f60610a;

        /* renamed from: b */
        public final /* synthetic */ C24229f f60611b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24231b(@C12579k C24229f fVar, C36676d7 d7Var) {
            super(d7Var.getRoot());
            Intrinsics.checkNotNullParameter(d7Var, "binding");
            this.f60611b = fVar;
            this.f60610a = d7Var;
        }

        /* renamed from: f */
        public static final void m106660f(C24231b bVar, C24230a aVar, DataPrimeCmsResponse dataPrimeCmsResponse, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            Intrinsics.checkNotNullParameter(aVar, "$delegate");
            Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "$prime");
            if (z) {
                C36676d7 d7Var = bVar.f60610a;
                d7Var.f90731e.setBackground(C17318d.m79726i(d7Var.getRoot().getContext(), R.drawable.selector));
                aVar.sendTagPrimeAdded(dataPrimeCmsResponse);
            } else {
                C36676d7 d7Var2 = bVar.f60610a;
                d7Var2.f90731e.setBackground(C17318d.m79726i(d7Var2.getRoot().getContext(), R.drawable.item_border_shadow));
                aVar.sendTagPrimeRemoved(dataPrimeCmsResponse);
            }
            dataPrimeCmsResponse.setSelected(z);
            aVar.mo70916h0();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            if (r0 == null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            if (r0 == null) goto L_0x0032;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70919d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r9, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24229f.C24230a r10) {
            /*
                r8 = this;
                java.lang.String r0 = "prime"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                boolean r0 = r9.isSelected()
                java.lang.String r1 = ""
                r2 = 0
                if (r0 == 0) goto L_0x0022
                com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse r0 = r9.getPictoMobile()
                if (r0 == 0) goto L_0x001e
                java.lang.String r0 = r0.getUrl()
                goto L_0x001f
            L_0x001e:
                r0 = r2
            L_0x001f:
                if (r0 != 0) goto L_0x0031
                goto L_0x0032
            L_0x0022:
                com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse r0 = r9.getPictoMobileOff()
                if (r0 == 0) goto L_0x002d
                java.lang.String r0 = r0.getUrl()
                goto L_0x002e
            L_0x002d:
                r0 = r2
            L_0x002e:
                if (r0 != 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r1 = r0
            L_0x0032:
                com.carrefour.fid.android.databinding.d7 r0 = r8.f60610a
                com.carrefour.fid.android.shared.util.ImageUtils r3 = com.carrefour.fid.android.shared.util.ImageUtils.f70796a
                android.widget.ImageView r4 = r0.f90730d
                java.lang.String r5 = "imgPrimeCellIcon"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                r3.mo84105i(r1, r4)
                android.widget.TextView r1 = r0.f90735i
                java.lang.String r3 = r9.getName()
                r1.setText(r3)
                android.widget.TextView r1 = r0.f90733g
                r3 = 1
                java.lang.CharSequence[] r4 = new java.lang.CharSequence[r3]
                java.lang.String r5 = r9.getDescription()
                com.carrefour.fid.android.databinding.d7 r6 = r8.f60610a
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.getRoot()
                android.content.Context r6 = r6.getContext()
                r7 = 2131953526(0x7f130776, float:1.9543525E38)
                java.lang.String r6 = r6.getString(r7)
                java.lang.String r7 = "binding.root.context.get…g.primes_fid_exclusivity)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                android.text.SpannableStringBuilder r3 = com.carrefour.fid.android.shared.extension.StringKt.m118903L(r5, r6, r3)
                r5 = 0
                r4[r5] = r3
                java.lang.CharSequence r3 = android.text.TextUtils.concat(r4)
                r1.setText(r3)
                android.widget.TextView r1 = r0.f90734h
                java.lang.String r3 = r9.getText()
                r1.setText(r3)
                androidx.appcompat.widget.SwitchCompat r1 = r0.f90732f
                boolean r3 = r9.isSelected()
                r1.setChecked(r3)
                com.carrefour.fid.android.databinding.d7 r1 = r8.f60610a
                androidx.constraintlayout.widget.ConstraintLayout r1 = r1.getRoot()
                android.content.Context r1 = r1.getContext()
                r3 = 2131953529(0x7f130779, float:1.9543532E38)
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r3 = r9.getName()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
                if (r1 == 0) goto L_0x00c7
                android.widget.TextView r1 = r0.f90733g
                java.lang.String r3 = r9.getDescription()
                com.carrefour.fid.android.databinding.d7 r4 = r8.f60610a
                androidx.constraintlayout.widget.ConstraintLayout r4 = r4.getRoot()
                android.content.Context r4 = r4.getContext()
                r6 = 2131953530(0x7f13077a, float:1.9543534E38)
                java.lang.String r4 = r4.getString(r6)
                java.lang.String r6 = "binding.root.context.get…loyalty_proximity_market)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                r6 = 2
                android.text.SpannableStringBuilder r2 = com.carrefour.fid.android.shared.extension.StringKt.m118904M(r3, r4, r5, r6, r2)
                r1.setText(r2)
            L_0x00c7:
                boolean r1 = r9.isSelected()
                if (r1 == 0) goto L_0x00e4
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f90731e
                com.carrefour.fid.android.databinding.d7 r1 = r8.f60610a
                androidx.constraintlayout.widget.ConstraintLayout r1 = r1.getRoot()
                android.content.Context r1 = r1.getContext()
                r2 = 2131231753(0x7f080409, float:1.8079596E38)
                android.graphics.drawable.Drawable r1 = androidx.core.content.C17318d.m79726i(r1, r2)
                r0.setBackground(r1)
                goto L_0x00fa
            L_0x00e4:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f90731e
                com.carrefour.fid.android.databinding.d7 r1 = r8.f60610a
                androidx.constraintlayout.widget.ConstraintLayout r1 = r1.getRoot()
                android.content.Context r1 = r1.getContext()
                r2 = 2131231636(0x7f080394, float:1.8079359E38)
                android.graphics.drawable.Drawable r1 = androidx.core.content.C17318d.m79726i(r1, r2)
                r0.setBackground(r1)
            L_0x00fa:
                r8.mo70920e(r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24229f.C24231b.mo70919d(com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse, com.carrefour.fid.android.presentation.ui.loyalty.adapters.f$a):void");
        }

        /* renamed from: e */
        public final void mo70920e(DataPrimeCmsResponse dataPrimeCmsResponse, C24230a aVar) {
            this.f60610a.f90732f.setOnCheckedChangeListener(new C24232g(this, aVar, dataPrimeCmsResponse));
        }
    }

    public C24229f(@C12579k C24230a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "delegate");
        this.f60608a = aVar;
    }

    public int getItemCount() {
        return this.f60609b.size();
    }

    @C12579k
    /* renamed from: k */
    public final List<DataPrimeCmsResponse> mo70911k() {
        return this.f60609b;
    }

    @C12579k
    /* renamed from: l */
    public final List<DataPrimeCmsResponse> mo70912l() {
        return this.f60609b;
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C24231b bVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "holder");
        bVar.mo70919d(this.f60609b.get(i), this.f60608a);
    }

    @C12579k
    /* renamed from: n */
    public C24231b onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36676d7 d = C36676d7.m150435d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C24231b(this, d);
    }

    /* renamed from: o */
    public final void mo70915o(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f60609b = list;
        notifyDataSetChanged();
    }
}
