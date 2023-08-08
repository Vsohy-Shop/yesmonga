package com.carrefour.fid.android.presentation.viewmodels.privacy;

import android.content.Context;
import androidx.appcompat.app.C0475e;
import androidx.appcompat.widget.C0696c;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.domain.interactors.privacy.PrivacyUseCase;
import com.carrefour.fid.android.presentation.models.C38525q;
import com.carrefour.fid.android.presentation.models.mapper.C38507h;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.C28947q;
import com.onetrust.otpublishers.headless.Public.OTEventListener;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.lifecycle.C10245a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R!\u00104\u001a\b\u0012\u0004\u0012\u00020/0.8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*058@X\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Landroidx/lifecycle/w;", "owner", "", "clear", "Lkotlin/d2;", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "o0", "Landroidx/appcompat/app/e;", "activity", "Lkotlin/Function0;", "onUserAction", "r0", "Landroidx/fragment/app/h;", "s0", "Lcom/onetrust/otpublishers/headless/Public/OTEventListener;", "p0", "u0", "t0", "Lcom/carrefour/fid/android/domain/interactors/privacy/PrivacyUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/privacy/PrivacyUseCase;", "privacyUseCase", "Lcom/carrefour/fid/android/presentation/models/mapper/h;", "e", "Lcom/carrefour/fid/android/presentation/models/mapper/h;", "mapper", "Lcom/carrefour/fid/android/presentation/viewmodels/privacy/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/privacy/a;", "privacySdksBuilder", "Landroid/content/Context;", "g", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/o0;", "h", "Lkotlinx/coroutines/o0;", "scope", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/presentation/models/q;", "i", "Lcom/carrefour/fid/android/shared/util/q;", "singlePrivacyModel", "", "Lcom/carrefour/fid/android/shared/privacy/b;", "j", "Lkotlin/z;", "n0", "()Ljava/util/List;", "privacySdks", "Landroidx/lifecycle/LiveData;", "m0", "()Landroidx/lifecycle/LiveData;", "privacyModel", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/privacy/PrivacyUseCase;Lcom/carrefour/fid/android/presentation/models/mapper/h;Lcom/carrefour/fid/android/presentation/viewmodels/privacy/a;Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPrivacyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1855#2,2:183\n800#2,11:185\n1855#2,2:196\n*S KotlinDebug\n*F\n+ 1 PrivacyViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/privacy/PrivacyViewModel\n*L\n165#1:183,2\n175#1:185,11\n175#1:196,2\n*E\n"})
public final class PrivacyViewModel extends C28498p {

    /* renamed from: k */
    public static final int f66045k = 8;
    @C12579k

    /* renamed from: d */
    public final PrivacyUseCase f66046d;
    @C12579k

    /* renamed from: e */
    public final C38507h f66047e;
    @C12579k

    /* renamed from: f */
    public final C27169a f66048f;
    @C12579k

    /* renamed from: g */
    public final Context f66049g;
    @C12579k

    /* renamed from: h */
    public final C12074o0 f66050h;
    @C12579k

    /* renamed from: i */
    public final C28947q<C38525q> f66051i = new C28947q<>();
    @C12579k

    /* renamed from: j */
    public final C11677z f66052j = C10864b0.m38748c(new PrivacyViewModel$privacySdks$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel$a */
    public static final class C27168a extends OTEventListener {

        /* renamed from: a */
        public final /* synthetic */ PrivacyViewModel f66053a;

        /* renamed from: b */
        public final /* synthetic */ C11289a<C11079d2> f66054b;

        public C27168a(PrivacyViewModel privacyViewModel, C11289a<C11079d2> aVar) {
            this.f66053a = privacyViewModel;
            this.f66054b = aVar;
        }

        public void allSDKViewsDismissed(@C12580l String str) {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit allSDKViewsDismissed", (Throwable) null, 0, 6, (Object) null);
        }

        public void onBannerClickedAcceptAll() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onBannerClickedAcceptAll", (Throwable) null, 0, 6, (Object) null);
            this.f66053a.mo78969u0();
            this.f66053a.mo78968t0();
            this.f66054b.invoke();
        }

        public void onBannerClickedRejectAll() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onBannerClickedRejectAll", (Throwable) null, 0, 6, (Object) null);
            this.f66053a.mo78969u0();
            this.f66054b.invoke();
        }

