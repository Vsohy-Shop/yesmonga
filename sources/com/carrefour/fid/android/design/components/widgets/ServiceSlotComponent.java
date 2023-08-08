package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37088y0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002\u0011\u0019B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotComponent$b;", "slot", "Lkotlin/d2;", "setUpAccessibility", "", "isYieldEligible", "isFromHome", "u", "isSelected", "x", "w", "Lkotlin/Pair;", "", "v", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "getOnSlotItemSelection", "()Lkotlin/jvm/functions/a;", "setOnSlotItemSelection", "(Lkotlin/jvm/functions/a;)V", "onSlotItemSelection", "Lcom/carrefour/fid/android/design/components/databinding/y0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/y0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ServiceSlotComponent extends ConstraintLayout {
    @C12579k

    /* renamed from: c */
    public static final C37170a f93190c = new C37170a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f93191d = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f93192a;
    @C12579k

    /* renamed from: b */
    public final C37088y0 f93193b;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent$a */
    public static final class C37170a {
        public /* synthetic */ C37170a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C37171b mo113111a(@C12579k Date date, @C12579k Date date2, @C12579k String str, @C12580l Double d, @C12580l String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(date, "startDate");
            Date date3 = date2;
            Intrinsics.checkNotNullParameter(date3, "endDate");
            String str3 = str;
            Intrinsics.checkNotNullParameter(str3, "description");
            return new C37171b(date, date3, str3, d, str2, z, z2, z3, z4, z5, z6, z7);
        }

        public C37170a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final void setUpAccessibility(C37171b bVar) {
        String str;
        Pair<String, String> v = mo113108v(bVar);
        String a = v.mo21846a();
        String b = v.mo21847b();
        if (bVar.mo113135v() || !bVar.mo113137x()) {
            str = getContext().getString(C36896b.C36912p.accessibility_slot_unavailable);
        } else if (bVar.mo113139z()) {
            str = getContext().getString(C36896b.C36912p.accessibility_slot_selected);
        } else {
            str = new String();
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (!slot.isFull && slot…ot_unavailable)\n        }");
        boolean z = false;
        String string = getContext().getString(C36896b.C36912p.accessibility_service_slot_time, new Object[]{a, b});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ce_slot_time, start, end)");
        String string2 = getContext().getString(C36896b.C36912p.accessibility_slot_time_selection);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…lity_slot_time_selection)");
        View root = this.f93193b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        String str2 = string + ", " + string2 + ", " + str;
        if (bVar.mo113139z() || bVar.mo113135v() || !bVar.mo113137x()) {
            z = true;
        }
        ViewKt.m152120b(root, str2, z);
    }

    @C12580l
    public final C11289a<C11079d2> getOnSlotItemSelection() {
        return this.f93192a;
    }

    public final void setOnSlotItemSelection(@C12580l C11289a<C11079d2> aVar) {
        this.f93192a = aVar;
    }

    /* renamed from: u */
    public final void mo113107u(@C12579k C37171b bVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        Intrinsics.checkNotNullParameter(bVar, OnlineStoreShopFragment.f60516Z);
        if (bVar.mo113135v() || !bVar.mo113137x()) {
            i = C36896b.C36904h.background_service_slot_item_unavailable;
        } else {
            i = C36896b.C36904h.se_service_slot_date_item_available;
        }
        setBackgroundResource(i);
        int i4 = 8;
        if (bVar.mo113134u() || (!bVar.mo113138y() && (bVar.mo113135v() || !bVar.mo113137x()))) {
            this.f93193b.f92853d.setVisibility(0);
            this.f93193b.f92853d.setText(getContext().getString(C36896b.C36912p.service_full_slot_title));
            this.f93193b.f92853d.setCompoundDrawablesWithIntrinsicBounds(C36896b.C36904h.ds_ic_full_slot, 0, 0, 0);
            TextView textView = this.f93193b.f92857h;
            Context context = getContext();
            int i5 = C36896b.C36902f.ds_grey_20;
            textView.setTextColor(C17318d.m79723f(context, i5));
            this.f93193b.f92853d.setTextColor(C17318d.m79723f(getContext(), i5));
            this.f93193b.f92855f.setTextColor(C17318d.m79723f(getContext(), i5));
            this.f93193b.f92854e.setTextColor(C17318d.m79723f(getContext(), i5));
        } else {
            mo113110x(bVar.mo113139z());
            if (bVar.mo113127o().length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.f93193b.f92853d.setVisibility(8);
            } else {
                this.f93193b.f92853d.setText(getContext().getString(C36896b.C36912p.service_slot_few_places_left_title));
            }
        }
        Pair<String, String> v = mo113108v(bVar);
        this.f93193b.f92857h.setText(getContext().getString(C36896b.C36912p.service_slot_time, new Object[]{v.mo21846a(), v.mo21847b()}));
        TextView textView2 = this.f93193b.f92857h;
        if (!z || !bVar.mo113136w()) {
            i2 = 0;
        } else {
            i2 = C36896b.C36904h.ds_eco_label;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
        if (bVar.mo113130r() == null || Intrinsics.areEqual(bVar.mo113130r(), 0.0d) || bVar.mo113129q() == null || z2) {
            this.f93193b.f92855f.setVisibility(8);
            TextView textView3 = this.f93193b.f92854e;
            if (!Intrinsics.areEqual(bVar.mo113130r(), 0.0d) || !z || !bVar.mo113137x()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView3.setVisibility(i3);
        } else {
            this.f93193b.f92855f.setVisibility(0);
            this.f93193b.f92855f.setText(bVar.mo113129q());
            this.f93193b.f92854e.setVisibility(8);
        }
        TextView textView4 = this.f93193b.f92851b;
        if (bVar.mo113132t()) {
            i4 = 0;
        }
        textView4.setVisibility(i4);
        setUpAccessibility(bVar);
    }

    /* renamed from: v */
    public final Pair<String, String> mo113108v(C37171b bVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH'h'mm", Locale.FRANCE);
        Date s = bVar.mo113131s();
        if (s == null) {
            s = new Date();
        }
        String format = simpleDateFormat.format(s);
        Date p = bVar.mo113128p();
        if (p == null) {
            p = new Date();
        }
        return new Pair<>(format, simpleDateFormat.format(p));
    }

    /* renamed from: w */
    public final void mo113109w(boolean z) {
        this.f93193b.f92856g.setVisibility(z ? 0 : 4);
    }

    /* renamed from: x */
    public final void mo113110x(boolean z) {
        setBackgroundResource(C36896b.C36904h.se_service_slot_date_item_available);
        this.f93193b.getRoot().setActivated(z);
        mo113109w(z);
        this.f93193b.f92857h.setActivated(z);
        this.f93193b.f92853d.setActivated(z);
        this.f93193b.f92855f.setActivated(z);
        this.f93193b.f92854e.setActivated(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceSlotComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setClickable(true);
        C37088y0 b = C37088y0.m152086b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93193b = b;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent$b */
    public static final class C37171b {

        /* renamed from: m */
        public static final int f93194m = 8;
        @C12580l

        /* renamed from: a */
        public final Date f93195a;
        @C12580l

        /* renamed from: b */
        public final Date f93196b;
        @C12579k

        /* renamed from: c */
        public final String f93197c;
        @C12580l

        /* renamed from: d */
        public final Double f93198d;
        @C12580l

        /* renamed from: e */
        public final String f93199e;

        /* renamed from: f */
        public final boolean f93200f;

        /* renamed from: g */
        public final boolean f93201g;

        /* renamed from: h */
        public final boolean f93202h;

        /* renamed from: i */
        public final boolean f93203i;

        /* renamed from: j */
        public final boolean f93204j;

        /* renamed from: k */
        public final boolean f93205k;

        /* renamed from: l */
        public final boolean f93206l;

        public C37171b(@C12580l Date date, @C12580l Date date2, @C12579k String str, @C12580l Double d, @C12580l String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            Intrinsics.checkNotNullParameter(str, "description");
            this.f93195a = date;
            this.f93196b = date2;
            this.f93197c = str;
            this.f93198d = d;
            this.f93199e = str2;
            this.f93200f = z;
            this.f93201g = z2;
            this.f93202h = z3;
            this.f93203i = z4;
            this.f93204j = z5;
            this.f93205k = z6;
            this.f93206l = z7;
        }

        /* renamed from: n */
        public static /* synthetic */ C37171b m152563n(C37171b bVar, Date date, Date date2, String str, Double d, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
            C37171b bVar2 = bVar;
            int i2 = i;
            return bVar.mo113126m((i2 & 1) != 0 ? bVar2.f93195a : date, (i2 & 2) != 0 ? bVar2.f93196b : date2, (i2 & 4) != 0 ? bVar2.f93197c : str, (i2 & 8) != 0 ? bVar2.f93198d : d, (i2 & 16) != 0 ? bVar2.f93199e : str2, (i2 & 32) != 0 ? bVar2.f93200f : z, (i2 & 64) != 0 ? bVar2.f93201g : z2, (i2 & 128) != 0 ? bVar2.f93202h : z3, (i2 & 256) != 0 ? bVar2.f93203i : z4, (i2 & 512) != 0 ? bVar2.f93204j : z5, (i2 & 1024) != 0 ? bVar2.f93205k : z6, (i2 & 2048) != 0 ? bVar2.f93206l : z7);
        }

        @C12580l
        /* renamed from: a */
        public final Date mo113112a() {
            return this.f93195a;
        }

        /* renamed from: b */
        public final boolean mo113113b() {
            return this.f93204j;
        }

        /* renamed from: c */
        public final boolean mo113114c() {
            return this.f93205k;
        }

        /* renamed from: d */
        public final boolean mo113115d() {
            return this.f93206l;
        }

        @C12580l
        /* renamed from: e */
        public final Date mo113116e() {
            return this.f93196b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37171b)) {
                return false;
            }
            C37171b bVar = (C37171b) obj;
            return Intrinsics.areEqual((Object) this.f93195a, (Object) bVar.f93195a) && Intrinsics.areEqual((Object) this.f93196b, (Object) bVar.f93196b) && Intrinsics.areEqual((Object) this.f93197c, (Object) bVar.f93197c) && Intrinsics.areEqual((Object) this.f93198d, (Object) bVar.f93198d) && Intrinsics.areEqual((Object) this.f93199e, (Object) bVar.f93199e) && this.f93200f == bVar.f93200f && this.f93201g == bVar.f93201g && this.f93202h == bVar.f93202h && this.f93203i == bVar.f93203i && this.f93204j == bVar.f93204j && this.f93205k == bVar.f93205k && this.f93206l == bVar.f93206l;
        }

        @C12579k
        /* renamed from: f */
        public final String mo113118f() {
            return this.f93197c;
        }

        @C12580l
        /* renamed from: g */
        public final Double mo113119g() {
            return this.f93198d;
        }

        @C12580l
        /* renamed from: h */
        public final String mo113120h() {
            return this.f93199e;
        }

        public int hashCode() {
            Date date = this.f93195a;
            int i = 0;
            int hashCode = (date == null ? 0 : date.hashCode()) * 31;
            Date date2 = this.f93196b;
            int hashCode2 = (((hashCode + (date2 == null ? 0 : date2.hashCode())) * 31) + this.f93197c.hashCode()) * 31;
            Double d = this.f93198d;
            int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.f93199e;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.f93200f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f93201g;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f93202h;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f93203i;
            if (z5) {
                z5 = true;
            }
            int i6 = (i5 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f93204j;
            if (z6) {
                z6 = true;
            }
            int i7 = (i6 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f93205k;
            if (z7) {
                z7 = true;
            }
            int i8 = (i7 + (z7 ? 1 : 0)) * 31;
            boolean z8 = this.f93206l;
            if (!z8) {
                z2 = z8;
            }
            return i8 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo113122i() {
            return this.f93200f;
        }

        /* renamed from: j */
        public final boolean mo113123j() {
            return this.f93201g;
        }

        /* renamed from: k */
        public final boolean mo113124k() {
            return this.f93202h;
        }

        /* renamed from: l */
        public final boolean mo113125l() {
            return this.f93203i;
        }

        @C12579k
        /* renamed from: m */
        public final C37171b mo113126m(@C12580l Date date, @C12580l Date date2, @C12579k String str, @C12580l Double d, @C12580l String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            String str3 = str;
            Intrinsics.checkNotNullParameter(str3, "description");
            return new C37171b(date, date2, str3, d, str2, z, z2, z3, z4, z5, z6, z7);
        }

        @C12579k
        /* renamed from: o */
        public final String mo113127o() {
            return this.f93197c;
        }

        @C12580l
        /* renamed from: p */
        public final Date mo113128p() {
            return this.f93196b;
        }

        @C12580l
        /* renamed from: q */
        public final String mo113129q() {
            return this.f93199e;
        }

        @C12580l
        /* renamed from: r */
        public final Double mo113130r() {
            return this.f93198d;
        }

        @C12580l
        /* renamed from: s */
        public final Date mo113131s() {
            return this.f93195a;
        }

        /* renamed from: t */
        public final boolean mo113132t() {
            return this.f93204j;
        }

        @C12579k
        public String toString() {
            Date date = this.f93195a;
            Date date2 = this.f93196b;
            String str = this.f93197c;
            Double d = this.f93198d;
            String str2 = this.f93199e;
            boolean z = this.f93200f;
            boolean z2 = this.f93201g;
            boolean z3 = this.f93202h;
            boolean z4 = this.f93203i;
            boolean z5 = this.f93204j;
            boolean z6 = this.f93205k;
            boolean z7 = this.f93206l;
            return "UiSlotModel(startDate=" + date + ", endDate=" + date2 + ", description=" + str + ", price=" + d + ", formattedPrice=" + str2 + ", isFull=" + z + ", isClose=" + z2 + ", isOpenSlot=" + z3 + ", isGreenSlot=" + z4 + ", isBestChoice=" + z5 + ", isSelected=" + z6 + ", isPreSelectedSlot=" + z7 + ")";
        }

        /* renamed from: u */
        public final boolean mo113134u() {
            return this.f93201g;
        }

        /* renamed from: v */
        public final boolean mo113135v() {
            return this.f93200f;
        }

        /* renamed from: w */
        public final boolean mo113136w() {
            return this.f93203i;
        }

        /* renamed from: x */
        public final boolean mo113137x() {
            return this.f93202h;
        }

        /* renamed from: y */
        public final boolean mo113138y() {
            return this.f93206l;
        }

        /* renamed from: z */
        public final boolean mo113139z() {
            return this.f93205k;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37171b(Date date, Date date2, String str, Double d, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(date, date2, str, d, str2, z, (i & 64) != 0 ? false : z2, z3, z4, z5, z6, z7);
        }
    }
}
