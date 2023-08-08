package com.carrefour.fid.android.utilities.domain.interactors;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28874a;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.utilities.domain.interactors.d */
public final class C22687d implements C37668h, C28874a {
    @C12580l
    /* renamed from: b */
    public Object m172806invokegIAlus(@C12579k C37668h.C37669a aVar, @C12579k C11045c<? super Result<Boolean>> cVar) {
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(C11064a.m42615a(mo32689f(aVar.mo114678d())));
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.CRITEO.mo83424q();
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }
}