        public void onHideBanner() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onHideBanner", (Throwable) null, 0, 6, (Object) null);
        }

        public void onHidePreferenceCenter() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onHidePreferenceCenter", (Throwable) null, 0, 6, (Object) null);
        }

        public void onHideVendorList() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onHideVendorList", (Throwable) null, 0, 6, (Object) null);
        }

        public void onPreferenceCenterAcceptAll() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onPreferenceCenterAcceptAll", (Throwable) null, 0, 6, (Object) null);
            this.f66053a.mo78969u0();
            this.f66053a.mo78968t0();
            this.f66054b.invoke();
        }

        public void onPreferenceCenterConfirmChoices() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onPreferenceCenterConfirmChoices", (Throwable) null, 0, 6, (Object) null);
            this.f66053a.mo78969u0();
            this.f66053a.mo78968t0();
            this.f66054b.invoke();
        }

        public void onPreferenceCenterPurposeConsentChanged(@C12580l String str, int i) {
            C28935i.m119704b(C28935i.f70940a, "onPreferenceCenterPurposeConsentChanged", (Throwable) null, 0, 6, (Object) null);
        }

        public void onPreferenceCenterPurposeLegitimateInterestChanged(@C12580l String str, int i) {
            C28935i.m119704b(C28935i.f70940a, "onPreferenceCenterPurposeLegitimateInterestChanged", (Throwable) null, 0, 6, (Object) null);
        }

        public void onPreferenceCenterRejectAll() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onPreferenceCenterRejectAll", (Throwable) null, 0, 6, (Object) null);
            this.f66053a.mo78969u0();
            this.f66054b.invoke();
        }

        public void onShowBanner() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onShowBanner", (Throwable) null, 0, 6, (Object) null);
        }

        public void onShowPreferenceCenter() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onShowPreferenceCenter", (Throwable) null, 0, 6, (Object) null);
        }

        public void onShowVendorList() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onShowVendorList", (Throwable) null, 0, 6, (Object) null);
        }

        public void onVendorConfirmChoices() {
            C28935i.m119704b(C28935i.f70940a, "myOneTrustShit onVendorConfirmChoices", (Throwable) null, 0, 6, (Object) null);
        }

        public void onVendorListVendorConsentChanged(@C12580l String str, int i) {
            C28935i.m119704b(C28935i.f70940a, "onVendorListVendorConsentChanged", (Throwable) null, 0, 6, (Object) null);
        }

        public void onVendorListVendorLegitimateInterestChanged(@C12580l String str, int i) {
            C28935i.m119704b(C28935i.f70940a, "onVendorListVendorLegitimateInterestChanged", (Throwable) null, 0, 6, (Object) null);
        }
    }

    @Inject
    public PrivacyViewModel(@C12579k PrivacyUseCase privacyUseCase, @C12579k C38507h hVar, @C12579k C27169a aVar, @C10255b @C12579k Context context, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(privacyUseCase, "privacyUseCase");
        Intrinsics.checkNotNullParameter(hVar, "mapper");
        Intrinsics.checkNotNullParameter(aVar, "privacySdksBuilder");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f66046d = privacyUseCase;
        this.f66047e = hVar;
        this.f66048f = aVar;
        this.f66049g = context;
        this.f66050h = C12079p0.m48272m(C19500w0.m90846a(this), coroutineDispatcher);
    }

    /* renamed from: q0 */
    public static /* synthetic */ OTEventListener m114748q0(PrivacyViewModel privacyViewModel, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = PrivacyViewModel$preferenceCenterListener$1.f66055f;
        }
        return privacyViewModel.mo78965p0(aVar);
    }

    @C12579k
    /* renamed from: m0 */
    public final LiveData<C38525q> mo78962m0() {
        return this.f66051i;
    }

    /* renamed from: n0 */
    public final List<C28876b> mo78963n0() {
        return (List) this.f66052j.getValue();
    }

    /* renamed from: o0 */
    public final void mo78964o0() {
        C11723c2 unused = C12038j.m48061f(this.f66050h, (CoroutineContext) null, (CoroutineStart) null, new PrivacyViewModel$init$1(this, (C11045c<? super PrivacyViewModel$init$1>) null), 3, (Object) null);
    }

    /* renamed from: p0 */
    public final OTEventListener mo78965p0(C11289a<C11079d2> aVar) {
        return new C27168a(this, aVar);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        super.mo74786r(wVar, bool);
        this.f66051i.mo57495q(wVar);
    }

    /* renamed from: r0 */
    public final void mo78966r0(@C12579k C0475e eVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(eVar, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(aVar, "onUserAction");
        OTPublishersHeadlessSDK oTPublishersHeadlessSDK = new OTPublishersHeadlessSDK(eVar.getBaseContext());
        oTPublishersHeadlessSDK.showBannerUI(eVar);
        oTPublishersHeadlessSDK.addEventListener(mo78965p0(new PrivacyViewModel$showBannerUI$1$1(aVar)));
    }

    /* renamed from: s0 */
    public final void mo78967s0(@C12579k C19232h hVar) {
        Intrinsics.checkNotNullParameter(hVar, C0696c.f2306r);
        OTPublishersHeadlessSDK oTPublishersHeadlessSDK = new OTPublishersHeadlessSDK(hVar.getBaseContext());
        oTPublishersHeadlessSDK.showPreferenceCenterUI(hVar);
        oTPublishersHeadlessSDK.addEventListener(m114748q0(this, (C11289a) null, 1, (Object) null));
    }

    /* renamed from: t0 */
    public final void mo78968t0() {
        ArrayList<C13814a> arrayList = new ArrayList<>();
        for (Object next : mo78963n0()) {
            if (next instanceof C13814a) {
                arrayList.add(next);
            }
        }
        for (C13814a aVar : arrayList) {
            if (aVar.mo32689f(this.f66049g)) {
                aVar.mo32732d();
            }
        }
    }

    /* renamed from: u0 */
    public final void mo78969u0() {
        for (C28876b bVar : mo78963n0()) {
            if (bVar.mo32689f(this.f66049g)) {
                bVar.mo32686a();
            } else {
                bVar.mo32688e();
            }
        }
    }
}
