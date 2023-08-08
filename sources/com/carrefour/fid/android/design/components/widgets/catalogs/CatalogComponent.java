package com.carrefour.fid.android.design.components.widgets.catalogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37037d;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/catalogs/CatalogComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/catalogs/CatalogComponent$a;", "catalogUIViewModel", "Lkotlin/d2;", "v", "w", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "getOnCatalogDetailClickListener", "()Lkotlin/jvm/functions/a;", "setOnCatalogDetailClickListener", "(Lkotlin/jvm/functions/a;)V", "onCatalogDetailClickListener", "Lcom/carrefour/fid/android/design/components/databinding/d;", "b", "Lcom/carrefour/fid/android/design/components/databinding/d;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CatalogComponent extends ConstraintLayout {

    /* renamed from: c */
    public static final int f93317c = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f93318a;
    @C12579k

    /* renamed from: b */
    public final C37037d f93319b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.catalogs.CatalogComponent$a */
    public static final class C37205a {

        /* renamed from: e */
        public static final int f93320e = 0;
        @C12580l

        /* renamed from: a */
        public final String f93321a;
        @C12579k

        /* renamed from: b */
        public final ImageComponent.C37313a f93322b;
        @C12580l

        /* renamed from: c */
        public final String f93323c;
        @C12580l

        /* renamed from: d */
        public final String f93324d;

        public C37205a(@C12580l String str, @C12579k ImageComponent.C37313a aVar, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(aVar, "catalogImage");
            this.f93321a = str;
            this.f93322b = aVar;
            this.f93323c = str2;
            this.f93324d = str3;
        }

        /* renamed from: f */
        public static /* synthetic */ C37205a m152765f(C37205a aVar, String str, ImageComponent.C37313a aVar2, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f93321a;
            }
            if ((i & 2) != 0) {
                aVar2 = aVar.f93322b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f93323c;
            }
            if ((i & 8) != 0) {
                str3 = aVar.f93324d;
            }
            return aVar.mo113305e(str, aVar2, str2, str3);
        }

        @C12580l
        /* renamed from: a */
        public final String mo113301a() {
            return this.f93321a;
        }

        @C12579k
        /* renamed from: b */
        public final ImageComponent.C37313a mo113302b() {
            return this.f93322b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo113303c() {
            return this.f93323c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo113304d() {
            return this.f93324d;
        }

        @C12579k
        /* renamed from: e */
        public final C37205a mo113305e(@C12580l String str, @C12579k ImageComponent.C37313a aVar, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(aVar, "catalogImage");
            return new C37205a(str, aVar, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37205a)) {
                return false;
            }
            C37205a aVar = (C37205a) obj;
            return Intrinsics.areEqual((Object) this.f93321a, (Object) aVar.f93321a) && Intrinsics.areEqual((Object) this.f93322b, (Object) aVar.f93322b) && Intrinsics.areEqual((Object) this.f93323c, (Object) aVar.f93323c) && Intrinsics.areEqual((Object) this.f93324d, (Object) aVar.f93324d);
        }

        @C12579k
        /* renamed from: g */
        public final ImageComponent.C37313a mo113307g() {
            return this.f93322b;
        }

        @C12580l
        /* renamed from: h */
        public final String mo113308h() {
            return this.f93323c;
        }

        public int hashCode() {
            String str = this.f93321a;
            int i = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f93322b.hashCode()) * 31;
            String str2 = this.f93323c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93324d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo113310i() {
            return this.f93324d;
        }

        @C12580l
        /* renamed from: j */
        public final String mo113311j() {
            return this.f93321a;
        }

        @C12579k
        public String toString() {
            String str = this.f93321a;
            ImageComponent.C37313a aVar = this.f93322b;
            String str2 = this.f93323c;
            String str3 = this.f93324d;
            return "CatalogUIViewModel(id=" + str + ", catalogImage=" + aVar + ", catalogName=" + str2 + ", catalogValidityDate=" + str3 + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CatalogComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m152762x(CatalogComponent catalogComponent, View view) {
        Intrinsics.checkNotNullParameter(catalogComponent, "this$0");
        C11289a<C11079d2> aVar = catalogComponent.f93318a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @C12580l
    public final C11289a<C11079d2> getOnCatalogDetailClickListener() {
        return this.f93318a;
    }

    public final void setOnCatalogDetailClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93318a = aVar;
    }

    /* renamed from: v */
    public final void mo113299v(@C12579k C37205a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "catalogUIViewModel");
        this.f93319b.f92598e.setText(aVar.mo113308h());
        this.f93319b.f92595b.setText(aVar.mo113310i());
        this.f93319b.f92596c.mo113651n(aVar.mo113307g());
    }

    /* renamed from: w */
    public final void mo113300w() {
        this.f93319b.f92596c.setOnClickListener(new C37208a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CatalogComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CatalogComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37037d b = C37037d.m151952b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93319b = b;
        mo113300w();
        setBackgroundResource(C36896b.C36904h.background_round_white);
    }
}
