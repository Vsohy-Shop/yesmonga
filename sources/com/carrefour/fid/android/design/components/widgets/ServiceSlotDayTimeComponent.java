package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.annotation.C0324b1;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37086x0;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002+\u0015B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@BX\u000e¢\u0006\f\n\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "y", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;", "value", "H", "", "options", "F", "A", "Landroid/widget/CheckedTextView;", "checkedTextView", "", "titleRes", "E", "G", "selectedOption", "x", "z", "Lcom/carrefour/fid/android/design/components/databinding/x0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/x0;", "binding", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/l;", "getOnOptionChangedListener", "()Lkotlin/jvm/functions/l;", "setOnOptionChangedListener", "(Lkotlin/jvm/functions/l;)V", "onOptionChangedListener", "c", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;", "setSelectedOption", "(Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ServiceSlotPartOfDay", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotDayTimeComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotDayTimeComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,187:1\n1#2:188\n11335#3:189\n11670#3,3:190\n*S KotlinDebug\n*F\n+ 1 ServiceSlotDayTimeComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent\n*L\n111#1:189\n111#1:190,3\n*E\n"})
public final class ServiceSlotDayTimeComponent extends ConstraintLayout {

    /* renamed from: d */
    public static final int f93216d = 8;
    @C12579k

    /* renamed from: a */
    public final C37086x0 f93217a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super ServiceSlotPartOfDay, C11079d2> f93218b;
    @C12580l

    /* renamed from: c */
    public ServiceSlotPartOfDay f93219c;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum ServiceSlotPartOfDay {
        MORNING,
        AFTERNOON,
        EVENING
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$a */
    public static final class C37174a {

        /* renamed from: c */
        public static final int f93224c = 8;
        @C12579k

        /* renamed from: a */
        public final Date f93225a;
        @C12579k

        /* renamed from: b */
        public final ServiceSlotPartOfDay f93226b;

        public C37174a(@C12579k Date date, @C12579k ServiceSlotPartOfDay serviceSlotPartOfDay) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(serviceSlotPartOfDay, "isOpen");
            this.f93225a = date;
            this.f93226b = serviceSlotPartOfDay;
        }

        /* renamed from: d */
        public static /* synthetic */ C37174a m152621d(C37174a aVar, Date date, ServiceSlotPartOfDay serviceSlotPartOfDay, int i, Object obj) {
            if ((i & 1) != 0) {
                date = aVar.f93225a;
            }
            if ((i & 2) != 0) {
                serviceSlotPartOfDay = aVar.f93226b;
            }
            return aVar.mo113170c(date, serviceSlotPartOfDay);
        }

        @C12579k
        /* renamed from: a */
        public final Date mo113168a() {
            return this.f93225a;
        }

        @C12579k
        /* renamed from: b */
        public final ServiceSlotPartOfDay mo113169b() {
            return this.f93226b;
        }

        @C12579k
        /* renamed from: c */
        public final C37174a mo113170c(@C12579k Date date, @C12579k ServiceSlotPartOfDay serviceSlotPartOfDay) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(serviceSlotPartOfDay, "isOpen");
            return new C37174a(date, serviceSlotPartOfDay);
        }

