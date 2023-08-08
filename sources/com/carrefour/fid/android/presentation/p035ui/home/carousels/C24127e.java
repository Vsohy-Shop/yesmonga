package com.carrefour.fid.android.presentation.p035ui.home.carousels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import com.carrefour.fid.android.databinding.C36854v5;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter.C24121b;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.type.LinkType;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/home/carousels/e;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lkotlin/d2;", "onDestroyView", "view", "onViewCreated", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$InternalLinkModel;", "internalLinkType", "M0", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$ExternalLinkModel;", "externalLinkType", "N0", "Lcom/carrefour/fid/android/databinding/v5;", "f", "Lcom/carrefour/fid/android/databinding/v5;", "_binding", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "J0", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "O0", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;)V", "homeAnalyticsViewModel", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomeCmsSlideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCmsSlideFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/carousels/HomeCmsSlideFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.e */
public final class C24127e extends C24125c {
    @C12579k

    /* renamed from: v */
    public static final C24128a f60360v = new C24128a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f60361w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f60362x = "HomeCmsFragment";
    @C12580l

    /* renamed from: f */
    public C36854v5 f60363f;
    @Inject

    /* renamed from: g */
    public HomeAnalyticsViewModel f60364g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.e$a */
    public static final class C24128a {
        public /* synthetic */ C24128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C24127e m106256b(C24128a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo70510a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24127e mo70510a(@C12580l Bundle bundle) {
            C24127e eVar = new C24127e();
            eVar.setArguments(bundle);
            return eVar;
        }

        public C24128a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: K0 */
    public static final C24127e m106250K0(@C12580l Bundle bundle) {
        return f60360v.mo70510a(bundle);
    }

    /* renamed from: L0 */
    public static final void m106251L0(SlideFooterCellModel slideFooterCellModel, C24127e eVar, View view) {
        LinkModel linkModel;
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        if (slideFooterCellModel != null && (linkModel = slideFooterCellModel.getLinkModel()) != null) {
            if (linkModel instanceof LinkModel.ExternalLinkModel) {
                eVar.mo70508N0((LinkModel.ExternalLinkModel) linkModel);
            } else if (linkModel instanceof LinkModel.InternalLinkModel) {
                eVar.mo70507M0((LinkModel.InternalLinkModel) linkModel);
            }
        }
    }

    @C12579k
    /* renamed from: J0 */
    public final HomeAnalyticsViewModel mo70506J0() {
        HomeAnalyticsViewModel homeAnalyticsViewModel = this.f60364g;
        if (homeAnalyticsViewModel != null) {
            return homeAnalyticsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeAnalyticsViewModel");
        return null;
    }

    /* renamed from: M0 */
    public final void mo70507M0(LinkModel.InternalLinkModel internalLinkModel) {
        String g;
        if (internalLinkModel != null && (g = internalLinkModel.mo132474g()) != null) {
            mo70506J0().mo76683D(LinkType.INTERNAL.mo84050q(), internalLinkModel.mo132475h());
            FragmentExtensionKt.m58767r(this, g);
        }
    }

    /* renamed from: N0 */
    public final void mo70508N0(LinkModel.ExternalLinkModel externalLinkModel) {
        String h;
        if (externalLinkModel != null && (h = externalLinkModel.mo132459h()) != null) {
            mo70506J0().mo76683D(LinkType.EXTERNAL.mo84050q(), externalLinkModel.mo132458g());
            FragmentKt.m118812C(this, h);
        }
    }

    /* renamed from: O0 */
    public final void mo70509O0(@C12579k HomeAnalyticsViewModel homeAnalyticsViewModel) {
        Intrinsics.checkNotNullParameter(homeAnalyticsViewModel, "<set-?>");
        this.f60364g = homeAnalyticsViewModel;
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        C36854v5 d = C36854v5.m151135d(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(inflater, container, false)");
        this.f60363f = d;
        return d.getRoot();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60363f = null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        SlideFooterCellModel slideFooterCellModel;
        String alt;
        String urlImage;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            slideFooterCellModel = (SlideFooterCellModel) arguments.getParcelable(C24121b.f60344E0);
        } else {
            slideFooterCellModel = null;
        }
        C36854v5 v5Var = this.f60363f;
        if (v5Var != null) {
            if (!(slideFooterCellModel == null || (urlImage = slideFooterCellModel.getUrlImage()) == null)) {
                ImageUtils imageUtils = ImageUtils.f70796a;
                AppCompatImageView appCompatImageView = v5Var.f91809b;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.slideFooterImage");
                imageUtils.mo84106j(urlImage, appCompatImageView, R.drawable.ic_erreur_reseau);
            }
            v5Var.f91809b.setOnClickListener(new C24126d(slideFooterCellModel, this));
            if (slideFooterCellModel != null && (alt = slideFooterCellModel.getAlt()) != null) {
                v5Var.f91809b.setContentDescription(alt);
            }
        }
    }
}
