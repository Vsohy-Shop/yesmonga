package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.C20157j;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListButton;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListLoader;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37377b;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.b */
public final class C37353b implements C37377b.C37379b {

    /* renamed from: e */
    public static final int f93878e = 8;
    @C12580l

    /* renamed from: a */
    public final C37390r f93879a;
    @C12580l

    /* renamed from: b */
    public RecyclerView.Adapter<?> f93880b;

    /* renamed from: c */
    public final int f93881c;

    /* renamed from: d */
    public final int f93882d;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.b$a */
    public static final class C37354a {
        @C12579k

        /* renamed from: a */
        public static final C37354a f93883a = new C37354a();

        /* renamed from: b */
        public static final int f93884b = 0;

        /* renamed from: a */
        public final int mo113921a(@C12579k StandardPickerComponent.C37292a aVar) {
            Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
            return C11342l0.m43547d(StandardPickerComponent.C37292a.class).hashCode();
        }

        /* renamed from: b */
        public final int mo113922b(@C12579k ProductCardSComponent.C37338a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "uiModel");
            return C11342l0.m43547d(ProductCardSComponent.C37338a.class).hashCode();
        }

        /* renamed from: c */
        public final int mo113923c(@C12579k ProductCardXsComponent.C37345a aVar) {
            Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
            return C11342l0.m43547d(ProductCardXsComponent.C37345a.class).hashCode();
        }

        /* renamed from: d */
        public final int mo113924d(@C12579k ProductCardListButton.C37366a aVar) {
            Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
            return C11342l0.m43547d(ProductCardListButton.C37366a.class).hashCode();
        }

