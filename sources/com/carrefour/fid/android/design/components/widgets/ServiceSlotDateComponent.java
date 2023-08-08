package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37080u0;
import com.carrefour.fid.android.design.components.extension.C37112d;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\f\u0017B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDateComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDateComponent$b;", "model", "Lkotlin/d2;", "u", "w", "", "isSelected", "setUpAccessibility", "v", "Lcom/carrefour/fid/android/design/components/databinding/u0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/u0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotDateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotDateComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceSlotDateComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class ServiceSlotDateComponent extends ConstraintLayout {
    @C12579k

    /* renamed from: b */
    public static final C37172a f93207b = new C37172a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f93208c = 8;
    @C12579k

    /* renamed from: a */
    public final C37080u0 f93209a;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent$a */
    public static final class C37172a {
        public /* synthetic */ C37172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C37173b mo113144a(@C12579k Date date, boolean z) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new C37173b(date, z);
        }

        public C37172a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent$b */
    public static final class C37173b {

        /* renamed from: c */
        public static final int f93210c = 8;
        @C12579k

        /* renamed from: a */
        public final Date f93211a;

        /* renamed from: b */
        public final boolean f93212b;

        public C37173b(@C12579k Date date, boolean z) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f93211a = date;
            this.f93212b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C37173b m152593d(C37173b bVar, Date date, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                date = bVar.f93211a;
            }
            if ((i & 2) != 0) {
                z = bVar.f93212b;
            }
            return bVar.mo113147c(date, z);
        }

        @C12579k
        /* renamed from: a */
        public final Date mo113145a() {
            return this.f93211a;
        }

        /* renamed from: b */
        public final boolean mo113146b() {
            return this.f93212b;
        }

        @C12579k
        /* renamed from: c */
        public final C37173b mo113147c(@C12579k Date date, boolean z) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new C37173b(date, z);
        }

        @C12579k
        /* renamed from: e */
        public final Date mo113148e() {
            return this.f93211a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37173b)) {
                return false;
            }
            C37173b bVar = (C37173b) obj;
            return Intrinsics.areEqual((Object) this.f93211a, (Object) bVar.f93211a) && this.f93212b == bVar.f93212b;
        }

        /* renamed from: f */
        public final boolean mo113150f() {
            return this.f93212b;
        }

        public int hashCode() {
            int hashCode = this.f93211a.hashCode() * 31;
            boolean z = this.f93212b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            Date date = this.f93211a;
            boolean z = this.f93212b;
            return "UiSlotDateModel(date=" + date + ", isOpen=" + z + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public final void setUpAccessibility(@C12579k C37173b bVar, boolean z) {
        String str;
        boolean z2;
        Intrinsics.checkNotNullParameter(bVar, C40045d.f102104u);
        if (!bVar.mo113150f()) {
            str = getContext().getString(C36896b.C36912p.accessibility_slot_unavailable);
        } else if (z) {
            str = getContext().getString(C36896b.C36912p.accessibility_slot_selected);
        } else {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "when {\n            !mode…     else -> \"\"\n        }");
        String string = getContext().getString(C36896b.C36912p.accessibility_slot_date_selection);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…lity_slot_date_selection)");
        String a = C37112d.m152153a(bVar.mo113148e());
        View root = this.f93209a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        String str2 = a + ", " + string + ", " + str;
        if (!bVar.mo113150f() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        ViewKt.m152120b(root, str2, z2);
    }

    /* renamed from: u */
    public final void mo113141u(@C12579k C37173b bVar) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(bVar, C40045d.f102104u);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE);
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(Calendar.getInstance().getTime()));
        Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C37254k1.f93425b, Locale.FRANCE);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(C37254k1.f93426c, Locale.FRANCE);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(C37254k1.f93427d, Locale.FRANCE);
        TextView textView = this.f93209a.f92830b;
        if (Intrinsics.areEqual((Object) parse, (Object) bVar.mo113148e())) {
            str = getContext().getString(C36896b.C36912p.service_slot_date_today);
        } else {
            str = simpleDateFormat2.format(bVar.mo113148e());
            Intrinsics.checkNotNullExpressionValue(str, "dayOfWeekFormatter.format(model.date)");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                String valueOf = String.valueOf(str.charAt(0));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                sb.append(upperCase);
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            }
        }
        textView.setText(str);
        this.f93209a.f92831c.setText(simpleDateFormat3.format(bVar.mo113148e()));
        this.f93209a.f92832d.setText(simpleDateFormat4.format(bVar.mo113148e()));
        if (!bVar.mo113150f()) {
            mo113142v();
        }
    }

    /* renamed from: v */
    public final void mo113142v() {
        setBackgroundResource(C36896b.C36904h.background_service_slot_item_unavailable);
        TextView textView = this.f93209a.f92830b;
        Context context = getContext();
        int i = C36896b.C36902f.ds_grey_20;
        textView.setTextColor(context.getColor(i));
        this.f93209a.f92831c.setTextColor(getContext().getColor(i));
        this.f93209a.f92832d.setTextColor(getContext().getColor(i));
    }

    /* renamed from: w */
    public final void mo113143w() {
        setBackgroundResource(C36896b.C36904h.background_service_slot_item_activated);
        this.f93209a.f92830b.setActivated(true);
        this.f93209a.f92831c.setActivated(true);
        this.f93209a.f92832d.setActivated(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceSlotDateComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37080u0 b = C37080u0.m152068b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93209a = b;
    }
}
