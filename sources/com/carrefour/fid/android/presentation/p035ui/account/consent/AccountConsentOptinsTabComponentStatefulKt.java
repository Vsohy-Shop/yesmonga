package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.domain.models.consent.extension.C37997a;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22934l;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a;
import com.carrefour.fid.android.shared.util.C28944n;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountConsentOptinsTabComponentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentOptinsTabComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentOptinsTabComponentStatefulKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,40:1\n766#2:41\n857#2,2:42\n766#2:44\n857#2,2:45\n76#3:47\n*S KotlinDebug\n*F\n+ 1 AccountConsentOptinsTabComponentStateful.kt\ncom/carrefour/fid/android/presentation/ui/account/consent/AccountConsentOptinsTabComponentStatefulKt\n*L\n27#1:41\n27#1:42,2\n30#1:44\n30#1:45,2\n34#1:47\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabComponentStatefulKt */
public final class AccountConsentOptinsTabComponentStatefulKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m103216a(@C12579k AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel, @C12579k String str, @C12579k C11300l<? super C22934l, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(accountConsentOptinsTabViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str, "carrefourPartnerUrl");
        Intrinsics.checkNotNullParameter(lVar, "actioner");
        C8592o o = oVar.mo15009o(-1360644712);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1360644712, i, -1, "com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabComponentStateful (AccountConsentOptinsTabComponentStateful.kt:12)");
        }
        C8578k2 a = C8415c2.m30232a(accountConsentOptinsTabViewModel.getUiState(), new C25774a.C25775a((Integer) null, (List) null, false, false, false, (AccountInfo) null, 63, (DefaultConstructorMarker) null), (CoroutineContext) null, o, 72, 2);
        if (((C25774a.C25775a) a.getValue()).isLoading()) {
            o.mo14918M(-149443173);
            ConsentsOptinsLoadingComponentKt.m103269b(o, 0);
            o.mo15002m0();
        } else {
            o.mo14918M(-149443119);
            Integer o2 = ((C25774a.C25775a) a.getValue()).mo74837o();
            if (o2 != null) {
                lVar.invoke(new C22934l.C22936b(o2.intValue()));
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : ((C25774a.C25775a) a.getValue()).mo74836n()) {
                if (C37997a.m156415a().contains(((ConsentOptIn) next).mo117326h())) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : ((C25774a.C25775a) a.getValue()).mo74836n()) {
                if (C37997a.m156420f().contains(((ConsentOptIn) next2).mo117326h())) {
                    arrayList2.add(next2);
                }
            }
            ConsentsOptinsComponentKt.m103246g(arrayList, arrayList2, str, C28944n.m119738a((Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g())), ((C25774a.C25775a) a.getValue()).mo74838p(), lVar, o, ((i << 3) & 896) | 72 | ((i << 9) & 458752));
            o.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C22906x5501bd0b(accountConsentOptinsTabViewModel, str, lVar, i));
        }
    }
}
