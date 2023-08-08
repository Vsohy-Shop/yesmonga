package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37078t0;
import com.carrefour.fid.android.design.components.extension.C37116g;
import com.carrefour.fid.android.design.components.type.C37130b;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent$UiModel;", "model", "v", "Lcom/carrefour/fid/android/design/components/databinding/t0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/t0;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "UiModel", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ServiceInfoComponent extends ConstraintLayout implements C37141h {

    /* renamed from: c */
    public static final int f93168c = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93169a;
    @C12579k

    /* renamed from: b */
    public final C37078t0 f93170b;

    @C8567o(parameters = 0)
    public static final class UiModel {
        @C12579k

        /* renamed from: c */
        public static final Companion f93171c = new Companion((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final int f93172d = 0;
        @C12579k

        /* renamed from: a */
        public final C37168b f93173a;
        @C12579k

        /* renamed from: b */
        public final C37167a f93174b;

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent$UiModel$Availability;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public enum Availability {
            AVAILABLE,
            UNAVAILABLE;
            
            @C12579k

            /* renamed from: a */
            public static final C37166a f93175a = null;

            /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$Availability$a */
            public static final class C37166a {
                public /* synthetic */ C37166a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @C12579k
                /* renamed from: a */
                public final Availability mo113087a(boolean z) {
                    return z ? Availability.AVAILABLE : Availability.UNAVAILABLE;
                }

                public C37166a() {
                }
            }

            /* access modifiers changed from: public */
            static {
                f93175a = new C37166a((DefaultConstructorMarker) null);
            }
        }

        public static final class Companion {

            @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent$UiModel$Companion$Service;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
            public enum Service {
                f93179a,
                LEX
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final UiModel mo113088a(@C12579k Availability availability, @C12580l C37130b bVar, @C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(availability, C28534f.f69157h0);
                Intrinsics.checkNotNullParameter(aVar, "onButtonClicked");
                int i = C36896b.C36912p.service_info_clcv_title;
                int i2 = C36896b.C36904h.ds_il_delivery_active;
                int i3 = C36896b.C36912p.service_info_clcv_subtitle;
                if (bVar == null) {
                    bVar = new C37130b.C37132b(C36896b.C36912p.service_info_unvailable_details);
                }
                return new UiModel(new C37168b(i, i2, i3, availability, bVar), new C37167a(aVar));
            }

            @C12579k
            /* renamed from: b */
            public final UiModel mo113089b(@C12579k Availability availability, @C12580l C37130b bVar, @C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(availability, C28534f.f69157h0);
                Intrinsics.checkNotNullParameter(aVar, "onButtonClicked");
                int i = C36896b.C36912p.service_info_lex_title;
                int i2 = C36896b.C36904h.ds_il_delivery_h1h3_active;
                int i3 = C36896b.C36912p.service_info_lex_subtitle;
                if (bVar == null) {
                    bVar = new C37130b.C37132b(C36896b.C36912p.service_info_unvailable_details);
                }
                return new UiModel(new C37168b(i, i2, i3, availability, bVar), new C37167a(aVar));
            }

            public Companion() {
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$a */
        public static final class C37167a {

            /* renamed from: b */
            public static final int f93182b = 0;
            @C12579k

            /* renamed from: a */
            public final C11289a<C11079d2> f93183a;

            public C37167a(@C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(aVar, "onButtonClicked");
                this.f93183a = aVar;
            }

            @C12579k
            /* renamed from: a */
            public final C11289a<C11079d2> mo113090a() {
                return this.f93183a;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$b */
        public static final class C37168b {

            /* renamed from: f */
            public static final int f93184f = 0;

            /* renamed from: a */
            public final int f93185a;

            /* renamed from: b */
            public final int f93186b;

            /* renamed from: c */
            public final int f93187c;
            @C12579k

            /* renamed from: d */
            public final Availability f93188d;
            @C12579k

            /* renamed from: e */
            public final C37130b f93189e;

            public C37168b(@C0324b1 int i, @C0375v int i2, int i3, @C12579k Availability availability, @C12579k C37130b bVar) {
                Intrinsics.checkNotNullParameter(availability, C28534f.f69157h0);
                Intrinsics.checkNotNullParameter(bVar, "detailsText");
                this.f93185a = i;
                this.f93186b = i2;
                this.f93187c = i3;
                this.f93188d = availability;
                this.f93189e = bVar;
            }

            /* renamed from: g */
            public static /* synthetic */ C37168b m152546g(C37168b bVar, int i, int i2, int i3, Availability availability, C37130b bVar2, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = bVar.f93185a;
                }
                if ((i4 & 2) != 0) {
                    i2 = bVar.f93186b;
                }
                int i5 = i2;
                if ((i4 & 4) != 0) {
                    i3 = bVar.f93187c;
                }
                int i6 = i3;
                if ((i4 & 8) != 0) {
                    availability = bVar.f93188d;
                }
                Availability availability2 = availability;
                if ((i4 & 16) != 0) {
                    bVar2 = bVar.f93189e;
                }
                return bVar.mo113097f(i, i5, i6, availability2, bVar2);
            }

            /* renamed from: a */
            public final int mo113091a() {
                return this.f93185a;
            }

            /* renamed from: b */
            public final int mo113092b() {
                return this.f93186b;
            }

            /* renamed from: c */
            public final int mo113093c() {
                return this.f93187c;
            }

            @C12579k
            /* renamed from: d */
            public final Availability mo113094d() {
                return this.f93188d;
            }

            @C12579k
            /* renamed from: e */
            public final C37130b mo113095e() {
                return this.f93189e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37168b)) {
                    return false;
                }
                C37168b bVar = (C37168b) obj;
                return this.f93185a == bVar.f93185a && this.f93186b == bVar.f93186b && this.f93187c == bVar.f93187c && this.f93188d == bVar.f93188d && Intrinsics.areEqual((Object) this.f93189e, (Object) bVar.f93189e);
            }

            @C12579k
            /* renamed from: f */
            public final C37168b mo113097f(@C0324b1 int i, @C0375v int i2, int i3, @C12579k Availability availability, @C12579k C37130b bVar) {
                Intrinsics.checkNotNullParameter(availability, C28534f.f69157h0);
                Intrinsics.checkNotNullParameter(bVar, "detailsText");
                return new C37168b(i, i2, i3, availability, bVar);
            }

            @C12579k
            /* renamed from: h */
            public final Availability mo113098h() {
                return this.f93188d;
            }

            public int hashCode() {
                return (((((((Integer.hashCode(this.f93185a) * 31) + Integer.hashCode(this.f93186b)) * 31) + Integer.hashCode(this.f93187c)) * 31) + this.f93188d.hashCode()) * 31) + this.f93189e.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final C37130b mo113100i() {
                return this.f93189e;
            }

            /* renamed from: j */
            public final int mo113101j() {
                return this.f93186b;
            }

            /* renamed from: k */
            public final int mo113102k() {
                return this.f93187c;
            }

            /* renamed from: l */
            public final int mo113103l() {
                return this.f93185a;
            }

            @C12579k
            public String toString() {
                int i = this.f93185a;
                int i2 = this.f93186b;
                int i3 = this.f93187c;
                Availability availability = this.f93188d;
                C37130b bVar = this.f93189e;
                return "Data(title=" + i + ", icon=" + i2 + ", subTitle=" + i3 + ", availability=" + availability + ", detailsText=" + bVar + ")";
            }
        }

        public UiModel(@C12579k C37168b bVar, @C12579k C37167a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "data");
            Intrinsics.checkNotNullParameter(aVar, "actions");
            this.f93173a = bVar;
            this.f93174b = aVar;
        }

        /* renamed from: d */
        public static /* synthetic */ UiModel m152534d(UiModel uiModel, C37168b bVar, C37167a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = uiModel.f93173a;
            }
            if ((i & 2) != 0) {
                aVar = uiModel.f93174b;
            }
            return uiModel.mo113081c(bVar, aVar);
        }

        @C12579k
        /* renamed from: a */
        public final C37168b mo113079a() {
            return this.f93173a;
        }

        @C12579k
        /* renamed from: b */
        public final C37167a mo113080b() {
            return this.f93174b;
        }

        @C12579k
        /* renamed from: c */
        public final UiModel mo113081c(@C12579k C37168b bVar, @C12579k C37167a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "data");
            Intrinsics.checkNotNullParameter(aVar, "actions");
            return new UiModel(bVar, aVar);
        }

        @C12579k
        /* renamed from: e */
        public final C37167a mo113082e() {
            return this.f93174b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiModel)) {
                return false;
            }
            UiModel uiModel = (UiModel) obj;
            return Intrinsics.areEqual((Object) this.f93173a, (Object) uiModel.f93173a) && Intrinsics.areEqual((Object) this.f93174b, (Object) uiModel.f93174b);
        }

        @C12579k
        /* renamed from: f */
        public final C37168b mo113084f() {
            return this.f93173a;
        }

        public int hashCode() {
            return (this.f93173a.hashCode() * 31) + this.f93174b.hashCode();
        }

        @C12579k
        public String toString() {
            C37168b bVar = this.f93173a;
            C37167a aVar = this.f93174b;
            return "UiModel(data=" + bVar + ", actions=" + aVar + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$a */
    public /* synthetic */ class C37169a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$Availability[] r0 = com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent.UiModel.Availability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$Availability r1 = com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent.UiModel.Availability.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent$UiModel$Availability r1 = com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent.UiModel.Availability.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent.C37169a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceInfoComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: w */
    public static final void m152532w(UiModel uiModel, View view) {
        Intrinsics.checkNotNullParameter(uiModel, "$model");
        uiModel.mo113082e().mo113090a().invoke();
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93169a.getDebouncerState();
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93169a.setDebouncerState(aVar);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93169a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93169a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* renamed from: v */
    public final void mo113078v(@C12579k UiModel uiModel) {
        Intrinsics.checkNotNullParameter(uiModel, C40045d.f102104u);
        this.f93170b.f92823g.setText(uiModel.mo113084f().mo113103l());
        this.f93170b.f92822f.setText(uiModel.mo113084f().mo113102k());
        TextView textView = this.f93170b.f92819c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.detailsText");
        C37116g.m152168f(textView, uiModel.mo113084f().mo113100i());
        MaterialButton materialButton = this.f93170b.f92818b;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.button");
        setLoadingDebouncedClickListener(materialButton, new C37251j1(uiModel));
        this.f93170b.f92820d.setImageResource(uiModel.mo113084f().mo113101j());
        int i = C37169a.$EnumSwitchMapping$0[uiModel.mo113084f().mo113098h().ordinal()];
        if (i == 1) {
            this.f93170b.f92821e.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary_alternative));
            this.f93170b.f92821e.setText(getContext().getString(C36896b.C36912p.service_info_available));
            this.f93170b.f92818b.setEnabled(true);
        } else if (i == 2) {
            this.f93170b.f92821e.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_orange));
            this.f93170b.f92821e.setText(getContext().getString(C36896b.C36912p.service_info_unavailable));
            this.f93170b.f92818b.setEnabled(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceInfoComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceInfoComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceInfoComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93169a = new C37145l();
        setBackgroundResource(C36896b.C36904h.background_round_white_m);
        C37078t0 b = C37078t0.m152064b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93170b = b;
    }
}