        /* renamed from: e */
        public final int mo113925e(@C12579k ProductCardListLoader.C37367a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "uiModel");
            return C11342l0.m43547d(ProductCardListLoader.C37367a.class).hashCode();
        }

        /* renamed from: f */
        public final int mo113926f(@C12579k ProductCardListTitle.C37368a aVar) {
            Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
            return C11342l0.m43547d(ProductCardListTitle.C37368a.class).hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.b$b */
    public static final class C37355b extends C20157j.C20163f<C37369a> {

        /* renamed from: a */
        public final /* synthetic */ C37353b f93885a;

        public C37355b(C37353b bVar) {
            this.f93885a = bVar;
        }

        /* renamed from: d */
        public boolean mo60477a(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            C20157j.C20163f<C37369a> d;
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            if ((aVar instanceof ProductCardSComponent.C37338a) && (aVar2 instanceof ProductCardSComponent.C37338a)) {
                return ((ProductCardSComponent.C37338a) aVar).mo113694a((ProductCardSComponent.C37338a) aVar2);
            }
            if ((aVar instanceof ProductCardXsComponent.C37345a) && (aVar2 instanceof ProductCardXsComponent.C37345a)) {
                return ((ProductCardXsComponent.C37345a) aVar).mo113893a((ProductCardXsComponent.C37345a) aVar2);
            }
            if ((aVar instanceof ProductCardListTitle.C37368a) && (aVar2 instanceof ProductCardListTitle.C37368a)) {
                return Intrinsics.areEqual((Object) ((ProductCardListTitle.C37368a) aVar).mo113943a(), (Object) ((ProductCardListTitle.C37368a) aVar2).mo113943a());
            }
            if ((aVar instanceof ProductCardListButton.C37366a) && (aVar2 instanceof ProductCardListButton.C37366a)) {
                ProductCardListButton.C37366a aVar3 = (ProductCardListButton.C37366a) aVar;
                ProductCardListButton.C37366a aVar4 = (ProductCardListButton.C37366a) aVar2;
                if (!Intrinsics.areEqual((Object) aVar3.mo113939a(), (Object) aVar4.mo113939a()) || !Intrinsics.areEqual((Object) aVar3.mo113940b(), (Object) aVar4.mo113940b())) {
                    return false;
                }
                return true;
            } else if ((aVar instanceof StandardPickerComponent.C37292a) && (aVar2 instanceof StandardPickerComponent.C37292a)) {
                return Intrinsics.areEqual((Object) aVar, (Object) aVar2);
            } else {
                if ((aVar instanceof ProductCardListLoader.C37367a) && (aVar2 instanceof ProductCardListLoader.C37367a)) {
                    return true;
                }
                C37390r c = this.f93885a.f93879a;
                if (c == null || (d = c.mo67720d()) == null) {
                    return false;
                }
                return d.mo60477a(aVar, aVar2);
            }
        }

        /* renamed from: e */
        public boolean mo60478b(@C12579k C37369a aVar, @C12579k C37369a aVar2) {
            C20157j.C20163f<C37369a> d;
            Intrinsics.checkNotNullParameter(aVar, "oldItem");
            Intrinsics.checkNotNullParameter(aVar2, "newItem");
            boolean z = aVar instanceof ProductCardSComponent.C37338a;
            if (z && (aVar2 instanceof ProductCardSComponent.C37338a)) {
                return Intrinsics.areEqual((Object) ((ProductCardSComponent.C37338a) aVar).mo113697d(), (Object) ((ProductCardSComponent.C37338a) aVar2).mo113697d());
            }
            boolean z2 = aVar instanceof ProductCardXsComponent.C37345a;
            if (z2 && (aVar2 instanceof ProductCardSComponent.C37338a)) {
                return Intrinsics.areEqual((Object) ((ProductCardXsComponent.C37345a) aVar).mo113894b(), (Object) ((ProductCardSComponent.C37338a) aVar2).mo113697d());
            }
            if (z && (aVar2 instanceof ProductCardXsComponent.C37345a)) {
                return Intrinsics.areEqual((Object) ((ProductCardSComponent.C37338a) aVar).mo113697d(), (Object) ((ProductCardXsComponent.C37345a) aVar2).mo113894b());
            }
            if (z2 && (aVar2 instanceof ProductCardXsComponent.C37345a)) {
                return Intrinsics.areEqual((Object) ((ProductCardXsComponent.C37345a) aVar).mo113894b(), (Object) ((ProductCardXsComponent.C37345a) aVar2).mo113894b());
            }
            if ((aVar instanceof ProductCardListTitle.C37368a) && (aVar2 instanceof ProductCardListTitle.C37368a)) {
                return Intrinsics.areEqual((Object) ((ProductCardListTitle.C37368a) aVar).mo113943a(), (Object) ((ProductCardListTitle.C37368a) aVar2).mo113943a());
            }
            if ((aVar instanceof ProductCardListButton.C37366a) && (aVar2 instanceof ProductCardListButton.C37366a)) {
                ProductCardListButton.C37366a aVar3 = (ProductCardListButton.C37366a) aVar;
                ProductCardListButton.C37366a aVar4 = (ProductCardListButton.C37366a) aVar2;
                if (!Intrinsics.areEqual((Object) aVar3.mo113939a(), (Object) aVar4.mo113939a()) || !Intrinsics.areEqual((Object) aVar3.mo113940b(), (Object) aVar4.mo113940b())) {
                    return false;
                }
                return true;
            } else if ((aVar instanceof StandardPickerComponent.C37292a) && (aVar2 instanceof StandardPickerComponent.C37292a)) {
                return Intrinsics.areEqual((Object) aVar, (Object) aVar2);
            } else {
                if ((aVar instanceof ProductCardListLoader.C37367a) && (aVar2 instanceof ProductCardListLoader.C37367a)) {
                    return true;
                }
                C37390r c = this.f93885a.f93879a;
                if (c == null || (d = c.mo67720d()) == null) {
                    return false;
                }
                return d.mo60478b(aVar, aVar2);
            }
        }
    }

    public C37353b(@C12579k Resources resources, @C12579k Resources.Theme theme, @C12580l C37390r rVar) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, C10108c.f27794S);
        this.f93879a = rVar;
        this.f93881c = resources.getDimensionPixelSize(C36896b.C36903g.ds_border_width_1);
        this.f93882d = resources.getColor(C36896b.C36902f.ds_grey_60, theme);
    }

    @C12579k
    /* renamed from: a */
    public C37375a mo113911a(int i) {
        return mo113918i(i);
    }

    @C12579k
    /* renamed from: b */
    public C37375a mo113912b(int i) {
        return mo113918i(i);
    }

    /* renamed from: d */
    public final void mo113913d(@C12579k C37369a aVar, @C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(e0Var, "viewHolder");
        View view = e0Var.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        if (aVar instanceof ProductCardXsComponent.C37345a) {
            ((ProductCardXsComponent) view).mo113892x((ProductCardXsComponent.C37345a) aVar);
        } else if (aVar instanceof ProductCardListTitle.C37368a) {
            ((ProductCardListTitle) view).mo113942a((ProductCardListTitle.C37368a) aVar);
        } else if (aVar instanceof ProductCardListButton.C37366a) {
            ((ProductCardListButton) view).mo113938b((ProductCardListButton.C37366a) aVar);
        } else if (aVar instanceof StandardPickerComponent.C37292a) {
            ((StandardPickerComponent) view).mo113592v((StandardPickerComponent.C37292a) aVar);
        } else if (aVar instanceof ProductCardSComponent.C37338a) {
            ((ProductCardSComponent) view).mo113691E((ProductCardSComponent.C37338a) aVar);
        } else if (!(aVar instanceof ProductCardListLoader.C37367a)) {
            C37390r rVar = this.f93879a;
            if (rVar == null || !rVar.mo67721e(aVar, e0Var, i)) {
                String p = C11342l0.m43547d(aVar.getClass()).mo22845p();
                throw new IllegalStateException("Unknown model type: " + p);
            }
        }
    }

    @C12580l
    /* renamed from: e */
    public final View mo113914e(int i, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (i == C11342l0.m43547d(ProductCardXsComponent.C37345a.class).hashCode()) {
            return new ProductCardXsComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (i == C11342l0.m43547d(ProductCardListTitle.C37368a.class).hashCode()) {
            return new ProductCardListTitle(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (i == C11342l0.m43547d(ProductCardListButton.C37366a.class).hashCode()) {
            return new ProductCardListButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (i == C11342l0.m43547d(StandardPickerComponent.C37292a.class).hashCode()) {
            return new StandardPickerComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (i == C11342l0.m43547d(ProductCardSComponent.C37338a.class).hashCode()) {
            return new ProductCardSComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (i == C11342l0.m43547d(ProductCardListLoader.C37367a.class).hashCode()) {
            return new ProductCardListLoader(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        return null;
    }

    @C12579k
    /* renamed from: f */
    public final RecyclerView.C20061e0 mo113915f(int i, @C12579k Context context) {
        RecyclerView.C20061e0 c;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37390r rVar = this.f93879a;
        if (rVar != null && (c = rVar.mo67719c(i, context)) != null) {
            return c;
        }
        throw new IllegalStateException("Unable to create a ViewHolder for type id: " + i);
    }

    @C12580l
    /* renamed from: g */
    public final RecyclerView.Adapter<?> mo113916g() {
        return this.f93880b;
    }

    @C12579k
    /* renamed from: h */
    public final C20157j.C20163f<C37369a> mo113917h() {
        return new C37355b(this);
    }

    @C12579k
    /* renamed from: i */
    public final C37375a mo113918i(int i) {
        C37375a a;
        RecyclerView.Adapter<?> adapter = this.f93880b;
        if (adapter != null) {
            int itemViewType = adapter.getItemViewType(i);
            if (itemViewType == C11342l0.m43547d(ProductCardXsComponent.C37345a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            if (itemViewType == C11342l0.m43547d(ProductCardListTitle.C37368a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            if (itemViewType == C11342l0.m43547d(ProductCardListButton.C37366a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(0).mo113956a();
            }
            if (itemViewType == C11342l0.m43547d(StandardPickerComponent.C37292a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            if (itemViewType == C11342l0.m43547d(ProductCardSComponent.C37338a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            if (itemViewType == C11342l0.m43547d(ProductCardListLoader.C37367a.class).hashCode()) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            if (itemViewType == 0) {
                return new C37375a.C37376a().mo113959d(this.f93881c).mo113957b(this.f93882d).mo113956a();
            }
            C37390r rVar = this.f93879a;
            if (rVar != null && (a = rVar.mo67717a(itemViewType)) != null) {
                return a;
            }
            throw new IllegalStateException("Uknown view type: " + itemViewType);
        }
        throw new IllegalStateException("Adapter must be set to ViewBinder before use");
    }

    /* renamed from: j */
    public final int mo113919j(@C12579k C37369a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        if (aVar instanceof ProductCardXsComponent.C37345a) {
            return 1;
        }
        if (!(aVar instanceof ProductCardListTitle.C37368a) && !(aVar instanceof ProductCardListButton.C37366a)) {
            if (aVar instanceof StandardPickerComponent.C37292a) {
                return 1;
            }
            if (!(aVar instanceof ProductCardSComponent.C37338a) && !(aVar instanceof ProductCardListLoader.C37367a)) {
                C37390r rVar = this.f93879a;
                if (rVar != null) {
                    i = rVar.mo67718b(aVar);
                } else {
                    i = -2;
                }
                if (i >= 0) {
                    return i;
                }
                String p = C11342l0.m43547d(aVar.getClass()).mo22845p();
                throw new IllegalStateException("Unknown model type: " + p);
            }
        }
        return 2;
    }

    /* renamed from: k */
    public final void mo113920k(@C12580l RecyclerView.Adapter<?> adapter) {
        this.f93880b = adapter;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37353b(Resources resources, Resources.Theme theme, C37390r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, theme, (i & 4) != 0 ? null : rVar);
    }
}
