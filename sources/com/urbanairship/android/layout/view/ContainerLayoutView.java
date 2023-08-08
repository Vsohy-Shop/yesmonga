package com.urbanairship.android.layout.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.info.C35667k;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35795c;
import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.util.C35908c;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.widget.ClippableConstraintLayout;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/ContainerLayoutView;", "Lcom/urbanairship/android/layout/widget/ClippableConstraintLayout;", "Lcom/urbanairship/android/layout/view/a;", "", "Lcom/urbanairship/android/layout/model/c$a;", "items", "Lcom/urbanairship/android/layout/util/c;", "constraintBuilder", "Lkotlin/d2;", "x", "item", "w", "Lcom/urbanairship/android/layout/environment/p;", "b", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "Landroid/util/SparseBooleanArray;", "c", "Landroid/util/SparseBooleanArray;", "frameShouldIgnoreSafeArea", "Landroid/util/SparseArray;", "Lcom/urbanairship/android/layout/property/k;", "d", "Landroid/util/SparseArray;", "frameMargins", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/c;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/c;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ContainerLayoutView extends ClippableConstraintLayout implements C35977a {
    @C12579k

    /* renamed from: b */
    public final C35614p f88838b;
    @C12579k

    /* renamed from: c */
    public final SparseBooleanArray f88839c = new SparseBooleanArray();
    @C12579k

    /* renamed from: d */
    public final SparseArray<C35840k> f88840d = new SparseArray<>();

    /* renamed from: com.urbanairship.android.layout.view.ContainerLayoutView$a */
    public static final class C35930a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ ContainerLayoutView f88841a;

        public C35930a(ContainerLayoutView containerLayoutView) {
            this.f88841a = containerLayoutView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            ContainerLayoutView containerLayoutView = this.f88841a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            containerLayoutView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88841a.setEnabled(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.ContainerLayoutView$b */
    public final class C35931b implements C18414x1 {
        @C12579k

        /* renamed from: a */
        public final C35908c f88842a;

        /* renamed from: b */
        public final /* synthetic */ ContainerLayoutView f88843b;

        public C35931b(@C12579k ContainerLayoutView containerLayoutView, C35908c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "constraintBuilder");
            this.f88843b = containerLayoutView;
            this.f88842a = cVar;
        }

        @C12579k
        /* renamed from: a */
        public C18436z4 mo1193a(@C12579k View view, @C12579k C18436z4 z4Var) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            Intrinsics.checkNotNullParameter(z4Var, "windowInsets");
            C18436z4 g1 = C18196h2.m82582g1(view, z4Var);
            Intrinsics.checkNotNullExpressionValue(g1, "onApplyWindowInsets(v, windowInsets)");
            C17616m0 f = g1.mo53136f(C18436z4.C18449m.m83510i());
            Intrinsics.checkNotNullExpressionValue(f, "applied.getInsets(Window…Compat.Type.systemBars())");
            if (g1.mo53120A() || Intrinsics.areEqual((Object) f, (Object) C17616m0.f45994e)) {
                C18436z4 z4Var2 = C18436z4.f47103c;
                Intrinsics.checkNotNullExpressionValue(z4Var2, "CONSUMED");
                return z4Var2;
            }
            int childCount = this.f88843b.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f88843b.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (this.f88843b.f88839c.get(viewGroup.getId(), false)) {
                    C18196h2.m82616p(viewGroup, g1);
                } else {
                    C18196h2.m82616p(viewGroup, g1.mo53156y(f));
                    this.f88842a.mo107560h((C35840k) this.f88843b.f88840d.get(viewGroup.getId()), f, viewGroup.getId());
                    z = true;
                }
            }
            if (z) {
                this.f88842a.mo107555c().mo50900r(this.f88843b);
            }
            C18436z4 y = g1.mo53156y(f);
            Intrinsics.checkNotNullExpressionValue(y, "applied.inset(insets)");
            return y;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContainerLayoutView(@C12579k Context context, @C12579k C35795c cVar, @C12579k C35614p pVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        this.f88838b = pVar;
        setClipChildren(true);
        C35908c j = C35908c.m148057j(context);
        Intrinsics.checkNotNullExpressionValue(j, "newBuilder(context)");
        mo107594x(cVar.mo107198K(), j);
        C35916j.m148085c(this, cVar);
        j.mo107555c().mo50900r(this);
        C18196h2.m82559a2(this, new C35931b(this, j));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        setLayoutTransition(layoutTransition);
        cVar.mo106988H(new C35930a(this));
    }

    /* renamed from: w */
    public final void mo107593w(C35908c cVar, C35795c.C35796a aVar) {
        BaseModel f = aVar.mo107205f();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        View h = f.mo106993h(context, this.f88838b);
        int generateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(generateViewId);
        frameLayout.addView(h, -1, -1);
        addView(frameLayout);
        C35667k e = aVar.mo107203e();
        cVar.mo107562k(e.mo106814j(), generateViewId).mo107564m(e.mo106815k(), generateViewId).mo107559g(e.mo106813i(), generateViewId);
        this.f88839c.put(generateViewId, e.mo106811c());
        SparseArray<C35840k> sparseArray = this.f88840d;
        C35840k i = e.mo106813i();
        if (i == null) {
            i = C35840k.f88597e;
        }
        sparseArray.put(generateViewId, i);
    }

    /* renamed from: x */
    public final void mo107594x(List<C35795c.C35796a> list, C35908c cVar) {
        for (C35795c.C35796a w : list) {
            mo107593w(cVar, w);
        }
    }
}