        @C12579k
        /* renamed from: e */
        public final Date mo113171e() {
            return this.f93225a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37174a)) {
                return false;
            }
            C37174a aVar = (C37174a) obj;
            return Intrinsics.areEqual((Object) this.f93225a, (Object) aVar.f93225a) && this.f93226b == aVar.f93226b;
        }

        @C12579k
        /* renamed from: f */
        public final ServiceSlotPartOfDay mo113173f() {
            return this.f93226b;
        }

        public int hashCode() {
            return (this.f93225a.hashCode() * 31) + this.f93226b.hashCode();
        }

        @C12579k
        public String toString() {
            Date date = this.f93225a;
            ServiceSlotPartOfDay serviceSlotPartOfDay = this.f93226b;
            return "SlotDateTime(date=" + date + ", isOpen=" + serviceSlotPartOfDay + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$b */
    public /* synthetic */ class C37175b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay[] r0 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r1 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.MORNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r1 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.AFTERNOON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r1 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.EVENING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.C37175b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDayTimeComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: B */
    public static final void m152606B(ServiceSlotDayTimeComponent serviceSlotDayTimeComponent, View view) {
        Intrinsics.checkNotNullParameter(serviceSlotDayTimeComponent, "this$0");
        serviceSlotDayTimeComponent.setSelectedOption(ServiceSlotPartOfDay.MORNING);
    }

    /* renamed from: C */
    public static final void m152607C(ServiceSlotDayTimeComponent serviceSlotDayTimeComponent, View view) {
        Intrinsics.checkNotNullParameter(serviceSlotDayTimeComponent, "this$0");
        serviceSlotDayTimeComponent.setSelectedOption(ServiceSlotPartOfDay.AFTERNOON);
    }

    /* renamed from: D */
    public static final void m152608D(ServiceSlotDayTimeComponent serviceSlotDayTimeComponent, View view) {
        Intrinsics.checkNotNullParameter(serviceSlotDayTimeComponent, "this$0");
        serviceSlotDayTimeComponent.setSelectedOption(ServiceSlotPartOfDay.EVENING);
    }

    private final void setSelectedOption(ServiceSlotPartOfDay serviceSlotPartOfDay) {
        C11300l<? super ServiceSlotPartOfDay, C11079d2> lVar;
        if (serviceSlotPartOfDay != this.f93219c) {
            this.f93219c = serviceSlotPartOfDay;
            mo113161G();
            if (serviceSlotPartOfDay != null && (lVar = this.f93218b) != null) {
                lVar.invoke(serviceSlotPartOfDay);
            }
        }
    }

    /* renamed from: A */
    public final void mo113158A() {
        C37086x0 x0Var = this.f93217a;
        x0Var.f92845b.setOnClickListener(new C37285n1(this));
        x0Var.f92846c.setOnClickListener(new C37288o1(this));
        x0Var.f92847d.setOnClickListener(new C37291p1(this));
    }

    /* renamed from: E */
    public final void mo113159E(CheckedTextView checkedTextView, @C0324b1 int i) {
        SpannableString spannableString = new SpannableString(checkedTextView.getContext().getString(i));
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, "\n", 0, false, 6, (Object) null);
        spannableString.setSpan(new RelativeSizeSpan(1.1f), 0, indexOf$default, 33);
        spannableString.setSpan(new StyleSpan(1), 0, indexOf$default, 33);
        checkedTextView.setText(spannableString);
        checkedTextView.setVisibility(0);
    }

    /* renamed from: F */
    public final void mo113160F(@C12579k List<? extends ServiceSlotPartOfDay> list) {
        Intrinsics.checkNotNullParameter(list, "options");
        ServiceSlotPartOfDay[] values = ServiceSlotPartOfDay.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ServiceSlotPartOfDay serviceSlotPartOfDay : values) {
            if (list.contains(serviceSlotPartOfDay)) {
                mo113167z(serviceSlotPartOfDay);
            } else {
                mo113165x(serviceSlotPartOfDay);
            }
            arrayList.add(C11079d2.f28267a);
        }
    }

    /* renamed from: G */
    public final void mo113161G() {
        boolean z;
        boolean z2;
        C37086x0 x0Var = this.f93217a;
        ServiceSlotPartOfDay serviceSlotPartOfDay = this.f93219c;
        boolean z3 = true;
        if (serviceSlotPartOfDay == ServiceSlotPartOfDay.MORNING) {
            z = true;
        } else {
            z = false;
        }
        if (serviceSlotPartOfDay == ServiceSlotPartOfDay.AFTERNOON) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (serviceSlotPartOfDay != ServiceSlotPartOfDay.EVENING) {
            z3 = false;
        }
        x0Var.f92845b.setChecked(z);
        x0Var.f92846c.setChecked(z2);
        x0Var.f92847d.setChecked(z3);
    }

    /* renamed from: H */
    public final void mo113162H(@C12579k ServiceSlotPartOfDay serviceSlotPartOfDay) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(serviceSlotPartOfDay, "value");
        C37086x0 x0Var = this.f93217a;
        boolean z3 = true;
        if (serviceSlotPartOfDay == ServiceSlotPartOfDay.MORNING) {
            z = true;
        } else {
            z = false;
        }
        if (serviceSlotPartOfDay == ServiceSlotPartOfDay.AFTERNOON) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (serviceSlotPartOfDay != ServiceSlotPartOfDay.EVENING) {
            z3 = false;
        }
        x0Var.f92845b.setChecked(z);
        x0Var.f92846c.setChecked(z2);
        x0Var.f92847d.setChecked(z3);
    }

    @C12580l
    public final C11300l<ServiceSlotPartOfDay, C11079d2> getOnOptionChangedListener() {
        return this.f93218b;
    }

    public final void setOnOptionChangedListener(@C12580l C11300l<? super ServiceSlotPartOfDay, C11079d2> lVar) {
        this.f93218b = lVar;
    }

    /* renamed from: x */
    public final void mo113165x(ServiceSlotPartOfDay serviceSlotPartOfDay) {
        Drawable b = C0507a.m2346b(getContext(), C36896b.C36904h.se_service_slot_date_time_item_available);
        ColorStateList g = C17318d.m79724g(getContext(), C36896b.C36902f.ds_service_slot_color);
        int i = C37175b.$EnumSwitchMapping$0[serviceSlotPartOfDay.ordinal()];
        if (i == 1) {
            this.f93217a.f92845b.setEnabled(true);
            this.f93217a.f92845b.setBackground(b);
            this.f93217a.f92845b.setTextColor(g);
        } else if (i == 2) {
            this.f93217a.f92846c.setEnabled(true);
            this.f93217a.f92846c.setBackground(b);
            this.f93217a.f92846c.setTextColor(g);
        } else if (i == 3) {
            this.f93217a.f92847d.setEnabled(true);
            this.f93217a.f92847d.setBackground(b);
            this.f93217a.f92847d.setTextColor(g);
        }
    }

    /* renamed from: y */
    public final void mo113166y() {
        CheckedTextView checkedTextView = this.f93217a.f92845b;
        Intrinsics.checkNotNullExpressionValue(checkedTextView, "binding.switchFirstOption");
        mo113159E(checkedTextView, C36896b.C36912p.service_slot_date_time_morning);
        CheckedTextView checkedTextView2 = this.f93217a.f92846c;
        Intrinsics.checkNotNullExpressionValue(checkedTextView2, "binding.switchSecondOption");
        mo113159E(checkedTextView2, C36896b.C36912p.service_slot_date_time_afternoon);
        CheckedTextView checkedTextView3 = this.f93217a.f92847d;
        Intrinsics.checkNotNullExpressionValue(checkedTextView3, "binding.switchThirdOption");
        mo113159E(checkedTextView3, C36896b.C36912p.service_slot_date_time_evening);
    }

    /* renamed from: z */
    public final void mo113167z(ServiceSlotPartOfDay serviceSlotPartOfDay) {
        int i = C37175b.$EnumSwitchMapping$0[serviceSlotPartOfDay.ordinal()];
        if (i == 1) {
            Drawable b = C0507a.m2346b(getContext(), C36896b.C36904h.background_grey_disabled);
            this.f93217a.f92845b.setEnabled(false);
            this.f93217a.f92845b.setBackground(b);
            this.f93217a.f92845b.setTextColor(getContext().getColor(C36896b.C36902f.ds_grey_20));
        } else if (i != 2) {
            Drawable b2 = C0507a.m2346b(getContext(), C36896b.C36904h.background_grey_disabled);
            this.f93217a.f92847d.setEnabled(false);
            this.f93217a.f92847d.setBackground(b2);
            this.f93217a.f92847d.setTextColor(getContext().getColor(C36896b.C36902f.ds_grey_20));
        } else {
            Drawable b3 = C0507a.m2346b(getContext(), C36896b.C36904h.background_grey_disabled);
            this.f93217a.f92846c.setEnabled(false);
            this.f93217a.f92846c.setBackground(b3);
            this.f93217a.f92846c.setTextColor(getContext().getColor(C36896b.C36902f.ds_grey_20));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDayTimeComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceSlotDayTimeComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDayTimeComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37086x0 b = C37086x0.m152082b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93217a = b;
        mo113158A();
        mo113166y();
    }
}
