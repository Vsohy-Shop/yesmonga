package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19851x0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.skydoves.landscapist.glide.LocalGlideProviderKt;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment$onCreateView$1$1 */
public final class NonFoodCheckoutStep1Fragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ NonFoodCheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1Fragment$onCreateView$1$1(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment, ComposeView composeView) {
        super(2);
        this.this$0 = nonFoodCheckoutStep1Fragment;
        this.$this_apply = composeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1461070002, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.onCreateView.<anonymous>.<anonymous> (NonFoodCheckoutStep1Fragment.kt:41)");
            }
            C8550i1<NonFoodValidationErrorDialogFormatter> b = NonFoodValidationErrorDialogFormatterKt.m104697b();
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            C8572j1[] j1VarArr = {b.mo16141f(new NonFoodValidationErrorDialogFormatter(requireContext)), LocalGlideProviderKt.m145632c().mo16141f(ImageUtils.f70796a.mo84107l(256))};
            final NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment = this.this$0;
            final ComposeView composeView = this.$this_apply;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, -2088539122, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-2088539122, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (NonFoodCheckoutStep1Fragment.kt:47)");
                        }
                        final NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment = nonFoodCheckoutStep1Fragment;
                        final ComposeView composeView = composeView;
                        ThemeKt.m153788a(C8553b.m31048b(oVar, 225356433, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(225356433, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NonFoodCheckoutStep1Fragment.kt:48)");
                                    }
                                    C23516a I0 = nonFoodCheckoutStep1Fragment.mo68851I0();
                                    C38326b J0 = nonFoodCheckoutStep1Fragment.mo68852J0();
                                    final ComposeView composeView = composeView;
                                    C234961 r3 = new C11289a<C11079d2>() {
                                        public final void invoke() {
                                            C19851x0.m92222a(composeView).mo58156s0();
                                        }
                                    };
                                    final NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment = nonFoodCheckoutStep1Fragment;
                                    C234972 r4 = new C11300l<String, C11079d2>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return C11079d2.f28267a;
                                        }

                                        public final void invoke(@C12579k String str) {
                                            String str2 = str;
                                            Intrinsics.checkNotNullParameter(str2, "error");
                                            FragmentKt.m118811B(nonFoodCheckoutStep1Fragment, NotificationComponent.Variant.ERROR, str2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                                        }
                                    };
                                    final ComposeView composeView2 = composeView;
                                    NonFoodCheckoutStep1StatefulKt.m104667c((NonFoodCheckout1ViewModel) null, I0, J0, r3, r4, new C11304p<String, HashMap<String, CategoryModel>, C11079d2>() {
                                        /* renamed from: a */
                                        public final void mo68861a(@C12579k String str, @C12579k HashMap<String, CategoryModel> hashMap) {
                                            Intrinsics.checkNotNullParameter(str, "basketReferenceId");
                                            Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
                                            Bundle bundle = new Bundle();
                                            bundle.putSerializable(C38212b.f96795c, hashMap);
                                            C19851x0.m92222a(composeView2).mo58142g0(C23551e.f59510a.mo69028a(str, true, bundle));
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            mo68861a((String) obj, (HashMap) obj2);
                                            return C11079d2.f28267a;
                                        }
                                    }, oVar, 512, 1);
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 6);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
