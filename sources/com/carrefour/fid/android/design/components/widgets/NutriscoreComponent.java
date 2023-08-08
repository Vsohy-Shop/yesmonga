package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37041e0;
import com.carrefour.fid.android.design.components.utils.C37136c;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0005B)\b\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/NutriscoreComponent;", "Landroid/widget/LinearLayout;", "Lcom/carrefour/fid/android/design/components/widgets/NutriscoreComponent$a;", "nutriscoreUiModel", "Lkotlin/d2;", "a", "", "enabled", "setEnabled", "Lcom/carrefour/fid/android/design/components/databinding/e0;", "Lcom/carrefour/fid/android/design/components/databinding/e0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Size", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nNutriscoreComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NutriscoreComponent.kt\ncom/carrefour/fid/android/design/components/widgets/NutriscoreComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,57:1\n262#2,2:58\n*S KotlinDebug\n*F\n+ 1 NutriscoreComponent.kt\ncom/carrefour/fid/android/design/components/widgets/NutriscoreComponent\n*L\n41#1:58,2\n*E\n"})
public final class NutriscoreComponent extends LinearLayout {

    /* renamed from: b */
    public static final int f93101b = 8;
    @C12579k

    /* renamed from: a */
    public final C37041e0 f93102a;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/NutriscoreComponent$Size;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Size {
        LARGE,
        SMALL
    }

    @C11315i
    public NutriscoreComponent(@C12580l Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo112961a(@C12579k C37157a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "nutriscoreUiModel");
        TextView textView = this.f93102a.f92618c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.textHolderNutriscore");
        if (aVar.mo112972i()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        setVisibility(0);
        if (aVar.mo112973j() == Size.LARGE) {
            this.f93102a.f92617b.getLayoutParams().height = (int) getContext().getResources().getDimension(C36896b.C36903g.product_nutriscore_image_height_large);
        } else {
            this.f93102a.f92617b.setScaleType(ImageView.ScaleType.FIT_START);
        }
        this.f93102a.f92617b.setImageResource(aVar.mo112970h());
        setContentDescription(getContext().getString(C36896b.C36912p.nutriscore) + " " + aVar.mo112969g());
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.f93102a.f92617b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imageHolderNutriscore");
        C37136c.m152208a(imageView, z);
    }

    @C11315i
    public NutriscoreComponent(@C12580l Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NutriscoreComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @C11315i
    public NutriscoreComponent(@C12580l Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C37041e0 b = C37041e0.m151960b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93102a = b;
        setVisibility(8);
        setOrientation(1);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.NutriscoreComponent$a */
    public static final class C37157a {

        /* renamed from: e */
        public static final int f93106e = 0;
        @C12579k

        /* renamed from: a */
        public final String f93107a;

        /* renamed from: b */
        public final int f93108b;

        /* renamed from: c */
        public final boolean f93109c;
        @C12580l

        /* renamed from: d */
        public final Size f93110d;

        public C37157a(@C12579k String str, int i, boolean z, @C12580l Size size) {
            Intrinsics.checkNotNullParameter(str, "nutriscore");
            this.f93107a = str;
            this.f93108b = i;
            this.f93109c = z;
            this.f93110d = size;
        }

        /* renamed from: f */
        public static /* synthetic */ C37157a m152428f(C37157a aVar, String str, int i, boolean z, Size size, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f93107a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f93108b;
            }
            if ((i2 & 4) != 0) {
                z = aVar.f93109c;
            }
            if ((i2 & 8) != 0) {
                size = aVar.f93110d;
            }
            return aVar.mo112967e(str, i, z, size);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112963a() {
            return this.f93107a;
        }

        /* renamed from: b */
        public final int mo112964b() {
            return this.f93108b;
        }

        /* renamed from: c */
        public final boolean mo112965c() {
            return this.f93109c;
        }

        @C12580l
        /* renamed from: d */
        public final Size mo112966d() {
            return this.f93110d;
        }

        @C12579k
        /* renamed from: e */
        public final C37157a mo112967e(@C12579k String str, int i, boolean z, @C12580l Size size) {
            Intrinsics.checkNotNullParameter(str, "nutriscore");
            return new C37157a(str, i, z, size);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37157a)) {
                return false;
            }
            C37157a aVar = (C37157a) obj;
            return Intrinsics.areEqual((Object) this.f93107a, (Object) aVar.f93107a) && this.f93108b == aVar.f93108b && this.f93109c == aVar.f93109c && this.f93110d == aVar.f93110d;
        }

        @C12579k
        /* renamed from: g */
        public final String mo112969g() {
            return this.f93107a;
        }

        /* renamed from: h */
        public final int mo112970h() {
            return this.f93108b;
        }

        public int hashCode() {
            int hashCode = ((this.f93107a.hashCode() * 31) + Integer.hashCode(this.f93108b)) * 31;
            boolean z = this.f93109c;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            Size size = this.f93110d;
            return i + (size == null ? 0 : size.hashCode());
        }

        /* renamed from: i */
        public final boolean mo112972i() {
            return this.f93109c;
        }

        @C12580l
        /* renamed from: j */
        public final Size mo112973j() {
            return this.f93110d;
        }

        @C12579k
        public String toString() {
            String str = this.f93107a;
            int i = this.f93108b;
            boolean z = this.f93109c;
            Size size = this.f93110d;
            return "UiModel(nutriscore=" + str + ", nutriscoreDrawableId=" + i + ", showLabel=" + z + ", showSize=" + size + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37157a(String str, int i, boolean z, Size size, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, z, (i2 & 8) != 0 ? Size.SMALL : size);
        }
    }
}
