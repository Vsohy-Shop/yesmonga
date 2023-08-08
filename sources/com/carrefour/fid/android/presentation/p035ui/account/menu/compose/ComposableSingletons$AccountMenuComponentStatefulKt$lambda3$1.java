package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountMenuComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/ComposableSingletons$AccountMenuComponentStatefulKt$lambda-3$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,460:1\n25#2:461\n1114#3,6:462\n*S KotlinDebug\n*F\n+ 1 AccountMenuComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/menu/compose/ComposableSingletons$AccountMenuComponentStatefulKt$lambda-3$1\n*L\n427#1:461\n427#1:462,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.ComposableSingletons$AccountMenuComponentStatefulKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$AccountMenuComponentStatefulKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$AccountMenuComponentStatefulKt$lambda3$1 f58778f = new ComposableSingletons$AccountMenuComponentStatefulKt$lambda3$1();

    public ComposableSingletons$AccountMenuComponentStatefulKt$lambda3$1() {
        super(2);
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
                ComposerKt.m29845w0(2055579027, i, -1, "com.carrefour.fid.android.presentation.ui.account.menu.compose.ComposableSingletons$AccountMenuComponentStatefulKt.lambda-3.<anonymous> (AccountMenuComponentStateful.kt:410)");
            }
            List L = CollectionsKt__CollectionsKt.m40448L(AccountMenuItem.ORDERS, AccountMenuItem.LOYALTY, AccountMenuItem.PERSONAL_DATA, AccountMenuItem.PAYMENT, AccountMenuItem.HELP, AccountMenuItem.USER_CONSENTS, AccountMenuItem.SERVICES, AccountMenuItem.LEGALS, AccountMenuItem.LOGOUT, AccountMenuItem.APP_VERSION);
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            AccountMenuComponentStatefulKt.m103667a((C8767m) null, false, (C8700z0) N, L, "V16.0.0", C231232.f58779f, oVar, 224688, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
