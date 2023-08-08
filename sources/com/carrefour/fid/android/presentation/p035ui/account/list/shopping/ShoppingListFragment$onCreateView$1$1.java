package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.os.Bundle;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19851x0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment$onCreateView$1$1 */
public final class ShoppingListFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ ShoppingListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListFragment$onCreateView$1$1(ShoppingListFragment shoppingListFragment, ComposeView composeView) {
        super(2);
        this.this$0 = shoppingListFragment;
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
                ComposerKt.m29845w0(-1852315503, i, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment.onCreateView.<anonymous>.<anonymous> (ShoppingListFragment.kt:56)");
            }
            final ShoppingListFragment shoppingListFragment = this.this$0;
            final ComposeView composeView = this.$this_apply;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -1216082066, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1216082066, i2, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ShoppingListFragment.kt:57)");
                        }
                        C230381 r5 = new C11304p<OfferIdentifier, Boolean, C11079d2>(shoppingListFragment) {
                            /* renamed from: d */
                            public final void mo67689d(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                                Intrinsics.checkNotNullParameter(offerIdentifier, "p0");
                                ((ShoppingListFragment) this.receiver).mo67680O0(offerIdentifier, z);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                mo67689d((OfferIdentifier) obj, ((Boolean) obj2).booleanValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C230392 r11 = new C11300l<PlpOffer, C11079d2>(shoppingListFragment) {
                            /* renamed from: d */
                            public final void mo67690d(@C12579k PlpOffer plpOffer) {
                                Intrinsics.checkNotNullParameter(plpOffer, "p0");
                                ((ShoppingListFragment) this.receiver).mo67681P0(plpOffer);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo67690d((PlpOffer) obj);
                                return C11079d2.f28267a;
                            }
                        };
                        C230403 r12 = new C11289a<C11079d2>(shoppingListFragment) {
                            public final void invoke() {
                                FragmentExtensionKt.m58764o((Fragment) this.receiver);
                            }
                        };
                        C230414 r13 = new C11300l<Gtin, C11079d2>(shoppingListFragment) {
                            /* renamed from: d */
                            public final void mo67691d(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "p0");
                                ((ShoppingListFragment) this.receiver).mo67679N0(str);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo67691d(((Gtin) obj).mo118380i());
                                return C11079d2.f28267a;
                            }
                        };
                        C25882a M0 = shoppingListFragment.mo67678M0();
                        final ShoppingListFragment shoppingListFragment = shoppingListFragment;
                        C230425 r6 = new C11305q<Gtin, Integer, Integer, C11079d2>() {
                            /* renamed from: a */
                            public final void mo67692a(@C12579k String str, int i, int i2) {
                                Intrinsics.checkNotNullParameter(str, "gtin");
                                shoppingListFragment.mo67683S0(str, i, i2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                mo67692a(((Gtin) obj).mo118380i(), ((Number) obj2).intValue(), ((Number) obj3).intValue());
                                return C11079d2.f28267a;
                            }
                        };
                        final ShoppingListFragment shoppingListFragment2 = shoppingListFragment;
                        C230436 r7 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19232h requireActivity = shoppingListFragment2.requireActivity();
                                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                                C13825a.m58787p(requireActivity, false, 0, 0, 7, (Object) null);
                            }
                        };
                        final ShoppingListFragment shoppingListFragment3 = shoppingListFragment;
                        C230447 r8 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentExtensionKt.m58770u(shoppingListFragment3, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69227C, (Bundle) null, 16, (Object) null);
                            }
                        };
                        final ComposeView composeView = composeView;
                        C230458 r9 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                C19851x0.m92222a(composeView).mo58156s0();
                            }
                        };
                        final ShoppingListFragment shoppingListFragment4 = shoppingListFragment;
                        ShoppingListScreenStateFulKt.m103537c(r5, r6, r7, r8, r9, new C11304p<NotificationComponent.Variant, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo67693a(@C12579k NotificationComponent.Variant variant, @C12579k String str) {
                                NotificationComponent.Variant variant2 = variant;
                                Intrinsics.checkNotNullParameter(variant2, "variant");
                                String str2 = str;
                                Intrinsics.checkNotNullParameter(str2, "title");
                                FragmentKt.m118811B(shoppingListFragment4, variant2, str2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                mo67693a((NotificationComponent.Variant) obj, (String) obj2);
                                return C11079d2.f28267a;
                            }
                        }, r11, r12, r13, (ShoppingListViewModel) null, M0, shoppingListFragment, oVar, 0, 72, 512);
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
}
