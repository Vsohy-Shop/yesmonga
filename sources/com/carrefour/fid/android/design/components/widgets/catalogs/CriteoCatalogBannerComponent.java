package com.carrefour.fid.android.design.components.widgets.catalogs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37052i;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/catalogs/CriteoCatalogBannerComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/catalogs/CriteoCatalogBannerComponent$a;", "model", "Lkotlin/d2;", "w", "Lcom/carrefour/fid/android/design/components/databinding/i;", "a", "Lcom/carrefour/fid/android/design/components/databinding/i;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CriteoCatalogBannerComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93325b = 8;
    @C12579k

    /* renamed from: a */
    public final C37052i f93326a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.catalogs.CriteoCatalogBannerComponent$a */
    public static final class C37206a {

        /* renamed from: c */
        public static final int f93327c = 0;
        @C12579k

        /* renamed from: a */
        public final String f93328a;
        @C12580l

        /* renamed from: b */
        public final C11289a<C11079d2> f93329b;

        public C37206a(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(str, "bannerUrl");
            this.f93328a = str;
            this.f93329b = aVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C37206a m152779d(C37206a aVar, String str, C11289a<C11079d2> aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f93328a;
            }
            if ((i & 2) != 0) {
                aVar2 = aVar.f93329b;
            }
            return aVar.mo113316c(str, aVar2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo113314a() {
            return this.f93328a;
        }

        @C12580l
        /* renamed from: b */
        public final C11289a<C11079d2> mo113315b() {
            return this.f93329b;
        }

        @C12579k
        /* renamed from: c */
        public final C37206a mo113316c(@C12579k String str, @C12580l C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(str, "bannerUrl");
            return new C37206a(str, aVar);
        }

        @C12579k
        /* renamed from: e */
        public final String mo113317e() {
            return this.f93328a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37206a)) {
                return false;
            }
            C37206a aVar = (C37206a) obj;
            return Intrinsics.areEqual((Object) this.f93328a, (Object) aVar.f93328a) && Intrinsics.areEqual((Object) this.f93329b, (Object) aVar.f93329b);
        }

        @C12580l
        /* renamed from: f */
        public final C11289a<C11079d2> mo113319f() {
            return this.f93329b;
        }

        public int hashCode() {
            int hashCode = this.f93328a.hashCode() * 31;
            C11289a<C11079d2> aVar = this.f93329b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f93328a;
            C11289a<C11079d2> aVar = this.f93329b;
            return "UiModel(bannerUrl=" + str + ", onClick=" + aVar + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.catalogs.CriteoCatalogBannerComponent$b */
    public static final class C37207b extends C22568e<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ CriteoCatalogBannerComponent f93330d;

        public C37207b(CriteoCatalogBannerComponent criteoCatalogBannerComponent) {
            this.f93330d = criteoCatalogBannerComponent;
        }

        /* renamed from: e */
        public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
            Intrinsics.checkNotNullParameter(drawable, "resource");
            this.f93330d.f93326a.f92685b.setImageDrawable(drawable);
        }

        /* renamed from: k */
        public void mo65591k(@C12580l Drawable drawable) {
        }

        /* renamed from: o */
        public void mo65594o(@C12580l Drawable drawable) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CriteoCatalogBannerComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m152777x(C37206a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        C11289a<C11079d2> f = aVar.mo113319f();
        if (f != null) {
            f.invoke();
        }
    }

    /* renamed from: w */
    public final void mo113313w(@C12579k C37206a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        ((C22090i) ((C22090i) C22038b.m100350E(getContext()).mo65605u(aVar.mo113317e()).mo66763S0(C36896b.C36904h.background_round_gray)).mo66732A(C22234h.f57125c)).mo65672H1(new C37207b(this));
        setOnClickListener(new C37209b(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CriteoCatalogBannerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CriteoCatalogBannerComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CriteoCatalogBannerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37052i b = C37052i.m151992b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93326a = b;
    }
}
