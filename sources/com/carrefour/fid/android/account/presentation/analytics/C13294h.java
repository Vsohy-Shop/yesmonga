package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.h */
public final class C13294h implements C13293g {
    @C12579k

    /* renamed from: a */
    public final C13783a f32688a;

    /* renamed from: com.carrefour.fid.android.account.presentation.analytics.h$a */
    public /* synthetic */ class C13295a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.account.presentation.models.NameLastView[] r0 = com.carrefour.fid.android.account.presentation.models.NameLastView.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.presentation.models.NameLastView r1 = com.carrefour.fid.android.account.presentation.models.NameLastView.FORGOTPASSWORD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.account.presentation.models.NameLastView r1 = com.carrefour.fid.android.account.presentation.models.NameLastView.UPDATEEMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.analytics.C13294h.C13295a.<clinit>():void");
        }
    }

    @Inject
    public C13294h(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32688a = aVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo31595a(@C12579k NameLastView nameLastView, @C12579k C11045c<? super C11079d2> cVar) {
        int i = C13295a.$EnumSwitchMapping$0[nameLastView.ordinal()];
        if (i == 1) {
            C13783a.m58668o(this.f32688a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a("screen_name", "validation-reinitialiser-mdp"), C11078d1.m42659a(C28526d.f68933j, "me-connecter"), C11078d1.m42659a(C28526d.f68929i, "connexion")), false, 2, (Object) null);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C11079d2.f28267a;
    }

    /* renamed from: b */
    public void mo31596b(@C12579k NameLastView nameLastView) {
        Intrinsics.checkNotNullParameter(nameLastView, "nameLastView");
        int i = C13295a.$EnumSwitchMapping$0[nameLastView.ordinal()];
        if (i == 1) {
            C13783a.m58668o(this.f32688a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a("screen_name", "validation-reinitialiser-mdp"), C11078d1.m42659a(C28526d.f68933j, C28513a.f68687y), C11078d1.m42659a(C28526d.f68929i, "connexion")), false, 2, (Object) null);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public void mo31597c(@C12579k NameLastView nameLastView) {
        Intrinsics.checkNotNullParameter(nameLastView, "nameLastView");
        int i = C13295a.$EnumSwitchMapping$0[nameLastView.ordinal()];
        if (i == 1) {
            C13783a.m58667i(this.f32688a, "connexion", "validation-reinitialiser-mdp", (Map) null, false, false, false, 60, (Object) null);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
