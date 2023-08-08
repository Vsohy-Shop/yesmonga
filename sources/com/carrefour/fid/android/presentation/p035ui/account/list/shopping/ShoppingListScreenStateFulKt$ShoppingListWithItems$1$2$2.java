package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.res.Resources;
import android.os.Bundle;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23066f;
import com.carrefour.fid.android.product.presentation.mapper.C27642b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.shared.base.C28499q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListWithItems$1$2$2 */
public final class ShoppingListScreenStateFulKt$ShoppingListWithItems$1$2$2 extends Lambda implements C11300l<ProductCardSComponent, C11079d2> {
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ C28499q $fragment;
    final /* synthetic */ int $index;
    final /* synthetic */ C27670g $productFavorite;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListWithItems$1$2$2(C27670g gVar, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar, int i) {
        super(1);
        this.$productFavorite = gVar;
        this.$fragment = qVar;
        this.$actioner = lVar;
        this.$index = i;
    }

    /* renamed from: a */
    public final void mo67710a(@C12579k ProductCardSComponent productCardSComponent) {
        ProductCardSComponent productCardSComponent2 = productCardSComponent;
        Intrinsics.checkNotNullParameter(productCardSComponent2, "it");
        Resources resources = productCardSComponent.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "it.resources");
        final C27670g gVar = this.$productFavorite;
        final C28499q qVar = this.$fragment;
        final C11300l<C23066f, C11079d2> lVar = this.$actioner;
        final int i = this.$index;
        C230531 r5 = new C11300l<C37133a, C11079d2>() {
            /* renamed from: a */
            public final void mo67711a(@C12579k C37133a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "it");
                PlpOffer i = C27662e.m116389i(((C27670g.C27676f) gVar).mo80412e().mo118842j());
                if (((C27670g.C27676f) gVar).mo80412e().mo118843k() > 0) {
                    final int k = ((C27670g.C27676f) gVar).mo80412e().mo118843k();
                    C28499q qVar = qVar;
                    final C27670g gVar = gVar;
                    final int i2 = i;
                    FragmentExtensionKt.m58759j(qVar, new C11300l<Bundle, C11079d2>() {
                        /* renamed from: a */
                        public final void mo67712a(@C12579k Bundle bundle) {
                            Intrinsics.checkNotNullParameter(bundle, "it");
                            new C23066f.C23070d(((C27670g.C27676f) gVar).mo80412e().mo118842j(), i2, k - ((C27670g.C27676f) gVar).mo80412e().mo118843k());
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            mo67712a((Bundle) obj);
                            return C11079d2.f28267a;
                        }
                    });
                    lVar.invoke(new C23066f.C23074h(((C27670g.C27676f) gVar).mo80412e().mo118842j(), 0, ((C27670g.C27676f) gVar).mo80412e().mo118843k()));
                } else if (i != null) {
                    lVar.invoke(new C23066f.C23067a(i, ((C27670g.C27676f) gVar).mo80412e().mo118842j(), i + 1));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo67711a((C37133a) obj);
                return C11079d2.f28267a;
            }
        };
        C230552 r6 = C230552.f58696f;
        final C11300l<C23066f, C11079d2> lVar2 = this.$actioner;
        final C27670g gVar2 = this.$productFavorite;
        C230563 r7 = new C11300l<C37133a, C11079d2>() {
            /* renamed from: a */
            public final void mo67714a(@C12579k C37133a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "it");
                lVar2.invoke(new C23066f.C23078l(((C27670g.C27676f) gVar2).mo80412e().mo118842j()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo67714a((C37133a) obj);
                return C11079d2.f28267a;
            }
        };
        final C27670g gVar3 = this.$productFavorite;
        final C11300l<C23066f, C11079d2> lVar3 = this.$actioner;
        final int i2 = this.$index;
        C230574 r8 = new C11289a<C11079d2>() {
            public final void invoke() {
                PlpOffer i = C27662e.m116389i(((C27670g.C27676f) gVar3).mo80412e().mo118842j());
                if (i != null) {
                    lVar3.invoke(new C23066f.C23069c(i.mo118819v(), ((C27670g.C27676f) gVar3).mo80412e().mo118842j(), i2 + 1));
                }
            }
        };
        final C27670g gVar4 = this.$productFavorite;
        final C11300l<C23066f, C11079d2> lVar4 = this.$actioner;
        C230585 r9 = new C11289a<C11079d2>() {
            public final void invoke() {
                PlpOffer i = C27662e.m116389i(((C27670g.C27676f) gVar4).mo80412e().mo118842j());
                if (i != null) {
                    lVar4.invoke(new C23066f.C23072f(i));
                }
            }
        };
        final C27670g gVar5 = this.$productFavorite;
        final C11300l<C23066f, C11079d2> lVar5 = this.$actioner;
        productCardSComponent2.mo113691E(C27642b.m116299b((C27670g.C27676f) this.$productFavorite, resources, r5, r6, r7, r8, r9, (C11289a) null, (C11289a) null, false, false, false, new C11289a<C11079d2>() {
            public final void invoke() {
                lVar5.invoke(new C23066f.C23068b(((C27670g.C27676f) gVar5).mo80412e().mo118842j().mo118850A(), (DefaultConstructorMarker) null));
            }
        }, 1984, (Object) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67710a((ProductCardSComponent) obj);
        return C11079d2.f28267a;
    }
}
