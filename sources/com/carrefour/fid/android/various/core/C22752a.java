package com.carrefour.fid.android.various.core;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.contentsquare.android.C14146m;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.various.core.a */
public final class C22752a implements C28876b {
    @C12579k

    /* renamed from: a */
    public final Context f58268a;

    @Inject
    public C22752a(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f58268a = context;
    }

    /* renamed from: a */
    public void mo32686a() {
        C14146m.m60769v(this.f58268a);
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.CONTENT_SQUARE.mo83424q();
    }

    /* renamed from: e */
    public void mo32688e() {
        C14146m.m60770w(this.f58268a);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28876b.C28877a.m119433a(this, context);
    }
}
