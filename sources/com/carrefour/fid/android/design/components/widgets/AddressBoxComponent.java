package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37031b;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/AddressBoxComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/AddressBoxComponent$a;", "model", "Lkotlin/d2;", "u", "Lcom/carrefour/fid/android/design/components/databinding/b;", "a", "Lcom/carrefour/fid/android/design/components/databinding/b;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AddressBoxComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f92986b = 8;
    @C12579k

    /* renamed from: a */
    public final C37031b f92987a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.AddressBoxComponent$a */
    public static final class C37147a {

        /* renamed from: c */
        public static final int f92988c = 0;
        @C12579k

        /* renamed from: a */
        public final String f92989a;

        /* renamed from: b */
        public final int f92990b;

        public C37147a(@C12579k String str, @C0375v int i) {
            Intrinsics.checkNotNullParameter(str, "addressText");
            this.f92989a = str;
            this.f92990b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C37147a m152225d(C37147a aVar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f92989a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f92990b;
            }
            return aVar.mo112764c(str, i);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112762a() {
            return this.f92989a;
        }

        /* renamed from: b */
        public final int mo112763b() {
            return this.f92990b;
        }

        @C12579k
        /* renamed from: c */
        public final C37147a mo112764c(@C12579k String str, @C0375v int i) {
            Intrinsics.checkNotNullParameter(str, "addressText");
            return new C37147a(str, i);
        }

        @C12579k
        /* renamed from: e */
        public final String mo112765e() {
            return this.f92989a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37147a)) {
                return false;
            }
            C37147a aVar = (C37147a) obj;
            return Intrinsics.areEqual((Object) this.f92989a, (Object) aVar.f92989a) && this.f92990b == aVar.f92990b;
        }

        /* renamed from: f */
        public final int mo112767f() {
            return this.f92990b;
        }

        public int hashCode() {
            return (this.f92989a.hashCode() * 31) + Integer.hashCode(this.f92990b);
        }

        @C12579k
        public String toString() {
            String str = this.f92989a;
            int i = this.f92990b;
            return "UiModel(addressText=" + str + ", pictoImage=" + i + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressBoxComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: u */
    public final void mo112761u(@C12579k C37147a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        this.f92987a.f92564b.setText(aVar.mo112765e());
        this.f92987a.f92565c.setImageDrawable(C17318d.m79726i(getContext(), aVar.mo112767f()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressBoxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressBoxComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public AddressBoxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37031b b = C37031b.m151936b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f92987a = b;
        setBackgroundResource(C36896b.C36904h.background_light_blue_rectangle);
    }
}
