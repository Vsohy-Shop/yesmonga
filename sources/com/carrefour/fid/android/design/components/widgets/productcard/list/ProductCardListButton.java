package com.carrefour.fid.android.design.components.widgets.productcard.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.res.C17465i;
import com.carrefour.fid.android.design.components.databinding.C37053i0;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/list/ProductCardListButton;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/ProductCardListButton$a;", "model", "Lkotlin/d2;", "b", "Lcom/carrefour/fid/android/design/components/databinding/i0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/i0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductCardListButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCardListButton.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/list/ProductCardListButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class ProductCardListButton extends FrameLayout {

    /* renamed from: b */
    public static final int f93904b = 8;
    @C12579k

    /* renamed from: a */
    public final C37053i0 f93905a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListButton(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: c */
    public static final void m153533c(C37366a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        aVar.mo113941c().invoke();
    }

    /* renamed from: b */
    public final void mo113938b(@C12579k C37366a aVar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        this.f93905a.f92687b.setOnClickListener(new C37374d(aVar));
        this.f93905a.f92687b.setText(aVar.mo113939a());
        MaterialButton materialButton = this.f93905a.f92687b;
        Integer b = aVar.mo113940b();
        if (b != null) {
            drawable = C17465i.m80175g(getResources(), b.intValue(), getContext().getTheme());
        } else {
            drawable = null;
        }
        materialButton.setIcon(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListButton(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductCardListButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListButton$a */
    public static final class C37366a implements C37369a {

        /* renamed from: d */
        public static final int f93906d = 0;
        @C12579k

        /* renamed from: a */
        public final String f93907a;
        @C12580l

        /* renamed from: b */
        public final Integer f93908b;
        @C12579k

        /* renamed from: c */
        public final C11289a<C11079d2> f93909c;

        public C37366a(@C12579k String str, @C0375v @C12580l Integer num, @C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(str, "buttonText");
            Intrinsics.checkNotNullParameter(aVar, "onPressed");
            this.f93907a = str;
            this.f93908b = num;
            this.f93909c = aVar;
        }

        @C12579k
        /* renamed from: a */
        public final String mo113939a() {
            return this.f93907a;
        }

        @C12580l
        /* renamed from: b */
        public final Integer mo113940b() {
            return this.f93908b;
        }

        @C12579k
        /* renamed from: c */
        public final C11289a<C11079d2> mo113941c() {
            return this.f93909c;
        }

        public int getType(@C12579k C37353b.C37354a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "typeFactory");
            return aVar.mo113924d(this);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37366a(String str, Integer num, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListButton(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37053i0 b = C37053i0.m151994b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93905a = b;
    }
}
